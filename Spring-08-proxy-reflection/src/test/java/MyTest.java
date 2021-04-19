import java.util.*;
import java.util.function.BiFunction;

public class MyTest {
    public static void main(String[] args) {
        // 遍历map
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(7);
        list.add(1);
        list.add(8);
        list.add(2);

//        //Collections.sort(list);
//        list.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        });

        //list.sort((o1,o2)->o2-o1);
        Collections.sort(list,(o1,o2)->o2-o1);

        System.out.println(list);

//        Scanner sc = new Scanner(System.in);
//        map.put("1",1);
//        map.put("2",2);
//        map.put("3",3);
//
//        map.replaceAll((K,V) ->{
//            return V+1;
//        });
//
//
//        map.forEach((K,V)->{
//            System.out.println("K:" + K+ " V:" + V);
//        });
//
//        int n = sc.nextInt();
//        String str = null;
//
//        for (Map.Entry<String, Integer> entry : map.entrySet()){
//            System.out.println("key:" + entry.getKey());
//            System.out.println("values:" + entry.getValue());
//        }
//
//        sc.close();
    }
}
