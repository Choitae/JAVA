package day02;
//점수가 출력되는 프로그램을 작성하라
import java.util.Scanner;
public class Ex11GradeBook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = scanner.nextInt();
	
		System.out.println("검증되지 않은 프로그램");
		if (score >= 90) {
			System.out.println("A 입니다");
		} else if(score >= 80) {
			System.out.println("B 입니다");
		} else if(score >= 70) {
			System.out.println("C 입니다");
		} else if(score >= 60) {
			System.out.println("D 입니다");
		} else {
			System.out.print("F 입니다");
		}
		System.out.println("-------------------------");
		
		// 사용자가 입력한 값이 유효한 값인지 체크하는 과정.
		//  1) 점수는 0~100사이의 숫자이어야하지만 사용자가 -  점수나 아니면 100을 초과하는 숫자를 입력하면
		
		// 그에 따른 잘못된 결과가 나오게 된다.
		// 올바른 값을 입력할 때에만 알파벳 정수가 나오고 그 외는 잘못된 정수입니다가 출력도딜 수 있게 if-else if 구조를 만들 것이다.
		// 값을 검증하는 방법 1번 : 조건식의 조건을 정확하게 잡아주자
		System.out.println("값 검증 1번: 정확한 조건식\n");
        if(score >= 90 && score<= 100) {
        	System.out.println("A 입니다");
        } else if(score >= 80 && score <=89) {
        	System.out.println("B 입니다");
        } else if(score >= 70 && score <=79) {
        	System.out.println("C 입니다");
        } else if(score >= 60 && score <=69) {
        	System.out.println("D 입니다");
        } else if(score >= 0 && score <=59 ) {
        	System.out.println("F 입니다");
        } else {
        	System.out.println("잘못된 점수 형태입니다.");
        }
		System.out.println("-------------------------");
        // 2) 값이 먼저 유효한지부터 체크한다. 이떄는 구조가 중첩 if문(nested if) 형태가 된다.
        // 중첩 if문이란 커다란 if문안에 또다른 if가 들어가는 방법이다. 몇 중이던 간에 우리가 필요한만큼 사용가능.
		System.out.println("값 검증 2번 : 먼저 입력한 값이 유효한지 체크");
		
		if (score >=0 && score <= 100) {
			if (score >= 90) {
				System.out.println("A 입니다");
			} else if(score >= 80) {
				System.out.println("B 입니다");
			} else if(score >= 70) {
				System.out.println("C 입니다");
			} else if(score >= 60) {
				System.out.println("D 입니다");
			} else {
				System.out.print("F 입니다");
			}
		} else {
			System.out.println("잘못된 정수형태입니다.");
		}

		scanner.close();

	}
	

}
