package module01_Array_Pwskills;

public class Test02_PassByReferece {

    public static void change(int arr[]){
        arr[0] = 90;

    }

    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50};
        System.out.println(arr[0]);
        change(arr);
        System.out.println();
    }
}
