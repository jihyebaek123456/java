package b_operator;
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		//두 개의 숫자와 연산자(사칙연산)를 입력받아 연산 결과를 알려주는 프로그램
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력> ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("첫 번째 숫자 입력> ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("연산자 입력> ");
		String str = sc.nextLine();
		
		//계산
		int result = str.equals("+") ? num1 + num2 :
					(str.equals("-") ? num1 - num2 :
					(str.equals("*") ? num1 * num2 :
					(str.equals("/") ? num1 / num2 :
					(str.equals("%") ? num1 % num2 : 0))));

		//출력
		System.out.println();
		System.out.println("계산 결과: " + num1 + " " + str + " " + num2 + " = " + result);

	}
}
