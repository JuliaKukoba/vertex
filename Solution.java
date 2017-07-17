package vertex.lesson5.homework;

import java.util.Scanner;

/**
 * Created by Юлия on 15.07.2017.
 */
// Задача 1 в навчальних матеріалах вирішена
// Задача 2 в навчальних матеріалах вирішена

/* Задача 3: Считать целое число с консоли, затем считать второе число.
 Вывести сумму чисел на экран. */

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter first number: ");
        int a = scan.nextInt();
        System.out.println("Please, enter second number: ");
        int b = scan.nextInt();
        System.out.println(a + b);

        scan.close();

    }
}
