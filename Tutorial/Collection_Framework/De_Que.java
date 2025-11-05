package Collection_Framework;

import java.util.ArrayDeque;
import java.util.Deque;

public class De_Que {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(3);
        deque.addFirst(2);
        deque.addFirst(1);
        deque.addLast(4);
        deque.addLast(5);

//        deque.removeFirst();
            deque.removeLast();
        
    }
}
