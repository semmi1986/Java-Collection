package task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 10 строк с клавиатуры и добавь их в список.
3. Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
4. Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader strInput = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        int init = 6;
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < init; i++) {
            list.add(strInput.readLine());
        }

        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).length() > list.get(i+1).length()){
                System.out.println(i);
                break;
            }
        }




    }
}

