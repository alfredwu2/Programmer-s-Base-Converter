import java.util.*;

public class Parser {
	
	final static int BINARY = 0;
	final static int DECIMAL = 1;
	final static int HEXADECIMAL = 2;
	
	public Number parse(String input) {
			
		String tokens[] = input.split(" ");		
		
		Number inputNumber;
		
		Map<String, Integer> map = new HashMap<>();
		map.put("binary", BINARY);
		map.put("base2", BINARY);
		map.put("b2", BINARY);
		map.put("decimal", DECIMAL);
		map.put("dec", DECIMAL);
		map.put("base10", DECIMAL);
		map.put("b10", DECIMAL);
		map.put("hexadecimal", HEXADECIMAL);
		map.put("hex", HEXADECIMAL);
		map.put("base16", HEXADECIMAL);
		map.put("b16", HEXADECIMAL);
		
		if (tokens.length != 3 || !tokens[1].equals("to") || !map.containsKey(tokens[2])) {
			return null;
		}
		
		if (tokens[0].substring(0, 1).equals("0x")) {
			inputNumber = buildHexadecimal(tokens[0]);
		} else if (tokens[0].charAt(0) == 'b') {
			inputNumber = buildBinary(tokens[0]);
		} else {
			inputNumber = buildDecimal(tokens[0]);
		}
		
		if (inputNumber == null) {
			return null;
		}
		
		switch (map.get(tokens[2])) {
		case BINARY:
			return inputNumber.convertToBinary();
		case DECIMAL:
			return inputNumber.convertToDecimal();
		case HEXADECIMAL:
			return inputNumber.convertToHex();
		default:
			return null;
		}
		
		
	}

	public Number buildBinary(String token) {
		Number binary = new Binary();
		for (int i = 1; i < token.length(); i++) {
			char c = token.charAt(i);
			if (c == '0' || c == '1') {
				binary.attach(c);
			} else {
				return null;
			}
		}
		return binary;
	}
	
	public Number buildDecimal(String token) {
		Number decimal = new Decimal();
		for (int i = 0; i < token.length(); i++) {
			char c = token.charAt(i);
			if (Character.isDigit(c)) {
				decimal.attach(c);
			} else {
				return null;
			}
		}
		return decimal;
	}
	
	public Number buildHexadecimal(String token) {
		Number hex = new Hex();
		for (int i = 2; i < token.length(); i++) {
			char c = token.charAt(i);
			if (Character.isDigit(c) || (c >= 'a' && c <= 'f' || c >= 'A' && c <= 'F')) {
				hex.attach(c);
			} else {
				return null;
			}
		}
		return hex;
	}
	
	
}
