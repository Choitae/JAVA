package day04;

import java.util.Scanner;

public class Ex05Menu_self {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			System.out.println("�Է��ϼ��� : (������� )");
			String memo = scanner.nextLine();
			if(memo.equals("")) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			}
			else {
				System.out.println(memo);
				

			}
		
		}
	
	
	
	
	
		scanner.close();
	}
}
