import java.util.Scanner;

class node {
    int data;
    node next;

    // constructor of the node class
    node(int data) {
        this.data = data;
        this.next = null;

    }
}

class linked_list_strut {
    private node head;

    linked_list_strut() {
        this.head = null;
    }

    public void push(int data) {
        node newnoNode = new node(data);
        if (head == null) {
            head = newnoNode;
        } else {
            newnoNode.next = head;
            head = newnoNode;
        }
        System.out.println("Element " + data + " inserted successfully");
    }

    public void pop() {
        if (head == null) {
            System.out.println("The list is empty");
        } else {
            head = head.next;
            System.out.println("Value Poped successfully");
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        } else {
            System.out.println("Elements are: ");
            node current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }

        }
    }
}

public class linked_list {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linked_list_strut lls = new linked_list_strut();
        boolean flag= true;
        while(flag){
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter the choise: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                        System.out.println("Enter the data: ");
                        int data = sc.nextInt();
                        lls.push(data);
                        break;
                case 2: 
                        lls.pop();
                        break;
                case 3:
                        lls.display();
                        break;
                default:
                        System.out.println("Existed the program...");
                        flag = false;
                        break;
            }

        }
        sc.close();
    }
}
