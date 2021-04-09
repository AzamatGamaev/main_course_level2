package lesson2;

public class Main {
    public static void main(String[] args) {

        String[][] array1 = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};

        String[][] array2 = {{"S", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};

        String[][] array3 = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};

        try {
            System.out.println("Сумма элементов массива = " + MathArrayUtils.sumArray(array1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Сумма элементов массива = " + MathArrayUtils.sumArray(array2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Сумма элементов массива = " + MathArrayUtils.sumArray(array3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }


}
