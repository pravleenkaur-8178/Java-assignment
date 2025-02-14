package session_3;
import java.util.*;

public class Ques1 {
    public static void main(String[] args) {

        List<Double> numbers = new ArrayList<>();

            numbers.add(10.5);
            numbers.add(20.3);
            numbers.add(30.2);
            numbers.add(40.1);
            numbers.add(50.0);

            double sum = 0.0;
            Iterator<Double> iterator = numbers.iterator();
            while (iterator.hasNext()) {
                sum += iterator.next();
            }

            System.out.println("Sum of the numbers: " + sum);
    }
}

