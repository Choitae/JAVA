package stars;

import java.util.Scanner;

public class ExStarTest03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϼ���");
		int userNumber = scanner.nextInt();

		// i���� ���� ũ�⸦ ����ϰ� j���� �� ���� ���� ������ ����Ѵ�.
		for(int i=1; i<=userNumber; i++) {
			// ����� ������ ���� String ������ ����
			String stars = new String();
			for(int k=i; k<=userNumber; k++ ) {
				stars += " ";
			}
			for(int j=1; j<=i; j++) {
				stars += "*";

			}

			System.out.println(stars);
		}
		
		
		
		scanner.close();
	}

}
