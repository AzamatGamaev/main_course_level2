package lesson3.AbonentsBook;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AbonentBook {
    private Map<String, List<String>> abonentBook = new HashMap<>();

    public void add(String name, String number) {
        if (abonentBook.containsKey(name)) {
            abonentBook.get(name).add(number);
        } else {
            List<String>list = new LinkedList<>();
            list.add(number);
            abonentBook.put(name, list);
        }
    }

    public String get(String name){
        if (abonentBook.containsKey(name)){
            return abonentBook.get(name).toString();

        }
        return null;
    }
}
