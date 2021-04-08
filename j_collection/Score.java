package j_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Score {
	public static void main(String[] args) {
		//우리반의 학생별 점수, 합계 평균 및 과목별 합계, 평균 출력
		
		//이름
		ArrayList<String> name = new ArrayList<>(Arrays.asList("강유진", "강지수", "곽재우", "구본성", "권수연", "김보영", "김소희", "김지수", "백지혜",
															   "송유경", "신희철", "심선주", "오수연", "윤희중", "이경준", "이석호", "이승구", "이여강",
															   "이영민", "이영우", "이용석", "이정범", "최기문", "최소은", "최윤지"));
		
		ArrayList<String> subject = new ArrayList<>(Arrays.asList("국어", "영어", "수학", "사회", "과학", "Oracle", "Java"));
		
		//학생 별 점수
		ArrayList<ArrayList<Integer>> studentScore = new ArrayList<>();
		for(int i=0 ; i<name.size() ; i++) {
			ArrayList<Integer> scores = new ArrayList<>();
			for(int j=0 ; j<subject.size() ; j++) {
				scores.add(j, (int)(Math.random() * 101));
			}
			studentScore.add(scores);
		}
		
		//학생 별 합계 및 평균
		ArrayList<Integer> studentSum = new ArrayList<>();
		ArrayList<Double> studentAvg = new ArrayList<>();
		for(int i=0 ; i<studentScore.size() ; i++) {
			int sum = 0;
			for(int j=0 ; j<studentScore.get(i).size() ; j++) {
				sum += studentScore.get(i).get(j);
			}
			studentSum.add(i, sum);
			double avg = Math.round((double)sum / subject.size() * 100) / 100.0;
			studentAvg.add(i, avg);
		}
			
		//석차
		ArrayList<Integer> rank = new ArrayList<>();
		for(int i=0 ; i<studentScore.size() ; i++) {
			rank.add(i, 1);
			for(int j=0 ; j<studentScore.size() ; j++) {
				if(studentSum.get(i) < studentSum.get(j)) {
					int num = rank.get(i);
					rank.set(i, ++num);
				}
			}
		}
		
		//과목 별 합계 및 평균
		ArrayList<Integer> subjectSum = new ArrayList<>();
		ArrayList<Double> subjectAvg = new ArrayList<>();
		for(int i=0 ; i<subject.size() ; i++) {
			int sum = 0;
			for(int j=0 ; j<name.size() ; j++) {
				sum += studentScore.get(j).get(i);
			}
			subjectSum.add(i, sum);
			double avg = Math.round((double)sum / name.size() * 100) / 100.0;
			subjectAvg.add(i, avg);
		}
		
		//출력
		System.out.print("이름\t");
		for(int i=0 ; i<subject.size() ; i++) {
			System.out.print(subject.get(i) + "\t");
		}
		System.out.println("합계\t평균\t석차");
		System.out.println("------------------------------------------------------------------------------------");
		
		for(int m=0 ; m<name.size() ; m++) {
			for(int i=0 ; i<name.size() ; i++) {
				if(m + 1 == rank.get(i)) {
					System.out.print(name.get(i) + "\t");
					for(int j=0 ; j<studentScore.get(i).size(); j++) {
						System.out.print(studentScore.get(i).get(j) + "\t");
					}
					System.out.print(studentSum.get(i) + "\t");
					System.out.print(studentAvg.get(i) + "\t");
					System.out.print(rank.get(i));
					System.out.println();
				}
			}
		}
		System.out.println("------------------------------------------------------------------------------------");
		System.out.print("과목합계\t");
		for(int i=0 ; i<subject.size() ; i++) {
			System.out.print(subjectSum.get(i) + "\t");
		}
		System.out.print("\n과목평균\t");
		for(int i=0 ; i<subject.size() ; i++) {
			System.out.print(subjectAvg.get(i) + "\t");
		}
	}
}
