package d_array;
import java.util.Arrays;
public class SortStudy {

	public static void main(String[] args) {
		
		//랜덤한 정수(1~100)를 10개 담은 배열 생성
		int[] arr = new int[10];
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		//석차 구하기
		int[] rank = new int[arr.length];		
		for(int i=0 ; i<rank.length ; i++) {
			rank[i] = 1;
		}
		
		for(int i=0 ; i<rank.length ; i++) {
			for(int j=0 ; j<rank.length ; j++) {
				if(arr[i] < arr[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println(Arrays.toString(rank));
		System.out.println();
		
		//선택 정렬
		for(int i=0 ; i<arr.length-1 ; i++) {
			int min = i;
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[min] >= arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		//버블 정렬
		for(int i=0 ; i<arr.length-1 ; i++) {
			for(int j=0 ; j<arr.length-1-i ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		//삽입 정렬
		for(int i=1 ; i<arr.length-1 ; i++) {
			int temp = arr[i];
			int j;
			for(j=i-1 ; j>=0 ; j--) {
				if(temp < arr[j]) {
					arr[j+1] = arr[j];
				}
				else {
					break;
				}
			}
			arr[j+1] = temp;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
	}

}
