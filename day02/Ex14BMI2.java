package day02;
import java.util.Scanner;
public class Ex14BMI2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ű�� �Է��ϼ���(m) : ");
		double height = scanner.nextDouble();

		if (height >0.2 && height <2.5) {
			System.out.print("�����Ը� �Է��ϼ���(kg) : ");
			double weight = scanner.nextDouble();
			if (weight >3 && weight <200) {
				double BMI = weight / height / height;
				System.out.printf("BMI�� %f�Դϴ�\n",BMI);
				if(BMI < 18.5) {
					System.out.println("��ü���Դϴ�");
				} else if(BMI < 25){
					System.out.println("����ü���Դϴ�");
				} else if(BMI < 30) {
					System.out.println("��ü���Դϴ�");
				} else if(BMI < 35) {
					System.out.println("���Դϴ�");
				} else {
					System.out.println("�����Դϴ�");
				}
			}else {
				System.out.println("�߸� �Է��ϼż� �����մϴ�.");
			}
		} else {
			System.out.println("�߸� �Է��ϼż� �����մϴ�.");
		}

		

		
		scanner.close();
	}

}
