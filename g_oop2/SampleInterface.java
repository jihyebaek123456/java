package g_oop2;

public interface SampleInterface {
	
	public static final int NUM1 = 10;
	
	int NUM2 = 20;
	
	public abstract void method1();
	
	void method2();
	
}

class SampleImplement implements SampleInterface, SampleInterface2 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	
}

interface SampleInterface2 {
	void method1();
	void method3();
}