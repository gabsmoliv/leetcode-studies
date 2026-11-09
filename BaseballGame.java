import java.util.ArrayDeque;
import java.util.Deque;

public class BaseballGame {

    /*
     * LeetCode Number 682 - Easy
     * 
     * You are keeping the scores for a baseball game with strange rules. At the
     * beginning of the game, you start with an empty record.
     * 
     * You are given a list of strings operations, where operations[i] is the ith
     * operation you must apply to the record and is one of the following:
     * 
     * An integer x.
     * Record a new score of x.
     * '+'.
     * Record a new score that is the sum of the previous two scores.
     * 'D'.
     * Record a new score that is the double of the previous score.
     * 'C'.
     * Invalidate the previous score, removing it from the record.
     * Return the sum of all the scores on the record after applying all the
     * operations.
     * 
     * The test cases are generated such that the answer and all intermediate
     * calculations fit in a 32-bit integer and that all operations are valid.
     * 
     * Constraints:
     * 
     * 1 <= operations.length <= 1000
     * operations[i] is "C", "D", "+", or a string representing an integer in the
     * range [-3 * 104, 3 * 104].
     * For operation "+", there will always be at least two previous scores on the
     * record.
     * For operations "C" and "D", there will always be at least one previous score
     * on the record.
     * 
     * 
     * Expected outputs for the given examples:
     * -> 30
     * -> 27
     * -> 0
     */

    public static void main(String[] args) {
        calPoints(new String[] { "5", "2", "C", "D", "+" });
        calPoints(new String[] { "5", "-2", "4", "C", "D", "9", "+", "+" });
        calPoints(new String[] { "1", "C" });
    }

    static int calPoints(String[] operations) {
        Deque<Integer> d = new ArrayDeque<>();
        for (int i = 0; i < operations.length; i++) {
            String actual = operations[i];
            if (Character.isDigit(actual.charAt(actual.length() - 1))) {
                d.push(Integer.parseInt(actual));
            }
            if (actual.equals("C")) {
                d.pop();
            }
            if (actual.equals("D")) {
                d.push(d.peek() * 2);
            }
            if (actual.equals("+")) {
                Integer previousLast = d.pop();
                Integer sum = previousLast + d.peek();
                d.push(previousLast);
                d.push(sum);
            }
        }
        int total = 0;
        for (int score : d)
            total += score;
        return total;
    }
}