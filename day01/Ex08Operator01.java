package day01;

public class Ex08Operator01 {
	public static void main(String[] args) {
		int myInt = 3;
		int myInt2 = 4;
		
		System.out.println("myInt + myInt2 : "+(myInt + myInt2));
		System.out.println("myInt - myInt2 : "+(myInt - myInt2));
		System.out.println("myInt * myInt2 : "+(myInt * myInt2));
		System.out.println("myInt / myInt2 : "+(myInt / myInt2));
		// �������� �������� ��� �� ���´�.
		System.out.println("myInt % myInt2 : "+(myInt % myInt2));
		// % �����ڴ� �� ������ �������� �������� �����ش�.
	
		double result = myInt / myInt2;
		System.out.println("result�� ���� �� : "+result);
		
		result = (double) myInt / myInt2;
		System.out.println("result�� ���� �� : "+result);
		
		System.out.println("myInt�� ���� �� : "+myInt);
		System.out.println("++myInt�� ���� �� : "+ ++myInt);
		System.out.println("myInt�� ���� �� : "+myInt);
		
		System.out.println("myInt++�� ���� �� : "+ myInt++);
		System.out.println("myInt�� ���� �� : "+myInt);
		System.out.println(123+456);
		System.out.println("123"+456);
	}
}
