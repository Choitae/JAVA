package day01;

public class Ex04TypeCasting {
	public static void main(String[] args) {
	  int myInt = 30;
  	  byte myByte = 20;
	  System.out.println("myInt�� ���簪 : "+myInt);
	  System.out.println("myByte�� ���簪 : "+myByte);
	//�ӽ��� ����ȯ
	  System.out.println("byte�� ���� int�� �ٲٴ� �ӽ��� ����ȯ");
	  myInt = myByte ;
	  System.out.println("myInt�� ���簪 : "+myInt);
	  System.out.println("myByte�� ���簪 : "+myByte);
	  
	//����� ����ȯ
	  System.out.println("int�� ���� byte�� �ٲٴ� �ӽ��� ����ȯ");
	  //�Ʒ� �ڵ�� �� ���� ������ Ÿ���� myByte�� �� ū ������Ÿ����
	  // ���簪�� ������ �߱� ������ �߻��� ����.
	  // myByte = myInt;
	  //����� ����ȯ�� �ϴ� ���
	  // ���� = (�ٲ� Ÿ��)��;
	  myByte = (byte)myInt;
	  System.out.println("myInt�� ���簪 : "+myInt);
	  System.out.println("myByte�� ���簪 : "+myByte);
      myByte = (byte)127; //byte�� �ִ밪
      System.out.println("overflow �߻� ���� byte�� ���簪 : " +myByte);

      myByte = (byte)128;
      System.out.println("overflow �߻� ���� byte�� ���簪 : " +myByte);
      myByte = (byte)129;
      System.out.println("overflow �߻� ���� byte�� ���簪 : " +myByte);
      
      myByte = (byte)-128;
      System.out.println("underflow �߻� ���� byte�� ���簪 : " +myByte);

      myByte = (byte)-138;
      System.out.println("underflow �߻� ���� byte�� ���簪 : " +myByte);
	}
}
