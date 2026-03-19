package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Partition_even_odd {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 1, 2, 0, 4, 5, 2);

        Map<Boolean, List<Integer>> partition = nums.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("partitioningBy: " + partition);

        Map<String, List<Integer>> evenOddMap = nums.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));
        System.out.println("groupingBy: " + evenOddMap);
    }

}
