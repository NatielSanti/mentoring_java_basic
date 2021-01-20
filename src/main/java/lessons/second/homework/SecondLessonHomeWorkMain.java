package lessons.second.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondLessonHomeWorkMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);

        Calculator sumCalculator = new CalculatorSum();
        Calculator productCalculator = new CalculatorProduct();

        System.out.println("Sum of list: " + sumCalculator.calculateList(list)); // 14
        System.out.println("Sum of map: " + sumCalculator.calculateMap(map));// 10
        System.out.println("Product of list: " + productCalculator.calculateList(list)); //120
        System.out.println("Product of map: " + productCalculator.calculateMap(map)); //24
    }
}
