public class subseq_string {
    public static void main(String[] args) {
        subseq("abc","");
    }
    public static void subseq(String s,String ans) {
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        subseq(s.substring(1),ans);
        subseq(s.substring(1),ans+s.charAt(0));
    }
}
