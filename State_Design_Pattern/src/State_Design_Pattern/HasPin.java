package State_Design_Pattern;

public class HasPin implements keyboardState {
	
	Keyboard keyboard;

	public HasPin(Keyboard newkeyboard) {
		
		keyboard = newkeyboard;
	}

	public void Turnon() {

		System.out.println("Turn on the System");

	}

	public void insertPin(int pinEntered) {
		
		System.out.println("You already entered a PIN");
		keyboard.setKeyboardState(keyboard.getHasPin());

	}

	public void InsertPendrive() {
		
		System.out.println("Insert a Pendrive");
		keyboard.setKeyboardState(keyboard.getYesPendriveState());

	}

	public void CopyFilesfromPendrive() {
		
		System.out.println("Pendrive is not inserted yet");
	}

	public void EjectPendrive() {
		
		System.out.println("Your Pendrive is ejected");

	}

	public void Shutdown() {
		
		System.out.println("Shutdown the System");
		keyboard.setKeyboardState(keyboard.getKeyboardShutdownState());


	}

}
