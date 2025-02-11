package session_2;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class ques2 {
    public static void main(String[] args) {
        // Instance Method Reference for add and subtract
        MathOperation add = new MathOperations()::add;
        MathOperation subtract = new MathOperations()::subtract;

        System.out.println("5 + 5 = " + add.operate(5, 5));
        System.out.println("15 - 5 = " + subtract.operate(15, 5));

        // Static Method Reference for multiply
        MathOperation multiply = MathOperations::multiply;
        System.out.println("5 * 20 = " + multiply.operate(5, 20));
    }
}

class MathOperations {
    //addition
    public int add(int a, int b) {
        return a + b;
    }

    //subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    //multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }
}

