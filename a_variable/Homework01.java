package a_variable;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=========회원가입=========");
		System.out.print("아이디>");
		String myID = sc.nextLine();
		System.out.print("비밀번호(4자리 숫자)>");
		int myPW = Integer.parseInt(sc.nextLine());
		System.out.print("이름>");
		String myName = sc.nextLine();
		System.out.print("나이>");
		int myAge = Integer.parseInt(sc.nextLine());
		System.out.print("키>");
		double myHeight = Double.parseDouble(sc.nextLine());
		System.out.println("=======================");
		System.out.println();
		System.out.println("회원가입 완료!");
		System.out.println();
		System.out.println("=========내 정보==========");
		System.out.println("아이디 : " + myID);
		System.out.println("비밀번호 : " + myPW);
		System.out.println("이름 : " + myName);
		System.out.println("나이 : " + myAge);
		System.out.println("키 : " + myHeight + "cm");
		System.out.println("=======================");
	}
}
