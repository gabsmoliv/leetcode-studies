     
        # LeetCode Number 9 - Easy 
        
        # Given an integer x, return true if x is a palindrome, and false otherwise.

        # Constraints:

        #     -231 <= x <= 231 - 1
    
class Solution:
    def isPalindrome(self, x: int) -> bool:
        numString = str(x)
        numStringReversed = numString[::-1]

        if numString == numStringReversed:
            return True
        else:
            return False