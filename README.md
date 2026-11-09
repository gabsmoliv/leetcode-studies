# LeetCode Studies

My solutions to LeetCode problems, written while practicing data structures and algorithms in **Java** and **Python**.

Each file is one problem. The problem statement, constraints and expected outputs sit in a comment at the top of the file, so you can read a solution without opening LeetCode.

![Java](https://img.shields.io/badge/Java-11%2B-orange?logo=openjdk)
![Python](https://img.shields.io/badge/Python-3.9%2B-blue?logo=python)
![Problems](https://img.shields.io/badge/problems-14-brightgreen)

## Problems

| # | Problem | Difficulty | Language | Approach | Time | Space |
|---|---------|------------|----------|----------|------|-------|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | [Java](TwoSum.java) | Hash map of value → index, one pass | O(n) | O(n) |
| 2 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | Medium | [Java](AddTwoNumbers.java) | Dummy head, digit-by-digit sum with carry | O(max(m, n)) | O(max(m, n)) |
| 9 | [Palindrome Number](https://leetcode.com/problems/palindrome-number/) | Easy | [Python](palindromeNumber.py) | Convert to string and compare with its reverse | O(d) | O(d) |
| 13 | [Roman to Integer](https://leetcode.com/problems/roman-to-integer/) | Easy | [Python](romanToInteger.py) | Lookup tables for single symbols and subtractive pairs | O(n) | O(n) |
| 20 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Easy | [Java](Parentheses.java) | Stack of open brackets, map closing → opening | O(n) | O(n) |
| 27 | [Remove Element](https://leetcode.com/problems/remove-element/) | Easy | [Python](removeElement.py) | Two pointers, overwrite in place | O(n) | O(1) |
| 28 | [Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) | Easy | [Python](idxFirstOccurrenceInString.py) | Scan and compare substrings | O(n · m) | O(m) |
| 88 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | Easy | [Java](MergeSortedArray.java) | Three pointers, fill `nums1` from the end | O(m + n) | O(1) |
| 206 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | Easy | [Java](ReverseLinkedList.java) | Iterative pointer reversal | O(n) | O(1) |
| 217 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | Easy | [Java](RemoveDuplicates.java) | HashSet (plus a sort-based variant) | O(n) | O(n) |
| 242 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) | Easy | [Java](ValidAnagram.java) | 26-slot frequency counter | O(n) | O(1) |
| 303 | [Range Sum Query – Immutable](https://leetcode.com/problems/range-sum-query-immutable/) | Easy | [Java](RangeSumQuery.java) | Prefix sums | O(n) build, O(1) query | O(n) |
| 682 | [Baseball Game](https://leetcode.com/problems/baseball-game/) | Easy | [Java](BaseballGame.java) | Stack of scores | O(n) | O(n) |
| 724 | [Find Pivot Index](https://leetcode.com/problems/find-pivot-index/) | Easy | [Java](FindPivotIndex.java) | Total sum minus running left sum | O(n) | O(1) |

### Extra practice

| Topic | Files | What it covers |
|-------|-------|----------------|
| Binary tree traversal | [Node.java](Node.java), [NodeTest.java](NodeTest.java) | A simple tree node and recursive pre-order, in-order and post-order traversals |

## Patterns covered

- **Hashing:** Two Sum, Contains Duplicate, Roman to Integer
- **Two pointers:** Remove Element, Merge Sorted Array
- **Stack:** Valid Parentheses, Baseball Game
- **Prefix sums:** Range Sum Query, Find Pivot Index
- **Linked lists:** Add Two Numbers, Reverse Linked List
- **Counting:** Valid Anagram
- **Trees:** Pre-, in- and post-order traversal
- **Strings:** Palindrome Number, Find the Index of the First Occurrence

## File structure

```
leetcode-studies/
├── *.java     # Java solutions (one class per problem)
├── *.py       # Python solutions (LeetCode Solution class)
└── README.md
```

Each file starts with:

1. The LeetCode problem number and difficulty
2. The problem statement and constraints
3. The expected outputs for the sample inputs