package task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Массив из строчек в обратном порядке
1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.


Requirements:
1. Программа должна создавать массив на 10 строк.
2. Программа должна считывать 8 строк для массива с клавиатуры.
3. Программа должна выводить на экран 10 строк, каждую с новой строки.
4. Программа должна выводить на экран массив (10 элементов) в обратном порядке.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String[] arrStr = new String[10];

        for (int i = 0; i < 8; i++) {
            arrStr[i] = str.readLine();
        }

        for (int i = arrStr.length-1; i >= 0 ; i--) {
            System.out.println(arrStr[i]);
        }


        //напишите тут ваш код
    }
}