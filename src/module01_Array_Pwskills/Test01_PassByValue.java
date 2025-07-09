package module01_Array_Pwskills;

public class Test01_PassByValue {
    public static void main(String[] args) {
          int x =5;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }

    private static void change(int x) {
        x =10;
        System.out.println("Inside another memory value of x "+x);
    }
}
