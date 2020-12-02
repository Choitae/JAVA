package stars;

import java.util.Scanner;

public class ExStarTest09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("줄의 갯수를 입력하세요 : ");
		int num = scanner.nextInt();
		// 하나의 for 문으로 만들기
		for (int i = 1; i <= 2 * num - 1; i++) {
			String stars = new String();
			if (i < num) {
				for (int j = 1; j <= num - i; j++) {
					stars += " ";
				}
				for (int j = 1; j <= 2 * i - 1; j++) {
					stars += "*";
				}

			} else {
				int lowerI = 2*num - i;
				for (int j = 1; j <= num - lowerI ; j++) {
					stars += " ";
				}
				for (int j = 1; j <= 2 * (lowerI) - 1; j++) {
					stars += "*";

				}

			}

			System.out.println(stars);

		}

		scanner.close();

	}

}
