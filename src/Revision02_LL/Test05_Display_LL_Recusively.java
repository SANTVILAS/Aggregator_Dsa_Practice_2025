package Revision02_LL;

public class Test05_Display_LL_Recusively {


    public static void printRecursively(Node head){

        if(head==null){
            return;  //base case
        }

        System.out.println(head.val);
        printRecursively(head.next);

    }


    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        printRecursively(a);

    }
}
