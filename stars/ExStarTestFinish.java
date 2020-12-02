package stars;

import java.util.Scanner;

public class ExStarTestFinish {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		int num = scanner.nextInt();
		for(int i = 1; i<= 2*num-1; i++) {
			String stars = new String();
			if (i == 1 || i == 2*num -1) {
				for(int j=1; j<=2*num -1; j++ ) {
					stars += "*";
				
				}
			    }
				else if(i < num) {
					int upnum = i -1;
					for(int j = 1; j<=num-upnum; j++) {
						  stars += "*";
						
					}
					for(int j = 1; j<=2*upnum-1; j++ ) {
						stars += " ";
					}
					for(int j = 1; j<=num-upnum; j++) {
						stars += "*";
					}
					
					
				}else {
					int undernum = i - num +1;
					for(int j = 1; j<=undernum; j++) {
						stars +="*";
						
					}
					int totalWidth = 2*num -1;
					int spaceWidth = totalWidth - 2*undernum;
					for(int j = 1; j<=spaceWidth; j++) {
						stars +=" ";
					}
					for(int j = 1; j<=undernum; j++) {
						stars +="*";
					}
				}
					
			System.out.println(stars);
			}
			
			
			
			
		scanner.close();	
		}
		
		
	 
	 }

	
	
	
	
	
	
	
