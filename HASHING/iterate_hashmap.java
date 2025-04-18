package HASHING;

import java.util.HashMap;
import java.util.Set;
public class iterate_hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("USA",50);
        hm.put("UK",60);
        hm.put("Russia",80);
        System.out.println(hm);

        // Iteration over HashMap
        Set<String> keys=hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("Key = "+k+" , Value = "+hm.get(k));
        }
        System.out.println(hm.entrySet());      // it displays set of key-value pair
    }
}
