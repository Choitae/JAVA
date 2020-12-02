package day01;
//주석(Comment)
//주석이란, 우리가 코딩할 클래스에 입력하는 글자들이지만
// 실제로 클래스가 프로그램으로 변환 될 때에는 무시되는 글자들
// 해당 프로그램의 설명을 적을 때 사용됨.

// 한줄 주석은 //, 여러줄 주석 /**/
// 변수(variable)
// 변수란 그 안의 값이 바뀔 수 있는 공간.
public class Ex01Variable {
	public static void main(String[] args) {
		int number;
		number = 4;
		System.out.println("number의 현재값 : " +number);
		//number은 변수이기 때문에 같은 데이터타입의 값으로 변형 시킬 수 있으나
		//다른 데이터타입의 값으로는 변형시킬 수 없다.
		number = 23;
		System.out.println("number의 현재값 : " +number);
		
		number = 1200;
		System.out.println("number의 현재값 : " +number);
		
		//number = 3.141592;
		//number = "안녕하세요";
		
		//상수 선언하기
		final int NUMBER;
		//상수의 값 초기화학
		NUMBER = 4;
		System.out.println("NUMBER의 현재값 : " +NUMBER);
		
	}
}
