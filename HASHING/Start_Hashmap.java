import java.util.HashMap;
public class Start_Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        // Insert
        hm.put("India",100);
        hm.put("China",150);
        hm.put("USA",50);
        System.out.println(hm);
        // Update
        hm.put("India", 120);
        System.out.println(hm);
        // fetch the value for a key
        System.out.println("Population of India = "+hm.get("India")); // hm.get("India") gives value corresponding to India
        System.out.println(hm.get("Nepal"));    // hm.get("Nepal") gives null as nepal is not key in hm hashmap

        System.out.println(hm.containsKey("Nepal"));    // False
        System.out.println(hm.containsKey("India"));    // True
        // REMOVE
        hm.put("Nepal",5);
        System.out.println(hm);
        hm.remove("Nepal");     // if key is not present, it returns null
        System.out.println(hm);
        // SIZE
        System.out.println(hm.size());
        // is empty()
        System.out.println(hm.isEmpty());   // false as it is not empty
        // clear the map
        hm.clear();
        System.out.println(hm);
    }
}
