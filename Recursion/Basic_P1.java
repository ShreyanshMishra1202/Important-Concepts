public class Basic_P1{
    // Increasing_decreasing_no
    public static void main(String args[]){
        Increasing_no(5);
        System.out.println("--------------------------------");
        Decreasing_no(5);
    }
    public static void Increasing_no(int n){
        //Base Case
        if(n==1){
            System.out.println(1);
            return;
        }

        // Recursive Line
        Increasing_no(n-1);

        // Small Calculation/Works
        System.out.println(n);
    }

    public static void Decreasing_no(int n){
        //Base Case
        if(n==1){
            System.out.println(1);
            return;
        }

        // Small Calculation/Works
        System.out.println(n);

        // Recursive Line
        Decreasing_no(n-1);
    }
}