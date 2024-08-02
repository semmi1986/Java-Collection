package task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
3. Переставить M первых строк в конец списка.
4. Выведи список на экран, каждое значение с новой строки.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        //напишите тут ваш код
        System.out.println("введите число соответствующее количество для блока первых строк");
        int N = Integer.parseInt(reader.readLine());
        System.out.println("введите число соответствующее количество для блока вторых строк");
        int M = Integer.parseInt(reader.readLine());
        System.out.println("введите " +N + " слов для первого блока");
        for (int i = 0; i < N; i++) {
            list.add(reader.readLine());
        }
        System.out.println("введите " +M + " слов для второго блока");
        for (int i = 0; i < M; i++) {
            list.add(reader.readLine());
        }

        for (String s: list){
            System.out.println(s);
        }


    }
}
