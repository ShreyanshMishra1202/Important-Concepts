package Stacks;

public class stack_using_linkedlist {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class stack{
        static Node head=null;
        public static boolean isEmpty(){
            return head==null;
        }
        public void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public int pop(){
            int top=head.data;
            head=head.next;
            return top;
        }
        public int peek(){
            return head.data;
        }
        public void display(){
            Node temp=head;
            while(temp!=null){
                if(temp.next==null){
                    System.out.print(temp.data);
                }
                else {
                    System.out.print(temp.data + " <-- ");
                }
                temp=temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.peek());
        s.display();
        s.pop();
        s.display();

    }
}
