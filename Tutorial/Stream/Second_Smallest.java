package Stream;

import java.util.*;

public class Second_Smallest {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(8, 1, 5, 2, 7, 3, 6, 9);

        int sec = arr.stream().sorted().skip(1).findFirst().orElse(null);

        System.out.println(sec);

    }

}
