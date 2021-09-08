package Java_for_Testing.HomeWork_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        System.out.println("---------- Добавление номеров ----------");
        phonebook.add(89124567889L, "Ivanov");
        phonebook.add(89124567889L, "Petrov");
        phonebook.add(89124567879L, "Sidorov");
        phonebook.add(89124567689L, "Ivanov");
        System.out.println("---------- Поиск номера по фамилии ----------");
        System.out.println(phonebook.get("Ivanov"));
        System.out.println(phonebook.get("Petrov"));
    }

    HashMap<Long, String> phonebook = new HashMap<>();

    public void add(Long number, String name) {
        if (phonebook.containsKey(number)) {
            System.out.println("Ошибка! Данный номер " + number + " уже добавлен в телефонный справочник!");
        } else {
            phonebook.put(number, name);
            System.out.println("Абонент " + name + " с номером телефона " + number + " добавлен.");
        }
    }

    public ArrayList<Long> get(String name) {
        ArrayList<Long> result = new ArrayList<>();
        for (Map.Entry<Long, String> pair : phonebook.entrySet()) {
            if (pair.getValue().equals(name)) {
                result.add(pair.getKey());
            }
        }
        return result;
    }
}