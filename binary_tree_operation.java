import java.util.Scanner;

class node{
    
    node left,right;
    int data;
    node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class treeop{
    static Scanner sc = new Scanner(System.in);

    node create(){
        
        node root = null;
        
        System.out.println("Enter the data: ");
        int data = sc.nextInt();
        
        if(data == -1){
            return null;
        }
        else{
            
            root = new node(data);

            System.out.println("Enter the Left child of the root " + data + "For null Press -1");
            root.left= create(); 
        
            System.out.println("Enter the Right child of the root " + data + "For null Press -1");
            root.right= create();
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
            System.out.println(root.data + "  ");
            inorder(root.left);
            inorder(root.right);
        }
    }
    
    void postorder(node root){
        if(root == null){
            return;
        }
        else{
            inorder(root.left);
            inorder(root.right);
            System.out.println(root.data + "  ");
        }
    }
}

public class binary_tree_operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        treeop tpobj = new treeop();
        node root = tpobj.create();
        int ch;
        boolean flag = true;
        while(flag){
            System.out.println("1.Inorder");
            System.out.println("2.Preorder");
            System.out.println("3.Postorder");
            System.out.println("4.Exit");
            
            System.out.println("Enter the choise: ");
            ch = sc.nextInt();
            switch(ch){
                case 1: 
                    System.out.println("Inorder Display----");
                    tpobj.inorder(root);
                    break;
                case 2:
                    System.out.println("Preorder Display----");
                    tpobj.preorder(root);
                    break;
                case 3:
                    System.out.println("Postorder Display----");
                    tpobj.postorder(root);
                    break;
                case 4:
                    System.out.println("Choose the exit----");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choise----");
                    
            }
        }        
        sc.close();
    }
}
