package module01_Array_Pwskills;

public class Test21_Merge_Sort {

    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 7 ,12,15,17};
        int arr2[] = { 2, 4, 9, 11 };
        int ans[] = mergeSortedArray(arr1, arr2);
        for (int elem : ans) {
            System.out.print(elem + " ");
        }

    }

    private static int[] mergeSortedArray(int[] arr1, int[] arr2) {

        int m = arr1.length;
        int n = arr2.length;

        int i=0;
        int j=0;
        int k=0;

        int brr[] = new int[m+n];

        while(i<arr1.length && j<arr2.length){


                if (arr1[i] < arr2[j]) {
                    brr[k] = arr1[i];
                    i++;
                    k++;
                }else{
                    brr[k] = arr2[j];
                    j++;
                    k++;
                }

            }



        if(i==arr1.length){
            while (j < arr2.length) {

                brr[k] = arr2[j];
                j++;
                k++;
            }
        }

        if (j == arr2.length) {
            while (i <arr1.length) {

                brr[k] = arr1[i];
                i++;
                k++;
            }
        }

        return brr;

    }



}
