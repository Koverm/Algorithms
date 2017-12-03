package com.github.pedrovgs.longtest6;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor0 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals1 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST2 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = sortedArrayToBST2.transform(i_array4);
        boolean b6 = binarynode_i5.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST7 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array9 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i10 = sortedArrayToBST7.transform(i_array9);
        boolean b11 = binarynode_i10.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i12 = binarynode_i10.getRight();
        boolean b13 = binaryTreeEquals1.areEqualsIterative(binarynode_i5, binarynode_i10);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST14 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array16 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i17 = sortedArrayToBST14.transform(i_array16);
        boolean b18 = binarynode_i17.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST19 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array21 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i22 = sortedArrayToBST19.transform(i_array21);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode23 = lowestCommonAncestor0.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i10, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i17, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i22);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor24 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals25 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST26 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array28 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i29 = sortedArrayToBST26.transform(i_array28);
        boolean b30 = binarynode_i29.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST31 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array33 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i34 = sortedArrayToBST31.transform(i_array33);
        boolean b35 = binarynode_i34.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i36 = binarynode_i34.getRight();
        boolean b37 = binaryTreeEquals25.areEqualsIterative(binarynode_i29, binarynode_i34);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST38 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array40 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i41 = sortedArrayToBST38.transform(i_array40);
        boolean b42 = binarynode_i41.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST43 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array45 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i46 = sortedArrayToBST43.transform(i_array45);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode47 = lowestCommonAncestor24.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i34, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i41, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i46);
        com.github.pedrovgs.problem18.IsBST isBST48 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST49 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array51 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i52 = sortedArrayToBST49.transform(i_array51);
        boolean b53 = isBST48.checkRecursive(binarynode_i52);
        boolean b54 = binarynode_i52.hasRight();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals55 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem18.IsBST isBST56 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST57 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array59 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i60 = sortedArrayToBST57.transform(i_array59);
        boolean b61 = isBST56.checkRecursive(binarynode_i60);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST62 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array64 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i65 = sortedArrayToBST62.transform(i_array64);
        boolean b66 = binarynode_i65.hasRight();
        boolean b67 = binaryTreeEquals55.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i60, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i65);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode68 = lowestCommonAncestor0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i46, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i52, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i60);
    }
}


