package g_oop2;

public class SampleParent {
	
	String var;
	
	{
		var = "초기화 블록은 물려 주지 않음";
	}
	
	SampleParent() {
		var = "생성자도 물려 주지 않음";
	}
	
	int method(int a, int b) {
		return a + b;
	}
}
