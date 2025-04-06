
public class Llama extends Animal {
    public Llama(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
    	if ( energy >= 5) {
        System.out.println(name + " says: Hmmm!");
    	}else {
    		System.out.println(name + " is too tired to Humm.");
    	}
    }
}