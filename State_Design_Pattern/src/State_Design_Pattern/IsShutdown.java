package State_Design_Pattern;

public class IsShutdown implements keyboardState {

	Keyboard keyboard;

	public IsShutdown(Keyboard newkeyboard) {
		
		keyboard = newkeyboard;
		
	}

	public void Turnon() {
		
		System.out.println("System is already on");

	}

	public void InsertPendrive() {
		
		System.out.println("you already inserted the pendrive");;

	}

	public void EjectPendrive() {
		
		System.out.println("Your Pendrive is ejected");
		keyboard.setKeyboardState(keyboard.getNoPendriveState());


	}
	
	public void Shutdown() {
		
		System.out.println("Shutdown the System");

	}

	public void insertPin(int pinEntered) {
		
		System.out.println("Pin is already entered");
		
	}

	public void CopyFilesfromPendrive() {
		
		System.out.println("Files are copied from Pendrive to the System");
		
	}

}
