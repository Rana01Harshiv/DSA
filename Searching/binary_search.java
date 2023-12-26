package Searching;

import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,cnt= 0,item,beg=0,end,mid=0;
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

        end = n-1;
        while(beg<=end){
                mid = (beg+end)/2;
                if(a[mid] == item){
                    cnt++;
                    break;
                }
                else if(a[mid]>item){
                    end = mid-1;
                }
                else if(a[mid]<item){
                    beg = mid+1;
                }
        }
        mid++;
        if(cnt >0){
            System.out.println("Item Found at "+ mid);
        }else{
            System.out.println("Item not found ");
        }

        sc.close();
    }
}
