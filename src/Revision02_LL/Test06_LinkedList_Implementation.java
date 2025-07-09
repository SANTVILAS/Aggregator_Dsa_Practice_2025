package Revision02_LL;


class SLL{   //User defined data struture
    Node head;
   Node tail;
   int size;

public void display(){

    Node temp = head;
    while(temp!=null){

        System.out.println(temp.val);
        temp = temp.next;
    }
    System.out.println();
}

public void insertAtEnd(int val) {

        Node temp = new Node(val);
        // if LL is empty
        if(head==null){
            head=temp;
            tail=temp;
        }else{

            // If LL is not empty
            tail.next = temp;
            tail=temp;
        }
        size++;

    }



    void inserAtHead(int val){
    Node temp = new Node(val);
    // case 1 when LL is Empty
        if(head==null){
            head=tail=temp;

        }else{
            temp.next = head;
            head= temp;
        }
       size++;
     }

    void size(){
        System.out.println("Size Of LL  "+size);
    }


    // this is imp
    void inserAtGivenIndex(int idx,int val){
    //I need to traverse upto idx


        Node temp = new Node(val);
    // case = 1 insert at head
        if(idx==0){
            inserAtHead(val);
            return;
        }

        // case -2 inserrt at tail
        if(idx>size){
            System.out.println("INVALID INDEX");
            return;
        }
        //case-3 insert At tail
        if(idx==size){
            insertAtEnd(val);
            return;
        }
        Node x = head;

        for(int i=0;i<=idx-1;i++){
            x= x.next;
        }
        // this is insertion
        temp.next = x.next;// thse 2 are imp lines
        x.next = temp;
        size++;
   }

    public int getElementAtGivenIdx (int idx) throws  Error{

        //base cases
        if(idx==size-1){
            System.out.println(tail.val);
        }
        if(idx<0 || idx>=size){
         //   System.out.println("InVALID INDEX");
             throw new Error(" Bhai error Invalid Index");
            // return -1;
        }

        Node temp = head;
        for(int i=0;i<=idx;i++){

            temp = temp.next;
        }
         return temp.val;
 }

public void deleteAtHead() throws  Error{
    //case -1
    if(head==null){

        System.out.println("LL is empty ");
        throw new Error("LL is empty");
    }

    //case -2
    head= head.next;
    size--;
}

    public void deleteAtI_th_Index(int idx) throws  Error{
        //case -1
        if(head==null){
            System.out.println("LL is empty ");
            throw new Error("LL is empty");
        }

        if(idx==0){

            deleteAtHead();
            return;
        }




        //case -2 to deletion of any node we i-1th node

        Node temp = head;

        for(int i=0;i<idx-1;i++){
            temp= temp.next;  // temp ko yahan tak lekar gye , toh idx-1 postion pe pahuncha
        }


        if(temp.next==tail){

            tail = temp;
        }

        temp.next = temp.next.next;
        size--;

}



}

public class Test06_LinkedList_Implementation {





    public static void main(String[] args) {

         SLL ll = new SLL();
         SLL list = new SLL();
        System.out.println("Size "+ll.size);

         ll.insertAtEnd(10);
        System.out.println("Size "+ll.size);
        ll.insertAtEnd(20);
        System.out.println("Size "+ll.size);
        ll.insertAtEnd(30);
        System.out.println("Size "+ll.size);
        ll.display();
        ll.size();

//        ll.inserAtHead(40);
//        ll.display();
        ll.inserAtGivenIndex(2,100);
        ll.display();
        ll.inserAtGivenIndex(0,500);
        ll.display();

        // get element at given index
        System.out.println("Element At given index "+ll.getElementAtGivenIdx(3));
        System.out.println(ll.getElementAtGivenIdx(0));
        ll.display();
     //   System.out.println("Element At given index "+ll.getElementAtGivenIdx(-1));

        // Deletion OF LL
        ll.display();
        ll.deleteAtHead();
        ll.display();

        ll.deleteAtI_th_Index(2);
        ll.display();
        ll.size();



    }

}
