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
		
		System.out.println("============myString���� Ȯ���ϱ� ==========");
		System.out.println("myString1�� ���� �� : "+myString1);
		System.out.println("myString2�� ���� �� : "+myString2);
		System.out.println("myString3�� ���� �� : "+myString3);
		System.out.println("=========================================");
		
		System.out.println("----�񱳿����ڸ� ����� ������ ������ �� -----");
		System.out.println("my String1 == myString2 : "+(myString1 == myString2));
		System.out.println("my String2 == myString3 : "+(myString2 == myString3));
		System.out.println("my String1 == myString3 : "+(myString1 == myString3));
		System.out.println("------------------------------------------------");

		System.out.println("=======equals()�� ����� ��");
		System.out.println("myString1.equals(myString2) : " +myString1.equals(myString2)); 
		System.out.println("myString2.equals(myString3) : " +myString2.equals(myString3)); 
		System.out.println("myString1.equals(myString3) : " +myString1.equals(myString3)); 

	
	}
}
