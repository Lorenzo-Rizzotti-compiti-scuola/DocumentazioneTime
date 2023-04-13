package codes.dreaming;

public class Main {
    public static void main(String[] args) {
        //Test Time.java
        Time t1 = new Time(1, 2, 3);
        Time t2 = new Time(100);

        System.out.println(t1.getOre());
        System.out.println(t1.getMinuti());
        System.out.println(t1.getSecondi());
        System.out.println(t1);

        System.out.println(t2.getOre());
        System.out.println(t2.getMinuti());
        System.out.println(t2.getSecondi());
        System.out.println(t2);
    }
}