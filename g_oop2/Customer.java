package g_oop2;

class Customer {
	
	int money = 1000000000;
	
	Product[] item = new Product[100];
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔돈이 부족합니다.");
			return;
		}
		
		money -= p.price;
		
		for(int i=0 ; i<item.length ; i++) {
			if(item[i] == null) {
				item[i] = p;
				break;
			}
		}
		
		System.out.println(p.getInfo() + "을(를) 구매했습니다.");
		
	}
	
	
	
}
