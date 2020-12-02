package stars;

import java.util.Scanner;
public class ExStarTest05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("줄의 개수를 입력하세요 : ");
	    int num = scanner.nextInt();
		for(int i=1; i<=num; i++) {
			String stars = new String();
			for(int j=1; j<=num-i; j++) {
				stars += " ";
			
			}
			for(int j=1; j<= 2*i -1; j++) {
					stars += "*";
			}
		    System.out.println(stars);

			}
		scanner.close();	
		}
		
		
		
		
		
		
		
	}


