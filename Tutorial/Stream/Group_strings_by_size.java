package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Group_strings_by_size {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Java", "Code", "Byte", "Data",

                "Array", "Logic", "Stack", "Queue",

                "Object", "String", "Method", "Binary",

                "Integer", "Boolean", "Package", "Runtime");

        Map<Integer, List<String>> map = words.stream().collect(Collectors.groupingBy(word -> word.length()));

        System.out.println(map);
    };

}
