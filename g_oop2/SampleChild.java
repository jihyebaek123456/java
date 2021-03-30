package g_oop2;

public class SampleChild extends SampleParent {
	
	void childMethod() {
		System.out.println(var);
		System.out.println(method(7, 13));
	}
	
	//오버라이딩 : 상속 받은 메소드의 내용을 재정의 하는 것
	@Override	//어노테이션 : 클래스, 변수, 메소드 등에 표시해 놓는 것
	int method(int a, int b) {
		return a * b;
	}

	//super, super()
	int var;
	void test(double var) {
		System.out.println("지역 변수 : " + var);			//지역 변수
		System.out.println("인스턴스 변수 : " + this.var);	//인스턴스 변수
		System.out.println("상속 받은 변수 : " + super.var);	//부모 클래스의 인스턴스 변수
	System.out.println("자식 메소드 : " + this.method(10, 20));
	System.out.println("부모 메소드 : " + super.method(10, 20));
	}
	
	SampleChild() {
		super();	//부모 클래스의 생성자 호출
	}
	
	//다형성
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		SampleParent sp = new SampleChild();
		//sp = new SampleChild2();
		//sp = new SampleChild3(); - 다형성이라고 불리는 이유!
		
		sc = (SampleChild)sp;
		sp = (SampleParent)sc;
		//자식 타입 > 부모 타입 형변환은 생략 가능
		
		sc = (SampleChild)new SampleParent();
		sp = new SampleChild();
	}
}
