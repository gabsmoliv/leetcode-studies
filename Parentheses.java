import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Parentheses {

    /*
     * LeetCode Number 20 - Easy
     * 
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and
     * ']', determine if the input string is valid.
     * 
     * An input string is valid if:
     * 
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Every close bracket has a corresponding open bracket of the same type.
     * 
     * Constraints:
     * 
     * 1 <= s.length <= 104
     * s consists of parentheses only '()[]{}'.
     * 
     * Expected outputs for the given examples:
     * 
     * -> true
     * -> true
     * -> false
     * -> true
     * -> false
     */

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([])"));
        System.out.println(isValid("([)]"));
    }

    public static boolean isValid(String s) {
        String openings = "([{";
        Map<String, String> mapX = new HashMap<>();
        mapX.put(")", "(");
        mapX.put("]", "[");
        mapX.put("}", "{");
        Deque<String> ar = new ArrayDeque<>();
        for (Character test : s.toCharArray()) {
            if (openings.indexOf(test) != -1) {
                ar.add(String.valueOf(test));
            } else {
                String actual = String.valueOf(test);
                String expected = mapX.get(actual);
                if (ar.isEmpty() || !ar.getLast().equals(expected)) {
                    return false;
                }
                if (ar.getLast().equals(expected)) {
                    ar.removeLast();
                }
            }
        }
        return ar.isEmpty();
    }

}