package com.github.pedrovgs.rtest1h;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on listnode_sumLists18, listnode_i5, and mergeSortedArrays2.", !(listnode_sumLists18.equals(listnode_i5) && listnode_i5.equals(mergeSortedArrays2)) || listnode_sumLists18.equals(mergeSortedArrays2));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList0 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        java.lang.String str3 = listnode_mergeSortedArrays2.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i4 = reverseLinkedList0.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays5 = null;
        listnode_mergeSortedArrays2.setData(mergeSortedArrays5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on listnode_mergeSortedArrays2 and listnode_i4", listnode_mergeSortedArrays2.equals(listnode_i4) ? listnode_mergeSortedArrays2.hashCode() == listnode_i4.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor0 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST1 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i4 = sortedArrayToBST1.transform(i_array3);
        boolean b5 = binarynode_i4.hasRight();
        java.lang.Integer i6 = binarynode_i4.getData();
        boolean b7 = binarynode_i4.hasRight();
        boolean b8 = binarynode_i4.hasRight();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals9 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem18.IsBST isBST10 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST11 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array13 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i14 = sortedArrayToBST11.transform(i_array13);
        boolean b15 = isBST10.checkRecursive(binarynode_i14);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST16 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array18 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i19 = sortedArrayToBST16.transform(i_array18);
        boolean b20 = binarynode_i19.hasRight();
        boolean b21 = binaryTreeEquals9.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i14, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i19);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST22 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array24 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i25 = sortedArrayToBST22.transform(i_array24);
        java.lang.String str26 = binarynode_i25.toString();
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_27 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_27.push((int) (byte) 10);
        int i30 = stack1_27.getMin();
        boolean b31 = binarynode_i25.equals((java.lang.Object) stack1_27);
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel32 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem18.IsBST isBST33 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST34 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array36 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i37 = sortedArrayToBST34.transform(i_array36);
        boolean b38 = isBST33.checkRecursive(binarynode_i37);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode39 = binaryTreeByLevel32.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i37);
        binarynode_i25.setRight(binarynode_i37);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode41 = lowestCommonAncestor0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i4, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i19, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i25);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList0 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = listnode_mergeSortedArrays2.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = listnode_mergeSortedArrays2.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i6 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i7 = null;
        binarynode_i6.setRight(binarynode_i7);
        boolean b9 = listnode_mergeSortedArrays2.equals((java.lang.Object) binarynode_i7);
        com.github.pedrovgs.linkedlist.ListNode listNode10 = reverseLinkedList0.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList11 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays12 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays13 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays12);
        java.lang.String str14 = listnode_mergeSortedArrays13.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i15 = reverseLinkedList11.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays13);
        com.github.pedrovgs.problem62.PalindromeList palindromeList16 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList17 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays18 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays19 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays18);
        java.lang.String str20 = listnode_mergeSortedArrays19.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i21 = reverseLinkedList17.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays19);
        boolean b22 = palindromeList16.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays19);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays23 = listnode_mergeSortedArrays19.getNext();
        listnode_mergeSortedArrays13.setNext(listnode_mergeSortedArrays19);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i25 = reverseLinkedList0.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays19);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays26 = null;
        listnode_mergeSortedArrays19.setData(mergeSortedArrays26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on listnode_i25 and listnode_mergeSortedArrays19", listnode_i25.equals(listnode_mergeSortedArrays19) ? listnode_i25.hashCode() == listnode_mergeSortedArrays19.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.github.pedrovgs.problem62.PalindromeList palindromeList0 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements1 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList2 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = listnode_mergeSortedArrays4.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays6 = listnode_mergeSortedArrays4.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i8 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i9 = null;
        binarynode_i8.setRight(binarynode_i9);
        boolean b11 = listnode_mergeSortedArrays4.equals((java.lang.Object) binarynode_i9);
        com.github.pedrovgs.linkedlist.ListNode listNode12 = reverseLinkedList2.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        removeListDuplicatedElements1.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode12);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements14 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList15 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays16 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays17 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays16);
        java.lang.String str18 = listnode_mergeSortedArrays17.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode19 = reverseLinkedList15.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays17);
        removeListDuplicatedElements14.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode19);
        removeListDuplicatedElements1.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode19);
        boolean b22 = palindromeList0.checkReversing(listNode19);
        com.github.pedrovgs.problem61.SumLists sumLists23 = null;
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem61.SumLists> listnode_sumLists24 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem61.SumLists>(sumLists23);
        boolean b25 = palindromeList0.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_sumLists24);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on listnode_sumLists24, listnode_mergeSortedArrays4, and mergeSortedArrays16.", !(listnode_sumLists24.equals(listnode_mergeSortedArrays4) && listnode_mergeSortedArrays4.equals(mergeSortedArrays16)) || listnode_sumLists24.equals(mergeSortedArrays16));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList0 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        java.lang.String str3 = listnode_mergeSortedArrays2.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i4 = reverseLinkedList0.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode5 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays6 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays7 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays6);
        java.lang.String str8 = listnode_mergeSortedArrays7.toString();
        deleteListNode5.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays7);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays10 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays11 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays10);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers12 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b13 = listnode_mergeSortedArrays11.equals((java.lang.Object) mergeBinaryNumbers12);
        deleteListNode5.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays11);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i15 = reverseLinkedList0.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays11);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList16 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays17 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays18 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays17);
        java.lang.String str19 = listnode_mergeSortedArrays18.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i20 = reverseLinkedList16.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays18);
        com.github.pedrovgs.problem62.PalindromeList palindromeList21 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList22 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays23 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays24 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays23);
        java.lang.String str25 = listnode_mergeSortedArrays24.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i26 = reverseLinkedList22.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays24);
        boolean b27 = palindromeList21.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays24);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays28 = listnode_mergeSortedArrays24.getNext();
        listnode_mergeSortedArrays18.setNext(listnode_mergeSortedArrays24);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays30 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays31 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays30);
        java.lang.String str32 = listnode_mergeSortedArrays31.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays33 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays34 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays33);
        java.lang.String str35 = listnode_mergeSortedArrays34.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays36 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays34.setData(mergeSortedArrays36);
        listnode_mergeSortedArrays31.setNext(listnode_mergeSortedArrays34);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays39 = listnode_mergeSortedArrays31.getNext();
        listnode_mergeSortedArrays18.setNext(listnode_mergeSortedArrays31);
        com.github.pedrovgs.linkedlist.ListNode listNode41 = reverseLinkedList0.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays31);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays42 = null;
        listnode_mergeSortedArrays31.setData(mergeSortedArrays42);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on listnode_mergeSortedArrays31, listnode_mergeSortedArrays24, and listnode_mergeSortedArrays24.", !(listnode_mergeSortedArrays31.equals(listnode_mergeSortedArrays24) && listnode_mergeSortedArrays24.equals(listnode_mergeSortedArrays24)) || listnode_mergeSortedArrays31.equals(listnode_mergeSortedArrays24));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
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
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder24 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder25 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian26 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i28 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d29 = avlTreeMedian26.find(binarynode_i28);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode30 = binaryTreePreOrder25.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i28);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i31 = binaryTreeInOrder24.getIterative(binarynode_i28);
        com.github.pedrovgs.problem18.IsBST isBST32 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem46.BinaryTreeSerialization binaryTreeSerialization33 = new com.github.pedrovgs.problem46.BinaryTreeSerialization();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST34 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array36 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i37 = sortedArrayToBST34.transform(i_array36);
        boolean b38 = binarynode_i37.hasRight();
        java.lang.Integer i39 = binarynode_i37.getData();
        java.lang.String str40 = binaryTreeSerialization33.serialize((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i37);
        boolean b41 = isBST32.checkIterative(binarynode_i37);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i42 = binaryTreeInOrder24.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i37);
        com.github.pedrovgs.problem16.BinaryTreePostOrder binaryTreePostOrder43 = new com.github.pedrovgs.problem16.BinaryTreePostOrder();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST44 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array46 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i47 = sortedArrayToBST44.transform(i_array46);
        java.lang.String str48 = binarynode_i47.toString();
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_49 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_49.push((int) (byte) 10);
        int i52 = stack1_49.getMin();
        boolean b53 = binarynode_i47.equals((java.lang.Object) stack1_49);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode54 = binaryTreePostOrder43.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i47);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST55 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array57 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i58 = sortedArrayToBST55.transform(i_array57);
        boolean b59 = binarynode_i58.hasRight();
        java.lang.Integer i60 = binarynode_i58.getData();
        boolean b61 = binarynode_i58.hasRight();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode62 = binaryTreePostOrder43.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i58);
        boolean b63 = binarynode_i58.hasLeft();
        java.lang.Integer i64 = binarynode_i58.getData();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST65 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array67 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i68 = sortedArrayToBST65.transform(i_array67);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode69 = lowestCommonAncestor0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i37, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i58, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i68);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor0 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder1 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST2 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = sortedArrayToBST2.transform(i_array4);
        boolean b6 = binarynode_i5.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i7 = binarynode_i5.getRight();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode8 = binaryTreePreOrder1.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i5);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST9 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array11 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i12 = sortedArrayToBST9.transform(i_array11);
        java.lang.String str13 = binarynode_i12.toString();
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_14 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_14.push((int) (byte) 10);
        int i17 = stack1_14.getMin();
        boolean b18 = binarynode_i12.equals((java.lang.Object) stack1_14);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode19 = binaryTreePreOrder1.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i12);
        com.github.pedrovgs.problem65.IsTreeBalanced isTreeBalanced20 = new com.github.pedrovgs.problem65.IsTreeBalanced();
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor21 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals22 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST23 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array25 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i26 = sortedArrayToBST23.transform(i_array25);
        boolean b27 = binarynode_i26.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST28 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array30 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i31 = sortedArrayToBST28.transform(i_array30);
        boolean b32 = binarynode_i31.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i33 = binarynode_i31.getRight();
        boolean b34 = binaryTreeEquals22.areEqualsIterative(binarynode_i26, binarynode_i31);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST35 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array37 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i38 = sortedArrayToBST35.transform(i_array37);
        boolean b39 = binarynode_i38.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST40 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array42 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i43 = sortedArrayToBST40.transform(i_array42);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode44 = lowestCommonAncestor21.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i31, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i38, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i43);
        boolean b45 = isTreeBalanced20.check((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i43);
        com.github.pedrovgs.problem66.TreeToListByLevel treeToListByLevel46 = new com.github.pedrovgs.problem66.TreeToListByLevel();
        com.github.pedrovgs.problem16.BinaryTreePostOrder binaryTreePostOrder47 = new com.github.pedrovgs.problem16.BinaryTreePostOrder();
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder48 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian49 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i51 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d52 = avlTreeMedian49.find(binarynode_i51);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor53 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals54 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST55 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array57 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i58 = sortedArrayToBST55.transform(i_array57);
        boolean b59 = binarynode_i58.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST60 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array62 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i63 = sortedArrayToBST60.transform(i_array62);
        boolean b64 = binarynode_i63.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i65 = binarynode_i63.getRight();
        boolean b66 = binaryTreeEquals54.areEqualsIterative(binarynode_i58, binarynode_i63);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST67 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array69 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i70 = sortedArrayToBST67.transform(i_array69);
        boolean b71 = binarynode_i70.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST72 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array74 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i75 = sortedArrayToBST72.transform(i_array74);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode76 = lowestCommonAncestor53.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i63, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i70, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i75);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i77 = binarynode_i63.getLeft();
        double d78 = avlTreeMedian49.find(binarynode_i63);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST79 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array81 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i82 = sortedArrayToBST79.transform(i_array81);
        boolean b83 = binarynode_i82.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i84 = binarynode_i82.getRight();
        java.lang.Integer i85 = binarynode_i82.getData();
        binarynode_i63.setLeft(binarynode_i82);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i87 = binaryTreeInOrder48.getIterative(binarynode_i82);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode88 = binaryTreePostOrder47.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i82);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode89 = treeToListByLevel46.transform((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i82);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST90 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array92 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i93 = sortedArrayToBST90.transform(i_array92);
        boolean b94 = binarynode_i93.hasRight();
        java.lang.Integer i95 = binarynode_i93.getData();
        boolean b96 = binarynode_i93.hasRight();
        boolean b97 = binarynode_i93.hasRight();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode98 = treeToListByLevel46.transform((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i93);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode99 = lowestCommonAncestor0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i12, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i43, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i93);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        java.lang.Comparable<java.lang.String> comparable_str0 = null;
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange5 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange6 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "", combinationsOfChange5);
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange7 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "[", combinationsOfChange5);
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange8 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "]1- ,1 ,1 ,0[", combinationsOfChange5);
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange9 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "/!ih", combinationsOfChange5);
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange10 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>(comparable_str0, combinationsOfChange5);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on pair_comparable_str_combinationsOfChange10, pair_comparable_str_combinationsOfChange7, and pair_comparable_str_combinationsOfChange7.", !(pair_comparable_str_combinationsOfChange10.equals(pair_comparable_str_combinationsOfChange7) && pair_comparable_str_combinationsOfChange7.equals(pair_comparable_str_combinationsOfChange7)) || pair_comparable_str_combinationsOfChange10.equals(pair_comparable_str_combinationsOfChange7));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.github.pedrovgs.problem40.MoveElementsToPositions moveElementsToPositions0 = new com.github.pedrovgs.problem40.MoveElementsToPositions();
        com.github.pedrovgs.problem79.MergeSort mergeSort1 = new com.github.pedrovgs.problem79.MergeSort();
        int[] i_array2 = new int[] {};
        mergeSort1.sort(i_array2);
        moveElementsToPositions0.move(i_array2);
        com.github.pedrovgs.problem8.SplitArray splitArray5 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem39.MultiplyArrayElements multiplyArrayElements6 = new com.github.pedrovgs.problem39.MultiplyArrayElements();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral7 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array8 = new int[][] {};
        int[] i_array9 = goThroughMatrixInSpiral7.go(i_array_array8);
        int[] i_array10 = multiplyArrayElements6.multiply(i_array9);
        splitArray5.splitSwappingPartition(i_array9);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral12 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array13 = new int[][] {};
        int[] i_array14 = goThroughMatrixInSpiral12.go(i_array_array13);
        splitArray5.splitSwappingPartition(i_array14);
        moveElementsToPositions0.move(i_array14);
        com.github.pedrovgs.problem38.PathToEveryLeaf pathToEveryLeaf17 = null;
        com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem40.MoveElementsToPositions, com.github.pedrovgs.problem38.PathToEveryLeaf> pair_moveElementsToPositions_pathToEveryLeaf18 = new com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem40.MoveElementsToPositions, com.github.pedrovgs.problem38.PathToEveryLeaf>(moveElementsToPositions0, pathToEveryLeaf17);
        com.github.pedrovgs.problem40.MoveElementsToPositions moveElementsToPositions19 = new com.github.pedrovgs.problem40.MoveElementsToPositions();
        com.github.pedrovgs.problem79.MergeSort mergeSort20 = new com.github.pedrovgs.problem79.MergeSort();
        int[] i_array21 = new int[] {};
        mergeSort20.sort(i_array21);
        moveElementsToPositions19.move(i_array21);
        com.github.pedrovgs.problem2.Vector vector24 = new com.github.pedrovgs.problem2.Vector(i_array21);
        moveElementsToPositions0.move(i_array21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pair_moveElementsToPositions_pathToEveryLeaf18 and pair_moveElementsToPositions_pathToEveryLeaf18", pair_moveElementsToPositions_pathToEveryLeaf18.equals(pair_moveElementsToPositions_pathToEveryLeaf18) ? pair_moveElementsToPositions_pathToEveryLeaf18.hashCode() == pair_moveElementsToPositions_pathToEveryLeaf18.hashCode() : true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays0 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays0);
        java.lang.String str2 = listnode_mergeSortedArrays1.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays6 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays4.setData(mergeSortedArrays6);
        listnode_mergeSortedArrays1.setNext(listnode_mergeSortedArrays4);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays9 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays10 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays9);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays11 = listnode_mergeSortedArrays10.getNext();
        listnode_mergeSortedArrays1.setNext(listnode_mergeSortedArrays10);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays13 = listnode_mergeSortedArrays1.getNext();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays14 = null;
        listnode_mergeSortedArrays1.setData(mergeSortedArrays14);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on listnode_mergeSortedArrays1, listnode_mergeSortedArrays10, and listnode_mergeSortedArrays13.", !(listnode_mergeSortedArrays1.equals(listnode_mergeSortedArrays10) && listnode_mergeSortedArrays10.equals(listnode_mergeSortedArrays13)) || listnode_mergeSortedArrays1.equals(listnode_mergeSortedArrays13));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        java.lang.Comparable<java.lang.String> comparable_str0 = null;
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange2 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange3 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "", combinationsOfChange2);
        com.github.pedrovgs.problem31.FindLongestConsecutiveSequence findLongestConsecutiveSequence4 = new com.github.pedrovgs.problem31.FindLongestConsecutiveSequence();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays5 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays6 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays5);
        com.github.pedrovgs.problem8.SplitArray splitArray7 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array10 = new int[] { (byte) 1, (byte) 10 };
        splitArray7.splitSwappingPartition(i_array10);
        int[] i_array18 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray7.splitSwappingRecursive(i_array18);
        com.github.pedrovgs.problem8.SplitArray splitArray20 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array23 = new int[] { (byte) 1, (byte) 10 };
        splitArray20.splitSwappingPartition(i_array23);
        int[] i_array31 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray20.splitSwappingRecursive(i_array31);
        int[] i_array33 = mergeSortedArrays5.merge(i_array18, i_array31);
        int i34 = findLongestConsecutiveSequence4.findIterative(i_array33);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays35 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort36 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray37 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array40 = new int[] { (byte) 1, (byte) 10 };
        splitArray37.splitSwappingPartition(i_array40);
        selectionSort36.sort(i_array40);
        com.github.pedrovgs.problem8.SplitArray splitArray43 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array46 = new int[] { (byte) 1, (byte) 10 };
        splitArray43.splitSwappingPartition(i_array46);
        int[] i_array54 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray43.splitSwappingRecursive(i_array54);
        int[] i_array56 = mergeSortedArrays35.merge(i_array40, i_array54);
        int i57 = findLongestConsecutiveSequence4.findRecursive(i_array54);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays58 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort59 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray60 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array63 = new int[] { (byte) 1, (byte) 10 };
        splitArray60.splitSwappingPartition(i_array63);
        selectionSort59.sort(i_array63);
        com.github.pedrovgs.problem8.SplitArray splitArray66 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array69 = new int[] { (byte) 1, (byte) 10 };
        splitArray66.splitSwappingPartition(i_array69);
        int[] i_array77 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray66.splitSwappingRecursive(i_array77);
        int[] i_array79 = mergeSortedArrays58.merge(i_array63, i_array77);
        int i80 = findLongestConsecutiveSequence4.findIterative(i_array79);
        int[] i_array81 = new int[] {};
        int i82 = findLongestConsecutiveSequence4.findIterative(i_array81);
        java.util.List<java.util.List<java.lang.Integer>> list_list_i84 = combinationsOfChange2.get(i_array81, 6);
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange85 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>(comparable_str0, combinationsOfChange2);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on pair_comparable_str_combinationsOfChange85, pair_comparable_str_combinationsOfChange3, and selectionSort59.", !(pair_comparable_str_combinationsOfChange85.equals(pair_comparable_str_combinationsOfChange3) && pair_comparable_str_combinationsOfChange3.equals(selectionSort59)) || pair_comparable_str_combinationsOfChange85.equals(selectionSort59));
    }
}


