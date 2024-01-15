package hello.core.discount;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RateDiscountPolicyTest {

    MemberService memberService;
    DiscountPolicy discountPolicy;


    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        discountPolicy = appConfig.discountPolicy();
    }

    @Test
    @DisplayName("VIP는 10%할인이 적용되어야 한다.")
    void discount() {
        //given
        Member member = new Member(1L, "memberVIP", Grade.VIP);
        memberService.join(member);

        //when
        int discount = discountPolicy.discount(member, 20000);
        //then
        assertThat(discount).isEqualTo(2000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인이 적용되지 않아야 한다.")
    void notDiscount() {
        //given
        Member member = new Member(2L, "memberBASIC", Grade.BASIC);
        memberService.join(member);
        //when
        int discount = discountPolicy.discount(member, 10000);
        //then
        assertThat(discount).isEqualTo(0);

    }
}