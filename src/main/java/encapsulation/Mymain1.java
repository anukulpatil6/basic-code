package encapsulation;

public class Mymain1 {
    public static void main(String[] args) {
    MyprivateClass myprivateClass = new MyprivateClass();
        System.out.println(myprivateClass.getStr());
    myprivateClass.setStr("nya member ho aap");
        System.out.println(myprivateClass.getStr());
        MyprivateClass myprivateClass1 = new MyprivateClass();
        System.out.println(myprivateClass1.getStr());



    }
}
