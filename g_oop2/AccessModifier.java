package g_oop2;

public class AccessModifier {
	public String publicVar = "public : 접근 제한 없음";
	protected String protectedVar = "protected : 같은 패키지 + 상속 받은 클래스에서 접근 가능";
	String defaultVar = "default : 같은 패키지에서만 접근 가능";
	private String privateVar = "private : 클래스 내에서만 접근 가능";
	
	public void publidMethod() {
		System.out.println(publicVar);
	}
	
	protected void protectedMethod() {
		System.out.println(protectedVar);
	}
	
	void defaultMethod() {
		System.out.println(defaultVar);
	}
	
	private void privateMethod() {
		System.out.println(privateVar);
	}
	
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publidMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		System.out.println(am.privateVar);
		am.privateMethod();
		
		
		Time t = new Time();
//		t.hour = 13;
//		t.minute = 59;
//		t.second = 30;
		t.setHour(23);
		t.setMinute(59);
		t.setSecond(58);
				
		t.clock();
	}
}
