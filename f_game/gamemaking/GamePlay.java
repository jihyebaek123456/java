package f_game.gamemaking;

import e_oop.ScanUtil;

public class GamePlay {
	
	Pet pet;
	Shop shop;
	Activity activity;
	int shoppingNum;
	int ItemNum;
	
	public static void main(String[] args) {
		GamePlay game = new GamePlay();
		game.gameStart();
	}
	
	//게임 첫 실행
	GamePlay() {
		System.out.println("\n-----------다마고치 키우기-----------\n");
		System.out.println("\t      캐릭터 이름 설정");
		System.out.println("\t     ʕ•ᴥ•ʔ");
		System.out.println("\n--------------------------------\n");
		System.out.print("캐릭터의 이름을 설정하세요 > ");
		String name = ScanUtil.nextLine();
		pet = new Pet(name);
		System.out.println("\n--------------------------------\n");
		activity = new Activity();
		shop = new Shop();
		shoppingNum = 0;
	}
	
	//게임 실행
	void gameStart() {
		System.out.println("\n-----------다마고치 키우기-----------\n");
		System.out.println("1. 돈 벌기");
		System.out.println("2. " + pet.name + " 돌보기");
		System.out.println("3. 쇼핑 하기");
		System.out.println("\n0. 게임 종료하기");		
		System.out.println("\n--------------------------------\n");
		
		boolean flag = true;

		while(flag) {
			System.out.print("할 일 선택 > ");
			int ans = ScanUtil.nextInt();
			System.out.println("\n--------------------------------\n");
			
			switch(ans) {
			case 1:
				flag = false;
				gameGetMoney();
				break;
			case 2:
				flag = false;
				gameCarePet();
				break;
			case 3:
				flag = false;
				gameShopping();
				break;
			case 0:
				System.out.println("게임을 종료합니다.");
				System.out.println("ʕ•ᴥ•ʔ . o O (안녕~)");
				System.out.println("\n--------------------------------\n");
				System.exit(0);
				break;
			default:
				System.out.println("올바르지 않은 숫자를 입력했습니다.");
				System.out.println("\n--------------------------------\n");
				break;
			}
		}
	}
	
	//1. 돈 벌기
	void gameGetMoney() {
		System.out.println("\n-----------다마고치 키우기-----------\n");
		System.out.println("1. 사냥하기(★☆☆)\t\t소지금 : " + pet.gold + "G");
		System.out.println("2. 광물캐기(★☆☆)\t\tDAY " + pet.day);
		System.out.println("3. 농사하기(★★☆)");
		System.out.println("4. 낚시하기(★★☆)");
		System.out.println("5. 요리하기(★★★)");
		System.out.println("\n0. 돌아가기");		
		System.out.println("\n--------------------------------\n");
		
		boolean flag = true;

		while(flag) {
			System.out.print("할 일 선택 > ");
			int ans = ScanUtil.nextInt();
			System.out.println("\n--------------------------------\n");
			
			switch(ans) {
			case 1:
				flag = false;
				activity.hunting(pet);
				gameGetMoney();
				break;
			case 2:
				flag = false;
				activity.mining(pet);
				gameGetMoney();
				break;
			case 3:
				flag = false;
				activity.farming(pet);
				gameGetMoney();
				break;
			case 4:
				flag = false;
				activity.fishing(pet);
				gameGetMoney();
				break;
			case 5:
				flag = false;
				activity.cooking(pet);
				gameGetMoney();
				break;
			case 0:
				flag = false;
				gameStart();
				break;
			default:
				System.out.println("올바르지 않은 숫자를 입력했습니다.");
				System.out.println("\n--------------------------------\n");
				break;
			}
		}
	}
	
	//2. 캐릭터 돌보기
	void gameCarePet() {
		System.out.println("\n-----------다마고치 키우기-----------\n");
		pet.showPet();
		System.out.println("1. 밥 주기\t\t소지금 : " + pet.gold + "G");
		System.out.println("2. 간식 주기\t\tDAY " + pet.day);
		System.out.println("3. 목욕 시키기");
		System.out.println("4. 화장실 치우기");
		System.out.println("5. 놀아주기");
		System.out.println("\n0. 돌아가기");	
		System.out.println("\n--------------------------------\n");

		boolean flag = true;

		while(flag) {
			System.out.print("할 일 선택 > ");
			int ans = ScanUtil.nextInt();
			System.out.println("\n--------------------------------\n");
			
			switch(ans) {
			case 1:
				flag = false;
				ItemNum = 1;
				gameItemList(ItemNum);
				break;
			case 2:
				flag = false;
				ItemNum = 2;
				gameItemList(ItemNum);
				break;
			case 3:
				flag = false;
				ItemNum = 3;
				gameItemList(ItemNum);
				break;
			case 4:
				flag = false;
				ItemNum = 4;
				gameItemList(ItemNum);
				break;
			case 5:
				flag = false;
				ItemNum = 5;
				gameItemList(ItemNum);
				break;
			case 0:
				flag = false;
				gameStart();
				break;
			default:
				System.out.println("올바르지 않은 숫자를 입력했습니다.");
				System.out.println("\n--------------------------------\n");
				break;
			}
		}
	}
	
