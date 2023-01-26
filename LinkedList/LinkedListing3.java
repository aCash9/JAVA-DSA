package JavaDSA.LinkedList;

public class LinkedListing3 {
    // This inner class is made static
    // so that main() can access it
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static LinkedListing3 insert(LinkedListing3 list,int data){
        return list;

    }
    public static void main(String[] args) {
        LinkedListing3 list1 = new LinkedListing3();
        LinkedListing3 list2 = new LinkedListing3();
        
        list1=insert(list1,1);
        list1=insert(list1,2);
        list1=insert(list1,3);
        list1=insert(list1,4);
        list1=insert(list1,5);
        list1=insert(list1,6);
    }
}
