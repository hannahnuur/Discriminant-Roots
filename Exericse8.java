/*
 *Hannah Nuur
 *9-22-2014
 *COMP 2243 Programming and Problem Solving
 *Assignment #3 Exercise8.java
 *Uses JOptionPane dialog boxes to take user 
 *input and calculate the number and value
 *of the roots of a quadratic equation.
 */

import javax.swing.JOptionPane;

public class Exericse8{
  
  public static void main (String[] args){
    
    String aStr, bStr, cStr, outputStr;
    double a, b, c;
    double discriminant, roots1, roots2;
    
    //x^2 coefficient
    aStr = JOptionPane.showInputDialog("Enter the coefficient of x^2");
    a = Double.parseDouble(aStr);
    
    //validating value of x^2 coefficient
    if (a == 0){
      outputStr = ("Invalid input");
      JOptionPane.showMessageDialog(null, outputStr, "Invalid input", JOptionPane.WARNING_MESSAGE);
      System.exit(0);
    }
    
    //x coefficient
    bStr = JOptionPane.showInputDialog("Enter the coefficient of x");
    b = Double.parseDouble(bStr);
    
    //constant
    cStr = JOptionPane.showInputDialog("Enter the value of the constant");
    c = Double.parseDouble(cStr);
    
    discriminant = Math.pow(b,2) - 4*a*c;
  
    if (discriminant == 0){
      roots1 = -b/(2*a);
      outputStr = ("The equation has a single (repeated) root. \nRoot: " +roots1);
      JOptionPane.showMessageDialog(null, outputStr, "Roots", JOptionPane.INFORMATION_MESSAGE);
    }
    
    else if (discriminant > 0){
      roots1 = (-b + Math.sqrt(discriminant))/(2*a);
      roots2 = (-b - Math.sqrt(discriminant))/(2*a);
      outputStr = ("The equation has two real roots. \nRoots: " +roots1+ ", " +roots2);
      JOptionPane.showMessageDialog(null, outputStr, "Roots", JOptionPane.INFORMATION_MESSAGE);
    }
    
    else{
      outputStr = ("The equation has two complex roots.");
      JOptionPane.showMessageDialog(null, outputStr, "Roots", JOptionPane.INFORMATION_MESSAGE);
    }
    
    System.exit(0);
  }
}