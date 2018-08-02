package comp1110.homework.J07;
import java.util.Scanner;
public class Menu {

    public static int findRange(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i=0;i<array.length;i++) {
            max = max > array[i]?max:array[i];
            min = min < array[i]?min:array[i];
        }
        int range = max - min;
        return range;
    }
    public static int getMax(int[] array){
        int max = array[0];
        for (int i=0;i<array.length;i++){
            max = max > array[i]?max:array[i];
        }
        return max;
    }
    public static int getSecondHighest(int[] array) {
        int max1 = getMax(array);
        int max2 = array[0];
        int length = array.length;
        for (int i = 1; i < length; i++) {
            if (array[i]<max1&&array[i]>=max2) {
                max2 = array[i];
            } }
        return max2;
    }


    public static void main(String[] args) {
        System.out.println("Please enter:");
        System.out.println("1 to find range of the scores");
        System.out.println("2 to find the maximum score");
        System.out.println("3 to find the second highest score");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = in.nextInt();
        System.out.print("Enter the size of students: ");
        int numOfStudents = in.nextInt();
        int arrayOfGrades[] = new int[numOfStudents];
        for (int i = 0; i < arrayOfGrades.length; i++) {
            System.out.print("Enter the student" + (i + 1) + " grade: ");
            arrayOfGrades[i] = in.nextInt();
        }
        if (number == 1) {
            System.out.println("The range of the scores is "+findRange(arrayOfGrades));
        }else if (number == 2) {
            System.out.println("The maximum score is "+getMax(arrayOfGrades));
        }else if (number == 3) {
            System.out.println("The second highest score is "+ getSecondHighest(arrayOfGrades));
        }else {
            System.out.println("Invalid Option Selected");
        }
    }
}
