<h3>Problem: Heaviest Package</h3>

To increase efficiency, the Amazon shipping team will group packages being shipped according to weight. They will merge a lighter package with a heavier package, which eliminates the need for separate shipments.

More formally, consider n packages, where package Weights[i] represents the weight of the th package. You can combine the ith and (i+1)th package if packageWeights[i]< packageWeights[i+1], then discard the th package. After this operation, the number of thp packages is reduced by 1 and the weight of the (i+1)th package increases by package Weights[1]. You can merge the packages any number of times.

Find the maximum possible weight of a package that can be achieved after any sequence of merge-operations.

**Example**

For example, packages are described as package weights = [2, 9, 10, 3, 7].

The optimal order of operations is, using 1-based indexing:

. Combine the packages at index 2 and index 3, the new array of package weights becomes [2. 19, 3, 7].

Combine the packages at index 1 and index 2, the new array of package weights becomes [21,3, 7].

. Combine the packages at index 2 and index 3, the new array of package weights becomes [21, 10].

We can not combine the packages anymore.

The weight of the heaviest package achievable after merging is 21.

Function Description

Complete the function getHeaviestPackage in the editor below.

getHeaviestPackage has the following parameter:

int packageWeights/n]: the weights of the packages

Returns

long_int: the weight of the heaviest package after merging all possible packages.

Constraints

1 ≤ n ≤ 2*10^5

1 ≤ packageWeights[i] ≤ 10⁹

<h3>Sample Input</h3>

```
4   ---> packageWeights [] size n = 4

20  --->  packageWeights[] = [20, 13, 8, 9]

13

8

9
```

<h3>Sample Output</h3>

```
50
```
