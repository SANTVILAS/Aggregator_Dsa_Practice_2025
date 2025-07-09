package module07_String;

public class Test16_Reverse_String {

    public static void main(String[] args) {

        String str  = "Santvilas";
        String rev ="";

        for(int i=0;i<str.length();i++){

            rev = str.charAt(i) + rev  ;


        }
        System.out.println(rev);
    }
}
