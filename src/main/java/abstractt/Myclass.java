package abstractt;

public class Myclass {
    public static void main(String[] args) {
        Circle circle= new Circle("red",5.0);
        System.out.println(circle.info());
        System.out.println(circle.area());


        Square square= new Square("blue",4.0);
        System.out.println(square.info());


}}
