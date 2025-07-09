package Revision02_LL;

//class Car{
//    int price;
//    String name;
//
//
//    public Car(String name,int price){
//        this.name = name;
//        this.price=price;
//    }
//}





public class Test01_ListNodeClass {

    public static void main(String[] args) {

      Node a = new Node(10);
      Node b = new Node(20);
      Node c = new Node(30);
      Node d = new Node(40);
      Node e = new Node(50);


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);



        // If I nee to print node of value

        System.out.println(a.val);
        System.out.println(b.val);
        System.out.println(c.val);
        System.out.println(d.val);
        System.out.println(e.val);

        //Here a means a ka reference address
        //aur a.next me kya hai agar kuch nhi iska malba link attach nhi h

        System.out.println(a);
        System.out.println(a.next);

        // i need to print LL
        //  I need to connect make link between node

        a.next = b;
        b.next = c;
        c.next = d;
        d.next =e;
        System.out.println(a.next);
        System.out.println(b);
        System.out.println(b.next);
        System.out.println(c);
        System.out.println(c.next);
        System.out.println(d);
        System.out.println(d.next);
        System.out.println(e);


    }

}
