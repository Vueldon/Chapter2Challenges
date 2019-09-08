
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
public class CookieCalories 
{
    public static void main(String[] args) 
    {
        int cookieCalories = 75;
        
        String cookiesEatenAsString = JOptionPane.showInputDialog(null, "Enter number of cookies eaten:");
        
        try
        {
        float cookiesEaten = Float.parseFloat(cookiesEatenAsString);
        } catch (Exception x)
        {
            JOptionPane.showMessageDialog(null, "Amount not entered as number");
            System.exit(1);
        }
        
        float cookiesEaten = Float.parseFloat(cookiesEatenAsString);
        
        float caloriesConsumed = cookiesEaten * cookieCalories;
        
        System.out.printf("Total Calories Consumed:\t%.2f", caloriesConsumed);
    }
}
