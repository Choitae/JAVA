package day03;
// for loop ����

// 1. ����ڷκ��� ������ �ϳ� �Է¹޾Ƽ�
//    1���� �׼������� ���� ���Ͽ� ����ϴ� ���α׷���
//    �ۼ��Ͻÿ� (45�б���)

// 2. ����ڷκ��� ������ ���� �Է¹޾Ƽ�
//    1���� �׼������� ���� ���Ͽ� ����ϴ� ���α׷���
//    �ۼ��Ͻÿ� (5�б���)
import java.util.Scanner;

public class Ex03ForLoop02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1���� ���� ���� ������ �Է��Ͻÿ�: ");
		int number = scanner.nextInt();

		int result = 0;
		for (int i = 1; i <= number; i++) {
			result += i;

		}

		System.out.printf("1���� %d������ ��: %d\n", number, result);

		System.out.print("1���� ���� ���� ������ �Է��ϼ���: ");
		number = scanner.nextInt();
		result = 1;
		if (number >= 13) {
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�� ���� ����� �� �����ϴ�.");
		} else {
			for (int i = 1; i <= number; i++) {
				result = result * i;
			}

			System.out.printf("1���� %d������ ��: %d\n", number, result);
		}

		scanner.close();
	}
}
