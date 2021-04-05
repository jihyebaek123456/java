package i_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		
		String str = "abc123";
//		String regex = "abc123";					//abc123
//		String regex = "[a-z]{3}[0-9]{1,3}";		//a-z 문자 3개, 0-9 숫자 1~3개
//		String regex = "[a-z0-9]+";					//a-z, 0-9 문자/숫자가 1개 이상
//		String regex = "\\w*";						//알파벳이나 숫자가 0개 이상
//		String regex = ".*";						//임의의 문자가 0개 이상 - 줄바꿈이 없으면 어떤 문자가 와도 통과
		
		/* 
		 * 아이디, 전화번호, 이메일 주소의 유효성을 검사하는 정규표현식 만들기
		 * 아이디 : 5~20자의 영문 소문자, 숫자와 특수기호(-)(_)
		 * 비밀번호 : 8~16자 영문 대 소문자, 숫자, 특수문자
		 */
		
		String ID = "derstern8";
		String PW = "Hihello9o";
		String phone = "010-1234-5678";
		String mail = "derstern_8@naver.com";
		
		String regex_ID = "[a-z0-9_-]{5,20}";
		String regex_PW = "[A-Za-z0-9]{8,16}";
		String regex_Phone = "^0\\d{1,3}-\\d{3,4}-\\d{4}";
//		String regex_Mail = "[a-z0-9_-]{5,20}@\\w+\\.\\w+";
		String regex_Mail = "[a-z0-9_-]{5,20}@[A-Za-z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))$";
				
		Pattern p = Pattern.compile(regex_ID);
		Matcher m = p.matcher(ID);
		//true - 문자열과 정규 표현식이 일치, false - 불일치
		System.out.println(m.matches());
	}
}
