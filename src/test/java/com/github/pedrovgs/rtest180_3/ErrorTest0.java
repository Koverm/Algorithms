package com.github.pedrovgs.rtest180_3;

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

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor0 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor1 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals2 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST3 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array5 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i6 = sortedArrayToBST3.transform(i_array5);
        boolean b7 = binarynode_i6.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST8 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array10 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i11 = sortedArrayToBST8.transform(i_array10);
        boolean b12 = binarynode_i11.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i13 = binarynode_i11.getRight();
        boolean b14 = binaryTreeEquals2.areEqualsIterative(binarynode_i6, binarynode_i11);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST15 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array17 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i18 = sortedArrayToBST15.transform(i_array17);
        boolean b19 = binarynode_i18.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST20 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array22 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i23 = sortedArrayToBST20.transform(i_array22);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode24 = lowestCommonAncestor1.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i11, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i18, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i23);
        java.lang.Integer i25 = binarynode_i18.getData();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i26 = binarynode_i18.getRight();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals27 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST28 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array30 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i31 = sortedArrayToBST28.transform(i_array30);
        boolean b32 = binarynode_i31.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST33 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array35 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i36 = sortedArrayToBST33.transform(i_array35);
        boolean b37 = binarynode_i36.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i38 = binarynode_i36.getRight();
        boolean b39 = binaryTreeEquals27.areEqualsIterative(binarynode_i31, binarynode_i36);
        java.lang.String str40 = binarynode_i36.toString();
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder41 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian42 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i44 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d45 = avlTreeMedian42.find(binarynode_i44);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode46 = binaryTreePreOrder41.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i44);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode47 = lowestCommonAncestor0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i18, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i36, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i44);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
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
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian24 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i26 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d27 = avlTreeMedian24.find(binarynode_i26);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST28 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array30 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i31 = sortedArrayToBST28.transform(i_array30);
        boolean b32 = binarynode_i31.hasRight();
        java.lang.Integer i33 = binarynode_i31.getData();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals34 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem18.IsBST isBST35 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST36 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array38 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i39 = sortedArrayToBST36.transform(i_array38);
        boolean b40 = isBST35.checkRecursive(binarynode_i39);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST41 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array43 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i44 = sortedArrayToBST41.transform(i_array43);
        boolean b45 = binarynode_i44.hasRight();
        boolean b46 = binaryTreeEquals34.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i39, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i44);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i47 = binarynode_i39.getLeft();
        com.github.pedrovgs.binarytree.BinaryNode binaryNode48 = lowestCommonAncestor0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i26, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i31, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i39);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode0 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        java.lang.String str3 = listnode_mergeSortedArrays2.toString();
        deleteListNode0.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2);
        com.github.pedrovgs.problem61.SumLists sumLists5 = null;
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem61.SumLists> listnode_sumLists6 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem61.SumLists>(sumLists5);
        deleteListNode0.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_sumLists6);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on listnode_sumLists6, listnode_mergeSortedArrays2, and listnode_mergeSortedArrays2.", !(listnode_sumLists6.equals(listnode_mergeSortedArrays2) && listnode_mergeSortedArrays2.equals(listnode_mergeSortedArrays2)) || listnode_sumLists6.equals(listnode_mergeSortedArrays2));
    }
}


