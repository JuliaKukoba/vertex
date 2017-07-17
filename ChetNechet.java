package vertex.lesson5.homework;

import java.util.Scanner;

/**
 * Created by Юлия on 15.07.2017.
 */
// Оператор if
/* Задача 3. Считать с консоли целое число. Проверить четность.
 Если число четное, то вывести на экран "четное".
Если число нечетное, то вывести на экран "нечетное".
 */

public class ChetNechet {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter number: ");
        int c = scan.nextInt();
        if((c % 2) == 0) {
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");

            scan.close();
        }

    }
}
