package module06_recursion_pwskills;

public class Test08_Remove_Perticular_Char {

    public static void skip(int i,String str, String ans){

        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }

        //work
        if(str.charAt(i)!='a'){
           ans = ans +str.charAt(i);
        }
        skip(i+1,str,ans);
    }

    public static void main(String[] args) {
        String str = "Raghav Garg";
        skip(0,str,"");


    }
}
