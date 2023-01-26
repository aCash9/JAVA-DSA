package JavaDSA.LinkedList;

import java.util.LinkedList;

public class LinkListing2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        LinkedList<String> list = new LinkedList<>();
        LinkedList<String> num = new LinkedList<>();
        ll.add("Hi");
        ll.add("my");
        ll.add("is");
        ll.add("name");
        ll.add("Akash");
        // this is addition of data to the linked list

        System.out.println(ll);

        ll.remove();
        ll.removeFirst();
        // both remove the first item in the list
        ll.removeLast();
        // removes last
        System.out.println(ll);

        ll.addFirst("Hi");
        ll.addLast("Hi");
        ll.add("my");
        ll.remove("my");
        System.out.println(ll);
        ll.removeFirstOccurrence("Hi");
        System.out.println(ll);

        list.addFirst("shradha");
        list.addFirst("name");
        list.addFirst("my");
        System.out.println(list);

        list.add(2, "is");
        System.out.println(list);

        num.add("1");
        num.add("2");
        num.add("3");
        num.add("4");
        //searching elements in the list
        if(num.contains("2")){
            System.out.println("yes");
        }

        //getting elements at particular index
        System.out.println(num.get(3));
    }
}
