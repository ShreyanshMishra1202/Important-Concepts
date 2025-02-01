public class firstOccurence {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int target=6;
        System.out.println(target+" is present at index "+firOcc(arr,target,0));
    }
    public static int firOcc(int arr[],int t,int y){
        if(y==arr.length){
            return -1;
        }
        if(arr[y]==t){
            return y;
        }
        return firOcc(arr, t, y+1);
    }
}
