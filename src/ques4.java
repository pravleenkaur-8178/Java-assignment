interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle.");
    }
}
class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle.");
    }
}
public class ques4 {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();
    }
}
