package session_2;

// Check if the first number is greater than the second
@FunctionalInterface
interface Compare {
    boolean isGreaterThan(int a, int b);
    }

// Increment number by 1
@FunctionalInterface
interface Increment{
    int incrementBy1(int a);
    }

// Concatenate two strings
@FunctionalInterface
interface Concatenate {
    String concatStrings(String a, String b);
    }

// Convert a string to uppercase
@FunctionalInterface
interface Uppercase {
    String toUpperCase(String a);
    }


public class ques1 {
    public static void main(String[] args) {
        Compare comp = (a, b) -> a > b;
        System.out.println("Is 10 greater than 5? " + comp.isGreaterThan(10, 5));

        Increment inc = (a) -> a + 1;
        System.out.println("Incremented value of 5: " + inc.incrementBy1(5));

        Concatenate con = (a, b) -> a + b;
        System.out.println("Concatenate string: " + con.concatStrings("hello", "world"));

        Uppercase up = (a) -> a.toUpperCase();
        System.out.println("Uppercase string: " + up.toUpperCase("pravleen"));
   }
}