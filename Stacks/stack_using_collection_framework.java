package Stacks;

import java.util.Stack;
public class stack_using_collection_framework {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }
}
