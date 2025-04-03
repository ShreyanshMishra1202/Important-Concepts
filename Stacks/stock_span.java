package Stacks;
import java.util.Arrays;
import java.util.Stack;
public class stock_span {
    public static void main(String[] args) {
        int arr[]={100,80,60,70,60,85,100};
        int q[]=new int[arr.length];
        stockspan(arr,q);
        System.out.println(Arrays.toString(q));
    }
    public static void stockspan(int arr[],int q[]){
        Stack<Integer> s=new Stack<>();
        q[0]=1;
        s.push(0);
        for(int i=1;i<arr.length;i++){
            while(arr[s.peek()]<=arr[i]){
                s.pop();
                if(s.isEmpty()){
                    break;
                }
            }
            if(s.isEmpty()){
                q[i]=i+1;
            }
            else {
                q[i] = i - s.peek();
            }
            s.push(i);
        }
    }
}
