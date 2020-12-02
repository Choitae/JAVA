package day02;
import java.util.Scanner;
public class Ex14BMI2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("키를 입력하세요(m) : ");
		double height = scanner.nextDouble();

		if (height >0.2 && height <2.5) {
			System.out.print("몸무게를 입력하세요(kg) : ");
			double weight = scanner.nextDouble();
			if (weight >3 && weight <200) {
				double BMI = weight / height / height;
				System.out.printf("BMI는 %f입니다\n",BMI);
				if(BMI < 18.5) {
					System.out.println("저체중입니다");
				} else if(BMI < 25){
					System.out.println("정상체중입니다");
				} else if(BMI < 30) {
					System.out.println("과체중입니다");
				} else if(BMI < 35) {
					System.out.println("비만입니다");
				} else {
					System.out.println("고도비만입니다");
				}
			}else {
				System.out.println("잘못 입력하셔서 종료합니다.");
			}
		} else {
			System.out.println("잘못 입력하셔서 종료합니다.");
		}

		

		
		scanner.close();
	}

}
