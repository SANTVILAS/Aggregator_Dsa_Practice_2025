package module03_LinkList_Questions;


import Revision01_LL.Node;

class LinkedNode{
    int val;
    LinkedNode next;

    public LinkedNode(){

        this.val=0;
        this.next=null;
    }

    public LinkedNode(int val){

        this.val=val;
        this.next=null;
    }
}



public class Test02__Creation_LL_Display_LL_AND_Middle_Of_LL {

    // create LL
    public static LinkedNode createLinkedList(int val[]){


        LinkedNode head= null;
        LinkedNode temp = null;

        for(int elem:val){
            System.out.println("Iteration of"+elem);
            LinkedNode newNode = new LinkedNode(elem);

        if(head==null){
               head=newNode;
               temp=head;
        }else{
            temp.next = newNode;
            temp = temp.next;
        }
        }
        return head;
    }

    public static void print(LinkedNode head){
        LinkedNode temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;

        }
    }


    //Middile of LL 2 pass solution

  //// very basic approach of finding Middle of LL
    public static int middleOfLL(LinkedNode head){
        //lenth if LL se divide kado mid ka formula lga do

         LinkedNode temp = head;
         int len =0;
         // length of LL
        while(temp!=null){
            temp = temp.next;
             len++;
        }

        int mid = len/2 +1;  // working for both even and odd lenth of LL
        temp = head;// wapas se head ko temp ko de dia


        for(int i=0;i<mid-1;i++){
            temp= temp.next;
        }
        return temp.val;
    }

    public static int middleOfLL_Using_Fast_And_Slow_Pointer(LinkedNode head){


        LinkedNode slow = head;
        LinkedNode fast = head;


        while( fast!=null||fast.next!=null){   //null ka next nhi hota
            slow = slow.next;
            fast=fast.next.next;
        }

        return slow.next.val;

    }





    // Find the length of LL


  //
    //  step -1 calculate the length of LL


    public static void main(String[] args) {
        int val[]= {10,20,100,30,50};
       LinkedNode head= createLinkedList(val);
        print(head);
       int middleElement= middleOfLL(head);

        System.out.println("Middle of LL "+middleElement);

         // Slow and fast pointer Approach

        int middleODLL_Using_SlowandFAst=middleOfLL_Using_Fast_And_Slow_Pointer(head);




    }


}
