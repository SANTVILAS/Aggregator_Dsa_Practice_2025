package module01_Array_Pwskills;

public class Test27_Max_Min_From_Array {

    public static void main(String[] args) {

        int arr[] = {1,9,5,4,3,8};
        int maxArray=maxNumber(arr);
        System.out.println(maxArray);

        System.out.println("=================================");
        int minArray=minNumber(arr);
        System.out.println(minArray);
    }

    private static int minNumber(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                 min=arr[i];
            }

        }
        return min;
    }

    private static int maxNumber(int[] arr) {
       int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }
}
