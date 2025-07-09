package module01_Array_Pwskills;

public class Test31_Rotate_Element_Group_3 {



    private static void rotateInGroups(int[] arr,int k) {

        for(int i=0;i<arr.length;i=i+3){

            int left =i;
            int right = i+k-1;

            while(left < right){

                int temp = arr[left];
                arr[left]  = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }

        }
    }

    public static void printArray(int arr[]) {
        for(int elem :arr) {
            System.out.print(elem+" ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original array:");
        printArray(arr);
        int k=3;
        rotateInGroups(arr,k);

        System.out.println("\nArray after rotating in groups of 3:");
        printArray(arr);

    }


}
