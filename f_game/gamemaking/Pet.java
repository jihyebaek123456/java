package f_game.gamemaking;

import java.util.Arrays;

public class Pet {
	
	String name;
	int hunger;
	int clean;
	int fun;
	int gold;
	int growth;
	int day;
	int dayCount;
	Items[] petItems;
	
	int[] temp;
	int num;
	
	int max;
	final int MAX_GROWTH = 10;
	
	Pet(String name) {
		this.name = name;
		hunger = 5;
		clean = 5;
		fun = 5;
		growth = 0;
		max = 10;
		
		dayCount = 0;
		day = 1;
		gold = 5;
		petItems = new Items[30];
		num = 0;
	}
	
	//상태창
	void showPet() {
		System.out.println("\t         이름 : " + name);
		System.out.println();
		System.out.println("\t      ʕ•ᴥ•ʔ");	
		System.out.println();		
		System.out.println("허기 : " + hunger + " / " + max);
		System.out.println("청결 : " + clean + " / " + max);
		System.out.println("재미 : " + fun + " / " + max);
		System.out.println();				
		System.out.println("성장 : " + growth + " / " + MAX_GROWTH);
		System.out.println();				
		System.out.println("==================================\n");
	}
	
	//소지한 아이템
	void petItemListUp() {
		System.out.println("\n-------------[아이템]-------------\n");
	}
	
	void petItemListDown() {
		System.out.println("\n0. 돌아가기");	
		System.out.println("\n--------------------------------\n");
	}
	
	void showPetFoodItem() {
		num = 0;
		for(int i=0 ; i<petItems.length ; i++) {
			if(petItems[i] == null)
				continue;
			if(petItems[i].name.equals("저급 사료") || petItems[i].name.equals("고급 사료"))
				System.out.println((++num) + ". " + petItems[i].showItemsInfo());
		}
		
		if(num != 0) {
			temp = new int[num];
			int tempNum = 0;
			for(int i=0 ; i<petItems.length ; i++) {
				if(petItems[i] == null)
					continue;
				if(petItems[i].name.equals("저급 사료") || petItems[i].name.equals("고급 사료"))
					temp[tempNum++] = i;
			}
		}
		
		if(num == 0)
			System.out.println("사용할 수 있는 아이템이 없습니다.");
	}
	
	void showPetSnackItem() {
		num = 0;
		for(int i=0 ; i<petItems.length ; i++) {
			if(petItems[i] == null)
				continue;
			if(petItems[i].name.equals("말린 두부") || petItems[i].name.equals("건조된 딸기"))
				System.out.println((++num) + ". " + petItems[i].showItemsInfo());
		}
		
		if(num != 0) {
			temp = new int[num];
			int tempNum = 0;
			for(int i=0 ; i<petItems.length ; i++) {
				if(petItems[i] == null)
					continue;
				if(petItems[i].name.equals("말린 두부") || petItems[i].name.equals("건조된 딸기"))
					temp[tempNum++] = i;
			}
		}
		
		if(num == 0)
			System.out.println("사용할 수 있는 아이템이 없습니다.");
	}
	
	void showPetShampooItem() {
		num = 0;
		for(int i=0 ; i<petItems.length ; i++) {
			if(petItems[i] == null)
				continue;
			if(petItems[i].name.equals("저급 샴푸") || petItems[i].name.equals("고급 샴푸"))
				System.out.println((++num) + ". " + petItems[i].showItemsInfo());
		}
		
		if(num != 0) {
			temp = new int[num];
			int tempNum = 0;
			for(int i=0 ; i<petItems.length ; i++) {
				if(petItems[i] == null)
					continue;
				if(petItems[i].name.equals("저급 샴푸") || petItems[i].name.equals("고급 샴푸"))
					temp[tempNum++] = i;
			}
		}
		
		if(num == 0)
			System.out.println("사용할 수 있는 아이템이 없습니다.");
	}
	
