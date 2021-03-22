package d_array;
import java.util.Arrays;
public class Score {

	public static void main(String[] args) {
		//우리반의 학생별 점수, 합계 평균 및 과목별 합계, 평균 출력
		
		//이름
		String[] names = {"강유진", "강지수", "곽재우", "구본성", "권수연", "김보영", "김소희", "김지수", "백지혜", "송유경",
				"신희철", "심선주", "오수연", "윤희중", "이경준", "이석호", "이승구", "이여강", "이영민", "이영우",
				"이용석", "이정범", "최기문", "최소은", "최윤지"};
		
		//점수
		int[][] scores = new int[25][7];
		for(int i=0 ; i<scores.length ; i++) {
			for(int j=0 ; j<scores[i].length ; j++) {
				scores[i][j] = (int)(Math.random() * 101);
			}
		}
		
		//학생별 합계
		int[] sum = new int[scores.length];
		for(int i=0 ; i<scores.length ; i++) {
			for(int j=0 ; j<scores[i].length ; j++) {
				sum[i] += scores[i][j];
			}
		}
		
		//학생별 평균
		double[] avg = new double[scores.length];
		for(int i=0 ; i<avg.length ; i++) {
			avg[i] = Math.round((double)sum[i] / scores[i].length * 100) / 100.0;
		}
		
		//석차
		int[] rank = new int[scores.length];
		for(int i=0 ; i<avg.length ; i++) {
			rank[i] = 1;
			for(int j=0 ; j<avg.length ; j++) {
				if(avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}
		
		//과목 합계
		int[] subSum = new int[scores[0].length];
		for(int i=0 ; i<scores[i].length ; i++) {
			for(int j=0 ; j<scores.length ; j++) {
				subSum[i] += scores[j][i];
			}
		}
		
		//과목 평균
		double[] subAvg = new double[scores[0].length];
		for(int i=0 ; i<subAvg.length ; i++) {
			subAvg[i] = Math.round((double)subSum[i] / scores.length * 100) / 100.0;
		}
		
		//출력
		System.out.println("이름\t국어\t영어\t수학\t사회\t과학\tOracle\tJava\t합계\t평균\t석차");
		for(int m=0 ; m<scores.length ; m++) {
			for(int i=0 ; i<scores.length ; i++) {
				if(rank[i] == m+1) {
					System.out.print(names[i] + "\t");
					for(int j=0 ; j<scores[i].length ; j++) {
						System.out.print(scores[i][j] + "\t");
					}
					System.out.print(sum[i] + "\t");
					System.out.print(avg[i] + "\t");
					System.out.print(rank[i] + "\n");
				}
			}
		}
		System.out.print("과목 합계\t");
		for(int i=0 ; i<scores[i].length ; i++) {
			System.out.print(subSum[i] + "\t");
		}		
		System.out.print("\n과목 평균\t");
		for(int i=0 ; i<scores[i].length ; i++) {
			System.out.print(subAvg[i] + "\t");
		}		
		
	}
}
