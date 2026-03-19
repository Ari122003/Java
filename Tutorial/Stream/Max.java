package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Max {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Comparator<Integer> valueComparator = (a, b) -> Integer.compare(a, b);

        int max = arr.stream().max(valueComparator).orElse(null);
        int min = arr.stream().min(valueComparator).orElse(null);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }

}
