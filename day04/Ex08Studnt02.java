package day04;

public class Ex08Studnt02 {
	public static void main(String[] args) {
		// Student 클래스 객체를 선언하고 초기화하자
		Student s = new Student(1, "조재영", 80,81,81);
		//객체의 필드나 메소드를 접근 할 때에는 .연산자로 접근 가능하다.
		
		//객체 필드는 해당 객체 안에 우리가 값을 저장하거나
		// 저장된 값을 호출할 수 있다.
		// 이때에는 변수처럼 = 연산자 혹은 변수 이름을 적어주되
		// "누구의" 필드인지 적어주면 된다.
		// 즉 위의 s객체의 id는 s.id 이렇게.
		// 생성자는 리턴타입 ㅇ벗이 클래스와 메서드의 이름이 같고 맨 앞에 public이 붙이면 된다.
 		s.setId(1);//s.id = 1;
 		s.setName("조재영");
		s.setKorean(80);
		s.setEnglish(81);
		s.setMath(81);
		
		System.out.printf("번호 : %03d, 이름 : %s, 국어점수 : %03d, 영어점수 : %03d, 수학점수 : %03d, 총합 : %03d, 평균 : %.2f 입니다.\n	", s.getId(), s.getName(), s.getKorean(), s.getEnglish(), s.getMath(), s.calculateSum(), s.calculateAverage());

		Student s2 = new Student(3, "김철수", 40, 30, 45);
		System.out.printf("번호 : %03d, 이름 : %s, 국어점수 : %03d, 영어점수 : %03d, 수학점수 : %03d, 총합 : %03d, 평균 : %.2f 입니다.\n", s2.getId(), s2.getName(), s2.getKorean(), s2.getEnglish(), s2.getMath(), s2.calculateSum(), s2.calculateAverage());


		s2.setId(3);
		s2.setName("김철수");
		s2.setKorean(40);
		s2.setEnglish(30);
		s2.setMath(45);
		System.out.printf("번호 : %03d, 이름 : %s, 국어점수 : %03d, 영어점수 : %03d, 수학점수 : %03d, 총합 : %03d, 평균 : %.2f 입니다.\n", s2.getId(), s2.getName(), s2.getKorean(), s2.getEnglish(), s2.getMath(), s2.calculateSum(), s2.calculateAverage());

		
		System.out.println(s);
		System.out.println(s2);
		Student s3 = new Student(2, "아이유", 1,1,1);
		Student s4 = new Student(2, "아이유", 1,1,1);
		
		System.out.println("s3: "+s3);
		System.out.println("s4: "+s4);
		
		System.out.println("s3==s4:"+(s3==s4));
		System.out.println("s3.equals(s4):"+s3.equals(s4));

	}

}
