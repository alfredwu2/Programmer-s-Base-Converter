
public class Digit {

	private int value;
	
	Digit leftDigit, rightDigit;
	
	Digit(char c) {
		this.value = Character.getNumericValue(c);
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int newValue) {
		this.value = newValue;
	}
	
	public String toString() {		
		return String.valueOf(value);
	}
	
}
