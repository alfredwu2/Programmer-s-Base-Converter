
public class Digit {

	private int value;
	
	Digit leftDigit, rightDigit;
	
	Digit(char c) {
		
		if (c >= 'a' && c <= 'f') {
			this.value = c - 'a' + 10;
		} else if (c >= 'A' && c <= 'F') {
			this.value = c - 'A' + 10;
		} else {
			this.value = Character.getNumericValue(c);
		}
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int newValue) {
		this.value = newValue;
	}
	
	public String toString() {
		if (value >= 10) {
			return "" + (char) ('A' + value - 10);
		} else {	
			return String.valueOf(value);
		}
	}
	
}
