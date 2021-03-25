package e_oop;

public class SampleClass {
	
	int field;
	
	String method1 (int parameter) {
		return parameter + "을(를) 받아 명령을 수행하고 결과물을 리턴하는 메소드";
	}
	
	void method2 () {
		System.out.println("파라미터도 리턴 타입도 없는 메소드");
	}
	
	//flowTest1() 호출 시 출력되는 문장에 출력 순서대로 번호 붙이기
	void flowTest1 () {
		System.out.println("flowTest1 시작 : 1");
		flowTest3();
		System.out.println("flowTest1 종료 : 6");
	}
	
	void flowTest2 () {
		System.out.println("flowTest2 시작 : 3");
		System.out.println("flowTest2 종료 : 4");
	}

	void flowTest3 () {
		System.out.println("flowTest3 시작 : 2");
		flowTest2();
		System.out.println("flowTest3 종료 : 5");
	}
	
	
}
