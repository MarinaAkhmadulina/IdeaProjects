package Java_for_Testing.HomeWork_3;

public class ChangeArray {
    public static void main(String[] args) {
        String[] array = {"Hello", "World"};
        System.out.println(array[0] + " " + array[1]);
        changeArray(array);
        System.out.println(array[0] + " " + array[1]);
    }

    public static void changeArray(String[] array) {
        String buff = array[1];
        array[1] = array[0];
        array[0] = buff;
    }
}