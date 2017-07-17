package vertex.lesson5.homework;

import java.util.Scanner;

/**
 * Created by Юлия on 16.07.2017.
 */
// Тема "Циклы"
// Задача 8. Нарисовать прямоугольник из звездочек, внутри пробелы.

public class RectangleEmptyInside {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter height of rectangle: ");
        int h = scan.nextInt();
        System.out.println("Enter width of rectangle: ");
        int w = scan.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int k = 1; k <= w; k++) {
                if (i == 1 || i == h || k == 1 || k == w) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

                    scan.close();
                }
            }

        }

