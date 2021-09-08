package Java_for_Testing.HomeWork_4;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayWords {
    public static void main(String[] args) {
        Set<String> esenin = new LinkedHashSet<>();
        HashMap<String, Integer> repeatWords = new HashMap<>();

        String text = "Вы помните " +
                "Вы все конечно помните " +
                "Как я стоял " +
                "Приблизившись к стене " +
                "Взволнованно ходили вы по комнате " +
                "И что-то резкое " +
                "В лицо бросали мне " +
                "Вы говорили " +
                "Нам пора расстаться " +
                "Что вас измучила " +
                "Моя шальная жизнь " +
                "Что вам пора за дело приниматься " +
                "А мой удел " +
                "Катиться дальше вниз ";

        String[] words = text.split("\\s");

        System.out.println("---------- Список уникальных слов ----------");

        for (String subText : words) {
            esenin.add(subText);
        }

        System.out.println(esenin);
        System.out.println("---------- Считаем сколько раз встречается каждое слово ----------");

        for (String subText : words) {
            if (repeatWords.containsKey(subText)) {
                repeatWords.put(subText, repeatWords.get(subText) + 1);
            } else {
                repeatWords.put(subText, 1);
            }
        }
        System.out.println(repeatWords);
    }
}