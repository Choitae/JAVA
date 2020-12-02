package day01;

public class Ex08Operator01 {
	public static void main(String[] args) {
		int myInt = 3;
		int myInt2 = 4;
		
		System.out.println("myInt + myInt2 : "+(myInt + myInt2));
		System.out.println("myInt - myInt2 : "+(myInt - myInt2));
		System.out.println("myInt * myInt2 : "+(myInt * myInt2));
		System.out.println("myInt / myInt2 : "+(myInt / myInt2));
		// 정수간의 나눗셈의 경우 몫만 나온다.
		System.out.println("myInt % myInt2 : "+(myInt % myInt2));
		// % 연산자는 두 숫자의 나눗셈의 나머지를 구해준다.
	
		double result = myInt / myInt2;
		System.out.println("result의 현재 값 : "+result);
		
		result = (double) myInt / myInt2;
		System.out.println("result의 현재 값 : "+result);
		
		System.out.println("myInt의 현재 값 : "+myInt);
		System.out.println("++myInt의 현재 값 : "+ ++myInt);
		System.out.println("myInt의 현재 값 : "+myInt);
		
		System.out.println("myInt++의 현재 값 : "+ myInt++);
		System.out.println("myInt의 현재 값 : "+myInt);
		System.out.println(123+456);
		System.out.println("123"+456);
	}
}
