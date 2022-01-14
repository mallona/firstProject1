package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Task1
/*
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Mass input in kilograms: ");
        double m = scanner.nextDouble();
        System.out.print ("Height input in meters: ");
        double h = scanner.nextDouble();
        double index = m/(h*h);

	System.out.println("Mass index is " + index);
    }*/

    //Task2 v.1
  /*
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Enter the number from 1 to 12: ");

        if (scanner.hasNextInt()) {
            int mark = scanner.nextInt();

            if (1 <= mark && mark <= 3) {
                System.out.print("Mark is: 2");
            } else if (4 <= mark && mark <= 6) {
                System.out.print("Mark is: 3");
            } else if (7 <= mark && mark <= 12) {
                System.out.print("Mark is: 5");
            } else {
                System.out.print("Please enter number in range from 1 to 12");
            }
        }
        else {
            System.out.print ("Invalid data");
            }
    }*/

    //Task2 v.2
   /*   Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number from 1 to 12: ");

        if (scanner.hasNextInt()) {
            int mark = scanner.nextInt();
            System.out.println(switch (mark) {
                case 1, 2, 3 -> 2;
                case 4, 5, 6 -> 3;
                case 7, 8, 9 -> 4;
                case 10, 11, 12 -> 5;
                default -> "Please enter number in range from 1 to 12";
            });
        } else {
            System.out.println("Invalid data");
        }
    }*/

    //Task3

        /*Scanner s = new Scanner(System.in);
        System.out.print("Please set index from 1 to 100: ");
        if (s.hasNextInt()) {
            int index = s.nextInt();
            if (index >= 1 && index <= 100) {
                double[] newArray = new double[index];
                Random r = new Random();
                for (int i = 0; i < newArray.length; i++) {
                    newArray[i] = r.nextDouble(-50.00, 51.00);
                    System.out.printf("%2f ", newArray[i]);
                }
                double minElement = newArray[0];
                double maxElement = newArray[0];
                double sum = 0;
                for (double element : newArray) {
                    sum = sum + element;
                    if (element < minElement) {
                        minElement = element;
                    }
                    if (element > maxElement) {
                        maxElement = element;
                    }
                }
                System.out.printf("\nMin element is " + "%2f ", minElement);
                System.out.printf("\nMax element is " + "%2f ", maxElement);
                System.out.printf("\nSum of elements is " + "%2f ", sum);
            } else {
                System.out.println("Invalid data, only integer in range from 1 to 100 is acceptable");
            }
        } else {
            System.out.println("Invalid data, only integer in range from 1 to 100 is acceptable");
        }*/

    }
}