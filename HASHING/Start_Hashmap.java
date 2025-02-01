import java.util.HashMap;
public class Start_Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("USA",50);
        System.out.println(hm);
        hm.put("India", 120);
        System.out.println(hm);
    }
}
