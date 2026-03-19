package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convert_To_Upper {
    public static void main(String[] args) {

        String s = "aritra";

        List<String> list = Arrays.asList(s.split(""));

        s = list.stream().map(String::toUpperCase).collect(Collectors.joining());

        // s = list.stream().collect(Collectors.joining());

        System.out.println(s);

    }

}
