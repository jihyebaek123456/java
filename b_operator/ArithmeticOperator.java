
package b_operator;

public class ArithmeticOperator {
	public static void main(String[] args) {
		
		//산술 연산
		int result = 10 + 20 - 30 * 40 / 50 % 60;
		result = 10 / 3;
		System.out.println(result);
		result = 10 % 3;
		System.out.println(result);
		System.out.println();
		
		//복합 연산자
		result += 3;
		result -= 5;
		result *= 2;
		result /= -1;
		
		//증감 연산자
		int i = 0;
		++i;  //전위형 : 변수의 값을 읽어오기 전에 1 증가
		i++;  //후위형 : 변수의 값을 읽어온 후에 1 증가
		--i;
		i--;
		
		System.out.println("++i = " + ++i);
		System.out.println("i++ = " + i++);
		System.out.println();
		
		//연산자 사용 시 주의
		int _int = 10;
		double _double = 3.14;
		double result2 = (double)_int + _double;  //자동형변환 발생
		System.out.println(result2);
		
		//int result3 = _int + _double;  //연산 불가
		int result3 = _int + (int)(_double);  //형변환 명시
		System.out.println(result3);
		
		long _long = 100L;
		_long = _int + _long;
		int result4 = _int + (int)_long;
		System.out.println(result4);
		System.out.println();
		
		byte _byte = 5;
		short _short = 10;
		_int = _byte + _short;  //int보다 작은 타입은 int로 형변환
		
		char _char = 'a';
		char _char2 = 'b';
		_int = _char + _char2;
		System.out.println(_int);
		System.out.println();
		
		//오버플로우, 언더플로우
		byte b = 127;
		b++;
		System.out.println(b);
		b--;
		System.out.println(b);
		System.out.println();
		
		//문제1
		long result5 = 123456 + 654321;
		result5 *= 123456;
		result5 /= 123456;
		result5 -= 654321;
		result5 %= 123456;
		System.out.println(result5);
		System.out.println();
		
		//문제2
		int num1 = 53, num2 = 46, num3 = 97;
		int sum = num1 + num2 + num3;
		double ave = sum/3.0;  //두 수 모두 int -> 하나를 double로
		ave = Math.round(ave * 10.0) / 10.0;  //반올림 메소드 (+ 실수형)
		System.out.println("합: " + sum + ", 평균: " + ave);
		
		//랜덤한 값 발생
		int random = (int)(Math.random() * 100) + 1;
		System.out.println(random);
	}
}
