package day02;
// �����Ը� �Է¹޾� ��ü�� - ���� - ��ü�� - �� -������ ��µǴ� ���α׷��� �餷�Ͻÿ�
// Ű�� �Է� ���� ������ m������ �Է�, �����Դ� kg������ �Է� �޴´�
// BMI == ������ / Ű / Ű
import java.util.Scanner;
public class Ex10BMI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����� Ű�� �� m�Դϱ�?");
		double tall = scanner.nextDouble();
		
		System.out.print("����� �����Դ� �� kg�Դϱ�?");
		double weight = scanner.nextDouble();
		
		double BMI = weight / tall / tall;
		System.out.printf("BMI�� : %.2f\n", BMI);
		if (BMI < 18.5) {
			System.out.println("��ü���Դϴ�.");
		} else if(BMI < 25) {
			System.out.println("����ü���Դϴ�.");
		} else if(BMI < 30) {
			System.out.println("��ü���Դϴ�.");
		} else if(BMI < 35) {
			System.out.println("���Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
		
		
		
		
		scanner.close();
	}

}
