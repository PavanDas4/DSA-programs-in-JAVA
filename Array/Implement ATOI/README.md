# Implement Atoi
Given a `string s`, the objective is to convert it into integer format without utilizing any built-in functions. Refer the below steps to know about `atoi()` function.

Cases for `atoi()` conversion:

1. Skip any leading whitespaces.
2. Check for a sign (`+` or `-`), default to positive if no sign is present.
3. Read the integer by ignoring leading zeros until a non-digit character is encountered or end of the string is reached. If no digits are present, return 0.
4. If the integer is greater than 2<sup>31</sup> – 1, then return 2<sup>31</sup> – 1 and if the integer is smaller than -2<sup>31</sup>, then return -2<sup>31</sup>.
## Prerequisite
```java
import java.util.Scanner;
```
### Example
```
Input  :
"  -0012gfg4"
Output : -12
```