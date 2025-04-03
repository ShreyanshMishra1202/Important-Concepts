package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class next_smallest_element {
    public static void main(String[] args) {
        java.util.Stack<Integer> s=new Stack<>();
        int arr[]={6,8,0,1,3};
        int sm[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && s.peek()>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                sm[i]=-1;
            }
            else{
                sm[i]=s.peek();
            }
            s.push(arr[i]);
        }
        System.out.println(Arrays.toString(sm));
    }
}
