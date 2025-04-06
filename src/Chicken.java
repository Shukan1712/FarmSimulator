public class Chicken extends Animal {
    public Chicken(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
    	if(energy >= 5) {
        System.out.println(name + " says: Cluck!");
    	}else {
    		System.out.println(name + " is too tired to Cluck.");
    	}
    }
}