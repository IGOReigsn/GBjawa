package org.example;
import java.util.HashMap;
import java.util.Iterator;
//import java.util.HashSet;
//import java.util.Set;

//Урок 6. Хранение и обработка данных ч3: множество коллекций Set
//        Разработать программу, имитирующую поведение коллекции HashSet.
//        В программе содать метод add добавляющий элемент, метод toString возвращающий строку
//        с элементами множества *и метод позволяющий читать элементы по индексу.
//        *Реализовать все методы из семинара.
//        Формат данных Integer.
public class HomeWork6 {
    public static void main(String[] args) {
        Set<Integer> set1 = new Set();
        System.out.println("SET пустой? "+set1.isEmpty());
        System.out.println("Добавление: "+set1.add(11));
        System.out.println("Добавление: "+set1.add(22));
        System.out.println("Добавление: "+set1.add(33));
        System.out.println("Повторное добавление: "+set1.add(33));
        System.out.println("Добавление: "+set1.add(44));
        System.out.println("Размер SETa: "+set1.size());
        System.out.println("Удаление: "+set1.remove(44));
        System.out.println("Повторное Удаление: "+set1.remove(44));
        System.out.println("Удаление: "+set1.remove(33));
        System.out.println("SET пустой? "+set1.isEmpty());
        System.out.println("Размер SETa: "+set1.size());
        System.out.println("Весь SET :");
        set1.out();
        System.out.println("Весь SET (через внешний цикл):");
        Iterator<Integer> iter=set1.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());}
        System.out.print("SET в строку (toString) : ");
        String str =new String();
        str=set1.toString();
        System.out.println(str);
        System.out.println("Очистка ");
        set1.clear();
        System.out.println("SET пустой? "+set1.isEmpty());
        System.out.println("Размер SETa: "+set1.size());

        }
}

class Set<E>{
    private HashMap<E,Object> set=new HashMap<>();

    private static final Object VALL =new Object();


    public boolean add(E tel){
        return set.put(tel,VALL)==null;
    }

    public boolean remove(E tel){
        return set.remove(tel)==VALL;
    }

    public int size(){
        return set.size();
    }

    public boolean isEmpty(){
        return set.isEmpty();
    }

    public void out(){
        Iterator<E> iter=set.keySet().iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }

    public Iterator<E> iterator(){
        return set.keySet().iterator();
    }

    public void clear(){
        set.clear();
    };

//    public  String toString(){// Это дает неудачный формат вывода
//        return set.toString() ;
//    }

       public  String toString(){
           StringBuilder sb=new StringBuilder();
           Iterator<E> iter=set.keySet().iterator();
           while (iter.hasNext()){
               sb.append(iter.next());
               sb.append(" ");
           }
        return sb.toString();
       }
}