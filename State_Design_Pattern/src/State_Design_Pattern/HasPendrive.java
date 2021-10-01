package State_Design_Pattern;

public class HasPendrive implements keyboardState {
	
	Keyboard keyboard;

	public HasPendrive(Keyboard newkeyboard) {
		
		keyboard = newkeyboard;
		
	}

	public void Turnon() {
		
		System.out.println("Turn on the System");
		keyboard.setKeyboardState(keyboard.getKeyboardisOnState());

	}
	
	public void InsertPendrive() {
		
		System.out.println("You can only insert one Pendrive at a time");

	}

	public void EjectPendrive() {
		
		System.out.println("Your Pendrive is ejected");
		keyboard.setKeyboardState(keyboard.getNoPendriveState());

	}
	
    public void Shutdown() {
		
		System.out.println("Shutdown the system");
		keyboard.setKeyboardState(keyboard.getKeyboardShutdownState());

	}

	public void insertPin(int pinEntered) {
		
		System.out.println("You already entered a PIN");
		
	}

	public void CopyFilesfromPendrive() {
		
		System.out.println("Copy files");
		keyboard.setKeyboardState(keyboard.getCopyfilesfromPendriveState());

		
	}

}
