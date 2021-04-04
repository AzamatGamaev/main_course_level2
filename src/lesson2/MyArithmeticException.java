package lesson2;

public class MyArithmeticException extends ArithmeticException{

    public MyArithmeticException() {
        super("Моя специфическая ошибка");
    }
}
