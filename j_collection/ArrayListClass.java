package j_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {
	public static void main(String[] args) {
		ArrayList sample = new ArrayList();
		
		System.out.println(sample.add("abc"));
		System.out.println(sample.add(100));
		sample.add(new Scanner(System.in));
		
		//넣는 것은 문제가 없지만 꺼내고 싶을 때 그게 무슨 자료형인지 예측하기 힘듦
		
		ArrayList<Integer> list = new ArrayList<>();
		
		//add()
		list.add(new Integer(10));
//		list.add("abc");
		list.add(20);
		
		System.out.println(list);
		list.add(1, 30);;
		System.out.println(list);
		
		//set(), get()
		int before = list.set(2, 40);
		System.out.println("before: " + before);
		System.out.println("afters: " + list.get(2));
		System.out.println(list);
		
		//size() - for문과 자주 사용
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		//remove() - 뒤부터 제거
		list.remove(1);
		System.out.println(list);
		
		for(int i=list.size()-1 ; i>=0 ; i--) {
			list.remove(i);
		}
		System.out.println(list);
		
		//list에 1~100 사이 랜덤 값을 10개 저장
		for(int i=0 ; i<10 ; i++) {
			list.add(i, (int)(Math.random() * 100) + 1);
		}
		System.out.println(list);
		
		//list에 저장된 값의 합계와 평균 구하기
		int sum = 0;
		double avg = 0;
		
		for(int i=0 ; i<list.size() ; i++) {
			sum += list.get(i);
		}
		avg = (double)sum / list.size();
		
		System.out.println("합계 : " + sum + ", 평균 : " + avg);
		
		//최솟값, 최댓값 구하기
		int max = list.get(0);
		int min = list.get(0);
		
		for(int i=0 ; i<list.size() ; i++) {
			if(min > list.get(i))
				min = list.get(i);
			if(max < list.get(i))
				max = list.get(i);
		}
		
		System.out.println("최댓값 : " + max + ", 최솟값 : " + min);
		
		//오름차순 정렬
		for(int i=0 ; i<list.size() ; i++) {
			min = i;
			for(int j=i ; j<list.size() ; j++) {
				if(list.get(min) > list.get(j)) {
					min = j;
				}
			}
			int temp = list.get(i);
			list.set(i, list.get(min));
			list.set(min, temp);
		}
		System.out.println(list);
		
		
		//2차원 형태
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(10);
		list3.add(20);
		list3.add(30);
		list2.add(list3);
		
		list3 = new ArrayList<>();
		list3.add(40);
		list3.add(50);
		list2.add(list3);
		
		System.out.println(list2);
		
		for(int i=0 ; i<list2.size() ; i++) {
//			ArrayList<Integer> list4 = list2.get(i);
//			for(int j=0 ; j<list4.size() ; j++) {
//				System.out.print(list4.get(j) + "\t");
//			}
//			System.out.println();
			for(int j=0 ; j<list2.get(i).size() ; j++) {
				System.out.print(list2.get(i).get(j) + "\t");
			}
		}
		
		
	}
}
