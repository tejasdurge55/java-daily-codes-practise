//https://practice.geeksforgeeks.org/problems/max-and-min-element-in-binary-tree/1
package tree_basics;
import java.util.*;
public class Max_and_min_element_in_Binary_Tree_gfg {
    public static void main(String[] args) {
        Node roota=createTree();
        System.out.println(findMax(roota));
        System.out.println(findMin(roota));
    }
    static int findMax(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(findMax(root.left),findMax(root.right)));
    }
    static int findMin(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data,Math.min(findMin(root.left),findMin(root.right)));
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