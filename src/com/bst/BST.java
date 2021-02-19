package com.bst;

import java.util.ArrayList;
import java.util.Collections;

class BST<T extends Comparable<T>> {

  // FIELDS

  public BST<T> right;
  public T datum;
  public BST<T> left;

  // CONSTRUCTORS

  BST(T datum) {
    this.datum = datum;
  }

  BST() {
  }

  // ACCESSORS

  // returns the datum of a node
  public T getDatum() {
    return this.datum;
  }

  // returns the left subtree
  public BST<T> getLeft() {
    return this.left;
  }

  // returns the right subtree
  public BST<T> getRight() {
    return this.right;
  }

  // UTILITIES

  // print toString tree
  public void printTree() {
    System.out.println(this);
  }

  // return data in tree using infix (inorder) notation
  public String toString() {
    if (this.left == null && this.right == null) return this.datum.toString();
    if (this.left == null) return this.datum + ", " + this.right;
    if (this.right == null) return this.left + ", " + this.datum;
    return this.left + ", " + this.datum + ", " + this.right;
  }

  // returns the depth of the tree--one node counts a as depth of 1, not 0
  public int depth() {
    if (this.left == null && this.right == null) return 1;
    if (this.left == null) return this.right.depth() + 1;
    if (this.right == null) return this.left.depth() + 1;
    return Math.max(this.left.depth(), this.right.depth()) + 1;
  }

  public T minValue() {
    ArrayList<T> arr = new ArrayList<>();
    arr.add(this.left.minValue());
    arr.add(this.datum);
    arr.add(this.right.minValue());
    return Collections.min(arr);
  }

  // OTHER METHODS

  // insert datum in binary search tree
  public void insert(T datum) {
    if (this.datum == null) {
      this.datum = datum;
      return;
    }
    int compare = datum.compareTo(this.datum);
    if (compare > 0) {
      if (this.right == null) {
        this.right = new BST<>(datum);
      } else {
        this.right.insert(datum);
      }
    } else if (compare < 0) {
      if (this.left == null) {
        this.left = new BST<>(datum);
      } else {
        this.left.insert(datum);
      }
    }
  }

  // find datum in the binary search tree; if found, delete node,
  // but remember, this must remain a BST after deletion
  public BST<T> delete(BST<T> tree, T datum) {
    int compare = datum.compareTo(tree.datum);
    if (compare == 0) {
      if (tree.right == null && tree.left == null) {
        return null;
      }
      if (tree.right == null) {
        return tree.left;
      }
      if (tree.left == null) {
        System.out.println("hEhE");
        return tree.right;
      }
      T rightMin = tree.right.minValue();
      tree.datum = rightMin;
      tree.right = delete(tree.right, rightMin);
    } else if (compare < 0) {
      if (tree.left != null)
        tree.left = delete(tree.left, datum);
    } else {
      if (tree.right != null)
        tree.right = delete(tree.right, datum);
    }
    return tree;
  }

}