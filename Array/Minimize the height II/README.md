# Minimize the Heights II
Given an array arr[] denoting heights of N towers and a positive integer K. 
For each tower, you must perform exactly one of the following operations exactly once.
- Increase the height of the tower by K
- Decrease the height of the tower by K

Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.
## Prerequisite
```java
import java.util.Arrays;
import java.util.Scanner;
```
### Example
```
Input  : 4
arr[] = [1, 5, 8, 10]
k = 2
Output : 5
```
```diff
![Note](https://img.shields.io/badge/Note-red): It is compulsory to increase or decrease the height by K for each tower. After the operation, the resultant array should not contain any negative integers.
```
