public class no_coin_toss {
    public static void main(String[] args) {
        coins(3, "");
    }
    public static void coins(int n,String s){
        
        // SPECIAL CONDITION FOR REMOVING CONSECUTIVE HEADS
        if(s.length()>1 && s.charAt(s.length()-1)=='H' && s.charAt(s.length()-2)=='H'){
            return;
        }


        if(n==0){
            System.out.println(s);
            return;
        }
        coins(n-1, s+"H");
        coins(n-1, s+"T");
    }
}
