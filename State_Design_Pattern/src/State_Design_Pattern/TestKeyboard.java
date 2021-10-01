package State_Design_Pattern;

public class TestKeyboard {

	public static void main(String[] args) {
		
		Keyboard keyboard = new Keyboard();
		
		keyboard.Turnon();
		
		keyboard.insertPin(1234);
		
		keyboard.InsertPendrive();
		
		keyboard.CopyFilesfromPendrive();
		
		keyboard.EjectPendrive();
		
		keyboard.Shutdown();
		
		keyboard.Turnon();
		
		keyboard.insertPin(1234);
		
		keyboard.InsertPendrive();
		
		keyboard.EjectPendrive();		
		

	}

}
