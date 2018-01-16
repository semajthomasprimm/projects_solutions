package text;

/**
 * Reverse a String - Enter a string and the program will reverse it and print it out.
 * @author Semaj Thomas-Primm
 * @version 1.0
 * @since 15-01-18
 */

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word => ");
        String word = input.nextLine();
        reverseString(word);
    }

    public static void reverseString(String str){
        String reversedStr = "";
        for(int i = str.length() - 1; i >= 0; i--)
            reversedStr += str.charAt(i);

        System.out.println(reversedStr);
    }
}
