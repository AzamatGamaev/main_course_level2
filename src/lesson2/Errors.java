package lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Errors {
    private static boolean tr = true;
    public static void main(String[] args) {
//        recursion();
        fillMemory();
    }

    private static void recursion(Object[] parent) {
        for (int i = 0; i < parent.length; i++) {
            if (parent[i] instanceof Object[]) {
                recursion((Object[]) parent[i]);
            } else {
                System.out.println(parent[i]);
            }
        }
    }

    private static void recursion() {
        int a = 1, b = 1, c = 1, d = 1, e = 1, g = 1, i = 1;
        System.out.println(a+b+c+d+e+g+i);
        recursion();
    }

    private static void fillMemory() {
        List<StringBuilder> arrayList = new ArrayList<>(100000000);
        while (tr) {
            arrayList.add(new StringBuilder("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"));
        }
        arrayList.forEach(System.out::println);
    }
}
