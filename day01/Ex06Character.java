package day01;

public class Ex06Character {
    public static void main(String[] args) {
    	//char에 값을 넣을때는 2가지 방법이 가능하다
    	//1.실제 글자를 ''으로 감싸서 넣는 방법
    	char myChar = 'a';
    	System.out.println("myChar의 현재 값 : "+myChar);
    	//2. 코드값을 넣는 방법
    	myChar = 66;
    	System.out.println("myChar의 현재 값 : "+myChar);
    	String myString = new String();
    	myString = "abcdefg";
    	System.out.println("mystring의 현재값 : "+myString);
    }
}
