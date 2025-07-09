package module07_String;

import java.util.Arrays;

public class Test12_Anagram_Method2 {

    public static boolean anagram(String s, String t){
        char[] ch = s.toCharArray();
        char[] th=t.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(th);

        for(int i=0;i<s.length();i++){
            if(ch[i]!=th[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {


        String s = "anagram";
        String t = "nagaram";
        System.out.println(anagram(s, t));
    }
}
