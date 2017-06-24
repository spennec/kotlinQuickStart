package ch.pennec.kotlin;

import ch.pennec.kotlin.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Customer c = new Customer("Sébastien", "Pennec");
        System.out.println(c);

    }
}
