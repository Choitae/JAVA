package day02;
//switch
//�ϳ��� ������ �����ؼ� �� ������ �� �鿡 ���� �����ڵ带 �츮�� �����ϰ� �ȴ�.
//switch(����){
//  case ��;
//	  ������ �ڵ�;
//	  break;
//	case ��;
//	  ������ �ڵ�;
//	  break;
//	case ��;
//	  ������ �ڵ�;
//	  break;
//  default:
//	  ������ �ڵ�;
// 	  break;
//  break�� ���� ��쿡�� break�� �ִ� �� ���� ���� break�� ���������ų� �ƴϸ� ���ǹ��� �´� case ���� ��� ���ǹ���(case, default) �� �����Ѵ�.
public class Ex15Switch01 {
	public static void main(String[] args) {
		int number = 2;
		switch(number){//int, string�� ���������� double ���� ����� �� ����
		case 1:
			System.out.println("1�Դϴ�");
			break;
		case 2:
			System.out.println("2�Դϴ�");
			break;
		case 3:
			System.out.println("3�Դϴ�");
			break;
		default:
			System.out.println("�� �� �Դϴ�");
			break;
		
		
		
		}
	}

}
