package module07_String;

public class Test08_Reverse_String {
    public static void main(String[] args) {
        String str = "Santvilas";
        String rev ="";

        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }

        for(int i=0;i<str.length();i++){
            rev = str.charAt(i) + rev;
        }
        System.out.println(rev);
        System.out.println();
        System.out.println(rev);
    }
}