	//2-1. 아이템 목록
	void gameItemList(int ItemNum) {
		pet.petItemListUp();
		if(ItemNum == 1) {pet.showPetFoodItem();}
		if(ItemNum == 2) {pet.showPetSnackItem();}
		if(ItemNum == 3) {pet.showPetShampooItem();}
		if(ItemNum == 4) {pet.showPetSandItem();}
		if(ItemNum == 5) {pet.showPetToyItem();}		
		pet.petItemListDown();
		
		boolean flag = true;

		while(flag) {
			System.out.print("사용할 아이템 선택 > ");
			int ans = ScanUtil.nextInt();
			System.out.println("\n--------------------------------\n");
			
			if(ans == 0) {
				flag = false;
				gameCarePet();
			}
			else if(pet.num != 0 && ans >= 1 && ans <= pet.num) {
				flag = false;
				pet.usePetItem(ans - 1);
				gameCarePet();
			}
			else {
				System.out.println("올바르지 않은 숫자를 입력했습니다.");
				System.out.println("\n--------------------------------\n");
			}
		}
	}
	
	//3. 쇼핑
	void gameShopping() {
		System.out.println("\n-----------다마고치 키우기-----------\n");
		System.out.println("1. 사료 구매\t\t소지금 : " + pet.gold + "G");
		System.out.println("2. 간식 구매\t\tDAY " + pet.day);
		System.out.println("3. 샴푸 구매");
		System.out.println("4. 화장실 모래 구매");
		System.out.println("5. 장난감 구매");
		System.out.println("\n0. 돌아가기");		
		System.out.println("\n--------------------------------\n");
		
		boolean flag = true;

		while(flag) {
			System.out.print("할 일 선택 > ");
			int ans = ScanUtil.nextInt();
			System.out.println("\n--------------------------------\n");
			
			switch(ans) {
			case 1:
				flag = false;
				shoppingNum = 1;
				gameShoppingList(shoppingNum);
				break;
			case 2:
				flag = false;
				shoppingNum = 2;
				gameShoppingList(shoppingNum);
				break;
			case 3:
				flag = false;
				shoppingNum = 3;
				gameShoppingList(shoppingNum);
				break;
			case 4:
				flag = false;
				shoppingNum = 4;
				gameShoppingList(shoppingNum);
				break;
			case 5:
				flag = false;
				shoppingNum = 5;
				gameShoppingList(shoppingNum);
				break;
			case 0:
				flag = false;
				gameStart();
				break;
			default:
				System.out.println("올바르지 않은 숫자를 입력했습니다.");
				System.out.println("\n--------------------------------\n");
				break;
			}
		}
	}
	
	//3-1. 쇼핑 리스트
	void gameShoppingList(int shoppingNum) {
		shop.shopItemListUp();
		if(shoppingNum == 1) {shop.shopFood();}
		if(shoppingNum == 2) {shop.shopSnack();}
		if(shoppingNum == 3) {shop.shopShampoo();}
		if(shoppingNum == 4) {shop.shopSand();}
		if(shoppingNum == 5) {shop.shopToy();}		
		shop.shopItemListDown(pet);
		
		boolean flag = true;

		while(flag) {
			System.out.print("구매 할 아이템 선택 > ");
			int ans = ScanUtil.nextInt();
			System.out.println("\n--------------------------------\n");
			
			switch(ans) {
			case 1:
				flag = false;
				shop.sell(pet, shoppingNum * 2 - 2);
				gameShopping();
				break;
			case 2:
				flag = false;
				shop.sell(pet, shoppingNum * 2 - 1);
				gameShopping();
				break;
			case 0:
				flag = false;
				gameShopping();
				break;
			default:
				System.out.println("올바르지 않은 숫자를 입력했습니다.");
				System.out.println("\n--------------------------------\n");
				break;
			}
		}
	}
	
}