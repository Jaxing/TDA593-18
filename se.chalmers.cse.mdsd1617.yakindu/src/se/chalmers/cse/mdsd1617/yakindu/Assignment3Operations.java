package se.chalmers.cse.mdsd1617.yakindu;

public class Assignment3Operations {
	private long counter = 0;
	private boolean toggled = false;
	
	public void increaseCounter() {
		if(toggled){
			counter = (counter+1)%5;
		}
	}
	
	public long getCounter() {
		return counter;
	}
	
	public void toggleCounter() {
		toggled = !toggled;
	}
	
	public boolean isToggled() {
		return toggled;
	}
}
