package Stacks;
import java.util.Stack;
public class duplicate_parenthesis {
    public static void main(String[] args) {
        String a="((a+b)+(b+c))";
        String b="((a+b))";
        System.out.println(duplicateparenthesis(a));
        System.out.println(duplicateparenthesis(b));
    }
    public static boolean duplicateparenthesis(String a){
        Stack<Character> s=new Stack();
        for(int i=0;i<a.length();i++){
            char d=a.charAt(i);
            if(d!=')'){
                s.push(d);
            }
            else{
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                s.pop();
                if(count<1){
                    return true;
                }
            }
        }
        return false;
    }
}
