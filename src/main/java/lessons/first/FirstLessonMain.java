package lessons.first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstLessonMain {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 12;
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        int[][] arrMulti = new int[2][3];
        int multi = 1;
        int multuSum = 0;
        for(int i = 0; i < arrMulti.length; i++){
            for(int j = 0; j < arrMulti[i].length; j++){
                arrMulti[i][j] = multi;
                multi++;
                System.out.println("ArrMulti element in row: " + i +
                        " and column: " + j + " == " +  arrMulti[i][j]);
                multuSum += arrMulti[i][j];
            }
        }
        System.out.println("ArrMulti sum: " + multuSum);

//        ArrayList<Integer> listFull = new ArrayList<Integer>();
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        System.out.println("Lists size: " + list.size());
//        list.remove(0);
//        System.out.println("Lists size: " + list.size());
////        list.clear();
//
//        for(int i = 0; i < list.size(); i++){
//            System.out.println( "index: " + i + ", element value: "+ list.get(0));
//        }
//
//        HashMap<String, Integer> mapFull = new HashMap<String, Integer>();
//        Map<String, Integer> map = new HashMap<>();
//        map.put("one", 1);
//        map.put("two", 2);
//        map.put("three", 3);
//        map.put("four", 4);
//        System.out.println("Map size: " + map.size());
//        map.remove("one");
//        System.out.println("Map size: " + map.size());
//
//        for(Map.Entry<String, Integer> item : map.entrySet()){
//            System.out.printf("Key: %s  Value: %d \n", item.getKey(), item.getValue());
//        }
    }
}
