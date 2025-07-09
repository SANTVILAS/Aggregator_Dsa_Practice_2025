package module06_recursion_pwskills;

public class Test06_String_Traversal {

    public static void print(int i,String str){

        if(i==str.length()){
            return;
        }

        //base case
        System.out.print(str.charAt(i));
        print(i+1,str);

        //work

    }

    public static void main(String[] args) {

        String str = "Raghav Garg";
        print(0,str);


    }
}
