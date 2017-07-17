package vertex.lesson5.homework;

import java.util.Scanner;

/**
 * Created by Юлия on 15.07.2017.
 */
// Тема "Циклы"
// Задача 6. Считать с клавиатуры число k. Вывести на экран k звездочек.

public class ForStars {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int k = sc.nextInt();
        for(int i = 0; i < k; i++) {
            System.out.print("*");
            sc.close();
        }
    }
}
