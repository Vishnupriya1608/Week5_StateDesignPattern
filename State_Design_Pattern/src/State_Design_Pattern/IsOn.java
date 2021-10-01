package State_Design_Pattern;

public class IsOn implements keyboardState {

	Keyboard keyboard;

	public IsOn(Keyboard newkeyboard) {
		
		keyboard = newkeyboard;
		
	}

	public void Turnon() {
		
		System.out.println("Turn on the System");

	}
	
	public void insertPin(int pinEntered) {
		
	    if(pinEntered == 1234){
				
				System.out.println("You entered the correct PIN");
				keyboard.correctPinEntered = true;
				keyboard.setKeyboardState(keyboard.getHasPin());
				
			} else {
				
				System.out.println("You entered the wrong PIN");
				keyboard.correctPinEntered = false;
				System.out.println("Your Pendrive is ejected");
				keyboard.setKeyboardState(keyboard.getNoPendriveState());
				
			}	
			
		}

	public void InsertPendrive() {
		
		System.out.println("Insert the pendrive");
		keyboard.setKeyboardState(keyboard.getYesPendriveState());

	}
	
	public void CopyFilesfromPendrive() {
		
		System.out.println("Pendrive is not inserted yet");
		keyboard.setKeyboardState(keyboard.getCopyfilesfromPendriveState());
		
	}

	public void EjectPendrive() {
		
		System.out.println("Your Pendrive is ejected");
		keyboard.setKeyboardState(keyboard.getNoPendriveState());

	}
	
	public void Shutdown() {
		
		System.out.println("Shutdown the system");
		keyboard.setKeyboardState(keyboard.getKeyboardShutdownState());

	}


}
