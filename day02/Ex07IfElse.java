package day02;
// If else 구조에서는 if 조건식을 체크해서 true가 나오면 if 코드블럭만 실행이 되고
// 만약 false가 나오면 else 코드 블럭만 실행이 되는 구조이다.

// if(조건식){
//       조건식이 true일 떄 실행할 코드
//  } else {
//       조건식이 false일 때 실행할 코드
//  }

public class Ex07IfElse {
	public static void main(String[] args) {
		int age = 25;
		if (age > 18) {
			
			System.out.println("사용자의 나이 : " + age);
			System.out.println("사용자는 성인입니다.");		
			
		}else {
			System.out.println("사용자의 나이 : " +age);
			System.out.println("사용자는 미성년자입니다.");
		}
		
		System.out.println("프로그램 종료");
	}

}
