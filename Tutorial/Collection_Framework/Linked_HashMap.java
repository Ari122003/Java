package Collection_Framework;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_HashMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<Integer,String>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");


        System.out.println(map.get(3));

        map.forEach((k,v)->{
            System.out.println(k + ":" + v);
        });
    }
}

