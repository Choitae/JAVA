package day03;
/* 1부터 100까지의 소수를 구하는 프로그램 .
 * 
 */

public class Ex05PrimeNumber {
	public static void main(String[] args) {
		// i는 소수 여부를 확인하고
		// j

		for (int i = 1; i <= 100; i++) {
			int count = 0;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i + "는 소수입니다.");

			}
			// 약수의 갯수가 2개이면 i는 소수이므로 출력해준다.

		}

	}

}
