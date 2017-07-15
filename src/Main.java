
public class Main {

	public static void main(String[] args) {
	
		Decimal decimal = new Decimal();
		decimal.attach('9');
		
		Decimal decimal2 = new Decimal();
		decimal2.attach('1');
		decimal2.attach('9');
		decimal2.attach('4');
		
		decimal.add(decimal2);
		System.out.println(decimal);
		
		/*
		Number binary = new Binary();
		binary.attach('1');
		binary.attach('1');
		binary.attach('0');
		binary.attach('1');
		binary.attach('0');
		binary.convertToDecimal();
		System.out.println(binary);
		*/
		
	}
	
}
