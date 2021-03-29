package e_oop;

public class JVM {
	public static void main(String[] args) {
	//프로그램 실행 시 main(), classVar, classMethod()가 Method area에 저장됨
	//main()가 호출 되어 Call stack에 저장됨
		
		System.out.println(classVar);
		//System 클래스의 out이 Method area에 저장됨
		//println()이 호출되어 Call stack에 저장됨
		//println()이 classVar를 출력 후 Call stack에서 삭제됨
				
		classMethod();
		//classMethod()가 Call stack에 저장 되고, 메소드의 내용을 수행한 뒤 삭제됨
		
		JVM jvm = new JVM();
		//JVM 객체가 Heap에 저장됨
		//jvm 변수가 Call stack에 생성되고, JVM 객체 주소가 저장됨
		
		System.out.println(jvm.instanceVar);
		//println()이 호출되어 Call stack에 저장됨
		//println()이 instanceVar를 출력 후 Call stack에서 삭제됨
		
		jvm.instanceMethod();
		//instanceMethod()가 호출 되어 Call stack에 저장 되고, 메소드의 내용을 수행한 뒤 삭제됨
		
		jvm = null;
		//jvm 변수에 null이 저장됨
		//어디에서도 주소르 참조하지 않는 JVM 객체는 Garbage collector에 저장됨
		
		//main()의 실행이 종료 되어 Call stack에서 삭제됨
		//프로그램이 종료되고 Method area의 데이터가 삭제됨
	}
	
	int instanceVar;
	static int classVar;
	
	void instanceMethod() {
		System.out.println(instanceVar);
		System.out.println(classVar);
	}
	
	static void classMethod() {
//		System.out.println(instanceVar);
		System.out.println(classVar);
		
	}
}
