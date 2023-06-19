package org.example;
import java.util.Random;

public class Seminar2 {

    public static void main(String[] args) {
        String str = "!Hello World! ";
        String str1 = "Hello! ";
        str1 = str;
//        Integer.numberOfLeadingZeros(7654);
//        Integer.numberOfTrailingZeros(12);

        str.getBytes();
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        if (str.isEmpty());
        if (str.length()==0);

        System.out.println(str.charAt(str.length()/2));
        System.out.println(str.indexOf("!"));
        System.out.println(str.indexOf("!", str.indexOf("!")+1));
        System.out.println(str.lastIndexOf("!"));
        System.out.println(str.lastIndexOf("!", str.lastIndexOf("!")-1));
        System.out.println(str.endsWith("! "));

        System.out.println(str.equals("!"));
        System.out.println(str.contains("!"));

        System.out.println("-".repeat(32));
        System.out.println(str.repeat(4).replace("!", "?"));
        System.out.println(str.repeat(4).replace("!", ""));
        System.out.println(str.repeat(4).replaceFirst("!", "<?>"));

        System.out.println(str.substring(str.length()/2));
        System.out.println(str.substring(str.length()/2, str.length()-1));

        str.concat("!");

        String[] tmp = str.repeat(4).split(" ");

        System.out.println(str);

        StringBuilder builder = new StringBuilder("Hello World!");
        builder = new StringBuilder(32);
        builder = new StringBuilder();
        builder = new StringBuilder(str);

        builder
                .append(.43123f)    //РґСЂРѕР±РЅРѕРµ!
                .append(true)
                .append("!");

        builder.deleteCharAt(builder.length()/2);
        builder.delete(0, builder.length()/2-1);
        builder.insert(0, "РџСЂРёРІРµС‚ ");
        builder.replace(2, 4, "!!!");
        builder.reverse();

        builder.charAt(builder.length()/2);
        builder.indexOf("!");
        builder.indexOf("!", builder.indexOf("!")+1);
        builder.lastIndexOf("!");
        builder.lastIndexOf("!", builder.lastIndexOf("!")-1);

        str = builder.toString();
        str = new StringBuilder(str).reverse().toString();

        System.out.println(builder);

        String s = "";
        StringBuilder builder1 = new StringBuilder("");

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            s += Character.getName(i);
        }
        System.out.println("String time = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            builder1.append(Character.getName(i));
        }
        System.out.println("StringBuilder time = " + (System.currentTimeMillis() - start));

    }

}