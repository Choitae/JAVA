package stars;

import java.util.Scanner;
public class ExStarTest08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("줄의 개수를 입력하세요 : ");
		int num = scanner.nextInt();
		// 윗부분
		for(int i=1; i<=num-1; i++) {
			String stars = new String();
			for(int j=i; j<=num; j++) {
				stars += " ";
			}
			for(int j=1; j<=i; j++) {
				stars += "*";
			}
			System.out.println(stars);
			
		}
		//아랫부분
		for(int i=1; i <=num; i++) {
			String stars = new String();
			for(int j = 1; j<=i; j++) {
				stars += " ";
			}
			for(int j = i; j<=num; j++) {
				stars += "*";
			}
			System.out.println(stars);

			
		}
		
		
		
	}

}

/*for (int i = 1; i<=2*num -1; i++) {
			String stars = new String();
			if(i <= num) { //윗부분이 한줄 더 많게.
      			for(int j = 1; j<=num-1; j++) {
				stars += " ";
			    }
			    for(int j=1; j<=i; j++) {
				stars += "*";
			}
			}
      		else { // 아랫부분
      		    // 아랫부분용 i를 만들어서 사용하기.
      		    // num = 5일 때 5 6 7 8 9 --> 1 2 3 4 5를 만들기 위해
      		    // i -num +1을 해주면 된다.
      		    int lowerI = i - num +1;
      	 	    
		     	for(int j = 1; j<=lowerI - 1; j++) {
				    stars += " ";
				 
			    }
			    for(int j = lowerI; j <= num; j++) {
				    stars += "*";
			 }

      		
			}
			System.out.println(stars);
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
