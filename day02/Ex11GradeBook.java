package day02;
//������ ��µǴ� ���α׷��� �ۼ��϶�
import java.util.Scanner;
public class Ex11GradeBook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int score = scanner.nextInt();
	
		System.out.println("�������� ���� ���α׷�");
		if (score >= 90) {
			System.out.println("A �Դϴ�");
		} else if(score >= 80) {
			System.out.println("B �Դϴ�");
		} else if(score >= 70) {
			System.out.println("C �Դϴ�");
		} else if(score >= 60) {
			System.out.println("D �Դϴ�");
		} else {
			System.out.print("F �Դϴ�");
		}
		System.out.println("-------------------------");
		
		// ����ڰ� �Է��� ���� ��ȿ�� ������ üũ�ϴ� ����.
		//  1) ������ 0~100������ �����̾�������� ����ڰ� -  ������ �ƴϸ� 100�� �ʰ��ϴ� ���ڸ� �Է��ϸ�
		
		// �׿� ���� �߸��� ����� ������ �ȴ�.
		// �ùٸ� ���� �Է��� ������ ���ĺ� ������ ������ �� �ܴ� �߸��� �����Դϴٰ� ��µ��� �� �ְ� if-else if ������ ���� ���̴�.
		// ���� �����ϴ� ��� 1�� : ���ǽ��� ������ ��Ȯ�ϰ� �������
		System.out.println("�� ���� 1��: ��Ȯ�� ���ǽ�\n");
        if(score >= 90 && score<= 100) {
        	System.out.println("A �Դϴ�");
        } else if(score >= 80 && score <=89) {
        	System.out.println("B �Դϴ�");
        } else if(score >= 70 && score <=79) {
        	System.out.println("C �Դϴ�");
        } else if(score >= 60 && score <=69) {
        	System.out.println("D �Դϴ�");
        } else if(score >= 0 && score <=59 ) {
        	System.out.println("F �Դϴ�");
        } else {
        	System.out.println("�߸��� ���� �����Դϴ�.");
        }
		System.out.println("-------------------------");
        // 2) ���� ���� ��ȿ�������� üũ�Ѵ�. �̋��� ������ ��ø if��(nested if) ���°� �ȴ�.
        // ��ø if���̶� Ŀ�ٶ� if���ȿ� �Ǵٸ� if�� ���� ����̴�. �� ���̴� ���� �츮�� �ʿ��Ѹ�ŭ ��밡��.
		System.out.println("�� ���� 2�� : ���� �Է��� ���� ��ȿ���� üũ");
		
		if (score >=0 && score <= 100) {
			if (score >= 90) {
				System.out.println("A �Դϴ�");
			} else if(score >= 80) {
				System.out.println("B �Դϴ�");
			} else if(score >= 70) {
				System.out.println("C �Դϴ�");
			} else if(score >= 60) {
				System.out.println("D �Դϴ�");
			} else {
				System.out.print("F �Դϴ�");
			}
		} else {
			System.out.println("�߸��� ���������Դϴ�.");
		}

		scanner.close();

	}
	

}
