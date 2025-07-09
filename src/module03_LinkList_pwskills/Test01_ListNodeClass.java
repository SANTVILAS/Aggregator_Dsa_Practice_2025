package module03_LinkList_pwskills;

public class Test01_ListNodeClass {

    public static void main(String[] args) {
        Node  head = new Node(10);
        Node  a = new Node(10);
        Node  b = new Node(20);
        Node  c = new Node(30);
        Node  d = new Node(40);
        Node  e = new Node(50);

        System.out.println(head);
        System.out.println(b);
        System.out.println(c);


        System.out.println(head.next);
        System.out.println(a.next);
        System.out.println(b.next);
        System.out.println(c.next);
        System.out.println(d.next);
        System.out.println(e.next);


        //How to link 2 node

        a.next = b;          //10->20
        b.next = c;     //10->20->30
        c.next =d;
        d.next = e;
        System.out.println(a);
        System.out.println(a.next);
        System.out.println(b);
        System.out.println(b.next);

        System.out.println(b);
        System.out.println(b.next);
        System.out.println(c);



    }
}
