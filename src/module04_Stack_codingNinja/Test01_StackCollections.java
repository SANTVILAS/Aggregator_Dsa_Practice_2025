package module04_Stack_codingNinja;

import java.util.Stack;

public class Test01_StackCollections {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        int arr[] = {3,5,7,8};

        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
