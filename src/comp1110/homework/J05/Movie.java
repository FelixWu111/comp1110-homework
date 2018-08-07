package comp1110.homework.J05;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int time = in.nextInt();
        int minites = time % 60;
        int hour = (time - minites) / 60;
        if (hour == 1 && minites != 0) {
            System.out.println(name + " runs for " + hour + " hour and " + minites + " minutes");}
        else if (hour == 1 && minites ==1) {
            System.out.println(name + " runs for " + hour + " hour and " + minites + " minute");}
        else if (hour == 1 && minites == 0) {
            System.out.println(name + " runs for " + hour + " hour");}
        else if (hour < 1 && minites == 1)  {
            System.out.println(name + " runs for " + minites + " minute");}
        else if (hour < 1 ) {
            System.out.println(name + " runs for " + minites + " minutes");}
        else if (hour > 1 && minites != 0) {
            System.out.println(name + " runs for " + hour + " hours and " + minites + " minutes");}
        else if (hour > 1 && minites == 1) {
            System.out.println(name + " runs for " + hour + " hours and " + minites + " minute");}
        else if (hour > 1 && minites == 0) {
            System.out.println(name + " runs for " + hour + " hours");}

    }

}
