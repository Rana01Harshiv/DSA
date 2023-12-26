package Tree;
import java.util.Scanner;
// inorder ( left- root- right )normal expression 
// preorder (root - left -right)
// postorder (left-right-root)

class node{
    node left,right;
    int data;
    
    public node (int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class binarytree1 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        binarytree bt = new binarytree();
        node root = bt.create(); // call the create method 
        System.out.println("Binary tree in acesing order: ");
        
        int ch;
        boolean check=true;
        while(check){
            
            System.out.println("---------------------");
            System.out.println("---Binary Tree Program---");
            System.out.println("1.Inorder");
            System.out.println("2.Preorder");
            System.out.println("3.Postorder");
            System.out.println("4.Exit");
            
            System.out.println("Enter the Choise: ");
            ch = sc.nextInt();
            System.out.println("----------------------");
            
            switch(ch){
                case 1:
                System.out.println("Inorder Display----");
                bt.inorder(root);
                break;
                case 2:
                System.out.println("Preorder Display----");
                bt.preorder(root);
                break;
                case 3:
                System.out.println("Postorder Display----");
                bt.postorder(root);
                break;
                case 4: 
                System.out.println("Exiting the program");
                check = false;
                break;
                default:
                System.out.println("Exiting the program");
            }
        }
        sc.close();
        
        
        
    }    
}
class binarytree{
    static Scanner sc = new Scanner(System.in);
    node create(){
        node root = null;
        System.out.println("Enter the data: ");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }else{
            root = new node(data);

            System.out.println("Enter the Left child of : "+ root.data + " Want to enter the null press (-1) " );
            root.left = create();
        
        
            System.out.println("Enter the Right child of : "+ root.data + " Want to enter the null press (-1) " );
            root.right = create();

        }
        return root;
    }
    void inorder(node root){
        if(root == null){
            return;
        }
        else{
            inorder(root.left);
            System.out.println(root.data + "  ");
            inorder(root.right);
        }
    }
    void preorder(node root){
        if(root == null){
            return;
        }
        else{
            System.out.println(root.data+ "  ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    void postorder(node root){
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data + "  ");
    }
}