import java.util.Scanner;

class library_node{
    int bookid;
    String bookname;
    float price;
    library_node prev,next;

    library_node(int bookid,String bookname,float price){
        this.bookid= bookid;
        this.bookname = bookname;
        this.price = price;
        this.prev = null;
        this.next = null;
    }

}
class library_strut{
    private library_node head;
    
    library_strut(){
        head = null;
    }

    public void insert(int bookid,String bookname,float price) {
        library_node newnode = new library_node(bookid, bookname, price);
        if(head == null){
            head = newnode;
        }
        else{
            library_node current = head;
            while(current != null ){
                current = current.next;
            }
            current.next = newnode;
            newnode.prev = current;
        }
    }
    //delete the data via the bookno
    public void delete(int bookid) {
        
    }

}



public class doubly_linked_list {
    public static void main(String[] args) {
        
    }    
}
