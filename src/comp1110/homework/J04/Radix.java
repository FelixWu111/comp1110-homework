package comp1110.homework.J04;

import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base1 = in.nextInt();
        int base2 = in.nextInt();
        String number = in.next();
        int number1 = Integer.parseInt(number,base1);
        System.out.println(Integer.toString(number1,base2));
    }
}
