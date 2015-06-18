/********************************************************************
 *
 *  	program:		MyInput
 *
 *		remarks:		Code to read an integer, double, float
 *                      	character or String from the keyboard
 *                         Converts the input String to the proper
 *						    data type and then returns the variable
 *						    uses the BufferedReader class
 *                         called by TestMyInput
 *
 ********************************************************************/

import java.io.*;				// needed for the BufferedReader class
import java.util.*;

public class MyInputDemo
{
    private static BufferedReader br
            = new BufferedReader(new InputStreamReader(System.in));

    /*********************************
     *	get a String as input
     *   convert to an int
     *   return the int
     *********************************/
    public static int readInt()
    {
        int inTest = 0;
        try
        {
            String inString = br.readLine();
            inTest = Integer.parseInt(inString);
        }
        catch(IOException exc)
        {
            System.out.println("IOException: " + exc);
        }
        catch(NumberFormatException exc)
        {
            System.out.println("Invalid format: " + exc);
        }

        return inTest;
    }  // end readInt

    /*********************************
     *	get a String as input
     *   convert to an float
     *   return the float
     *********************************/
    public static float readFloat()
    {
        float inFloat = 0.0f;
        try
        {
            String inString = br.readLine();
            inFloat = Float.parseFloat(inString);
        }
        catch(IOException exc)
        {
            System.out.println("IOException: " + exc);
        }
        catch(NumberFormatException exc)
        {
            System.out.println("Invalid format: " + exc);
        }

        return inFloat;
    }  // end readFloat

    /*********************************
     *	get a String as input
     *   convert to an double
     *   return the double
     *********************************/
    public static double readDouble()
    {
        double inDouble = 0.0d;
        try
        {
            String inString = br.readLine();
            inDouble = Double.parseDouble(inString);
        }
        catch(IOException exc)
        {
            System.out.println("IOException: " + exc);
        }
        catch(NumberFormatException exc)
        {
            System.out.println("Invalid format: " + exc);
        }

        return inDouble;
    }  // end readDouble

    /*********************************
     *	get a String as input
     *  convert to a character
     *   return the character
     *********************************/
    public static char readChar()
    {
        char inChar = ' ';
        try
        {
            String inString = br.readLine();
            inChar = inString.charAt(0);
        }
        catch(IOException exc)
        {
            System.out.println("IOException: " + exc);
        }
        catch(StringIndexOutOfBoundsException exc)
        {
            System.out.println("No character entered: " + exc);
        }

        return inChar;
    }  // end readChar

    /*********************************
     *	get a String as input
     *   return the String
     *********************************/
    public static String readString()
    {
        String inString = " ";
        try
        {
            inString = br.readLine();
        }
        catch(IOException exc)
        {
            System.out.println("IOException: " + exc);
        }

        return inString;
    }  // end readString
} // end class MyInputDemo
