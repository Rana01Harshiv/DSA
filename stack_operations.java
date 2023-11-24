import java.util.Scanner;

public class stack_operations {
    Scanner sc = new Scanner(System.in);
    int size = 5,top =-1,i,j;
    int stckarr[] = new int[size];

    // push method
    public void push(Scanner sc) {
        if(top == size-1){
            System.out.println("stack is full");
            return;
        }
        else{
            System.out.println("enter the value: ");
            int val = sc.nextInt();
            top ++;
            stckarr[top] = val;
            System.out.println("Value insetred successfully");

        }
    }
    // pop method
    public void pop() {
        if(top == -1 ){
            System.out.println("Stack is Empty..");
            return;
        }
        else{
            top --;
            System.out.println("Value Deleted successfully");
            
        }
    }
    // peek method
    public void peek() {
        if(top == -1){
            System.out.println("...Empty...");
            return;
        }else{
            System.out.println("Top Most Element is: " + stckarr[top]);
        }
    }
    // display method
    public void display(){
        if(top == -1){
            System.out.println("...Empty...");
            return;
        }
        else{
            for(int i = top;top >=0;i--){
                System.out.println(stckarr[i]);
            }
        }
    }
}
