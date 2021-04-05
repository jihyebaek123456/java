package h_exception;

import java.io.IOException;

public class ThrowsException {
	public static void main(String[] args) {
		
		try {
			method();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}

	private static void method() throws IOException {
		throw new IOException();
	}
}
