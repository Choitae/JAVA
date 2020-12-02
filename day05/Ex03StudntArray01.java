package day05;
//�迭�� ����Ͽ� �л����� �����ϴ� ���α׷�

import java.util.Scanner;

import day04.Student;

public class Ex03StudntArray01 {
	private final static int SIZE = 5;

	public static void main(String[] args) {
		// �л� �迭 ����
		Student[] studentArray = new Student[SIZE];
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1.�Է� 2.��� 3.���� : ");
			System.out.print("> ");
			int num = scanner.nextInt();
			if (num == 1) {
				// �迭�� ���Ƽ� null�� ���� ã�Ƽ� �Է��� �Ѵ�. ���� null�� ���� ������ ��� �޼����� ���

				// 1. ���� �迭�� �� ��, �� null�ΰ��� ��ġ��ȣ�������� int ���� index�� ����. �� index�� -1�� �ʱ�ȭ�Ѵ�.
				// ���� �迭�� �� á�ٸ� index�� -1�� ���������Ƿ� �츮�� �޼��� ����� ����������.
				int index = -1;

				// for���� ����Ͽ� null�� ���� ��ġ��ȣ�� index�� �ְ� break
				for (int i = 0; i < studentArray.length; i++) {
					if (studentArray[i] == null) {
						index = i;
						break;
					}

				}
				// index�� -1�̸� "�迭�� ��á���ϴ�." �� ���޽����� ����ϰ� �� �ܿ���
				// �л� ��ü�� ����� ������ �ְ� indexĭ�� �ش� ��ü�� �ʱ�ȭ���ش�.
				if (index == -1) {
					System.out.println("����迭�� ��á���ϴ�");
				} else {
					// �л��� ������ ���� ��ü ����
					Student s = new Student();
					System.out.print("��ȣ�� �Է��ϼ��� : ");
					s.setId(scanner.nextInt());

					scanner.nextLine();
					System.out.print("�̸� : ");
					s.setName(scanner.nextLine());

					s.setKorean(s.validateScore(scanner, "���� : "));
					s.setEnglish(s.validateScore(scanner, "���� : "));

					s.setMath(s.validateScore(scanner, "���� : "));
					studentArray[index] = s;

				}
			} else if (num == 2) {
				// �迭�� �� �Ѱ��̶�� null�� �ƴ��� üũ�ϰ� ��δ� null�̸� ��� �޼����� ���. �� �ܿ��� null �ƴ� ���� ���
				// null�� �ƴϸ� true�� �ٲ�� isEmpty boolean������ false�� ����/�ʱ�ȭ
				boolean isEmpty = true;
				for (int i = 0; i < studentArray.length; i++) {
					if (studentArray[i] != null) {
						isEmpty = false;
						break;
					}
				}

				// null�� �ƴѰ��� �����ϴ��� Ȯ���� �Ǿ����Ƿ� if/else ������ ����� ������ ����.
				if (isEmpty) {
					System.out.println("���� �Էµ� �л��� �������� �ʽ��ϴ�.");

				} else {
					for (int i = 0; i < studentArray.length; i++) {
						Student s = studentArray[i];
						if (s != null) {
							System.out.printf("��ȣ : %3d, �̸� : %s\n", s.getId(), s.getName());
							System.out.printf("���� : %3d, ���� : %3d, ���� : %3d\n", s.getKorean(), s.getEnglish(),
									s.getMath());
							System.out.printf("���� : %3d, ��� : %.2f\n\n", s.calculateSum(), s.calculateAverage());
						}
					}

				}

			} else if (num == 3) {
				System.out.println("������ּż� �����մϴ�");
				break;
			}
		}

		scanner.close();
	}
}
