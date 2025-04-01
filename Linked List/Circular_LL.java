public class Circular_LL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int val){
        Node newNode=new Node(val);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        tail.next=head;
    }

    public void addlast(int val){
        Node newNode=new Node(val);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        tail.next=newNode;
        tail=newNode;
    }

    public void addMiddle(int val,int index){
        Node newNode=new Node(val);
        size++;
        Node temp=head;
        if(head==null){
            head=tail=newNode;
            return;
        }
        if(index==0){
            addfirst(val);
            return;
        }
        if(index==size-1){
            addlast(val);
            return;
        }
        
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void removefirst(){
        if(head==null){
            System.out.println("EMPTY Linked List");
            return;
        }
        head=head.next;
        tail.next=head;
        size--;
    }

    public void removelast(){
        Node temp=head;
        if(head==null){
            System.out.println("Empty Linked List");
        }
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=head;
        tail=temp;
        size--;
    }

    public void display(){
        Node temp=head;
        do{
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("HEAD");
    }

    public static void main(String[] args) {
        Circular_LL cl=new Circular_LL();
        cl.addfirst(5);
        cl.addMiddle(7, 0);
        cl.addfirst(4);
        cl.addlast(6);
        cl.removefirst();
        cl.removelast();
        cl.display();
    }
}