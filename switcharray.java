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

    public void insertatpos(int num[],int n) {
        int pos;
        System.out.println("Enter the positon number that you want to enter: ");
        pos = sc.nextInt();

        System.out.println("enter the element: ");
        int ele = sc.nextInt();
        for (int i = n;n>pos;n--){
            num[i] = num[i+1];
        }
        num[pos] = ele;
        n++;
        //printing(num, n);
         System.out.println("Array after the insertion: ");
         for(int i = 0;i<n;i++){
             System.out.println(num[i]);
         }
    }

}
