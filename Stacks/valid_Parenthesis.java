package Stacks;

import java.util.Stack;

public class valid_Parenthesis {
    public static void main(String[] args) {
        String a="({[]})";
        System.out.println(isValid(a));

    }
    public static boolean isValid(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char d=str.charAt(i);
            if(d=='[' || d=='{' || d=='('){
                s.push(d);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek()=='(' && d==')' || s.peek()=='{' && d=='}' || s.peek()=='[' && d==']'){
                    s.pop();
                }
                else {
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }
}
