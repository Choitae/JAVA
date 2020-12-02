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

		//	   System.out.println()dms System.out.print("\n")°ú °°Àº ÀÇ¹ÌÀÌ´Ù.
		System.out.println("abc\tDEF");
		//³×Ä­¾¿ Àâ¾Æ¼­ ³×Ä­ ¶ç¿ì°í ´ÙÀ½ ³×Ä­¿¡ ºóÄ­À» µÒ.
		
		System.out.println("abc\nDEF");
	}
}
