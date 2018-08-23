package comp1110.homework.J09;

import com.sun.deploy.util.ArrayUtil;

import java.util.function.IntPredicate;

public class TeenCount {
    private static boolean applyPredicate(int value, IntPredicate predicate) {
        return predicate.test(value);
    }
    public static int[] teenLess(int[] array){
       String a = "";
       for (int i = 0;i < array.length ; i++){
           if (applyPredicate(array[i],x->x<13||x>19)){
               a+=""+(char)array[i];
           }}
       int[] b = new int[a.length()];
       for(int j = 0; j <a.length();j++){
              b[j]=a.charAt(j);
       }
       return b;
       }

    public static void main(String[] args) {
        int[] n={1,2,3,14};
        System.out.println(teenLess(n)[0]);
    }
}
