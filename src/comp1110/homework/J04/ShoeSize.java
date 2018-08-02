package comp1110.homework.J04;
import java.util.Scanner;

public class ShoeSize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float height = in.nextFloat();
        height*=5;
        int height2 = Math.round(height);
        System.out.println(height2);


    }
}