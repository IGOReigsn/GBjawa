package org.example;
import java.util.*;

public class Seminar3 {

    public static void main(String[] args) {

//        Object o = new Object();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(15));
            list2.add(new Random().nextInt(15));
        }

//        list.add(1);            //Integer
//        list.add(.24f);         //Float
//        list.add("РџСЂРёРІРµС‚!");    //String
//        list.add(true);         //Boolean
//
//        if (list.get(2) instanceof String) {
//            String s = (String) list.get(2);
//        }

//        list.add(12);
//        list.add(1, 12);
//        list.addAll(list2);
//        list.addAll(2, list2);
//        list.set(2, 12);
//
//        list.size();
//        if (list.contains(12));
//        list.remove(12);
//        Integer in = 12;
//        list.remove(in);
//        list.clear();
//        ArrayList<Integer> integers = (ArrayList<Integer>) list.subList(1, list.size()/2);
//        list.trimToSize();
//        list.ensureCapacity(100);
//        list.indexOf(12);
//        list.lastIndexOf(12);

        System.out.println(list);
        System.out.println(list2);
        System.out.println("-".repeat(16));

//        list.retainAll(list2);
//        list.removeAll(list2);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1%3!=0) return 0;
                if (o2%2==0) return 1;
                return -1;
            }
        });

        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        for (int i: list) {
//            System.out.println(i);
//        }
//
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            int i = iterator.next();
//            iterator.remove();
//        }
//
//        ListIterator<Integer> iterator2 = list.listIterator(list.size()-1);
//        while (iterator2.hasPrevious()){
//            int i = iterator2.previous();
//            iterator2.remove();
//            iterator2.nextIndex();
//        }

//        list2.clear();
//        list.forEach(n -> list2.add(0, n));

        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(12);
        integers.add(0, 12);




    }

}
