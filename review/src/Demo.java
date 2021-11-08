/**
 * @author 沈伟
 * @date 2021/10/22 15:11
 */
public class Demo {


    public static void main(String[] args) {
        Sixsix sixsix = new Sixsix("乱编不是胡编","改变不是乱编",4);
        System.out.println(sixsix.toString());

        Integer integer1 = new Integer(2);
        Integer integer2 = new Integer(2);
        System.out.println(integer1 == integer2);
    }



}

class Sixsix{
    private String a;
    private String b;
    private int c;

    public Sixsix(String a, String b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a.equals(b)){

        }
    }

    @Override
    public String toString() {
        return "Sixsix{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c=" + c +
                '}';
    }
}