package day04;
import java.util.Scanner;
public class Ex06GradeBook02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double subject = 3;
		int id = 0;	
		String name = new String();
		int korean = -1;
		int english = -1;
		int math = -1 ;

		boolean dataswitch = false;
		while(true) {
			System.out.print("1. ���� �Է�  / 2.���� ��� / 3. ����: ");
			int num = scanner.nextInt();
			if(num == 1) {
				System.out.print("��ȣ : ");		
				id = scanner.nextInt();
				
				System.out.print("�̸� : ");
				scanner.nextLine();
				name = scanner.nextLine();
				
				System.out.print("���� : ");		
				korean = scanner.nextInt();
				while(korean >100 || korean <0) {
					System.out.println("�߸��� �����Դϴ�. " );
					System.out.print("���� : ");
					korean = scanner.nextInt();
				}
				System.out.print("���� : ");
				english = scanner.nextInt();
				while(english >100 || english <0) {
					System.out.println("�߸��� �����Դϴ�. " );
					System.out.print("���� : ");
					english = scanner.nextInt();
				}
				System.out.print("���� : ");
				math = scanner.nextInt();
				while(math >100 || math <0) {
					System.out.println("�߸��� �����Դϴ�. " );
					System.out.print("���� : ");
					math = scanner.nextInt();
				}
					/* �ƹ��͵� �Է����� �ʾ��� �� "���� �Էµ� ���� �����ϴ�" �ϰ� ���� ��
					 * 1. boolean ������ ���� �Է��� ���� �� true�� �ٲ㼭 üũ�ϴ� ���.
					 * 2. ���� ���� ���� ������ �ʱ�ȭ���� �Ұ����� ������ �ʱ�ȭ�ϴ� ���.
					 * 
					 * 
					 * */
				dataswitch = true;
			}else if(num==2) {
				if (korean == -1 || english == -1 || math == -1) {
					System.out.println("���� �Էµ� ���� �����ϴ�");
					
				}
				else {
					int sum = korean + english + math;
//					double average = sum / subject;
//					System.out.printf("��ȣ : %03d, �̸� : %s, �������� : %03d, �������� : %03d, �������� : %03d, ���� : %03d, ��� : %.2f �Դϴ�.", id, name, korean, english, math, sum, average);
				}
//				if (dataswitch) {
//					int sum = korean + english + math;
//					double average = sum / subject;
//					System.out.printf("��ȣ : %03d, �̸� : %s, �������� : %03d, �������� : %03d, �������� : %03d, ���� : %03d, ��� : %.2f �Դϴ�.", id, name, korean, english, math, sum, average);
//				}else {
//					System.out.println("���� �Էµ� ���� �����ϴ�");
//				}

			}else if(num==3) {
				System.out.println("\n������ּż� �����մϴ�.");
				break;
			}else {
				System.out.println("�ٽ� �����մϴ�.");

			}
			
		}
		
	}

}
