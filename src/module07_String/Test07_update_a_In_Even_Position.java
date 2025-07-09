package module07_String;

public class Test07_update_a_In_Even_Position {

    public static void main(String[] args) {
        String str = "Santvilaskeshari";
        String ans  = "";

        for(int i=0;i<str.length();i++){

            if(i%2 == 0){
                ans =ans + 'a';
            }else {
               ans = ans + str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
