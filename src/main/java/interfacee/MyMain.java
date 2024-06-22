package interfacee;

public class MyMain {
    public static void main(String[] args) {
        Circle circle = new Circle("red",5.0);
        System.out.println(circle.info());

        Square square = new Square("blue",5.0);
        System.out.println(square.info());

    }
}
