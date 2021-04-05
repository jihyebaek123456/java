package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("d:/file.txt");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//자동 자원 반환
		try(FileOutputStream fos = new FileOutputStream("d:/file.txt")) {
			String str = "집에 가고 싶다...";
			byte[] bytes = str.getBytes();
			for(int i=0 ; i<bytes.length ; i++) {
				fos.write(bytes[i]);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
