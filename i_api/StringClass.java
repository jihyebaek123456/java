package i_api;

import java.util.Arrays;

public class StringClass {
	public static void main(String[] args) {
				
		boolean equals = "문자열".equals("문자열");
		System.out.println(equals);
		
		String str1 = "문자열";
		String str2 = null;
		System.out.println(str1.equals(str2));
//		System.out.println(str2.equals(str1));
		System.out.println();
		
		String str = "12345";
		for(int i=0 ; i<str.length() ; i++) {
			char charAt = str.charAt(i);
			System.out.print(charAt);
		}
		System.out.println('\n');
		
		for(int i=str.length()-1 ; i>=0 ; i--) {
			char charAt = str.charAt(i);
			System.out.print(charAt);
		}
		System.out.println('\n');
		
		String rev = "";
		for(int i=str.length()-1 ; i>=0 ; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
		System.out.println();
		
		str = "0123456789";
		String sub1 = str.substring(3);
		String sub2 = str.substring(5, 8);
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println();

		str = "수박 오렌지 귤 블루베리";
		int idx = str.indexOf("귤");
		System.out.println(idx);
		System.out.println();
		
		//subString + indexOf는 자주 사용하는 경우가 多
		//indexOf로 찾고 substring으로 자르기!
		
		String[] menu = {
				"수박 20000원",
				"오렌지 10000원",
				"귤 500원",
				"블루베리 3000원"};
		
		for(int i=0 ; i<menu.length ; i++) {
			String name = menu[i].substring(0, menu[i].indexOf(" "));
			System.out.print(name + " ");
			
			//가격 잘라서 int 변수에 저장
			int price = Integer.parseInt(menu[i].substring(menu[i].indexOf(" ") + 1, menu[i].indexOf("원")));
			System.out.println(price);
		}
		System.out.println();
		
		str = "abcd";
		boolean contains = str.contains("c");
		System.out.println(contains);
		System.out.println();
		
		for(int i=0 ; i<menu.length ; i++) {
			if(menu[i].contains("오렌지")) {
				System.out.println("오렌지는 " + i + "번 인덱스에 있습니다.");
			}
		}
		System.out.println();
		
		str = "a/b/c";
		String[] split = str.split("/");
		System.out.println(Arrays.toString(split));
		System.out.println();
		
		for(int i=0 ; i<menu.length ; i++) {
			String[] split2 = menu[i].split(" ");
			System.out.println("메뉴 명: " + split2[0] + " , 가격: " + split2[1]);
		}
		System.out.println();
		
		str = " 문자열  ";
		String trim = str.trim();
		System.out.println("[" + str + "] -> [" + trim + "]");
		System.out.println();
		
		String id = " myid";
		String password = "mypassword ";
		System.out.println(id);
		System.out.println(password);
		System.out.println(id.trim());
		System.out.println(password.trim());
		System.out.println();
		
		//두 가지 방법!
		int number = 10;
		str = String.valueOf(number);
		str = number + "";
		
	}
}