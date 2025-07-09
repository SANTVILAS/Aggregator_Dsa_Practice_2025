package module03_LinkList_pwskills;

import javax.imageio.stream.ImageInputStream;

public class Test02_Diplaying_LL {

    public static void print(Node head) {

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void printReverse(Node head) {
        if(head==null){
                return;
        }
             printReverse(head.next);
            System.out.println(head.data);
    }


    public static void main(String[] args) {

        //shallow copy of node

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;          //10->20
        b.next = c;     //10->20->30
        c.next = d;
        d.next = e;

        print(a);
        System.out.println("Print in reverse order ");
        printReverse(a);
    }
}