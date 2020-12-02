package day03;
/* 중첩 for loop인 경유 ㅂ자깥쪽 for 반복문이 한번 실행 될 때 마다 안쪽 for 반복문은 처음부터 끝까지 반복된다.
 * 즉 안쪽 for문이 총 반복된 횄수는 i for 문의 반복횄수 x j for문의 반복횟수가 된다.
 */
public class Ex04NestedForLoop {
	public static void main(String[] args) {
		for(int i = 1; i<=3 ; i ++) {
			System.out.println("------i for문"+i+"번 반복중 ------");
			for(int j = 11; j <=15; j++) {
				System.out.printf("i의 현재값 : %d, j의 현재값 : %d\n", i, j);
				
			}
			
			
			
			System.out.println("----------------------------");
			
			
		}
		
		
	}
}
