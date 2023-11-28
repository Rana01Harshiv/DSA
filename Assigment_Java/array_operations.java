package Assigment_Java;
import java.util.Scanner;

class CustomArray {
     int[] arr;
     int size;

    CustomArray(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    void insert(int value) {
        if (size < arr.length) {
            arr[size] = value;
            size++;
            System.out.println("Element inserted successfully.");
        } else {
            System.out.println("Array is full. Cannot insert.");
        }
    }

    public void delete(int value) {
        int index = indexOf(value);
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
            System.out.println("Element deleted successfully.");
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public void display() {
        System.out.print("Array Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int getSize() {
        return size;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of the array: ");
        int capacity = sc.nextInt();
        CustomArray array = new CustomArray(capacity);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert an element");
            System.out.println("2. Delete an element");
            System.out.println("3. Display the array");
            System.out.println("4. Get the size of the array");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    int insertValue = sc.nextInt();
                    array.insert(insertValue);
                    break;
                case 2:
                    System.out.print("Enter the element to delete: ");
                    int deleteValue = sc.nextInt();
                    array.delete(deleteValue);
                    break;
                case 3:
                    array.display();
                    break;
                case 4:
                    System.out.println("Size of the array: " + array.getSize());
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
