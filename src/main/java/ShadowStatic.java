class A {
    public static void print(){
        System.out.println("Class A");
    }
}

class B extends A {
    public static void print(){
        System.out.println("Class B");
    }
}

public class ShadowStatic {
    public static void main(String[] args) {
        B.print();
    }
}
