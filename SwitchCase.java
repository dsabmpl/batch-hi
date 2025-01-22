import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // Scanner - buffer
        // Scanner s = new Scanner("Hello How are You");
        // int wordCount = 0;
        // while (s.hasNext()) {
        // System.out.println(s.next());
        // wordCount++;
        // }
        // System.out.println(wordCount);

        Scanner scanner = new Scanner(System.in);
        final int TEA = 1;
        final int DRINKS = 2;
        // Menu Driven
        // Equal Comparsion
        System.out.println("1. Tea");
        System.out.println("2. Drinks");
        System.out.println("3. Burger");
        System.out.println("4. Pizza");
        int choice = scanner.nextInt(); // nextXXX
        switch (choice) { // byte , int , char
            case TEA:
                System.out.println("Rs 50");
                break;
            case DRINKS:
                System.out.println("Rs 150");
                break;
            case 3:
                System.out.println("Rs 200");
                break;
            case 4:
                System.out.println("Rs 500");
                break;
            default:
                System.out.println("Wrong Choice...");
        }
        // Java 7 Switch Case String
        String ch = "Tea";
        switch (ch) {
            case "Tea":
                System.out.println("Rs 50");

        }

        // Java 14
        String result = switch (ch) {
            case "Tea" -> "Rs 50";
            case "Drinks" -> "Rs 150";
            case "Burger" -> {
                yield "Rs 250";
            }
            default -> "Wrong Choice";
        };
        System.out.println(result);
    }
}
