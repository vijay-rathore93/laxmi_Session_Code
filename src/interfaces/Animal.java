package interfaces;


@FunctionalInterface
public interface Animal {

    int x = 10;

    void m1();

   // void m3();

    static long m2() {
        return 12l;
    }

    default int show() {
        System.out.println("Hello World....");
        return 1;
    }

}
