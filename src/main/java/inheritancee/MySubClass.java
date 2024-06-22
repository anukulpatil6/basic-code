package inheritancee;

public class MySubClass extends MySuperClass{

    public MySubClass(String b){
        super(b);
        System.out.println("hum sub class me jee rhe hain");
    }
public void ab(){
        super.ab();
    System.out.println("sub class ki ab method");
}
}
