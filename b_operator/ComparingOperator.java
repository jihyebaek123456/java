package b_operator;
public class ComparingOperator {

	public static void main(String[] args) {
		//연산2
		
		//비교 연산
		int x = 10;
		int y = 20;
		
		boolean b = x < y;
		System.out.println(b);
		System.out.println();
		
		b = x <= y - 15;  //산술 연산 -> 비교 연산
		
		String str1 = "abc";
		String str2 = "abc";
		b = str1 == str2;  //문자열 내용 비교 X, 주소(인스턴스) 비교 O
		System.out.println(b);
		System.out.println();
		
		b = str1.equals(str2);  //문자열 내용 비교 (같은지)
		System.out.println(b);
		System.out.println();
		
		b = !str1.equals(str2);  //문자열 내용 비교 (다른지)
		System.out.println(b);
		System.out.println();
		
		//문제1
		x = 10;
		y = 20;
		
		b = x <= y;	
		b = x + 5 == y;		
		b = y % 2 == 1;		
		b = !"기본형".equals("참조형");
		
	}

}
