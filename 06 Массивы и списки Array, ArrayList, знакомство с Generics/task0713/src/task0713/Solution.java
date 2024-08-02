package task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Золушку
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.


Requirements:
1. Объяви и сразу проинициализируй 4 переменных типа ArrayList<Integer> (список целых чисел). Первый список будет главным, а остальные - дополнительными.
2. Считать 20 чисел с клавиатуры и добавить их в главный список.
3. Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
4. Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
5. Добавить в третий дополнительный список все остальные числа из главного.
6. Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
7. Программа должна вывести три дополнительных списка, используя метод printList.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> allArr = new ArrayList<>();
        ArrayList<Integer> listWith3 = new ArrayList<>();
        ArrayList<Integer> listWith2 = new ArrayList<>();
        ArrayList<Integer> listWithOther = new ArrayList<>();
        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
        int init = 10;
        System.out.println("Введи с клавиатуры " + init + " чисел");

        for (int i = 0; i < init; i++) {
            allArr.add(Integer.parseInt(num.readLine()));
        }

        for (int i = 0; i < allArr.size(); i++) {
            if (allArr.get(i)%3==0 && allArr.get(i)%2==0) {
                listWith3.add(allArr.get(i));
                listWith2.add(allArr.get(i));
            } else if (allArr.get(i)%2==0) {
                listWith2.add(allArr.get(i));
            } else if (allArr.get(i)%3==0) {
                listWith3.add(allArr.get(i));
            }else {
                listWithOther.add(allArr.get(i));
            }
        }

        System.out.println("Лист который для x%3");
        System.out.println(listWith3);
        printList(listWith3);
        System.out.println("Лист который для x%2");
        System.out.println(listWith2);
        printList(listWith2);
        System.out.println("Лист который для остальных");
        System.out.println(listWithOther);
        printList(listWithOther);


    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i: list){
            System.out.println(i);
        }
    }
}
