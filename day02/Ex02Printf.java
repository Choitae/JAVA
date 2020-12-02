package day02;

public class Ex02Printf {
	public static void main(String[] args) {
		System.out.println("------1. 10���� ����------");
		
		int number = 157;
		//10���� ������ �״�� ����ϱ�
		System.out.printf("1-A. %d\n", number);
		//10���� ������ 5�ڸ� ������ �����ؼ� ����϶�
		System.out.printf("1-B. %5d\n", number);
		//10���� ������ 2�ڸ� ������ �����ؼ� ����϶�.
	
		System.out.printf("1-C. %2d\n", number);
     	//10���� ������ 5�ڸ� ���� �����ؼ� ����϶�.
		System.out.printf("1-D. %-5d(��)\n", number);
		//10���� ������ 5�ڸ������� �����ϰ� ���� �� ������ 0���� ����϶�	
		System.out.printf("1-E. %05d\n", number);
		System.out.println("------------------------");
		System.out.println("------2. 16���� ����------");
		// 2. 16���� ����(he'x'adecimal)
		// A. 16���� ������ �״�� ����ϵ� ���ĺ��� ���� ��� �ҹ��ڷ� ����϶�.
		System.out.printf("2-A. %x\n", number);
		// B. 16���� ������ �״�� ����ϵ� ���ĺ��� ���� ��� �빮�ڷ� ����϶�.
		System.out.printf("2-B. %X\n", number);
		// C. 16���� ������ ������ �����ؼ� 8�ڸ��� ����Ϸ� ���ĺ��� �빮�ڷ� ���
		System.out.printf("2-C. %8X\n", number);
		// D. 16���� ������ ���� ������ 8�ڸ��� ����Ϸ� ���ĺ��� ���� ��� �ҹ��ڷ� ���.
		System.out.printf("2-D. %-8x(��)\n", number);
		// E. 16���� ������ ���������� ���� �� 8�ڸ��� ����ϰ� ���� ���ڸ��� 0���� ä��� ���ĺ��� �빮�ڷ�!
		System.out.printf("2-E. %08x\n", number);
		System.out.println("------------------------");
		System.out.println("---------3. �Ǽ�---------");
		// 3. �Ǽ�('f'loat)
		double myDouble = 123.4567;
		// A. �Ǽ��� �״�� ����϶�
		System.out.printf("3-A. %f\n", myDouble);
		// B. �Ǽ��� �� 15�ڸ� ������ ������ �ؼ� ����϶�.
		System.out.printf("3-B. %15f\n", myDouble);
		// C. �Ǽ��� �Ҽ��� 2�ڸ����� ����϶�.
		System.out.printf("3-C. %.2f\n", myDouble);
		// D. �Ǽ��� �� 10�ڸ� ������ �����ؼ� ����ϰ� �Ҽ����� 3��° �ڸ�����.
		// ����ϰ� ������ �� ������ 0���� ä����
		System.out.printf("3-D. %010.3f\n", myDouble);
		// E. �Ǽ��� �� 10�ڸ� ���������ؼ� ����ϰ� �Ҽ����� 2�����ڸ����� ���
		System.out.printf("3-E. %-10.2f(��)\n", myDouble);
		System.out.println("------------------------");
		System.out.println("---------4.���ڿ�---------");
		String myString = new String("abcDEFghi");
		System.out.printf("4-A. %s\n", myString);
		// B. ���ڿ��� �ҹ��ڰ� ���� ��� �빮�ڷ� �ٲپ� ����϶�.
		System.out.printf("4-B. %S\n", myString);
		//1) ��ȿ���� ���� %���ڰ� ���� ��� ������ �߻��Ѵ�.
		//ex) printf("abc %v\n", myString);
		//2) %���ڿ� ����� ������ ������Ÿ���� �ٸ� ��� ������ �߻��Ѵ�.
		//ex) printf("abc %d\n", myDouble);
		//3) %������ ������ ����� ������ �������� ������ ������ �߻����� ������,
		//   %������ ������ �� ������ ������ ����.
		//ex) printf("abc %d %d %d %d \n", a, b, c);
		// printf�� ��쿡�� ��Ȳ�� ���� �پ��� %���ڸ� ��밡���ϴ�.
		System.out.printf("�̸� : %s ��ȣ : %d, �������� %.2f", "����", 5, 3.85);
		
		
		
		
		System.out.println("------------------------");

		
	}
}
