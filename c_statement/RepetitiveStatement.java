package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		
		//for문
		
		for(int i=1 ; i<=10 ; i++) {
			System.out.print(i + "번 반복" + " / ");
			if(i == 10)
				System.out.print(i + "번 반복");
		}
		
		System.out.println('\n');
		
		int sum = 0;
		for(int i=1 ; i<=1000 ; i++) {
			sum += i;
		}
		System.out.println("합계: " + sum);
		
		System.out.println();
		
		sum = 0;
		for(int i=10; i>0 ; i--) {
			sum += i;
		}
		System.out.println("합계: " + sum);
		
		System.out.println();
		
		//문제1 - 1부터 100까지 짝수의 합 출력
		sum = 0;
		for(int i=1 ; i<101 ; i++) {
			if((i%2) == 0) {
				sum += i;
			}
		}
		System.out.println("1부터 100까지 짝수의 합: " + sum);
		
		System.out.println();
		
		//문제1 - 다른 답
		sum = 0;
		for(int i=2 ; i<=100 ; i+=2) {
			sum += i;
		}
		System.out.println("1부터 100까지 짝수의 합: " + sum);
		
		System.out.println();
		
		//문제2 - 1부터 100까지 홀수의 합 출력
		sum = 0;
		for(int i=1 ; i<101 ; i++) {
			if((i%2) == 1) {
				sum += i;
			}
		}
		System.out.println("1부터 100까지 홀수의 합: " + sum);
		
		System.out.println();
		
		//문제2 - 다른 답
		sum = 0;
		for(int i=1 ; i<=100 ; i+=2) {
			sum += i;
		}
		System.out.println("1부터 100까지 홀수의 합: " + sum);
		
		System.out.println();
		
		//구구단 출력 - 2단
		for(int i=1 ; i<=9 ; i++) {
			System.out.println(2 + " × " + i + " = " + 2 * i);
		}
		
		System.out.println();
		
		//구구단 출력 - 6단
		for(int i=1 ; i<=9 ; i++) {
			System.out.println(6 + " × " + i + " = " + 6 * i);
		}
		
		System.out.println();
		
		//문제3 - 구구단 출력
		for(int i=2 ; i<10 ; i++) {
			System.out.println("<" + i + "단" + "> ");
			for(int j=1 ; j<10 ; j++) {
				System.out.println(i + " × " + j + " = " + (j*i) + '\t');
			}
			System.out.println();
		}
		
		//문제4 - 구구단 전체를 가로로 출력
		for(int i=1 ; i<10 ; i++) {
			for(int j=2 ; j<10 ; j++) {
				System.out.print(j + " × " + i + " = " + (j*i) + '\t');
			}
			System.out.println();
		}
		
		System.out.println();
		
		//while문 - a에 2씩 몇 번을 곱해야 1000 이상이 될까?
		int a = 1, count = 0;
		while(a < 1000) {
			a *= 2;
			count++;
			System.out.println(count + " : " + a);
		}
		
		System.out.println();
		
		//do-while문 - 숫자 맞추기 게임
//		int answer = (int)(Math.random()*100) + 1;
//		int input = 0;
//		Scanner s = new Scanner(System.in);
//		do {
//			System.out.print("1부터 100 사이의 숫자 입력> ");
//			input = Integer.parseInt(s.nextLine());
//			if(answer < input)
//				System.out.println(input + "보다 작습니다." + '\n');
//			else if(answer > input)
//				System.out.println(input + "보다 큽니다." + '\n');
//			else
//				System.out.println("정답입니다." + '\n');
//		} while(input != answer);
		
		//이름 붙은 반복문
		outer : for(int i=2 ; i<=9 ; i++) {
			for(int j=1 ; j<=9 ; j++) {
				if(j == 5) {
//					break;
//					break outer;
//					continue;
//					continue outer;
				}
				System.out.println(i + " × " + j + " = " + (i*j));
			}
			System.out.println();
		}
		
		//별찍기1
		for(int i=1 ; i<=3 ; i++) {
			for(int j=1 ; j<=5 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//별찍기2
		for(int i=1 ; i<=5 ; i++) {
			for(int j=1 ; j<=5 ; j++) {
				if(i >= j)
					System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//별찍기3
		for(int i=5 ; i>=1 ; i--) {
			for(int j=5 ; j>=1 ; j--) {
				if(i >= j)
					System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//별찍기4
		for(int i=5 ; i>=1 ; i--) {
			for(int j=1 ; j<=5 ; j++) {
				if(i > j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//별찍기5
		for(int i=1 ; i<=5 ; i++) {
			for(int j=1 ; j<=5 ; j++) {
				if(i <= j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
	}
}
