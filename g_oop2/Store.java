package g_oop2;

public class Store {

	public static void main(String[] args) {
		Desktop d1 = new Desktop("삼성 컴퓨터", 1000000);
		Desktop d2 = new Desktop("LG 컴퓨터", 1000000);
	
		AirCon ac1 = new AirCon("삼성 에어컨", 2000000);
		AirCon ac2 = new AirCon("LG 에어컨", 2000000);
		
		TV tv1 = new TV("삼성 TV", 3000000);
		TV tv2 = new TV("LG TV", 3000000);
		
		Customer c = new Customer();
		
		System.out.println(d1.getInfo());
		System.out.println(d2.getInfo());
		c.buy(d2);

		System.out.println(ac1.getInfo());
		System.out.println(ac2.getInfo());
		c.buy(ac1);

		System.out.println(tv1.getInfo());
		System.out.println(tv2.getInfo());
		c.buy(tv1);
		
		System.out.println(c.money);
		
		
		
	}
}