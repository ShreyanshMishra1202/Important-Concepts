
public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    /*For add First,
        (1) create new Node
        (2) new Node's next = head
        (3) head=new Node
     */
    public void addFirst(int data){
        // STEP1: create new Node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        // STEP2: new Node's next = head
        newNode.next=head;
        // STEP3: head=new Node
        head=newNode;
    }

    /*For add Last,
        (1) create new Node
        (2) tail's next = new Node
        (3) tail = new Node
     */
    public void addLast(int data){
        // STEP1: create new Node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        // STEP2: tail's next = new Node
        tail.next = newNode;
        // STEP3: tail=new Node
        tail = newNode;
    }

    public void print(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;     // newnode comes gets inserted temp and next node
        temp.next=newNode;
    }


    public int removeFirst(){
        if(size==0){
            System.out.println("LinkedList is Empty");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }


    public int removeLast(){
        if(size==0){
            System.out.println("LinkedList is Empty");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        Node prev=head;
        while(prev.next != tail){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public int search(int key){
        if(size == 0){
            System.out.println("LinkedList is Empty");
            return -1;
        }
        int i=0;
        Node temp=head;
        while(temp.next != null){
            if(temp.data == key){
                return i;
            }
            i++;
            temp=temp.next;
        }
        System.out.println("Number not present in LinkedList");
        return -1;
    }


    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    public void insert_rec(int val,int index){
        head=insert_rec(val, index,head);
    }
    private Node insert_rec(int val,int index,Node node){
        if(index==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=insert_rec(val, index-1, node.next);
        return node;
    }

    
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.addLast(6);
        ll.insert_rec(67, 2);
        ll.print();
        // Now, we will add data at any middle index
        ll.add(3,99);
        ll.print();
        ll.add(0,98);
        ll.print();
        System.out.println("Number Removed :: "+ll.removeFirst());
        ll.print();
        System.out.println("Number Removed :: "+ll.removeLast());
        ll.print();
        

        System.out.println("Size = "+ll.size);    // prints size of linked list

        System.out.println(ll.search(99));      // searching by linear search
        System.out.println(ll.recSearch(99));   // searching by recursive search
    }
}