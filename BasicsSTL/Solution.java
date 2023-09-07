package BasicsSTL;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q);
        // remove element
        q.remove();
        System.out.println(q);
        // find top of the element in list
        System.out.println(q.element());
        System.out.println(q.peek());
        System.out.println(q.size());

    }
}
