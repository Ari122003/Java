package Stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_dupilicates {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 100 };

        List<Integer> uniques = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(
                num -> num,
                LinkedHashMap::new,
                Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey()).toList();

        List<Integer> elements = Arrays.stream(arr).boxed().collect(Collectors.toSet()).stream().sorted().toList();

        System.out.println(uniques);
        System.out.println(elements);

    }

}
