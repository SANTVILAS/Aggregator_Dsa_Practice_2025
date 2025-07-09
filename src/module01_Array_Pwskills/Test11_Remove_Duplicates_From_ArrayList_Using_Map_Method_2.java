package module01_Array_Pwskills;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test11_Remove_Duplicates_From_ArrayList_Using_Map_Method_2 {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(10);

        Map<Integer,Integer> map = new HashMap();
        List<Integer> duplicates = new ArrayList<>();


        for(Integer elm :list){
            if(!map.containsKey(elm)){
                map.put(elm,1);
                duplicates.add(elm);
            }



        }

        System.out.println(duplicates);




    }

}
