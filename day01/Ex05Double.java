package day01;

public class Ex05Double {
      public static void main(String[] args) {
    	  double myDouble = 3.141592;
    	  System.out.println("myDouble의 현재값 : "+myDouble);
    	  //아래 값은 double의 값을 더 작은 데이터 타입인 float에 할당하기 떄문에 오류 발생
    	  //1. 명시적 형변환
    	  //float myFloat = (float)3.141592;
    	  //2. 실수값이 float형태임을 보임
    	  float myFloat = 3.141592f;
    	  System.out.println("myFloat의 현재값 : "+myFloat);
}
}
