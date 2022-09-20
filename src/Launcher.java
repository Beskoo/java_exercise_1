import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue");
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        if (!"quit".equals(input)) {
            System.out.println("Unknown command");
        }
        //System.out.println(str);
        reader.close();
    }
}
