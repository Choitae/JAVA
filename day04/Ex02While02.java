package day04;
/* ����ڷκ� �ڿ��� �Է��� �޴� ���α׷�. �ڿ����� �Էµ� �� ���� "�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���:"��� ��µǰ�.
 * 
 * 
 */
import java.util.Scanner;
public class Ex02While02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ڿ����� �Է��ϼ��� : ");
		int number = scanner.nextInt();
		while(number <= 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.print("�ڿ����� �Է��ϼ��� : ");
			number = scanner.nextInt();
		}
		
		
		System.out.println("����ڰ� �Է��� �ڿ��� : " +number);
		
		
		scanner.close();
	}

}
