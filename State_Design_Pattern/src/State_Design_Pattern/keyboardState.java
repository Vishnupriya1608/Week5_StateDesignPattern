package State_Design_Pattern;

public interface keyboardState {
	
	
	void Turnon();	
	void insertPin(int pinEntered);
	void InsertPendrive();
	void CopyFilesfromPendrive();
	void EjectPendrive();
	void Shutdown();

}
