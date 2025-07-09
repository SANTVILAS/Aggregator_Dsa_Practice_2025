package module01_Array_Pwskills;

public class Test05_Sum2 {

    public static int[] twoSum(int[] arr, int target) {

        int[] brr = new int[2];

        for(int i=0;i<arr.length;i++){
            boolean flag = false;
              for(int j=i+1;j<arr.length;j++){
               if(arr[i]+arr[j]==target){
                   brr[0] = i;
                   brr[1] = j;
                   flag =true;
                   break;
               }
              }

              if(flag==true){
                  break;
              }
        }
    return brr;
    }


    public static void main(String[] args) {
        int arr[] = {2,11,7,15};
        int[] arr1=twoSum(arr,9);

        for(int elem:arr1){
            System.out.println(elem+" ");
        }
    }
}
