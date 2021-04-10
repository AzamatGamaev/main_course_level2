package lesson3.AbonentsBook;

public class Main {
    public static void main(String[] args) {
        AbonentBook abonentBook = new AbonentBook();
        abonentBook.add("Петя", "111");
        abonentBook.add("Петя", "222");
        abonentBook.add("Вася", "333");
        abonentBook.add("Рома", "444");
        System.out.println(abonentBook.get("Петя"));
        System.out.println(abonentBook.get("Вася"));
        System.out.println(abonentBook.get("Рома"));
    }
}
