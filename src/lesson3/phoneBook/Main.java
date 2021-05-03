package lesson3.phoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Петя", "111");
        phoneBook.add("Петя", "222");
        phoneBook.add("Вася", "333");
        phoneBook.add("Рома", "444");
        System.out.println(phoneBook.get("Петя"));
        System.out.println(phoneBook.get("Вася"));
        System.out.println(phoneBook.get("Рома"));
        System.out.println(phoneBook.get("Игорь"));
    }
}
