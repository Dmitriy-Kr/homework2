package com.homework2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Human hum1 = new Human ("Петров", "Иван", "Васильевич");
        Human hum2 = new Human ("Иванов", "Петр");
        System.out.println(hum1.getFullName());
        System.out.println(hum1.getShortName());
        System.out.println(hum2.getFullName());
        System.out.println(hum2.getShortName());

        System.out.println("/-----------------------------------------------------/");

        Circle circle;

        PointList pointList = new PointList();

        for (int i = 0; i < 8; i++) {
            pointList.add(new Point(Math.round(Math.random() * 10), Math.round(Math.random() * 20)));
        }

        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            double x, y;
            int choice;
            System.out.println("Введите координаты точки: ");

            while (true) {
                System.out.print("x = ");
                if (scanner.hasNextDouble()) {
                    x = scanner.nextDouble();
                    scanner.nextLine();
                    break;
                } else {
                    scanner.nextLine();
                    System.out.println("Введите число");
                }
            }

            while (true) {
                System.out.print("y = ");
                if (scanner.hasNextDouble()) {
                    y = scanner.nextDouble();
                    scanner.nextLine();
                    break;
                } else {
                    scanner.nextLine();
                    System.out.println("Введите число");
                }
            }

            pointList.add(new Point(x, y));

            while (true) {
                System.out.print("Желаете добавить еще точку (1-да, 2- нет)? ");
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    if (choice == 1 || choice == 2) {
                        break;
                    } else {
                        System.out.println("Сделайте выбор");
                    }
                } else {
                    scanner.nextLine();
                    System.out.println("Введите число");
                }
            }

            if (choice == 2) {
                flag = false;
            }
        }

        {
            Scanner scanner = new Scanner(System.in);
            double x, y, r;
            System.out.println("Введите координаты центра окружности и радиус: ");

            while (true) {
                System.out.print("x = ");
                if (scanner.hasNextDouble()) {
                    x = scanner.nextDouble();
                    scanner.nextLine();
                    break;
                } else {
                    scanner.nextLine();
                    System.out.println("Введите число");
                }
            }

            while (true) {
                System.out.print("y = ");
                if (scanner.hasNextDouble()) {
                    y = scanner.nextDouble();
                    scanner.nextLine();
                    break;
                } else {
                    scanner.nextLine();
                    System.out.println("Введите число");
                }
            }

            while (true) {
                System.out.print("r = ");
                if (scanner.hasNextDouble()) {
                    r = scanner.nextDouble();
                    scanner.nextLine();
                    break;
                } else {
                    scanner.nextLine();
                    System.out.println("Введите число");
                }
            }
            circle = new Circle(new Point(x, y), r);
        }

        System.out.printf("Координаты центра окружности x = %.1f, y = %.1f радиус %.1f", circle.getCenter().getX(),
                circle.getCenter().getY(), circle.getRadius());
        System.out.println();
        for (int i = 0; i < pointList.size(); i++) {
            if (circle.containsPoint(pointList.get(i))) {
                System.out.printf("Точка с координатами x = %.1f, y = %.1f лежит в окружности ", pointList.get(i).getX(),
                        pointList.get(i).getY());
                System.out.println();
            }
        }
    }
}
