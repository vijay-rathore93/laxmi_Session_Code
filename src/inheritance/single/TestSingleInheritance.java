package inheritance.single;

public class TestSingleInheritance {

    public static void main(String[] args) {
        Child child=new Child();

       // child.m1();//private method of parent class
        child.m2();
        child.m6();
        child.m3();
        child.m4();
        child.m8();

      // child.m5();// private method of child




    }
}
