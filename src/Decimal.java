
public class Decimal extends Number {
	
	public Number convert() {
		return null;
	}

	public Number convertToDecimal() {
		for (Digit currentDigit = firstDigit; currentDigit != null; currentDigit = currentDigit.rightDigit) {
			int currentValue = currentDigit.getValue();
			currentDigit.setValue(currentValue * 3);
		}
		return this;
	}

	public Number convertToBinary() {
		return null;
	}

	public Number convertToHex() {
		return null;
	}
	
	public void add(Decimal d) {
		// TODO
		int carryover = 0;
		
		for (Digit x = this.lastDigit, y = d.lastDigit; x != null || y != null;) {

			int currentX = 0;
			int currentY = 0;
			
			if (x != null) {
				currentX = x.getValue();
			}
			
			if (y != null) {
				currentY = y.getValue();
			}
			
			int digitSum = currentX + currentY + carryover;
			
			// manage carryover
			if (digitSum >= 10) {
				digitSum -= 10;
				carryover = 1;
			} else {
				carryover = 0;
			}
			
			if (x != null) {
				x.setValue(digitSum);
			} else {
				Digit newDigit = new Digit((char) ('0' + digitSum));
				this.firstDigit.leftDigit = newDigit;
				newDigit.rightDigit = this.firstDigit;
				this.firstDigit = newDigit;
			}
			
			// increment
			if (x != null) {
				x = x.leftDigit;
			}
			if (y != null) {
				y = y.leftDigit;
			}
			
		}

		if (carryover > 0) {
			firstDigit.leftDigit = new Digit('1');
			firstDigit.leftDigit.rightDigit = firstDigit;
			firstDigit = firstDigit.leftDigit;
		}
		
	}
	
	public void multiply(int factor) {
		int carryover = 0;
		
		for (Digit currentDigit = lastDigit; currentDigit != null; currentDigit = currentDigit.leftDigit) {
			
			int currentValue = currentDigit.getValue();
			currentValue *= factor;
			if (carryover > 0) {
				currentValue += carryover;
			}
			
			if (currentValue >= 10) {
				carryover = currentValue / 10;
				currentValue = currentValue % 10;
			} else {
				carryover = 0;
			}
			
			currentDigit.setValue(currentValue);
		}
		
		if (carryover > 0) {
			char c = (char) ('0' + carryover);	// convert int to ascii
			firstDigit.leftDigit = new Digit(c);
			firstDigit.leftDigit.rightDigit = firstDigit;
			firstDigit = firstDigit.leftDigit;
		}
		
	}
}
