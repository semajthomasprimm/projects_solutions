package text;

/**
 * Write a program that prints the numbers from 1 to 100.
 * But for multiples of three print “Fizz” instead of the
 * number and for the multiples of five print “Buzz”.
 * For numbers which are multiples of both three and five print “FizzBuzz”.
 *
 * @author Semaj Thomas-Primm
 * @version 1.0
 * @since 15-01-18
 */

public class FizzBuzz {
    public static void main (String[] args){

        for(int i = 1; i<= 100; i++){
            // Print Fizz if i is a multiple of 3
            if(i % 3 == 0 && i % 5 != 0)
                System.out.println("Fizz");
            // Print Buzz if i is a multiple of 5
            else if(i % 5 == 0 && i % 3 != 0)
                System.out.println("Buzz");
            // Print FizzBuzz is is a multiple of 3 and 5
            else if(i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            // Print i if it isn't divisible by 3 or 5
            else
                System.out.println(i);
        }
    }
}
