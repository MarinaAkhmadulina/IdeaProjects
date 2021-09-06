package Java_for_Testing.HomeWork_3;

public class Main {
    public static void main(String[] args) {
        Box boxApple = new Box();
        Box boxOrange = new Box();
        Box box = new Box();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        boxApple.addFruit(apple1);
        boxApple.addFruit(apple2);
        boxApple.addFruit(apple3);
        System.out.println("---------- Проверка метода getWeight ----------");
        System.out.println("Вес коробки c яблоками = " + boxApple.getWeight());
        System.out.println("---------- Проверка метода compare ----------");
        System.out.println("Вес коробки с яблоками равен весу коробки с апельсинами." +
                " Это утверждение = " + boxApple.compare(boxOrange));
        boxOrange.addFruit(orange1);
        boxOrange.addFruit(orange2);
        System.out.println("Вес коробки с яблоками равен весу коробки с апельсинами." +
                " Это утверждение = " + boxApple.compare(boxOrange));
        System.out.println("---------- Проверка метода addFruit (в коробке лежат фрукты другого типа) ----------");
        boxOrange.addFruit(apple1);
        System.out.println("---------- Проверка метода pourFruit ----------");
        boxApple.pourFruit(box);
        System.out.println("Кол-во фруктов в исходной коробке = " + boxApple.box.size() +
                ". Кол-во фруктов в новой коробке = " + box.box.size());
        System.out.println("---------- Проверка метода pourFruit (в коробку с апельсинами перемещаем яблоки) ----------");
        box.pourFruit(boxOrange);
    }
}