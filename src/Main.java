import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println(string("Aika, Jama, Dota"));
    }

    public static int method(int... num) {
        int summa = 0;
        for (int j : num) {
            summa = summa + j;
        }
        return  summa;


    }
    public static String string(String... name) {
        for (String s : name) {
            System.out.println("I LOVE YOU " + s);

        }
return "This is my loves)";
    }
    }




