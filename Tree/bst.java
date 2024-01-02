


public class bst {
    
    class node{
        int data;
        node left,right;
    
        node(int data){
            this.data= data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static node binaryst(node root,int val){
        if(root == null){
            root = new node(val);
            return root;
            
        }
        if(root.data > val){
            // left substree
            root.left = binaryst(root.left, val);
        }
        else{
            // right substree
            root.right = binaryst(root.right, val);
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
    

    public static void main(String[] args) {
        int arr[] = {5,1,3,4,2,7};
        node root = null;
        
        for(int i =0;i<arr.length;i++){
            root = binaryst(root, arr[i]);
        }
        inorder(root);
    }
}
