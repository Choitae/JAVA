package day05;
//배열을 사용하여 학생들을 관리하는 프로그램

import java.util.Scanner;

import day04.Student;

public class Ex03StudntArray01 {
	private final static int SIZE = 5;

	public static void main(String[] args) {
		// 학생 배열 선언
		Student[] studentArray = new Student[SIZE];
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1.입력 2.출력 3.종료 : ");
			System.out.print("> ");
			int num = scanner.nextInt();
			if (num == 1) {
				// 배열을 돌아서 null인 곳을 찾아서 입력을 한다. 만약 null인 곳이 없으면 경고 메세지만 출력

				// 1. 먼저 배열의 빈 곳, 즉 null인곳의 위치번호를저장할 int 변수 index를 생성. 단 index는 -1로 초기화한다.
				// 만약 배열이 꽉 찼다면 index는 -1로 남아있으므로 우리가 메세지 출력이 가능해진다.
				int index = -1;

				// for문을 사용하여 null인 곳의 위치번호를 index에 넣고 break
				for (int i = 0; i < studentArray.length; i++) {
					if (studentArray[i] == null) {
						index = i;
						break;
					}

				}
				// index가 -1이면 "배열이 꽉찼습니다." 란 경고메시지만 출력하고 그 외에는
				// 학생 객체를 만들어 정보를 넣고 index칸을 해당 객체로 초기화해준다.
				if (index == -1) {
					System.out.println("현재배열이 꽉찼습니다");
				} else {
					// 학생의 정보를 담을 객체 생성
					Student s = new Student();
					System.out.print("번호를 입력하세요 : ");
					s.setId(scanner.nextInt());

					scanner.nextLine();
					System.out.print("이름 : ");
					s.setName(scanner.nextLine());

					s.setKorean(s.validateScore(scanner, "국어 : "));
					s.setEnglish(s.validateScore(scanner, "영어 : "));

					s.setMath(s.validateScore(scanner, "수학 : "));
					studentArray[index] = s;

				}
			} else if (num == 2) {
				// 배열에 들어가 한곳이라고 null이 아닌지 체크하고 모두다 null이면 경고 메세지를 출력. 그 외에는 null 아닌 곳만 출력
				// null이 아니면 true로 바뀌는 isEmpty boolean변수를 false로 선언/초기화
				boolean isEmpty = true;
				for (int i = 0; i < studentArray.length; i++) {
					if (studentArray[i] != null) {
						isEmpty = false;
						break;
					}
				}

				// null이 아닌것이 존재하는지 확인이 되었으므로 if/else 구조를 출력할 내용을 결정.
				if (isEmpty) {
					System.out.println("아직 입력된 학생이 존재하지 않습니다.");

				} else {
					for (int i = 0; i < studentArray.length; i++) {
						Student s = studentArray[i];
						if (s != null) {
							System.out.printf("번호 : %3d, 이름 : %s\n", s.getId(), s.getName());
							System.out.printf("국어 : %3d, 영어 : %3d, 수학 : %3d\n", s.getKorean(), s.getEnglish(),
									s.getMath());
							System.out.printf("총합 : %3d, 평균 : %.2f\n\n", s.calculateSum(), s.calculateAverage());
						}
					}

				}

			} else if (num == 3) {
				System.out.println("사용해주셔서 감사합니다");
				break;
			}
		}

		scanner.close();
	}
}
