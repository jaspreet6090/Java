import java.util.*;
import java.util.LinkedList;

public class KthLevel{
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

    //Approach 1 


    public static void level(Node root, int k){
        //level order 
        
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int i =0;
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                i++;
                // System.out.println();
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if(i == k){
                    System.out.print(currNode.data+" ");

                }
                 if(currNode.left != null){
                    q.add(currNode.left);

                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    //--------------------------------------------------------------------------------------------------------------------

    // Approach 2

    public static void KLevel(Node root , int level , int k) {
         if(root == null){
            return;

         }
         if(level == k ){
            System.out.print(root.data+" ");
            return;
         }
         KLevel(root.left, level+1 , k);
         KLevel(root.right, level+1, k);


    }
    public static void main(String[] args) {
         /*         1
                 /   \
                2     3
               / \   /  \            
              4   5 6   7
          */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        level(root, 2);
        System.out.println();
        KLevel(root, 0, 2);
    }
}