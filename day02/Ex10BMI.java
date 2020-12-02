package day02;
// 몸무게를 입력받아 저체중 - 정상 - 과체중 - 비만 -고도비만이 출력되는 프로그램을 잓ㅇ하시오
// 키를 입력 받을 떄에는 m단위로 입력, 몸무게는 kg단위로 입력 받는다
// BMI == 몸무게 / 키 / 키
import java.util.Scanner;
public class Ex10BMI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("당신의 키는 몇 m입니까?");
		double tall = scanner.nextDouble();
		
		System.out.print("당신의 몸무게는 몇 kg입니까?");
		double weight = scanner.nextDouble();
		
		double BMI = weight / tall / tall;
		System.out.printf("BMI는 : %.2f\n", BMI);
		if (BMI < 18.5) {
			System.out.println("저체중입니다.");
		} else if(BMI < 25) {
			System.out.println("정상체중입니다.");
		} else if(BMI < 30) {
			System.out.println("과체중입니다.");
		} else if(BMI < 35) {
			System.out.println("비만입니다.");
		} else {
			System.out.println("고도비만입니다.");
		}
		
		
		
		
		scanner.close();
	}

}
