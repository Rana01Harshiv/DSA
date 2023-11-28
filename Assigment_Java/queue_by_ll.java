package Assigment_Java;

import java.util.Scanner;
class queuell{

        static class node{
            int data;
            node next;
            node(int data){
                this.data = data;
                this.next = null;
            }
        }
        node add = null;
        node del = null;

        void enqueue(Scanner sc){
                int data;
                System.out.println("Enter the data: ");
                data = sc.nextInt();
                node newnode = new node(data);
                if(add == null){
                    add = newnode;
                    del = newnode;
                }
                else{
                    add.next = newnode;
                    add = newnode;
                }
        }

        void dequeue(){
                if(del == null){
                    System.out.println("Queue is underflow");
                }
                else{
                    del = del.next;
                }
        }

        void display(){
                node temp = del;
                while(temp != null){
                    System.out.println(temp.data);
                    temp = temp.next;
                }
        }


}

public class queue_by_ll {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queuell qll = new queuell();
        int ch;
        do{
                System.out.println("1.Enqueue");
                System.out.println("2.Dequeue");
                System.out.println("3.Display");
                System.out.println("4.Exit");
                System.out.println("Enter the choise: ");
                ch = sc.nextInt();

                switch(ch){
                    case 1:
                            qll.enqueue(sc);
                            break;
                    case 2:
                            qll.dequeue();
                            break;
                    case 3:
                            qll.display();
                            break;
                    case 4:
                            System.out.println("you choose the exit");
                            break;
                    default:
                            System.out.println("Invalid input");
                }
        }while(ch!=4);
        
        sc.close();
    }
}
