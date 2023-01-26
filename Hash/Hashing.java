package JavaDSA.Hash;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set =new HashSet<>();
        set.add(1);   
        set.add(2);   
        set.add(3);   
        set.add(4);   
        set.add(5);

        System.out.println(set.size());
        
        System.out.println(set.contains(3));
        System.out.println(set.contains(8));

        System.out.println(set);

        set.remove(4);

        System.out.println(set);

        Iterator it = set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        System.out.println(set.isEmpty());
        System.out.println(set.size());

        //cloning of the HashSet
        //first create new HashSet
        HashSet<Integer> clone_set = new HashSet<>();
        clone_set=(HashSet)set.clone();

        System.out.println(clone_set);

        //comparing 2 HashSets
        System.out.println(set.equals(clone_set));

        //HashCodes for the Set
        System.out.println(set.hashCode());
        clone_set.add(0);
        System.out.println(clone_set.hashCode());
        System.out.println(clone_set);

        set.addAll(clone_set);
        System.out.println(set);

    }
}
