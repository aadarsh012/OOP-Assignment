package p1;

public class A {

    private int i = 10;
    int j = 20; // Default access controller
    protected int k = 30;
    public int l = 40;

    void show1() {
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}

class B extends A {

    void show2() {

        // System.out.println("i = " + i); // Error
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}

class C {

    void show3() {

        A a1 = new A();

        // System.out.println("i = " + a1.i); // Error
        System.out.println("j = " + a1.j);
        System.out.println("k = " + a1.k);
        System.out.println("l = " + a1.l);

    }
}

class ABC {

    public static void main(String args[]) {

        A a1 = new A();
        System.out.println("Details of Class A :-");
        a1.show1();

        B b1 = new B();
        System.out.println("Details of Class B :-");
        b1.show2();

        C c1 = new C();
        System.out.println("Details of Class C :-");
        c1.show3();
    }
}
