import java.util.Scanner;

public class queue_operaions {
    Scanner sc = new Scanner(System.in);
    int size = 5,i,j,front = -1,rear = -1;
    int queue_arr[] = new int [size];

    public void enqueue(Scanner sc) {
        if(front == (size-1) && rear == 0 ){
            System.out.println("Queue is Full...");
        }
        else if(rear == size){
            System.out.println("Queue is Full...");
            
        }
        else{
            System.out.println("Enter the data: ");
            int ele = sc.nextInt();
            if(front ==- 1 && rear == -1){
                front = 0;
                rear = 0;
                queue_arr[front] = ele;

            }else{
                front ++;
                queue_arr[front] = ele;
            }
        }
    }

    public void dequeue() {
        if(front == -1 && rear == -1){
            System.out.println("The Queue is Empty...");
        }    
        else if(front == (size-1) && rear == size ){
            System.out.println("The Queue is Empty...");

        }
        else{
            rear ++;
        }
    }
    public void display() {
        if(front == -1 && rear == -1){
            System.out.println("The Queue is Empty...");
        }
        else{
            System.out.println("Elements Are: ");
            for(i= front;front <= rear;i++){
                System.out.println(queue_arr[i]);
            }
        }
    }
}
