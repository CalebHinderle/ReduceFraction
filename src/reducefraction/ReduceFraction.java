/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reducefraction;

import javax.swing.JOptionPane;

/**
 *
 * @author cahin7692
 */
public class ReduceFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int n1, n2, ans ,n1F, n2F;
    try{
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter numerator"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a denominator"));
    ans = gcd(n1, n2);
    
    
    n1F = n1/ans;
    n2F = n2/ans;
    System.out.println("GCD of "+n1+" and "+n2+" = "+ans);
    JOptionPane.showMessageDialog(null, "The fraction "+n1+"/"+n2+" can be reduced to "+n1F+"/"+n2F+".");
    }
    catch(NumberFormatException e){
        System.err.println("NumberFormatException: " + e.getMessage());
        }
    }


    public static int gcd(int a, int b){
        if(b == 0) {
        return a;
        }
    else {
        //% is modulus, also known as the remainder function
        return gcd(b, a%b);
    }
}
}
