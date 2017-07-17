package vertex.lesson5.homework;

import java.util.Scanner;

/**
 * Created by Юлия on 15.07.2017.
 */

// Оператор if
// Задача 1 в навчальних матерыалах вирішена і показана як приклад

// Задача 2. Считать с консоли первое число, затем второе число.
//    Вывести на экран наибольшее из них.

public class MaxValue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int k = scan.nextInt();
        System.out.println("Enter second number: ");
        int t = scan.nextInt();

        if(k < t) {
            System.out.println(t);
        } else if(k > t) {
            System.out.println(k);
            scan.close();
        }
    }
}
