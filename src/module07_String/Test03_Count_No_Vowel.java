package module07_String;

public class Test03_Count_No_Vowel {

    public static void main(String[] args) {

        String str = "Santvilaskesahri";

        int count =0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(isVowel(ch)){
                count++;
           }
        }
        System.out.println(count);
    }

    public static boolean isVowel(char c){
        if(c=='a' || c=='A') {
            return true;
        }
        if(c=='e' || c=='E') {
            return true;
        }
        if(c=='i' || c=='I') {
            return true;
        }
        if(c=='o' || c=='O') {
            return true;
        }
        if(c=='u' || c=='U') {
            return true;
        }
        return false;

    }


}
