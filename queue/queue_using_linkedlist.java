package queue;

public class queue_using_linkedlist {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class queue{
        static Node head=null;
        static Node tail=null;
        static int size;

        public boolean isEmpty(){
            return head==null && tail==null;
        }

        public void add(int val){
            Node newNode=new Node(val);
            size++;
            if(isEmpty()){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=tail.next;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty.");
                return -1;
            }
            int h=head.data;
            head=head.next;
            size--;
            return h;
        }

        public int size(){
            return size;
        }

        public int front(){
            if(isEmpty()){
                System.out.println("Queue is Empty.");
                return -1;
            }
            return head.data;
        }

        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" --> ");
                temp=temp.next;
            }
            System.out.println("END");
        }
    }
    public static void main(String[] args) {
        queue q=new queue();
        System.out.println(q.isEmpty());
        System.out.println(q.remove());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.display();
        q.remove();
        q.remove();
        System.out.println(q.front());
        q.display();
    }
}
