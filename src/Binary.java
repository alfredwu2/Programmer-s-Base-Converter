
public class Binary extends Number {

	public Number convert() {
		return null;
	}

	public Number convertToDecimal() {
		
		int power = 0;
		
		Decimal conversion = new Decimal();
		
		for (Digit currentDigit = lastDigit; currentDigit != null; currentDigit = currentDigit.leftDigit) {
		
			Decimal d = new Decimal();
			d.attach('1');
			for (int i = 0; i < power; i++) {
				d.multiply(2);
			}
			
			System.out.println(d);
			
			power++;
		}
		
		return null;
	}


	
	public Number convertToBinary() {
		return this;
	}

	public Number convertToHex() {
		return null;
	}
	

	
}
