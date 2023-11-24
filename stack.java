import java.util.Scanner;

public class stack {
    public static void main(String arg[]) {
        Scanner sc= new Scanner(System.in);
        stack_operations obj_of_stackop = new stack_operations();
        int ch;
        do {
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.pekk");
            System.out.println("4.display");
            System.out.println("5.exit");
            System.out.println("Enter the choise: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    obj_of_stackop.push(sc);
                    break;
                case 2:
                    obj_of_stackop.pop();
                    break;
                case 3:
                    obj_of_stackop.peek();
                    break;
                case 4:
                    obj_of_stackop.display();
                    break;
                default:
                    break;
            }
            
        } while (ch != 5);
        sc.close();
    }
}
