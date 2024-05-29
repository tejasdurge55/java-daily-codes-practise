
package tree_basics;
import java.util.*;
//preorder hlr
//inorder lhr
//postorder lrh
public class creating_tree_and_traversal_in_tree {
    public static void main(String[] args) {
        //System.out.println("Enter the root node value :");
        Node root=createTree();
        preorderTraversal(root);
        inorderTraversal(root);
        postorderTraversal(root);
    }
    static Node createTree(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the root value :");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        Node root=new Node(data);
        System.out.println("Enter the leftnode value for:" + data);
        root.left=createTree();
        System.out.println("Enter the rightnode value :" + data);
        root.right=createTree();
        return root;
    }
    static void preorderTraversal(Node root){
        if(root==null){return;}
        System.out.println(root.data);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    static void inorderTraversal(Node root){
        if(root==null){return;}
        
        inorderTraversal(root.left);
        System.out.println(root.data);
        inorderTraversal(root.right);
        
    }
    static void postorderTraversal(Node root){
        if(root==null){return;}
        
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.println(root.data);
    }
    
}
class Node{
    
    Node left;
    Node right;
    int data;
    
    Node(int data){
        this.data=data;
    }

}
