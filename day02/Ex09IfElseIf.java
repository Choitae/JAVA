package day02;
// if-else���������� �츮�� ���ǽ��� �������� �־� ���� ���� true�� ������ �ϳ��� �ڵ� ���� �����ϰ� �ȴ�.
// ���� ���� �������� else�� �����ٸ� ���� ������ ��� false�� �� �ش� else �ڵ� ���� ����ǰ� �ȴ�.
// else if�� ��� if�� �ٱ� ������ �ݵ�� ���ǹ��� ()�� ��ܼ� ���� �Ѿ�;� �Ѵ�.

// if(���ǽ� 1){

// }else if(���ǽ�2){

// }else {

// }
public class Ex09IfElseIf {
	public static void main(String[] args) {
		int age = 11;
		if (age <= 5) {
			System.out.println("�����Դϴ�.");
		} else if(age <= 13) {
			System.out.println("����Դϴ�");
		} else if(age < 18) {
			System.out.println("û�ҳ��Դϴ�");
		} else {
			System.out.println("�����Դϴ�");
		}
		
		
		
	}

}
