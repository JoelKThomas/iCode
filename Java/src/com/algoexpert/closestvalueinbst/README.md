 <h3>Problem: Find Closest Value In BST</h3>


Write a function that takes in a Binary Search Tree (BST) and a target integer value and returns the
closest value to that target value contained in the BST.

You can assume that there will only be one closest value.

Each BST node has an integer value , a left child node, and a right child node. A node is
said to be a valid BST node if and only if it satisfies the BST property: its value is strictly greater
than the values of every node to its left; its value is less than or equal to the values of every node
to its right; and its children nodes are either valid BST nodes themselves or None / null .

<h3>Sample Input</h3>

           10
           / \
          5  15
         / \ / \
         2 5 13 22
        /     \
        1     14

    Target= 11

<h3>Sample Output</h3>

     The Closest Value in the BST is :10