package interview.firstcase;

import java.util.ArrayList;
import java.util.List;

public class MainFruits {
    public static void main(String[] args) {
        AppleBasket apple1 = new AppleBasket(3, "red");
        AppleBasket apple2 = new AppleBasket(2, "yellow");
        PearBasket pear1 = new PearBasket(4, "soft");

        FruitBasket[] arr = new FruitBasket[3];
        arr[0] = apple1;
        arr[1] = apple2;
        arr[2] = pear1;

        List<FruitBasket> list = new ArrayList<>();
        list.add(apple1);
        list.add(apple2);
        list.add(pear1);

        int resultArr = eatFruit(arr);
        int resultList = eatFruit(list);
        System.out.println(resultArr + " " + resultList);
    }

    private static int eatFruit(FruitBasket[] fruits) {
        fruits[fruits.length - 1] = null;
        return fruits.length;
    }

    private static int eatFruit(List<FruitBasket> fruits) {
        fruits.remove(fruits.size() - 1);
        return fruits.size();
    }

}

