package module01_Array_Pwskills;

public class Test39_Check_Pallindrome_Number_Method2 {

    public static void main(String[] args) {
        int n =123454321;
        String str = Integer.toString(n);

        char[] ch=str.toCharArray();

        for(char c: ch){
            System.out.println(c);
        }

        int i=0;
        int j =ch.length-1;
        boolean isPalindrome = true;

        while(i<j){
            if(ch[i]!=ch[j]){
                isPalindrome =false;
                break;
            }

            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
