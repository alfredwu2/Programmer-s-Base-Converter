
public class Binary extends Number {

	public Number convertToDecimal() {
		
		int power = 0;
		
		Decimal conversion = new Decimal();
		conversion.attach('0');
		
		for (Digit currentDigit = lastDigit; currentDigit != null; currentDigit = currentDigit.leftDigit) {
		
			if (currentDigit.getValue() == 1) {
				Decimal d = new Decimal();
				d.attach('1');
				for (int i = 0; i < power; i++) {
					d.multiply(2);
				}
				conversion.add(d);
			}
			
			power++;
			
		}

		return conversion;
	}


	
	public Number convertToBinary() {
		return this;
	}

	public Number convertToHex() {
		
		Hex conversion = new Hex();
		
		int hexValue = 0;
		int power = 0;
					
		Digit currentDigit = lastDigit;	
			
		while (currentDigit != null) {

			if (currentDigit.getValue() == 1) {
				hexValue += Math.pow(2, power);
			}
			
			power++;
			currentDigit = currentDigit.leftDigit;
			
			if (power == 4 || currentDigit == null) {
				char c;
				if (hexValue < 10) {
					c = (char) ('0' + hexValue);
				} else {
					c = (char) ('a' + hexValue - 10);
				}
				
				Digit newDigit = new Digit(c);
				
				if (conversion.firstDigit == null) {
					conversion.firstDigit = newDigit;
				} else {
					conversion.firstDigit.leftDigit = newDigit;
					newDigit.rightDigit = conversion.firstDigit;
					conversion.firstDigit = newDigit;
				}
				
				power = 0;
				hexValue = 0;
			}
			
		}
		
		return conversion;
	}
	
	public String toString() {
		return "b" + super.toString();
	}

	
}
