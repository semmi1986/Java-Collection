package task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter). Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
Программа выводит содержимое нового списка на экран.

Пример ввода:
Кот
Коты
Я

Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я


Requirements:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна вывести столько же строк, сколько было введено.
3. Если в строке было четное число букв, то необходимо удвоить строку (как в примере).
4. Если в строке было нечетное число букв, то необходимо утроить строку (как в примере).
5. Программа должна прекращать считывать данные с клавиатуры как только пользователь введет пустую строку и нажмет Enter.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

/*        ArrayList<String> strings = new ArrayList<>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<>();
        for (String string : strings) {
            resultStrings.add(string.toUpperCase());
        }

        for (String resultString : resultStrings) {
            System.out.println(resultString);
        }*/

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            list.add(string);
        }



        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list) {
            if (s.length() % 2 == 0)
                list2.add(s + " " + s);
            else
                list2.add(s + " " + s + " " + s);
        }

        for (String s : list2) {
            System.out.println(s);
        }
    }
}
