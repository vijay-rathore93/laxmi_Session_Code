package inheritance.single;

public class Child extends Parent {

    public Child() {
        super(6);
        System.out.println("Child class constructors called................");

    }


    private void m5() {
        System.out.println("m5 is called....");
    }

    public void m6() {
        System.out.println("m6 is called....");
    }

    protected void m7() {
        System.out.println("m7 is called....");
    }

    void m8() {
        System.out.println("m8 is called....");
    }
}
