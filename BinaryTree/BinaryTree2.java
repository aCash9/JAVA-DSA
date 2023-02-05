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
        public static int leftSum(Node root, int sum){
            if(root == null)
                return 0;
            if(root.left == null)
                return 0;
    
            if(root.left.left == null && root.left.right == null)
                sum += root.left.data;
            sum += leftSum(root.left,sum);
            sum += leftSum(root.right,sum);
    
            return sum;
        }

        public static int sumOfLeftLeaves(Node root) {
            int sum = leftSum(root,0);
            return sum;
        }
        public static void main(String[] args) {
            int[] a = { 3,9,20,-1,-1,15,7,-1,-1,-1,-1};
            Node root = buildTree(a);
            int sum = sumOfLeftLeaves(root);
            System.out.println(sum);
            // System.out.println(sumOfNodes(root));
        }
    }
}
