package day04;

import java.util.Scanner;
public class Ex03GradeBook01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double subject = 3;
		System.out.print("��ȣ : ");
		int num = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("�̸� : ");
		String name = scanner.nextLine();
		
		System.out.print("���� ���� : ");
		int korean = scanner.nextInt();
		while (korean<0 || korean>100) {
			System.out.println(" �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			System.out.print("���� ���� : ");
			korean = scanner.nextInt();
		}
		
		System.out.print("���� ���� : ");
		int english = scanner.nextInt();
		while (english < 0 || english >100) {
			System.out.println(" �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			System.out.print("���� ���� : ");
			english = scanner.nextInt();
		}
		
		System.out.print("���� ���� : ");
		int math = scanner.nextInt();
		while (math < 0 || math >100) {
			System.out.println(" �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			System.out.print("���� ���� : ");
			math = scanner.nextInt();
		}

		int sum = korean + english + math;
		double average = sum / subject;
		System.out.printf("��ȣ : %03d, �̸� : %s, �������� : %03d, �������� : %03d, �������� : %03d, ���� : %03d, ��� : %.2f �Դϴ�.", num, name, korean, english, math, sum, average);
	}

}
