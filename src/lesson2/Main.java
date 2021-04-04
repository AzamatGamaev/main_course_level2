package lesson2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            try {
                int a = 10/0;
            } catch (ArithmeticException e) {
                throw new MyArithmeticException();
            }
        } catch (MyArithmeticException e) {
            System.out.println("Поймал свою ошибку");
        }



//        try {
//            errorMethod(0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try (FileReader fileReader = new FileReader("G:\\Пример тестового.docx");
//                FileReader fileReader2 = new FileReader("G:\\Пример тестового.docx")){
//            System.out.println(fileReader.ready());
//            char[] chars = new char[100];
//            int count = fileReader.read(chars);
//            for (int i = 0; i < count; i++) {
//                System.out.print(chars[i]);
//            }
//            System.out.println();
//            throw new IOException();
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Файл не найден");
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println("Проблемы при чтении");
//            e.printStackTrace();
//        }

        System.out.println("Конец метода");
    }

    private static void errorMethod(int a) {
        int b = 10/a;
    }
}
