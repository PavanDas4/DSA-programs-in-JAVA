# Set Matrix Zeros
You are given a 2D matrix `mat[][]` of size `n×m`. The task is to modify the matrix such that if `mat[i][j]` is `0`, all the elements in the i-th row and j-th column are set to `0` and do it in **constant space complexity**.
## Prerequisite
```java
import java.util.Scanner;
```
### Example
```
Input  : [[1, -1, 1],
          [-1, 0, 1],
          [1, -1, 1]]
Output : [[1, 0, 1],
          [0, 0, 0],
          [1, 0, 1]]
```