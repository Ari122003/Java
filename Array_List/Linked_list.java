package Array_List;

import java.util.LinkedList;

public class Linked_list {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        list.forEach(item -> {
            System.out.println(item + " ");
        });

        System.out.println(list);
    }
}
