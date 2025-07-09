package Revision02_LL;

public class Test04_Display_LL_Using_Loop {


    public static void print(Node head){

         Node temp = head;
          while(temp!=null){
              System.out.println(temp.val);
              temp=temp.next;
          }


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

        Node temp =a;  // ye wla kaam ek bar krna h

        for(int i=0;i<5;i++){
            System.out.println(temp.val);
            temp = temp.next;
        }


        System.out.println("Another way using while loop");

        // Pahle initialization
//        Node temp1 = a;
//        while(temp1!=null){
//            System.out.println(temp1.val);
//            temp1=temp.next;
//        }


        print(a);
    }
}
