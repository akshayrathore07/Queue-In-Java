package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();

        q.addLast(1);
        q.addLast(2);
        q.addLast(3);
        q.addLast(4);
        q.addFirst(5);
        System.out.println(q);

        q.removeFirst();
        System.out.println(q);

        q.removeLast();
        System.out.println(q);

        q.add(7);
        System.out.println(q);
    }
}
