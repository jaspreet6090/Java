import java.util.*;
import java.util.LinkedList;

public class BinaryTrees { 
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{ //O(n) - Preorder tree
        static int idx = -1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;

            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        //Preorder Traversal
        public  void preorder(Node root){ //O(n)
            if(root == null){
                // System.out.print("-1 ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        //Inorder Traversal
        public void inorder(Node root){ //O(n)
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        //Postorder Traversal
        public void postorder(Node root){ //O(n)
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        //level Order Traversal
        public void Levelorder(Node root){ //O(n)
            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);

                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        //preorder binary tree
        int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);

        //preorder => 1,2,4,5,3,6
       System.out.println("Preorder: "); 
       tree.preorder(root);
       System.out.println();

        //inorder => 4,2,5,1,3,6
        System.out.println("Inorder: "); 
        tree.inorder(root);
        System.out.println();

        //postorder =>  4,5,2,6,3,1
        System.out.println("Postorder: "); 
        tree.postorder(root);
        System.out.println();

        //levelorder => 1,2,3,4,5,6
        System.out.println("Levelorder: "); 
        tree.Levelorder(root);
        System.out.println();
    }
}
