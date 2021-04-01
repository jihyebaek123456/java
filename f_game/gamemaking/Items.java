package f_game.gamemaking;

public class Items {
	
	String name;
	String effect;
	int price;
	int hunger;
	int clean;
	int fun;
	
	Items(String name, String effect, int price, int hunger, int clean, int fun) {
		this.name = name;
		this.effect = effect;
		this.price = price;
		this.hunger = hunger;
		this.clean = clean;
		this.fun = fun;
	}
	
	String showItemsInfo() {
		return "[" + name + "] " + effect + "(" + price +"G)";
	}
	
}
