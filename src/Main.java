
public class Main {

	public static void main(String[] args) {
		
		/*
		Decimal decimal = new Decimal();
		decimal.attach('3');
		decimal.attach('8');
		decimal.attach('8');
		decimal.attach('4');
		decimal.attach('3');
		decimal.attach('8');
		System.out.println(decimal);
		System.out.println(decimal.convertToHex());
		
		System.out.println();
		
		Hex hex = new Hex();
		hex.attach('f');
		hex.attach('2');
		hex.attach('C');
		System.out.println(hex);
		System.out.println(hex.convertToBinary());
		System.out.println(hex.convertToDecimal());
		*/
		
		/*
		Number binary = new Binary();
		binary.attach('1');
		binary.attach('0');
		binary.attach('1');
		binary.attach('1');
		binary.attach('1');
		binary.attach('1');
		binary.attach('0');
		binary.attach('0');
		binary.attach('1');
		
		System.out.println(binary);
		System.out.println(binary.convertToDecimal());
		System.out.println(binary.convertToHex());
		*/
		
		Parser parser = new Parser();
		Number number = parser.parse("0x1f to decimal");
		
		System.out.println(number);
		
	}
	
}
