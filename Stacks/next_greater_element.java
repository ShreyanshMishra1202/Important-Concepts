package Stacks;
import java.util.Arrays;
import java.util.Stack;
public class next_greater_element {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        int arr[]={6,8,0,1,3};
        int gr[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                gr[i]=-1;
            }
            else{
                gr[i]=s.peek();
            }
            s.push(arr[i]);
        }
        System.out.println(Arrays.toString(gr));
    }
}
