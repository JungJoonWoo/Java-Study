package poly.ex1;

public abstract class PayStore {
    public static Pay findPay(String Option) {
        if (Option.equals("kakao")) {
            return new KakaoPay();
        } else if (Option.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}