package day02;
import java.util.Scanner;
public class Ex06If02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("������ �Է��ϼ��� : ");
		int num = scanner.nextInt();
		
		if (num%2 == 0) {
			System.out.printf("%d�� ¦���Դϴ�\n", num);
			
		}
		System.out.println("���α׷��� ����˴ϴ�.");
		
		scanner.close();

		
		
		
	}
}
