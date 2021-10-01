package State_Design_Pattern;

public class HasCopyfilesfromPendrive implements keyboardState {
	
	Keyboard keyboard;

	public HasCopyfilesfromPendrive(Keyboard newkeyboard) {
		
		keyboard = newkeyboard;
	}

	public void Turnon() {

		System.out.println("System is already On");

	}

	public void insertPin(int pinEntered) {
		
		System.out.println("You already entered a PIN");

	}

	public void InsertPendrive() {
		
		System.out.println("Insert a Pendrive");
		keyboard.setKeyboardState(keyboard.getYesPendriveState());

	}

	public void CopyFilesfromPendrive() {
		
		System.out.println("Copying files from Pendrive to System");
	}

	public void EjectPendrive() {
		
		System.out.println("Your Pendrive is ejected");

	}

	public void Shutdown() {
		
		System.out.println("Shutdown the system");
		keyboard.setKeyboardState(keyboard.getKeyboardShutdownState());


	}
}
