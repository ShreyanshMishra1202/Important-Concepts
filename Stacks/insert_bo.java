import java.util.Stack;
public class insert_bo{
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s=do_it(s);
        while(!s.empty()){
            System.out.println(s.pop());
        }
    }
    public static Stack<Integer> do_it(Stack<Integer> s){
        if(s.isEmpty()){
            s.push(1000);
            return s;
        }
        int a=s.pop();
        s=do_it(s);
        s.push(a);
        return s;
    }
}