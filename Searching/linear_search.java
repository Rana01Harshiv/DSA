package Searching;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,cnt= 0,item;
        int a[];
        System.out.println("How many elements you want to enter: ");
        n = sc.nextInt();
        
        a = new int[n];

        System.out.println("Enter the data: ");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }        
        System.out.println("Enter the Item that you want to search: ");
        item = sc.nextInt();
        for(int i =0;i<a.length;i++){
            if(a[i] == item){
                cnt++;
                break;
            }
        }
        if(cnt>0){
            System.out.println("Item Found ");
        }else{
            System.out.println("Item is not found");
        }
        sc.close();
    }
}
