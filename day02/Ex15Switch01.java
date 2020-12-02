package day02;
//switch
//하나의 변수를 선택해서 그 변수의 값 들에 대한 실행코드를 우리가 저장하게 된다.
//switch(변수){
//  case 값;
//	  실행할 코드;
//	  break;
//	case 값;
//	  실행할 코드;
//	  break;
//	case 값;
//	  실행할 코드;
//	  break;
//  default:
//	  실행할 코드;
// 	  break;
//  break가 없을 경우에는 break가 있는 문 까지 가서 break로 빠져나가거나 아니면 조건문에 맞는 case 이후 모든 조건문을(case, default) 다 수행한다.
public class Ex15Switch01 {
	public static void main(String[] args) {
		int number = 2;
		switch(number){//int, string은 가능하지만 double 값은 사용할 수 없다
		case 1:
			System.out.println("1입니다");
			break;
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			break;
		default:
			System.out.println("그 외 입니다");
			break;
		
		
		
		}
	}

}