	void showPetSandItem() {
		num = 0;
		for(int i=0 ; i<petItems.length ; i++) {
			if(petItems[i] == null)
				continue;
			if(petItems[i].name.equals("저급 모래") || petItems[i].name.equals("고급 모래"))
				System.out.println((++num) + ". " + petItems[i].showItemsInfo());
		}
		
		if(num != 0) {
			temp = new int[num];
			int tempNum = 0;
			for(int i=0 ; i<petItems.length ; i++) {
				if(petItems[i] == null)
					continue;
				if(petItems[i].name.equals("저급 모래") || petItems[i].name.equals("고급 모래"))
					temp[tempNum++] = i;
			}
		}
		
		if(num == 0)
			System.out.println("사용할 수 있는 아이템이 없습니다.");
	}
	
	void showPetToyItem() {
		num = 0;
		for(int i=0 ; i<petItems.length ; i++) {
			if(petItems[i] == null)
				continue;
			if(petItems[i].name.equals("나무 막대기") || petItems[i].name.equals("향기 나는 인형"))
				System.out.println((++num) + ". " + petItems[i].showItemsInfo());
		}
		
		if(num != 0) {
			temp = new int[num];
			int tempNum = 0;
			for(int i=0 ; i<petItems.length ; i++) {
				if(petItems[i] == null)
					continue;
				if(petItems[i].name.equals("나무 막대기") || petItems[i].name.equals("향기 나는 인형"))
					temp[tempNum++] = i;
			}
		}
		
		if(num == 0)
			System.out.println("사용할 수 있는 아이템이 없습니다.");
	}
	
	//아이템 사용
	void usePetItem(int tempNum) {
		System.out.println("\n-----------[아이템 사용]------------\n");
		System.out.println(petItems[temp[tempNum]].name + "을(를) 사용했습니다.");
		System.out.println("허기가 " + petItems[temp[tempNum]].hunger +
						   ", 청결이 " + petItems[temp[tempNum]].clean +
						   ", 재미가 " + petItems[temp[tempNum]].fun +
							" 증가했습니다.");
		
		hunger += petItems[temp[tempNum]].hunger;
		if(hunger >= max) { 
			hunger = max;
			System.out.println("\n" + name + "의 허기 지수가 모두 채워졌습니다.");
		}
		
		clean += petItems[temp[tempNum]].clean;
		if(clean >= max) {
			clean = max;
			System.out.println("\n" + name + "의 청결 지수가 모두 채워졌습니다.");
		}
		
		fun += petItems[temp[tempNum]].fun;
		if(fun >= max) {
			fun = max;
			System.out.println("\n" + name + "의 재미 지수가 모두 채워졌습니다.");
		}

		System.out.println("\n--------------------------------\n");

		petItems[temp[tempNum]] = null;
		addDayCount();
		
	}
	
	//상태 저하
	void reduceHunger() {
		hunger--;
	}
	
	void reduceClean() {
		clean--;
	}
	
	void reduceFun() {
		fun--;
	}
	
	//사망
	void death() {
		if(hunger == 0) {
			System.out.println("\n--------------[사망]--------------\n");
			System.out.println(name + "이(가) 굶주림을 이겨내지 못하고 사망했습니다.");
			System.out.println("\n--------------------------------\n");
			System.exit(0);
		}
		if(clean == 0) {
			System.out.println("\n--------------[사망]--------------\n");
			System.out.println(name + "이(가) 더러움을 이겨내지 못하고 사망했습니다.");
			System.out.println("\n--------------------------------\n");
			System.exit(0);
		}
		if(fun == 0) {
			System.out.println("\n--------------[사망]--------------\n");
			System.out.println(name + "이(가) 지루함을 이겨내지 못하고 사망했습니다.");
			System.out.println("\n--------------------------------\n");
			System.exit(0);
		}
	}
	
	//시간 증가
	void addDayCount() {
		dayCount++;
		if(dayCount == 5) {
			dayCount = 0;
			addDay();
		}
	}
	
	void addDay() {
		day++;
		if((day % 5) == 0) {
			checkGrowth();
		}
	}
	
	//성장
	void checkGrowth() {
		growth = day / 5;
		max += 2;
		System.out.println("\n--------------[성장]--------------\n");
		System.out.println(name + "이(가) 성장했습니다!");
		System.out.println("\n--------------------------------\n");
	}
	
}
