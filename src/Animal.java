

public abstract class Animal {
    protected String name;
    protected double energy;
    protected int x, y;

    public Animal(String name) {
        this.name = name;
        this.energy = 100;
        this.x = (int)(Math.random() * 6);
        this.y = (int)(Math.random() * 6);
    }

    public abstract void makeSound();
    
    public void decayEnergy() {
        if (energy > 0) {
            int loss = (int)(Math.random() * 9) + 1; // random between 1 and 9
            energy -= loss;
            if (energy < 0) energy = 0;
        }
    }

    
    public String getHungerStatus() {
        if (energy >= 80) return "😄 Full";
        else if (energy >= 50) return "🙂 Okay";
        else if (energy >= 20) return "😐 Hungry";
        else if (energy > 0) return "😫 Starving";
        else return "💀 Dead";
    }

    public void feed() {
        if (energy < 100) {
            energy += 10;
            if (energy > 100) energy = 100;
            System.out.println(name + " has been fed. Energy: " + energy);
        } else {
            System.out.println(name + " is already full!");
        }
    }

    public void printStatus() {
        System.out.printf("%-10s at (%d,%d) Energy: %.1f %s\n", name, x, y, energy, getHungerStatus());
    }


    public int getX() { return x; }
    public int getY() { return y; }
}