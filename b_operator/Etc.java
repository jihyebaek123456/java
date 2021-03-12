package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		//연산4
		
		//비트 연산
		System.out.println(10 | 15);  //or!
		
		//상황 연산자
		int x = 10, y = 20;
		int result = x < y ? x : y;  //int result = x;
		System.out.println(result);
		
		//주민등록변호 뒷자리 첫 번째 숫자가 1이면 남자 2면 여자
		int regNo = 3;
		String gender = regNo == 1 ? "남자" : "여자";
		gender = (regNo == 1 ? "남자" : (regNo == 2 ? "여자" : "확인불가"));  //중첩 가능   
		System.out.println("당신의 성별은 " + gender + " 입니다.");
		System.out.println();
		
		//문제1
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 > ");
		double a = Double.parseDouble(sc.nextLine());
		System.out.print("두 번째 숫자 입력 > ");
		double b = Double.parseDouble(sc.nextLine());
		double maxNum = (a > b ? a : b);
		System.out.println("더 큰 숫자는 " + maxNum + " 입니다.");
		System.out.println();
		
		//문제2
		System.out.print("성별 식별을 위한 숫자 입력 > ");
		int num = Integer.parseInt(sc.nextLine());
		gender = ((num == 1) || (num == 3) ? "남자" : ((num == 2) || (num == 4) ? "여자" : "확인불가"));
		System.out.println("당신의 성별은 " + gender + " 입니다.");
	}
}
