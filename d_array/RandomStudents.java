package d_array;
import java.util.Arrays;
import java.util.Scanner;
public class RandomStudents {

	public static void main(String[] args) {
		
		//입력한 숫자만큼 우리 반 학생들 중 랜덤으로 뽑아서 출력하는 프로그램(중복 X)
		
		//이름 저장
		String[] names = {"강유진", "강지수", "곽재우", "구본성", "권수연", "김보영", "김소희", "김지수", "백지혜", "송유경",
						"신희철", "심선주", "오수연", "윤희중", "이경준", "이석호", "이승구", "이여강", "이영민", "이영우",
						"이용석", "이정범", "최기문", "최소은", "최윤지"};

		//숫자 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 25 사이 숫자 입력> ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println();

		//숫자 뽑기 & 비교
		int[] random = new int[num];
		System.out.println("[명단]");
		random[0] = (int)(Math.random()*25);
		
		for(int i=1 ; i<random.length ; i++) {
			random[i] = (int)(Math.random()*25);
//			System.out.println(i + " -> " + random[i]);
			for(int j=0 ; j<=i-1 ; j++) {
				if(random[i] == random[j]) {
//					System.out.println(random[i] + " : " + random[j]);
					--i;
					break;
				}
			}
		}
		
		//출력
		for(int i=0 ; i<random.length ; i++) {
			System.out.println((i+1) + ". " + names[random[i]]);			
		}
		
		//다른 답
		String[] pick = new String[num];
		int pickCount = 0;
		
		do {
			int ran = (int)(Math.random() * names.length);
			boolean flag = true;
			for(int i=0 ; i<pick.length ; i++) {
				if(names[ran].equals(pick[i])) {
					flag = false;
				}
			}
			if(flag) {
				pick[pickCount++] = names[ran];
			}
		} while(pickCount < num);
		
		System.out.println(Arrays.toString(pick));
		
	}
}
