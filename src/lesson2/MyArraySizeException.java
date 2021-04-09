package lesson2;

public class MyArraySizeException extends Exception {

    public MyArraySizeException(String message) {
        super("Не верный размер преданного массива!");
    }
}
