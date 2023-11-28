// package Assigment_Java;

// import java.util.Scanner;

// class Student1 {
//     int rollNo;
//     String name;
//     String email;
//     double percentage;
//     Student next;

//     public Student1(int rollNo, String name, String email, double percentage) {
//         this.rollNo = rollNo;
//         this.name = name;
//         this.email = email;
//         this.percentage = percentage;
//         this.next = null;
//     }
// }

// class StudentLinkedList {
//     private Student head;

//     public void insert(int rollNo, String name, String email, double percentage) {
//         Student newStudent = new Student(rollNo, name, email, percentage);
//         if (head == null) {
//             head = newStudent;
//         } else {
//             Student current = head;
//             while (current.next != null) {
//                 current = current.next;
//             }
//             current.next = newStudent;
//         }
//     }

//     public void insertAtPosition(int position, int rollNo, String name, String email, double percentage) {
//         Student newStudent = new Student(rollNo, name, email, percentage);
//         if (position == 1) {
//             newStudent.next = head;
//             head = newStudent;
//         } else {
//             Student current = head;
//             for (int i = 1; i < position - 1 && current != null; i++) {
//                 current = current.next;
//             }
//             if (current == null) {
//                 System.out.println("Invalid position");
//             } else {
//                 newStudent.next = current.next;
//                 current.next = newStudent;
//             }
//         }
//     }

//     public void deleteByRollNo(int rollNo) {
//         if (head == null) {
//             System.out.println("The list is empty.");
//             return;
//         }

//         if (head.rollNo == rollNo) {
//             head = head.next;
//             return;
//         }

//         Student current = head;
//         while (current.next != null && current.next.rollNo != rollNo) {
//             current = current.next;
//         }

//         if (current.next != null) {
//             current.next = current.next.next;
//         } else {
//             System.out.println("Student with Roll No " + rollNo + " not found.");
//         }
//     }
//     public void deleteByName(String name) {
//         if (head == null) {
//             System.out.println("The list is empty.");
//             return;
//         }
    
//         if (head.name.equals(name)) {
//             head = head.next;
//             return;
//         }
    
//         Student current = head;
//         while (current.next != null && !current.next.name.equals(name)) {
//             current = current.next;
//         }
    
//         if (current.next != null) {
//             current.next = current.next.next;
//         } else {
//             System.out.println("Student with Name '" + name + "' not found.");
//         }
//     }
        

//     public void display() {
//         Student current = head;
//         while (current != null) {
//             System.out.println("Roll No: " + current.rollNo);
//             System.out.println("Name: " + current.name);
//             System.out.println("Email: " + current.email);
//             System.out.println("Percentage: " + current.percentage);
//             System.out.println();
//             current = current.next;
//         }
//     }

//     public static void main(String[] args) {
//         StudentLinkedList studentList = new StudentLinkedList();
//         Scanner scanner = new Scanner(System.in);

//         while (true) {
//             System.out.println("Menu:");
//             System.out.println("1. Add Student");
//             System.out.println("2. Insert Student at Position");
//             System.out.println("3. Delete Student by Roll No");
//             System.out.println("4. Delete Student Name");
//             System.out.println("5. Display Students");
//             System.out.println("6. Exit");
//             System.out.print("Enter your choice: ");
//             int choice = scanner.nextInt();

//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter Roll No: ");
//                     int rollNo = scanner.nextInt();
//                     System.out.print("Enter Name: ");
//                     String name = scanner.next();
//                     System.out.print("Enter Email: ");
//                     String email = scanner.next();
//                     System.out.print("Enter Percentage: ");
//                     double percentage = scanner.nextDouble();
//                     studentList.insert(rollNo, name, email, percentage);
//                     break;
//                 case 2:
//                     System.out.print("Enter Position: ");
//                     int position = scanner.nextInt();
//                     System.out.print("Enter Roll No: ");
//                     rollNo = scanner.nextInt();
//                     System.out.print("Enter Name: ");
//                     name = scanner.next();
//                     System.out.print("Enter Email: ");
//                     email = scanner.next();
//                     System.out.print("Enter Percentage: ");
//                     percentage = scanner.nextDouble();
//                     studentList.insertAtPosition(position, rollNo, name, email, percentage);
//                     break;
                    
//                 case 3:
//                     System.out.print("Enter Roll No to Delete: ");
//                     rollNo = scanner.nextInt();
//                     studentList.deleteByRollNo(rollNo);
//                     break;
//                 case 4:
//                     System.out.print("Enter Name to Delete: ");
//                     name = scanner.next();
//                     studentList.deleteByName(name);
//                     break;
//                 case 5:
//                     studentList.display();
//                     break;
//                 case 6:
//                     System.exit(0);
//                 default:
//                     System.out.println("Invalid choice. Please try again.");
//                     scanner.close();
//             }
//         }
//     }
// }



package Assigment_Java;

import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    String email;
    double percentage;
    Student next;

    public Student(int rollNo, String name, String email, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
        this.percentage = percentage;
        this.next = null;
    }
}

class StudentLinkedList {
    private Student head;

    public void insert(int rollNo, String name, String email, double percentage) {
        Student newStudent = new Student(rollNo, name, email, percentage);
        if (head == null) {
            head = newStudent;
        } else {
            Student current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newStudent;
        }
    }

    public void display() {
        Student current = head;
        while (current != null) {
            System.out.println("Roll No: " + current.rollNo);
            System.out.println("Name: " + current.name);
            System.out.println("Email: " + current.email);
            System.out.println("Percentage: " + current.percentage);
            System.out.println();
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentLinkedList studentList = new StudentLinkedList();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int rollNo = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Email: ");
                    String email = scanner.next();
                    System.out.print("Enter Percentage: ");
                    double percentage = scanner.nextDouble();
                    studentList.insert(rollNo, name, email, percentage);
                    break;
                case 2:
                    studentList.display();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    scanner.close();
            }
        }
    }
}
