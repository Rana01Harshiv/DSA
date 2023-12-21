import java.util.Scanner;
public class switcharray {
    
    Scanner sc = new Scanner(System.in);
    
    public void printing(int num[],int n){
        // print the array elements
        System.out.println("Your Values Are: ");
        for (int i = 0 ;i<n;i++){
            System.out.println(num[i]);
        }
    }
    // insert the position
    public void insertatpos(int num[],int n) {
        int pos;
        
        System.out.println("Enter the positon number that you want to enter: ");
        pos = sc.nextInt();

        System.out.println("enter the element: ");
        int ele = sc.nextInt();

        if (pos < 0 || pos > n) {
            System.out.println("Invalid position to insert.");
            return;
        }
        int num1[] = new int [n+1];
        //        while()
        
        for (int i = n;i>=pos;i--){
            num1[i] = ele;
        }
        n++;
        //printing(num, n);
         System.out.println("Array after the insertion: ");
         for(int i = 0;i<n;i++){
             System.out.println(num1[i]);
         }
    }
    // insert at the end 
    public void insertatend(int num[],int n) {
        System.out.println("enter the element: ");
        int ele = sc.nextInt();
        num[n] = ele;
        n++;
        System.out.println("Array after insertion at the end:");
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }
        

    }

}
