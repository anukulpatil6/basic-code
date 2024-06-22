package inheritancee;

public class MyMain {
    public static void main(String[] args){
//        inheritancee.MySuperClass mySuperClass=new inheritancee.MySuperClass();
//        System.out.println(mySuperClass.str);
//        mySuperClass.superClassMethod();

        MySubClass mySubClass = new MySubClass("chote miyaa");
        System.out.println(mySubClass.str);
        mySubClass.superClassMethod();
        mySubClass.ab();

    }
}
