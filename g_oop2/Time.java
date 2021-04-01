package g_oop2;

public class Time {
	
	private int hour;
	private int hour12;
	private int minute;
	private int second;
	private String amPm;
	
	//데이터 간접 접근
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if(hour >= 0 && hour <= 11) {
			this.amPm = "AM";
			this.hour = hour;
			this.hour12 = hour;
		}
		else if(hour == 12) {
			this.amPm = "PM";
			this.hour = hour;
			this.hour12 = hour;
		}
		else if(hour >= 12 && hour <= 23) {
			this.amPm = "PM";
			this.hour = hour;
			this.hour12 = hour % 12;
		}
		else if(hour == 24) {
			setHour(0);
		}
		else {
			System.out.println("잘못된 수를 입력했습니다.");
			this.hour = 0;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute >= 0 && minute <= 59)
			this.minute = minute;
		else if(minute == 60) {
			this.minute = 0;
			setHour(hour + 1);
		}
		else {
			System.out.println("잘못된 수를 입력했습니다.");
			this.minute = 0;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second >= 0 && second <= 59)
			this.second = second;
		else if(second == 60) {
			this.second = 0;
			setMinute(minute + 1);
		}
		else {
			System.out.println("잘못된 수를 입력했습니다.");
			this.second = 0;
		}
	}

	String getTime() {
		return amPm + " " + hour12 + ":" + minute + ":" + second;
	}
	
	void clock() {
		while(true) {
			System.out.println(getTime());
			stop(1000);
			setSecond(second + 1);
		}
	}
	
	void stop(int interval) {
		try {
			Thread.sleep(interval);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
