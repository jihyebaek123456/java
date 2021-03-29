package e_oop;

public class VariableInit {
	//명시적 초기화
	int var = 10;
	static int classVar = 20;
	
	//초기화 블록
	{
		var = 30;
	}
	
	//static 초기화 블록
	static {
		classVar = 40;
	}
	
	//생성자
	VariableInit() {
		var = 50;
	}
	
	public static void main(String[] args) {
		Init i = new Init();
		i.a = 10;
		i.b = 20;
		i.c = 30;
		
		Init i2 = new Init();
		i2.a = 40;
		i2.b = 50;
		i2.c = 60;
		
		Init i3 = new Init(70, 80, 90);
			
	}	
}

class Init {
	int a;
	int b;
	int c;
	
	Init() {
		this(0, 0, 0);  //생성자의 첫줄에서만 사용 가능
	}
	
	//메소드 오버로딩
	Init(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}