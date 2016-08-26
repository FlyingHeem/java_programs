package basic;

/**
 * Created by HP on 24-Aug-16.
 */
public class DataType {
    private  Integer x; // instance variable or class fields
    private static String name = "Hem"; // static variable

   /* public static void sayHello(){
        //String name = "";

        System.out.println("name = " + name);

    }*/


    public  static void main( String [] args){


        DataType dt = new DataType();
        AnotherClass ac = new AnotherClass();
        Student shristy = new Student();

        ac.sayHello();
                /* if( dt instanceof Object){
            System.out.println("dt is instance of Object class");
        }*/
       // String name = "hem sharma";


        //System.out.println("name = " + name);
/*
        for( int i = 0 ; i < args.length; i++ ){
            System.out.println(args[i]);
        }

        //int x = 10;
        //int y = 20;
       // Integer x = 20;
       // Integer y = 10;
       // System.out.println(x.compareTo(y));
        //char ch = 'f';

        //System.out.println( Character.isUpperCase(ch));
       // System.out.println(dt.x);

       System.out.println( Character.isUpperCase('C'));
        System.out.println( Character.isUpperCase('\n'));
        System.out.println( Character.isUpperCase('\t'));*/
    }
}
