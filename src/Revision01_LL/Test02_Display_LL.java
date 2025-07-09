package Revision01_LL;

import org.w3c.dom.ls.LSOutput;

public class Test02_Display_LL {

    public static void print(Node head){
        Node  temp = head;
        while(temp.next!=null){
            System.out.println(temp.data);
         temp = temp.next;

     }
    }
    public static void dipalayResursively(Node head){

        if(head==null){
          return;
        }

        System.out.println(head.data);
        dipalayResursively(head.next);


    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.next = b;          //10->20
        b.next = c;     //10->20->30
        c.next = d;
        d.next = e;
        e.next =f;
        // Need to define temp node
        Node temp = a;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp = temp.next;

        }


        System.out.println("=========================================");
        print(a);
        System.out.println("==========================================");
        dipalayResursively(a);

    }
}
