package b_operator;
public class LogicalOperator {

	public static void main(String[] args) {
		//연산3
		
		//논리 연산
		int x = 10;
		int y = 20;
		boolean b = 0 < x && x < 10 || x < y;
		System.out.println(b);
		System.out.println();
		
		b = !(x < y);
		System.out.println(b);
		System.out.println();
		
		int a = 10;
		b = a < 5 && 0 < a++;  //false이므로 b의 값을 결정 후 a++ 실행  X
		System.out.println(a);
		
		b = a > 0 || 0 < a++;
		System.out.println(a);
		System.out.println();
		
		//문제1
		b = (x > y) && (x < 10);
		b = (x % 2 == 0) && (x <= y);
		b = (x % 3 == 0) || (x % 5 == 0);
	}
}
