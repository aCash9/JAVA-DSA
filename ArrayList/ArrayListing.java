package JavaDSA.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListing {
    public static void main(String[] args) {
        // Using ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n;
        // adding data to the list
        // for (int i = 0; i < 5; i++) {
        // n=sc.nextInt();
        // list.add(n);
        // }
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // removing data from the list
        // it is done by giving out the index o fthe data that need to be removed
        list.remove(2);
        System.out.println(list);

        // printing one by one
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // we can add elements to a predefined index
        list.add(2, 3);// this shif ts the other elements to the side
        System.out.println(list);
        if (list.contains(4)) {// checks wheher the list contains the specific element
            System.out.println("List contains 4");
        }
        int index = list.get(2);
        System.out.println(index);// return the data on that particular index

        list.add(0, 5);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.lastIndexOf(5));
        list.remove(5);
        System.out.println(list);

        // to set new value to the prexisting number at a particular index
        list.set(0, 0);
        System.out.println(list);

        // to sort a ArrayList we can use Collection which is predefined in the library
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Suman");
        list2.add("Aman");
        list2.add("Arun");
        list2.add("Akash");

        Collections.sort(list2);
        System.out.println(list2);
    }
}
