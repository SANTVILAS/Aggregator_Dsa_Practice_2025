package module07_String;

public class Test15_String_Compression {

    public static void main(String[] args) {
      String str = "aaaabbccccd";
      String ans ="";

      char[] arr=str.toCharArray();

     int i=0;
     int j=0;
     int n =str.length()-1;
     while(j<n){


         if(str.charAt(i)==str.charAt(j)){
            j++;
         }else{
             ans = ans + arr[i];
             int len = j - i;
          if(len>1){
              ans =  ans + len;
          }
           i = j;
         }
     }

        ans = ans + arr[i];
        int len = j - i;
        if (len > 1) {
            ans = ans + len;
        }

        System.out.println(ans);
    }
}
