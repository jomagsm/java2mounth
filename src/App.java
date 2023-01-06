public class App {
        public static void main(String[] args) throws Exception {
                final String temp = "==========+++==========";
                Circle circle = new Circle("Circle", 4);
                Triangle triangle = new Triangle("Triangle", 4, 4, 5);
                Square square = new Square("Square", 2);
                Rectangle rectangle = new Rectangle("Rectangle", 5, 8);

                Dog dog = new Dog("Reks");
                Cat cat = new Cat("Murka");

                Drawable[] drawables = { circle, triangle, square, rectangle, dog, cat };
                for (Drawable item : drawables) {
                        item.draw();
                        if (item instanceof Figure) {
                                System.out.println(((Figure) item).getName() + " Perimeter: "
                                                + ((Figure) item).calculatePerimeter());

                        }
                        if (item instanceof Animal) {
                                System.out.println(((Animal) item).getName());
                        }
                        System.out.println(temp);

                }
        }
}
