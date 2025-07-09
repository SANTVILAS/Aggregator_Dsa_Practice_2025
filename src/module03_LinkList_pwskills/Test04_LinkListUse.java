package module03_LinkList_pwskills;

class SLL{

    Node head;//null pe hai
    Node tail;//null pe hai
    int size;

    public void insertAtTailOrEnd(int val){
        // make a new Node
         Node temp = new Node(val);
        //case -1
        // if LL is empty , so we need to maintain 3 ponters head tail and temp and
        // will pomting to same node
       if(head==null){
           head=tail=temp;
       }else{
          tail.next = temp;
          tail =temp;
       }
       size++;
    }

    public static void print(Node head){
        if(head==null){
            return;
        }
        System.out.println(head.data);
        print(head.next);


    }

    public void display(){
                Node temp= head;
                while(temp!=null){
                    System.out.println(temp.data);
                    temp = temp.next;
                }
        System.out.println();
    }


}

class LinkListUmp{
    public static void main(String[] args) {
       SLL sll = new SLL();
        System.out.println(sll.size);
       sll.insertAtTailOrEnd(10);
       sll.insertAtTailOrEnd(20);
       sll.insertAtTailOrEnd(30);
        System.out.println(sll.size);
     //  sll.print();
       sll.display();

        sll.display();

    }

}





