
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vueld
 */
public class SalesTax 
{
    public static void main(String[] args) 
    {
        float stateTax = 0.04F;
        float countyTax = 0.02F;
        
        Scanner keyboard = new Scanner(System.in);
        
        String purchaseAmountAsString = JOptionPane.showInputDialog(null, "Please enter purchase amount:");
        
        if (purchaseAmountAsString == null)
        {
            System.exit(1);
        }
        try {
        float purchaseAmount = Float.parseFloat(purchaseAmountAsString);
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "Amount not entered as number");
            System.exit(1);
        }
        
        float purchaseAmount = Float.parseFloat(purchaseAmountAsString);
        
        float purchaseStateTax = purchaseAmount * stateTax;
        float purchaseCountyTax = purchaseAmount * countyTax;
        float purchaseTotalTax = purchaseStateTax + purchaseCountyTax;
        float totalSale = purchaseAmount + purchaseTotalTax;
        
        System.out.printf("Purchase Amount: \t%.2f\n", purchaseAmount);
        System.out.printf("State Tax: \t%.2f\n", purchaseStateTax);
        System.out.printf("County Tax: \t%.2f\n", purchaseCountyTax);
        System.out.printf("Total Tax: \t%.2f\n", purchaseTotalTax);
        System.out.printf("Total Sale: \t%.2f\n", totalSale);
    }
}
