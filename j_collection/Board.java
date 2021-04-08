package j_collection;

import java.util.ArrayList;
import java.util.HashMap;

import e_oop.ScanUtil;



/*
 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
 * 조회, 등록, 수정, 삭제가 가능한 게시판 만들기
 * 
 * 번호(PK), 제목, 내용, 작성자, 작성일
 * 
 * -----------------------------------
 * 번호		제목			작성자	작성일
 * -----------------------------------
 * 5	안녕하세요			홍길동	4/7
 * 4	안녕하세요			홍길동	4/7
 * 3	안녕하세요			홍길동	4/7
 * 2	안녕하세요			홍길동	4/7
 * 1	안녕하세요			홍길동	4/7
 * -----------------------------------
 * 1. 조회		2. 등록		0. 종료
 * 
 * # 조회 후 수정 및 삭제 가능 
 * # 게시판에 나타나는 번호 != 각 글이 가진 번호
 * 						(기본 키, 중복 X, 게시글이 삭제 되어서 인덱스가 당겨져도 기본 키는 변하지 않음)
 * # 기본키는 게시물 등록과 함께 생성 > 이전의 값들과 비교 후 넣어주면 됨
 * # 날짜 가져오기 : new Date()
 * 
 */

public class Board {
	
	ArrayList<HashMap<String, Object>> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Board bd = new Board();
		bd.showBoard();
		
	}
	
	public void showBoard() {
		
		while(true) {
			System.out.println("\n--------------------------------------");
			System.out.println("번호\t제목\t\t작성자\t작성일");
			System.out.println("--------------------------------------");
			if(list.size() != 0) {
				for(int i = list.size()-1 ; i>=0 ; i--) {
					System.out.println((i+1) + "\t" + list.get(i).get("제목") + "\t\t" + list.get(i).get("작성자") + "\t" +  "04/07");
				}
			} else {
				System.out.println();
			}
			System.out.println("--------------------------------------");
			System.out.println("\t1.조회\t2.등록\t0.종료");
			System.out.println("--------------------------------------\n");
			System.out.print("번호를 선택해주세요 > ");
			int choice = ScanUtil.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("\n--------------------------------------\n");
				System.out.print("조회할 글의 번호를 입력해주세요 > ");
				int num = ScanUtil.nextInt();
				System.out.println("\n--------------------------------------\n");
				if(num >= 1 && num <= list.size()) {
					showDetail(num);
				} else {
					System.out.println("잘못된 수를 입력했습니다.");
				}
				break;
			case 2:
				write();
				break;
			case 0:
				System.out.println("\n--------------------------------------\n");
				System.out.println("게시판 조회를 종료합니다.");
				System.out.println("\n--------------------------------------");
				System.exit(0);
			default:
				System.out.println("\n--------------------------------------\n");
				System.out.println("유효하지 않은 숫자를 입력했습니다.");
				System.out.println("\n--------------------------------------");
			}
			
		}
	}

	public void write() {
		System.out.println("\n-------------[게시글 작성]---------------");
		HashMap<String, Object> data = new HashMap<>();
		System.out.print("제목을 입력하세요 ▶ ");
		String str = ScanUtil.nextLine();
		data.put("제목", str);
		System.out.println("내용을 입력하세요 ▼ ");
		str = ScanUtil.nextLine();
		data.put("내용", str);
		System.out.print("작성자 ▶ ");
		str = ScanUtil.nextLine();		
		data.put("작성자", str);
		System.out.println("--------------------------------------\n");
		while(true) {
			System.out.print("글을 등록하시겠습니까? (O/X) ▶ ");
			str = ScanUtil.nextLine();
			
			if(str.equals("O")) {
				list.add(data);
				System.out.println("\n--------------------------------------\n");
				System.out.println("글이 등록되었습니다.");
				System.out.println("\n--------------------------------------");
				break;
			} else if(str.equals("X")) {
				System.out.println("\n--------------------------------------\n");
				System.out.println("글 작성을 취소했습니다.");
				System.out.println("\n--------------------------------------");
				break;
			} else {
				System.out.println("\n--------------------------------------\n");
				System.out.println("유효하지 않은 문자입니다.");
				System.out.println("\n--------------------------------------\n");
			}
		}
	}
	
	public void showDetail(int num) {
		boolean flag = true;
		while(flag) {
			System.out.println("\n--------------------------------------");
			System.out.println("[" + num + "] " + list.get(num-1).get("제목"));
			System.out.println("--------------------------------------\n");
			System.out.println(list.get(num-1).get("내용"));
			System.out.println("\n--------------------------------------");
			System.out.println("\t1.수정\t2.삭제\t0.돌아가기");
			System.out.println("--------------------------------------\n");
			System.out.print("번호를 선택해주세요 > ");
			int choice = ScanUtil.nextInt();
			
			if(choice == 1) {
				rewrite(num);
			} else if(choice == 2) {
				elimination(num);
				flag = false;
			} else if(choice == 0) {
				flag = false;
			} else {
				System.out.println("\n--------------------------------------\n");
				System.out.println("유효하지 않은 숫자를 입력했습니다.");
				System.out.println("\n--------------------------------------\n");
			}
			
		}
	}
	
	public void rewrite(int num) {
		System.out.println("\n--------------------------------------");		
		System.out.println("\t1.제목 수정\t2.내용 수정");
		System.out.println("--------------------------------------\n");		
		while(true) {
			System.out.print("번호를 선택해주세요 > ");
			int choice = ScanUtil.nextInt();
			if(choice == 1) {
				System.out.println("\n--------------------------------------\n");
				System.out.print("수정할 제목을 입력해주세요 ▶ ");
				String str = ScanUtil.nextLine();
				System.out.println("\n--------------------------------------\n");
				System.out.print("제목을 수정하겠습니까? (O/X) > ");
				String answer = ScanUtil.nextLine();
				System.out.println("\n--------------------------------------\n");
				if(answer.equals("O")) {
					list.get(num-1).put("제목", str);
					System.out.println("제목을 수정했습니다.");
				} else if(answer.equals("X")) {
					System.out.println("취소했습니다.");
				} else {
					System.out.println("유효하지 않은 문자를 입력했습니다.");
				}
				System.out.println("\n--------------------------------------");
				break;
			} else if(choice == 2) {
				System.out.println("\n--------------------------------------\n");
				System.out.print("수정할 내용을 입력해주세요 ▶ ");
				String str = ScanUtil.nextLine();
				System.out.println("\n--------------------------------------\n");
				System.out.print("내용을 수정하겠습니까? (O/X) > ");
				String answer = ScanUtil.nextLine();
				System.out.println("\n--------------------------------------\n");
				if(answer.equals("O")) {
					list.get(num-1).put("내용", str);
					System.out.println("내용을 수정했습니다.");
				} else if(answer.equals("X")) {
					System.out.println("취소했습니다.");
				} else {
					System.out.println("유효하지 않은 문자를 입력했습니다.");
				}
				System.out.println("\n--------------------------------------");
				break;
			} else {
				System.out.println("\n--------------------------------------\n");
				System.out.println("유효하지 않은 수를 입력했습니다.");
				System.out.println("\n--------------------------------------\n");
			}
		}
	}
	
	public void elimination(int num) {
		System.out.println("\n--------------------------------------\n");		
		while(true) {
			System.out.print("게시글을 삭제하겠습니까? (O/X) > ");
			String str = ScanUtil.nextLine();
			if(str.equals("O")) {
				list.remove(num-1);
				System.out.println("\n--------------------------------------\n");
				System.out.println("게시글을 삭제했습니다.");
				System.out.println("\n--------------------------------------");
				break;
			} else if(str.equals("X")) {
				System.out.println("\n--------------------------------------\n");
				System.out.println("취소했습니다.");
				System.out.println("\n--------------------------------------");
				break;
			} else {
				System.out.println("\n--------------------------------------\n");
				System.out.println("유효하지 않은 문자를 입력했습니다.");
				System.out.println("\n--------------------------------------\n");
			}
		}
	}
}
