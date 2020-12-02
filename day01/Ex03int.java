package day01;
// 정수형 데이터 타입
// 값을 2진법으로 변환하여 저장.

public class Ex03int {
  public static void main(String[] args) {
	 byte myByte = 10;
	 System.out.println("myByte의 현재값 : "+myByte);
	 myByte = 100;
	 System.out.println("myByte의 현재값 : "+myByte);
	 //byte의 경우 -128 ~ 127의 범위 
	// myByte = 1000;
	// Type mismatch: cannot convert from int to byte
  }
}
