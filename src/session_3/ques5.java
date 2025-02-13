package session_3;
import java.util.*;

public class ques5 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 5, 4, 3};
        sortedByFrequency(arr);
    }

    public static void sortedByFrequency(int[] arr) {

        Map<Integer, Integer> fm = new HashMap<>();
        for (int num : arr) {
            if(fm.containsKey((num))){
                int of = fm.get(num);
                int nf = of + 1;
                fm.put(num, nf);
            }
            else{
                fm.put(num, 1);
            }

        }

        List<Integer> elements = new ArrayList<>(fm.keySet());

        elements.sort((a, b) -> {
            int freq = fm.get(b).compareTo(fm.get(a));
            if(freq != 0){
                return freq;
            }
            else{
                return Integer.compare(indexOf(arr, a), indexOf(arr, b));
            }
        });

        for (int element : elements) {
            System.out.println(element);
        }
    }
    private static int indexOf(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

}
