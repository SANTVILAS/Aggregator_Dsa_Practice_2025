package module01_Array_Pwskills;

public class Test38_Check_Pallindrome_Number_Method1 {

    public static void main(String[] args) {

        int n =123454321;
        // if original and reverse no is same then no is pallindrome
        int original = n;
        int rev =0;

        while(n>0){
            int digit =n % 10;
            rev = rev *10 + digit;
            n = n/10;
        }

        if(original == rev){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
    }
}
