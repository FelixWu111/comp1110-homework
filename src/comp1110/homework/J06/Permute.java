package comp1110.homework.J06;
import java.util.Scanner;

public class Permute {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        if (str1.length() == str2.length()) {
            int code = 0;
            for (int i = 0;i<str1.length();i++){
                char str0 = str1.charAt(i);
                if (str2.indexOf(str0)!=-1){
                    code++;
                }else {
                    System.out.println("No");
                    break;
                }
            }
            if (code == str1.length()){
                System.out.println("Yes");
            }
        }else { System.out.println("No");}
    }
}
