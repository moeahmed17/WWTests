package WWTests;

/**
 * Created by moe on 12/6/2017.
 */

// General Scripting/Logic
// Answer for question 1

public class ReverseEachWord {

        static void reverseEachWordOfString(String s) {
            String[] words = s.split(" ");

            String reverseString = "";

            for (int i = 0; i < words.length; i++) {
                String word = words[i];

                String reverseWord = " ";

                for (int j = word.length() - 1; j >= 0; j--) {
                    reverseWord = reverseWord + word.charAt(j);
                    reverseWord = reverseWord.toLowerCase();
                }

                reverseString = reverseWord + reverseString + " ";
            }

            System.out.println(s);

            System.out.println(reverseString);

            System.out.println("-------------------------");
        }

        public static void main(String[] args)
        {
            reverseEachWordOfString("Hope you are doing well");

            reverseEachWordOfString("Each and every word and the string should be in reversed and in lower case");

        }
}

