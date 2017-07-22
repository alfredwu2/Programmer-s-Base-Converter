
public class Main {

	public static void main(String[] args) {
		
		Parser parser = new Parser();
		Number number = parser.parse("0x1f to decimal");
		
		System.out.println(number);
		
	}
	
}
