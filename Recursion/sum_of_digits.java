public class sum_of_digits {
    public static void main(String[] args) {
        System.out.println(sum(245967));
    }
    public static int sum(int n){
        if(n>=0 && n<=9){
            return n;
        }
        int s=sum(n/10);
        return s+n%10;
    }
}
