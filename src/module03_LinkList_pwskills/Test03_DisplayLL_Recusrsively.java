package module03_LinkList_pwskills;

public class Test03_DisplayLL_Recusrsively {


    public static void displayRecursively(Node head) {

        if(head==null){
           return;
        }

        System.out.println(head.data);
        displayRecursively(head.next);

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

            displayRecursively(a);
        }

    }



