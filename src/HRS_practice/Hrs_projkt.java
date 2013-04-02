/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HRS_practice;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import javax.xml.bind.ParseConversionEvent;

/**
 *
 * @author kupa
 */
public class Hrs_projkt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       //Init expression and Calc
      String izraz="-3 + -8 + 1 + 2 * 3 + ( 3 + 7 )"; 
      String[] iz= izraz.split(" ");
      Calculator calc=new Calculator();
       
       //Build Reverse Polish notation
      calc.build_RPN_tree(iz);      
      
      //Evaluvate expression
      double rez= calc.evaluvate();
      
      //Get RPN string and print everything
      String rpn=calc.getRPN_notations().toString();
      System.out.println("RPN "+rpn);
      System.out.println("Rezulat "+String.valueOf(rez));
      
    
    }
}
