import java.util.ArrayList;
import java.util.List;


/**
 * This class is searching within a range you choose for a possible perfect number. A perfect number
 * is a number in which all of its dividers, added together, are the number itself.
 * Example: 6 = 1 + 2 + 3 = 6
 * The next numbers are 28, 496, 8128...
 * At the end all found numbers are outputted to the console.
 */
public class PerfectNumbers {
    public static void main(String[] args) {

        /**
         * Variable that contains the limit of how high you want to search for a perfect number
         */
        int searchLimit = Integer.parseInt(args[0]);

        /**
         * Variable adds all divider together
         */
        int dividerCounter = 0;

        /**
         * Variable that contains the answer of the division
         */
        int dividedCheckNumber = 0;

        /**
         * Array list that collects all perfect numbers
         */
        List<Integer> perfectNumberList = new ArrayList<>();

        /**
         * The for loop is running from 1 to the given range.
         */
        for (int checkNumber = 1; checkNumber < searchLimit; checkNumber++) {
            int divider = 1;
            /**
             * The while loop is dividing the checkNumber(dividedCheckNumber) through its dividers and adding them together
             * to check if it is a perfect number.
             *
             */
            while (divider < checkNumber) {
                dividedCheckNumber = checkNumber;
                if (dividedCheckNumber % divider == 0) {
                    dividedCheckNumber = checkNumber / divider;
                    dividerCounter += divider;
                }
                divider++;
            }
            /**
             * If the dividerCounter equals the checkNumber we have found a perfect number and add it to the list.
             */
            if (dividerCounter == checkNumber) {
                perfectNumberList.add(checkNumber);
            }
            dividerCounter = 0;
        }

        System.out.println(perfectNumberList);
    }
}
