package module07_String;

public class Test13_Maximim_Occuring_Character {

    public static char maxOccuringCharacter(String str){
        int arr[] = new int[256];

        int max = -1;
        char ans = ' ';

        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;
           char ch= str.charAt(i);

           if( arr[ch]>max){
               max = arr[ch];
               ans= ch;
           }

        }
     return ans;
    }

    public static void main(String[] args) {

        String str ="abdefgbabfba";

        char c=maxOccuringCharacter(str);
        System.out.println(c);
    }
}
