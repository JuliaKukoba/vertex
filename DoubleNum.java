package vertex.lesson5.homework;

import java.util.Scanner;

/**
 * Created by Юлия on 15.07.2017.
 */
// Задача 5: Ввести дробное число. Вывести целую часть.

public class DoubleNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        double f1 = sc.nextDouble();
        int x = (int) f1;
        System.out.println(x);

        sc.close();
    }
}
