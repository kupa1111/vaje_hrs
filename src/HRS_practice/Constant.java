/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HRS_practice;

/**
 *
 * @author kupa
 */
public class Constant extends token{
    
    private double val;

    Constant(double value){this.val=value;}
    
    @Override
    public double evaluvate() {
        return val;
    }
     

    @Override
    public double getValue() {
           return val;
    }

     
    
    
    
}
