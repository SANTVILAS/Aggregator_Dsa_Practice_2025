package module04_Stack_pwskills;

public class StackUse {

    public static void main(String[] args) {

        StackUsingLL<Integer> stackUsingLL = new StackUsingLL();

        for(int i=0;i<5;i++){
             stackUsingLL.push(i);
        }

        while(!stackUsingLL.isEmpty()){
            try {
                System.out.println(stackUsingLL.pop());
            } catch (StackEmptyException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
