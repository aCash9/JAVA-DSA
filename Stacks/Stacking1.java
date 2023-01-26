package JavaDSA.Stacks;

//Implementation of Stack using LinkedList
public class Stacking1 {
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head;

        public static void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static boolean isEmpty() {
            return head == null;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            Node top = head;
            head = head.next;

            return top.data;
        }

        public static int peak(){
            if (isEmpty()) {
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();

        while(!stack.isEmpty()){
            System.out.println(stack.peak());
            stack.pop();
        }
    }
}
