package module04_Stack_codingNinja;

//Balance parenthesis


import java.util.Stack;

public class Test02_Balance_Paraenthesis {

    public static boolean isValid(String str){
        //Step -1 Break String through character Array
        char[] ch = str.toCharArray();

        //step-2 Iterate throgh String
        Stack<Character> stack = new Stack<>();
        for(char c:ch){

            if(c=='('){
                stack.push(')');
            }else if(c=='{'){
                stack.push('}');
            }else{
                stack.push(']');
            }if(stack.isEmpty() || stack.pop()!=c){
                return false;
            }
        }
           return stack.isEmpty();
    }

    public static void main(String[] args) {

        String str = "()[]{}";
        boolean ans=isValid(str);
        System.out.println(ans);
    }
}

//How to indetiy that is open bracket

//if current character is open bracket then add it into stack

//if current charcter is closing and stack is empty return false

//otherwise pop element from stack

//

//

//ones traversing is done then and stack is empty then return true