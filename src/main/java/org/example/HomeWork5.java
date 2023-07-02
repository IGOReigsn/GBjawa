//Урок 5. Хранение и обработка данных ч2: множество коллекций Map
//        Формат сдачи: ссылка на подписанный git-проект.
//
//        Задание
//
//        Реализуйте структуру телефонной книги с помощью HashMap.
//        Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
//        их необходимо считать, как одного человека с разными телефонами.
//        Вывод должен быть отсортирован по убыванию числа телефонов.
package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class HomeWork5 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map=new HashMap<>();
        addphone(map,"Иванов","111-111");
        addphone(map,"Сидоров","222-111");
        addphone(map,"Петров","333-111");
        addphone(map,"Иванов","111-222");
        addphone(map,"Иванов","111-333");
        addphone(map,"Петров","333-222");
        System.out.println("Первоначальный список: "+map);
        ArrayList<String> list=new ArrayList<>();
        for(String s: map.keySet()){
            list.add(s);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o2).size()-map.get(o1).size();
            }
        });
        System.out.println("Отсортированный список: "+list);
        System.out.println();
        System.out.println("Подробный отсортированный список :");
        list.forEach(n-> System.out.println(n+" : "+ "телефонов = "+map.get(n).size()+"  "+ map.get(n)+" )"));
    };
    private static void addphone(HashMap<String,ArrayList<String>> map,String name,String phone){
            map.putIfAbsent(name, new ArrayList<>());
            map.get(name).add(phone);
    };
}
