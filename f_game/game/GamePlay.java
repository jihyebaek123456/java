package f_game.game;

import java.util.Arrays;

public class GamePlay {
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.food();
		
		Pet pet = new Pet("마이펫");
		shop.sell(pet, 8);
		pet.showPet();
		pet.showPetItems();
	}
}
