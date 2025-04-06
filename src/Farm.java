
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Farm {
    private List<Animal> animals = new ArrayList<>();

    public Farm() {
        animals.add(new Cow("Cow1"));
        animals.add(new Chicken("Chicken1"));
        animals.add(new Llama("Llama1"));
    }

    public void showAnimals() {
        System.out.println("Animals on the farm:");
        for (Animal a : animals) {
            a.printStatus();
        }
        System.out.println("\nFarm Grid:");
        drawGrid();
    }

    public void drawGrid() {
        String[][] grid = new String[6][6];
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 6; j++)
                grid[i][j] = "[ ]";

        for (Animal a : animals) {
        	String emoji = "[?]";
        	if (a instanceof Cow) emoji = "[🐄]";
        	else if (a instanceof Chicken) emoji = "[🐔]";
        	else if (a instanceof Llama) emoji = "[🦙]";
        	grid[a.getY()][a.getX()] = emoji;
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    public void feedAll() {
        for (Animal a : animals) a.feed();
    }

    public void makeAllSounds() {
        for (Animal a : animals) a.makeSound();
    }
    
    public void decayAll() {
        for (Animal a : animals) {
            a.decayEnergy();
        }
    }
    
    public void addAnimalMenu(Scanner scanner) {
        System.out.println("Choose animal to add:");
        System.out.println("1. Cow 🐄");
        System.out.println("2. Chicken 🐔");
        System.out.println("3. Llama 🦙");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        Animal newAnimal = null;
        switch (choice) {
            case 1 -> newAnimal = new Cow("Cow" + (animals.size() + 1));
            case 2 -> newAnimal = new Chicken("Chicken" + (animals.size() + 1));
            case 3 -> newAnimal = new Llama("Llama" + (animals.size() + 1));
            default -> System.out.println("Invalid choice.");
        }

        if (newAnimal != null) {
            animals.add(newAnimal);
            System.out.println("✅ " + newAnimal.name + " added to your farm!");
        }
    }



    public void printSummary() {
        System.out.println("Total animals: " + animals.size());
    }
}