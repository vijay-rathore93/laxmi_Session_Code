package inheritance.single;

public class Parent {

    public Parent(int a) {

        System.out.println("parent class constructors called................");

    }

    private void m1() {
        System.out.println("m1 is called....");
    }

    public void m2() {
        System.out.println("m2 is called....");
    }

    protected void m3() {
        System.out.println("m3 is called....");
    }

    void m4() {
        System.out.println("m4 is called....");
    }


}
