
public class Conversion {

	public String toDecimal(String binary) {
		int decimal = 0;
		
		for (int i = 0; i < binary.length(); i++) {
			char bit = binary.charAt(binary.length() - 1 - i);
			int bitVal = Character.getNumericValue(bit);
			decimal += bitVal * Math.pow(2, i);
		}

		return String.valueOf(decimal);
	}
	
}
