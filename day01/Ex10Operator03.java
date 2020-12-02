package day01;

public class Ex10Operator03 {
	public static void main(String[] args) {
		System.out.println("3 < 5 : "+(3<5));
		System.out.println("5 < 3 : "+(5<3));
		System.out.println("3 < 3 : "+(3<3));
		
		System.out.println("3 > 5 : "+(3>5));
		System.out.println("5 > 3 : "+(5>3));
		System.out.println("3 > 3 : "+(3>3));
		
		System.out.println("3 <= 5 : "+(3<=5));
		System.out.println("5 <= 3 : "+(5<=3));
		System.out.println("3 <= 3 : "+(3<=3));
		
		System.out.println("3 >= 5 : "+(3>=5));
		System.out.println("5 >= 3 : "+(5>=3));
		System.out.println("3 >= 3 : "+(3>=3));
		
		System.out.println("3 == 3 : "+(3==3));
		System.out.println("3 == 4 : "+(3==4));
		
		
		System.out.println("3 != 3 : "+(3!=3));
		System.out.println("3 != 4 : "+(3!=4));
		
		String myString1 = "abc";
		String myString2 = new String("abc");
		String myString3 = myString1;
		
		System.out.println("============myString값을 확인하기 ==========");
		System.out.println("myString1의 현재 값 : "+myString1);
		System.out.println("myString2의 현재 값 : "+myString2);
		System.out.println("myString3의 현재 값 : "+myString3);
		System.out.println("=========================================");
		
		System.out.println("----비교연산자를 사용한 참조형 변수값 비교 -----");
		System.out.println("my String1 == myString2 : "+(myString1 == myString2));
		System.out.println("my String2 == myString3 : "+(myString2 == myString3));
		System.out.println("my String1 == myString3 : "+(myString1 == myString3));
		System.out.println("------------------------------------------------");

		System.out.println("=======equals()를 사용한 비교");
		System.out.println("myString1.equals(myString2) : " +myString1.equals(myString2)); 
		System.out.println("myString2.equals(myString3) : " +myString2.equals(myString3)); 
		System.out.println("myString1.equals(myString3) : " +myString1.equals(myString3)); 

	
	}
}
