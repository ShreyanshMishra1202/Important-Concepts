
import java.lang.reflect.Array;

public class mergeSort {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,8,4,78,32};
        int y=arr.length;
        System.out.println(Array.toString(sorting(arr,0,y)));
    }
    public static int[] sorting(int arr[],int s,int e){
        if(e-s==1){
            return arr;
        }
        int mid=(s+e)/2;
        int[] x=sorting(arr,s,mid);
        int[] y=sorting(arr,mid+1,e);
        return merge(x,y);
    }
    public static int[] merge(int[] x,int[] y){
        int[] l=new int[x.length+y.length];
        int i=0;
        for(;i<x.length;i++){
            l[i]=x[i];
        }
        for(int p=0;p<y.length;p++){
            l[p+i]=y[p];
        }
        return l;
    }
}
