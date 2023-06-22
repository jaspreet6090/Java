

public class BST {
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

    public static Node insert(Node root, int val){
        if(root == null){
            return root = new Node(val);
        }
        if(root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        } else {
            //right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
        

    }

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data > key){
            return search(root.left, key);
        }
        else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val){
        if(root.data < val ){
            root.right = delete(root.right, val);

         } else if(root.data > val){
            root.left = delete(root.left, val);
         }

         else{ //viola
            //case 1 no child
            if(root.left == null && root.right == null){
                return null;
            } 

            //case 2 single child
            if(root.left == null){
                return root.right;
            } else if( root.right == null){
                return root.left;
            }

            //case 3 both children
            Node IS = findInorderSuccesor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
         }

         return root;

    }

    public static Node findInorderSuccesor(Node root){
        while (root.left != null){
            root = root.left;
        }

        return root;
    }


    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int  i = 0; i < val.length; i++) 
        {
            root = insert(root, val[i]);
        }

         inorder(root);

        // if(search(root, 2)){
        //     System.out.println("found");

        // } else{
        //     System.out.println("Not found");
        // }
            System.out.println();
        delete(root, 1);

        inorder(root);
        
    }
}

