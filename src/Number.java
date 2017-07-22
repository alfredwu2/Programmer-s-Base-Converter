
public abstract class Number {

	public static final int TO_DECIMAL = 0;
	public static final int TO_BINARY = 1;
	public static final int TO_HEX = 2;
	
	int convertTo;
	
	Digit firstDigit, lastDigit;
	
	public void attach(char symbol) {
		Digit newDigit = new Digit(symbol);
				
		if (firstDigit == null) {
			firstDigit = newDigit;
		}
		
		if (lastDigit == null) {
			lastDigit = newDigit;
		} else {
			lastDigit.rightDigit = newDigit;
			newDigit.leftDigit = lastDigit;
			lastDigit = lastDigit.rightDigit;
		}		
	}
	
	public Number convert() {
		switch (convertTo) {
		case TO_DECIMAL:
			return convertToDecimal();
		case TO_BINARY:
			return convertToBinary();
		case TO_HEX:
			return convertToHex();
		default:
			return null;
		}
	}
	public abstract Number convertToDecimal();
	public abstract Number convertToBinary();
	public abstract Number convertToHex();
	
	public String toString() {
		String output = "";
		
		for (Digit currentDigit = firstDigit; currentDigit != null; currentDigit = currentDigit.rightDigit) {
			output = output.concat(currentDigit.toString());
		}
		
		return output;
	}
	
	
}
