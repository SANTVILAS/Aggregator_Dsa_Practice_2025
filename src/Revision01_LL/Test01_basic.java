package Revision01_LL;

public class Test01_basic {

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);



        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);


        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        System.out.println(d.data);
        System.out.println(e.data);
        System.out.println(f.data);

        System.out.println(a.next);

        a.next = b;
        System.out.println(a.next);
        System.out.println(b);

        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(b.next);
        System.out.println(c);

        System.out.println(c.next);
        System.out.println(d);

        System.out.println(c.next);
        System.out.println(d);

        System.out.println(d.next);
        System.out.println(e);

        System.out.println(e.next);
        System.out.println(f);



    }
}
