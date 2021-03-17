package d_array;

import java.util.Arrays;

public class Array {
		
	public static void main(String[] args) {
		
		//배열
		
		//초기화
		int[] array = new int[5];
		array = new int[] {1, 2, 3, 4, 5};
		int[] array2 = {1, 2, 3, 4, 5};  //선언과 초기화를 동시에 해야 함
		
		//인덱스
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println();

		//값 저장
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		for(int i=0 ; i<array.length ; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println();
		
		for(int i=0 ; i<array.length ; i++) {
			array[i] = (i+1) * 100;
			System.out.println(array[i]);			
		}
		
		System.out.println();
		
		//문제
		//10개의 정수를 저장할 수 있는 배열 선언 및 초기화
		int[] arr = new int[10];
		
		//배열의 모든 인덱스에 1~100 사이 랜덤 값 저장
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		//오름차순 정렬
		int save, num, count;
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i] >= arr[j]) {
					save = arr[i];
					arr[i] = arr[j];
					arr[j] = save;					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		//내림차순 정렬
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i] <= arr[j]) {
					save = arr[i];
					arr[i] = arr[j];
					arr[j] = save;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		//배열에 저장된 모든 값의 합계 및 평균 출력
		int sum = 0;
		for(int i=0 ; i<arr.length ; i++) {
			sum += arr[i];
		}
		double avg = Math.round(sum / (double)(arr.length) * 10) / 10.0;
		System.out.println("sum: " + sum + ", avg: " + avg);
		
		//최댓값, 최솟값 출력
		int max = arr[0];
		int min = arr[0];
		for(int i=0 ; i<arr.length ; i++) {
			if(max <= arr[i]) {
				max = arr[i];
			}
			if(min >= arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("min: " + min + ", max: " + max);
		System.out.println();
		
		int[] shuffle = new int[10];
		for(int i=0 ; i<shuffle.length ; i++) {
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		//배열의 값 섞기
		count = 0;
		do {
			num = (int)(Math.random()*shuffle.length);
			save = shuffle[0];
			shuffle[0] = shuffle[num];
			shuffle[num] = save;
			count++;
		} while(count <= 100);
		System.out.println(Arrays.toString(shuffle));
		
		System.out.println();
		
		//1~10 사이 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수 출력
		int[] randomCount = new int[10];
		
		for(int i=0 ; i<500 ; i++) {
			num = (int)(Math.random()*10) + 1;
			randomCount[num-1]++;
		}
		
		for(int i=0 ; i<randomCount.length ; i++) {
			System.out.print("[" + (i+1) +"] : " + randomCount[i] + " ");
		}
		
		
	}	
}		