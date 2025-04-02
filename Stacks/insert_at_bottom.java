package Stacks;
import java.util.Stack;
public class insert_at_bottom {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        ins(s,0);
        while(!s.isEmpty()){
            System.out.print(s.peek()+" <-- ");
            s.pop();
        }
        System.out.println("Start");
    }
    public static void ins(Stack<Integer> s,int a){
        if(s.isEmpty()){
            s.push(a);
            return;
        }
        int b=s.peek();
        s.pop();
        ins(s,a);
        s.push(b);
    }
}
