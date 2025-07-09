package module01_Array_Pwskills;

public class Test22_Intersection_Of_Two_Array {

    public static  void intersections(int arr1[],int arr2[]){
        if(arr1.length >arr2.length){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
               if(arr1[i]==arr2[j]){
                   System.out.println(arr1[i]+" ");
                   arr1[i] = Integer.MIN_VALUE;

                   break;
               }

            }
        }

        }else{
            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr2.length;j++){
                    if(arr1[i]==arr2[j]){
                        System.out.println(arr1[i]+" ");
                        arr1[i] = Integer.MIN_VALUE;

                        break;
                    }

                }
            }

        }

    }

    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3, 4, 2 };
        int arr2[] = { 2, 6, 1, 2 };

        intersections(arr1, arr2);

    }
}
