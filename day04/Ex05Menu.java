package day04;
/* 무한루프를 사용하여 대기화면을 만들어서 사용자가 필요한 기능을 선택할 수 있게 만들어보자.
 * */
import java.util.Scanner;
public class Ex05Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			System.out.println("1. 입력,  2. 출력, 3. 종료 :");
			int userChoice = scanner.nextInt();
			if(userChoice == 1) {
			}else if(userChoice == 2) {
			}else {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
		
		}
	
	
	
	
	
		scanner.close();
	}
	

}
