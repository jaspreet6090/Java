import java.util.*;
public class RootToLeaf {
   
        static class Node {
            int data;
            Node left;
            Node right;
    
            Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
    
        public static Node insert(Node root, int val) {
            if (root == null) {
                return root = new Node(val);
            }
            if (root.data > val) {
                // left subtree
                root.left = insert(root.left, val);
            } else {
                // right subtree
                root.right = insert(root.right, val);
            }
            return root;
        }
    
        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
    
        }   

        public static void printPath(ArrayList<Integer> path) {
            for(int i= 0 ; i < path.size() ; i++) {
                System.out.print(path.get(i)+"->");

            }
            System.out.println("Null");
        }

        public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
            if (root == null) {
                return;
            }

            path.add(root.data);

            if(root.left == null && root.right == null){
                printPath(path);
            }

            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
    
     
        public static void main(String[] args) {
            int val[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
            Node root = null;
    
            for (int i = 0; i < val.length; i++) {
                root = insert(root, val[i]);
            }
    
                inorder(root);
    
                System.out.println();

                printRoot2Leaf(root, new ArrayList<Integer>());
                

                // output
                // 1 3 4 5 6 8 10 11 14 
                // 8->5->3->1->Null
                // 8->5->3->1->4->Null
                // 8->5->3->1->4->6->Null
                // 8->5->3->1->4->6->10->11->14->Null
        }
    
    }
    

