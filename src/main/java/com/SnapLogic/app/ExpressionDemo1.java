package com.SnapLogic.app;

import org.codehaus.commons.compiler.CompilerFactoryFactory;
import org.codehaus.janino.ExpressionEvaluator;

class ExpressionDemo1 {

    public static void main(String[] args) throws Exception {
        ExpressionEvaluator ee = new ExpressionEvaluator(
        args[0],                     // expression
        ExpressionEvaluator.ANY_TYPE,
        new String[] { "x", "y" },           // parameterNames
        new Class[] { int.class, int.class } // parameterTypes
        );
 
        // Evaluate it with varying parameter values; very fast.
        
        Object res = (Object) ee.evaluate(
        new Object[] {          // parameterValues
        new Integer(Integer.parseInt(args[1])),
        new Integer(Integer.parseInt(args[2])),
        }
        );
        System.out.println("result of " + args[0] + " is: " + res.toString());



        System.out.println("This is the result for reusing the evaluator: " + args[0]);
        for (int i = 0; i < 4; i++){
        res = (Object) ee.evaluate(
        new Object[] {          // parameterValues
        new Integer(i),
        new Integer(i+4),
        }
        );
        System.out.println("result of " + " for " + i + " and " + (i+4) + " is " + res);
        }
    }
}
