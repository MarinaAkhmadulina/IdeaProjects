package Java_for_Testing.HomeWork_2;

public class CheckArray {
    public static void main(String[] args) {
        String[][] unsuitableSizeArray = {{"1", "5", "7"}, {"8", "6", "2"}};
        String[][] unsuitableSymbolArray = {{"1", "3", "5", "mistake"}, {"7", "9", "11", "0"}, {"1", "3", "5", "mistake"}, {"7", "9", "11", "0"}};
        String[][] suitableArray = {{"2", "4", "6", "8"}, {"0", "1", "3", "5"}, {"2", "4", "6", "8"}, {"0", "1", "3", "5"}};
        String sum = checkArray(unsuitableSizeArray);
        System.out.println(sum);
        System.out.println("---------------------------------");
        sum = checkArray(unsuitableSymbolArray);
        System.out.println("Сумма значений из массива равна " + sum);
        System.out.println("---------------------------------");
        sum = checkArray(suitableArray);
        System.out.println("Сумма значений из массива равна " + sum);
    }

    public static String checkArray(String[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length != 4 || array[i].length != 4) {
                    try {
                        throw new MyArraySizeException();
                    } catch (MyArraySizeException e) {
                        return "Ошибка. Размер массива должен быть 4х4.";
                    }
                }
                try {
                    sum = sum + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    try {
                        throw new MyArrayDataException();
                    } catch (MyArrayDataException ex) {
                        System.out.println("Данные из ячейки " + "[" + i + "]" + "[" + j + "] не удалось " +
                                "преобразовать в формат int. Значения из ячейки = " + array[i][j]);
                    }
                }
            }
        }
        return Integer.toString(sum);
    }

    public static class MyArraySizeException extends ArithmeticException {
    }

    public static class MyArrayDataException extends NumberFormatException {
    }
}