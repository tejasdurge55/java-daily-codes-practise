//https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1
package tree_basics;
import java.util.*;

public class Height_of_Binary_Tree {
    public static void main(String[] args) {
        Node roota=createTree();
        System.out.println(height(roota));
    }
    static int height(Node node) 
    {
        if (node==null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right))+1;
 
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
}
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}