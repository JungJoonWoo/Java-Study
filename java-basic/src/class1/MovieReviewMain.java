package class1;

import java.util.Scanner;

public class MovieReviewMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("영화의 갯수를 입력하시오: ");
        int num = scanner.nextInt();

        MovieReview[] mr = new MovieReview[num];

        scanner.nextLine();

        for (int i = 0; i < mr.length; i++) {
            mr[i] = new MovieReview();
            System.out.print("영화 제목을 입력하시오: ");
            mr[i].name = scanner.nextLine();
            System.out.print("영화 리뷰를 입력하시오: ");
            mr[i].review = scanner.nextLine();
        }
        for (MovieReview movieReview : mr) {
            System.out.printf("\n영화 제목: %s\n영화 리뷰: %s\n", movieReview.name, movieReview.review);
        }
    }
}