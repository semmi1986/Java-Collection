package task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.


Requirements:
1. Программа должна выводить число на экран.
2. Программа должна считывать значения с клавиатуры.
3. В методе main объяви переменную типа List с типом элементов Integer и сразу проинициализируй ee.
4. Программа должна добавлять в коллекцию 10 чисел, согласно условию.
5. Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int init = 5;
        System.out.println("Ввуди " + init + " чисел");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < init; i++) {
            list.add(Integer.parseInt(input.readLine()));
        }

        int repeatCount = 1;
        int maxRepeatCount = 1;

        for (int i = 1; i < list.size(); i++) {
            if (!list.get(i - 1).equals(list.get(i))){
                repeatCount = 1;
            }else {
                repeatCount ++;
                if (repeatCount>maxRepeatCount){
                    maxRepeatCount=repeatCount;
                }
            }
        }

        System.out.println(maxRepeatCount);
    }
}
