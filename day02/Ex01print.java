package day02;

public class Ex01print {
	public static void main(String[] args) {
		String myString = new String("abcDEF");
		System.out.print(myString);
		System.out.print(myString);
		
		System.out.println(myString);
		System.out.println(myString);
		
		System.out.printf("%s",myString);
		System.out.printf("%s",myString);
		
		System.out.println();

		//	   System.out.println()dms System.out.print("\n")�� ���� �ǹ��̴�.
		System.out.println("abc\tDEF");
		//��ĭ�� ��Ƽ� ��ĭ ���� ���� ��ĭ�� ��ĭ�� ��.
		
		System.out.println("abc\nDEF");
	}
}
