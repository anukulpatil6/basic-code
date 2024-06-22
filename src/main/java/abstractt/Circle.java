package abstractt;

public class Circle extends Shape{
    double radius;
    public Circle(String color, Double radius) {
        super(color);
        this.radius=radius;
    }

    @Override
    double area() {
        return Math.PI *Math.pow(radius,2);
    }

    @Override
    String info() {
        return "i am a " + super.color +"circle and my area is "+ area();
    }
}
