package Stream;

import java.util.Arrays;
import java.util.List;

public class Average {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        List<Integer> list = Arrays.stream(arr).boxed().toList();

        double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        System.out.println(avg);
    }

}
