package Revision02_LL;

public class Test03_Display_LL {

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

        Node temp = a;
        System.out.println(temp.val);

        temp = temp.next;
        System.out.println(temp.val);

        temp = temp.next;
        System.out.println(temp.val);


        temp = temp.next;
        System.out.println(temp.val);


        temp = temp.next;
        System.out.println(temp.val);


        System.out.println("==========================");






    }
}
