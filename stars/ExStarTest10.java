package stars;

import java.util.Scanner;

public class ExStarTest10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = scanner.nextInt();
		for(int i=1; i<=2*num-1; i++) //���� ����
		{   String stars = new String();
		    if( i == 1 || i == 2*num -1) {
		    	for(int j=1; j<=2*num-1; j++) {
		    		stars +="*";
		    	}
		    }else if(i < num) {
		    	// ù���� ������ ���κ�
		    	int upperI = i - 1;
		    	for(int j = 1; j<=num-upperI; j++) {
		    		stars +="*";
		    	
		    	}
		    	for(int j = 1; j<=2*upperI-1; j++) {
		    		stars += " "; // �߰��� �� ����
		    	}
		    	for(int j = 1; j <= num - upperI; j++) {
		    		stars += "*"; // �������� ��
		    	}
		    	
		    }else {
		    	int lowerI = i -num +1;
		    	for(int j = 1; j <= lowerI; j++) {
		    		stars += "*"; //���� ��
		    	}
		    	// �ʺ� ����� int ���� totalWidth 
		    	// ������ ������ ������ int ���� spaceWidth
		    	int totalWidth = 2*num - 1;
		    	int spaceWidth = totalWidth-2*lowerI;
		    	for(int j = 1; j <=spaceWidth; j++) {
		    		stars += " ";
		    	}
		    	for(int j = 1; j <= lowerI; j++) {
		    		stars += "*"; // �������� ��
		    	}
		    	
		    	}
			System.out.println(stars);	
		    }
			
			
		 scanner.close();
		}
		
		
	    
	}

