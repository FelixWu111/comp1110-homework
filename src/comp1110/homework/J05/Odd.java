package comp1110.homework.J05;

import java.util.Scanner;

public class Odd {
    public static boolean isOdd(int i) {
        if (i % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        if (isOdd(X)) {
            System.out.println(X +" is odd");}
        else {    System.out.println(X +" is even");}
    }
}
