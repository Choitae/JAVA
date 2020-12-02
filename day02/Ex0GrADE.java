package day02;
// 사용자로부터 번호->이름->국어->영어->수학점수 순으로 입력받고
// 번호: 001번 이름 : 조재영
// 국어: 080점 영어 : 078점 수학 : 079점
// 총점: 237점 평균 : 79.00점
// 의 형식으로 출력되게 프로그램을 작성하시오.

import java.util.Scanner;


public class Ex0GrADE {
	public static void main(String[] args) {
		
		// 추후 과목수가 변경할 경우가 있다고 가정하여 갑자기 돌출한 숫자 3을 상수로 지정. 추후 과목 수 변경 시 상수를 변경하면 됌. 
		final int SUBJECT_SIZE = 3;
		Scanner scanner = new Scanner(System.in);
		System.out.print("번호를 입력하세요 : ");
		int number1 = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("이름을 입력하세요 : ");
		String name = scanner.nextLine();
		
		System.out.print("국어 점수를 입력하세요 : ");
		int number2 = scanner.nextInt();
		
		System.out.print("영어 점수를 입력하세요 : ");
		int number3 = scanner.nextInt();
		
		System.out.print("수학 점수를 입력하세요 : ");
		int number4 = scanner.nextInt();
		
		int amount = number2+number3+number4;
		
		double average = amount/SUBJECT_SIZE;
	
		
		System.out.printf("번호: %03d, 이름 : %s\n, 국어 : %03d점, 영어 : %03d점, 수학 : %03d점\n, 총점 : %03d점, 평균 : %.2f점 ", number1, name, number2, number3, number4, amount, average  );
		
		scanner.close();
	}
}
