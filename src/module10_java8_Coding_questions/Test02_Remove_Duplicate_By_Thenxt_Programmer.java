package module10_java8_Coding_questions;

//import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class Test02_Remove_Duplicate_By_Thenxt_Programmer {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(10);
        list.add(30);
        list.add(40);

        //method 1   using Set
        Set set = new HashSet();

        Set<Integer> setList=list.stream().filter(x-> set.add(x)).map(x->x).collect(Collectors.toSet());
        for (Integer elem : setList) {
            System.out.print(elem+" ");
        }
        System.out.println();


        //method -2  -Using distinct()

        Set<Integer> setDistinct=list.stream().distinct().collect(Collectors.toSet());
        setDistinct.forEach(x-> System.out.println(x));

        //method -3 Using List and hashMap
        System.out.println();


        List<Integer> newlist = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

      for(Integer elem : list){
         if(!map.containsKey(elem)){
             map.put(elem,1);
             newlist.add(elem);
         }
      }

        System.out.print(newlist);
    }

}
