package module07_String;

public class Test01_Declaration {
    public static void main(String[] args) {

        String str = "Santvilas";

        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        for(Character elem :arr){

            System.out.print(elem+" ");
        }

    }
}
