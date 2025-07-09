package module02_2D_Array;

public class Test01_Basic_Declaration_Of_Array {

    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        //10  20  30
        //40  50  60
        //70  80  90

        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;

        arr[1][0] =40;
        arr[1][1] =50;
        arr[1][2] =60;

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);

    }
}
