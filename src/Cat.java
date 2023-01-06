public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("🐈");
    }
}
