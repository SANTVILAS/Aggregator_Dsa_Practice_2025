package module04_Stack_pwskills;

//my doubt yahan top kyu maintain nhi kar rhe
// temp kab ayega picture me
public class StackUsingLL<T> {   //mistake 1  class generic nhi banaya and howe to declare generic class ye nhi
                                   //ye bhi nhi pta tha

    Node<T> head;
    int size;


    public StackUsingLL(){
     head = null;
     size =0;

    }

    public StackUsingLL(int val){
        head = null;
        size =0;

    }

    public int size(){
       return size;

    }

    //stack khali hai ya nhi ?
    public boolean isEmpty(){
         if(head == null){ //mistake 2==> head.next == null , yahan head.next kyu kia
             return true;
         }
         return false;
    }

    public T top() throws StackEmptyException {

        if(size()==0){
            StackEmptyException e = new StackEmptyException();
             throw e;
            //throw new StackEmptyException();
        }
        return head.data;
    }

    public void push(T element){
      //first of create a new Node
        Node<T> newNode = new Node<T>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T pop() throws StackEmptyException {

        if(size()==0){
            StackEmptyException e = new StackEmptyException();
            throw e;
            //throw new StackEmptyException();
        }

            T elem=head.data;
            head = head.next;
            size--;
            return elem;
    }

}



