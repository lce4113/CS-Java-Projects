package com.bst;

import com.randp.RandP;
import com.utils.Utils;

public class Main {

  public static void main(String[] args) {

/*
The lowest possible value for a binary search
tree depth is 13. This is because there would
be 2^0 nodes in the first layer, 2^1 nodes
in the second layer, 2^2 nodes in the third
layer, and so on. This means that if the depth
of a tree is n, then the maximum nodes in the
tree is

2^n + 2^(n-1) + 2^(n-2)...2^1 + 2^0 = 2^(n+1) - 1.

2^14 is the first power of 2 that is greater
than or equal to 10000, so if n is 13, then
the maximum amount of nodes in the tree would
be 2^14 - 1 = 16383.

However, this is highly unlikely since the array
would have to be ordered perfectly.

My guess is somewhere between 50 and 100.
*/

    BST tree;
    RandP rand;
    int n = 10, m = 10000;
    Integer[] depths = new Integer[10];
    for (int i = 0; i < n; i++) {
      rand = new RandP(m);
      tree = new BST();
      for (int j = 0; j < m; j++) {
        tree.insert(rand.nextInt());
      }
      depths[i] = tree.depth();
    }
    System.out.println("All Depths: " + Utils.arrayToString(depths, ", "));
    int average = Utils.sum(depths) / n;
    System.out.println("Average: " + average); // The average was usually 30, 31, or 32
  }

}

/*
4 ALGORITHM ANALYSIS

- What is the worst case order of growth for
finding a datum in a binary search tree?

The worst case for finding a datum would be
if every node has one branch and the tree is
basically a sequence. In this case, the order
of growth would be O(n) where n is the number
of nodes in the tree.

- What is the best case?

The best case is if every node has 2 branches
and the depth of the tree was as small as
possible. If this is true, the maximum depth
of the tree would be log(n) base 2. This makes
the order of growth log(n) base 2.

- What do you think the average case order
of growth is? (In other words if a tree was
created as in (3), above, in random order,
what would you expect the typical order of
growth for search to be?)

The average depth of the tree was around 2
times log(n) base 2, so the order of growth
for the average binary tree is
O(2*log(n)(base 2)).

- What is the order of growth to insert an
element in the tree?

To insert an element in the tree, its position
must be found (which is at the end of the tree
in the worst case). This means that the order
of growth is O(log n) base 2.

- What is the order of growth to print the
tree?

The order of growth to print the tree is O(n)
(where n is the number of nodes in the binary
tree) because the method goes through each
node and adds their datum to the string.

- What is the order of growth to delete a node?

In order to delete a node, the node must first
be found and then either the node's tree has to
be replaced, or the node has to be replaced.
*/