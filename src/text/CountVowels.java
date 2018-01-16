package text;

/**
 * Count Vowels -  A simple application that inputs a String and
 * counts the number of vowels in a string and sum of each vowel
 * found
 *
 * @author Semaj Thomas-Primm
 * @version 1.0
 * @since 15-01-18
 */

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Asks user to enter a word
        System.out.print("Enter a word => ");
        String word = input.nextLine();

        // Inputs word into countVowels method
        countVowels(word);
    }

    // Returns number of vowels in a string
    public static void countVowels(String str){
        // Keeps track of number of vowels in a string
        int numOfVowels = 0;
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        // Array of vowels
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // Searches the whole vowels[] for current str letter
        for(int j = 0; j < str.length(); j++) {
            for (int k = 0; k < vowels.length; k++) {
                if (str.charAt(j) == vowels[k]) {
                    numOfVowels++;
                }
            }
            switch(str.charAt(j)){
                case 'a': a++; break;
                case 'e': e++; break;
                case 'i': i++; break;
                case 'o': o++; break;
                case 'u': u++; break;

            }
        }
        System.out.printf("Sum of vowels: %d%na's: %d%ne's: %d%ni's: %d%no's: %d%nu's: %d%n", numOfVowels, a, e, i, o, u);
    }
}
