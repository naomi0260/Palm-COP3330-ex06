package ex05;

import java.util.Calendar;
import java.util.Scanner;

/*Create a program that determines how many years you have left until retirement and the year you can retire. It should prompt for your current age and the age you want to retire and display the output as shown in the example that follows.

Example Output
What is your current age? 25
At what age would you like to retire? 65
You have 40 years left until you can retire.
It's 2015, so you can retire in 2055.
Constraints
Again, be sure to convert the input to numerical data before doing any math.
Don’t hard-code the current year into your program. Get it from the system time via your programming language.*/


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
