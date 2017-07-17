package vertex.lesson5.homework;

import java.util.Scanner;

/**
 * Created by Юлия on 16.07.2017.
 */
// Тема "Массивы"
    /* Задача 10. Создать массив из n елементов целых чисел. Считать n с консоли.
    Заполнить случайными значениями от 0 до 100ю.
    Во 2-й елемент поместить сумму 2-го и 3-го елемента.
     */
public class FillArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть кількість елементів масиву: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        arr[2] = arr[2] + arr[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100 * Math.random());
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
            System.out.println(arr[2] = arr[2] + arr[3]);

            sc.close();
        }
        }



