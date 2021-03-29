package f_game.game;

public class Shop {
	
	Items[] shopItems = new Items[10];
	Shop() {
		shopItems[0] = new Items("저급 사료", "배고픔이 2 회복됩니다.", 2, 0, 0, 1, 0);
		shopItems[1] = new Items("고급 사료", "배고픔이 4 회복됩니다.", 5, 0, 0, 3, 0);
		shopItems[2] = new Items("말린 두부", "배고픔이 1, 행운이 2 증가합니다.", 5, 2, 0, 0, 0);
		shopItems[3] = new Items("건조된 딸기", "배고픔이 1, 행운이 2 증가합니다.", 5, 2, 0, 0, 0);
		shopItems[4] = new Items("저급 샴푸", "청결이 2 회복됩니다.", 2, 0, 0, 0, 1);
		shopItems[5] = new Items("고급 샴푸", "청결이 4 회복됩니다.", 5, 0, 0, 0, 2);	
		shopItems[6] = new Items("저급 모래", "청결이 2 회복됩니다.", 2, 0, 0, 0, 1);
		shopItems[7] = new Items("고급 모래", "청결이 4 회복됩니다.", 5, 0, 0, 0, 2);		
		shopItems[8] = new Items("나무 막대기", "재미가 1 증가합니다.", 4, 0, 1, 0, 0);
		shopItems[9] = new Items("향기 나는 인형", "재미가 1 증가합니다.", 4, 0, 1, 0, 0);
	}
	
	void food() {
		shopItems[0].showItemsInfo();
		shopItems[1].showItemsInfo();
	}
	
	void snack() {
		shopItems[2].showItemsInfo();
		shopItems[3].showItemsInfo();
	}
	
	void shampoo() {
		shopItems[4].showItemsInfo();
		shopItems[5].showItemsInfo();
	}
	
	void sand() {
		shopItems[6].showItemsInfo();
		shopItems[7].showItemsInfo();
	}
	
	void toy() {
		shopItems[8].showItemsInfo();
		shopItems[9].showItemsInfo();
	}
		
	void sell(Pet pet, int num) {		//이름으로 비교해야 할 수도
		if(shopItems[num].price <= pet.gold) {
			System.out.println(shopItems[num].name + "을(를) 구매했습니다.");
			pet.gold -= shopItems[num].price;
			for(int i=0 ; i<pet.petItems.length ; i++) {
				if(pet.petItems[i] == null) {
					pet.petItems[i] = shopItems[num];
					break;
				}
			}
		}
		else 
			System.out.println("골드가 부족합니다.");
	}
}
