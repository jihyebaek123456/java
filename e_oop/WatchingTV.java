package e_oop;

public class WatchingTV {

	public static void main(String[] args) {
		TV myTV = new TV(true);
		
		myTV.channelUp();
		myTV.channelUp();
		myTV.channelDown();
		myTV.channelturn(64);
		myTV.volumeUp();
		myTV.volumeDown();
		myTV.tvTurn();
	}

}
