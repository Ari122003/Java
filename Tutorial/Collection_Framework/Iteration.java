package Collection_Framework;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteration {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next());
        }

        for(Integer i : list){
            System.out.print(i);
        }

        list.forEach((Integer e )-> System.out.print(e));
    }
}
