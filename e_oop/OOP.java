package e_oop;

public class OOP {
	public static void main(String[] args) {
		SampleClass sc = new SampleClass();
		
		System.out.println(sc.field);
		System.out.println(sc.method1(5));
		
		String returnValue = sc.method1(5);
		System.out.println(returnValue);
		
		sc.method2();
		System.out.println();
		
		sc.flowTest1();
		System.out.println();
		
		//무슨 입력 값을 받을지 알 수 없으므로 큰 범위의 자료형 사용
		//메소드 명은 기능을 알 수 있도록
		Calculator ccl = new Calculator();
		double result = ccl.add(123456, 654321);
		result = ccl.multiply(result, 123456);
		result = ccl.divide(result, 123456);
		result = ccl.subtract(result, 654321);
		result = ccl.mod(result, 123456);
		System.out.println("결과 : " + result);
		System.out.println();
		
		
		
	}	
}		
