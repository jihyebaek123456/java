package f_game.game;

public class Pet {
	
	String name;
	int luck;
	int fun;
	int hunger;
	int clean;
	int gold;
	String grow;
	Items[] petItems;
	
	Pet(String name) {
		this.name = name;
		luck = 0;
		fun = 0;
		hunger = 7;
		clean = 7;
		gold = 10;
		grow = "baby";
		petItems = new Items[30];
	}
	
	//상태창
	void showPet() {
		System.out.println();
		System.out.println("============================");
		System.out.println("------------상태-------------");
		System.out.println("이름 : " + name);
		System.out.println("허기 : " + hunger);
		System.out.println("청결 : " + clean);
		System.out.println("재미 : " + fun);
		System.out.println("행운 : " + luck);
		System.out.println("상태 : " + grow);
		System.out.println("돈 : " + gold);
		System.out.println("============================");
		System.out.println();
	}
	
	//소지한 아이템
	void showPetItems() {
		System.out.println();
		System.out.println("============================");
		System.out.println("------------아이템------------");
		for(int i=0 ; i<petItems.length ; i++) {
			System.out.println(petItems[i]);
		}
		System.out.println("============================");
		System.out.println();
	}
	
	//아이템 사용 - 사료, 간식, 목욕, 화장실, 놀아주기
	
	
	//산책 가기 (활동 7번 > 하루, 산책은 하루에 한 번만 가능, 산책에서 아이템 발견 가능)
	
	
	//어떻게 성장?
	
}
