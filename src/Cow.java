
public class Cow extends Animal {
	public Cow(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		if (energy >= 5) {
			System.out.println(name + " says: Moo!");
		} else {
			System.out.println(name + " is too tired to Cluck.");
		}
	}
}