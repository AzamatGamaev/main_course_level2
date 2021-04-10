package lesson3.phoneBook;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private final Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String name, String number) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(number);
        } else {
            List<String>list = new LinkedList<>();
            list.add(number);
            phoneBook.put(name, list);
        }
    }

    public String get(String name){
        if (phoneBook.containsKey(name)){
            return phoneBook.get(name).toString();
        }
        return name + " не найден(а) в телефонной книге.";
    }
}

