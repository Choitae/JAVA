package stars;

import java.util.Scanner;

public class ExStarTest10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		for(int i=1; i<=2*num-1; i++) //줄의 개수
		{   String stars = new String();
		    if( i == 1 || i == 2*num -1) {
		    	for(int j=1; j<=2*num-1; j++) {
		    		stars +="*";
		    	}
		    }else if(i < num) {
		    	// 첫줄을 제외한 윗부분
		    	int upperI = i - 1;
		    	for(int j = 1; j<=num-upperI; j++) {
		    		stars +="*";
		    	
		    	}
		    	for(int j = 1; j<=2*upperI-1; j++) {
		    		stars += " "; // 중간의 빈 공간
		    	}
		    	for(int j = 1; j <= num - upperI; j++) {
		    		stars += "*"; // 오른쪽의 별
		    	}
		    	
		    }else {
		    	int lowerI = i -num +1;
		    	for(int j = 1; j <= lowerI; j++) {
		    		stars += "*"; //왼쪽 별
		    	}
		    	// 너비를 계싼할 int 변수 totalWidth 
		    	// 공백의 변수를 저장할 int 변수 spaceWidth
		    	int totalWidth = 2*num - 1;
		    	int spaceWidth = totalWidth-2*lowerI;
		    	for(int j = 1; j <=spaceWidth; j++) {
		    		stars += " ";
		    	}
		    	for(int j = 1; j <= lowerI; j++) {
		    		stars += "*"; // 오른쪽의 별
		    	}
		    	
		    	}
			System.out.println(stars);	
		    }
			
			
		 scanner.close();
		}
		
		
	    
	}

