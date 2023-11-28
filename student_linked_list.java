import java.util.Scanner;

class stud_node {

    int rollno;
    String name;
    String mail;
    float perc;
    stud_node next;

    stud_node(int rollno, String name, String mail, float perc) {
        this.rollno = rollno;
        this.name = name;
        this.mail = mail;
        this.perc = perc;
        this.next = null;
    }

}

class stud_node_create {
    private stud_node head;

    stud_node_create() {
        head = null;
    }

    public void push(int rollno, String name, String mail, float perc) {
        // create the object for the new student and calling the constructor of the
        // stud_node class so that new student will be add in the list
        stud_node newstudent = new stud_node(rollno, name, mail, perc);
        if (head == null) {
            head = newstudent;
        } else {
            newstudent.next = head;
            head = newstudent;
        }
        System.out.println("Student added Successfullyy");
    }

    public void pop() {
        if (head == null) {
            System.out.println("The list is Empty");
        } else {
            head = head.next;
            System.out.println("Value Poped successfully");
        }
    }

    public void display() {
        stud_node current = head;
        if (head == null) {
            System.out.println("The list is Empty");
        } else {
            System.out.println("Student Deatils: ");
            while (current != null) {
                System.out.println("Rollno: "+current.rollno);
                System.out.println("Name: "+current.name);
                System.out.println("MailID: "+current.mail);
                System.out.println("Percentage: "+current.perc);
                current = current.next;
                System.out.println(" ");
            }
        }
    }
}

public class student_linked_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stud_node_create stud_obj = new stud_node_create();
        boolean flag = true;
        System.out.println("-------Student Managment System--------");
        while(flag){
            System.out.println("1.Push");    
            System.out.println("2.Pop");    
            System.out.println("3.Display");    
            System.out.println("4.Exit");    
            System.out.println("enter the choise: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:

                    System.out.println("Enter the Rollno: ");
                    int rollno = sc.nextInt();
                    System.out.println("Enter the Name: ");
                    String name = sc.next();
                    System.out.println("Enter the MailID: ");
                    String mail = sc.next();
                    System.out.println("Enter the Percentage");
                    Float perc = sc.nextFloat();
                    stud_obj.push(rollno, name, mail, perc);
                    break;
                
                case 2:
                    stud_obj.pop();
                    break;

                case 3:
                    stud_obj.display();
                    break;

                default:
                    System.out.println("Existed into the program");
                    flag = false;
                    break;
                }    
        }
        sc.close();
    }
}
