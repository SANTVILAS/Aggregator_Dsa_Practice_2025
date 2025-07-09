package module04_Stack_codingNinja;

import java.util.Stack;

public class Test02_Balance_Paraenthesis_M2 {

    public static boolean isValid(String str){
        //Step -1 Break String through character Array
        char[] ch = str.toCharArray();

        //step-2 Iterate throgh String
        Stack<Character> stack = new Stack<>();
        for(char c:ch){
            if(isOpen(c)){
                 stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else if(isMatched(stack.peek(),c)){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean isOpen(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    public static boolean isMatched(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String str = "()[]{}";
        boolean ans=isValid(str);
        System.out.println(ans);
    }
}
