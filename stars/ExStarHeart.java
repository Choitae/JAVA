package stars;
// ��Ʈ�����
import java.util.Scanner;
public class ExStarHeart {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("5�̻��� ���ڸ� �Է� : ");
		int num = scanner.nextInt();
		int totalWidth = 2*num -1;
		for(int i =1; i<=totalWidth; i++) {
			String stars = new String();
			if(i==1 || i== totalWidth) {
				for(int j =1; j<=totalWidth; j++) {
					stars += "*";
				}
			}else if (i<num) {
			   int upnum = i - 1;
			   for(int j = 1; j<=num-upnum; j++) {
				   stars += "*";
			   }
			}else {
			  int downnum = i - num + 1;
				
			}
			
		 System.out.println(stars);
		}
		
		
		scanner.close();
	}

}
