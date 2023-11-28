package Assigment_Java;

import java.util.Scanner;

public class doubly_ll {
    
    static class node{
        int bookid;
        int price;
        String title;
        node next;
        node prev;

        node(int bookid,String title,int price){
                this.bookid = bookid;
                this.title = title;
                this.price = price;
                this.next = null;
                this.prev = null;

        }
    }
        node head = null;
        node tail = null;
        int link = 0;

        void insert (int bookid,String title,int price){
            node newnode = new node(bookid,title,price);
            if(head == null){
                head = newnode;
                link ++;
                System.out.println( link +"Exists");
                return;
            }else{
                node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newnode;
                newnode.prev = temp;
                tail = newnode;
                link++;
                System.out.println( link +"Exists");
                return;
            }


        }
        void delete(int bookid){
            
            if (bookid == head.bookid) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
                link--;
                System.out.println("Deleted Value Successfully");
                return;
            }

            node current = head.next;
            
            while(current != null){
                if(bookid == current.bookid){
                    node temp = current.prev;
                    node temp2 = current.next;

                    temp.next = current.next;
                    temp2.prev = current.prev;
                    System.out.println("Deleted Valued Successfully");
                    link--;
                }
                current = current.next;
            }
        }
        void search(String title){
            node temp = head;
            System.out.println("BookID \t Title \t Price");
            while(temp != null){
                if(temp.title.equalsIgnoreCase(title)){
                    System.out.println(temp.bookid+ " " + temp.title+" " + temp.price);
                }
                temp = temp.next;
            }
        }
        void display(){

            if(head == null){
                System.out.println("Linked List is not Exists");
            }
            else{
                System.out.println("BookID \t Title \t Price");
                node temp = head;
                while(temp != null){
                    System.out.println(temp.bookid+" "+ temp.title+ " "+temp.price);
                    temp = temp.next;
                }
                System.out.println();
                return;
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            doubly_ll dl = new doubly_ll();
            int ch,bookid,price;
            String title;
            while(true){
                System.out.println("1.Insert");
                System.out.println("2.Delete via tha BookID");
                System.out.println("3.Search");
                System.out.println("4.Display");
                System.out.println("5.Exit");
                System.out.println("Enter the choise: ");
                ch = sc.nextInt();
                switch(ch){
                    case 1:
                            System.out.println("Enter the Book ID: ");
                            bookid = sc.nextInt();
                            System.out.println("Enter the Book Title: ");
                            title = sc.next();
                            System.out.println("Enter the Book Price: ");
                            price = sc.nextInt();
                            dl.insert(bookid, title, price);
                            break;
                    case 2:
                            System.out.println("Enter the Book ID: ");
                            bookid = sc.nextInt();
                            dl.delete(bookid);
                            break;
                    case 3:
                            System.out.println("Enter the Book Name: ");
                            title = sc.next();
                            dl.search(title);
                            break;
                    case 4:
                            dl.display();
                            break;
                    case 5:
                            System.out.println("You choose the Exit...");
                            sc.close();
                            System.exit(0);
                    default:
                            System.out.println("Invalid Choise");

                }

            }
            
        }
    }
