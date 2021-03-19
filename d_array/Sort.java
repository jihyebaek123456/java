package d_array;
import java.util.Arrays;
public class Sort {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		//석차 구하기
		int[] rank = new int[arr.length];
		for(int i=0 ; i<arr.length ; i++) {
			rank[i] = 1;
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr.length ; j++) {
				if(arr[i] < arr[j]) {
					rank[i]++;
				}
			}
		}
		
		System.out.println();
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i] + " : " + rank[i] + "등");
		}
		
		//선택 정렬
		int min;
		for(int i=0 ; i<arr.length-1 ; i++) {
			min = i;
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
			boolean flag = true;
			for(int j=0 ; j<arr.length-1-i ; j++) {
				if(arr[j] >= arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = false;
				}
			}
			if(flag) {
				break;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		//삽입 정렬
		
		for(int i=0 ; i<arr.length-1 ; i++) {
			int temp = arr[i+1];
			int j;
			for(j=i ; j>=0 ; j--) {
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
		
	}
}
