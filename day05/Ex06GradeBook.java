package day05;

import java.util.ArrayList;
import java.util.Scanner;

import day04.Student;

public class Ex06GradeBook {
	private final static int SIZE = 5;

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1.입력, 2.출력. 3.종료");
			System.out.print("> ");

			int num = scanner.nextInt();
			if (num == 1) {
				Student s = new Student();

				if (list.size() < SIZE) {
					System.out.print("번호 : ");
					s.setId(scanner.nextInt());

					scanner.nextLine();
					System.out.print("이름 : ");
					s.setName(scanner.nextLine());
//					while(list.contains(s)) {
//						System.out.println("이미 존재하는 학생입니다.");
//						System.out.println("새로운 학생을 입력해주세요");
//						
//						System.out.print("번호 : ");
//						s.setId(scanner.nextInt());
//
//						scanner.nextLine();
//						System.out.print("이름 : ");
//						s.setName(scanner.nextLine());
//					}

					// 사용자가 입력한 학생이 존재할 시에는 해당 학생의 국영수 점수를 수정하는 코드

					if (list.contains(s)) {

						// 학생 수정 코드 실행
						// 1. 리스트에서 해당 학생의 index를 불러온다.
						int index = list.indexOf(s);
						// get(index)를 실행시키고
						// 거기에 setKorean등의 메소드를 실행시킨다.
						list.get(index).setKorean(s.validateScore(scanner, "국어 : "));
						list.get(index).setEnglish(s.validateScore(scanner, "영어 : "));

						list.get(index).setMath(s.validateScore(scanner, "수학 : "));

					} else {
						// s에 정수 입력 후 list에 추가
						s.setKorean(s.validateScore(scanner, "국어 : "));
						s.setEnglish(s.validateScore(scanner, "영어 : "));
						s.setMath(s.validateScore(scanner, "수학 : "));

						list.add(s);
					}

				} else {
					System.out.println("최대 학생수에 도달했습니다.");
				}

			} else if (num == 2) {
				if (list.isEmpty()) {

					// 리스트를 출력하는 코드 실행
					// 단 리스트가 비어있을 경우
					// 아직 추가된 학생이 없다고 경고 메세지만 출력

					System.out.println("아직 추가된 학생이 없습니다.");
				} else {
					for (Student s : list) {
						System.out.printf("번호 : %3d, 이름 : %s\n", s.getId(), s.getName());
						System.out.printf("국어 : %3d, 영어 : %3d, 수학 : %3d\n", s.getKorean(), s.getEnglish(), s.getMath());
						System.out.printf("총합 : %3d, 평균 : %.2f\n\n", s.calculateSum(), s.calculateAverage());

					}
				}

			} else if (num == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;

			}

		}

		scanner.close();
	}

}
