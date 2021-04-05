package i_api;

import e_oop.ScanUtil;

public class SetComma {
	public static void main(String[] args) {
		
		//숫자를 입력 받아 입력 받은 숫자에 3자리 마다 콤마(,)를 붙여 출력
		//1,234,567

		System.out.print("숫자 입력 > ");
		String str = ScanUtil.nextLine();
		String result = "";
		
		
		while(true) {
			if(str.length() <= 3) {
				result = str + result;
				break;
			} else {
				String temp = "," + str.substring(str.length() - 3, str.length());
				result = temp + result;
				str = str.substring(0, str.length()-3);
			}
		}
		
		System.out.println(result);
		
	}
}
