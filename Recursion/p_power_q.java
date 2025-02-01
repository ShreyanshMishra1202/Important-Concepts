public class p_power_q {
    public static void main(String[] args) {
        System.out.println(power(5, 3));
        System.out.println(power2(5, 3));
    }
    // Best Approach
    public static int power(int p,int q){
        if(q==0){
            return 1;
        }
        return p*power(p,q-1);
    }

    // 2nd Approach
    public static int power2(int p,int q){
        if(q==0){
            return 1;
        }
        if(q%2==0){
            return power(p,q/2)*power(p, q/2);
        }
        else{
            return power(p,q/2)*power(p, q/2)*p;
        }
        
    }
}
