package lesson3.AbonentsBook;

public class Main {
    public static void main(String[] args) {
        AbonentBook abonentBook = new AbonentBook();
        abonentBook.add("Петя", "11");
        abonentBook.add("Петя", "22");
        abonentBook.add("Вася", "33");
        abonentBook.add("Рома", "45");
        System.out.println(abonentBook.get("Петя"));
        System.out.println(abonentBook.get("Вася"));
        System.out.println(abonentBook.get("Рома"));
    }
}
