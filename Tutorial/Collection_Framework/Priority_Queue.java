package Collection_Framework;

import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {

        // A PriorityQueue always gives access to the element with the highest
        // priority. With natural ordering, the smallest element has priority.
        // Internally it uses a heap, so the whole queue is not kept sorted.
        // Only peek() and poll() are guaranteed to use priority order.
        // Duplicate elements are allowed, but null elements are not allowed.
        // PriorityQueue is not thread-safe; use a concurrent queue when needed.
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // ==================== CREATE QUEUES ====================
        // This constructor creates a min-priority queue using natural ordering.
        // Integers are ordered from smallest to largest.

        // A custom comparator can reverse the priority so the largest element
        // is processed first. Integer.compare() avoids arithmetic overflow that
        // can happen with the expression b - a.
        PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<>(
                (first, second) -> Integer.compare(second, first));

        // ==================== INSERT ELEMENTS ====================
        // offer() inserts an element and returns true when successful.
        pq.offer(5);
        pq.offer(1);
        pq.offer(3);
        pq.offer(2);
        pq.offer(4);

        // add() also inserts an element. For PriorityQueue, it behaves like
        // offer() because the queue is normally able to grow automatically.
        pq.add(6);

        // The printed representation shows the internal heap layout, not a
        // fully sorted list. Do not rely on this order.
        System.out.println("Internal heap representation: " + pq);

        // ==================== INSPECT FRONT ELEMENT ====================
        // peek() reads the highest-priority element without removing it.
        // It returns null when the queue is empty.
        System.out.println("Highest priority in min queue: " + pq.peek()); // 1

        // element() also reads the front element, but throws an exception when
        // the queue is empty. peek() is usually safer for optional results.
        System.out.println("Front using element(): " + pq.element()); // 1

        // ==================== REMOVE ELEMENTS ====================
        // poll() removes and returns the highest-priority element.
        // For a min queue, elements leave in ascending order.
        System.out.println("Removed: " + pq.poll()); // 1
        System.out.println("Removed: " + pq.poll()); // 2

        // remove() without an argument also removes the front element, but it
        // throws NoSuchElementException when the queue is empty.
        pq.remove(); // removes 3

        // remove(value) searches for and removes one matching value.
        // It returns true when a matching element was found.
        boolean wasRemoved = pq.remove(5);
        System.out.println("Was 5 removed: " + wasRemoved); // true

        // ==================== CHECK CONTENT ====================
        // contains() checks whether a value is currently in the queue.
        System.out.println("Contains 4: " + pq.contains(4)); // true
        System.out.println("Size: " + pq.size());
        System.out.println("Is empty: " + pq.isEmpty()); // false

        // ==================== ITERATION ====================
        // Iteration does not promise priority order. Use repeated poll() calls
        // when elements must be processed from highest priority to lowest.
        System.out.println("Iteration, not guaranteed to be sorted:");
        for (Integer value : pq) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Processing in priority order:");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); // ascending: 4, 6
        }
        System.out.println();

        // ==================== BULK AND UTILITY METHODS ====================
        // addAll() inserts every element from another collection.
        pq.addAll(java.util.List.of(8, 2, 7, 1));

        // toArray() copies the current elements into an array. The array is
        // also not guaranteed to be sorted.
        Object[] values = pq.toArray();
        System.out.println("Array length: " + values.length);

        // clear() removes every element.
        pq.clear();
        System.out.println("After clear, is empty: " + pq.isEmpty()); // true

        // ==================== MAX-PRIORITY QUEUE ====================
        // The comparator changes the priority rule: the largest integer comes
        // out first, so this queue behaves like a max heap.
        maxPriorityQueue.offer(5);
        maxPriorityQueue.offer(1);
        maxPriorityQueue.offer(3);
        maxPriorityQueue.offer(2);
        maxPriorityQueue.offer(4);

        System.out.println("Max queue front: " + maxPriorityQueue.peek()); // 5
        System.out.println("Max queue removal order:");
        while (!maxPriorityQueue.isEmpty()) {
            System.out.print(maxPriorityQueue.poll() + " "); // 5, 4, 3, 2, 1
        }
        System.out.println();

    }
}
