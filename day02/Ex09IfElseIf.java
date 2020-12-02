package day02;
// if-else구조에서는 우리가 조건식을 여러개를 넣엇 가장 먼저 true가 나오는 하나의 코드 블럭만 실행하게 된다.
// 만약 가장 마지막이 else로 끝난다면 위의 조건이 모드 false일 때 해당 else 코드 블럭이 실행되게 된다.
// else if의 경우 if가 붙기 떄문에 반드시 조건문이 ()에 담겨서 같이 넘어와야 한다.

// if(조건식 1){

// }else if(조건식2){

// }else {

// }
public class Ex09IfElseIf {
	public static void main(String[] args) {
		int age = 11;
		if (age <= 5) {
			System.out.println("유아입니다.");
		} else if(age <= 13) {
			System.out.println("어린이입니다");
		} else if(age < 18) {
			System.out.println("청소년입니다");
		} else {
			System.out.println("성인입니다");
		}
		
		
		
	}

}
