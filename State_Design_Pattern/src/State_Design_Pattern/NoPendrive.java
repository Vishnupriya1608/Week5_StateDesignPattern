package State_Design_Pattern;

public class NoPendrive implements keyboardState {

	Keyboard keyboard;

	public NoPendrive(Keyboard newkeyboard) {
		
		keyboard = newkeyboard;
		
	}

	public void Turnon() {
		
		System.out.println("Turn on the System");
		keyboard.setKeyboardState(keyboard.getKeyboardisOnState());

	}

	public void InsertPendrive() {
		
		System.out.println("Your Pendrive has been inserted");
		keyboard.setKeyboardState(keyboard.getYesPendriveState());
	}

	public void EjectPendrive() {
		
		System.out.println("You didn't insert a Pendrive");

	}
	
	public void Shutdown() {
		
		System.out.println("Shutdown the system");
		keyboard.setKeyboardState(keyboard.getKeyboardShutdownState());

	}

	public void insertPin(int pinEntered) {
		System.out.println("You already entered the PIN");
		
	}

	public void CopyFilesfromPendrive() {
		System.out.println("No Pendrive to copy");
		
	}

}
