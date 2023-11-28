package Assigment_Java;

import java.util.Scanner;

class circular_queue {
    
    // rear for the inserting and front for the deleting the elements
    // add == rear // del == front
    int add = -1, del = -1,i;  
    int n = 3;
    int arr[] = new int[n];

    void enqueue(Scanner sc) {
        if (del == (add + 1)%n) {
            System.out.println("The Queue is Full");
        } else {
            System.out.println("Enter the data: ");
            int data = sc.nextInt();
            if (add == -1 && del == -1) {
                add = 0;
                del = 0;
                arr[add] = data;
                System.out.println("Element Inserted Successfully");

            } else {
                add = (add+1)%n;
                arr[add] = data;
                System.out.println("Element Inserted Successfully");
            
            }
        }

    }

    void dequeue() {
            if(add == -1 && del == -1){
                System.out.println("The Queue is Empty");
            }
            else if(add == del && add == n-1){
                System.out.println("The Queue is Empty");
                add = -1;
                del = -1;

            }
            else{
                del = (del+1)%n;
                System.out.println("Element Deleted Successfully");
            }
    }

    void display() {
        int i;
        System.out.println("Elements are: ");
        for(i = del;i != add;i=(i+1)%n){
            System.out.println(arr[i]);
        }
        System.out.println(arr[i]);
    }

    public static void main(String[] arg) {
        int ch;
        Scanner sc = new Scanner(System.in);
        circular_queue q1 = new circular_queue();

        do {
            System.out.println("1. Insert \n 2.Delete \n 3.Display \n 4.Exit");
            System.out.println("Enter the choice:");
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    q1.enqueue(sc);
                    break;

                case 2:
                    q1.dequeue();
                    break;

                case 3:
                    q1.display();
                    break;

                case 4:
                    System.out.println("Exist the Program");
                    break;
                default:
                    System.out.println("Invalid Choise...");
            }

        } while (ch != 4);

        sc.close();
    }
}
