package day04;

import java.util.Scanner;

public class Ex05Menu_self {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			System.out.println("입력하세요 : (나가기는 )");
			String memo = scanner.nextLine();
			if(memo.equals("")) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
			else {
				System.out.println(memo);
				

			}
		
		}
	
	
	
	
	
		scanner.close();
	}
}
