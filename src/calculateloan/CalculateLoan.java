/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculateloan;

import java.util.Scanner;

/**
 *
 * @author mhabiby
 */
public class CalculateLoan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       



     // Create a Scanner
 Scanner input = new Scanner(System.in);

 // Enter annual interest rate
System.out.print(
 "Enter annual interest rate, for example, 8.25: ");
 double annualInterestRate = input.nextDouble();

 // Enter number of years
 System.out.print("Enter number of years as an integer: ");
int numberOfYears = input.nextInt();

 // Enter loan amount
 System.out.print("Enter loan amount, for example, 120000.95: ");
 double loanAmount = input.nextDouble();

 // Create a Loan object
 Loan loan =
 new Loan(annualInterestRate, numberOfYears, loanAmount);

 // Display loan date, monthly payment, and total payment
System.out.printf("The loan was created on %s\n" +
 "The monthly payment is %.2f\nThe total payment is %.2f\n",
 loan.getLoanDate().toString(), loan.getMonthlyPayment(),
 loan.getTotalPayment());
 }
 }