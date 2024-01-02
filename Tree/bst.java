package Tree;
import java.util.Scanner;

class node{
    int data;
    node left,right;

    node(int data){
        this.data= data;
        this.left = null;
        this.right = null;
    }
}

class binaryst{
        
    binaryst(){

    }
    node create(node root,int data){
     
        if(root == null){
        
            root = new node(data);
            return root;    

        }   
        
        if(root.data > data){
            // left substree
            root.left = create(root.left, data);
        }
        else{
            // right substree
            root.right = create(root.right, data);
        }
        
        return root;
    }
    
    public static void inorder(node root){
        if(root == null){
            return;
            
        }
        else{
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
    boolean search(node root,int data){
        
        if(root == null){
            return false;
        }

        if(root.data > data){
            return search(root.left, data);
        }else if(root.data == data){
            return true;
        }else{
            return search(root.right, data);
        }

    }
}


public class bst {

    public static void main(String[] args) {
        int arr[] = {5,1,3,4,2,7};
        node root = null;
        binaryst bnstr = new binaryst();

        for(int i =0;i<arr.length;i++){
           root = bnstr.create(root, arr[i]);    
        }

        bnstr.inorder(root);

        boolean found = bnstr.search(root, 3);
        System.out.println(found);
    }
}
