package day04;

import java.util.Scanner;
public class Ex03GradeBook01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double subject = 3;
		System.out.print("번호 : ");
		int num = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		
		System.out.print("국어 점수 : ");
		int korean = scanner.nextInt();
		while (korean<0 || korean>100) {
			System.out.println(" 잘못입력하셨습니다. 다시 입력해주세요");
			System.out.print("국어 점수 : ");
			korean = scanner.nextInt();
		}
		
		System.out.print("영어 점수 : ");
		int english = scanner.nextInt();
		while (english < 0 || english >100) {
			System.out.println(" 잘못입력하셨습니다. 다시 입력해주세요");
			System.out.print("영어 점수 : ");
			english = scanner.nextInt();
		}
		
		System.out.print("수학 점수 : ");
		int math = scanner.nextInt();
		while (math < 0 || math >100) {
			System.out.println(" 잘못입력하셨습니다. 다시 입력해주세요");
			System.out.print("수학 점수 : ");
			math = scanner.nextInt();
		}

		int sum = korean + english + math;
		double average = sum / subject;
		System.out.printf("번호 : %03d, 이름 : %s, 국어점수 : %03d, 영어점수 : %03d, 수학점수 : %03d, 총합 : %03d, 평균 : %.2f 입니다.", num, name, korean, english, math, sum, average);
	}

}
