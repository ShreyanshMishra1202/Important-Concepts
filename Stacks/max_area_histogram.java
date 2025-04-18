package Stacks;
import java.util.Stack;
public class max_area_histogram {
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int ht=arr[i],wd=1;
            Stack<Integer> s=new Stack<>();
            int j=0;
            while(j<i){
                s.push(arr[j]);
                j++;
            }
            while(!s.isEmpty()){
                if(s.peek()>=arr[i]){
                    wd++;
                }
                else{
                    break;
                }
                s.pop();
            }

            int y=i+1;
            while(y<n){
                if(arr[y]>=arr[i]){
                    wd++;
                    y++;
                }
                else{
                    break;
                }
            }
            if((ht*wd)>max){
                max=ht*wd;
            }
            System.out.println("Height : "+ht+" width : "+wd+" Area : "+(ht*wd));
        }
        System.out.println(max);
    }
}
