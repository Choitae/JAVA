package stars;

import java.util.Scanner;

public class ExStarTest03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("별의 개수를 입력하세요");
		int userNumber = scanner.nextInt();

		// i문은 세로 크기를 담당하고 j문은 각 줄의 별의 갯수를 담당한다.
		for(int i=1; i<=userNumber; i++) {
			// 출력할 내용을 담을 String 변수를 선언
			String stars = new String();
			for(int k=i; k<=userNumber; k++ ) {
				stars += " ";
			}
			for(int j=1; j<=i; j++) {
				stars += "*";

			}

			System.out.println(stars);
		}
		
		
		
		scanner.close();
	}

}
