package day02;

import java.util.Scanner;

public class Ex03Scaner {
	public static void main(String[] args) {
		//Scanner�� ������ ������Ÿ���̹Ƿ� �Ʒ��� ���� ������� ������ ������ش�.
		Scanner scanner = new Scanner(System.in);
	
		
        // ��ĳ�ʸ� ����Ͽ� ������ �Է¹��� ������ 
		// nextInt() �޼ҵ带 ȣ���ϸ� �ȴ�.
		System.out.print("���� : ");
		int number;
		number = scanner.nextInt();
		
		System.out.printf("����ڰ� �Է��� ���� : %d\n", number);
		
		// ��ĳ�ʸ� ����Ͽ� �Ǽ��� �Է¹��� ������
		// nextDouble()�޼ҵ带 ȣ���ϸ� �ȴ�.
		System.out.print("�Ǽ� : ");
		double myDouble = scanner.nextDouble();
		System.out.printf("����ڰ� �Է��� �Ǽ� : %f\n", myDouble);
		
		// ��ĳ�ʸ� ����Ͽ� ��Ʈ���� �Է¹��� ������
		// nextline() �޼ҵ带 ȣ���ϸ� �ȴ�.
		// nextline() �޼ҵ带 ����� �� �Ѱ��� ������ ���� �ִµ�
		// nextInt(), nextDouble()���� ���ڸ� �Է��ϴ� �޼ҵ带 ȣ���� �Ŀ���
		// �츮�� ���ڸ� �Է��ϸ鼭 �Է��� �����ٴ� �˷��ִ� ����Ű�� ���� �޸𸮿� �����ִ�.
		// ���� ���� �Է��Ŀ� nextline()�� ����ϸ�
		// ��ĳ�ʴ� "����ڰ� �ƹ��� �Է¾��� �Է��� ������ױ���!"��� �����ϰ� �ȴ�.
		// ���� ���۸޸𸮸� �ѹ� ����־�� ���������� ���� �Է� �Ŀ� ��Ʈ�� �Է��� �����ϴ�.
		scanner.nextLine();
		
		// ������ ���۸޸𸮰� �ƹ��͵� ���� ���,
		// �� scanner.nextLine()�� ����� ���Ĵ�
		// ���� �Է��� �ޱ� ���̶��
		// ���۸޸𸮸� ����� �ʿ䰡 ����.
		System.out.print("�̸� : ");
		String name = scanner.nextLine();
		System.out.printf("����ڰ� �Է��� �̸� : %s\n", name);
		
		
		
		// ��ĳ�� ������ ���� �ܺ� '�޸�'�� �����ϴ� ������
		// �׻� ���α׷� ���� ������ �ٿ�
		// close() �޼ҵ带 ȣ�����ָ� ����.
		scanner.close();
	}
}
