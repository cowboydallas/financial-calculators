package com.pluralsight;
import java.util.Scanner;

public class CalculatorOne {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What calculator would you like to use? (1)APR Calculator, (2)CD Calculator, (3)Present Value Calculator: ");
        int choice = input.nextInt();

        if (choice == 1) {
            mortgageCalculator();
        } else if (choice == 2) {
            futureValue();
        }
    }

    public static void mortgageCalculator() {
        Scanner choice = new Scanner(System.in);

        System.out.print("What is your principal?: ");
        double principalAmt = choice.nextDouble();
        System.out.print("What is your interest rate?: ");
        double interestRateAmt = choice.nextDouble();
        System.out.print("What is your loan length?: ");
        double loanLengthAmt = choice.nextDouble();

        double monthlyInterestRate = interestRateAmt / 1200;
        double monthlyTotalMonth = loanLengthAmt * 12;
        double monthlyPayment = (principalAmt * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, monthlyTotalMonth)) / (Math.pow(1 + monthlyInterestRate, monthlyTotalMonth) - 1));
        double totalInterest = monthlyPayment * monthlyTotalMonth - principalAmt;

        System.out.printf("Your expected monthly payment is $" + String.format("%.2f", monthlyPayment));
        System.out.printf(" with a total interest paid of $" + String.format("%.2f", totalInterest));
    }


    public static void futureValue() {
        Scanner result = new Scanner(System.in);

        System.out.print("What is your deposit?: ");
        double depositAmt = result.nextDouble();
        System.out.print("What is your interest rate?: ");
        double interestRate2Amt = result.nextDouble();
        System.out.print("How many years will you keep your CD?: ");
        double numberOfYears = result.nextDouble();

        double rateOfInterest = interestRate2Amt / 100;
        double equation = depositAmt * Math.pow(1 + rateOfInterest / 365, 365 * numberOfYears);
        double totalInterest2 = equation - depositAmt;

        System.out.printf("Your CD ending balance is $" + String.format("%.2f", equation));
        System.out.printf(" with a total interest earned of $" + String.format("%.2f", totalInterest2));
    }
}
