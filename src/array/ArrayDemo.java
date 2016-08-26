package array;

import basic.AnotherClass;

/**
 * Created by HP on 26-Aug-16.
 */
public class ArrayDemo {

    public static void main( String [] args){

       // AnotherClass ac = new AnotherClass();
       //AnotherClass.sayHello();

        String myName = "Hem Sharma";

        String[] ourNames = {"Hem", "Shristi", "Nilaja"};// string array

        double[] myList = {1.9, 2.9, 3.4, 3.5}; // double array

        System.out.println( "my name length = " + myName.length() + myName);

        for( int i = 0; i < ourNames.length; i++ ){

            System.out.println( ourNames[i] );

        }

    }

}
