package vertex.lesson5.homework;

import java.util.Scanner;

/**
 * Created by Юлия on 15.07.2017.
 */
// Тема "Циклы"
    /* Задача 7. Нарисовать прямоугольник из звездочек.
    Считать с клавиатуры значение ширины и высоты.
    С помощью цикла for нарисовать прямоугольник, состоящий из звездочек "*".
     */
public class StarsRectangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width of rectangle: ");
        int a = scan.nextInt();
        System.out.println("Enter height of rectangle: ");
        int b = scan.nextInt();
        for (int i = 0; i < b; i++) {
            for (int k = 0; k < a; k++) {
                System.out.print(" * ");
            }
                System.out.println();
                scan.close();
            }
        }

    }


