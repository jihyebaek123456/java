package c_statement;
import java.util.Scanner;
public class Baseball {
	public static void main(String[] args) {
		//숫자야구 : 중복되지 않는 세 자리 수를 맞추는 게임
		//스트라이크(S) : 숫자도 자릿수도 맞을 때  / 볼(B) : 숫자는 맞지만 자릿수가 안 맞을 때  / 아웃(O) : 숫자도 자릿수도 안 맞을 때
		
		//숫자 뽑기
		int num1, num2, num3, ans1, ans2, ans3, strike, ball, out;
		do {
			num1 = (int)(Math.random() * 9) + 1;
			num2 = (int)(Math.random() * 9) + 1;
			num3 = (int)(Math.random() * 9) + 1;
		} while(num1 == num2 || num1==num3 || num2==num3);
		System.out.println("숫자 뽑기 완료" + '\n');
		
		//입력 및 값 비교
		Scanner sc = new Scanner(System.in);
		do {
			//하나씩 입력하지 않고 세 자리 숫자를 한 번에 입력해서 분석할 수 있는 방법?
			System.out.print("첫 번째 숫자 입력> ");
			ans1 = Integer.parseInt(sc.nextLine());
			System.out.print("두 번째 숫자 입력> ");
			ans2 = Integer.parseInt(sc.nextLine());
			System.out.print("세 번째 숫자 입력> ");
			ans3 = Integer.parseInt(sc.nextLine());
			System.out.println();
			
			strike=0;
			ball=0;
			out=0;
			
			if(ans1 == num1) { strike++; }
			else if(ans1 == num2) { ball++; }
			else if(ans1 == num3) { ball++; }
			else { out++; }
			if(ans2 == num2) { strike++; }
			else if(ans2 == num1) { ball++; }
			else if(ans2 == num3) { ball++; }
			else { out++; }
			if(ans3 == num3) { strike++; }
			else if(ans3 == num2) { ball++; }
			else if(ans3 == num1) { ball++; }
			else { out++; }
			
			System.out.println("입력한 숫자: " + ans1 + "" + ans2 + "" + ans3 + ", 결과: " + strike + "S " + ball + "B " + out + "O" + '\n');
			
		} while(num1 != ans1 || num2 != ans2 || num3 != ans3);
		
		System.out.println("뽑은 숫자: " + num1 + "" + num2 + "" + num3);
	}
}