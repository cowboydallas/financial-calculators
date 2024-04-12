package com.pluralsight;
import java.util.Scanner;

public class CalculatorOne {

    // New method
    public static void main(String[] args) {

        // Choice of calculator
        Scanner input = new Scanner(System.in);
        System.out.print("What calculator would you like to use? (1)APR Calculator, (2)CD Calculator, (3)Present Value Calculator: ");
        int choice = input.nextInt();

        // Choices that redirect you to each calculator
        if (choice == 1) {
            mortgageCalculator();
        } else if (choice == 2) {
            futureValue();
        } else if (choice == 3) {
            presentValue();
        } else {
            System.out.println("Invalid input.");
        }
    }

    // New Method (Calculator 1)
    public static void mortgageCalculator() {
        Scanner choice = new Scanner(System.in);

        // Questions
        System.out.print("What is your principal?: ");
        double principalAmt = choice.nextDouble();
        System.out.print("What is your interest rate?: ");
        double interestRateAmt = choice.nextDouble();
        System.out.print("What is your loan length?: ");
        double loanLengthAmt = choice.nextDouble();

        // Calculations
        double monthlyInterestRate = interestRateAmt / 1200;
        double monthlyTotalMonth = loanLengthAmt * 12;
        double monthlyPayment = (principalAmt * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, monthlyTotalMonth)) / (Math.pow(1 + monthlyInterestRate, monthlyTotalMonth) - 1));
        double totalInterest = monthlyPayment * monthlyTotalMonth - principalAmt;

        // Results
        System.out.printf("Your expected monthly payment is $" + String.format("%.2f", monthlyPayment));
        System.out.printf(" with a total interest paid of $" + String.format("%.2f", totalInterest));
    }


    // New Method (Calculator 2)
    public static void futureValue() {
        Scanner result = new Scanner(System.in);

        // Questions
        System.out.print("What is your deposit?: ");
        double depositAmt = result.nextDouble();
        System.out.print("What is your interest rate?: ");
        double interestRate2Amt = result.nextDouble();
        System.out.print("How many years will you keep your CD?: ");
        double numberOfYears = result.nextDouble();

        // Calculations
        double rateOfInterest = interestRate2Amt / 100;
        double equation = depositAmt * Math.pow(1 + rateOfInterest / 365, 365 * numberOfYears);
        double totalInterest2 = equation - depositAmt;

        // Results
        System.out.printf("Your CD ending balance is $" + String.format("%.2f", equation));
        System.out.printf(" with a total interest earned of $" + String.format("%.2f", totalInterest2));
    }

    public static void presentValue(){
        Scanner invest = new Scanner(System.in);

        // Questions
        System.out.print("What is your monthly payment?: ");
        double monthlyPaymentAmt = invest.nextDouble();
        System.out.print("What is your expected interest rate?: ");
        double interestRate3Amt = invest.nextDouble();
        System.out.print("How many years will you need in order to pay out?: ");
        double yearsNeeded = invest.nextDouble();

        // Calculations
        double monthlyInterestRate = interestRate3Amt/1200;
        double monthlyTotal = yearsNeeded * 12;
        double presentValue = monthlyPaymentAmt*(1-Math.pow(1+monthlyInterestRate, -monthlyTotal))/monthlyInterestRate;

        System.out.printf("You need to invest $" + String.format("%.2f", presentValue));

    }
}
