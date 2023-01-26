package JavaDSA.Hash;

import java.util.HashMap;
import java.util.Map;

public class Hashing2 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        // key,Value
        // insertion of data
        map.put('a', 1);
        map.put('b', 69);
        map.put('a', 2);
        map.put('d', 1);

        System.out.println(map.containsKey('a'));
        System.out.println(map.containsValue(1));
        System.out.println(map.get('b'));
        System.out.println(map);
        System.out.println(map.size());

        // Removing data
        map.remove('b', 1);
        System.out.println(map);

        if (map.containsKey('a')) {
            System.out.println(map.get('a'));
        }
        // transversing constructors in java
        // Usually we do for(int i=0;i<n;i++)
        // { system.out.print(arr[i]);}

        // now we do
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            System.out.print("Key  " + e.getKey());
            System.out.print("   Value  " + e.getValue() + "\n");
        }
        // adding data to the intially inputted data
        map.compute('a', (key, val) -> (val == null)
                ? 1
                : val + 1);

        map.compute('a', (key, val) -> val+1);
        System.out.println(map);
        
        //for a string map system
        //we can use concat instead of "val+1" or "val==null"
        //val.concat("any string");
        //this is used to add to the preexisting string that was intialized in the specific key
    }
}
