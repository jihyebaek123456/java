package d_array;

import java.util.Arrays;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		//2차원 배열
		int[][] array2;
		
		//3차원 배열
		int[][][] array3;
		
		//배열 초기화
		int[][] arr = new int[2][3];
		
		/*
		 * 변수 = 주소1 (100번지)
		 * 
		 * 100번지
		 * {주소2(200번지), 주소3(300번지)}
		 * 
		 * 200번지
		 * {0, 0, 0}
		 * 
		 * 300번지
		 * {0, 0, 0}
		 * 
		 */
		
		int arr2[][] = new int[][]{{1, 2, 3}, {4, 5, 6}};
		int[] arr3[] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};  //선언과 초기화를 동시에
		
		//가변 배열
		int[][] arr4 = new int[3][];
		arr4[0] = new int[3];
		arr4[1] = new int[4];
		arr4[2] = new int[10];
		
		System.out.println(arr[0][1]);
		System.out.println();
		
		/* 
		 * 일차원에는 값 저장 불가
		 * arr[0] = 10;
		 * 
		 * 배열에 저장
		 * arr[0] = new int[5];
		 * arr[0][1] = 10;
		 * 
		 */
		
		//1차원 배열 길이
		System.out.println(arr.length);
		//2차원 배열 길이
		System.out.println(arr[0].length);
		System.out.println();

		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.println(arr[i][j]);
			}
		}
		System.out.println();
		
		int[][] scores = new int[3][5];
		int[] sum = new int[scores.length];
		double[] avg = new double[scores.length];
		
		//점수
		for(int i=0 ; i<scores.length ; i++) {
			for(int j=0 ; j<scores[i].length ; j++) {
				scores[i][j] = (int)(Math.random() * 101);
			}
			System.out.println("학생 " + (i+1) + " : " +Arrays.toString(scores[i]));
		}
		
		//합계
		for(int i=0 ; i<scores.length ; i++) {
			for(int j=0 ; j<scores[i].length ; j++) {
				sum[i] += scores[i][j];
			}
		}		
		System.out.println();
		System.out.println("합계 : " + Arrays.toString(sum));
		
		//평균
		for(int i=0 ; i<avg.length ; i++) {
			avg[i] = (double)sum[i] / scores[i].length;
		}
		System.out.println();
		System.out.println("평균 : " + Arrays.toString(avg));
		
	}
}
