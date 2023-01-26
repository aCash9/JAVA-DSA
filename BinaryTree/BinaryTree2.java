package JavaDSA.BinaryTree;

public class BinaryTree2 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class tree {
        static int indx = -1;

        public static Node buildTree(int[] nodes) {
            indx++;
            if (nodes[indx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[indx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        
        static int numberOfNodes(Node root){
            if(root == null)
                return 0;

            int x = numberOfNodes(root.left);
            int y = numberOfNodes(root.right);

            return x+y+1; 
        }

        static int sumOfNodes(Node root){
            if(root == null)
                return 0;

            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);

            return leftSum + rightSum + root.data;
        } 
        public static void main(String[] args) {
            int[] a = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
            Node root = buildTree(a);
            System.out.println(numberOfNodes(root));
            System.out.println(sumOfNodes(root));
        }
    }
}
