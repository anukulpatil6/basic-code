package encapsulation;

public class MyprivateClass {
    private static String str = "private aadmi";

    public String getStr(){
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    private void mymethod(){
        System.out.println("hum private method me hain");
    }
}
