package comp1110.homework.J06;
import java.util.Scanner;

public class Ones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number>=0) {
            String ns = Integer.toBinaryString(number);
            int ones = 0;
            for (int i = 1; i <= ns.length();) {
                if (ns.startsWith("1")) {
                    ones++;
                    ns = ns.substring(1);
                } else {
                    ns = ns.substring(1);
                }
            }
            System.out.println(ones);
        }
    }
}
