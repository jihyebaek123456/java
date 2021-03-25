package e_oop.score;

public class Score {
	public static void main(String[] args) {
		String[] list = {"이름", "국어", "영어", "수학", "합계", "평균", "석차"};
		Student[] students = new Student[10];
		
		for(int i=0 ; i<students.length ; i++) {
			Student student = new Student();
			
			student.name = "학생" + (i + 1);
			student.rank = 1;
			student.kor = (int)(Math.random() * 101);
			student.eng = (int)(Math.random() * 101);
			student.math = (int)(Math.random() * 101);
			
			students[i] = student;
		}
		
		//성적처리 프로그램 완성
		//학생 별 합계 + 평균
		for(int i=0 ; i<students.length ; i++) {
			students[i].sum = students[i].kor + students[i].eng + students[i].math;
			students[i].avg = Math.round(students[i].sum / 3.0 * 100) / 100.0;
		}
		//석차
		for(int i=0 ; i<students.length ; i++) {
			for(int j=0 ; j<students.length ; j++) {
				if(students[i].sum < students[j].sum) {
					students[i].rank++;
				}
			}
		}
		
		//과목 별 합계 + 평균
		int[] subSum = new int[3];
		double[] subAvg = new double[3];
		for(int i=0 ; i<students.length ; i++) {
			subSum[0] += students[i].kor;
			subSum[1] += students[i].eng;
			subSum[2] += students[i].math;
		}		
		for(int i=0 ; i<subAvg.length ; i++) {
			subAvg[i] = Math.round((double)subSum[i] / students.length * 100) / 100.0;
		}
		
		//출력
		for(int i=0 ; i<list.length ; i++) {
			System.out.print(list[i] + "\t");
		}
		System.out.println();
		
		for(int i=0 ; i<students.length ; i++) {					//다른 정렬도 이용해보기
			for(int j=0 ; j<students.length ; j++) {
				if(students[j].rank == i + 1) {
					System.out.print(students[j].name + "\t");
					System.out.print(students[j].kor + "\t");
					System.out.print(students[j].eng + "\t");
					System.out.print(students[j].math + "\t");
					System.out.print(students[j].sum + "\t");
					System.out.print(students[j].avg + "\t");
					System.out.print(students[j].rank + "\n");
				}
			}
		}
		
		System.out.print("과목합계\t");
		for(int i=0 ; i<subSum.length ; i++) {
			System.out.print(subSum[i] + "\t");
		}
		System.out.print("\n과목평균\t");
		for(int i=0 ; i<subAvg.length ; i++) {
			System.out.print(subAvg[i] + "\t");
		}
	}
}
