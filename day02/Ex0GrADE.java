package day02;
// ����ڷκ��� ��ȣ->�̸�->����->����->�������� ������ �Է¹ް�
// ��ȣ: 001�� �̸� : ���翵
// ����: 080�� ���� : 078�� ���� : 079��
// ����: 237�� ��� : 79.00��
// �� �������� ��µǰ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;


public class Ex0GrADE {
	public static void main(String[] args) {
		
		// ���� ������� ������ ��찡 �ִٰ� �����Ͽ� ���ڱ� ������ ���� 3�� ����� ����. ���� ���� �� ���� �� ����� �����ϸ� ��. 
		final int SUBJECT_SIZE = 3;
		Scanner scanner = new Scanner(System.in);
		System.out.print("��ȣ�� �Է��ϼ��� : ");
		int number1 = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = scanner.nextLine();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int number2 = scanner.nextInt();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int number3 = scanner.nextInt();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int number4 = scanner.nextInt();
		
		int amount = number2+number3+number4;
		
		double average = amount/SUBJECT_SIZE;
	
		
		System.out.printf("��ȣ: %03d, �̸� : %s\n, ���� : %03d��, ���� : %03d��, ���� : %03d��\n, ���� : %03d��, ��� : %.2f�� ", number1, name, number2, number3, number4, amount, average  );
		
		scanner.close();
	}
}
