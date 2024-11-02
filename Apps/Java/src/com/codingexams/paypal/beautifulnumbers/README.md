<h3>Problem: Beautiful numbers </h3>

You are given two integers L and R. Your task is to determine the sum of all the beautiful numbers from the range [L,R].

A number represents a beautiful number if it satisfies the following condition:

* If the number becomes 1 at some point by replacing it repeatedly with the sum of squares of its digits.
  Note: If the number never becomes 1, then the provided number is not a beautiful number.

For further clarification, please refer to the explanation of the sample test case.

**Example**

Consider L=1, R = 2. You have to determine the sum of all the beautiful numbers from the range [L, R].

Here the answer is 1 as 2 is not a beautiful number.

**Function description:**

Complete the solve function provided in the editor. This function takes the following 2 parameters and returns the sum of all the beautiful numbers from the range [L, R].

* *L*: Represents an integer denoting L
* R: Represents an integer denoting R

**Input**:

**Note** : This is the input format that you must use to provide custom input (available above the Compile and Test button).

* The first line contains an integer T denoting the number of test cases.
* The next T lines contain two integers L and R.

**Output**:

For each test case, print a value that represents the sum of the beautiful numbers in the range [L, R].
**Note** : You are required to print the answers for each test case in a new line.

Sample Input

```
2
31 32
7 7
```

Sample Output

```
63
7
```

Explanation

For the first test case, both **31** and **32** can be reduced to  **1** , therefore the output is  **63** . For example:

* Replace 31 by 3^2 + 1^2  = 10
* Replace 10 by 1^2 + 0^2 = 1
