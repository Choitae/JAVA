package day05;
// 무한루프 메뉴가 들어간 학생정보 입력 프로그램을 작성.
import day04.Student; // 외부에 있는 메소드를 가져옴
import java.util.Scanner;
public class Ex01Student01 {
	public static void main(String[] args) {//main 입력 후 ctrl + space
		Scanner scanner = new Scanner(System.in);
		Student s = new Student();
		
		while(true) {
			System.out.print("1.입력  2.출력  3.종료 : ");
		    int num = scanner.nextInt();
		    if(num == 1) {
				System.out.print("번호를 입력하세요 : ");
				s.setId(scanner.nextInt());
				
				scanner.nextLine();
				System.out.print("이름 : ");
				s.setName(scanner.nextLine());
			
				s.setKorean(s.validateScore(scanner, "국어 : "));
				s.setEnglish(s.validateScore(scanner, "영어 : "));
				
				s.setMath(s.validateScore(scanner, "수학 : "));

		    }else if(num == 2) {
		    	if(s.calculateSum() <0) {
		    		System.out.println("아직 입력된 값이 없습니다");	    		
		    	} else {
		    	System.out.printf("번호 : %3d, 이름 : %s\n", s.getId(), s.getName());
		    	System.out.printf("국어 : %3d, 영어 : %3d, 수학 : %3d\n", s.getKorean(), s.getEnglish(), s.getMath());
		    	System.out.printf("총합 : %3d, 평균 : %.2f\n", s.calculateSum(), s.calculateAverage());
		    	}
		    }else {
		    	System.out.println("프로그램을 종료합니다");
		    	break;
		    }
		    

			
			
			
			
			
			
			
		}
				

	}
}
