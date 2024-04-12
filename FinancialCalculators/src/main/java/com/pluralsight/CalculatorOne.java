package com.pluralsight;
import java.util.Scanner;

public class CalculatorOne {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What calculator would you like to use? (1)APR Calculator, (2)CD Calculator, (3)Present Value Calculator ");
        int choice = input.nextInt();

        if (choice == 1){
            mortgageCalculator();}
        else if(choice == 2){
            cdCalculator();}
        else if (choice == 3){
            presentValueCalculator();}

        }

        public static void mortgageCalculator() {
    Scanner choice = new Scanner(System.in);
            double loanLength = 0;
            double principal = 0;
            double interestRate = 0;

            System.out.println("What is your principal? ");
            double principalAmt = choice.nextDouble();
            System.out.println("What is your interest rate? ");
            double interestRateAmt = choice.nextDouble();
            System.out.println("What is your loan length? ");
            double loanLengthAmt = choice.nextDouble();

            double monthlyInterestRate = interestRateAmt/1200;
            double monthlyTotalMonth = loanLength*12;
            double monthlyPayment = (principal*interestRateAmt*Math.pow(1+interestRateAmt,loanLengthAmt))/(Math.pow(1+interestRateAmt,loanLengthAmt)-1);
        }



    }
