package Collection_Framework;

import java.util.ArrayDeque;
import java.util.Deque;

public class De_Que {

    public static void main(String[] args) {
        // Deque means "double-ended queue".
        // It allows insertion and removal from BOTH ends:
        //
        // front rear
        // | |
        // v v
        // [ 1, 2, 3, 4, 5 ]
        //
        // A Deque can therefore be used as:
        // 1. A queue: add at the rear and remove from the front (FIFO).
        // 2. A stack: add and remove at the same end (LIFO).
        //
        // Deque is an interface. ArrayDeque is one efficient implementation
        // backed by a resizable array, so the variable uses the interface type
        // while the object uses the concrete implementation.
        Deque<Integer> deque = new ArrayDeque<>();

        // addFirst() inserts at the front (left side).
        deque.addFirst(3);
        // [3]
        deque.addFirst(2);
        // [2, 3]
        deque.addFirst(1);
        // [1, 2, 3]

        // addLast() inserts at the rear (right side).
        deque.addLast(4);
        // [1, 2, 3, 4]
        deque.addLast(5);
        // [1, 2, 3, 4, 5]

        System.out.println("Deque after insertion: " + deque);

        // peekFirst() reads the front element without removing it.
        // peekLast() reads the rear element without removing it.
        System.out.println("Front: " + deque.peekFirst()); // 1
        System.out.println("Rear: " + deque.peekLast()); // 5

        // removeFirst() removes from the front.
        // This is the normal removal operation for a FIFO queue.
        // deque.removeFirst(); // [2, 3, 4, 5]

        // removeLast() removes from the rear.
        // This is useful when the deque is being used like a stack.
        deque.removeLast(); // [1, 2, 3, 4]
        System.out.println("After removeLast(): " + deque);

        // offerFirst()/offerLast() are insertion alternatives that return
        // true or false instead of throwing an exception when insertion fails.
        deque.offerFirst(0); // [0, 1, 2, 3, 4]
        deque.offerLast(5); // [0, 1, 2, 3, 4, 5]

        // pollFirst()/pollLast() remove and return an element.
        // Unlike removeFirst()/removeLast(), poll methods return null when
        // the deque is empty instead of throwing NoSuchElementException.
        int first = deque.pollFirst(); // removes 0
        int last = deque.pollLast(); // removes 5
        System.out.println("Removed first: " + first); // 0
        System.out.println("Removed last: " + last); // 5
        System.out.println("Deque after polling: " + deque); // [1, 2, 3, 4]

        // A deque can also be used as a stack:
        // push() is the same idea as addFirst(), and pop() is the same
        // idea as removeFirst(). The last item pushed is popped first (LIFO).
        deque.push(10); // [10, 1, 2, 3, 4]
        System.out.println("Popped from stack: " + deque.pop()); // 10

        // ArrayDeque does not allow null elements. This prevents null from
        // being confused with pollFirst()/pollLast() meaning "empty deque".
        // For thread-safe operations, use a separate concurrent deque such as
        // ConcurrentLinkedDeque; ArrayDeque itself is not thread-safe.
    }
}
