import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Parser parser = new Parser();
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			String line = sc.nextLine();
			
			Number number = parser.parse(line);
			System.out.println(number);
		}
		
	}
	
}
