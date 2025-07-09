package module03_LinkList_pwskills;

class SLL1{

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
        System.out.println("Hi");
    }

    public void insertAtBeggining(int val){
        Node temp = new Node(val);
        if(head==null){
            head =tail=temp;
        }else{
            temp.next =head;
            head =  temp ;
        }


    }
    public void insertAtPosition(int idx,int val){
        Node temp = new Node(val);
        if(idx==0)
        {//insert at head
            insertAtBeggining(val);
            return;
        }
        if(idx==size){
            //insert at tail
            insertAtTailOrEnd(val);
            return ;
        }
        if(idx>size){
            // invalida index
            System.out.println("Invalid index ..!!!");
            return;

        }
        Node x = head;
        for(int i=1;i<=idx-1;i++){
            x = x.next;
        }
        temp.next=x.next;
        x.next =temp;
        size++;
    }

    public int getElementLL(int idx) throws Error {
        //LL is empty
        if(idx==0){

        }
        if(idx==size-1){
            return tail.data;
        }if(idx >size || idx <0){
            System.out.println("Invalid index");
            throw new Error("Invalid Index ");
          //  return -1;
        }
        Node temp=head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.data;
    }

    public void deleteAthead(){
        if(head==null)
        {
            throw new Error("List is empty");
        }
        head =head.next;
        size--;
    }

    public void deleteAtIndex(int indx){
        if(indx==0){
            deleteAthead();
        }


        if(indx <0 || indx>size){
            System.out.println("In valid index");
        }
        Node temp = head;
        for(int i=0;i<indx-1;i++){
            temp=temp.next;
        }
        if(temp.next==tail){
            temp=tail;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void deleteAtTail(){
        if(head==null)
        {
            throw new Error("List is empty");
        }


    }



    public void deleteElemAtGivenIndex(int indx){
        Node temp = head;
        if(indx==0){
            temp=temp.next;
            head=temp;
        }

    }

}




public class Test05_Insert_At_Begnning {
    public static void main(String[] args) {
        SLL1 sll = new SLL1();
        System.out.println(sll.size);
        sll.insertAtTailOrEnd(10);
        sll.insertAtTailOrEnd(20);
        sll.insertAtTailOrEnd(30);
        sll.insertAtTailOrEnd(40);
        sll.insertAtTailOrEnd(50);
        System.out.println(sll.size);
        sll.display();
        sll.insertAtBeggining(100);
        sll.display();
        System.out.println(sll.head.data);
        System.out.println(sll.tail.data);
        sll.insertAtPosition(3,1000);
        sll.display();
        System.out.println("get Element ");
        sll.display();
        System.out.println("Get element ");
        System.out.println(sll.getElementLL(3));
    }
}
