package interfacee;

public class Circle implements Shape{
    String color;
    double radius;
    public Circle(String c , Double r){
        this.color=c;
        this.radius=r;
    }
    @Override
    public String color() {
        return color;
    }

    @Override
    public Double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String info() {
        return "i am a "+ color() + " circle ,my area is "+ area();
    }
}
