package day02;

public class Ex02Printf {
	public static void main(String[] args) {
		System.out.println("------1. 10진법 정수------");
		
		int number = 157;
		//10진법 정수를 그대로 출력하기
		System.out.printf("1-A. %d\n", number);
		//10진법 정수를 5자리 오른쪽 정렬해서 출력하라
		System.out.printf("1-B. %5d\n", number);
		//10진법 정수를 2자리 오른쪽 정렬해서 출력하라.
	
		System.out.printf("1-C. %2d\n", number);
     	//10진법 정수를 5자리 왼쪽 정렬해서 출력하라.
		System.out.printf("1-D. %-5d(끝)\n", number);
		//10진법 정수를 5자리오른쪽 정렬하고 왼쪽 빈 공간은 0으로 출력하라	
		System.out.printf("1-E. %05d\n", number);
		System.out.println("------------------------");
		System.out.println("------2. 16진법 정수------");
		// 2. 16진법 정수(he'x'adecimal)
		// A. 16진법 정수를 그대로 출력하되 알파벳이 있을 경우 소문자로 출력하라.
		System.out.printf("2-A. %x\n", number);
		// B. 16진법 정수를 그대로 출력하되 알파벳이 있을 경우 대문자로 출력하라.
		System.out.printf("2-B. %X\n", number);
		// C. 16진법 정수를 오른쪽 정렬해서 8자리라 출력하로 알파벳은 대문자로 출력
		System.out.printf("2-C. %8X\n", number);
		// D. 16진법 정수를 왼쪽 정렬한 8자리로 출력하로 알파벳이 있을 경우 소문자로 출력.
		System.out.printf("2-D. %-8x(끝)\n", number);
		// E. 16진법 정수를 오른쪽으로 정렬 후 8자리로 출력하고 왼쪽 빈자리는 0으로 채우고 알파벳은 대문자로!
		System.out.printf("2-E. %08x\n", number);
		System.out.println("------------------------");
		System.out.println("---------3. 실수---------");
		// 3. 실수('f'loat)
		double myDouble = 123.4567;
		// A. 실수를 그대로 출력하라
		System.out.printf("3-A. %f\n", myDouble);
		// B. 실수를 총 15자리 오른쪽 정렬을 해서 출력하라.
		System.out.printf("3-B. %15f\n", myDouble);
		// C. 실수를 소숫점 2자리까지 출력하라.
		System.out.printf("3-C. %.2f\n", myDouble);
		// D. 실수를 총 10자리 오른쪽 정렬해서 출력하고 소숫점은 3번째 자리까지.
		// 출력하고 오른쪽 빈 공간은 0으로 채워라
		System.out.printf("3-D. %010.3f\n", myDouble);
		// E. 실수를 총 10자리 왼쪽정렬해서 출력하고 소숫점은 2번쨰자리까지 출력
		System.out.printf("3-E. %-10.2f(끝)\n", myDouble);
		System.out.println("------------------------");
		System.out.println("---------4.문자열---------");
		String myString = new String("abcDEFghi");
		System.out.printf("4-A. %s\n", myString);
		// B. 문자열에 소문자가 있을 경우 대문자로 바꾸어 출력하라.
		System.out.printf("4-B. %S\n", myString);
		//1) 유효하지 않은 %문자가 나올 경우 에러가 발생한다.
		//ex) printf("abc %v\n", myString);
		//2) %문자와 출력할 내용의 데이터타입이 다를 경우 에러가 발생한다.
		//ex) printf("abc %d\n", myDouble);
		//3) %문자의 갯수가 출력할 내용의 갯수보다 적은건 에러가 발생하지 않지만,
		//   %문자의 갯수가 더 많으면 에러가 난다.
		//ex) printf("abc %d %d %d %d \n", a, b, c);
		// printf의 경우에는 상황에 맞춰 다양한 %문자를 사용가능하다.
		System.out.printf("이름 : %s 번호 : %d, 평준점수 %.2f", "태현", 5, 3.85);
		
		
		
		
		System.out.println("------------------------");

		
	}
}
