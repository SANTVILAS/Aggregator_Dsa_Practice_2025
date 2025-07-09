package module01_Array_Pwskills;

public class Test17_Second_Highest_Number_Method2 {

    public static void main(String[] args) {
        int arr[] = { 9, 4, 5, 7, 2, 3 };
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        // traverse in array
        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){
                max = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
           if(arr[i]!=max && arr[i]>secMax){
               secMax=arr[i];
           }

        }

        System.out.println(secMax);



    }
}
