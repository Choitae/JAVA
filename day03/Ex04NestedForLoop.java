package day03;
/* ��ø for loop�� ���� ���ڱ��� for �ݺ����� �ѹ� ���� �� �� ���� ���� for �ݺ����� ó������ ������ �ݺ��ȴ�.
 * �� ���� for���� �� �ݺ��� Ã���� i for ���� �ݺ�Ã�� x j for���� �ݺ�Ƚ���� �ȴ�.
 */
public class Ex04NestedForLoop {
	public static void main(String[] args) {
		for(int i = 1; i<=3 ; i ++) {
			System.out.println("------i for��"+i+"�� �ݺ��� ------");
			for(int j = 11; j <=15; j++) {
				System.out.printf("i�� ���簪 : %d, j�� ���簪 : %d\n", i, j);
				
			}
			
			
			
			System.out.println("----------------------------");
			
			
		}
		
		
	}
}
