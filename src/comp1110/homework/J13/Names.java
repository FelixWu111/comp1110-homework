package comp1110.homework.J13;

import java.util.ArrayList;
import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String n = in.nextLine();
            a.add(n);
        }
        for (int i = a.size()-1;i>=0;i--){
            System.out.println(a.get(i));
        }

    }
}
