package e_oop;

public class TV {
	
	boolean onAndOff = false;
	int channel = 1;
	int volume = 10;
	
	//처음 켜기
	TV(boolean onAndOff) {
		if(onAndOff == true) {
			this.onAndOff = true;
			System.out.println("TV를 시청합니다.");
			System.out.println("화면 번호 : " + channel);
			System.out.println("소리 크기 : " + volume);
			
		}
		else {
			this.onAndOff = false;			
			System.out.println("TV는 꺼져 있습니다.");
		}
	}
	
	//전원 변경
	void tvTurn() {
		if(onAndOff == true) {
			onAndOff = false;
			System.out.println("TV 시청을 종료합니다.");
		}
		else {
			onAndOff = true;
			System.out.println("TV를 시청합니다.");
		}
	}
	
	//채널 돌리기 (입력, up, down)
	void channelturn(int channel) {
		if(onAndOff == true) {
			this.channel = channel;
			System.out.println("화면 번호 : " + this.channel);
		}
		else {
			System.out.println("TV는 꺼져 있습니다.");
		}
	}
	
	void channelUp() {
		if(onAndOff == true) {
			System.out.println("화면 번호 : " + ++channel);
		}
		else {
			System.out.println("TV는 꺼져 있습니다.");
		}
	}
	
	void channelDown() {
		if(onAndOff == true) {
			System.out.println("화면 번호 : " + --channel);
		}
		else {
			System.out.println("TV는 꺼져 있습니다.");
		}
	}

	//볼륨 조작 (up, down)
	void volumeUp() {
		if(onAndOff == true) {
			System.out.println("소리 크기 : " + ++volume);
		}
		else {
			System.out.println("TV는 꺼져 있습니다.");
		}
	}
	
	void volumeDown() {
		if(onAndOff == true) {
			System.out.println("소리 크기 : " + --volume);
		}
		else {
			System.out.println("TV는 꺼져 있습니다.");
		}
	}
}
