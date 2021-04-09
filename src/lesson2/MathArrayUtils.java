package lesson2;

public class MathArrayUtils {
    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length != 4) {
            throw new MyArraySizeException("Не верный размер преданного массива!");
        }
        for (String[] strings : array) {
            if (strings.length != 4) {
                throw new MyArraySizeException("Не верный размер преданного массива!");
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return sum;
    }
}
