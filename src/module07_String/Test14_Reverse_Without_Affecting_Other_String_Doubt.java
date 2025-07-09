package module07_String;

public class Test14_Reverse_Without_Affecting_Other_String_Doubt {

     public static void reverseStr(char arr[]){

         int l =0;
         int r = arr.length-1;
         while(l<r){
            if(!Character.isAlphabetic(arr[l])){
                l++;
            } else if (!Character.isAlphabetic(arr[r])) {
                r--;
            } else {
                    char temp = arr[r];
                    arr[r] = arr[l];
                    arr[l]=temp;
                    l++;
                    r--;
                }
         }

     }

    public static void main(String[] args) {

        String str = "India ! is my country";
        char[] character=str.toCharArray();
        reverseStr(character);
        String rev =new String(character);
        System.out.println(rev);
    }
}
