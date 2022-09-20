import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue");
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        while (!"quit".equals(input)) {
		if (input.equals("fibo")) {
			int n, a = 0, b = 0, c = 1;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter value of n:");
			n = s.nextInt();
			for ( int i = 1; i <= n ; i++) {
				a = b;
				b = c;
				c = a + b;
			}	
			System.out.print(a+" ");	
			System.out.print("\n");
			input = reader.nextLine();
		}
		if (!"fibo".equals(input) && !"quit".equals(input)) {
			System.out.println("Unknown command");
	    		input = reader.nextLine();
		}
	}
        reader.close();
    }		
}
