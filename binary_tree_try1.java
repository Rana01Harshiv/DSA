import java.util.Scanner;

class node{
    int data;
    node left,right;

    node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
};

public class binary_tree_try1 {
    static Scanner sc = new Scanner(System.in);

    static node create(){
        node root = null;

        System.out.println("Enter the data: ");
        int data = sc.nextInt();
        
        if(data == -1){
            return null;
        }
        else{
            root = new node(data);
            
            System.out.println("Enter the left child of the data " + data + "  Want to enter the null values (Press -1 )");
            root.left = create();
            
            System.out.println("Enter the right child of the data " + data + "  Want to enter the null values ( Press -1 )");
            root.right = create();

        }
        return root;
    }
    static void display(node root){
        if(root != null){
            display(root.left);
            System.out.println(root.data + "  ");
            display(root.right);
        }
    }


    public static void main(String[] args) {
        node root = create();
        System.out.println("Binary tree");
        display(root);
    }
}
