package task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
5. Должна быть выведена только одна строка.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader strInput = new BufferedReader(new InputStreamReader(System.in));
        int elemInArr = 5;
        System.out.println("Введи " + elemInArr + " строк");
        ArrayList<String> strList = new ArrayList<>();
        for (int i = 0; i < elemInArr; i++) {
            strList.add(strInput.readLine());
        }
        int initNumber = strList.get(0).length();
        int max = initNumber;
        int min = initNumber;

        for (String s: strList){
            if(s.length() > initNumber){
                max = s.length();
            }
            if(s.length()< initNumber){
                min = s.length();
            }
        }

        for (String s: strList){
            if(s.length()==max || s.length()==min){
                System.out.println(s);
                break;
            }
        }





    }
}
