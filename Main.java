import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();

        try {
            if (!input.equals("India")) {
                throw new NOMATCHEXCP("String does not match 'India'", input, Thread.currentThread().getStackTrace()[1].getLineNumber());
            }
            System.out.println("Entered string matches 'India'.");
        } catch (NOMATCHEXCP e) {
            System.out.println(e);
        }
    }
}