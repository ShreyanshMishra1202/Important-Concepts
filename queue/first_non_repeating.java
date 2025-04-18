package queue;
import java.util.*;
public class first_non_repeating {
    public static String nonRepeating(String str){
        int freq[]=new int[26];
        Queue<Character> q=new LinkedList<>();
        String res="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                res="-1";
            }
            else{
                res=String.valueOf(q.peek());
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s="aabccxb";
        System.out.println(nonRepeating(s));
    }
}
