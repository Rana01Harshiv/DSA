import java.util.Scanner;

public class queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // making the object
        queue_operaions obj_queue_op = new queue_operaions();

        int ch;
        do {
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter the Choise: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    obj_queue_op.enqueue(sc);
                    break;
                case 2:
                    obj_queue_op.dequeue();
                    break;
                case 3:
                    obj_queue_op.display();
                    break;
                default:
                    System.out.println("Exit the program....");
                    break;
            }
        } while (ch!=4);
        sc.close();
    }
}
