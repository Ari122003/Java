package Collection_Framework.Comparable_Comparator;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CustomSort implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }

}




public class Comparator_using_implementation {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        CustomSort sorter = new CustomSort();
//        Collections.sort(list, sorter);
        list.sort(sorter);

        System.out.println(list);
    }
}
