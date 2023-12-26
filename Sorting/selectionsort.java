package Sorting;

// Online Java Compiler
// Use this editor t
import java.util.Scanner;
class selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements want to enter: ");
        int n =  sc.nextInt();
        
        int a[];
        a = new int[n];
        System.out.println("Enter the elements: ");
        
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
        System.out.println("Unsorted elements");
        
        for(int i =0;i<n;i++){
            System.out.println(a[i]);
        }
        /*
            input 90 40 10 88
            i,loc = 0
            j = 1
            1<4   4 = n
                a[1]<a[0]
                    loc = 1

            j = 2
                a[2]<a[0]
                    loc =2
        
                    
        */
        
        // seletion sort method
        for(int i =0;i<n-1;i++){            
            int loc = i; 
            for(int j =i+1;j<n;j++){
                if(a[j]<a[loc]){
                    loc = j;
                }
            }
            int temp = a[i];
            a[i] = a[loc];
            a[loc] = temp;
        }
        
        System.out.println("Sorted elements");
        
        for(int i =0;i<n;i++){
            System.out.println(a[i]);
        }
        
    sc.close();
    }
}