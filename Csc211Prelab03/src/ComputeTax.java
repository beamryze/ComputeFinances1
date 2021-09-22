/*
 *  Assignment 3
 *  Description: Case Study to Process Taxes in Chapter section 3.9
 *  Name: Rick
 *  Semester: Fall 2021
 */


import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        // Create a scanner which is assigned to "input" object.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter filing status . Prompt the user to enter filing status based on 0, 1, 2 or 3
        System.out.print("(0-single filer, 1-married jointly or " + "qualifying widow(er), 2-married separately, 3-head of " + "household) Enter the filing status: ");


        // Assign input to variable "status".
        int status = input.nextInt();

        // Prompt the user to enter taxable income with text.
        System.out.print("Enter the taxable income: ");

        // Assign input to variable "income".
        double income = input.nextDouble();
        // Process the tax amount based on several levels of income.
        double tax = 0;
        if (status == 0) { // Compute tax for single filers if value of "Status" is 0.
            // Process the tax amount if less than or equal to $8350.
            if (income <= 8350)
                tax = income * 0.10;
                // Process the tax amount if less than or equal to $33950.
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
                // Process the tax amount if less than or equal to $82250.
            else if (income <= 82250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
                // Process the tax amount if less than or equal to $171550.
            else if (income <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
                // Process the tax amount if less than or equal to $372950.
            else if (income <= 372950)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
        }
            else if (status == 1) { // Compute tax for married file jointly or qualifying widow(er) if value of "Status" is 1
            // Process the tax amount if less than or equal to $16700.
            if (income <= 16700)
                tax = income * 0.10;
                // Process the tax amount if less than or equal to $67900.
            else if (income <= 67900)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
                // Process the tax amount if less than or equal to $137050.
            else if (income <= 137050)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
                // Process the tax amount if less than or equal to $208850.
            else if (income <= 208850)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
                // Process the tax amount if less than or equal to $372950.
            else if (income <= 372950)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;

                 }
             else if (status == 2) { // Compute tax for married separately
                 // Left as an exercise to be done in Programming Exercise 3.13.

                 }
             else if (status == 3) { // Compute tax for head of household
                 // Left as an exercise to be done in Programming Exercise 3.13.
                 }
                  // Display the result with text and computed tax amount.
             System.out.println("Tax is " + (int)(tax * 100) / 100.0);

    }
}
