package day02;

import java.util.Scanner;

public class Ex03Scaner {
	public static void main(String[] args) {
		//Scanner는 참조형 데이터타입이므로 아래와 같은 방식으로 변수를 만들어준다.
		Scanner scanner = new Scanner(System.in);
	
		
        // 스캐너를 사용하여 정수를 입력받을 떄에는 
		// nextInt() 메소드를 호출하면 된다.
		System.out.print("정수 : ");
		int number;
		number = scanner.nextInt();
		
		System.out.printf("사용자가 입력한 정수 : %d\n", number);
		
		// 스캐너를 사용하여 실수를 입력받을 때에는
		// nextDouble()메소드를 호출하면 된다.
		System.out.print("실수 : ");
		double myDouble = scanner.nextDouble();
		System.out.printf("사용자가 입력한 실수 : %f\n", myDouble);
		
		// 스캐너를 사용하여 스트링을 입력받을 때에는
		// nextline() 메소드를 호출하면 된다.
		// nextline() 메소드를 사용할 때 한가지 주의할 점이 있는데
		// nextInt(), nextDouble()등의 숫자를 입력하는 메소드를 호출한 후에는
		// 우리가 숫자를 입력하면서 입력이 끝났다는 알려주는 엔터키가 버퍼 메모리에 남아있다.
		// 따라서 숫자 입력후에 nextline()을 사용하면
		// 스캐너는 "사용자가 아무런 입력없이 입력을 종료시켰구나!"라고 착각하게 된다.
		// 따라서 버퍼메모리를 한번 비워주어야 정상적으로 숫자 입력 후에 스트링 입력이 가능하다.
		scanner.nextLine();
		
		// 하지만 버퍼메모리가 아무것도 없는 경우,
		// 즉 scanner.nextLine()이 실행된 직후니
		// 숫자 입력을 받기 전이라면
		// 버퍼메모리를 비워줄 필요가 없다.
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		System.out.printf("사용자가 입력한 이름 : %s\n", name);
		
		
		
		// 스캐너 변수와 같이 외부 '메모리'를 참조하는 변수는
		// 항상 프로그램 가장 마지막 줄에
		// close() 메소드를 호출해주면 좋다.
		scanner.close();
	}
}
