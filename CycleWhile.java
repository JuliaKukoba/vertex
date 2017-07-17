package vertex.lesson5.homework;

import java.util.Scanner;

/**
 * Created by Юлия on 15.07.2017.
 */
//Циклы
/* Задача 3. Считать с клавиатуры числа k и n (вводим k меньше n).
Вывести на экран с помощью цикла while, числа от k до n.
 */
public class CycleWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number less than second: ");
        int k = sc.nextInt();
        System.out.println("enter second number: ");
        int n = sc.nextInt();
        while(k <= n) {
            System.out.print(k + " ");
            k++;

            sc.close();
        }

    }
}
