package day02;
import java.util.Scanner;
public class Ex13NestedIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("성별을 입력하세요(남자는 1, 여자는 2) : ");
	    int sex = scanner.nextInt();
		
	    if (sex == 1) {
	    	System.out.print("나이 : ");
	    	int age = scanner.nextInt();
	    	if (age >= 18) {
	    		System.out.println("성인입니다.");
	    		System.out.print("신체등급 : ");
	            int category = scanner.nextInt();
	            if(category <= 3) {
	            	System.out.println("현역입니다.");
	            } else if(category == 4) {
	            	System.out.println("공익입니다");
	            } else {
	            	System.out.println("면제입니다");
	            }
	    	} else {
	    		System.out.println("아직 미성년자입니다.");
	    	}
	    }else {
	    	System.out.println("여성에게는 국방의 의무가 없습니다.");
	    }
		
		
		
		
		
		
		
		
		
		scanner.close();
		
		
		
		
	}

}
