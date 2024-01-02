package Tree;
import java.util.Scanner;
/*

class node{
    int data;
    node left,right;

    node(int data){
        this.data=data;
        this.left= null;
        this.right = null;  
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
        }
        else{
            root = new node(data);

            System.err.println("Enter the left child data for root " + root.data );
            root.left = create();

            System.out.println("Enter the right child data for the root " + root.data);
            root.right = create();
        }
        return root;
    }

    // inorder
    void inorder(node root){
        if(root == null){
            return;
        }
        else{
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }

    // preorder
    void preorder(node root){
        if(root == null){
            return;
        }
        else{
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    // post order
    void postorder(node root){
        if(root == null){
            return;
        }
        else{
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    }


}

public class bt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // obj creationn
        binarytree bt1 = new binarytree();
        
        //binary tree creation
        node root = bt1.create();

      //  System.out.println(root.data);

        // bt1.create();
        int ch;
        boolean flag = true;

        while(flag){
                System.out.println("1.Preorder");
                System.out.println("2.Postorder");
                System.out.println("3.Inorder");
                System.out.println("4.Exit");
                System.out.println("Enter the choise: ");
                ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("Preorder Travesal");
                        bt1.preorder(root);
                        break;
                    case  2:
                        System.out.println("Post order travesal");
                        bt1.postorder(root);
                        break;
                    case 3:
                        System.out.println("Inorder Travesal");
                        bt1.inorder(root);
                        break;
                    case 4:
                        System.out.println("You choose exit");
                        flag = false;
                        break;
                    default:
                        System.out.println("Enter the wrong value");
                        break;
                }
        }
        sc.close();
    }
}

*/

class node{
    int data;
    node left,right;

    node(int data){
        this.data= data;
        this.left = null;
        this.right = null;
    }

}

class binarytr{
    static Scanner sc = new Scanner(System.in);

    // node creation

    node create(){
         node root = null;

        System.out.println("Enter the data: ");
        int data = sc.nextInt();     
        
        if(data == -1){
            return null;
        }
        else{
            root = new node(data);

            System.out.println("Enter the left child data for root " + root.data);
            root.left= create();

            System.out.println("Enter the right child data for root " + root.data);
            root.right = create();
        }
        return root;
    }

    // inorder travel
    void inorder(node root){
        if(root == null){
            return;
        }
        else{
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }

    //preorder
    void preorder(node root){
        if(root == null){
            return;
        }
        else{
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }

    }

    // post order
    void postorder(node root){
        if(root == null){
            return;
        }
        else{
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        
        }
    }

}


public class bt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        binarytr bnt = new binarytr();
        node root = bnt.create();

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
                    System.out.println("Inorder travel");
                    bnt.inorder(root);
                    break;
                case 2:
                    System.out.println("Preorder travel");
                    bnt.preorder(root);
                    break;
                case 3:
                    System.out.println("Post order");
                    bnt.postorder(root);
                    break;
                case 4:
                    System.out.println("You choose the exit ");
                    flag = false;
                    break;
                default:
                    System.out.println("You enter the wrong choise");
                    break;
            }
        }
        sc.close();
    }
}