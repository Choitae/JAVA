package day03;
// for loop 예제

// 1. 사용자로부터 정수를 하나 입력받아서
//    1부터 그수까지의 합을 구하여 출력하는 프로그램을
//    작성하시오 (45분까지)

// 2. 사용자로부터 정수를 새로 입력받아서
//    1부터 그수까지의 곱을 구하여 출력하는 프로그램을
//    작성하시오 (5분까지)
import java.util.Scanner;

public class Ex03ForLoop02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1부터 합을 구할 정수를 입력하시오: ");
		int number = scanner.nextInt();

		int result = 0;
		for (int i = 1; i <= number; i++) {
			result += i;

		}

		System.out.printf("1부터 %d까지의 합: %d\n", number, result);

		System.out.print("1부터 곱을 구할 정수를 입력하세요: ");
		number = scanner.nextInt();
		result = 1;
		if (number >= 13) {
			System.out.println("오버플로우가 발생하여 정확한 값을 계산할 수 없습니다.");
		} else {
			for (int i = 1; i <= number; i++) {
				result = result * i;
			}

			System.out.printf("1부터 %d까지의 곱: %d\n", number, result);
		}

		scanner.close();
	}
}
