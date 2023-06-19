
/*      1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

        Пункты реализовать в методе main
        *Пункты реализовать в разных методах

        int i = new Random().nextInt(k); //это кидалка случайных чисел!)*/
//------------------------------------------------------------------------------JJHH
package org.example;
import java.util.Random;
//import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task1");
        int i = new Random().nextInt(2000);
        System.out.println(" Случайное число:" + i);
        // Task2
        System.out.println("Task2");
        System.out.println("    В двоичном коде:" + Integer.toBinaryString(i));
        Integer n = Integer.toBinaryString(i).length();
        System.out.println("2.Номер старшего значащего бита:" + n);
        // Task3 Задачи 3,4 сделаны с массивом, т.к. списки на момент выдачи задания "не проходили"
        System.out.println("Task3");
        int[] m1 = new int[(Short.MAX_VALUE - i) / n+1];
        int index1 = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1[index1] = j;
                index1++;
                System.out.print(j + " ");
            }
        }
        System.out.println();
        // Task4
        System.out.println("Task4");
        int tmp=(Short.MIN_VALUE - i);
        int[] m2 = new int[tmp/n-tmp+1];//учтен знак и уменьшение количества элементов из-за отсутствия кратных чисел
        int index2 = 0;
        for (int j = Short.MIN_VALUE; j <= i; j++) {
            if (j % n != 0) {
                m2[index2] = j;
                index2++;
                System.out.print(j + " ");
            }

        }
        System.out.println();
    }
}
