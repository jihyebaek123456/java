package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("age", 24);
		map.put("name", "jihye");
		map.put("date", new Date());
		
		System.out.println(map);
		
		String before = (String)map.put("name", "jjanggu");

		System.out.println(before);
		System.out.println(map);
		
		map.remove("age");
		
		System.out.println(map);
		
		String name = (String)map.get("name");
		System.out.println(name);
		
		Object date = map.get("date");
		System.out.println(date);
		
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		
		HashMap<String, Object> row = new HashMap<>();
		row.put("id", "admin");
		row.put("password", "admin123");
		row.put("name", "관리자");
		row.put("tel", "010-1234-5678");
		System.out.println(row);
		
		HashMap<String, Object> row1 = new HashMap<>();
		row1.put("id", "user");
		row1.put("password", "user123");
		row1.put("name", "사용자");
		row1.put("tel", "010-5678-1234");
		System.out.println(row);
		
		ArrayList<HashMap<String, Object>> table = new ArrayList<>();
		table.add(row);
		table.add(row1);
		System.out.println(table);
		
		//LPROD 테이블
		//같은 변수 명을 사용하면서 반복해서 자료를 넣고 싶다면 그 때마다 새로운 객체 생성..! 
		HashMap<String, Object> data = new HashMap<>();
		ArrayList<HashMap<String, Object>> table_LPROD = new ArrayList<>();
		
		data = new HashMap<>();
		data.put("LPROD_ID", 1);
		data.put("LPROD_GU", "P101");
		data.put("LPROD_NM", "컴퓨터 제품");
		table_LPROD.add(data);
		
		data = new HashMap<>();
		data.put("LPROD_ID", 2);
		data.put("LPROD_GU", "P102");
		data.put("LPROD_NM", "전자제품");
		table_LPROD.add(data);
		
		data = new HashMap<>();
		data.put("LPROD_ID", 3);
		data.put("LPROD_GU", "P201");
		data.put("LPROD_NM", "여성캐주얼");
		table_LPROD.add(data);
		
		data = new HashMap<>();
		data.put("LPROD_ID", 4);
		data.put("LPROD_GU", "P202");
		data.put("LPROD_NM", "남성캐주얼");
		table_LPROD.add(data);
		
		data = new HashMap<>();
		data.put("LPROD_ID", 5);
		data.put("LPROD_GU", "P301");
		data.put("LPROD_NM", "피혁잡화");
		table_LPROD.add(data);
		
		System.out.println();
		
		System.out.println("LPROD_ID\tLPROD_GU\tLPROD_NM");
		for(int i=0 ; i<table_LPROD.size() ; i++) {
			System.out.print(table_LPROD.get(i).get("LPROD_ID") + "\t\t");
			System.out.print(table_LPROD.get(i).get("LPROD_GU") + "\t\t");
			System.out.print(table_LPROD.get(i).get("LPROD_NM") + "\n");
		}
		
		
	}
}
