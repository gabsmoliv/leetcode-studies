public class ValidAnagram {

    /*
     * LeetCode Number 242 - Easy
     * 
     * Given two strings s and t, return true if t is an anagram of s, and false
     * otherwise.
     * 
     * Constraints:
     * 
     * 1 <= s.length, t.length <= 5 * 104
     * s and t consist of lowercase English letters.
     * 
     */

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0)
                return false;
        }
        return true;
    }
}
