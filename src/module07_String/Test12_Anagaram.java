package module07_String;

public class Test12_Anagaram {

    public static boolean anagram(String s, String t){



        int arr[] = new int[256];

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }

        for(int i=0;i<s.length();i++){
            arr[t.charAt(i)]--;
        }

        for(int i=0;i<arr.length;i++){
           if(arr[i]!=0){
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
