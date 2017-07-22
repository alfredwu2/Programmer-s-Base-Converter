
public class Hex extends Number {


	public Number convertToDecimal() {
		
		return this.convertToBinary().convertToDecimal();
	}


	
	public Number convertToBinary() {
		
		Binary conversion = new Binary();
		
		for (Digit currentDigit = firstDigit; currentDigit != null; currentDigit = currentDigit.rightDigit) {
			int currentValue = currentDigit.getValue();
			
			for (int i = 8; i > 0; i /= 2) {
				if (currentValue >= i) {
					conversion.attach('1');
					currentValue -= i;
				} else {
					conversion.attach('0');
				}
			}
			
		}
		
		return conversion;
	}

	public Number convertToHex() {
		return this;
	}
	
	public String toString() {
		return "0x" + super.toString();
	}
	
}

