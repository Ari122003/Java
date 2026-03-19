package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Top_three {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(9, 1, 6, 2, 4, 8, 2, 1, 5, 2, 7, 1, 0, 9);

        int top = nums.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).findFirst().orElse(null);
    }

}
