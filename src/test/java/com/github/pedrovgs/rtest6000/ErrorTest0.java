package com.github.pedrovgs.rtest6000;

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
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on listnode_sumLists6, listnode_mergeSortedArrays2, and mergeSortedArrays1.", !(listnode_sumLists6.equals(listnode_mergeSortedArrays2) && listnode_mergeSortedArrays2.equals(mergeSortedArrays1)) || listnode_sumLists6.equals(mergeSortedArrays1));
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.github.pedrovgs.problem62.PalindromeList palindromeList0 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i5 = reverseLinkedList1.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        boolean b6 = palindromeList0.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays7 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays8 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays7);
        java.lang.String str9 = listnode_mergeSortedArrays8.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays10 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays11 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays10);
        java.lang.String str12 = listnode_mergeSortedArrays11.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays13 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays11.setData(mergeSortedArrays13);
        listnode_mergeSortedArrays8.setNext(listnode_mergeSortedArrays11);
        boolean b16 = palindromeList0.checkReversing((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays8);
        com.github.pedrovgs.problem61.SumLists sumLists17 = null;
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem61.SumLists> listnode_sumLists18 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem61.SumLists>(sumLists17);
        boolean b19 = palindromeList0.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_sumLists18);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on listnode_sumLists18, listnode_i5, and listnode_i5.", !(listnode_sumLists18.equals(listnode_i5) && listnode_i5.equals(listnode_i5)) || listnode_sumLists18.equals(listnode_i5));
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
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
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals24 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST25 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array27 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i28 = sortedArrayToBST25.transform(i_array27);
        boolean b29 = binarynode_i28.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST30 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array32 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i33 = sortedArrayToBST30.transform(i_array32);
        boolean b34 = binarynode_i33.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i35 = binarynode_i33.getRight();
        boolean b36 = binaryTreeEquals24.areEqualsIterative(binarynode_i28, binarynode_i33);
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian37 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i39 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d40 = avlTreeMedian37.find(binarynode_i39);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor41 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals42 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST43 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array45 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i46 = sortedArrayToBST43.transform(i_array45);
        boolean b47 = binarynode_i46.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST48 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array50 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i51 = sortedArrayToBST48.transform(i_array50);
        boolean b52 = binarynode_i51.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i53 = binarynode_i51.getRight();
        boolean b54 = binaryTreeEquals42.areEqualsIterative(binarynode_i46, binarynode_i51);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST55 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array57 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i58 = sortedArrayToBST55.transform(i_array57);
        boolean b59 = binarynode_i58.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST60 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array62 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i63 = sortedArrayToBST60.transform(i_array62);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode64 = lowestCommonAncestor41.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i51, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i58, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i63);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i65 = binarynode_i51.getLeft();
        double d66 = avlTreeMedian37.find(binarynode_i51);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST67 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array69 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i70 = sortedArrayToBST67.transform(i_array69);
        boolean b71 = binarynode_i70.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i72 = binarynode_i70.getRight();
        java.lang.Integer i73 = binarynode_i70.getData();
        binarynode_i51.setLeft(binarynode_i70);
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel75 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel76 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem18.IsBST isBST77 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST78 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array80 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i81 = sortedArrayToBST78.transform(i_array80);
        boolean b82 = isBST77.checkRecursive(binarynode_i81);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode83 = binaryTreeByLevel76.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i81);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode84 = binaryTreeByLevel75.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i81);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode85 = lowestCommonAncestor0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i28, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i51, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i81);
    }
}


