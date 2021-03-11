package a_variable;
import java.util.Scanner;

public class Variable {  
	public static void main(String[] args) {
		
		//자신의 이름을 저장할 변수 선언
		String myName;
				
		//콘솔창에 이름 입출력
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		myName = sc.nextLine();
		System.out.println("입력한 이름: " + myName + '\n');
		
		//자신의 나이를 저장할 변수 선언
		int myAge;
		
		//콘솔창에 나이 입출력
		System.out.print("나이 입력: ");
		myAge = Integer.parseInt(sc.nextLine());
		System.out.println("입력한 나이: " + myAge);
		
		/*
		
		오늘의 숙제 : 프로그램 작성
		
		========회원가입========
		아이디>admin
		비밀번호(4자리 숫자)>1234
		이름>홍길동
		나이>30
		키>185.5
		======================		(입력받기)
		회원가입 완료!!
		=========내 정보========
		아이디 : admin
		비밀번호 : 1234
		이름 : 홍길동
		나이 : 30
		키 : 185.5cm
		======================		(입력받은 내용 출력)
		
		*/
	}
}
