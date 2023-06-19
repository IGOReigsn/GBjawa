package org.example;

import java.util.Random;
import java.util.Scanner;

public class Seminar1 {

    public static void main(String[] args) {

        int i = 't';
        float f = .543f;
        long l;
        double d;
        short sh;
        byte b;
        char ch = 'g';
        boolean b1 = false;

        //---------------------------------

        int[] ints = new int[12];
        Random random = new Random();
        for (int j = 0; j < ints.length; j++) ints[j] = random.nextInt(2000);

        int[] tmp = new int[ints.length + 3];
        System.arraycopy(ints, 0, tmp, 0, ints.length);
        ints = tmp;

        i = 0;
        for (int j = 0, tm = 12; j < 12; j++, tm -= 23, i += j) ;
        System.out.println(i);

        if (b1) System.out.println(b1);

        String str = "РџСЂРёРІРµС‚ РњРёСЂ!";
        str += "?";

        System.out.println(str.substring(1, str.length() - 1));
        System.out.println("HI!".toLowerCase().repeat(3).length());

        Scanner scanner = new Scanner(System.in);

        String s;
        do {
            s = scanner.nextLine();
            System.out.println(s);
        } while (!s.equals("q"));


    }

}