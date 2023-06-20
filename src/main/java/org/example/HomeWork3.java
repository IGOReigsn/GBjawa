//Урок 3. Коллекции JAVA: Введение
//        Формат сдачи: ссылка на подписанный git-проект.
//
//        Задание
//
//        Пусть дан произвольный список из 100 целых чисел.
//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение
package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i=0; i<100;i++){
            arrList.add( new Random().nextInt(1000));}
        System.out.println("Произвольный массив: ");
        System.out.print(arrList);
        for (int i= arrList.size()-1; i>=0;i--) {//выбрасываем четные, проходя с конца в начало списка
            if (arrList.get(i) % 2 == 0) {
                arrList.remove(i);
            }
        }
        System.out.println();
        System.out.println("С удаленными четными числами: ");
        System.out.println(arrList);
        int min=Collections.min(arrList);
        System.out.println("Минимальное значение = "+min);
        int max=Collections.max(arrList);
        System.out.println("Максимальное значение = "+max);
        Integer summa=0;
        Integer count=arrList.size();
        for (int i= 0; i<arrList.size();i++){
            summa=summa+arrList.get(i);}
        System.out.print("Среднее значение : "+summa.floatValue()/count.floatValue());//плавающая точка
        }
    }

