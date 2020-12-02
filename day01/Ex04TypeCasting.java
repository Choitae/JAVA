package day01;

public class Ex04TypeCasting {
	public static void main(String[] args) {
	  int myInt = 30;
  	  byte myByte = 20;
	  System.out.println("myInt의 현재값 : "+myInt);
	  System.out.println("myByte의 현재값 : "+myByte);
	//임시적 형변환
	  System.out.println("byte의 값을 int로 바꾸는 임시적 형변환");
	  myInt = myByte ;
	  System.out.println("myInt의 현재값 : "+myInt);
	  System.out.println("myByte의 현재값 : "+myByte);
	  
	//명시적 형변환
	  System.out.println("int의 값을 byte로 바꾸는 임시적 형변환");
	  //아래 코드는 더 작은 데이터 타입인 myByte에 더 큰 데이터타입의
	  // 현재값을 넣으려 했기 때문에 발생한 에러.
	  // myByte = myInt;
	  //명시적 형변환을 하는 방법
	  // 변수 = (바꿀 타입)값;
	  myByte = (byte)myInt;
	  System.out.println("myInt의 현재값 : "+myInt);
	  System.out.println("myByte의 현재값 : "+myByte);
      myByte = (byte)127; //byte의 최대값
      System.out.println("overflow 발생 전의 byte의 현재값 : " +myByte);

      myByte = (byte)128;
      System.out.println("overflow 발생 후의 byte의 현재값 : " +myByte);
      myByte = (byte)129;
      System.out.println("overflow 발생 후의 byte의 현재값 : " +myByte);
      
      myByte = (byte)-128;
      System.out.println("underflow 발생 전의 byte의 현재값 : " +myByte);

      myByte = (byte)-138;
      System.out.println("underflow 발생 후의 byte의 현재값 : " +myByte);
	}
}
