package day04;

public class Ex08Studnt02 {
	public static void main(String[] args) {
		// Student Ŭ���� ��ü�� �����ϰ� �ʱ�ȭ����
		Student s = new Student(1, "���翵", 80,81,81);
		//��ü�� �ʵ峪 �޼ҵ带 ���� �� ������ .�����ڷ� ���� �����ϴ�.
		
		//��ü �ʵ�� �ش� ��ü �ȿ� �츮�� ���� �����ϰų�
		// ����� ���� ȣ���� �� �ִ�.
		// �̶����� ����ó�� = ������ Ȥ�� ���� �̸��� �����ֵ�
		// "������" �ʵ����� �����ָ� �ȴ�.
		// �� ���� s��ü�� id�� s.id �̷���.
		// �����ڴ� ����Ÿ�� ������ Ŭ������ �޼����� �̸��� ���� �� �տ� public�� ���̸� �ȴ�.
 		s.setId(1);//s.id = 1;
 		s.setName("���翵");
		s.setKorean(80);
		s.setEnglish(81);
		s.setMath(81);
		
		System.out.printf("��ȣ : %03d, �̸� : %s, �������� : %03d, �������� : %03d, �������� : %03d, ���� : %03d, ��� : %.2f �Դϴ�.\n	", s.getId(), s.getName(), s.getKorean(), s.getEnglish(), s.getMath(), s.calculateSum(), s.calculateAverage());

		Student s2 = new Student(3, "��ö��", 40, 30, 45);
		System.out.printf("��ȣ : %03d, �̸� : %s, �������� : %03d, �������� : %03d, �������� : %03d, ���� : %03d, ��� : %.2f �Դϴ�.\n", s2.getId(), s2.getName(), s2.getKorean(), s2.getEnglish(), s2.getMath(), s2.calculateSum(), s2.calculateAverage());


		s2.setId(3);
		s2.setName("��ö��");
		s2.setKorean(40);
		s2.setEnglish(30);
		s2.setMath(45);
		System.out.printf("��ȣ : %03d, �̸� : %s, �������� : %03d, �������� : %03d, �������� : %03d, ���� : %03d, ��� : %.2f �Դϴ�.\n", s2.getId(), s2.getName(), s2.getKorean(), s2.getEnglish(), s2.getMath(), s2.calculateSum(), s2.calculateAverage());

		
		System.out.println(s);
		System.out.println(s2);
		Student s3 = new Student(2, "������", 1,1,1);
		Student s4 = new Student(2, "������", 1,1,1);
		
		System.out.println("s3: "+s3);
		System.out.println("s4: "+s4);
		
		System.out.println("s3==s4:"+(s3==s4));
		System.out.println("s3.equals(s4):"+s3.equals(s4));

	}

}
