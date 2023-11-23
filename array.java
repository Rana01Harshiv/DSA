import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int n ;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();

        int num[] = new int[n];
        System.out.println("Enter the " + n + " Number of values");
        //take the multiple input
        for(int i = 0;i<n;i++){
            num[i] = sc.nextInt();
        }
        // for printing the elements
        switcharray obj = new switcharray();
        obj.printing(num,n);
        obj.insertatpos(num, n);
        


        sc.close();
    }
}