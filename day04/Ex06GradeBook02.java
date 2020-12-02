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
			System.out.print("1. 점수 입력  / 2.점수 출력 / 3. 종료: ");
			int num = scanner.nextInt();
			if(num == 1) {
				System.out.print("번호 : ");		
				id = scanner.nextInt();
				
				System.out.print("이름 : ");
				scanner.nextLine();
				name = scanner.nextLine();
				
				System.out.print("국어 : ");		
				korean = scanner.nextInt();
				while(korean >100 || korean <0) {
					System.out.println("잘못된 점수입니다. " );
					System.out.print("국어 : ");
					korean = scanner.nextInt();
				}
				System.out.print("영어 : ");
				english = scanner.nextInt();
				while(english >100 || english <0) {
					System.out.println("잘못된 점수입니다. " );
					System.out.print("영어 : ");
					english = scanner.nextInt();
				}
				System.out.print("수학 : ");
				math = scanner.nextInt();
				while(math >100 || math <0) {
					System.out.println("잘못된 점수입니다. " );
					System.out.print("수학 : ");
					math = scanner.nextInt();
				}
					/* 아무것도 입력하지 않았을 때 "아직 입력된 값이 없습니다" 하고 싶을 시
					 * 1. boolean 변수를 만들어서 입력을 했을 때 true로 바꿔서 체크하는 방법.
					 * 2. 국어 영어 수학 점수의 초기화값을 불가능한 점수로 초기화하는 방법.
					 * 
					 * 
					 * */
				dataswitch = true;
			}else if(num==2) {
				if (korean == -1 || english == -1 || math == -1) {
					System.out.println("아직 입력된 값이 없습니다");
					
				}
				else {
					int sum = korean + english + math;
//					double average = sum / subject;
//					System.out.printf("번호 : %03d, 이름 : %s, 국어점수 : %03d, 영어점수 : %03d, 수학점수 : %03d, 총합 : %03d, 평균 : %.2f 입니다.", id, name, korean, english, math, sum, average);
				}
//				if (dataswitch) {
//					int sum = korean + english + math;
//					double average = sum / subject;
//					System.out.printf("번호 : %03d, 이름 : %s, 국어점수 : %03d, 영어점수 : %03d, 수학점수 : %03d, 총합 : %03d, 평균 : %.2f 입니다.", id, name, korean, english, math, sum, average);
//				}else {
//					System.out.println("아직 입력된 값이 없습니다");
//				}

			}else if(num==3) {
				System.out.println("\n사용해주셔서 감사합니다.");
				break;
			}else {
				System.out.println("다시 시작합니다.");

			}
			
		}
		
	}

}
