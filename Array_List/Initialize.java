package Array_List;

import java.util.*;

public class Initialize {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        ListIterator<Integer> it = arr.listIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        arr.forEach(item -> {
            if (item % 2 == 0) {
                System.out.print(item);
            }
        });

    }
}
