public class Doubly_LL{
    public static class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val=val;
            this.next=next;
            this.prev=prev;
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
        newNode.prev=null;
        head.prev=newNode;
        head=newNode;
    }

    public void addlast(int val){
        Node newNode=new Node(val);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=null;
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;
    }

    public void add_middle(int val,int index){
        Node newNode=new Node(val);
        size++;
        if(head==null || index==0){
            addfirst(val);
            return;
        }
        else if(head.next==null){
            addlast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        newNode.prev=temp;
        temp.next.prev=newNode;
        temp.next=newNode;
    }

    public void removeFirst(){
        if(size==0){
            System.out.println("Linked List is Empty");
            return;
        }
        if(size==1){
            head=tail=null;
            size--;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;
    }

    public void removeLast(){
        if(size==0){
            System.out.println("Linked List is Empty");
            return;
        }
        if(size==1){
            head=tail=null;
            size--;
            return;
        }
        tail=tail.prev;
        tail.next=null;
        size--;
    }

    public void removeAtIndex(int index){
        Node temp=head;
        if(size==0){
            System.out.println("Linked List is Empty");
            return;
        }
        if(size==1){
            head=tail=null;
            size--;
            return;
        }
        size--;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
    }

    public void display_forward(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void display_reverse(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.prev;
        }
        System.out.println("START");
    }
    public static void main(String[] args) {
        Doubly_LL dl=new Doubly_LL();
        
        dl.addfirst(4);
        dl.addfirst(3);
        dl.addfirst(2);
        dl.addfirst(1);
        dl.addlast(7);
        dl.addlast(8);
        dl.add_middle(5, 4);
        dl.add_middle(6, 5);
        dl.display_forward();
        dl.display_reverse();
        System.out.println("Size of Doubly Linked List = "+dl.size);
        dl.removeFirst();
        dl.removeLast();
        dl.removeAtIndex(2);
        dl.display_forward();
        dl.display_reverse();
        System.out.println("Size of Doubly Linked List = "+dl.size);
    }
}