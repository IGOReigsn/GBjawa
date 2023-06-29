//Урок 4. Хранение и обработка данных ч1: приоритетные коллекции
//        Организовать ввод и хранение данных пользователей. ФИО возраст и пол
//        вывод в формате Фамилия И.О. возраст пол
//        добавить возможность выхода или вывода списка отсортированного по возрасту!)
//        *реализовать сортировку по возрасту с использованием индексов
//        *реализовать сортировку по возрасту и полу с использованием индексов
package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HomeWork4 {
    public static void main(String[] args) {
        ArrayList<Integer> id= new ArrayList<>();
        ArrayList<String> name =new ArrayList<>();
        ArrayList<Integer> age =new ArrayList<>();
        ArrayList<String> gender =new ArrayList<>();
        id.add(0);
        name.add("Иванов");
        age.add(55);
        gender.add("m");
        id.add(1);
        name.add("Иванова");
        age.add(60);
        gender.add("f");
        id.add(2);
        name.add("Петров");
        age.add(50);
        gender.add("m");
        id.add(3);
        name.add("Сидоров");
        age.add(35);
        gender.add("m");
        id.add(4);
        name.add("Кузнецова");
        age.add(30);
        gender.add("f");
        id.add(5);
        name.add("Смирнов");
        age.add(25);
        gender.add("m");
        id.add(6);
        name.add("Кузьмина");
        age.add(20);
        gender.add("f");
        System.out.println("Первоначальный список:");
        for (int i:id) {System.out.println(name.get(i)+" "+age.get(i)+" "+gender.get(i));}
        Collections.sort(id, new Comparator<Integer>(){
            public int compare( Integer o1, Integer o2){
              return age.get(o1)-age.get(o2);
            }
        });
        System.out.println("Отсортированный список:");
        for (int i:id) {System.out.println(name.get(i)+" "+age.get(i)+" "+gender.get(i));}
 /*       Collections.sort(id, new Comparator<Integer>(){
            public int compare( Integer o1, Integer o2){
                return (age.get(o2)+(if(gender.get(o2)=="f"){200;});)-age.get(o1)+100;
            }
        });
        for (int i:id) {System.out.println(name.get(i)+" "+age.get(i)+" "+gender.get(i));}
*/
        Collections.sort(id,(o1,o2)->age.get(o2)-age.get(o1));
        System.out.println("Обратная сортировка:");
        for (int i:id) {System.out.println(name.get(i)+" "+age.get(i)+" "+gender.get(i));}
    }



}
