
//Write a program to display different access controls.
import package1.A;

class D extends A {

    void show4() {

        // System.out.println("i = " + i); // Error
        // System.out.println("j = " + j); // Error
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}

class E {

    void show5() {

        A a1 = new A();
        // System.out.println("i = " + a1.i); // Error
        // System.out.println("j = " + a1.j); // Error
        // System.out.println("k = " + a1.k); // Error
        System.out.println("l = " + a1.l);
    }
}

class DE {

    public static void main(String args[]) {

        D d1 = new D();
        System.out.println("Details of class D :-");
        d1.show4();

        E e1 = new E();
        System.out.println("Details of class E :-");
        e1.show5();
    }
}