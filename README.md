# algorithms
Repository with implementation of algorithms on Java or Python

## Java
### Palindrome List
input:int[ ] array\
output: is palindrome (true or false)\
example:
```
input: array = [1,2,1]
output: true
```

### Two Sum
input: int[ ] **array**, int **target**\
output: [**i**, **j**]\
example: 
```
input: array = [2,7,11,15], target = 9
output: [0,1]
```
**i** and **j** is indexes of the array, array[i] + array[j] must be equal **target**\
[This task on leetcode](https://leetcode.com/problems/two-sum/)

### Add Two Numbers
input: LinkedList **l1**, LinkedList **l2**\
output: LinkedList reverse l1 + l2 result
example:
```
input: l1 = [5,5], l2 = [1,1,0]
output: [5,6,1]
```
[5, 5] = 55, [1,1,0] = 110. Output is reverse result of summ this two numbers( 55 + 110 = 165. Reverse - 561, in LinkedList - [5, 6, 1] ).\
Similar task is on [leetcode](https://leetcode.com/problems/add-two-numbers/), but here using ListNode, in my algorithm using LinkedList.
