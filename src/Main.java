
public class Main {

	public static void main(String[] args) {
	
		Decimal decimal = new Decimal();
		decimal.attach('9');
		decimal.attach('5');
		decimal.attach('0');
		System.out.println(decimal);
		decimal.halve();
		System.out.println(decimal);
		
		/*
		Number binary = new Binary();
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
		
	}
	
}
