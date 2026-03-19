package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class Remove_duplicate {

    public static <T> Predicate<T> func(Function<? super T, ?> key) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();

        return t -> seen.add(key.apply(t));
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 1, 1, 2, 3, 3, 1, 2);

        // using distinct()

        List<Integer> dist1 = arr.stream().distinct().toList();

        // using custom filter

        List<Integer> dist2 = arr.stream().filter(func(Function.identity())).toList();

        System.out.println(dist2);
    }

}
