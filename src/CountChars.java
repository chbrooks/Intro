import java.util.Scanner;

/* Modify to:
   1. Count vowels.
   2. Change to a static function.
   2. determine whether the string contains any punctuation characters. Assume that anything that's not a letter or digit is punctuation.
   3. Replace with '*'
 */

public class CountChars {

    /** nVowels: takes as input a String and returns the number of vowels in the string.
     * Assume that a,e,i,o,u,A,E,I,O,U are all of the vowels.
     *
     * @param instring
     * @return
     */

    public static int nVowels(String instring) {
       int total = 0;
       return total;
       /* here's a comment */
    }

    /** hasPunc: takes as input a string and returns true if the string contains punctuation.
     *  For this method, we'll assume that anything other than a letter or number is punctuation.
     *  @param instring
     *      * @return
     */

    public static boolean hasPunc(String instring) {
        boolean punc = false;
        return punc;
    }

    /** hide: takes as input a String and returns a string of equal length with all characters replaced by '*'
     *
     * @param instring
     * @return
     */
    public String hide(String instring) {
       String returnString = "";

       return returnString;

    }


    public static void main(String[] args) {
        String str;
        int i=0, nVowels=0;
        boolean hasPunc = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a string:");
        str = scanner.nextLine();
        System.out.println(str.length());
        // TODO: your code goes here.


        System.out.println("Number of Vowels:" + nVowels);
        System.out.println("Has Punctuation? " + hasPunc);
    }
}