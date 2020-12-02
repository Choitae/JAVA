package day02;
import java.util.Scanner;
public class Ex06If02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
		int num = scanner.nextInt();
		
		if (num%2 == 0) {
			System.out.printf("%d는 짝수입니다\n", num);
			
		}
		System.out.println("프로그램이 종료됩니다.");
		
		scanner.close();

		
		
		
	}
}
