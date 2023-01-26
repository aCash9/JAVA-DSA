package JavaDSA.LinkedList;

import java.util.Currency;

public class LinkedListing {
    Node head;
    private int size;

    LinkedListing() {
        size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        size--;
        head = head.next;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondLastNode = secondLastNode.next;
            lastNode = lastNode.next;
        }
        secondLastNode.next = null;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public int getSize() {
        return size;
    }

    public void reverseLinkList(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next=prevNode;

            //updation
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead =reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }
    public static void main(String[] args) {
        LinkedListing l1 = new LinkedListing();
        LinkedListing l2 = new LinkedListing();
        
        l1.addFirst("name");
        l1.addFirst("my");
        l1.addFirst("Hi");
        l1.printList();

        l1.addLast("is");
        l1.addLast("Akash");
        l1.printList();
        
        l1.removeLast();
        l1.addLast("Garima");
        l1.printList();
        
        l1.removeFirst();
        l1.printList();
        System.out.println(l1.getSize());
        
        l1.reverseLinkList();
        l1.printList();

        l1.head=l1.reverseRecursive(l1.head);
        l1.printList();

    }
}
