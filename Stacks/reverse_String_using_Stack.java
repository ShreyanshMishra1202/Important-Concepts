package Stacks;
import java.util.Stack;
public class reverse_String_using_Stack {
    public static void main(String[] args) {
        Stack<Character> s=new Stack<>();
        String str="Shreyansh";
        for (int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        StringBuilder p = new StringBuilder();
        while (!s.isEmpty()) {
            p.append(s.pop());
        }

        System.out.println(p.toString());
    }
}
