package Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class Has_Map {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");


        map.forEach((Integer key, String value) -> {
            System.out.println(key + " : " + value);
        });
    }
}
