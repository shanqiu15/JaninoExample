package com.SnapLogic.app;

import org.codehaus.janino.SimpleCompiler;
import java.io.StringReader;
import java.util.*;
import java.lang.reflect.Method;

public class StringExecutor{

    private static final String CLASS_NAME = "StringExecutorTest";

    public static void main(String[] args) throws Exception{
        System.out.println("Input is:"+args[0]);

        String codeStr = "public class " + CLASS_NAME + " {" +

                         "public static boolean main(String[] args){" +

                         //"if("+ args[0] +"){System.out.println(true);} else {System.out.println(false);}}}";

                         "if("+ args[0] +"){return true;} else {return false;}}}";
        //System.out.print(codeStr);
        SimpleCompiler compiler = new SimpleCompiler();
        compiler.cook(new StringReader(codeStr)); // compile the string get the loaded class
        Class<?> cl = compiler.getClassLoader().loadClass(CLASS_NAME);

        // Invoke the "public static main(String[])" method
        Method mainMeth = cl.getMethod("main", new Class[] { String[].class });

        String[] methArgs = new String[]  { args[0] }; // input

        Object res = mainMeth.invoke(null, new Object[] { methArgs });
        System.out.println("Result: " + res);
    }

}


