package Revision02_LL;

public class Test02_Shallow_Copy_Of_Node {
    public static void main(String[] args) {

        Node a = new Node(100);
        System.out.println(a.val);


        Node temp = a;//  this Shallow copy, it is just a ref variable koi ny noide nhi bna h
        System.out.println(temp.val);

        System.out.println(a);
        System.out.println(temp);



    }

}
