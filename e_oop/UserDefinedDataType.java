package e_oop;

public class UserDefinedDataType {
	public static void main(String[] args) {
		
		//클래스
		Student student;			//변수 선언
		student = new Student();	//변수 초기화 (객체 생성 / 인스턴스화)
		
		//참조 변수를 이용한 값 저장
		// . : 참조 연산자
		student.name = "홍길동";
		student.kor = 80;
		student.eng = 90;
		student.math = 70;
		student.sum = student.kor + student.eng + student.math;
		student.avg = student.sum / 3.0;
		
		System.out.println(student.name + " / " + student.sum + " / " + student.avg);
		
		//인스턴스 생성
		Student stdt = new Student();
		
		//값 저장
		stdt.name = "신짱구";
		stdt.kor = (int)(Math.random() * 101);
		stdt.eng = (int)(Math.random() * 101);
		stdt.math = (int)(Math.random() * 101);
		stdt.sum = stdt.kor + stdt.eng + stdt.math;
		stdt.avg = Math.round(stdt.sum / 3.0 * 10) / 10.0;
		
		System.out.println(stdt.name + " / " + stdt.sum + " / " + stdt.avg);
				
	}
}

class Student {
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	String name;
}