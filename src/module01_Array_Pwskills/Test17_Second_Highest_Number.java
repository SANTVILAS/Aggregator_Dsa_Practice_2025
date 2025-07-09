package module01_Array_Pwskills;

public class Test17_Second_Highest_Number {

    public static void main(String[] args) {

        int arr[] = { 9, 4, 5, 7, 2, 3 };
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                   largest=arr[i];
            }
            if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }

        System.out.println(secondLargest);

    }
}
