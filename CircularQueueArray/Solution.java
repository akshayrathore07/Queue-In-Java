package CircularQueueArray;

import javax.security.auth.login.CredentialExpiredException;

public class Solution {

    public static class CqueueA{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val) throws Exception{
            if (size == arr.length){
                throw new Exception("Queue is full!");
            }
            else if (size==0){
                front = rear = 0;
                arr[0] = val;
            }
            else if (rear<arr.length-1){
                arr[++rear] = val;
            }
            else if (rear == arr.length-1){
                rear = 0;
                arr[0] = val;
            }
            size++;
        }

        public int remove() throws Exception{
            if (size == 0){
                throw new Exception("Queue is Empty!");
            }
            else {
                int val = arr[front];
                if (front == arr.length-1){
                    front = 0;

                }
                else front++;
                size--;
                return val;
            }


        }

        public int peek() throws Exception{
            if (size==0){
                throw new Exception("Queue is Empty!");
            }
            else return arr[front];
        }

        public  boolean isEmpty(){
            if (size == 0){
                return true;
            }
            else return false;
        }

        public void display(){
            if (size == 0){
                System.out.println("Queue is Empty!");
                return;
            }
            else if (front<= rear){
                for (int i=front; i<=rear ; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else {
                for (int i=front; i<arr.length; i++){
                    System.out.print(arr[i]+" ");
                }
                for (int i=0; i<=rear; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        CqueueA q = new CqueueA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        q.add(5);
        q.display();
        q.add(6);
        q.display();

        // actual array
        for (int i=0; i<q.arr.length; i++){
            System.out.print(q.arr[i]+" ");
        }
    }
}
