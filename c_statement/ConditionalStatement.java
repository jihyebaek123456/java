package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		//if문
		
		int a = 1;
		
		if (a == 1) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}

		if (a == 0) {
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}
		
		//가장 처음에 조건을 만족하면 밑(else if)의 조건을 만족해도 이미 if문을 빠져나간 상태라 실행 안 됨
		if (a == 1) {
			System.out.println("a가 1인 경우에 하고 싶은 것");
		} else if (a == 2) {
			System.out.println("a가 2인 경우에 하고 싶은 것");
		} else if (a == 3) {
			System.out.println("a가 3인 경우에 하고 싶은 것");
		} else {
			System.out.println("이외의 경우에 하고 싶은 것");
		}
		
		//실수 주의 if - else if로 이루어져야 함
		//밑의 예시는 각각의 if문 (if문 2개)
		if (a < 10) {
			System.out.println("a가 10보다 작다.");
		}
		if (a < 20) {
			System.out.println("a가 20보다 작다.");
			System.out.println();
		}
		
		//문제1
		int score = 70;
		if (score >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		System.out.println();
		
		//문제2 - 점수에 등급 부여
		score = 65;
		String grade = null;
		
		if (score >= 90)
			grade = "A";
		else if (score >= 80) // (&& score < 90) 필요 X
			grade = "B";
		else if (score >= 70)
			grade = "C";
		else if (score >= 60)
			grade = "D";
		else
			grade = "F";
		
		System.out.println("점수: " + score + ", 등급: " + grade);
		System.out.println();
		
		//문제2 응용
		score = 92;
		grade = null;
		
		if (score >= 90) {
			grade = "A";
			if (score >= 97)
				grade += "+";
			else if (score <= 93)
				grade += "-";
		} else if (score >= 80) {
			grade = "B";
			if (score >= 87)
				grade += "+";
			else if (score <= 83)
				grade += "-";
		} else if (score >= 70) {
			grade = "C";
			if (score >= 77)
				grade += "+";
			else if (score <= 73)
				grade += "-";
		} else if (score >= 60) {
			grade = "D";
			if (score >= 67)
				grade += "+";
			else if (score <= 63)
				grade += "-";
		} else {
			grade = "F";
		}
		
		System.out.println("점수: " + score + ", 등급: " + grade);
		System.out.println();
		
		
		//switch문1
		a = 10;
		
		switch(a) {  //break가 없으면 빠져나오지 않고 계속 실행됨
		case 10:
			System.out.println("a가 10인 경우에 하고 싶은 것");
			break;
		case 20:
			System.out.println("a가 20인 경우에 하고 싶은 것");
			break;			
		default:
			System.out.println("이외의 경우에 하고 싶은 것");
		}
		
		System.out.println();
		
		//switch문2
		String b = "a";
		
		switch(b) {  //break가 없으면 빠져나오지 않고 계속 실행됨
		case "a":
			System.out.println("b가 \"a\"인 경우에 하고 싶은 것");  //이스케이프 시퀀스 : \", \'
			break;
		case "b":
			System.out.println("b가 \"b\"인 경우에 하고 싶은 것");
			break;			
		default:
			System.out.println("이외의 경우에 하고 싶은 것");
		}
		
		System.out.println();
		
		//문제1
		int month = 10;
		String season = null;
		
		switch(month) {
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		case 12: case 1: case 2:
			season = "겨울";
			break;
		default:
			System.out.println("숫자 확인");
		}
		
		System.out.println(month + "월은 " + season + "입니다.");
		System.out.println();
		
		//문제2
		score = 100;
		grade = null;
		
		switch(score/10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		
		System.out.println("점수: " + score + ", 등급: " + grade);
		System.out.println();
		
		//문제3 - 숫자를 입력받아 그 숫자가 0인지 아닌지 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력> ");
		int num1 = Integer.parseInt(sc.nextLine());
		
		if (num1 == 0)
			System.out.println("입력한 숫자는 \'0\'입니다.");
		else
			System.out.println("입력한 숫자는 \'0\'이 아닙니다.");
		
		//문제4 - 숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력
		
		if ((num1%2) == 1)
			System.out.println(num1 + "은(는) 홀수입니다.");
		else
			System.out.println(num1 + "은(는) 짝수입니다.");
		
		System.out.println();
		
		//문제5 - 점수 3개를 입력받아 총점, 평균, 등급 출력
		
		grade = null;
		
		System.out.print("첫 번째 점수 입력> ");
		int score1 = Integer.parseInt(sc.nextLine());
		System.out.print("두 번째 점수 입력> ");
		int score2 = Integer.parseInt(sc.nextLine());
		System.out.print("세 번째 점수 입력> ");
		int score3 = Integer.parseInt(sc.nextLine());
		
		int sum = score1 + score2 + score3;
		double avg = Math.round(sum / 3.0 * 10) / 10.0;
		
		if(avg >= 90) {
			grade = "A";
			if (avg >= 97)
				grade += "+";
			else if (avg <= 93)
				grade += "-";
		} else if(avg >= 80) {
			grade = "B";
			if (avg >= 87)
				grade += "+";
			else if (avg <= 83)
				grade += "-";
		} else if(avg >= 70) {
			grade = "C";
			if (avg >= 77)
				grade += "+";
			else if (avg <= 73)
				grade += "-";
		} else if(avg >= 60) {
			grade = "D";
			if (avg >= 67)
				grade += "+";
			else if (avg <= 63)
				grade += "-";
		} else
			grade = "F";
		
		System.out.println();
		System.out.println("총점: " + sum + ", 평균: " + avg + ", 등급: " + grade);
		
		//문제6 - 1~100 사이 랜덤한 수를 3개 발생시키고 오름차순으로 출력
		int nu1 = (int)(Math.random()*100)+1 ;
		int nu2 = (int)(Math.random()*100)+1 ;
		int nu3 = (int)(Math.random()*100)+1 ;
		
		System.out.println("세 가지 수 : " + nu1 + ", " + nu2 + ", " + nu3);
		System.out.print("오름차순 정렬 : ");
		
		if(nu1 >= nu2 && nu1 >= nu3) {
			if(nu2 >= nu3)
				System.out.print(nu3 + ", " + nu2);
			else
				System.out.print(nu2 + ", " + nu3);
			System.out.print(", " + nu1);
		}
		else if(nu1 >= nu2 && nu1 <= nu3) {
			System.out.print(nu2 + ", " + nu1 + ", " + nu3);
		}
		else if(nu1 <= nu2 && nu1 >= nu3) {
			System.out.print(nu3 + ", " + nu1 + ", " + nu2);
		}
		else if(nu1 <= nu2 && nu1 <= nu3) {
			System.out.print(nu1);
			if(nu2 >= nu3)
				System.out.print(", " + nu3 + ", " + nu2);
			else
				System.out.print(", " + nu2 + ", " + nu3);
			
		}
		
		System.out.println();
		
		//문제6 - 제일 작은 값을 nu1, 그 다음 값을 nu2, 제일 큰 값을 nu3에 저장
		if(nu1 > nu2) {
			int t = nu1;
			nu1 = nu2;
			nu2 = nu3;
		}
		if(nu1 > nu3) {
			int t = nu1;
			nu1 = nu3;
			nu3 = t;
		}
		if(nu2 > nu3) {
			int t = nu2;
			nu2 = nu3;
			nu3 = t;
		}
		
		System.out.println("오름차순 정렬 : " + nu1 + ", " + nu2 + ", " + nu3);		
		
	}
}
