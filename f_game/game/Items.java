package f_game.game;

public class Items {
	
	String name;
	String effect;
	int price;
	int luck;
	int fun;
	int hunger;
	int clean;
	
	Items(String name, String effect, int price, int luck, int fun, int hunger, int clean) {
		this.name = name;
		this.effect = effect;
		this.price = price;
		this.luck = luck;
		this.fun = fun;
		this.hunger = hunger;
		this.clean = clean;
	}
	
	void showItemsInfo() {
		System.out.println("[" + name + "] " + effect + "(" + price +"G)");
	}
	
}
