package day03;
/* 1���� 100������ �Ҽ��� ���ϴ� ���α׷� .
 * 
 */

public class Ex05PrimeNumber {
	public static void main(String[] args) {
		// i�� �Ҽ� ���θ� Ȯ���ϰ�
		// j

		for (int i = 1; i <= 100; i++) {
			int count = 0;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i + "�� �Ҽ��Դϴ�.");

			}
			// ����� ������ 2���̸� i�� �Ҽ��̹Ƿ� ������ش�.

		}

	}

}
