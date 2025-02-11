package session_2;

@FunctionalInterface
interface MyFunctionalInterface {
    //check if first number is greater than second
    boolean isGreaterThan(int a, int b);

    //increment number by 1
    default int increment(int a) {
        return a + 1;
    }

    //concatenate two strings
    default String concatStrings(String a, String b) {
        return a + b;
    }

    //convert a string to uppercase
    default String toUpperCase(String str) {
        return str.toUpperCase();
    }
}

public class ques1 {
    public static void main(String[] args) {
        MyFunctionalInterface greaterThan = (a, b) -> a > b;
        System.out.println("Is 10 greater than 5? " + greaterThan.isGreaterThan(10, 5));

        MyFunctionalInterface increment = (a, b) -> a > b;
        System.out.println("Incremented value of 5: " + increment.increment(5));

        MyFunctionalInterface concat = (a, b) -> a > b;
        System.out.println("concatenate string: " + concat.concatStrings("hello", " world"));

        MyFunctionalInterface upperCase = (a, b) -> a > b;
        System.out.println("uppercase string: " + upperCase.toUpperCase("pravleen"));
    }
}

