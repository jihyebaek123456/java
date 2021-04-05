package f_game.gamemaking;

public class Activity {
	
	Items[] activityItems = new Items[4];
	Activity() {
		activityItems[0] = new Items("지렁이 미끼", "배고픔이 2 회복됩니다.", 0, 0, 0, 0);
		activityItems[1] = new Items("천연 비료", "배고픔이 5 회복됩니다.", 0, 0, 0, 0);
		activityItems[2] = new Items("대파", "배고픔이 1, 재미가 1 증가합니다.", 0, 0, 0, 0);
		activityItems[3] = new Items("연어", "배고픔이 1, 재미가 1 증가합니다.", 0, 0, 0, 0);
	}
	
	//사냥
	void hunting(Pet pet) {
		System.out.println("\n--------------[사냥]--------------\n");
		int successRate = (int)(Math.random() * 10) + 1;
		if(successRate <= 9) { 
			int getGold = (int)(Math.random() * 5) + 1;
			pet.gold += getGold;
			System.out.println("사냥에 성공했습니다!");
			System.out.println("사냥 후 획득한 전리품 중 일부를 판매하여 " + getGold + "골드를 획득했습니다.");
		}
		else
			System.out.println("사용하던 검이 부러져 사냥에 실패했습니다.");
		System.out.println("\n--------------------------------\n");
		checkPet(pet);
	}
	
	//농사
	void farming(Pet pet) {
		System.out.println("\n--------------[농사]--------------\n");
		int successRate = (int)(Math.random() * 10) + 1;
		if(successRate <= 6) { 
			int getGold = (int)(Math.random() * 10) + 6;
			pet.gold += getGold;
			System.out.println("농사에 성공했습니다!");
			System.out.println("농사 후 획득한 대파 중 일부를 판매하여 " + getGold + "골드를 획득했습니다.");
		}
		else
			System.out.println("작물의 뿌리가 썩어 농사에 실패했습니다.");
		System.out.println("\n--------------------------------\n");
		checkPet(pet);
	}
	
	//낚시
	void fishing(Pet pet) {
		System.out.println("\n--------------[낚시]--------------\n");
		int successRate = (int)(Math.random() * 10) + 1;
		if(successRate <= 6) { 
			int getGold = (int)(Math.random() * 10) + 6;
			pet.gold += getGold;
			System.out.println("낚시에 성공했습니다!");
			System.out.println("낚시 후 획득한 연어 중 일부를 판매하여 " + getGold + "골드를 획득했습니다.");
		}
		else
			System.out.println("물고기가 도망가 낚시에 실패했습니다.");
		System.out.println("\n--------------------------------\n");
		checkPet(pet);
	}
	
	//광물
	void mining(Pet pet) {
		System.out.println("\n--------------[광질]--------------\n");
		int successRate = (int)(Math.random() * 10) + 1;
		if(successRate <= 9) { 
			int getGold = (int)(Math.random() * 5) + 1;
			pet.gold += getGold;
			System.out.println("광질에 성공했습니다!");
			System.out.println("광질 후 획득한 원석 중 일부를 판매하여 " + getGold + "골드를 획득했습니다.");
		}
		else
			System.out.println("곡괭이가 부러져 광물 획득에 실패했습니다.");
		System.out.println("\n--------------------------------\n");
		checkPet(pet);
	}
	
	//요리
	void cooking(Pet pet) {
		System.out.println("\n--------------[요리]--------------\n");
		int successRate = (int)(Math.random() * 10) + 1;
		if(successRate <= 3) { 
			int getGold = (int)(Math.random() * 15) + 16;
			pet.gold += getGold;
			System.out.println("사냥을 성공했습니다!");
			System.out.println("요리하여 만든 생선 스튜를 판매하여 " + getGold + "골드를 획득했습니다.");
		}
		else
			System.out.println("재료가 타버려 요리에 실패했습니다.");
		System.out.println("\n--------------------------------\n");
		checkPet(pet);
	}
	
	//펫 관련 반복
	void checkPet(Pet pet) {
		pet.addDayCount();
		int randomReduce = (int)(Math.random() * 3);
		if(randomReduce == 0) { pet.reduceHunger(); }
		if(randomReduce == 1) { pet.reduceClean(); }
		if(randomReduce == 2) { pet.reduceFun(); }
		pet.death();
	}
	
}
