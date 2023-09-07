package BasicQuestion;

// Ques :- Print all the element present in the given queue only using add, remove , peek , size function and extra
//         Queue

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        Queue<Integer> helper = new ArrayDeque<>();
        while (q.size()>0){
            System.out.println(q.peek());
//            int x = q.poll();
//            helper.add(x);
            helper.add(q.poll());
        }
        while (helper.size()>0){
            q.add(helper.poll());
        }
    }
}
