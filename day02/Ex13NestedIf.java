package day02;
import java.util.Scanner;
public class Ex13NestedIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���(���ڴ� 1, ���ڴ� 2) : ");
	    int sex = scanner.nextInt();
		
	    if (sex == 1) {
	    	System.out.print("���� : ");
	    	int age = scanner.nextInt();
	    	if (age >= 18) {
	    		System.out.println("�����Դϴ�.");
	    		System.out.print("��ü��� : ");
	            int category = scanner.nextInt();
	            if(category <= 3) {
	            	System.out.println("�����Դϴ�.");
	            } else if(category == 4) {
	            	System.out.println("�����Դϴ�");
	            } else {
	            	System.out.println("�����Դϴ�");
	            }
	    	} else {
	    		System.out.println("���� �̼������Դϴ�.");
	    	}
	    }else {
	    	System.out.println("�������Դ� ������ �ǹ��� �����ϴ�.");
	    }
		
		
		
		
		
		
		
		
		
		scanner.close();
		
		
		
		
	}

}
