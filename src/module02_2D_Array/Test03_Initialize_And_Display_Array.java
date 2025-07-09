package module02_2D_Array;

public class Test03_Initialize_And_Display_Array {

    public static void main(String[] args) {

        int arr[][] = {{1,2,},{4,5,},{7,8}};

        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("============================================");

        int m =arr.length;        // no of rows
        int n= arr[0].length;     // no of colums

        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }

        System.out.println("=======================================================");

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("======================For Each=================================");

        for(int elem[] : arr){
            for(int x:elem){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
