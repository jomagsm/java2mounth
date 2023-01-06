public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("🐕");
    }

}
