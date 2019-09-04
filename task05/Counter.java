package htp.home.task05.main;

public class Counter {

	private int minVal;
	private int maxVal;
	private int currentVal;
	
	public Counter(int minVal, int maxVal, int currentVal) {
		this.minVal = minVal;
		this.maxVal = maxVal;
		
		if (currentVal >= minVal && currentVal <= maxVal) {
			this.currentVal = currentVal;
		} 
	}
	
	public void setMinVal(int minVal) {
		this.minVal = minVal;
	}
	
	public int getMinVal() {
		return minVal;
	}
	
	
	public void setMaxVal(int maxVal) {
		this.maxVal = maxVal;
	}
	
	public int getMaxVal() {
		return maxVal;
	}
	
	
	public void setCurrentVal(int currentVal) {
		if (currentVal >= minVal && currentVal <= maxVal) {
			this.currentVal = currentVal;
		}		
	}
	
	public int getCurrentVal() {
		return currentVal;
	}
	
	public Counter() {
		this.minVal = 1;
		this.maxVal = 100;
		this.currentVal = 10;
	}
	
	
	public void increaseCurrentVal() {
		if (currentVal < maxVal) {
			currentVal++;
		}
	}
	
	public void reduceCurrentVal() {
		if (currentVal > minVal) {
			currentVal--;
		}
	}
	
}
