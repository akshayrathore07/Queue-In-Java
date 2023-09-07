package Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueue {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q); // 1 2 3 4 5 6 7 8
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        for (int i=1; i<=n/2; i++){
            st.push(q.remove());
        } // 5 6 7 8

        while (st.size()>0){
            q.add(st.pop());
        } // 5 6 7 8 4 3 2 1

        for (int i=1; i<=(n/2); i++){
            st.push(q.remove());
        } // 4 3 2 1
        for (int i=1; i<=(n/2); i++){
            // one by one firstly stack then queue
            q.add(st.pop());
            q.add(q.remove());
        }
        // reverse the queue
        while (q.size()>0){
            st.push(q.remove());

        }
        while (st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
