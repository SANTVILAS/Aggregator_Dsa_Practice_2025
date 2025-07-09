package Revision01_LL;

class SLL{

    Node head;
    Node tail;
    int size;

    //print Link List

    public void print(){
        System.out.println("inside print method");
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    // Add element at tail

    public void addAtTail(int val){

       // step -1   cerate a new Node
        Node temp = new Node(val);

        // if LL is Empty
        if(head == null) head = tail = temp;

      else{
            // if LL is not empty
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    // Size of LinkList
    void size(){
        System.out.println("Length of LL "+size);
    }

    //Insert At beginning
    public void insertAtHead(int val){
        // first create a node
        Node newNode = new Node(val);
        //if ll is empty, and howe to  chekc it is empty
        if(head==null){
            head= tail = newNode;
        }
        else{
            newNode.next = head;
             head = newNode ;
        }
       size++;
    }

    //insert a node in any index

    public void insertElementAtIndx(int idx,int val){

        //base case

        if(idx ==0){

            //insert at head
            insertAtHead(val);
            return;
        }
        if(idx ==size){

            //insert at tail
            addAtTail(val);
            return;
        }
        if(idx >size){

            System.out.println("Invalid Index")
            ;
           return;
        }


        Node temp = new Node(val);
        // need to travel upto indx-1 position
        Node x = head; // this is imp line ,cx you need to move x
       for(int i=0;i<idx-1;i++){
        x= x.next;// for trversing pupose

           // this is your insertion part
        temp.next= x.next;
        x.next=temp;
       }
       size++;
    }

      // GetElement from LL
    public int getElement(int idx) throws Error{

        if(idx==0){
            return head.data;
        }if(idx==size-1){
            return tail.data;
        }if(idx >=size || idx <0){

           throw new Error(" bhai Invalid index");
        }

        Node temp = head;
        for (int i=0;i<=idx;i++){
            temp = temp.next;
        }
         return temp.data;
    }

    public void deleteNodeFromLL(int idx) throws Exception{

        if(idx==0){
            deleteAtHead();
            return;
        }

        if(head==null){

             throw new Exception("invalid Index");
        }if(idx<0 || idx>=size){
          throw new Exception("Invalid Index");
        }

         Node temp = head;
         for(int i=0;i<=idx-1;i++){
           temp = temp.next;
         }
         if(temp.next==tail){
             tail = temp;
         }
        temp.next = temp.next.next;
         size--;
    }
    // delete at head

    public void deleteAtHead(){
        if(head==null){
            throw new Error("List is Empty");
        }
        head = head.next;
        size--;
    }

    //delete aat tail
    public void deleteAtTail(){

    }

    public int getSize() {
        return size;
    }
}

public class Test03_Implementation_LL {

    // Custom impelementation of LL
    public static void main(String[] args) throws Exception {


        SLL ll = new SLL();
       // System.out.println(ll.size);
        ll.size();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.print();
       ll.addAtTail(40);
        ll.print();
      //  System.out.println(ll.size);
        ll.size();

        ll.insertAtHead(90);
        ll.print();
        ll.size();
        ll.insertElementAtIndx(2,100);
        ll.print();
        System.out.println("Get Element");
        int ans  = ll.getElement(1);
        System.out.println(ans);
        ll.print();
        ll.deleteAtHead();
        ll.print();

        ll.deleteNodeFromLL(2);
        ll.print();
        ll.deleteNodeFromLL(3);
        ll.print();



    }
}
