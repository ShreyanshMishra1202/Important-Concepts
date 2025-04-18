package queue;

class queue {
    int arr[];
    int front=0,rear=-1,size=0;
    queue(){
        arr=new int[5];
    }
    queue(int n){
        arr=new int[n];
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size== arr.length;
    }
    public void add(int n){
        if(isFull()){
            System.out.println("queue Full hai.");
            return;
        }
        rear=(rear+1)%arr.length;
        arr[rear]=n;
        size++;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue khali hai.");
            return -1;
        }
        int e=arr[front];
        front=(front+1)%arr.length;
        size--;
        return e;
    }
    public int front(){
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }

    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(arr[(front+i)% arr.length]+" ");
        }
        System.out.println();
//        if(isEmpty()){
//            System.out.println("Queue khali hai");
//            return;
//        }
//        int i=front;
//        while(true){
//            System.out.print(arr[i]+" -- ");
//            if(i==rear){
//                System.out.println("End");
//                return;
//            }
//            i=(i+1)% arr.length;
//        }
    }

}
class queue_using_array{
    public static void main(String[] args) {
        queue q=new queue(6);
        System.out.println(q.isEmpty());
        System.out.println(q.remove());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.print();
        q.remove();
        q.remove();
        System.out.println(q.front());
        q.print();
    }
}
