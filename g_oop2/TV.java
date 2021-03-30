package g_oop2;

class TV extends Product {
	TV(String name, int price) {
		super(name, price);
	}
	
	void setChannel() {
		System.out.println("채널을 변경합니다.");
	}
}
