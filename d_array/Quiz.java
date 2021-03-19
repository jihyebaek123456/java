package d_array;

import java.util.Arrays;
		
public class Quiz {
	public static void main(String[] args) {
		
		//1. 거스름돈 동전 개수
		int money = (int)(Math.random() * 500) * 10;
		int[] coin = {500, 100, 50, 10};
		System.out.println("거스름돈 : " + money);
		
		//거스름돈에 동전의 단위마다 몇 개의 동전이 필요한지 출력
		for(int i=0 ; i<coin.length ; i++) {
			int count = money / coin[i];
			money %= coin[i];
			System.out.println(coin[i] + "원 : " + count + "개");
		}
		
		//2. 그래프 그리기
		int[] arr = new int[20];
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = (int)(Math.random() * 5) +1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		//1~5 사이 숫자가 발생된만큼 *을 사용해 그래프 그리기
		//방법1 (배열 사용 O)
		int count[] = new int[5];
		for(int i=0 ; i<arr.length ; i++) {
			count[arr[i]-1]++;
		}
		for(int i=0 ; i<count.length ; i++) {
			System.out.print((i+1) + " : ");
			for(int j= 0; j<count[i] ; j++) {
				System.out.print("*");
			}
			System.out.print(" " + count[i] + '\n');
		}
		
		System.out.println();
		
		//방법2 (배열 사용 X)
		for(int i=1 ; i<=5 ; i++) {  //랜덤 숫자의 범위가 바뀔 때마다 반복 횟수를 직접 설정해줘야 해서 비효율적
			int cnt = 0;
			for(int j=0 ; j<arr.length ; j++) {
				if(i == arr[j]) {
					cnt++;
				}
			}
			System.out.print(i + " : ");
			for(int a=0 ; a<cnt ; a++) {
				System.out.print("*");
			}
			System.out.print(" " + cnt + '\n');
		}
		System.out.println();
		
		//3. 중복되지 않는 배열
		//방법1
		arr = new int[10];
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = (int)(Math.random() * 5) +1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		//1~5 사이 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열 만들기
		//배열 개수 구하기
		int cnt=0;
		for(int i=1 ; i<=5 ; i++) {
			for(int j=0 ; j<arr.length ; j++) {
				if(i == arr[j]) {
					cnt++;
					break;
				}
			}
		}
		//배열 생성
		int[] arr_2 = new int[cnt];
		//최댓값
		int max = arr[0];
		for(int i=0 ; i<arr.length ; i++) {
			if(max <= arr[i]) {
				max = arr[i];
			}
		}
		for(int i=0 ; i<arr_2.length ; i++) {
			arr_2[i] = max+1;
		}
		//값 대입
		arr_2[0] = arr[0];
		for(int i=0; i<arr.length ; i++) {
			for(int j=0 ; j<arr_2.length ; j++) {
				if(arr[i] == arr_2[j]) {
					break;
				}
				if(arr_2[j] == max+1) {
					arr_2[j] = arr[i];
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr_2));
		System.out.println();
		
		//방법2
		int[] temp = new int[5];
		cnt = 0;
		for(int i=0 ; i<arr.length ; i++) {
			boolean flag = true;
			for(int j=0 ; j<temp.length ; j++) {
				if(arr[i] == temp[j]) {
					flag = false;
				}
			}
			if(flag) {
				temp[cnt++] = arr[i];
			}
		}
		int[] result = new int[cnt];
		for(int i=0 ; i<result.length; i++) {
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result));
		System.out.println();
		
		// 4. 2~5 사이의 랜덤한 수 발생 > 그 수로 나누어 떨어지는 숫자로만 이루어진 배열을 정렬하여 출력

		//랜덤 수 뽑기
		arr = new int[100];
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		int num = (int)(Math.random() * 4) + 2;
		
		//배열 만들기 
		cnt = 0;
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]%num == 0) {
				cnt++;
			}	
		}
		temp = new int[cnt];
		int up=0;

		//배열에 값 저장
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]%num != 0) {
				continue;
			}
			temp[up++] = arr[i];
		}
		
		//중복 제거
		int[] temp2 = new int[100];
		cnt = 0;
		for(int i=0 ; i<temp.length ; i++) {
			boolean flag = true;
			for(int j=0 ; j<temp2.length ; j++) {
				if(temp[i] == temp2[j]) {
					flag = false;
				}
			}
			if(flag) {
				temp2[cnt++] = temp[i];
			}
		}
		result = new int[cnt];
		for(int i=0 ; i<result.length; i++) {
			result[i] = temp2[i];
		}

		//정렬
		for(int i=0 ; i<result.length ; i++) {
			int min = i;
			for(int j=i+1 ; j<result.length ; j++) {
				if(result[min] >= result[j]) {
					min = j;
				}
			}
			int tmp = result[i];
			result[i] = result[min];
			result[min] = tmp;
		}
		System.out.println("나눌 수 : " + num);
		System.out.println(Arrays.toString(result));
	}	
}		