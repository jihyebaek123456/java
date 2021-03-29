package e_oop;

public class UseATM {
	public static void main(String[] args) {
		ATM[] user = new ATM[4];
		user[0] = new ATM("BAEK", "999999-999999", 1234); 
		user[1] = new ATM("PARK", "888888-888888", 5678); 
		user[2] = new ATM("KIM", "777777-777777", 9012); 
		user[3] = new ATM("LEE", "666666-666666", 2468);  
		
		while(true) {
			System.out.println("---------------------------");
			System.out.println("1. 입금\t2. 출금");
			System.out.println("3. 이체\t4. 잔액 확인");
			System.out.println("\t0. 종료");
			System.out.println("---------------------------");
			System.out.print("번호 입력 > ");
			int input = ScanUtil.nextInt();
			
			switch(input) {
			
			case 1:
				System.out.print("입금할 금액을 입력하세요 > ");
				int money = ScanUtil.nextInt();
				user[0].addMoney(money);
				break;
			case 2:
				System.out.print("출금할 금액을 입력하세요 > ");
				money = ScanUtil.nextInt();
				user[0].subMoney(money);	
				break;
			case 3:
				System.out.print("받는 사람의 계좌를 입력하세요 > ");
				String account = ScanUtil.nextLine(); 
				ATM temp = null;
				for(int i=0 ; i<user.length ; i++) {
					if(account.equals(user[i].account))
						temp = user[i];
				}
				System.out.print("보낼 금액을 입력하세요 > ");
				money = ScanUtil.nextInt();
				user[0].giveMoney(temp, money);
				
				break;
			case 4:
				money = user[0].showMoney();								
				System.out.println("남은 잔액은 " + money + "원 입니다.");
				break;
			
			default:
				System.out.println("종료");
				System.exit(0);
				break;
			}
		}
	}
}

class ATM {
	String name;
	String account;
	int money = 0;
	int PW;
	
	//생성자
	public ATM(String name, String account, int PW) {
		this.name = name;
		this.account = account;
		this.PW = PW;
	}
	
	//입금
	public void addMoney(int mn) {
		System.out.print(mn + "원을 입금합니다. (O/X) > ");
		String ans = ScanUtil.nextLine();		
		if(ans.equals("O")) {
			boolean check = checkPW();
			if(check) {
				money += mn;
				System.out.println(mn + "원 입금 완료");
			}
			else
				System.out.println("잘못된 비밀번호 입니다.");
		}
		else
			System.out.println("취소하셨습니다.");
	}
	
	//출금
	public void subMoney(int mn) {
		if(money >= mn) {
			System.out.print(mn + "원을 출금합니다. (O/X) > ");
			String ans = ScanUtil.nextLine();		
			if(ans.equals("O")) {
				boolean check = checkPW();
				if(check) {
					money -= mn;
					System.out.println(mn + "원 출금 완료");
				}
				else
					System.out.println("잘못된 비밀번호 입니다.");
			}
			else
				System.out.println("취소하셨습니다.");
		}
		else
			System.out.println("소지한 금액이 입력한 금액보다 적습니다.");
	}	
	
	//이체
	public void giveMoney(ATM atm, int mn) {
		System.out.print(atm.name + "님께 " + mn + "원을 보내겠습니까? (O/X) > ");
		String ans = ScanUtil.nextLine();
		if(ans.equals("O")) {
			if(money >= mn) {
				boolean check = checkPW();
				if(check) {
					money -= mn;
					atm.money += mn;
					System.out.println(atm.name + "님께 " + mn + "원을 보냈습니다.");
				}
				else
					System.out.println("잘못된 비밀번호 입니다.");
			}
			else
				System.out.println("소지한 금액이 입력한 금액보다 적습니다.");				
		}
		else
			System.out.println("취소하셨습니다.");
	}
	
	//잔액 확인
	public int showMoney() {
		return money;
	}
	
	//비밀번호 확인
	public boolean checkPW() {
		System.out.print("비밀번호 입력 > ");
		int PW = ScanUtil.nextInt();
		if(this.PW == PW)
			return true;
		else
			return false;
	}
}