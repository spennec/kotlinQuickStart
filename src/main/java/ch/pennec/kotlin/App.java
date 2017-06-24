package ch.pennec.kotlin;

import ch.pennec.kotlin.business.CustomerSelector;
import ch.pennec.kotlin.model.Customer;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        Customer c1 = new Customer("Sébastien", "Pennec");
        Customer c2 = new Customer("Hello", "World");
        Customer c3 = new Customer("HelloHelloHello", "World");
        System.out.println(new CustomerSelector().select(Arrays.asList(c1, c2, c3)));

    }
}
