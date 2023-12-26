package Tree;
import java.util.Scanner;


class node{
    node left,right;
    int data;
    
    public node (int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class binarytree {
    static Scanner sc = new Scanner(System.in);

    static node create(){
        node root = null;

        System.out.println("Enter the value");
        int data = sc.nextInt();
        
        if(data == -1){
            return null;
        }else{
            root = new node(data); // creating the new node of the tree 
            System.out.println("enter the left child of " + data+" Want to Enter the null value press (-1)");
            root.left= create();
        
            System.out.println("enter the right child of " + data+" Want to Enter the null value press (-1)");
            root.right= create();
        }
        return root;
    }
    // order of displaying the data 
    // left-root-right

    static void display(node root){
        if(root != null){
            display(root.left);
            System.out.println(root.data + "  ");
            display(root.right);
        }
       
    }
    
    public static void main(String[] args) {
        node root = create(); // call the create method 
        System.out.println("Binary tree in acesing order: ");
        display(root);
    }    
}