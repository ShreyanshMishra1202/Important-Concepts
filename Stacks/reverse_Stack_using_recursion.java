package Stacks;

import java.util.Stack;

public class reverse_Stack_using_recursion {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        revStack(s);
        while(!s.isEmpty()){
            System.out.print(s.peek()+" <-- ");
            s.pop();
        }
        System.out.println("Start");
    }

    public static void insAtBottom(Stack<Integer> s, int a){
        if(s.isEmpty()){
            s.push(a);
            return;
        }
        int b=s.peek();
        s.pop();
        insAtBottom(s,a);
        s.push(b);
    }
    public static void revStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        revStack(s);
        insAtBottom(s,top);
    }
}
