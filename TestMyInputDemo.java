/*****************************************************************
 *
 *  Code to test   MyInput
 *
 ****************************************************************/

import java.io.*;
import java.util.*;

public class TestMyInputDemo
{
    public static void main(String args[])
    {
        int    inInt;
        float  inFloat;
        double inDouble;
        char inChar;
        String inString;

        /******************************
         *    process an int
         ******************************/
         System.out.println();
         System.out.println("Enter an integer: ");
         inInt = MyInputDemo.readInt();
         System.out.println("Input integer follows... " + inInt);

         /******************************
         *    process a float
         ******************************/
         System.out.println();
         System.out.println("Enter an float: ");
         inFloat = MyInputDemo.readFloat();
         System.out.println("Input float follows... " + inFloat);

         /******************************
         *    process a double
         ******************************/
         System.out.println();
         System.out.println("Enter an double: ");
         inDouble = MyInputDemo.readDouble();
         System.out.println("Input double follows... " + inDouble);

         /******************************
         *    process a character
         ******************************/
        System.out.println();
        System.out.print("Enter a character: ");
        inChar = MyInputDemo.readChar();
        System.out.println("Input character follows... " + inChar);

        /******************************
         *    process a String
         ******************************/
        System.out.println();
        System.out.print("Enter a String: ");
        inString = MyInputDemo.readString();
        System.out.println("Input String follows... " + inString);

    }  // end main
} // end class TestMyInput
