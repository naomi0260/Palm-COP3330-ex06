package ex05;

import java.util.Calendar;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Naomi Palm
 */


public class App {

    static Scanner input = new Scanner(System.in);

    public static void main (String[] args){

        System.out.print("What is your current age? ");
        String currentAge = input.nextLine();
        System.out.print("At what age would you like to retire? ");
        String retireAge = input.nextLine();

        int curAge = Integer.parseInt(currentAge);
        int retAge = Integer.parseInt(retireAge);

        int timeLeft = retAge - curAge;
        int curYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.printf("You have %d years left until you can retire.\n", timeLeft);
        System.out.printf("It's %d, so you can retire in %d.", curYear, curYear+timeLeft);




    }
}
