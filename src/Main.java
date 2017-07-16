
public class Main {

	public static void main(String[] args) {
		
		Decimal decimal = new Decimal();
		decimal.attach('2');
		decimal.attach('1');
		System.out.println(decimal);
		System.out.println(decimal.convertToBinary());
		
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
		
	}
	
}
