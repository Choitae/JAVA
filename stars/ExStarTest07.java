package stars;


import java.util.Scanner;
public class ExStarTest07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� ������ �Է����ּ��� : ");
		int num = scanner.nextInt();
		for (int i = 1; i<=2*num -1; i++) {
			String stars = new String();
			if(i <= num) {
      			for(int j = 1; j<=i; j++) {
				stars += "*";
			    }
			}
      		else {
      			for(int j = 1; j<=2*(num)-i; j++ ){
      				stars += "*";
      			}
      		
			}
			System.out.println(stars);
			
		scanner.close();
		}
		
	}

	
	
}

/*		���κ�
 * 		for (int i = 1; i<=num-1; i++) {
 * 			String stars = new String();
			for(int j = 1; j<=i; j++){
				star += "*";
			}
			

			System.out.println(stars);

 *       }

 * 
 * 
 * 
 * 
 * 		�Ʒ��κ�
 *      for (int i = 1;  i<= num; i++){
 *      	String stars = new String();
 *      	for(int j = i; j<= num; j++){
 *      	     stars += "*";
 *          }
 *      
 *      
 *      	System.out.println(stars);

        } 

 *      
 *      
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
