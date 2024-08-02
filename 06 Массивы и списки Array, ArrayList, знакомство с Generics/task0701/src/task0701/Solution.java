package task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
1. В методе initializeArray():
1.1. Создай массив на 20 чисел
1.2. Считай с консоли 20 чисел и заполни ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива


Requirements:
1. Метод initializeArray должен создавать массив из 20 целых чисел.
2. Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
3. Метод max должен возвращать максимальный элемент из переданного массива.
4. Метод main изменять нельзя.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив

        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
        int [] resNum = new int[5];
        System.out.println("Введи " + resNum.length + " чисел");

        for (int i = 0; i < resNum.length; i++) {
            resNum[i] = Integer.parseInt(num.readLine());
        }

        return resNum;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int maxNumOfArr = array[0];
        for (int i = 0; i < array.length; i++) {
            if(maxNumOfArr<array[i]){
                maxNumOfArr = array[i];
            }
        }
        return maxNumOfArr;
    }
}
