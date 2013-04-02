/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HRS_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author kupa
 */
public class Calculator {

    private static final Map<String, int[]> OPERATORS = new HashMap<>();
    private static ArrayList<String> RPN = new ArrayList<String>();
    private static int LEFT_ASSOC = 0;
    private static int RIGHT_ASSOC = 1;

    static {
        // Map<"token", []{precendence, associativity}>
        OPERATORS.put("+", new int[]{0, LEFT_ASSOC});
        OPERATORS.put("-", new int[]{0, LEFT_ASSOC});
        OPERATORS.put("*", new int[]{5, LEFT_ASSOC});
        OPERATORS.put("/", new int[]{5, LEFT_ASSOC});
        OPERATORS.put("%", new int[]{5, LEFT_ASSOC});
        OPERATORS.put("^", new int[]{10, RIGHT_ASSOC});
    }

    /**
     * Test the associativity of a certain operator token .
     *
     * @param token The token to be tested (needs to operator).
     * @param type LEFT_ASSOC or RIGHT_ASSOC
     * @return True if the tokenType equals the input parameter type .
     */

    public boolean isAssociative(String token, int type) {
        if (!isOperator(token)) {
            throw new IllegalArgumentException("Invalid token: " + token);
        }
        if (OPERATORS.get(token)[1] == type) {
            return true;
        }
        return false;
    }

    /**
     * Test if a certain is an operator .
     *
     * @param token The token to be tested .
     * @return True if token is an operator . Otherwise False .
     */
    public boolean isOperator(String token) {
        return OPERATORS.containsKey(token);
    }

    /**
     * Compare precendece of two operators.
     *
     * @param token1 The first operator .
     * @param token2 The second operator .
     * @return A negative number if token1 has a smaller precedence than token2,
     * 0 if the precendences of the two tokens are equal, a positive number
     * otherwise.
     */
    public final int cmpPrecedence(String token1, String token2) {
        if (!isOperator(token1) || !isOperator(token2)) {
            throw new IllegalArgumentException("Invalied tokens: " + token1+ " " + token2);
        }
        return OPERATORS.get(token1)[0] - OPERATORS.get(token2)[0];
    }

    public void build_RPN_tree(String[] tokens) {

        Stack<String> stack = new Stack<String>();
        RPN=new ArrayList<>();
        for (int i = 0; i < tokens.length; i++) {
            
            if (isOperator(tokens[i])) {
                
                while (!stack.empty() && isOperator(stack.peek())) {
                  
                    if ((isAssociative(tokens[i], LEFT_ASSOC) && cmpPrecedence(tokens[i], stack.peek()) <= 0)
                            || (isAssociative(tokens[i], RIGHT_ASSOC) && cmpPrecedence(tokens[i], stack.peek()) < 0)) {
                        RPN.add(stack.pop());
                        continue;
                    }
                    break;
                }
               
                stack.push(tokens[i]);
                
            } else if (tokens[i].equals("(")) {
                stack.push(tokens[i]);
            } else if (tokens[i].equals(")")) {
            
                while (!stack.empty() && !stack.peek().equals("(")) {
                    RPN.add(stack.pop()); 
                }
                stack.pop();
            } else {
                RPN.add(tokens[i]); 
            }
        }

        while (!stack.empty()) {
            RPN.add(stack.pop()); // [S13]
        }

    }

    public double evaluvate() {

        Stack<token> o = new Stack<>();

        for (int i = 0; i < RPN.size(); i++) {
            if (!isOperator(RPN.get(i))) {
                o.push(new Constant(Double.parseDouble(RPN.get(i))));

            }

            if (isOperator(RPN.get(i))) {
                token right = o.pop();
                token left = o.pop();


                operator op = new operator(RPN.get(i).toString(), left, right);
                o.push(new Constant(op.evaluvate()));

            }
        }
        return o.pop().getValue();
    }
    
    public ArrayList<String> getRPN_notations() {
        return RPN;
    }

    public void setRPN_notation(ArrayList<String> RPN) {
        Calculator.RPN = RPN;
    }
}