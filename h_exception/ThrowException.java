package h_exception;

import java.io.IOException;

public class ThrowException {
	public static void main(String[] args) {
		
		try {
//			throw new IOException();	//예외 강제 발생 (콘솔창에 예외 메세지가 안 뜸)
			throw new IOException("예외가 발생한 이유를 만들자");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		throw new NullPointerException();
		
//		String str = null;
//		System.out.println(str.equals("문자열 비교"));
		
//		throw new IndexOutOfBoundsException();
		
		int[] arr = new int[3];
		for(int i=0 ; i<4 ; i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}
}
