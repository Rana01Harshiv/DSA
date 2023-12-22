import java.util.Scanner;

public class exxx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedlist ll = new linkedlist();    
        int ch,val,pos;
        boolean flag = true;
        while(flag){
            System.out.println("1.Insert at begin");
            System.out.println("2.Insert at end");
            System.out.println("3.Insert at position");
            System.out.println("4.delete at begin");
            System.out.println("5.delete at end");
            System.out.println("6.delete at position");
            System.out.println("7.display");
            System.out.println("8.exit");

            System.out.println("Enter the choise: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                        System.out.println("Enter the data: ");
                        val = sc.nextInt();
                        ll.insertatstart(val);
                        System.out.println("added successfully");
                        break;
                case 2:
                        System.out.println("Enter the data: ");
                        val = sc.nextInt();
                        ll.insertatlast(val);
                        System.out.println("added successfully");
                        break;
                case 3:
                        System.out.println("Enter the pos: ");
                        pos = sc.nextInt();
                        System.out.println("Enter the data: ");
                        val = sc.nextInt();
                        ll.insertatpos(pos, val);
                        System.out.println("added successfully");
                        break;


                case 4:
                        ll.deleteatstart();
                        System.out.println("deleted successfully");
                        break;
                case 5:
                        ll.deleteatend();
                        System.out.println("deleted successfully");
                        break;
                case 6:
                        System.out.println("Enter the pos: ");
                        pos = sc.nextInt();
                        ll.deletewithpos(pos);
                        System.out.println("deleted successfully");
                        break;
               
                case 7:
                        System.out.println("Elements : ");
                        ll.display();
                        break;

                case 8:
                        flag = false;
                        break;
                default:
                        System.out.println("Invalid vlaue");
                        break;

            }

        }
        sc.close();
    }
}
class linkedlist{
    
    static class node{
        int data;
        node next;
        node(int data){
            this.data= data;
            this.next = null;
        }
    }
    node head = null;
    void insertatstart(int val){
        node newnode = new node(val);

        if(head == null){
            head = newnode;
            System.out.println("First node");
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }
    void insertatlast(int val){
        node newnode = new node(val);
        if(head == null){
            head = newnode;
            System.out.println("First node");
        }
        else{
            node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    void insertatpos(int pos,int val){
        node newode = new node(val);
        if(head == null){
            head = newode;
            System.out.println("First node");
        }
        else{
            node temp = head;
            if(pos == 1){
                insertatstart(val);
            }
            else{
                for(int i =2; i<pos; i++){
                    temp= temp.next;
                }
                newode.next = temp.next;
                temp.next = newode;
            }
        }
    }
    void deleteatstart(){
        if(head == null){
            System.out.println("Emptyyy");
        }
        else{
            node temp = head;
            temp = temp.next;
            head = temp.next;
            System.out.println("deleted Succesfullyy");
        }
    }
    void deleteatend(){
        if(head == null){
            System.out.println("Emptyyy");
        }
        else{
            node temp = head;
            node ptr = temp.next;
            while(ptr.next != null){

                temp = ptr;
                ptr = ptr.next;
            }
            temp.next = null;
            System.out.println("deleted Succesfullyy");

        }
    }
    void deletewithpos(int pos){
        if(head == null){
            System.out.println("Emptyyy");
        }
        else if(pos == 1){
            deleteatstart();
        }
        else{
            node temp = head;
            node ptr = temp.next;
            for(int i =2;i<pos;i++){
                temp = temp.next;
                ptr = ptr.next;
            }
            temp.next = ptr.next;

        }
    }
    void display(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}
