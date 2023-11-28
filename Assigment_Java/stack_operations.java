package Assigment_Java;
import java.util.Scanner;

class stack1{
    int n = 5,top = -1,i,j;
    int a[] = new int[n];
    
   boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == n - 1;
    }
    
    void push(Scanner sc){
        if(isFull()){
            System.out.println("stack is overflow,,..");
	
        }
        else{

            System.out.println("Enter the value:");
            i = sc.nextInt();
            top ++;
            a[top] = i;
             System.out.println("Insert value Successfully ");
	
        }
        
    }
    void pop(){
        if(isEmpty()){
             System.out.println("Stack is Underflow...");
             
        }
        else{
            top --;
             System.out.println("Delete value Successfully ");
	
        }
        
    }
    void display(){
         System.out.println("Elements are:  ");
         for (int j= top;j>=0;j--){
              System.out.println(a[j]);
	
         }
	
    }
    void peek(){
         if(isEmpty()){
             System.out.println("Stack is Underflow...");
             
        }
        else
              System.out.println("The Top Value is " + a[top]);
	
    }
    
	public static void main(String[] args) {
	    int ch;
        Scanner sc = new Scanner(System.in);
        stack1 s1 = new stack1();
       do {
        System.out.println("1.PUSH");
        System.out.println("2.POP");
        System.out.println("3.PEEK");
        System.out.println("4.DISPLAY");
        System.out.println("5.EXIT");
        
                
                    System.out.println("Enter your Choice: ");
                     ch = sc.nextInt();
      
                    switch (ch) {
                        case 1:
                            s1.push(sc);
                            break;
                        case 2:
                            s1.pop();
                            break;
                        case 3:
                            s1.peek();
                            break;
                        case 4:
                            s1.display();
                            break;
                        case 5:
                             System.out.println("You Choose the Exit...");
                            break;
                        default:
                            System.out.println("You Enter the wrong choise...");

                    }
                } while (ch != 5);
                sc.close();
       } 
        
    
}
