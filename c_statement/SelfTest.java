package c_statement;
import java.util.Scanner;
public class SelfTest {

	public static void main(String[] args) {
		//테스트 진행 프로그램 만들기
		Scanner sc = new Scanner(System.in);
		
		//질문지
		int count = 0;
		System.out.println("맞으면 1, 틀리면 2를 입력해주세요." + "\n");
		System.out.print("1. 아침을 배불리 먹은 후 점심시간 전에 배가 고프다." + "\n" + "답 : ");
		int ans = Integer.parseInt(sc.nextLine());
		if(ans == 1) { count++; }
		System.out.print("2. 밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다." + "\n" + "답 : ");
		ans = Integer.parseInt(sc.nextLine());
		if(ans == 1) { count++; }
		System.out.print("3. 음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다." + "\n" + "답 : ");
		ans = Integer.parseInt(sc.nextLine());
		if(ans == 1) { count++; }
		System.out.print("4. 정말 배고프지 않더라도 먹을 때가 있다." + "\n" + "답 : ");
		ans = Integer.parseInt(sc.nextLine());
		if(ans == 1) { count++; }
		System.out.print("5. 저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다." + "\n" + "답 : ");
		ans = Integer.parseInt(sc.nextLine());
		if(ans == 1) { count++; }
		System.out.print("6. 스트레스를 받으면 자꾸 먹고 싶어진다." + "\n" + "답 : ");
		ans = Integer.parseInt(sc.nextLine());
		if(ans == 1) { count++; }
		System.out.print("7. 책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여 있다." + "\n" + "답 : ");
		ans = Integer.parseInt(sc.nextLine());
		if(ans == 1) { count++; }
		System.out.print("8. 오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다." + "\n" + "답 : ");
		ans = Integer.parseInt(sc.nextLine());
		if(ans == 1) { count++; }
		System.out.print("9. 과자, 초콜릿 등 단 음식은 상상만 해도 먹고 싶어진다." + "\n" + "답 : ");
		ans = Integer.parseInt(sc.nextLine());
		if(ans == 1) { count++; }
		System.out.print("10. 다이어트를 위해 식이조절을 하는데 3일도 못 간다." + "\n" + "답 : ");
		ans = Integer.parseInt(sc.nextLine());
		if(ans == 1) { count++; }
		
		//결과
		System.out.println("\n" + "체크 항목 갯수 : " + count + "개" + "\n");
		if(count >= 7) {
			System.out.println("<결과>" + "\n" + "중독! 전문의 상담이 필요함");
		}
		else if(count >= 4) {
			System.out.println("<결과>" + "\n" + "위험! 탄수화물 섭취 줄이기 위한 식습관 개선이 필요함");
		}
		else {
			System.out.println("<결과>" + "\n" + "주의! 위험한 수준은 아니지만 관리 필요");
		}

	}

}
