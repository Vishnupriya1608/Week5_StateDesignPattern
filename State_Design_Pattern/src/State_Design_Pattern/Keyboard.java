package State_Design_Pattern;

public class Keyboard {
	
	keyboardState isOn;

	keyboardState hasCorrectPin;
	
	keyboardState hasPendrive; 
	
	keyboardState hascopyfilesfromPendrive;
	
	keyboardState noPendrive;
		
	keyboardState isShutdown;
	     
	
	keyboardState KeyboardState;
	
	     int Copyfiles = 10;
	     
	     boolean correctPinEntered = false;
	
	    public Keyboard(){
	
	    	isOn = new IsOn(this);
	    	
	    	hasCorrectPin = new HasPin(this);
	    	
	    	hasPendrive = new HasPendrive(this);
	    	
	    	hascopyfilesfromPendrive = new HasCopyfilesfromPendrive(this);
	
	    	noPendrive = new NoPendrive(this);	    	
	
	    	isShutdown = new IsShutdown(this);	    	
	
	        KeyboardState = noPendrive;
	        	        
	        if(Copyfiles < 0){
	    		    		
	        	KeyboardState = isShutdown;
             
	
	        }         
	
	    }
	
	     	
	    void setKeyboardState(keyboardState newKeyboardState){
	
	    	KeyboardState = newKeyboardState;	
	    }
	    
	    public void setCopyFiles(int newCopyfiles){
				         
	    	Copyfiles = newCopyfiles;	         
	
	    }

	    public void Turnon() {	         
	
	    	KeyboardState.Turnon();
		         
	    }
	    public void insertPin(int pinEntered){
	         
	    	KeyboardState.insertPin(pinEntered);
			         		
		    }
	    
	    public void InsertPendrive() {	         
	    	
	    	KeyboardState.InsertPendrive();	         
	
	    }
	   
	    public void CopyFilesfromPendrive() {
	    	
	    	KeyboardState.CopyFilesfromPendrive();
	    	
	    }
	
	    public void EjectPendrive() {
		
	    	KeyboardState.EjectPendrive();
		
	    }
	
	    public void Shutdown(){
			         
	    	KeyboardState.Shutdown();		         
	
	    }
	   	
	    public keyboardState getKeyboardisOnState() { return isOn; }
	    
	    public keyboardState getHasPin() { return hasCorrectPin; }
	
	    public keyboardState getYesPendriveState() { return hasPendrive; }

	    public keyboardState getCopyfilesfromPendriveState() { return hascopyfilesfromPendrive; }
	
	    public keyboardState getNoPendriveState() { return noPendrive; }
	
	    public keyboardState getKeyboardShutdownState() { return isShutdown; }
	    
}
