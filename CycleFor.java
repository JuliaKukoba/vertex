package vertex.lesson5.homework;

import java.util.Scanner;

/**
 * Created by Юлия on 15.07.2017.
 */
// Тема "Циклы"
    /* Задача 4. Считать с консоли два числа, например, k и n (при этом k вводим меньше, чем n).
    С помощью цикла for вывести на экран числа от k до n.
     */
public class CycleFor {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number less than the second: ");
//        int k = sc.nextInt();
//        System.out.println("Enter the second number: ");
//        int n = sc.nextInt();
//        for(int i = k; i <= n; i++) {
//            System.out.print(i + " ");
//            sc.close();
//        }
//    }
//}
        /* Задача 5. Считать с консоли два числа, например, k и n (при этом k вводим больше, чем n).
        С помощью цикла for вывести на экран числа от k до n.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number larger than the second: ");
        int k = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n = sc.nextInt();
        for(int i = k; i >= n; i--) {
            System.out.print(i + " ");
            sc.close();
        }

    }
}