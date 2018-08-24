package comp1110.homework.J13;

import java.util.HashMap;
import java.util.Scanner;

public class People {
    public static void main(String[] args) {
        String str = "";
        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();
        while (in.hasNext()){
            int num = 0;
            String a = in.nextLine();
            for (int j = 0;j<a.length();j++){
                if (a.charAt(j)==' '){
                    num = j;
                    break; }}
            if (num!=0){
            if (!a.substring(0,num).equals(" ")){
            map.put(a.substring(0,num),Integer.parseInt(a.substring(num+1)));}
            else {
            map.put("unknown",Integer.parseInt(a.substring(num+1)));
            }}else {
                str=a;}}
        if (map.get(str)!=null){
            System.out.println(map.get(str));}
            else {
            System.out.println("unknown");
        }
    }
}
