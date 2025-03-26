package lt.techin.oop;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("brown", 4, true);
        Bird bird = new Bird("blue", 2, false);

        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());

    }
}
// Bird klasėje buvo perrašytas @Override metodas getDescription(). Jis naudojo tėvinės klasės
// getDescription() metodą iškviestą per "super".