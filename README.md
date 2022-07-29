# algorithms
Repository with implementation of algorithms on Java

## Java
### [Add Two Numbers](java/AddTwoNumbers)
input: LinkedList **l1**, LinkedList **l2**\
output: LinkedList reverse l1 + l2 result\
example:
```
input: l1 = [5,5], l2 = [1,1,0]
output: [5,6,1]
```
[5, 5] = 55, [1,1,0] = 110. Output is reverse result of summ this two numbers( 55 + 110 = 165. Reverse - 561, in LinkedList - [5, 6, 1] ).\
Similar task is on [leetcode](https://leetcode.com/problems/add-two-numbers/), but here using ListNode, in my algorithm using LinkedList.

### [Longest Prefix](java/LongestPrefix) 
(MAVEN)\
input: String[ ] array\
output: longest prefix for words in array\
example:
```
input: array = ["flower","flow","flight"]
output: "fl"
```

On input we have string array with words, this code return longest prefix for this words. [Task on leetcode](https://leetcode.com/problems/longest-common-prefix/)

### [Longest Substring](java/LongestSubstring)
(MAVEN)\
input: String string\
output: length of longest substring\
example:
```
input: string = "pwwkew"
output: 3
```

Return length of longest substring without repeating characters, [This task on leetcode](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

### [Palindrome List](java/PalindromeList)
(MAVEN)\
input:int[ ] array\
output: is palindrome (true or false)\
example:
```
input: array = [1,2,1]
output: true
```

### [Reverse Integer](java/ReverseInteger)
(MAVEN)\
input: int number\
output: reversed number\
example 1:
```
input: 123
output: 321
```

example 2:
```
input: -123
output:-321
```

In input we have integer number, on output must be reversed number, but if number negative minus always must be before all characters. [This task on leetcode](https://leetcode.com/problems/reverse-integer/)



### [Two Sum](java/TwoSum)
(MAVEN)\
input: int[ ] **array**, int **target**\
output: [**i**, **j**]\
example: 
```
input: array = [2,7,11,15], target = 9
output: [0,1]
```
**i** and **j** is indexes of the array, array[i] + array[j] must be equal **target**\
[This task on leetcode](https://leetcode.com/problems/two-sum/)


