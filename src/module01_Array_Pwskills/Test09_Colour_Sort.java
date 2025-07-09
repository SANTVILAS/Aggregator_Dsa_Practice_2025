package module01_Array_Pwskills;

public class Test09_Colour_Sort {

    public static void sortColors(int[] arr) {

        int countNumberOfZeros = 0;
        int countNumberOfOnes = 0;
        int countNumberOfTwos = 0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==0){
                countNumberOfZeros++;

            }else if(arr[i]==1){
                countNumberOfOnes++;
            }else{
                countNumberOfTwos++;
            }




        }


        for(int i=0;i<arr.length;i++){
            if(i<countNumberOfZeros){
                arr[i]=0;
            }else if(i<countNumberOfZeros+countNumberOfOnes){
                arr[0]=1;
            }else{
                arr[0]=2;
            }

        }
    }





    //methos -2 Dutch flag algorithm
    public static void sortColour(int arr[]){

        int high =arr.length-1;
        int low =0;
        int mid =0;

        while(mid<=high){

            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }else{ //arr[i]==2

                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] =temp;
                high--;
            }
        }

    }

    public static void main(String[] args) {

        int arr[] ={1,0,2,2,2,1,1,0,1,2,0,0,0};
      //  sortColors(arr);
        sortColour(arr);
        for(int elem:arr) {
            System.out.print(elem+" ");
        }
    }
}
