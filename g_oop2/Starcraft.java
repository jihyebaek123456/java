package g_oop2;

public class Starcraft {
	public static void main(String[] args) {
		
		Marine m = new Marine();
		Tank t = new Tank();
		Dropship d = new Dropship();
		SCV scv = new SCV();
		
//		scv.repair(m);
		scv.repair(t);
		scv.repair(d);
			
		
	}
}

class Unit {
	int hp;				//현재 체력
	final int MAX_HP;	//최대 체력
	
	Unit(int hp) {
		MAX_HP = hp;
		this.hp = hp;
	}
}

class Marine extends Unit {
	Marine() {
		super(40);
	}
}

class Tank extends Unit implements Repairable {
	Tank() {
		super(150);
	}
}

class Dropship extends Unit implements Repairable {
	Dropship() {
		super(125);
	}
}

class SCV extends Unit {
	SCV() {
		super(60);
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			
			while(u.hp < u.MAX_HP) {
				u.hp++;
			}
		}
	}
}

interface Repairable { }
