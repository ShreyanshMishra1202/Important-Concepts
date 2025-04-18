package Stacks;

public class stack_using_array {
    public static void main(String[] args) {
        Stack s=new Stack(6);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.print();
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.print();
    }
}
class Stack{
    int arr[];
    int idx=-1;

    Stack() {
        arr=new int[5];
    }
    Stack(int n) {
        arr=new int[n];
    }
    public void push(int n){
        arr[idx+1]=n;
        idx++;
    }
    public void print(){
        for (int i = 0; i <= idx; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("END");
    }
    public int size(){
        return idx+1;
    }
    public boolean isEmpty(){
        return idx==-1;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[idx];
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        int x=arr[idx];
        idx--;
        return x;
    }
    public boolean isFull(){
        return idx==arr.length-1;
    }
}