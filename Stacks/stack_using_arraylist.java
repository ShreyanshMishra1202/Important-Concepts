package Stacks;

import java.util.ArrayList;

public class stack_using_arraylist {
    static class stack{
        static ArrayList<Integer> al=new ArrayList<>();
        public boolean isEmpty(){
            return al.size()==0;
        }
        public void push(int val){
            al.add(val);
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=al.getLast();
            al.removeLast();
            return top;
        }
        public int peek() {
            if(isEmpty()){
                return -1;
            }
            return al.get(al.size() - 1);
        }
        public void display(){
            for(int i=0;i<al.size();i++){
                System.out.print(al.get(i)+" --> ");
            }
            System.out.println("END");
        }
        public void rev_display(){
            for(int i=al.size()-1;i>=0;i--){
                System.out.print(al.get(i)+" --> ");
            }
            System.out.println("START");
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
        s.rev_display();
        s.pop();
        System.out.println("Now reverse printing with removing top element.");
        while(!s.isEmpty()){
            System.out.print(s.peek()+" --> ");
            s.pop();
        }
        System.out.println("START");

    }
}
