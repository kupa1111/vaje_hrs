/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HRS_practice;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Node;

/**
 *
 * @author kupa
 */
public class operator extends token {

    public token left;
    public token right;
    public String operator;

    public operator(String op, token left, token right) {
        this.operator = op;
        this.left = left;
        this.right = right;



    }

    public double evaluvate() {
        switch (operator) {
            case "+": {

                return left.evaluvate() + right.evaluvate();

            }

            case "-": {
                return left.evaluvate() - right.evaluvate();

            }

            case "*": {
                return left.evaluvate() * right.evaluvate();

            }

            case "/": {
                return left.evaluvate() / right.evaluvate();

            }

            case "^": {
                return  Math.pow(left.evaluvate(),right.evaluvate());

            }

            default: {
                throw new UnsupportedOperationException("not supported OPERATOR yet.");

            }
        }

    }

    @Override
    public double getValue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
