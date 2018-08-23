package comp1110.homework.J06;
import java.util.Scanner;

public class Permute {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        int strl=str1.length();
        if (str1.length() == str2.length()) {
            int code = 0;
            for (int i = str1.length()-1;i>=0;i--){
                char str0 = str1.charAt(i);
                if (str2.indexOf(str0)!=-1){
                    code++;
                    str1=str1.substring(0,i)+str1.substring(i+1);
                    for (int j = str2.length()-1;j>=0;j--){
                        if (str0==str2.charAt(j)){
                            str2=str2.substring(0,j)+str2.substring(j+1);
                            break;
                        }
                    }
                }else {
                    System.out.println("No");
                    break;
                }
            }
            if (code == strl){
                System.out.println("Yes");
            }
        }else { System.out.println("No");}
    }



}
