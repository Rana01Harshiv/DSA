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
        int ch;
        do{
            System.out.println("1.Insert at pos");
            System.out.println("2.Insert at end");
            System.out.println("3.Delete at pos");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println("Enter the choise: ");
            ch = sc.nextInt();
            // making the object
            switcharray obj = new switcharray();
             
            switch(ch){
                case 4:
                    obj.printing(num,n);
                    break;
                case 1:
                    obj.insertatpos(num, n);
                    break;
                case 5:
                    System.out.println("Exit the program");
                    break;
                case 2:
                    obj.insertatend(num, n);
                    break;
            }

        }while(ch != 5);
        


        sc.close();
    }
}