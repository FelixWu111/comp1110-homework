package comp1110.homework.J12;

public class Exchange {
    public static <T> T[] swap(T[] arr, int a, int b){
        if(a>=0&&a<arr.length&&b>=0&&b<arr.length){
            T temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }return arr;
    }
}
