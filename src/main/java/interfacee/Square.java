package interfacee;

public class Square implements Shape{
    String color;
    Double side;
    public Square(String c , Double l){
        this.color=c;
        this.side=l;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public Double area() {
        return Math.pow(side,2);
    }

    @Override
    public String info() {
        return "i am a " +color() + " square having area :" + area();
    }
}
