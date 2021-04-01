package f_game.gamemaking;

public class Shop {
	
	Items[] shopItems = new Items[10];
	Shop() {
		shopItems[0] = new Items("저급 사료", "배고픔이 2 회복됩니다.", 3, 2, 0, 0);
		shopItems[1] = new Items("고급 사료", "배고픔이 5 회복됩니다.", 6, 5, 0, 0);
		shopItems[2] = new Items("말린 두부", "배고픔이 1, 재미가 1 증가합니다.", 4, 1, 0, 1);
		shopItems[3] = new Items("건조된 딸기", "배고픔이 1, 재미가 1 증가합니다.", 4, 1, 0, 1);
		shopItems[4] = new Items("저급 샴푸", "청결이 2 회복됩니다.", 3, 0, 2, 0);
		shopItems[5] = new Items("고급 샴푸", "청결이 5 회복됩니다.", 6, 0, 5, 0);	
		shopItems[6] = new Items("저급 모래", "청결이 2 회복됩니다.", 3, 0, 2, 0);
		shopItems[7] = new Items("고급 모래", "청결이 5 회복됩니다.", 6, 0, 5, 0);		
		shopItems[8] = new Items("나무 막대기", "재미가 2 증가합니다.", 4, 0, 0, 2);
		shopItems[9] = new Items("향기 나는 인형", "재미가 2 증가합니다.", 4, 0, 0, 2);
	}
	
	void shopItemListUp() {
		System.out.println("\n-----------다마고치 키우기-----------\n");
	}
	
	void shopItemListDown(Pet pet) {
		System.out.println();
		System.out.println("소지금 : " + pet.gold + "G");
		System.out.println("\n0. 돌아가기");
		System.out.println("\n--------------------------------\n");
	}
	
	void shopFood() {
		System.out.println("1. " + shopItems[0].showItemsInfo());
		System.out.println("2. " + shopItems[1].showItemsInfo());
	}
	
	void shopSnack() {
		System.out.println("1. " + shopItems[2].showItemsInfo());
		System.out.println("2. " + shopItems[3].showItemsInfo());
	}
	
	void shopShampoo() {
		System.out.println("1. " + shopItems[4].showItemsInfo());
		System.out.println("2. " + shopItems[5].showItemsInfo());
	}
	
	void shopSand() {
		System.out.println("1. " + shopItems[6].showItemsInfo());
		System.out.println("2. " + shopItems[7].showItemsInfo());
	}
	
	void shopToy() {
		System.out.println("1. " + shopItems[8].showItemsInfo());
		System.out.println("2. " + shopItems[9].showItemsInfo());
	}
		
	void sell(Pet pet, int num) {
		if(shopItems[num].price <= pet.gold) {
			System.out.println("\n--------------[구매]--------------\n");
			System.out.println("[" + shopItems[num].name + "]을(를) 구매했습니다.");
			System.out.println("\n--------------------------------\n");
			pet.gold -= shopItems[num].price;
			for(int i=0 ; i<pet.petItems.length ; i++) {
				if(pet.petItems[i] == null) {
					pet.petItems[i] = shopItems[num];
					break;
				}
			}
		}
		else {
			System.out.println("\n--------------[실패]--------------\n");
			System.out.println("골드가 부족합니다.");
			System.out.println("\n--------------------------------\n");
		}
	}
}
