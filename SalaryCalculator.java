package DataStructures;

import java.util.Scanner;

public class SalaryCalculator {

    public static double salary(double weeklyHours,double hourlyPay,int vacationDays){

        double grossSalary = weeklyHours * hourlyPay ;
        double unpaidTime = vacationDays * hourlyPay * 8;
        return (grossSalary * 52) - unpaidTime;
    }

    public static void main(String args[]){

        System.out.println("Enter your weekly hours");
        Scanner scanner = new Scanner(System.in);
        double weeklyHours = scanner.nextDouble();
        if(weeklyHours < 0){
            System.out.println("Invalid ,enter number greater than 0");
            weeklyHours = scanner.nextDouble();
        }


        System.out.println("Enter your hourly pay");
        double hourlyPay = scanner.nextDouble();
        if(hourlyPay <0){
            System.out.println("Invalid ,enter number greater than 0");
            hourlyPay = scanner.nextDouble();
        }

        System.out.println("Enter your paid Vacation days");
        int vacationDays = scanner.nextInt();
        if(vacationDays < 0){
            System.out.println("Invalid entry ,enter a number greater than 0");
            vacationDays = scanner.nextInt();
        }

        double grossPay = salary(weeklyHours,hourlyPay,vacationDays);
        System.out.println("Your gross pay is " +grossPay);
    }

}
