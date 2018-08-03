package comp1110.homework.J04;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        if (name.isEmpty()){System.out.println();
        System.out.println(0);}
        else {
            System.out.println(name.toUpperCase());
            System.out.println(name.length()); }}
    }