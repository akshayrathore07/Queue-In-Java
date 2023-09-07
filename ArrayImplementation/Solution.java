package ArrayImplementation;

import java.util.Queue;

public class Solution {
    public static class queueA{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[100];
        public  void add(int val){
            if(rear == arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if (front==-1){
                front = 0;
                rear = 0;
                arr[0] = val;
            }
            else{
//                arr[rear+1] = val;
//                rear++;
                arr[++rear] = val;

            }
            size++;
        }
        public int remove(){
            if (size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            int x = arr[front];
            front++;
            size--;
            return x;
        }
        public int peek(){
            if (size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[front];
        }
        public boolean isEmpty(){
            if (size==0){
                return true;
            }
            else return false;
        }
        public void display(){
            if (size==0){
                System.out.println("Queue is Empty!");
            }
            else {
                for (int i=front ; i<=rear; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queueA q = new queueA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
    }
}
