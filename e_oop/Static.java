package e_oop;

public class Static {
	
	static int var;  //클래스 변수 (값을 공유하기 위함)
	
	public static void main(String[] args) {
		Saram s1 = new Saram();
		Saram s2 = new Saram();
		
		s1.name = "철수";
		s2.name = "영희";
		
		s1.saveMoney(100000);
		s2.saveMoney(200000);
		System.out.println();
		
		s1.saveDateMoney(200000);
		s2.saveDateMoney(200000);
		System.out.println();
		
		System.out.print("문자열 입력 > ");
		String str = ScanUtil.nextLine();
		System.out.println(str);

		System.out.print("정수 입력 > ");
		int num1 = ScanUtil.nextInt();
		System.out.println(num1);
		
		System.out.print("실수 입력 > ");
		double num2 = ScanUtil.nextDouble();
		System.out.println(num2);
	}
}


class Saram {
	
	String name;
	int account;
	
	void saveMoney (int money) {
		account += money;
		System.out.println(name + "의 계좌 잔고 : " + account);
	}
	
	static int dateAccount;
	
	void saveDateMoney (int money) {
		dateAccount += money;
		System.out.println("데이트 통장 잔고 : " + dateAccount);
	}
}