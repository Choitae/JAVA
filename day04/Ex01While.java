package day04;
/* while문
 * 횟수가 명확하게 몇번 반복하라는 for문과는 다르게 while문은 조건식이 true일 동안만 반복하게 된다.
 
 *
 *  while(조건식){
 *      조건문이 true일 동안 반복할 코드
 *  }
 */


public class Ex01While {
	public static void main(String[] args) {

	/*  for(int i = 0; i<3; i++){
	 *     System.out.println("i의 현재값 : "+1);
	 *  }
	 * 
	 */
	int i = 0;
	while (i<3) {
		System.out.println("i의 현재값 : "+1);
		i++;
	}
}
}
