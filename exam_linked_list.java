import java.util.Scanner;

class emp{
    int empno;
    String name;
    emp next;

    emp(int empno,String name){
        this.empno = empno;
        this.name= name;
        this.next = null;
    }
}
class company{
    emp head;
    company(){
        head = null;
    }
    public void insert(int empno,String name) {
        //object
        emp newemp = new emp(empno, name);
        if(head == null){
            head = newemp;
        }
        newemp.next = head;
        head = newemp;
        System.out.println("Value insetred successfulyy");
    }
    public void insertatlast(int empno,String name) {
        emp newemp = new emp(empno, name);
        if(head == null){
            head = newemp;
        }
        emp temp = head;
        while(temp.next != null){
                temp = temp.next;
        }
        temp.next = newemp;
        System.out.println("Value insetred successfulyy at lasttt");
    }
    public void insertatpos(int pos,int empno,String name) {
        emp newemp = new emp(empno, name);
        if(head == null){
            head = newemp;
        }
        emp temp = head;
        for(int i=1;i<pos;i++){
            temp = temp.next;
        }
        newemp.next = temp.next;
        temp.next = newemp;
        System.out.println("Value insetred successfulyy at insetred positon ");

    }
    public void deletemp(int empno_del) {
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        if(head.empno == empno_del){
            head = head.next;
            return;
        }
        emp current = head;
        
    }
}
public class exam_linked_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        company cobj = new company();
        int ch;
        boolean flag = true;
        while(flag){
            System.out.println("Menu");
        
            System.out.println("1.insert");
            System.out.println("2.insert at last");
            System.out.println("3.insert at position");
            System.out.println("4.Delete at position");

            System.out.println("5.exit");
            System.out.println("Enter the positon: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the empno: ");
                    int empno = sc.nextInt();
                    System.out.println("Enter the name: ");
                    String name = sc.next();
                    cobj.insert(empno, name);
                    break;
            
                case 2:
                    System.out.println("Enter the empno: ");
                    int empno1 = sc.nextInt();
                    System.out.println("Enter the name: ");
                    String name1 = sc.next();
                    cobj.insertatlast(empno1,name1);
                    break;
                case 3:
                    System.out.println("Enter the position: ");
                    int pos = sc.nextInt();
                    System.out.println("Enter the empno: ");
                    int empno2 = sc.nextInt();
                    System.out.println("Enter the name: ");
                    String name2 = sc.next();
                    cobj.insertatpos(pos,empno2,name2);
                    break;
                case 4:
                    System.out.println("Enter the empno: ");
                    int empno_del = sc.nextInt();
                    cobj.deletemp(empno_del);
                    break;
                default:
                    System.out.println("Invalid Choise ");
                    sc.close();   

            }
        }
    }
}
