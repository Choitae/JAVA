package day05;
// ���ѷ��� �޴��� �� �л����� �Է� ���α׷��� �ۼ�.
import day04.Student; // �ܺο� �ִ� �޼ҵ带 ������
import java.util.Scanner;
public class Ex01Student01 {
	public static void main(String[] args) {//main �Է� �� ctrl + space
		Scanner scanner = new Scanner(System.in);
		Student s = new Student();
		
		while(true) {
			System.out.print("1.�Է�  2.���  3.���� : ");
		    int num = scanner.nextInt();
		    if(num == 1) {
				System.out.print("��ȣ�� �Է��ϼ��� : ");
				s.setId(scanner.nextInt());
				
				scanner.nextLine();
				System.out.print("�̸� : ");
				s.setName(scanner.nextLine());
			
				s.setKorean(s.validateScore(scanner, "���� : "));
				s.setEnglish(s.validateScore(scanner, "���� : "));
				
				s.setMath(s.validateScore(scanner, "���� : "));

		    }else if(num == 2) {
		    	if(s.calculateSum() <0) {
		    		System.out.println("���� �Էµ� ���� �����ϴ�");	    		
		    	} else {
		    	System.out.printf("��ȣ : %3d, �̸� : %s\n", s.getId(), s.getName());
		    	System.out.printf("���� : %3d, ���� : %3d, ���� : %3d\n", s.getKorean(), s.getEnglish(), s.getMath());
		    	System.out.printf("���� : %3d, ��� : %.2f\n", s.calculateSum(), s.calculateAverage());
		    	}
		    }else {
		    	System.out.println("���α׷��� �����մϴ�");
		    	break;
		    }
		    

			
			
			
			
			
			
			
		}
				

	}
}
