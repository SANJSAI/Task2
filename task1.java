package com.javatutorial;

import com.javatutorial.Task;
import java.util.Scanner;

class task1 {

    public static void main(String[] args) {
        String name = " Packages were defined by the user ";
        Task obj = new Task();
        obj.packagesAndMethod(name);

            Scanner input = new Scanner(System.in);

            // Prompt user for number of minutes
            System.out.println("Enter the number of minutes:");
            int minutes = input.nextInt();

            // Number of minutes in a year
            int year = minutes / 525600;
            int yearDays = year * 365;
            int day = minutes / 1440;
            int remainingMinutes = day - yearDays;


            System.out.println(minutes + " minutes is " + year + " years and " + remainingMinutes + " days ");
        }
    }
