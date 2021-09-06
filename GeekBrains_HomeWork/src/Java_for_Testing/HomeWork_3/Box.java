package Java_for_Testing.HomeWork_3;

import java.util.ArrayList;

public class Box {
    ArrayList<Fruit> box = new ArrayList<>();

    public float getWeight() {
        if (box.size()==0) {
            return 0;
        }
        if (box.get(0) instanceof Apple) {
            return (float) (1.0 * box.size());
        }
        if (box.get(0) instanceof Orange) {
            return (float) (1.5 * box.size());
        } else return 0;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void addFruit(Fruit fruit) {
        if (box.isEmpty()) {
            box.add(fruit);
        } else if ((box.get(0) instanceof Apple && fruit instanceof Apple) ||
                (box.get(0) instanceof Orange && fruit instanceof Orange)) {
            box.add(fruit);
        } else {
            System.out.println("Фрукт не добавлен, т.к. в коробке лежат фрукты другого типа");
        }
    }

    public void pourFruit(Box box) {
        int sum = this.box.size() + box.box.size();
        if (!(this.box.size() == 0)) {
            if (box.box.size() == 0) {
                for (Fruit fruit : this.box
                ) {
                    box.addFruit(fruit);
                }
                if (sum == box.box.size()) {
                    this.box.clear();
                }
            } else {
                if (((this.box.get(0) instanceof Apple) && (box.box.get(0) instanceof Apple)) ||
                        ((this.box.get(0) instanceof Orange) && (box.box.get(0) instanceof Orange))) {
                    for (Fruit fruit : this.box
                    ) {
                        box.addFruit(fruit);
                    }
                    if (sum == box.box.size()) {
                        this.box.clear();
                    }
                } else System.out.println("Перемещение между ящиками не удалось");
            }
        } else {
            System.out.println("Перемещение между ящиками не удалось");
        }
    }
}