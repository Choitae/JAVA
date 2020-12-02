package stars;

import java.util.Scanner;


public class ExStarTest02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("출력할 별의 개수를 입력 : ");
		int starNumber = scanner.nextInt();
		
		for(int i = 1; i<=starNumber; i++) {
			 String stars = new String();
			 for(int j = 1; j <= starNumber -i+1; j++) {
				 stars += "*";
			 }
			 System.out.println(stars);

		   }
		scanner.close();
		}
		
		
		
	}

	
	

