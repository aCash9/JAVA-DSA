package JavaDSA.BinaryTree;

import java.util.*;

public class BinaryTree {
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

        public static void preorder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            preorder(root.left);
            System.out.print(root.data + " ");
            preorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            preorder(root.left);
            preorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelorder(Node root) {
            if (root == null)
                return;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node curr = q.remove();
                if (curr == null) {
                    System.out.println();
                    if (q.isEmpty())
                        break;
                    else
                        q.add(null);
                } else {
                    System.out.print(curr.data + " ");

                    if (curr.left != null)
                        q.add(curr.left);
                    if (curr.right != null)
                        q.add(curr.right);
                }

            }
        }
        public static void helper(Node root,ArrayList list, int level){
            if(root==null)
                return;
            if(list.get(level)==null)
                list.add(root);
            
            helper(root.left, list, level+1);
            helper(root.right, list, level+1);
        }
        public static void leftView(Node root){
            ArrayList<Node> list = new ArrayList<>();
            helper(root,list,0);
            for(Node i : list){
                System.out.println(i.data);
            }
        }

        public static void main(String[] args) {
            int[] a = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
            Node root = buildTree(a);
            levelorder(root);
            leftView(root);
        }
    }

}
