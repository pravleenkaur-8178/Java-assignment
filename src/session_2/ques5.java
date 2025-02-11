package session_2;

interface Interface1 {
    default void defaultMethod() {
        System.out.println("Interface1 default method");
    }
}

interface Interface2 {
    default void defaultMethod() {
        System.out.println("Interface2 default method");
    }
}

public class ques5 implements Interface1, Interface2 {
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method");
    }

    public static void main(String[] args) {
        ques5 obj = new ques5();
        obj.defaultMethod();
    }
}
