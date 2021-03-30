package g_oop2;

class Product {
	String name;
	int price;
	
	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	String getInfo() {
		return name + "(" + price + "원)";
	}
}
