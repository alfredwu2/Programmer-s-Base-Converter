
public class Main {

	public static void main(String[] args) {
		
		Conversion conversion = new Conversion();
		
		String decimal = conversion.toDecimal("0110");
		
		System.out.println(decimal);
		
		System.out.println(conversion);
		
	}
	
}
