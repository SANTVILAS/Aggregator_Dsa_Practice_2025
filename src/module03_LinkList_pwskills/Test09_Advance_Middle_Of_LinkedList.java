package module03_LinkList_pwskills;
//leetcode 876
public class Test09_Advance_Middle_Of_LinkedList {

    public Node middleNode(Node head){
      Node temp = head;
      int len =0;

      while(temp!=null){
          temp = temp.next;
          len++;
      }
      int mid =len/2 + 1;
      temp = head;
      for(int i=1;i<mid-1;i++){
          temp =temp.next;
      }
      return temp;
    }

    public static void main(String[] args) {



    }
}
