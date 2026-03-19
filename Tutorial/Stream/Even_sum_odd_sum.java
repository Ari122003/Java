package Stream;

import java.util.*;

public class Even_sum_odd_sum {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int even = arr.stream().mapToInt(Integer::intValue).filter(e -> e % 2 == 0).sum();

        System.out.println(even);

    }

}
