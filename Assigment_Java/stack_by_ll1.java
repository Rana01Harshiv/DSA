package Assigment_Java;

import java.util.Scanner;

public class stack_by_ll {
    
    static class node{
        int data;
        node next;
        //constructor
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    node top = null;
    //inserting 
    public void push(Scanner sc){
        System.out.println("Enter the data: ");
        int data;
        data = sc.nextInt();
        node newnode = new node(data);
        if(top == null){
            top = newnode;
            System.out.println("Inserted");    
        }
        else{
            newnode.next= top;
            top = newnode;
            System.out.println("Inserted");    
        }
    }
    //deleting
    public void pop() {
        if(top == null){
            System.out.println("Stack is not existed");
        }
        else{
            top = top.next;
        }
    }
    // for taking the top position
    public void peek() {
        if(top == null){
            System.out.println("Stack is Empty");
        }else
            
            System.out.println(top.data);
        
        
    }
    //for display
    public void display() {
        node temp = top;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }        
    }
    public static void main(String[] args) {
        stack_by_ll sl = new stack_by_ll();
        Scanner sc = new Scanner(System.in);
        int ch;

        do{
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.peek");
            System.out.println("4.display");
            System.out.println("5.exit");

            System.out.println("Enter the choise");
            ch = sc.nextInt();
            
            switch(ch){
                case 1:
                    sl.push(sc);
                    break;
                case 2:
                    sl.pop();
                    break;
                case 3:
                    sl.peek();
                    break;
                case 4:
                    sl.display();
                    break;
                case 5:
                    System.out.println("you choose the exit");
                    break;
                default:
                    System.out.println("You enter the wrong number");
            }

            
            
        }while(ch != 5);    
        sc.close();
    }
}
