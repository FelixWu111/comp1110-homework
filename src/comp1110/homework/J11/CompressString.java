package comp1110.homework.J11;

import java.util.Scanner;

public class CompressString {
    public static String compressString(String str){
        int length = str.length();
        String str0 = "";
        String str1 = "";
        int n = 1;
        if (!str.equals(" ")) {
            for (int i = 0; i < length; i++) {
                if (i != length - 1) {
                    if (str.charAt(i) == str.charAt(i + 1)) {
                        n++;
                    } else {
                        str0 += "" + str.charAt(i) + n;
                        n = 1;
                    }
                } else {str0 += "" + str.charAt(i) + n;}
            }
        }else {
            str0="";
        }
        for (int j = 0; j<str0.length();j++){
            if (j%2==0){
                if (str0.charAt(j+1)=='1'){
                    str1+=""+str0.charAt(j);
                }else {
                    str1+=""+str0.charAt(j)+str0.charAt(j+1);
                }
            }
        }
        return str1;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a = in.nextLine();
        System.out.println(compressString(a));

    }

}
