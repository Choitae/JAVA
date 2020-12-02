package day02;
// 사용자로부터 정수를 입력 받아서 해당 정수가 홀수인지 짝수인지 출력하는 프로그램
import java.util.Scanner;
public class Ex08IfElse02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = scanner.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("%d는 짝수입니다.", num);
		} else {
			System.out.printf("%d는 홀수입니다.", num);
		}
		
		scanner.close();
		
		
	}

}
