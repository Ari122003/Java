package Collection_Framework;

import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {

        // Min heap

        PriorityQueue<Integer> pq = new PriorityQueue<>();

       pq.offer(5);
       pq.offer(1);
       pq.offer(3);
       pq.offer(2);
       pq.offer(4);


//        int peek = pq.peek();
//        System.out.println(peek);

//        int front = pq.poll();
//        System.out.println(front);
//
//        pq.forEach(System.out::print);

        PriorityQueue<Integer> pq2 = new PriorityQueue<>((Integer a,Integer b)->b-a);

        pq2.offer(5);
        pq2.offer(1);
        pq2.offer(3);
        pq2.offer(2);
        pq2.offer(4);
        System.out.println(pq2);




    }
}
