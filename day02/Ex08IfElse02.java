package day02;
// ����ڷκ��� ������ �Է� �޾Ƽ� �ش� ������ Ȧ������ ¦������ ����ϴ� ���α׷�
import java.util.Scanner;
public class Ex08IfElse02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = scanner.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("%d�� ¦���Դϴ�.", num);
		} else {
			System.out.printf("%d�� Ȧ���Դϴ�.", num);
		}
		
		scanner.close();
		
		
	}

}
