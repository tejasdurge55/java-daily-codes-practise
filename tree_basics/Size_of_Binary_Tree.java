//https://practice.geeksforgeeks.org/problems/size-of-binary-tree/1
package tree_basics;
import java.util.*;
public class Size_of_Binary_Tree {
    public static void main(String[] args) {
        Node roota=createTree();
        System.out.println(getSize(roota));
    }
    static int getSize(Node root)//5
    {
        if (root==null) {
            return 0;
        }
        return getSize(root.left)+getSize(root.right)+1;
        //10
        //5left=0
        //1 1        2
        //1left=0
        //1right=0
        

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