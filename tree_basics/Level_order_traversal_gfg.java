//https://practice.geeksforgeeks.org/problems/level-order-traversal/1
package tree_basics;
import java.util.*;
public class Level_order_traversal_gfg {
    public static void main(String[] args) {
        Node roota=createTree();
        System.out.println(levelOrder(roota) );
    }
    static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayDeque<Node> q=new ArrayDeque<>();
        q.addLast(node);
        while(!q.isEmpty()){
            //if()
            Node firstele= q.peek();
            if(firstele.left!=null){
                q.addLast(firstele.left);
            }
            if(firstele.right!=null){
                q.addLast(firstele.right);
            }
            arr1.add(firstele.data);
            q.removeFirst();
        }
        return arr1;
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