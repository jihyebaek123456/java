package g_oop2;

class AirCon extends Product {
	AirCon(String name, int price) {
		super(name, price);
	}
	
	void setTemperature() {
		System.out.println("온도를 설정합니다.");
	}
}
