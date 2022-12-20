package org.example;

import java.util.Scanner;

public class testing {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your age?");
        int age = scanner.nextInt();
        //scanner.close();

        String message = age > 18?
                "You are eligible to vote!" :
                "You are not eligible to vote!";

        System.out.println(message);


        System.out.print("Choose a season - 1.Spring, 2.Summer, 3.Monsoon, 4.Winter, 5.Autumn");
        Scanner scanner1 = new Scanner(System.in);
        int season = scanner1.nextInt();


        switch (season) {
            case 1:
                System.out.println("February to March - Sunny and Pleasant");
                break;

            case 2:
                System.out.println("April to June - Hot");
                break;

            case 3:
                System.out.println("July to September - Wet, Hot and Humid");
                break;

            case 4:
                System.out.println("December to January - Sunny and Pleasant");
                break;

            case 5:
                System.out.println("September End to November - Pleasant");
                break;

            default:
                System.out.println("Ah oh! No such season");
                break;
        }
        //scanner1.close();

    }

}
