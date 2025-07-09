package module07_String;



public class Test11_Reverse_String_Word_Wise {

    public static String reverseEachWord(String str){

        String ans = "";
        int currentWordStart =0;


        for(int i=0;i<str.length();i++){

            if(str.charAt(i)==' '){
              // Reverse current word

                int currentWordEnd = i-1;
                String reverseWord ="";
              for(int j=currentWordStart;j<=currentWordEnd;j++){
                  reverseWord = str.charAt(i) + reverseWord;
              }

              //add ir to the to final String
                ans = ans + reverseWord +" ";
                currentWordStart = i+1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String str = "abc def ghi";
        String as=reverseEachWord(str);
        System.out.println(as);
    }
}

