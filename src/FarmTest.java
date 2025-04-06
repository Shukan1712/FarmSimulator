
import java.util.Scanner;

public class FarmTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Farm farm = new Farm();

        while (true) {
            System.out.println("\n==== FARM MENU ====");
            System.out.println("1. Show animals & grid");
            System.out.println("2. Feed all animals");
            System.out.println("3. Make all animals sound");
            System.out.println("4. Print summary");
            System.out.println("5. Add a new animal");
            System.out.println("6. Exit");
            System.out.println("==================");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> farm.showAnimals();
                case 2 -> farm.feedAll();
                case 3 -> farm.makeAllSounds();
                case 4 -> farm.printSummary();
                case 5 -> farm.addAnimalMenu(scanner);
                case 6 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }farm.decayAll(); 
        }
    }
}