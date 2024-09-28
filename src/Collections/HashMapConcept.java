package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
    public static void main(String[] args) {
        //<k,v> pair
        //Data is not added in an ordered way
        //It cannot hold duplicate keys

//        HashMap<String, Integer> hm = new HashMap();
        Map<String, Integer> hm = new HashMap();
        hm.put("Jason", 1234);
        hm.put("Roger", 4567);
        hm.put("Lily", 6456);
        hm.put("Maya", 7866);
        hm.put("Henry", 5453);
        hm.put("Danish", 5453);
        hm.put("Danish", 1111);
        hm.put("Danish", 5555);

        //System.out.println(hm);
        System.out.println(hm.get("Lily"));
        System.out.println(hm.size());
        System.out.println(hm.containsKey("Henry"));
        System.out.println(hm.remove("Henry"));
        System.out.println(hm);

        Map<String, String> hash = new HashMap();
        hash.put("jason.roger@gmail.com", "test@1234");
        hash.put("ben.fletcher@janbask.com", "test@1111");
        hash.put("kerry.wright@janbask.com", "Test@5432");
    }
}
