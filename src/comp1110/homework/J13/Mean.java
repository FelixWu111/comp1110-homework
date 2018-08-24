package comp1110.homework.J13;

import java.util.ArrayList;
import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        ArrayList<Double> a = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            Double n= in.nextDouble();
            a.add(n);
        }
        Double sum = 0.0;
        Double ave = 0.0;
        for (int i = 0; i<a.size();i++){
            sum+=a.get(i);
        }
        ave = sum/a.size();
        System.out.println(ave);
    }

}
