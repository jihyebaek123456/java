package e_oop;
	
public class ClassMaker {
	
	//전역변수 하나 선언 및 초기화
	String str = "Hi~";
	
	//리턴 타입과 파라미터가 없는 메소드
	void printVar () {
		System.out.println(str);
	}
	
	//전역 변수와 동일한 타입의 리턴 타입이 있고, 파라미터는 없는 메소드
	String returnVar () {
		return str;
	}
	
	//리턴 타입은 없고, 파라미터가 있는 메소드
	void printMessage (String message) {
		System.out.println(message);
	}
	
	//int 타입의 리턴 타입과 int 타입의 파라미터 두 개가 있는 메소드
	int calculate (int num1, int num2) {
		return num1 * num2;
	}
	
	
}	
