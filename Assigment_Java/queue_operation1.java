package Assigment_Java;

import java.util.Scanner;

class queue1 {

    int add = -1, del = -1,i;
    int n = 3;
    int arr[] = new int[n];

    void enqueue(Scanner sc) {
        if (add == (n - 1)) {
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
                add++;
                arr[add] = data;
                System.out.println("Element Inserted Successfully");
            
            }
        }

    }

    void dequeue() {
            if(add == -1 && del == -1){
                System.out.println("The Queue is Empty");
            }
            else{
                del++;
                System.out.println("Element Deleted Successfully");
            }
    }

    void display() {
        if(add != -1 && del !=-1){
            System.out.println("Elements Are: ");
            for(i = del;i<=add;i++){
                System.out.println(arr[i]);
            }
        }else{
            System.out.println("The Queue is empty");
        }
    }

    public static void main(String[] arg) {
        int ch;
        Scanner sc = new Scanner(System.in);
        queue1 q1 = new queue1();

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
