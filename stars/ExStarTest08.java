package stars;

import java.util.Scanner;
public class ExStarTest08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� : ");
		int num = scanner.nextInt();
		// ���κ�
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
		//�Ʒ��κ�
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
			if(i <= num) { //���κ��� ���� �� ����.
      			for(int j = 1; j<=num-1; j++) {
				stars += " ";
			    }
			    for(int j=1; j<=i; j++) {
				stars += "*";
			}
			}
      		else { // �Ʒ��κ�
      		    // �Ʒ��κп� i�� ���� ����ϱ�.
      		    // num = 5�� �� 5 6 7 8 9 --> 1 2 3 4 5�� ����� ����
      		    // i -num +1�� ���ָ� �ȴ�.
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
