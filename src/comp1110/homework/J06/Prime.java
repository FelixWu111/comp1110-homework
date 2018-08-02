package comp1110.homework.J06;
import java.util.Scanner;

public class Prime {
    public static Boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for (int i=2;i<=number;i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
