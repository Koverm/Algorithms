package com.github.pedrovgs.rtest30min;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test001");
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays0 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays0);
        com.github.pedrovgs.problem8.SplitArray splitArray2 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array5 = new int[] { (byte) 1, (byte) 10 };
        splitArray2.splitSwappingPartition(i_array5);
        int[] i_array13 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray2.splitSwappingRecursive(i_array13);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays15 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort16 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray17 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array20 = new int[] { (byte) 1, (byte) 10 };
        splitArray17.splitSwappingPartition(i_array20);
        selectionSort16.sort(i_array20);
        com.github.pedrovgs.problem8.SplitArray splitArray23 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array26 = new int[] { (byte) 1, (byte) 10 };
        splitArray23.splitSwappingPartition(i_array26);
        int[] i_array34 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray23.splitSwappingRecursive(i_array34);
        int[] i_array36 = mergeSortedArrays15.merge(i_array20, i_array34);
        splitArray2.splitSwappingIterative(i_array20);
        com.github.pedrovgs.problem28.FindSums findSums38 = new com.github.pedrovgs.problem28.FindSums();
        com.github.pedrovgs.problem8.SplitArray splitArray39 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray40 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array43 = new int[] { (byte) 1, (byte) 10 };
        splitArray40.splitSwappingPartition(i_array43);
        splitArray39.splitSwappingRecursive(i_array43);
        java.util.List<com.github.pedrovgs.pair.Pair<java.lang.Integer, java.lang.Integer>> list_pair_i_i47 = findSums38.find(i_array43, 0);
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_48 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_48.push((int) (byte) 10);
        int i51 = stack1_48.getMin();
        int i52 = stack1_48.getMin();
        com.github.pedrovgs.problem75.SelectionSort selectionSort53 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray54 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array57 = new int[] { (byte) 1, (byte) 10 };
        splitArray54.splitSwappingPartition(i_array57);
        selectionSort53.sort(i_array57);
        int i60 = stack1_48.search((java.lang.Object) i_array57);
        java.util.List<com.github.pedrovgs.pair.Pair<java.lang.Integer, java.lang.Integer>> list_pair_i_i62 = findSums38.find(i_array57, (int) (byte) 1);
        splitArray2.splitSwappingRecursive(i_array57);
        int[] i_array64 = null;
        try {
            int[] i_array65 = mergeSortedArrays0.merge(i_array57, i_array64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(list_pair_i_i47);
        org.junit.Assert.assertTrue(i51 == 10);
        org.junit.Assert.assertTrue(i52 == 10);
        org.junit.Assert.assertNotNull(i_array57);
        org.junit.Assert.assertTrue(i60 == (-1));
        org.junit.Assert.assertNotNull(list_pair_i_i62);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
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
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST24 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array26 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i27 = sortedArrayToBST24.transform(i_array26);
        boolean b28 = binarynode_i27.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i29 = binarynode_i27.getRight();
        binarynode_i17.setRight(binarynode_i27);
        java.lang.Integer i31 = binarynode_i17.getData();
        java.lang.String str32 = binarynode_i17.toString();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(binarynode_i5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(binarynode_i10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(binarynode_i12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(binarynode_i17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(binarynode_i22);
        org.junit.Assert.assertNull(binaryNode23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(binarynode_i27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(binarynode_i29);
        org.junit.Assert.assertTrue("'" + i31 + "' != '" + 100 + "'", i31.equals(100));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "BinaryNode{data=100}" + "'", str32.equals("BinaryNode{data=100}"));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(0);
        int i4 = factorial0.getIterative(270);
        try {
            int i6 = factorial0.getRecursive((-24));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 1);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        com.github.pedrovgs.problem62.PalindromeList palindromeList0 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem62.PalindromeList palindromeList1 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList2 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i6 = reverseLinkedList2.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        boolean b7 = palindromeList1.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        boolean b8 = palindromeList0.checkReversing((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays9 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays10 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays9);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays11 = listnode_mergeSortedArrays10.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays12 = listnode_mergeSortedArrays10.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i14 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i15 = null;
        binarynode_i14.setRight(binarynode_i15);
        boolean b17 = listnode_mergeSortedArrays10.equals((java.lang.Object) binarynode_i15);
        boolean b18 = palindromeList0.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays10);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays19 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays20 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays19);
        java.lang.String str21 = listnode_mergeSortedArrays20.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays22 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays23 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays22);
        java.lang.String str24 = listnode_mergeSortedArrays23.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays25 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays23.setData(mergeSortedArrays25);
        listnode_mergeSortedArrays20.setNext(listnode_mergeSortedArrays23);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays28 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays29 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays28);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays30 = listnode_mergeSortedArrays29.getNext();
        listnode_mergeSortedArrays20.setNext(listnode_mergeSortedArrays29);
        boolean b32 = palindromeList0.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays29);
        org.junit.Assert.assertNotNull(listnode_i6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays11);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays12);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays30);
        org.junit.Assert.assertTrue(b32 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        int i9 = vector_i4.indexOf((java.lang.Object) 1);
        int i11 = vector_i4.indexOf((java.lang.Object) 100.0d);
        com.github.pedrovgs.problem45.FindNthMostRepeatedElement findNthMostRepeatedElement12 = new com.github.pedrovgs.problem45.FindNthMostRepeatedElement();
        boolean b13 = vector_i4.contains((java.lang.Object) findNthMostRepeatedElement12);
        int[] i_array14 = null;
        try {
            int i16 = findNthMostRepeatedElement12.find(i_array14, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel0 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel1 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem18.IsBST isBST2 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST3 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array5 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i6 = sortedArrayToBST3.transform(i_array5);
        boolean b7 = isBST2.checkRecursive(binarynode_i6);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode8 = binaryTreeByLevel1.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i6);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode9 = binaryTreeByLevel0.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i6);
        java.lang.Integer[] i_array14 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i15 = new java.util.Vector<java.lang.Integer>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i15, i_array14);
        int i19 = vector_i15.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        vector_i15.trimToSize();
        vector_i15.add((int) (short) 0, (java.lang.Integer) 0);
        java.util.stream.Stream<java.lang.Integer> stream_i24 = vector_i15.stream();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST25 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array27 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i28 = sortedArrayToBST25.transform(i_array27);
        boolean b29 = vector_i15.removeElement((java.lang.Object) sortedArrayToBST25);
        com.github.pedrovgs.binarytree.BinaryNode<com.github.pedrovgs.problem24.SortedArrayToBST> binarynode_sortedArrayToBST30 = new com.github.pedrovgs.binarytree.BinaryNode<com.github.pedrovgs.problem24.SortedArrayToBST>(sortedArrayToBST25);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode31 = binaryTreeByLevel0.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_sortedArrayToBST30);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor32 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals33 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST34 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array36 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i37 = sortedArrayToBST34.transform(i_array36);
        boolean b38 = binarynode_i37.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST39 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array41 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i42 = sortedArrayToBST39.transform(i_array41);
        boolean b43 = binarynode_i42.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i44 = binarynode_i42.getRight();
        boolean b45 = binaryTreeEquals33.areEqualsIterative(binarynode_i37, binarynode_i42);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST46 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array48 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i49 = sortedArrayToBST46.transform(i_array48);
        boolean b50 = binarynode_i49.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST51 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array53 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i54 = sortedArrayToBST51.transform(i_array53);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode55 = lowestCommonAncestor32.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i42, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i49, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i54);
        java.lang.Integer i56 = binarynode_i49.getData();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode57 = binaryTreeByLevel0.getWithoutAdditionalDataStructures((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i49);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(binarynode_i6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(list_binaryNode8);
        org.junit.Assert.assertNotNull(list_binaryNode9);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertNotNull(stream_i24);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(binarynode_i28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(list_binaryNode31);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(binarynode_i37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(binarynode_i42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(binarynode_i44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(binarynode_i49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(binarynode_i54);
        org.junit.Assert.assertNull(binaryNode55);
        org.junit.Assert.assertTrue("'" + i56 + "' != '" + 100 + "'", i56.equals(100));
        org.junit.Assert.assertNotNull(list_binaryNode57);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder0 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals1 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem18.IsBST isBST2 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST3 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array5 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i6 = sortedArrayToBST3.transform(i_array5);
        boolean b7 = isBST2.checkRecursive(binarynode_i6);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST8 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array10 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i11 = sortedArrayToBST8.transform(i_array10);
        boolean b12 = binarynode_i11.hasRight();
        boolean b13 = binaryTreeEquals1.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i6, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i11);
        com.github.pedrovgs.problem18.IsBST isBST14 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST15 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array17 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i18 = sortedArrayToBST15.transform(i_array17);
        boolean b19 = isBST14.checkRecursive(binarynode_i18);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals20 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST21 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array23 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i24 = sortedArrayToBST21.transform(i_array23);
        boolean b25 = binarynode_i24.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST26 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array28 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i29 = sortedArrayToBST26.transform(i_array28);
        boolean b30 = binarynode_i29.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i31 = binarynode_i29.getRight();
        boolean b32 = binaryTreeEquals20.areEqualsIterative(binarynode_i24, binarynode_i29);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i33 = binarynode_i24.getLeft();
        boolean b34 = isBST14.checkIterative(binarynode_i24);
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian35 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i37 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d38 = avlTreeMedian35.find(binarynode_i37);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor39 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals40 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST41 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array43 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i44 = sortedArrayToBST41.transform(i_array43);
        boolean b45 = binarynode_i44.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST46 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array48 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i49 = sortedArrayToBST46.transform(i_array48);
        boolean b50 = binarynode_i49.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i51 = binarynode_i49.getRight();
        boolean b52 = binaryTreeEquals40.areEqualsIterative(binarynode_i44, binarynode_i49);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST53 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array55 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i56 = sortedArrayToBST53.transform(i_array55);
        boolean b57 = binarynode_i56.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST58 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array60 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i61 = sortedArrayToBST58.transform(i_array60);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode62 = lowestCommonAncestor39.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i49, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i56, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i61);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i63 = binarynode_i49.getLeft();
        double d64 = avlTreeMedian35.find(binarynode_i49);
        boolean b65 = isBST14.checkRecursive(binarynode_i49);
        binarynode_i6.setRight(binarynode_i49);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i67 = binaryTreeInOrder0.getIterative(binarynode_i49);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(binarynode_i6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(binarynode_i11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(binarynode_i18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(binarynode_i24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(binarynode_i29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(binarynode_i31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(binarynode_i33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(d38 == 10.0d);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(binarynode_i44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(binarynode_i49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(binarynode_i51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(i_array55);
        org.junit.Assert.assertNotNull(binarynode_i56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(i_array60);
        org.junit.Assert.assertNotNull(binarynode_i61);
        org.junit.Assert.assertNull(binaryNode62);
        org.junit.Assert.assertNull(binarynode_i63);
        org.junit.Assert.assertTrue(d64 == 100.0d);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(list_binarynode_i67);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        com.github.pedrovgs.problem34.DotRegularExpression dotRegularExpression0 = new com.github.pedrovgs.problem34.DotRegularExpression();
        java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "/hi!/" };
        java.lang.String[] str_array5 = dotRegularExpression0.evaluate(str_array3, "1");
        com.github.pedrovgs.problem35.AsteriskRegularExpression asteriskRegularExpression6 = new com.github.pedrovgs.problem35.AsteriskRegularExpression();
        com.github.pedrovgs.problem34.DotRegularExpression dotRegularExpression7 = new com.github.pedrovgs.problem34.DotRegularExpression();
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "/hi!/" };
        java.lang.String[] str_array12 = dotRegularExpression7.evaluate(str_array10, "1");
        java.lang.String[] str_array14 = asteriskRegularExpression6.evaluate(str_array10, "[null]");
        com.github.pedrovgs.problem34.DotRegularExpression dotRegularExpression15 = new com.github.pedrovgs.problem34.DotRegularExpression();
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "/hi!/" };
        java.lang.String[] str_array20 = dotRegularExpression15.evaluate(str_array18, "1");
        java.lang.String[] str_array22 = asteriskRegularExpression6.evaluate(str_array18, "[nul2]");
        java.lang.String[] str_array24 = dotRegularExpression0.evaluate(str_array22, "###01001");
        org.junit.Assert.assertNotNull(str_array3);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertNotNull(str_array12);
        org.junit.Assert.assertNotNull(str_array14);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertNotNull(str_array24);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
        com.github.pedrovgs.problem25.Anagrams anagrams0 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str2 = anagrams0.get("hi!");
        java.util.List<java.lang.String> list_str4 = anagrams0.get("!ih");
        org.junit.Assert.assertNotNull(list_str2);
        org.junit.Assert.assertNotNull(list_str4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        int i9 = vector_i4.indexOf((java.lang.Object) 1);
        int i11 = vector_i4.indexOf((java.lang.Object) 100.0d);
        java.lang.String str12 = vector_i4.toString();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[0, 1, 1]" + "'", str12.equals("[0, 1, 1]"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
        com.github.pedrovgs.problem48.WordSearch wordSearch0 = new com.github.pedrovgs.problem48.WordSearch();
        char[] char_array4 = new char[] { '#', 'a', ' ' };
        char[] char_array8 = new char[] { '#', 'a', ' ' };
        char[][] char_array_array9 = new char[][] { char_array4, char_array8 };
        boolean b11 = wordSearch0.contains(char_array_array9, "97");
        char[][] char_array_array12 = null;
        try {
            boolean b14 = wordSearch0.contains(char_array_array12, "/!ih/hi!/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(char_array4);
        org.junit.Assert.assertNotNull(char_array8);
        org.junit.Assert.assertNotNull(char_array_array9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces0 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces1 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces2 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array3 = new char[] {};
        replaceSpaces2.replace2(char_array3);
        replaceSpaces1.replace(char_array3);
        replaceSpaces0.replace(char_array3);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces7 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces8 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array9 = new char[] {};
        replaceSpaces8.replace2(char_array9);
        replaceSpaces7.replace(char_array9);
        replaceSpaces0.replace2(char_array9);
        org.junit.Assert.assertNotNull(char_array3);
        org.junit.Assert.assertNotNull(char_array9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        boolean b9 = vector_i4.add((java.lang.Integer) 10);
        boolean b11 = vector_i4.remove((java.lang.Object) 10L);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList12 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements13 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList14 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays15 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays16 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays15);
        java.lang.String str17 = listnode_mergeSortedArrays16.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode18 = reverseLinkedList14.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays16);
        removeListDuplicatedElements13.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode18);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i20 = getTheElementInTheMiddleOfTheList12.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode18);
        boolean b21 = vector_i4.contains((java.lang.Object) listnode_i20);
        java.util.Enumeration<java.lang.Integer> enumeration_i22 = vector_i4.elements();
        try {
            java.util.List<java.lang.Integer> list_i25 = vector_i4.subList((int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(listNode18);
        org.junit.Assert.assertNotNull(listnode_i20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(enumeration_i22);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
        com.github.pedrovgs.problem62.PalindromeList palindromeList1 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements2 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList3 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays4 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays4);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays6 = listnode_mergeSortedArrays5.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays7 = listnode_mergeSortedArrays5.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i9 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i10 = null;
        binarynode_i9.setRight(binarynode_i10);
        boolean b12 = listnode_mergeSortedArrays5.equals((java.lang.Object) binarynode_i10);
        com.github.pedrovgs.linkedlist.ListNode listNode13 = reverseLinkedList3.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays5);
        removeListDuplicatedElements2.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode13);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements15 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList16 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays17 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays18 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays17);
        java.lang.String str19 = listnode_mergeSortedArrays18.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode20 = reverseLinkedList16.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays18);
        removeListDuplicatedElements15.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode20);
        removeListDuplicatedElements2.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode20);
        boolean b23 = palindromeList1.checkReversing(listNode20);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList24 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays25 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays26 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays25);
        java.lang.String str27 = listnode_mergeSortedArrays26.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i28 = reverseLinkedList24.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays26);
        com.github.pedrovgs.problem62.PalindromeList palindromeList29 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList30 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays31 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays32 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays31);
        java.lang.String str33 = listnode_mergeSortedArrays32.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i34 = reverseLinkedList30.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays32);
        boolean b35 = palindromeList29.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays32);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays36 = listnode_mergeSortedArrays32.getNext();
        listnode_mergeSortedArrays26.setNext(listnode_mergeSortedArrays32);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays38 = listnode_mergeSortedArrays26.getData();
        boolean b39 = palindromeList1.checkReversing((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays26);
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode41 = findKthElement0.find((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays26, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays6);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(listNode13);
        org.junit.Assert.assertNotNull(listNode20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(listnode_i28);
        org.junit.Assert.assertNotNull(listnode_i34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays36);
        org.junit.Assert.assertNotNull(mergeSortedArrays38);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.lang.Object obj8 = vector_i4.clone();
        vector_i4.trimToSize();
        vector_i4.clear();
        try {
            java.lang.Integer i11 = vector_i4.firstElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        com.github.pedrovgs.problem27.ReverseSentence reverseSentence0 = new com.github.pedrovgs.problem27.ReverseSentence();
        java.lang.String str2 = reverseSentence0.reverse("97");
        java.lang.String str4 = reverseSentence0.reverse("[3]");
        java.lang.String str6 = reverseSentence0.reverse("hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97" + "'", str2.equals("97"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[3]" + "'", str4.equals("[3]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.stream.Stream<java.lang.Integer> stream_i8 = vector_i4.parallelStream();
        try {
            vector_i4.insertElementAt((java.lang.Integer) 2, (-52000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(stream_i8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        com.github.pedrovgs.problem50.UniqueChars uniqueChars0 = new com.github.pedrovgs.problem50.UniqueChars();
        boolean b2 = uniqueChars0.evaluate2("/hi!/");
        boolean b4 = uniqueChars0.evaluate2("35");
        boolean b6 = uniqueChars0.evaluate2("/32/-52/7/");
        boolean b8 = uniqueChars0.evaluate("[]");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        java.lang.Integer[] i_array39 = new java.lang.Integer[] { 24, (-24), 28, (-5200), 10, 28, (-5200), 27, 28, 52002, (-24), (-1), 49, (-97), (-14040), 11427, (-6), 30, (-97), 18, 32, 6, 2147483647, 3628800, 720, 4, (-52000), 30, 29, (-52), 9, (-52), (-1), 112197661, 1484783616, 28, (-52), 1241513983, 1484783616 };
        java.util.Vector<java.lang.Integer> vector_i40 = new java.util.Vector<java.lang.Integer>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i40, i_array39);
        try {
            java.util.ListIterator<java.lang.Integer> listiterator_i43 = vector_i40.listIterator(107);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertTrue(b41 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
        com.github.pedrovgs.problem62.PalindromeList palindromeList0 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem62.PalindromeList palindromeList1 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList2 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i6 = reverseLinkedList2.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        boolean b7 = palindromeList1.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        boolean b8 = palindromeList0.checkReversing((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        com.github.pedrovgs.problem72.FindTheMissingNumber findTheMissingNumber9 = new com.github.pedrovgs.problem72.FindTheMissingNumber();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem72.FindTheMissingNumber> listnode_findTheMissingNumber10 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem72.FindTheMissingNumber>(findTheMissingNumber9);
        boolean b11 = palindromeList0.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_findTheMissingNumber10);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList12 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays13 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays14 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays13);
        java.lang.String str15 = listnode_mergeSortedArrays14.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode16 = reverseLinkedList12.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays14);
        com.github.pedrovgs.problem18.IsBST isBST17 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST18 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array20 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i21 = sortedArrayToBST18.transform(i_array20);
        boolean b22 = isBST17.checkRecursive(binarynode_i21);
        boolean b23 = listNode16.equals((java.lang.Object) binarynode_i21);
        boolean b24 = palindromeList0.checkIterative(listNode16);
        org.junit.Assert.assertNotNull(listnode_i6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(listNode16);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(binarynode_i21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList0 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        java.lang.String str3 = listnode_mergeSortedArrays2.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i4 = reverseLinkedList0.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList5 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays6 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays7 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays6);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays8 = listnode_mergeSortedArrays7.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays9 = listnode_mergeSortedArrays7.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i11 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i12 = null;
        binarynode_i11.setRight(binarynode_i12);
        boolean b14 = listnode_mergeSortedArrays7.equals((java.lang.Object) binarynode_i12);
        com.github.pedrovgs.linkedlist.ListNode listNode15 = reverseLinkedList5.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays7);
        com.github.pedrovgs.linkedlist.ListNode listNode16 = reverseLinkedList0.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays7);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode17 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList18 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays19 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays20 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays19);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays21 = listnode_mergeSortedArrays20.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays22 = listnode_mergeSortedArrays20.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i24 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i25 = null;
        binarynode_i24.setRight(binarynode_i25);
        boolean b27 = listnode_mergeSortedArrays20.equals((java.lang.Object) binarynode_i25);
        com.github.pedrovgs.linkedlist.ListNode listNode28 = reverseLinkedList18.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays20);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode29 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays30 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays31 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays30);
        java.lang.String str32 = listnode_mergeSortedArrays31.toString();
        deleteListNode29.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays31);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays34 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays35 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays34);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers36 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b37 = listnode_mergeSortedArrays35.equals((java.lang.Object) mergeBinaryNumbers36);
        deleteListNode29.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays35);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i39 = reverseLinkedList18.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays35);
        deleteListNode17.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays35);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList41 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays42 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays43 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays42);
        java.lang.String str44 = listnode_mergeSortedArrays43.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode45 = reverseLinkedList41.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays43);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays46 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays47 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays46);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays48 = listnode_mergeSortedArrays47.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays49 = listnode_mergeSortedArrays47.getNext();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays50 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort51 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray52 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array55 = new int[] { (byte) 1, (byte) 10 };
        splitArray52.splitSwappingPartition(i_array55);
        selectionSort51.sort(i_array55);
        com.github.pedrovgs.problem8.SplitArray splitArray58 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array61 = new int[] { (byte) 1, (byte) 10 };
        splitArray58.splitSwappingPartition(i_array61);
        int[] i_array69 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray58.splitSwappingRecursive(i_array69);
        int[] i_array71 = mergeSortedArrays50.merge(i_array55, i_array69);
        listnode_mergeSortedArrays47.setData(mergeSortedArrays50);
        listNode45.setData(mergeSortedArrays50);
        listnode_mergeSortedArrays35.setData(mergeSortedArrays50);
        listnode_mergeSortedArrays7.setData(mergeSortedArrays50);
        org.junit.Assert.assertNotNull(listnode_i4);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays8);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(listNode15);
        org.junit.Assert.assertNotNull(listNode16);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays21);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays22);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(listNode28);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(listnode_i39);
        org.junit.Assert.assertNotNull(listNode45);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays48);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays49);
        org.junit.Assert.assertNotNull(i_array55);
        org.junit.Assert.assertNotNull(i_array61);
        org.junit.Assert.assertNotNull(i_array69);
        org.junit.Assert.assertNotNull(i_array71);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel0 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem18.IsBST isBST1 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST2 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = sortedArrayToBST2.transform(i_array4);
        boolean b6 = isBST1.checkRecursive(binarynode_i5);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode7 = binaryTreeByLevel0.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i5);
        com.github.pedrovgs.problem18.IsBST isBST8 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem46.BinaryTreeSerialization binaryTreeSerialization9 = new com.github.pedrovgs.problem46.BinaryTreeSerialization();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST10 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array12 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i13 = sortedArrayToBST10.transform(i_array12);
        boolean b14 = binarynode_i13.hasRight();
        java.lang.Integer i15 = binarynode_i13.getData();
        java.lang.String str16 = binaryTreeSerialization9.serialize((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i13);
        boolean b17 = isBST8.checkIterative(binarynode_i13);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode18 = binaryTreeByLevel0.getWithoutAdditionalDataStructures((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i13);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i20 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        java.lang.String str21 = binarynode_i20.toString();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode22 = binaryTreeByLevel0.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i20);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(binarynode_i5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(list_binaryNode7);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(binarynode_i13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100 + "'", i15.equals(100));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "100##" + "'", str16.equals("100##"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(list_binaryNode18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "BinaryNode{data=10}" + "'", str21.equals("BinaryNode{data=10}"));
        org.junit.Assert.assertNotNull(list_binaryNode22);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
        com.github.pedrovgs.problem70.ReverseOrderOfBinaryNumber reverseOrderOfBinaryNumber0 = new com.github.pedrovgs.problem70.ReverseOrderOfBinaryNumber();
        int i2 = reverseOrderOfBinaryNumber0.reverse(10);
        int i4 = reverseOrderOfBinaryNumber0.reverse(11427);
        int i6 = reverseOrderOfBinaryNumber0.reverse(49);
        org.junit.Assert.assertTrue(i2 == 5);
        org.junit.Assert.assertTrue(i4 == 12621);
        org.junit.Assert.assertTrue(i6 == 35);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.lang.Object obj8 = vector_i4.clone();
        java.lang.Integer i9 = vector_i4.firstElement();
        java.util.ListIterator<java.lang.Integer> listiterator_i10 = vector_i4.listIterator();
        try {
            java.lang.Integer i12 = vector_i4.remove(72);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0 + "'", i9.equals(0));
        org.junit.Assert.assertNotNull(listiterator_i10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays0 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays0);
        java.lang.String str2 = listnode_mergeSortedArrays1.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays6 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays4.setData(mergeSortedArrays6);
        listnode_mergeSortedArrays1.setNext(listnode_mergeSortedArrays4);
        java.lang.String str9 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays10 = listnode_mergeSortedArrays4.getData();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays11 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays12 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays11);
        com.github.pedrovgs.problem8.SplitArray splitArray13 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray14 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array17 = new int[] { (byte) 1, (byte) 10 };
        splitArray14.splitSwappingPartition(i_array17);
        splitArray13.splitSwappingRecursive(i_array17);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral20 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array21 = new int[][] {};
        int[] i_array22 = goThroughMatrixInSpiral20.go(i_array_array21);
        splitArray13.splitSwappingRecursive(i_array22);
        com.github.pedrovgs.problem80.QuickSort quickSort24 = new com.github.pedrovgs.problem80.QuickSort();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays25 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort26 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray27 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array30 = new int[] { (byte) 1, (byte) 10 };
        splitArray27.splitSwappingPartition(i_array30);
        selectionSort26.sort(i_array30);
        com.github.pedrovgs.problem8.SplitArray splitArray33 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array36 = new int[] { (byte) 1, (byte) 10 };
        splitArray33.splitSwappingPartition(i_array36);
        int[] i_array44 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray33.splitSwappingRecursive(i_array44);
        int[] i_array46 = mergeSortedArrays25.merge(i_array30, i_array44);
        quickSort24.sort(i_array30);
        int[] i_array48 = mergeSortedArrays11.merge(i_array22, i_array30);
        com.github.pedrovgs.problem28.FindSums findSums49 = new com.github.pedrovgs.problem28.FindSums();
        com.github.pedrovgs.problem8.SplitArray splitArray50 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray51 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array54 = new int[] { (byte) 1, (byte) 10 };
        splitArray51.splitSwappingPartition(i_array54);
        splitArray50.splitSwappingRecursive(i_array54);
        java.util.List<com.github.pedrovgs.pair.Pair<java.lang.Integer, java.lang.Integer>> list_pair_i_i58 = findSums49.find(i_array54, 0);
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_59 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_59.push((int) (byte) 10);
        int i62 = stack1_59.getMin();
        int i63 = stack1_59.getMin();
        com.github.pedrovgs.problem75.SelectionSort selectionSort64 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray65 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array68 = new int[] { (byte) 1, (byte) 10 };
        splitArray65.splitSwappingPartition(i_array68);
        selectionSort64.sort(i_array68);
        int i71 = stack1_59.search((java.lang.Object) i_array68);
        java.util.List<com.github.pedrovgs.pair.Pair<java.lang.Integer, java.lang.Integer>> list_pair_i_i73 = findSums49.find(i_array68, (int) (byte) 1);
        int[] i_array74 = mergeSortedArrays10.merge(i_array48, i_array68);
        org.junit.Assert.assertNotNull(mergeSortedArrays10);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array_array21);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(list_pair_i_i58);
        org.junit.Assert.assertTrue(i62 == 10);
        org.junit.Assert.assertTrue(i63 == 10);
        org.junit.Assert.assertNotNull(i_array68);
        org.junit.Assert.assertTrue(i71 == (-1));
        org.junit.Assert.assertNotNull(list_pair_i_i73);
        org.junit.Assert.assertNotNull(i_array74);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        vector_i5.trimToSize();
        boolean b11 = vector_i5.isEmpty();
        vector_i5.trimToSize();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(10);
        int i4 = factorial0.getTailRecursive((int) (short) 10);
        int i6 = factorial0.getTailRecursive((int) (short) 1);
        try {
            int i8 = factorial0.getTailRecursive((-14040));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 3628800);
        org.junit.Assert.assertTrue(i4 == 3628800);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays0 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays0);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = listnode_mergeSortedArrays1.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = listnode_mergeSortedArrays1.getNext();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays4 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort5 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray6 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array9 = new int[] { (byte) 1, (byte) 10 };
        splitArray6.splitSwappingPartition(i_array9);
        selectionSort5.sort(i_array9);
        com.github.pedrovgs.problem8.SplitArray splitArray12 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array15 = new int[] { (byte) 1, (byte) 10 };
        splitArray12.splitSwappingPartition(i_array15);
        int[] i_array23 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray12.splitSwappingRecursive(i_array23);
        int[] i_array25 = mergeSortedArrays4.merge(i_array9, i_array23);
        listnode_mergeSortedArrays1.setData(mergeSortedArrays4);
        com.github.pedrovgs.problem39.MultiplyArrayElements multiplyArrayElements27 = new com.github.pedrovgs.problem39.MultiplyArrayElements();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral28 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array29 = new int[][] {};
        int[] i_array30 = goThroughMatrixInSpiral28.go(i_array_array29);
        int[] i_array31 = multiplyArrayElements27.multiply(i_array30);
        int[] i_array32 = null;
        try {
            int[] i_array33 = mergeSortedArrays4.merge(i_array31, i_array32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays2);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays3);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array_array29);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(i_array31);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder0 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian1 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i3 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d4 = avlTreeMedian1.find(binarynode_i3);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode5 = binaryTreePreOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i3);
        com.github.pedrovgs.problem18.IsBST isBST6 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST7 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array9 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i10 = sortedArrayToBST7.transform(i_array9);
        boolean b11 = isBST6.checkRecursive(binarynode_i10);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode12 = binaryTreePreOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i10);
        com.github.pedrovgs.problem38.PathToEveryLeaf pathToEveryLeaf13 = new com.github.pedrovgs.problem38.PathToEveryLeaf();
        com.github.pedrovgs.binarytree.BinaryNode<com.github.pedrovgs.problem38.PathToEveryLeaf> binarynode_pathToEveryLeaf14 = new com.github.pedrovgs.binarytree.BinaryNode<com.github.pedrovgs.problem38.PathToEveryLeaf>(pathToEveryLeaf13);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST15 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array17 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i18 = sortedArrayToBST15.transform(i_array17);
        java.lang.String str19 = binarynode_i18.toString();
        java.util.List<java.util.List<com.github.pedrovgs.binarytree.BinaryNode>> list_list_binaryNode20 = pathToEveryLeaf13.calculate(binarynode_i18);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode21 = binaryTreePreOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i18);
        com.github.pedrovgs.problem16.BinaryTreePostOrder binaryTreePostOrder22 = new com.github.pedrovgs.problem16.BinaryTreePostOrder();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals23 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem18.IsBST isBST24 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST25 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array27 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i28 = sortedArrayToBST25.transform(i_array27);
        boolean b29 = isBST24.checkRecursive(binarynode_i28);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST30 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array32 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i33 = sortedArrayToBST30.transform(i_array32);
        boolean b34 = binarynode_i33.hasRight();
        boolean b35 = binaryTreeEquals23.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i28, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i33);
        com.github.pedrovgs.problem18.IsBST isBST36 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST37 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array39 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i40 = sortedArrayToBST37.transform(i_array39);
        boolean b41 = isBST36.checkRecursive(binarynode_i40);
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
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i55 = binarynode_i46.getLeft();
        boolean b56 = isBST36.checkIterative(binarynode_i46);
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian57 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i59 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d60 = avlTreeMedian57.find(binarynode_i59);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor61 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals62 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST63 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array65 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i66 = sortedArrayToBST63.transform(i_array65);
        boolean b67 = binarynode_i66.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST68 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array70 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i71 = sortedArrayToBST68.transform(i_array70);
        boolean b72 = binarynode_i71.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i73 = binarynode_i71.getRight();
        boolean b74 = binaryTreeEquals62.areEqualsIterative(binarynode_i66, binarynode_i71);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST75 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array77 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i78 = sortedArrayToBST75.transform(i_array77);
        boolean b79 = binarynode_i78.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST80 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array82 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i83 = sortedArrayToBST80.transform(i_array82);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode84 = lowestCommonAncestor61.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i71, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i78, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i83);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i85 = binarynode_i71.getLeft();
        double d86 = avlTreeMedian57.find(binarynode_i71);
        boolean b87 = isBST36.checkRecursive(binarynode_i71);
        binarynode_i28.setRight(binarynode_i71);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode89 = binaryTreePostOrder22.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i71);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode90 = binaryTreePreOrder0.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i71);
        org.junit.Assert.assertTrue(d4 == 10.0d);
        org.junit.Assert.assertNotNull(list_binaryNode5);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(binarynode_i10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(list_binaryNode12);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(binarynode_i18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "BinaryNode{data=100}" + "'", str19.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertNotNull(list_list_binaryNode20);
        org.junit.Assert.assertNotNull(list_binaryNode21);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(binarynode_i28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(binarynode_i33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(binarynode_i40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(binarynode_i46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(binarynode_i51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(binarynode_i53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNull(binarynode_i55);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(d60 == 10.0d);
        org.junit.Assert.assertNotNull(i_array65);
        org.junit.Assert.assertNotNull(binarynode_i66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(i_array70);
        org.junit.Assert.assertNotNull(binarynode_i71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(binarynode_i73);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(binarynode_i78);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(i_array82);
        org.junit.Assert.assertNotNull(binarynode_i83);
        org.junit.Assert.assertNull(binaryNode84);
        org.junit.Assert.assertNull(binarynode_i85);
        org.junit.Assert.assertTrue(d86 == 100.0d);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertNotNull(list_binaryNode89);
        org.junit.Assert.assertNotNull(list_binaryNode90);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
        com.github.pedrovgs.problem2.VectorScalarProduct vectorScalarProduct0 = new com.github.pedrovgs.problem2.VectorScalarProduct();
        com.github.pedrovgs.problem8.SplitArray splitArray1 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array4 = new int[] { (byte) 1, (byte) 10 };
        splitArray1.splitSwappingPartition(i_array4);
        com.github.pedrovgs.problem2.Vector vector6 = new com.github.pedrovgs.problem2.Vector(i_array4);
        com.github.pedrovgs.problem8.SplitArray splitArray7 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array10 = new int[] { (byte) 1, (byte) 10 };
        splitArray7.splitSwappingPartition(i_array10);
        com.github.pedrovgs.problem2.Vector vector12 = new com.github.pedrovgs.problem2.Vector(i_array10);
        int i13 = vectorScalarProduct0.calculateScalarProduct(vector6, vector12);
        try {
            int i15 = vector12.getAt(11427);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertTrue(i13 == 101);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
        com.github.pedrovgs.problem18.IsBST isBST0 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem46.BinaryTreeSerialization binaryTreeSerialization1 = new com.github.pedrovgs.problem46.BinaryTreeSerialization();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST2 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = sortedArrayToBST2.transform(i_array4);
        boolean b6 = binarynode_i5.hasRight();
        java.lang.Integer i7 = binarynode_i5.getData();
        java.lang.String str8 = binaryTreeSerialization1.serialize((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i5);
        boolean b9 = isBST0.checkIterative(binarynode_i5);
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder10 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian11 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i13 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d14 = avlTreeMedian11.find(binarynode_i13);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode15 = binaryTreePreOrder10.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i13);
        com.github.pedrovgs.problem18.IsBST isBST16 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST17 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array19 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i20 = sortedArrayToBST17.transform(i_array19);
        boolean b21 = isBST16.checkRecursive(binarynode_i20);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode22 = binaryTreePreOrder10.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i20);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals23 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem18.IsBST isBST24 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST25 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array27 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i28 = sortedArrayToBST25.transform(i_array27);
        boolean b29 = isBST24.checkRecursive(binarynode_i28);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST30 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array32 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i33 = sortedArrayToBST30.transform(i_array32);
        boolean b34 = binarynode_i33.hasRight();
        boolean b35 = binaryTreeEquals23.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i28, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i33);
        com.github.pedrovgs.problem18.IsBST isBST36 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST37 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array39 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i40 = sortedArrayToBST37.transform(i_array39);
        boolean b41 = isBST36.checkRecursive(binarynode_i40);
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
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i55 = binarynode_i46.getLeft();
        boolean b56 = isBST36.checkIterative(binarynode_i46);
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian57 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i59 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d60 = avlTreeMedian57.find(binarynode_i59);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor61 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals62 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST63 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array65 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i66 = sortedArrayToBST63.transform(i_array65);
        boolean b67 = binarynode_i66.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST68 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array70 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i71 = sortedArrayToBST68.transform(i_array70);
        boolean b72 = binarynode_i71.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i73 = binarynode_i71.getRight();
        boolean b74 = binaryTreeEquals62.areEqualsIterative(binarynode_i66, binarynode_i71);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST75 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array77 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i78 = sortedArrayToBST75.transform(i_array77);
        boolean b79 = binarynode_i78.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST80 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array82 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i83 = sortedArrayToBST80.transform(i_array82);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode84 = lowestCommonAncestor61.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i71, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i78, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i83);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i85 = binarynode_i71.getLeft();
        double d86 = avlTreeMedian57.find(binarynode_i71);
        boolean b87 = isBST36.checkRecursive(binarynode_i71);
        binarynode_i28.setRight(binarynode_i71);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode89 = binaryTreePreOrder10.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i71);
        boolean b90 = isBST0.checkIterative(binarynode_i71);
        java.lang.Integer i91 = binarynode_i71.getData();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(binarynode_i5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100 + "'", i7.equals(100));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "100##" + "'", str8.equals("100##"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(d14 == 10.0d);
        org.junit.Assert.assertNotNull(list_binaryNode15);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(binarynode_i20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(list_binaryNode22);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(binarynode_i28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(binarynode_i33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(binarynode_i40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(binarynode_i46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(binarynode_i51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(binarynode_i53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNull(binarynode_i55);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(d60 == 10.0d);
        org.junit.Assert.assertNotNull(i_array65);
        org.junit.Assert.assertNotNull(binarynode_i66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(i_array70);
        org.junit.Assert.assertNotNull(binarynode_i71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(binarynode_i73);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(binarynode_i78);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(i_array82);
        org.junit.Assert.assertNotNull(binarynode_i83);
        org.junit.Assert.assertNull(binaryNode84);
        org.junit.Assert.assertNull(binarynode_i85);
        org.junit.Assert.assertTrue(d86 == 100.0d);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertNotNull(list_binaryNode89);
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertTrue("'" + i91 + "' != '" + 100 + "'", i91.equals(100));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        com.github.pedrovgs.problem50.UniqueChars uniqueChars0 = new com.github.pedrovgs.problem50.UniqueChars();
        boolean b2 = uniqueChars0.evaluate2("/hi!/");
        boolean b4 = uniqueChars0.evaluate2("35");
        boolean b6 = uniqueChars0.evaluate2("3");
        boolean b8 = uniqueChars0.evaluate2("[0, 1, 1, -1]");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
        com.github.pedrovgs.problem50.UniqueChars uniqueChars0 = new com.github.pedrovgs.problem50.UniqueChars();
        boolean b2 = uniqueChars0.evaluate2("/hi!/");
        boolean b4 = uniqueChars0.evaluate2("35");
        boolean b6 = uniqueChars0.evaluate("/32/-52/7/");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        try {
            java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnPowersOfTwo("/!ih/hi!/", "BinaryNode{data=10}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
        com.github.pedrovgs.problem53.CompressString compressString0 = new com.github.pedrovgs.problem53.CompressString();
        java.lang.String str2 = compressString0.compressRecursive("97");
        java.lang.String str4 = compressString0.compressAlternativeApproach("hi!");
        java.lang.String str6 = compressString0.compress("[]");
        java.lang.String str8 = compressString0.compressAlternativeApproach("10");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97" + "'", str2.equals("97"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        com.github.pedrovgs.problem66.TreeToListByLevel treeToListByLevel0 = new com.github.pedrovgs.problem66.TreeToListByLevel();
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder1 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian2 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i4 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d5 = avlTreeMedian2.find(binarynode_i4);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode6 = binaryTreePreOrder1.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i4);
        com.github.pedrovgs.problem18.IsBST isBST7 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST8 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array10 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i11 = sortedArrayToBST8.transform(i_array10);
        boolean b12 = isBST7.checkRecursive(binarynode_i11);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode13 = binaryTreePreOrder1.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i11);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals14 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem18.IsBST isBST15 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST16 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array18 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i19 = sortedArrayToBST16.transform(i_array18);
        boolean b20 = isBST15.checkRecursive(binarynode_i19);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST21 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array23 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i24 = sortedArrayToBST21.transform(i_array23);
        boolean b25 = binarynode_i24.hasRight();
        boolean b26 = binaryTreeEquals14.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i19, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i24);
        com.github.pedrovgs.problem18.IsBST isBST27 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST28 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array30 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i31 = sortedArrayToBST28.transform(i_array30);
        boolean b32 = isBST27.checkRecursive(binarynode_i31);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals33 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST34 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array36 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i37 = sortedArrayToBST34.transform(i_array36);
        boolean b38 = binarynode_i37.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST39 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array41 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i42 = sortedArrayToBST39.transform(i_array41);
        boolean b43 = binarynode_i42.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i44 = binarynode_i42.getRight();
        boolean b45 = binaryTreeEquals33.areEqualsIterative(binarynode_i37, binarynode_i42);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i46 = binarynode_i37.getLeft();
        boolean b47 = isBST27.checkIterative(binarynode_i37);
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian48 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i50 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d51 = avlTreeMedian48.find(binarynode_i50);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor52 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals53 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST54 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array56 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i57 = sortedArrayToBST54.transform(i_array56);
        boolean b58 = binarynode_i57.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST59 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array61 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i62 = sortedArrayToBST59.transform(i_array61);
        boolean b63 = binarynode_i62.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i64 = binarynode_i62.getRight();
        boolean b65 = binaryTreeEquals53.areEqualsIterative(binarynode_i57, binarynode_i62);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST66 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array68 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i69 = sortedArrayToBST66.transform(i_array68);
        boolean b70 = binarynode_i69.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST71 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array73 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i74 = sortedArrayToBST71.transform(i_array73);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode75 = lowestCommonAncestor52.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i62, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i69, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i74);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i76 = binarynode_i62.getLeft();
        double d77 = avlTreeMedian48.find(binarynode_i62);
        boolean b78 = isBST27.checkRecursive(binarynode_i62);
        binarynode_i19.setRight(binarynode_i62);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode80 = binaryTreePreOrder1.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i62);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode81 = treeToListByLevel0.transform((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i62);
        com.github.pedrovgs.problem18.IsBST isBST82 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST83 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array85 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i86 = sortedArrayToBST83.transform(i_array85);
        boolean b87 = isBST82.checkRecursive(binarynode_i86);
        boolean b88 = binarynode_i86.hasRight();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode89 = treeToListByLevel0.transform((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i86);
        org.junit.Assert.assertTrue(d5 == 10.0d);
        org.junit.Assert.assertNotNull(list_binaryNode6);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(binarynode_i11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(list_binaryNode13);
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertNotNull(binarynode_i19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(binarynode_i24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(binarynode_i31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(binarynode_i37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(binarynode_i42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(binarynode_i44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNull(binarynode_i46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(d51 == 10.0d);
        org.junit.Assert.assertNotNull(i_array56);
        org.junit.Assert.assertNotNull(binarynode_i57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(i_array61);
        org.junit.Assert.assertNotNull(binarynode_i62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(binarynode_i64);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(i_array68);
        org.junit.Assert.assertNotNull(binarynode_i69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(i_array73);
        org.junit.Assert.assertNotNull(binarynode_i74);
        org.junit.Assert.assertNull(binaryNode75);
        org.junit.Assert.assertNull(binarynode_i76);
        org.junit.Assert.assertTrue(d77 == 100.0d);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNotNull(list_binaryNode80);
        org.junit.Assert.assertNotNull(list_binaryNode81);
        org.junit.Assert.assertNotNull(i_array85);
        org.junit.Assert.assertNotNull(binarynode_i86);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(list_binaryNode89);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        com.github.pedrovgs.problem50.UniqueChars uniqueChars0 = new com.github.pedrovgs.problem50.UniqueChars();
        boolean b2 = uniqueChars0.evaluate2("/hi!/");
        boolean b4 = uniqueChars0.evaluate2("BinaryNode{data=100}");
        boolean b6 = uniqueChars0.evaluate2("[");
        boolean b8 = uniqueChars0.evaluate("");
        boolean b10 = uniqueChars0.evaluate("/!ih/");
        boolean b12 = uniqueChars0.evaluate("35");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push(100);
        java.lang.Object[] obj_array3 = stack2_0.toArray();
        java.util.stream.Stream<java.lang.Integer> stream_i4 = stack2_0.parallelStream();
        int i5 = stack2_0.getMin();
        stack2_0.push(720);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(stream_i4);
        org.junit.Assert.assertTrue(i5 == 100);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode0 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        java.lang.String str3 = listnode_mergeSortedArrays2.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays4 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays4);
        java.lang.String str6 = listnode_mergeSortedArrays5.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays7 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays5.setData(mergeSortedArrays7);
        listnode_mergeSortedArrays2.setNext(listnode_mergeSortedArrays5);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays10 = listnode_mergeSortedArrays2.getNext();
        com.github.pedrovgs.problem62.PalindromeList palindromeList11 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList12 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays13 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays14 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays13);
        java.lang.String str15 = listnode_mergeSortedArrays14.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i16 = reverseLinkedList12.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays14);
        boolean b17 = palindromeList11.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays14);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays18 = listnode_mergeSortedArrays14.getNext();
        listnode_mergeSortedArrays10.setNext(listnode_mergeSortedArrays14);
        deleteListNode0.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays14);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList21 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays22 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays23 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays22);
        java.lang.String str24 = listnode_mergeSortedArrays23.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i25 = reverseLinkedList21.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays23);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList26 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays27 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays28 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays27);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays29 = listnode_mergeSortedArrays28.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays30 = listnode_mergeSortedArrays28.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i32 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i33 = null;
        binarynode_i32.setRight(binarynode_i33);
        boolean b35 = listnode_mergeSortedArrays28.equals((java.lang.Object) binarynode_i33);
        com.github.pedrovgs.linkedlist.ListNode listNode36 = reverseLinkedList26.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays28);
        com.github.pedrovgs.linkedlist.ListNode listNode37 = reverseLinkedList21.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays28);
        deleteListNode0.delete(listNode37);
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays10);
        org.junit.Assert.assertNotNull(listnode_i16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays18);
        org.junit.Assert.assertNotNull(listnode_i25);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays29);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays30);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(listNode36);
        org.junit.Assert.assertNotNull(listNode37);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
        com.github.pedrovgs.problem68.IsEven isEven0 = new com.github.pedrovgs.problem68.IsEven();
        boolean b2 = isEven0.check(1484783616);
        boolean b4 = isEven0.check((int) (byte) -1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        com.github.pedrovgs.problem33.SimpleRegularExpression simpleRegularExpression0 = new com.github.pedrovgs.problem33.SimpleRegularExpression();
        boolean b3 = simpleRegularExpression0.evaluate("1", "97");
        boolean b6 = simpleRegularExpression0.evaluate("[", "[]");
        boolean b9 = simpleRegularExpression0.evaluate("/23/[/##001/", "0");
        boolean b12 = simpleRegularExpression0.evaluate("97", "[nul2]");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(10);
        int i4 = factorial0.getTailRecursive((int) (short) 10);
        int i6 = factorial0.getTailRecursive((int) (short) 10);
        int i8 = factorial0.getRecursive((int) (byte) 10);
        org.junit.Assert.assertTrue(i2 == 3628800);
        org.junit.Assert.assertTrue(i4 == 3628800);
        org.junit.Assert.assertTrue(i6 == 3628800);
        org.junit.Assert.assertTrue(i8 == 3628800);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
        com.github.pedrovgs.problem37.PathCalculator pathCalculator0 = new com.github.pedrovgs.problem37.PathCalculator();
        java.lang.String str4 = pathCalculator0.calculate("/", "97", "10010###");
        java.lang.String str8 = pathCalculator0.calculate("]1-[", "]1- ,1 ,1 ,0[", "01");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "/97/10010###/" + "'", str4.equals("/97/10010###/"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/]1-[/]1- ,1 ,1 ,0[/01/" + "'", str8.equals("/]1-[/]1- ,1 ,1 ,0[/01/"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        com.github.pedrovgs.problem8.SplitArray splitArray0 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array3 = new int[] { (byte) 1, (byte) 10 };
        splitArray0.splitSwappingPartition(i_array3);
        int[] i_array11 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray0.splitSwappingRecursive(i_array11);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays13 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort14 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray15 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array18 = new int[] { (byte) 1, (byte) 10 };
        splitArray15.splitSwappingPartition(i_array18);
        selectionSort14.sort(i_array18);
        com.github.pedrovgs.problem8.SplitArray splitArray21 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array24 = new int[] { (byte) 1, (byte) 10 };
        splitArray21.splitSwappingPartition(i_array24);
        int[] i_array32 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray21.splitSwappingRecursive(i_array32);
        int[] i_array34 = mergeSortedArrays13.merge(i_array18, i_array32);
        splitArray0.splitSwappingIterative(i_array18);
        com.github.pedrovgs.problem75.SelectionSort selectionSort36 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray37 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array40 = new int[] { (byte) 1, (byte) 10 };
        splitArray37.splitSwappingPartition(i_array40);
        selectionSort36.sort(i_array40);
        com.github.pedrovgs.problem76.InsertionSort insertionSort43 = new com.github.pedrovgs.problem76.InsertionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray44 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays45 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays46 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays45);
        com.github.pedrovgs.problem8.SplitArray splitArray47 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array50 = new int[] { (byte) 1, (byte) 10 };
        splitArray47.splitSwappingPartition(i_array50);
        int[] i_array58 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray47.splitSwappingRecursive(i_array58);
        com.github.pedrovgs.problem8.SplitArray splitArray60 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array63 = new int[] { (byte) 1, (byte) 10 };
        splitArray60.splitSwappingPartition(i_array63);
        int[] i_array71 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray60.splitSwappingRecursive(i_array71);
        int[] i_array73 = mergeSortedArrays45.merge(i_array58, i_array71);
        splitArray44.splitSwappingIterative(i_array71);
        insertionSort43.sort(i_array71);
        selectionSort36.sort(i_array71);
        com.github.pedrovgs.problem8.SplitArray splitArray77 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray78 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array81 = new int[] { (byte) 1, (byte) 10 };
        splitArray78.splitSwappingPartition(i_array81);
        splitArray77.splitSwappingRecursive(i_array81);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral84 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array85 = new int[][] {};
        int[] i_array86 = goThroughMatrixInSpiral84.go(i_array_array85);
        splitArray77.splitSwappingRecursive(i_array86);
        selectionSort36.sort(i_array86);
        splitArray0.splitSwappingIterative(i_array86);
        com.github.pedrovgs.problem2.Vector vector90 = new com.github.pedrovgs.problem2.Vector(i_array86);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertNotNull(i_array71);
        org.junit.Assert.assertNotNull(i_array73);
        org.junit.Assert.assertNotNull(i_array81);
        org.junit.Assert.assertNotNull(i_array_array85);
        org.junit.Assert.assertNotNull(i_array86);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
        com.github.pedrovgs.problem51.ReverseString reverseString0 = new com.github.pedrovgs.problem51.ReverseString();
        java.lang.String str2 = reverseString0.reverseRecursive("/hi!/");
        java.lang.String str4 = reverseString0.reverseRecursive("100");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/!ih/" + "'", str2.equals("/!ih/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "001" + "'", str4.equals("001"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
        com.github.pedrovgs.problem50.UniqueChars uniqueChars0 = new com.github.pedrovgs.problem50.UniqueChars();
        boolean b2 = uniqueChars0.evaluate("32");
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
        com.github.pedrovgs.problem54.RotateMatrix rotateMatrix0 = new com.github.pedrovgs.problem54.RotateMatrix();
        int[] i_array4 = new int[] { (byte) 100, (byte) 100, 49 };
        int[][] i_array_array5 = new int[][] { i_array4 };
        try {
            rotateMatrix0.rotate(i_array_array5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(i_array_array5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(10);
        int i4 = factorial0.getTailRecursive((int) (short) 10);
        int i6 = factorial0.getTailRecursive((int) (short) 1);
        int i8 = factorial0.getRecursive(56);
        org.junit.Assert.assertTrue(i2 == 3628800);
        org.junit.Assert.assertTrue(i4 == 3628800);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
        com.github.pedrovgs.problem50.UniqueChars uniqueChars0 = new com.github.pedrovgs.problem50.UniqueChars();
        boolean b2 = uniqueChars0.evaluate2("/hi!/");
        boolean b4 = uniqueChars0.evaluate2("35");
        boolean b6 = uniqueChars0.evaluate("7");
        boolean b8 = uniqueChars0.evaluate("/32/-52/7/");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
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
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode11 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays12 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays13 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays12);
        java.lang.String str14 = listnode_mergeSortedArrays13.toString();
        deleteListNode11.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays13);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays16 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays17 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays16);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers18 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b19 = listnode_mergeSortedArrays17.equals((java.lang.Object) mergeBinaryNumbers18);
        deleteListNode11.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays17);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i21 = reverseLinkedList0.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays17);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays22 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays23 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays22);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers24 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b25 = listnode_mergeSortedArrays23.equals((java.lang.Object) mergeBinaryNumbers24);
        com.github.pedrovgs.linkedlist.ListNode listNode26 = reverseLinkedList0.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays23);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays27 = listnode_mergeSortedArrays23.getData();
        org.junit.Assert.assertNull(listnode_mergeSortedArrays3);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(listNode10);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(listnode_i21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(listNode26);
        org.junit.Assert.assertNotNull(mergeSortedArrays27);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        com.github.pedrovgs.problem72.FindTheMissingNumber findTheMissingNumber0 = new com.github.pedrovgs.problem72.FindTheMissingNumber();
        com.github.pedrovgs.problem75.SelectionSort selectionSort1 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray2 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array5 = new int[] { (byte) 1, (byte) 10 };
        splitArray2.splitSwappingPartition(i_array5);
        selectionSort1.sort(i_array5);
        int i8 = findTheMissingNumber0.find(i_array5);
        com.github.pedrovgs.problem79.MergeSort mergeSort9 = new com.github.pedrovgs.problem79.MergeSort();
        int[] i_array10 = new int[] {};
        mergeSort9.sort(i_array10);
        try {
            int i12 = findTheMissingNumber0.find(i_array10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertTrue(i8 == (-8));
        org.junit.Assert.assertNotNull(i_array10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        com.github.pedrovgs.problem66.TreeToListByLevel treeToListByLevel0 = new com.github.pedrovgs.problem66.TreeToListByLevel();
        com.github.pedrovgs.problem16.BinaryTreePostOrder binaryTreePostOrder1 = new com.github.pedrovgs.problem16.BinaryTreePostOrder();
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder2 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian3 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d6 = avlTreeMedian3.find(binarynode_i5);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor7 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals8 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST9 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array11 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i12 = sortedArrayToBST9.transform(i_array11);
        boolean b13 = binarynode_i12.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST14 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array16 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i17 = sortedArrayToBST14.transform(i_array16);
        boolean b18 = binarynode_i17.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i19 = binarynode_i17.getRight();
        boolean b20 = binaryTreeEquals8.areEqualsIterative(binarynode_i12, binarynode_i17);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST21 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array23 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i24 = sortedArrayToBST21.transform(i_array23);
        boolean b25 = binarynode_i24.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST26 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array28 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i29 = sortedArrayToBST26.transform(i_array28);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode30 = lowestCommonAncestor7.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i17, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i24, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i29);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i31 = binarynode_i17.getLeft();
        double d32 = avlTreeMedian3.find(binarynode_i17);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST33 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array35 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i36 = sortedArrayToBST33.transform(i_array35);
        boolean b37 = binarynode_i36.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i38 = binarynode_i36.getRight();
        java.lang.Integer i39 = binarynode_i36.getData();
        binarynode_i17.setLeft(binarynode_i36);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i41 = binaryTreeInOrder2.getIterative(binarynode_i36);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode42 = binaryTreePostOrder1.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i36);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode43 = treeToListByLevel0.transform((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i36);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode44 = null;
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode45 = treeToListByLevel0.transform(binaryNode44);
        com.github.pedrovgs.problem19.BinaryTreeDepth binaryTreeDepth46 = new com.github.pedrovgs.problem19.BinaryTreeDepth();
        java.lang.Integer[] i_array48 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i49 = new java.util.Stack<java.lang.Integer>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i49, i_array48);
        boolean b51 = stack_i49.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST52 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i53 = stack_i49.search((java.lang.Object) sortedArrayToBST52);
        java.lang.Integer[] i_array57 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i58 = sortedArrayToBST52.transform(i_array57);
        int i59 = binaryTreeDepth46.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i58);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode60 = treeToListByLevel0.transform((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i58);
        org.junit.Assert.assertTrue(d6 == 10.0d);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(binarynode_i12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(binarynode_i17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(binarynode_i19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(binarynode_i24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(binarynode_i29);
        org.junit.Assert.assertNull(binaryNode30);
        org.junit.Assert.assertNull(binarynode_i31);
        org.junit.Assert.assertTrue(d32 == 100.0d);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(binarynode_i36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(binarynode_i38);
        org.junit.Assert.assertTrue("'" + i39 + "' != '" + 100 + "'", i39.equals(100));
        org.junit.Assert.assertNotNull(list_binarynode_i41);
        org.junit.Assert.assertNotNull(list_binaryNode42);
        org.junit.Assert.assertNotNull(list_binaryNode43);
        org.junit.Assert.assertNotNull(list_binaryNode45);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i53 == (-1));
        org.junit.Assert.assertNotNull(i_array57);
        org.junit.Assert.assertNotNull(binarynode_i58);
        org.junit.Assert.assertTrue(i59 == 2);
        org.junit.Assert.assertNotNull(list_binaryNode60);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
        com.github.pedrovgs.problem53.CompressString compressString0 = new com.github.pedrovgs.problem53.CompressString();
        java.lang.String str2 = compressString0.compressRecursive("97");
        java.lang.String str4 = compressString0.compressAlternativeApproach("hi!");
        java.lang.String str6 = compressString0.compress("[]");
        java.lang.String str8 = compressString0.compress("/hi!/");
        java.lang.String str10 = compressString0.compressRecursive("/hi!/");
        java.lang.String str12 = compressString0.compressAlternativeApproach("7");
        java.lang.String str14 = compressString0.compressRecursive("[1, -1, 100, 0]");
        java.lang.String str16 = compressString0.compressAlternativeApproach("!ih");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97" + "'", str2.equals("97"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/hi!" + "'", str8.equals("/hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "/hi!/" + "'", str10.equals("/hi!/"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "7" + "'", str12.equals("7"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[1, -1, 102, 0]" + "'", str14.equals("[1, -1, 102, 0]"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "!ih" + "'", str16.equals("!ih"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
        com.github.pedrovgs.problem76.InsertionSort insertionSort0 = new com.github.pedrovgs.problem76.InsertionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray1 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        com.github.pedrovgs.problem8.SplitArray splitArray4 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array7 = new int[] { (byte) 1, (byte) 10 };
        splitArray4.splitSwappingPartition(i_array7);
        int[] i_array15 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray4.splitSwappingRecursive(i_array15);
        com.github.pedrovgs.problem8.SplitArray splitArray17 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array20 = new int[] { (byte) 1, (byte) 10 };
        splitArray17.splitSwappingPartition(i_array20);
        int[] i_array28 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray17.splitSwappingRecursive(i_array28);
        int[] i_array30 = mergeSortedArrays2.merge(i_array15, i_array28);
        splitArray1.splitSwappingIterative(i_array28);
        insertionSort0.sort(i_array28);
        com.github.pedrovgs.problem72.FindTheMissingNumber findTheMissingNumber33 = new com.github.pedrovgs.problem72.FindTheMissingNumber();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem72.FindTheMissingNumber> listnode_findTheMissingNumber34 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem72.FindTheMissingNumber>(findTheMissingNumber33);
        com.github.pedrovgs.problem12.MoveZerosInArray moveZerosInArray35 = new com.github.pedrovgs.problem12.MoveZerosInArray();
        com.github.pedrovgs.problem75.SelectionSort selectionSort36 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray37 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array40 = new int[] { (byte) 1, (byte) 10 };
        splitArray37.splitSwappingPartition(i_array40);
        selectionSort36.sort(i_array40);
        moveZerosInArray35.moveUsingTwoPointers(i_array40);
        int i44 = findTheMissingNumber33.find(i_array40);
        insertionSort0.sort(i_array40);
        com.github.pedrovgs.problem39.MultiplyArrayElements multiplyArrayElements46 = new com.github.pedrovgs.problem39.MultiplyArrayElements();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral47 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array48 = new int[][] {};
        int[] i_array49 = goThroughMatrixInSpiral47.go(i_array_array48);
        int[] i_array50 = multiplyArrayElements46.multiply(i_array49);
        insertionSort0.sort(i_array49);
        org.junit.Assert.assertNotNull(i_array7);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertTrue(i44 == (-8));
        org.junit.Assert.assertNotNull(i_array_array48);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array50);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode0 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = listnode_mergeSortedArrays2.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = listnode_mergeSortedArrays2.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i6 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i7 = null;
        binarynode_i6.setRight(binarynode_i7);
        boolean b9 = listnode_mergeSortedArrays2.equals((java.lang.Object) binarynode_i7);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays10 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays11 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays10);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays12 = listnode_mergeSortedArrays11.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays13 = listnode_mergeSortedArrays11.getNext();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays14 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort15 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray16 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array19 = new int[] { (byte) 1, (byte) 10 };
        splitArray16.splitSwappingPartition(i_array19);
        selectionSort15.sort(i_array19);
        com.github.pedrovgs.problem8.SplitArray splitArray22 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array25 = new int[] { (byte) 1, (byte) 10 };
        splitArray22.splitSwappingPartition(i_array25);
        int[] i_array33 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray22.splitSwappingRecursive(i_array33);
        int[] i_array35 = mergeSortedArrays14.merge(i_array19, i_array33);
        listnode_mergeSortedArrays11.setData(mergeSortedArrays14);
        listnode_mergeSortedArrays2.setData(mergeSortedArrays14);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays38 = listnode_mergeSortedArrays2.getNext();
        deleteListNode0.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays40 = listnode_mergeSortedArrays2.getNext();
        org.junit.Assert.assertNull(listnode_mergeSortedArrays3);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays12);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays13);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays38);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays40);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 0, 0 };
        java.util.Vector<java.lang.Integer> vector_i3 = new java.util.Vector<java.lang.Integer>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i3, i_array2);
        java.lang.Object obj5 = vector_i3.clone();
        try {
            java.lang.Integer i7 = vector_i3.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode5 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        com.github.pedrovgs.problem62.PalindromeList palindromeList6 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList7 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays8 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays9 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays8);
        java.lang.String str10 = listnode_mergeSortedArrays9.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i11 = reverseLinkedList7.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays9);
        boolean b12 = palindromeList6.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays9);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays13 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays14 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays13);
        java.lang.String str15 = listnode_mergeSortedArrays14.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays16 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays17 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays16);
        java.lang.String str18 = listnode_mergeSortedArrays17.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays19 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays17.setData(mergeSortedArrays19);
        listnode_mergeSortedArrays14.setNext(listnode_mergeSortedArrays17);
        boolean b22 = palindromeList6.checkReversing((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays14);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode23 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays24 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays25 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays24);
        java.lang.String str26 = listnode_mergeSortedArrays25.toString();
        deleteListNode23.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays25);
        boolean b28 = palindromeList6.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays25);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i29 = reverseLinkedList1.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays25);
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode31 = findKthElement0.find((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays25, 270);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(listNode5);
        org.junit.Assert.assertNotNull(listnode_i11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(listnode_i29);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        com.github.pedrovgs.problem19.BinaryTreeDepth binaryTreeDepth0 = new com.github.pedrovgs.problem19.BinaryTreeDepth();
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i3 = new java.util.Stack<java.lang.Integer>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i3, i_array2);
        boolean b5 = stack_i3.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST6 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i7 = stack_i3.search((java.lang.Object) sortedArrayToBST6);
        java.lang.Integer[] i_array11 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i12 = sortedArrayToBST6.transform(i_array11);
        int i13 = binaryTreeDepth0.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i12);
        boolean b14 = binarynode_i12.hasLeft();
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(binarynode_i12);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(0);
        int i4 = factorial0.getIterative(270);
        int i6 = factorial0.getTailRecursive(100);
        int i8 = factorial0.getIterative(52);
        org.junit.Assert.assertTrue(i2 == 1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        com.github.pedrovgs.problem11.IntToString intToString0 = new com.github.pedrovgs.problem11.IntToString();
        java.lang.String str2 = intToString0.transform((int) '#');
        java.lang.String str4 = intToString0.transform(10);
        java.lang.String str6 = intToString0.transform((-6));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "35" + "'", str2.equals("35"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-6" + "'", str6.equals("-6"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        boolean b9 = vector_i4.add((java.lang.Integer) 10);
        boolean b11 = vector_i4.remove((java.lang.Object) 10L);
        try {
            vector_i4.setElementAt((java.lang.Integer) 28, 3628800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList0 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        java.lang.String str3 = listnode_mergeSortedArrays2.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode4 = reverseLinkedList0.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2);
        com.github.pedrovgs.problem29.AreAnagrams areAnagrams5 = new com.github.pedrovgs.problem29.AreAnagrams();
        boolean b8 = areAnagrams5.check("/!ih/hi!/", "10");
        boolean b11 = areAnagrams5.check("35", "/hi!");
        boolean b12 = listnode_mergeSortedArrays2.equals((java.lang.Object) "35");
        org.junit.Assert.assertNotNull(listNode4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        com.github.pedrovgs.problem37.PathCalculator pathCalculator0 = new com.github.pedrovgs.problem37.PathCalculator();
        java.lang.String str4 = pathCalculator0.calculate("/", "97", "10010###");
        java.lang.String str8 = pathCalculator0.calculate("BinaryNode{data=10}", "10", "]1-[");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "/97/10010###/" + "'", str4.equals("/97/10010###/"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/BinaryNode{data=10}/10/]1-[/" + "'", str8.equals("/BinaryNode{data=10}/10/]1-[/"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder0 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder1 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian2 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i4 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d5 = avlTreeMedian2.find(binarynode_i4);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode6 = binaryTreePreOrder1.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i4);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i7 = binaryTreeInOrder0.getIterative(binarynode_i4);
        com.github.pedrovgs.problem18.IsBST isBST8 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem46.BinaryTreeSerialization binaryTreeSerialization9 = new com.github.pedrovgs.problem46.BinaryTreeSerialization();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST10 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array12 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i13 = sortedArrayToBST10.transform(i_array12);
        boolean b14 = binarynode_i13.hasRight();
        java.lang.Integer i15 = binarynode_i13.getData();
        java.lang.String str16 = binaryTreeSerialization9.serialize((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i13);
        boolean b17 = isBST8.checkIterative(binarynode_i13);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i18 = binaryTreeInOrder0.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i13);
        com.github.pedrovgs.problem18.IsBST isBST19 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem46.BinaryTreeSerialization binaryTreeSerialization20 = new com.github.pedrovgs.problem46.BinaryTreeSerialization();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST21 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array23 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i24 = sortedArrayToBST21.transform(i_array23);
        boolean b25 = binarynode_i24.hasRight();
        java.lang.Integer i26 = binarynode_i24.getData();
        java.lang.String str27 = binaryTreeSerialization20.serialize((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i24);
        boolean b28 = isBST19.checkIterative(binarynode_i24);
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder29 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian30 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i32 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d33 = avlTreeMedian30.find(binarynode_i32);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode34 = binaryTreePreOrder29.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i32);
        com.github.pedrovgs.problem18.IsBST isBST35 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST36 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array38 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i39 = sortedArrayToBST36.transform(i_array38);
        boolean b40 = isBST35.checkRecursive(binarynode_i39);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode41 = binaryTreePreOrder29.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i39);
        boolean b42 = isBST19.checkRecursive(binarynode_i39);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i43 = binarynode_i39.getRight();
        try {
            java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i44 = binaryTreeInOrder0.getIterative(binarynode_i43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d5 == 10.0d);
        org.junit.Assert.assertNotNull(list_binaryNode6);
        org.junit.Assert.assertNotNull(list_binarynode_i7);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(binarynode_i13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100 + "'", i15.equals(100));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "100##" + "'", str16.equals("100##"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(list_binarynode_i18);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(binarynode_i24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + i26 + "' != '" + 100 + "'", i26.equals(100));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "100##" + "'", str27.equals("100##"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(d33 == 10.0d);
        org.junit.Assert.assertNotNull(list_binaryNode34);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(binarynode_i39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(list_binaryNode41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(binarynode_i43);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces0 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces1 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces2 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array3 = new char[] {};
        replaceSpaces2.replace2(char_array3);
        replaceSpaces1.replace(char_array3);
        replaceSpaces0.replace(char_array3);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces7 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces8 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array14 = new char[] { '#', 'a', ' ', '4', 'a' };
        replaceSpaces8.replace(char_array14);
        replaceSpaces7.replace(char_array14);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces17 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces18 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces19 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array20 = new char[] {};
        replaceSpaces19.replace2(char_array20);
        replaceSpaces18.replace(char_array20);
        replaceSpaces17.replace(char_array20);
        replaceSpaces7.replace(char_array20);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces25 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array31 = new char[] { '#', 'a', ' ', '4', 'a' };
        replaceSpaces25.replace(char_array31);
        replaceSpaces7.replace2(char_array31);
        replaceSpaces0.replace2(char_array31);
        org.junit.Assert.assertNotNull(char_array3);
        org.junit.Assert.assertNotNull(char_array14);
        org.junit.Assert.assertNotNull(char_array20);
        org.junit.Assert.assertNotNull(char_array31);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        com.github.pedrovgs.problem44.FindMinNumberAtPosition findMinNumberAtPosition0 = new com.github.pedrovgs.problem44.FindMinNumberAtPosition();
        com.github.pedrovgs.problem19.BinaryTreeDepth binaryTreeDepth1 = new com.github.pedrovgs.problem19.BinaryTreeDepth();
        com.github.pedrovgs.problem16.BinaryTreePostOrder binaryTreePostOrder2 = new com.github.pedrovgs.problem16.BinaryTreePostOrder();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST3 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array5 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i6 = sortedArrayToBST3.transform(i_array5);
        java.lang.String str7 = binarynode_i6.toString();
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_8 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_8.push((int) (byte) 10);
        int i11 = stack1_8.getMin();
        boolean b12 = binarynode_i6.equals((java.lang.Object) stack1_8);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode13 = binaryTreePostOrder2.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i6);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST14 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array16 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i17 = sortedArrayToBST14.transform(i_array16);
        boolean b18 = binarynode_i17.hasRight();
        java.lang.Integer i19 = binarynode_i17.getData();
        boolean b20 = binarynode_i17.hasRight();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode21 = binaryTreePostOrder2.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i17);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor22 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals23 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST24 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array26 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i27 = sortedArrayToBST24.transform(i_array26);
        boolean b28 = binarynode_i27.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST29 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array31 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i32 = sortedArrayToBST29.transform(i_array31);
        boolean b33 = binarynode_i32.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i34 = binarynode_i32.getRight();
        boolean b35 = binaryTreeEquals23.areEqualsIterative(binarynode_i27, binarynode_i32);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST36 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array38 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i39 = sortedArrayToBST36.transform(i_array38);
        boolean b40 = binarynode_i39.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST41 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array43 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i44 = sortedArrayToBST41.transform(i_array43);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode45 = lowestCommonAncestor22.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i32, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i39, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i44);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST46 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array48 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i49 = sortedArrayToBST46.transform(i_array48);
        boolean b50 = binarynode_i49.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i51 = binarynode_i49.getRight();
        binarynode_i39.setRight(binarynode_i49);
        java.lang.Integer i53 = binarynode_i39.getData();
        binarynode_i17.setLeft(binarynode_i39);
        int i55 = binaryTreeDepth1.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i39);
        try {
            java.lang.Integer i57 = findMinNumberAtPosition0.find(binarynode_i39, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(binarynode_i6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "BinaryNode{data=100}" + "'", str7.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue(i11 == 10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(list_binaryNode13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(binarynode_i17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100 + "'", i19.equals(100));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(list_binaryNode21);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(binarynode_i27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(binarynode_i32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(binarynode_i34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(binarynode_i39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(binarynode_i44);
        org.junit.Assert.assertNull(binaryNode45);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(binarynode_i49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(binarynode_i51);
        org.junit.Assert.assertTrue("'" + i53 + "' != '" + 100 + "'", i53.equals(100));
        org.junit.Assert.assertTrue(i55 == 2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        com.github.pedrovgs.problem25.Anagrams anagrams0 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str2 = anagrams0.get("hi!");
        java.util.List<java.lang.String> list_str4 = anagrams0.get("100");
        java.util.List<java.lang.String> list_str6 = anagrams0.get("[1, 1]");
        org.junit.Assert.assertNotNull(list_str2);
        org.junit.Assert.assertNotNull(list_str4);
        org.junit.Assert.assertNotNull(list_str6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        com.github.pedrovgs.problem51.ReverseString reverseString0 = new com.github.pedrovgs.problem51.ReverseString();
        java.lang.String str2 = reverseString0.reverseRecursive("/hi!/");
        java.lang.String str4 = reverseString0.reverseIterative("hi!");
        java.lang.String str6 = reverseString0.reverseIterative("/97/10010###/");
        java.lang.String str8 = reverseString0.reverseRecursive("[-1]");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/!ih/" + "'", str2.equals("/!ih/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "!ih" + "'", str4.equals("!ih"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "/###01001/79/" + "'", str6.equals("/###01001/79/"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "]1-[" + "'", str8.equals("]1-["));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
        com.github.pedrovgs.problem11.IntToString intToString0 = new com.github.pedrovgs.problem11.IntToString();
        java.lang.String str2 = intToString0.transform((-52));
        java.lang.String str4 = intToString0.transform((int) (byte) 100);
        java.lang.String str6 = intToString0.transform((int) (short) -1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-52" + "'", str2.equals("-52"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1" + "'", str6.equals("-1"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        try {
            java.lang.Integer i14 = vector_i4.set(9, (java.lang.Integer) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers0 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        int i5 = mergeBinaryNumbers0.merge((int) (byte) 10, (-52000), 2147483647, (-52));
        int i10 = mergeBinaryNumbers0.merge(29, 107, 52, (int) (short) 1);
        int i15 = mergeBinaryNumbers0.merge(3, (-52), 18, 3628800);
        int i20 = mergeBinaryNumbers0.merge(29, 29, 270, 10);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i10 == 112197661);
        org.junit.Assert.assertTrue(i15 == (-13631485));
        org.junit.Assert.assertTrue(i20 == 475165);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian0 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals1 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder2 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder3 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian4 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i6 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d7 = avlTreeMedian4.find(binarynode_i6);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode8 = binaryTreePreOrder3.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i6);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i9 = binaryTreeInOrder2.getIterative(binarynode_i6);
        com.github.pedrovgs.problem18.IsBST isBST10 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST11 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array13 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i14 = sortedArrayToBST11.transform(i_array13);
        boolean b15 = isBST10.checkRecursive(binarynode_i14);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals16 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST17 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array19 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i20 = sortedArrayToBST17.transform(i_array19);
        boolean b21 = binarynode_i20.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST22 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array24 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i25 = sortedArrayToBST22.transform(i_array24);
        boolean b26 = binarynode_i25.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i27 = binarynode_i25.getRight();
        boolean b28 = binaryTreeEquals16.areEqualsIterative(binarynode_i20, binarynode_i25);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i29 = binarynode_i20.getLeft();
        boolean b30 = isBST10.checkIterative(binarynode_i20);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals31 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST32 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array34 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i35 = sortedArrayToBST32.transform(i_array34);
        boolean b36 = binarynode_i35.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST37 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array39 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i40 = sortedArrayToBST37.transform(i_array39);
        boolean b41 = binarynode_i40.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i42 = binarynode_i40.getRight();
        boolean b43 = binaryTreeEquals31.areEqualsIterative(binarynode_i35, binarynode_i40);
        boolean b44 = isBST10.checkIterative(binarynode_i40);
        boolean b45 = binaryTreeEquals1.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i6, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i40);
        double d46 = avlTreeMedian0.find(binarynode_i40);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i48 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        java.lang.String str49 = binarynode_i48.toString();
        double d50 = avlTreeMedian0.find(binarynode_i48);
        java.lang.Integer[] i_array54 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i55 = new java.util.Vector<java.lang.Integer>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i55, i_array54);
        boolean b58 = vector_i55.remove((java.lang.Object) (short) -1);
        int i60 = vector_i55.indexOf((java.lang.Object) 1);
        int i62 = vector_i55.indexOf((java.lang.Object) 100.0d);
        java.lang.Object obj63 = vector_i55.clone();
        java.lang.Object obj64 = null;
        int i65 = vector_i55.lastIndexOf(obj64);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i67 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 27);
        int i68 = vector_i55.lastIndexOf((java.lang.Object) binarynode_i67);
        double d69 = avlTreeMedian0.find(binarynode_i67);
        org.junit.Assert.assertTrue(d7 == 10.0d);
        org.junit.Assert.assertNotNull(list_binaryNode8);
        org.junit.Assert.assertNotNull(list_binarynode_i9);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(binarynode_i14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(binarynode_i20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(binarynode_i25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(binarynode_i27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(binarynode_i29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(binarynode_i35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(binarynode_i40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(binarynode_i42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(d46 == 100.0d);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "BinaryNode{data=10}" + "'", str49.equals("BinaryNode{data=10}"));
        org.junit.Assert.assertTrue(d50 == 10.0d);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i60 == 1);
        org.junit.Assert.assertTrue(i62 == (-1));
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue(i65 == (-1));
        org.junit.Assert.assertTrue(i68 == (-1));
        org.junit.Assert.assertTrue(d69 == 27.0d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates0 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates1 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST2 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = sortedArrayToBST2.transform(i_array4);
        java.lang.Integer[] i_array6 = removeDuplicates1.removeUsingSorting(i_array4);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST7 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array9 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i10 = sortedArrayToBST7.transform(i_array9);
        java.lang.Integer[] i_array11 = removeDuplicates1.removeUsingSorting(i_array9);
        java.lang.Integer[] i_array12 = removeDuplicates0.removeUsingSorting(i_array9);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates13 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates14 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST15 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array17 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i18 = sortedArrayToBST15.transform(i_array17);
        java.lang.Integer[] i_array19 = removeDuplicates14.removeUsingSorting(i_array17);
        java.lang.Integer[] i_array20 = removeDuplicates13.removeUsingSorting(i_array19);
        java.lang.Integer[] i_array21 = removeDuplicates0.removeUsingSorting(i_array20);
        java.lang.Integer[] i_array22 = null;
        try {
            java.lang.Integer[] i_array23 = removeDuplicates0.removeUsingSorting(i_array22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(binarynode_i5);
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(binarynode_i10);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(binarynode_i18);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array21);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        try {
            java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnPowersOfTwo("/!ih/", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        com.github.pedrovgs.problem78.AutoBoxingTrick autoBoxingTrick0 = new com.github.pedrovgs.problem78.AutoBoxingTrick();
        boolean b3 = autoBoxingTrick0.compare((java.lang.Integer) 0, (java.lang.Integer) 2147483647);
        boolean b6 = autoBoxingTrick0.compare((java.lang.Integer) 27, (java.lang.Integer) 0);
        boolean b9 = autoBoxingTrick0.compare((java.lang.Integer) (-1), (java.lang.Integer) 56);
        boolean b12 = autoBoxingTrick0.compare((java.lang.Integer) (-14040), (java.lang.Integer) 52002);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnPowersOfTwo("", "");
        try {
            java.lang.String str6 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("", "79");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
        com.github.pedrovgs.problem73.SubtractAdding subtractAdding0 = new com.github.pedrovgs.problem73.SubtractAdding();
        int i3 = subtractAdding0.subtract((int) '4', (int) (short) 1);
        int i6 = subtractAdding0.subtract(72, (-6));
        org.junit.Assert.assertTrue(i3 == 51);
        org.junit.Assert.assertTrue(i6 == 78);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        com.github.pedrovgs.problem53.CompressString compressString0 = new com.github.pedrovgs.problem53.CompressString();
        java.lang.String str2 = compressString0.compressRecursive("97");
        java.lang.String str4 = compressString0.compressAlternativeApproach("hi!");
        java.lang.String str6 = compressString0.compress("[]");
        java.lang.String str8 = compressString0.compress("/hi!/");
        java.lang.String str10 = compressString0.compressAlternativeApproach("[]");
        java.lang.String str12 = compressString0.compress("/!ih/");
        java.lang.String str14 = compressString0.compressAlternativeApproach("[null]");
        java.lang.String str16 = compressString0.compressRecursive("/23/[/##001/");
        java.lang.String str18 = compressString0.compressRecursive("!ih");
        java.lang.String str20 = compressString0.compressRecursive("[]");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97" + "'", str2.equals("97"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/hi!" + "'", str8.equals("/hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "/!ih" + "'", str12.equals("/!ih"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[nul2]" + "'", str14.equals("[nul2]"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "/23/[/#2021/" + "'", str16.equals("/23/[/#2021/"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "!ih" + "'", str18.equals("!ih"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        try {
            java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("/100##/[/32/", "[1, -1, 102, 0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        com.github.pedrovgs.problem31.FindLongestConsecutiveSequence findLongestConsecutiveSequence0 = new com.github.pedrovgs.problem31.FindLongestConsecutiveSequence();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort2 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray3 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array6 = new int[] { (byte) 1, (byte) 10 };
        splitArray3.splitSwappingPartition(i_array6);
        selectionSort2.sort(i_array6);
        com.github.pedrovgs.problem8.SplitArray splitArray9 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array12 = new int[] { (byte) 1, (byte) 10 };
        splitArray9.splitSwappingPartition(i_array12);
        int[] i_array20 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray9.splitSwappingRecursive(i_array20);
        int[] i_array22 = mergeSortedArrays1.merge(i_array6, i_array20);
        int i23 = findLongestConsecutiveSequence0.findIterative(i_array6);
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertTrue(i23 == 2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        com.github.pedrovgs.problem61.SumLists sumLists0 = new com.github.pedrovgs.problem61.SumLists();
        com.github.pedrovgs.problem62.PalindromeList palindromeList1 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements2 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList3 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays4 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays4);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays6 = listnode_mergeSortedArrays5.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays7 = listnode_mergeSortedArrays5.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i9 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i10 = null;
        binarynode_i9.setRight(binarynode_i10);
        boolean b12 = listnode_mergeSortedArrays5.equals((java.lang.Object) binarynode_i10);
        com.github.pedrovgs.linkedlist.ListNode listNode13 = reverseLinkedList3.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays5);
        removeListDuplicatedElements2.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode13);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements15 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList16 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays17 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays18 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays17);
        java.lang.String str19 = listnode_mergeSortedArrays18.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode20 = reverseLinkedList16.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays18);
        removeListDuplicatedElements15.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode20);
        removeListDuplicatedElements2.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode20);
        boolean b23 = palindromeList1.checkReversing(listNode20);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList24 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays25 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays26 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays25);
        java.lang.String str27 = listnode_mergeSortedArrays26.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i28 = reverseLinkedList24.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays26);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode29 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays30 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays31 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays30);
        java.lang.String str32 = listnode_mergeSortedArrays31.toString();
        deleteListNode29.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays31);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays34 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays35 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays34);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers36 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b37 = listnode_mergeSortedArrays35.equals((java.lang.Object) mergeBinaryNumbers36);
        deleteListNode29.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays35);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i39 = reverseLinkedList24.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays35);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList40 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays41 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays42 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays41);
        java.lang.String str43 = listnode_mergeSortedArrays42.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i44 = reverseLinkedList40.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays42);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode45 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays46 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays47 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays46);
        java.lang.String str48 = listnode_mergeSortedArrays47.toString();
        deleteListNode45.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays47);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays50 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays51 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays50);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers52 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b53 = listnode_mergeSortedArrays51.equals((java.lang.Object) mergeBinaryNumbers52);
        deleteListNode45.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays51);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i55 = reverseLinkedList40.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays51);
        com.github.pedrovgs.linkedlist.ListNode listNode56 = reverseLinkedList24.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_i55);
        try {
            int i57 = sumLists0.sumReverse((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode20, listnode_i55);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays6);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(listNode13);
        org.junit.Assert.assertNotNull(listNode20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(listnode_i28);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(listnode_i39);
        org.junit.Assert.assertNotNull(listnode_i44);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(listnode_i55);
        org.junit.Assert.assertNotNull(listNode56);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
        com.github.pedrovgs.problem73.SubtractAdding subtractAdding0 = new com.github.pedrovgs.problem73.SubtractAdding();
        int i3 = subtractAdding0.subtract(0, (int) (byte) 1);
        org.junit.Assert.assertTrue(i3 == (-1));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        int i1 = stack1_0.size();
        stack1_0.push(2147483647);
        boolean b4 = stack1_0.isEmpty();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        com.github.pedrovgs.problem56.IsRotationUsingIsSubstring isRotationUsingIsSubstring0 = new com.github.pedrovgs.problem56.IsRotationUsingIsSubstring();
        boolean b3 = isRotationUsingIsSubstring0.check("/", "hi!");
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        java.lang.Integer i12 = vector_i4.firstElement();
        java.lang.Integer i13 = vector_i4.lastElement();
        vector_i4.removeAllElements();
        com.github.pedrovgs.problem71.ReverseBinaryNumber reverseBinaryNumber15 = new com.github.pedrovgs.problem71.ReverseBinaryNumber();
        int i16 = vector_i4.lastIndexOf((java.lang.Object) reverseBinaryNumber15);
        int i18 = reverseBinaryNumber15.reverse(107);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0 + "'", i12.equals(0));
        org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1) + "'", i13.equals((-1)));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i18 == 20);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode0 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        java.lang.String str3 = listnode_mergeSortedArrays2.toString();
        deleteListNode0.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList5 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements6 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList7 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays8 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays9 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays8);
        java.lang.String str10 = listnode_mergeSortedArrays9.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode11 = reverseLinkedList7.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays9);
        removeListDuplicatedElements6.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode11);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i13 = getTheElementInTheMiddleOfTheList5.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode11);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList14 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays15 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays16 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays15);
        java.lang.String str17 = listnode_mergeSortedArrays16.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i18 = reverseLinkedList14.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays16);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList19 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays20 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays21 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays20);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays22 = listnode_mergeSortedArrays21.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays23 = listnode_mergeSortedArrays21.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i25 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i26 = null;
        binarynode_i25.setRight(binarynode_i26);
        boolean b28 = listnode_mergeSortedArrays21.equals((java.lang.Object) binarynode_i26);
        com.github.pedrovgs.linkedlist.ListNode listNode29 = reverseLinkedList19.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays21);
        com.github.pedrovgs.linkedlist.ListNode listNode30 = reverseLinkedList14.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays21);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i31 = getTheElementInTheMiddleOfTheList5.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode30);
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange33 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange34 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "", combinationsOfChange33);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList35 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays36 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays37 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays36);
        java.lang.String str38 = listnode_mergeSortedArrays37.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode39 = reverseLinkedList35.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays37);
        boolean b40 = pair_comparable_str_combinationsOfChange34.equals((java.lang.Object) listNode39);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i41 = getTheElementInTheMiddleOfTheList5.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode39);
        deleteListNode0.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_i41);
        org.junit.Assert.assertNotNull(listNode11);
        org.junit.Assert.assertNotNull(listnode_i13);
        org.junit.Assert.assertNotNull(listnode_i18);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays22);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(listNode29);
        org.junit.Assert.assertNotNull(listNode30);
        org.junit.Assert.assertNotNull(listnode_i31);
        org.junit.Assert.assertNotNull(listNode39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(listnode_i41);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
        com.github.pedrovgs.problem18.IsBST isBST0 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST1 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i4 = sortedArrayToBST1.transform(i_array3);
        boolean b5 = isBST0.checkRecursive(binarynode_i4);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals6 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST7 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array9 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i10 = sortedArrayToBST7.transform(i_array9);
        boolean b11 = binarynode_i10.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST12 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array14 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i15 = sortedArrayToBST12.transform(i_array14);
        boolean b16 = binarynode_i15.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i17 = binarynode_i15.getRight();
        boolean b18 = binaryTreeEquals6.areEqualsIterative(binarynode_i10, binarynode_i15);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i19 = binarynode_i10.getLeft();
        boolean b20 = isBST0.checkIterative(binarynode_i10);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals21 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST22 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array24 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i25 = sortedArrayToBST22.transform(i_array24);
        boolean b26 = binarynode_i25.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST27 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array29 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i30 = sortedArrayToBST27.transform(i_array29);
        boolean b31 = binarynode_i30.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i32 = binarynode_i30.getRight();
        boolean b33 = binaryTreeEquals21.areEqualsIterative(binarynode_i25, binarynode_i30);
        boolean b34 = isBST0.checkIterative(binarynode_i30);
        com.github.pedrovgs.problem65.IsTreeBalanced isTreeBalanced35 = new com.github.pedrovgs.problem65.IsTreeBalanced();
        com.github.pedrovgs.problem75.SelectionSort selectionSort36 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem65.IsTreeBalanced, com.github.pedrovgs.problem75.SelectionSort> pair_isTreeBalanced_selectionSort37 = new com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem65.IsTreeBalanced, com.github.pedrovgs.problem75.SelectionSort>(isTreeBalanced35, selectionSort36);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST38 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array40 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i41 = sortedArrayToBST38.transform(i_array40);
        boolean b42 = isTreeBalanced35.check((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i41);
        com.github.pedrovgs.problem19.BinaryTreeDepth binaryTreeDepth43 = new com.github.pedrovgs.problem19.BinaryTreeDepth();
        java.lang.Integer[] i_array45 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i46 = new java.util.Stack<java.lang.Integer>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i46, i_array45);
        boolean b48 = stack_i46.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST49 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i50 = stack_i46.search((java.lang.Object) sortedArrayToBST49);
        java.lang.Integer[] i_array54 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i55 = sortedArrayToBST49.transform(i_array54);
        int i56 = binaryTreeDepth43.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i55);
        com.github.pedrovgs.problem19.BinaryTreeDepth binaryTreeDepth57 = new com.github.pedrovgs.problem19.BinaryTreeDepth();
        java.lang.Integer[] i_array59 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i60 = new java.util.Stack<java.lang.Integer>();
        boolean b61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i60, i_array59);
        boolean b62 = stack_i60.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST63 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i64 = stack_i60.search((java.lang.Object) sortedArrayToBST63);
        java.lang.Integer[] i_array68 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i69 = sortedArrayToBST63.transform(i_array68);
        int i70 = binaryTreeDepth57.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i69);
        int i71 = binaryTreeDepth43.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i69);
        boolean b72 = isTreeBalanced35.check((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i69);
        boolean b73 = isBST0.checkIterative(binarynode_i69);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(binarynode_i4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(binarynode_i10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(binarynode_i15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(binarynode_i17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(binarynode_i19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(binarynode_i25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(binarynode_i30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(binarynode_i32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(binarynode_i41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i50 == (-1));
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(binarynode_i55);
        org.junit.Assert.assertTrue(i56 == 2);
        org.junit.Assert.assertNotNull(i_array59);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i64 == (-1));
        org.junit.Assert.assertNotNull(i_array68);
        org.junit.Assert.assertNotNull(binarynode_i69);
        org.junit.Assert.assertTrue(i70 == 2);
        org.junit.Assert.assertTrue(i71 == 2);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(0);
        int i4 = factorial0.getTailRecursive((int) (byte) 100);
        int i6 = factorial0.getIterative((int) (byte) 0);
        int i8 = factorial0.getIterative((int) (short) 10);
        org.junit.Assert.assertTrue(i2 == 1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i8 == 3628800);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
        java.lang.Integer[] i_array1 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i2 = new java.util.Stack<java.lang.Integer>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i2, i_array1);
        boolean b4 = stack_i2.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST5 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i6 = stack_i2.search((java.lang.Object) sortedArrayToBST5);
        java.lang.Integer i8 = stack_i2.push((java.lang.Integer) 10);
        java.util.Enumeration<java.lang.Integer> enumeration_i9 = stack_i2.elements();
        try {
            stack_i2.insertElementAt((java.lang.Integer) (-52000), (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array1);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10 + "'", i8.equals(10));
        org.junit.Assert.assertNotNull(enumeration_i9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
        com.github.pedrovgs.problem19.BinaryTreeDepth binaryTreeDepth0 = new com.github.pedrovgs.problem19.BinaryTreeDepth();
        com.github.pedrovgs.problem16.BinaryTreePostOrder binaryTreePostOrder1 = new com.github.pedrovgs.problem16.BinaryTreePostOrder();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST2 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = sortedArrayToBST2.transform(i_array4);
        java.lang.String str6 = binarynode_i5.toString();
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_7 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_7.push((int) (byte) 10);
        int i10 = stack1_7.getMin();
        boolean b11 = binarynode_i5.equals((java.lang.Object) stack1_7);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode12 = binaryTreePostOrder1.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i5);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST13 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array15 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i16 = sortedArrayToBST13.transform(i_array15);
        boolean b17 = binarynode_i16.hasRight();
        java.lang.Integer i18 = binarynode_i16.getData();
        boolean b19 = binarynode_i16.hasRight();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode20 = binaryTreePostOrder1.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i16);
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
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST45 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array47 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i48 = sortedArrayToBST45.transform(i_array47);
        boolean b49 = binarynode_i48.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i50 = binarynode_i48.getRight();
        binarynode_i38.setRight(binarynode_i48);
        java.lang.Integer i52 = binarynode_i38.getData();
        binarynode_i16.setLeft(binarynode_i38);
        int i54 = binaryTreeDepth0.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i38);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST55 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array57 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i58 = sortedArrayToBST55.transform(i_array57);
        boolean b59 = binarynode_i58.hasRight();
        java.lang.Integer i60 = binarynode_i58.getData();
        boolean b61 = binarynode_i58.hasRight();
        boolean b62 = binarynode_i58.hasRight();
        int i63 = binaryTreeDepth0.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i58);
        java.lang.Integer i64 = binarynode_i58.getData();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(binarynode_i5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "BinaryNode{data=100}" + "'", str6.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue(i10 == 10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(list_binaryNode12);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(binarynode_i16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + i18 + "' != '" + 100 + "'", i18.equals(100));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_binaryNode20);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(binarynode_i26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(binarynode_i31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(binarynode_i33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(binarynode_i38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(binarynode_i43);
        org.junit.Assert.assertNull(binaryNode44);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(binarynode_i48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(binarynode_i50);
        org.junit.Assert.assertTrue("'" + i52 + "' != '" + 100 + "'", i52.equals(100));
        org.junit.Assert.assertTrue(i54 == 2);
        org.junit.Assert.assertNotNull(i_array57);
        org.junit.Assert.assertNotNull(binarynode_i58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue("'" + i60 + "' != '" + 100 + "'", i60.equals(100));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i63 == 1);
        org.junit.Assert.assertTrue("'" + i64 + "' != '" + 100 + "'", i64.equals(100));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
        com.github.pedrovgs.problem20.MultiplicationWithoutMultiply multiplicationWithoutMultiply0 = new com.github.pedrovgs.problem20.MultiplicationWithoutMultiply();
        int i3 = multiplicationWithoutMultiply0.calculate((-52), (int) (byte) 100);
        int i6 = multiplicationWithoutMultiply0.calculate((-5200), 10);
        int i9 = multiplicationWithoutMultiply0.calculate(28, 2);
        int i12 = multiplicationWithoutMultiply0.calculate(32, 0);
        int i15 = multiplicationWithoutMultiply0.calculate(3, (int) (short) 1);
        org.junit.Assert.assertTrue(i3 == (-5200));
        org.junit.Assert.assertTrue(i6 == (-52000));
        org.junit.Assert.assertTrue(i9 == 56);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 3);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        com.github.pedrovgs.problem53.CompressString compressString0 = new com.github.pedrovgs.problem53.CompressString();
        java.lang.String str2 = compressString0.compressRecursive("/");
        java.lang.String str4 = compressString0.compressRecursive("79");
        java.lang.String str6 = compressString0.compressRecursive("[null]");
        java.lang.String str8 = compressString0.compressRecursive("/23/[/#2021/");
        java.lang.String str10 = compressString0.compressAlternativeApproach("/23/[/#2021/");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/" + "'", str2.equals("/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "79" + "'", str4.equals("79"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[nul2]" + "'", str6.equals("[nul2]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/23/[/#2021/" + "'", str8.equals("/23/[/#2021/"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "/23/[/#2021/" + "'", str10.equals("/23/[/#2021/"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        java.lang.Integer i12 = vector_i4.firstElement();
        vector_i4.setSize(10);
        com.github.pedrovgs.problem32.Contains contains15 = new com.github.pedrovgs.problem32.Contains();
        boolean b18 = contains15.evaluate("", "/");
        int i19 = vector_i4.indexOf((java.lang.Object) b18);
        vector_i4.clear();
        vector_i4.trimToSize();
        vector_i4.trimToSize();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0 + "'", i12.equals(0));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnPowersOfTwo("", "");
        try {
            java.lang.String str6 = sumBinaryNumbers0.sumBinaryNumbersBasedOnPowersOfTwo("/97/10010###/", "[1, -1, 100, 0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        com.github.pedrovgs.problem61.SumLists sumLists0 = new com.github.pedrovgs.problem61.SumLists();
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList1 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements2 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList3 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays4 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays4);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays6 = listnode_mergeSortedArrays5.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays7 = listnode_mergeSortedArrays5.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i9 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i10 = null;
        binarynode_i9.setRight(binarynode_i10);
        boolean b12 = listnode_mergeSortedArrays5.equals((java.lang.Object) binarynode_i10);
        com.github.pedrovgs.linkedlist.ListNode listNode13 = reverseLinkedList3.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays5);
        removeListDuplicatedElements2.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode13);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements15 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList16 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays17 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays18 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays17);
        java.lang.String str19 = listnode_mergeSortedArrays18.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode20 = reverseLinkedList16.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays18);
        removeListDuplicatedElements15.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode20);
        removeListDuplicatedElements2.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode20);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements23 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList24 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays25 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays26 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays25);
        java.lang.String str27 = listnode_mergeSortedArrays26.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode28 = reverseLinkedList24.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays26);
        removeListDuplicatedElements23.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode28);
        removeListDuplicatedElements2.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode28);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i31 = getTheElementInTheMiddleOfTheList1.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode28);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements32 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList33 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays34 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays35 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays34);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays36 = listnode_mergeSortedArrays35.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays37 = listnode_mergeSortedArrays35.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i39 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i40 = null;
        binarynode_i39.setRight(binarynode_i40);
        boolean b42 = listnode_mergeSortedArrays35.equals((java.lang.Object) binarynode_i40);
        com.github.pedrovgs.linkedlist.ListNode listNode43 = reverseLinkedList33.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays35);
        removeListDuplicatedElements32.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode43);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements> listnode_removeListDuplicatedElements45 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements>(removeListDuplicatedElements32);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList46 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements47 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList48 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays49 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays50 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays49);
        java.lang.String str51 = listnode_mergeSortedArrays50.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode52 = reverseLinkedList48.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays50);
        removeListDuplicatedElements47.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode52);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i54 = getTheElementInTheMiddleOfTheList46.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode52);
        removeListDuplicatedElements32.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode52);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i56 = getTheElementInTheMiddleOfTheList1.get((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode52);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList57 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements58 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList59 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays60 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays61 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays60);
        java.lang.String str62 = listnode_mergeSortedArrays61.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode63 = reverseLinkedList59.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays61);
        removeListDuplicatedElements58.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode63);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i65 = getTheElementInTheMiddleOfTheList57.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode63);
        try {
            int i66 = sumLists0.sumReverse(listnode_i56, listnode_i65);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays6);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(listNode13);
        org.junit.Assert.assertNotNull(listNode20);
        org.junit.Assert.assertNotNull(listNode28);
        org.junit.Assert.assertNotNull(listnode_i31);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays36);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays37);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(listNode43);
        org.junit.Assert.assertNotNull(listNode52);
        org.junit.Assert.assertNotNull(listnode_i54);
        org.junit.Assert.assertNotNull(listnode_i56);
        org.junit.Assert.assertNotNull(listNode63);
        org.junit.Assert.assertNotNull(listnode_i65);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList0 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode5 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        com.github.pedrovgs.problem18.IsBST isBST6 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST7 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array9 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i10 = sortedArrayToBST7.transform(i_array9);
        boolean b11 = isBST6.checkRecursive(binarynode_i10);
        boolean b12 = listNode5.equals((java.lang.Object) binarynode_i10);
        com.github.pedrovgs.linkedlist.ListNode listNode13 = reverseLinkedList0.reverseIterative(listNode5);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays14 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays15 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays14);
        java.lang.String str16 = listnode_mergeSortedArrays15.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays17 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays18 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays17);
        java.lang.String str19 = listnode_mergeSortedArrays18.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays20 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays18.setData(mergeSortedArrays20);
        listnode_mergeSortedArrays15.setNext(listnode_mergeSortedArrays18);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays23 = listnode_mergeSortedArrays15.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays24 = listnode_mergeSortedArrays15.getNext();
        com.github.pedrovgs.linkedlist.ListNode listNode25 = reverseLinkedList0.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays24);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList26 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays27 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays28 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays27);
        java.lang.String str29 = listnode_mergeSortedArrays28.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i30 = reverseLinkedList26.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays28);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays31 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays32 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays31);
        java.lang.String str33 = listnode_mergeSortedArrays32.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays34 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays35 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays34);
        java.lang.String str36 = listnode_mergeSortedArrays35.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays37 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays35.setData(mergeSortedArrays37);
        listnode_mergeSortedArrays32.setNext(listnode_mergeSortedArrays35);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays40 = listnode_mergeSortedArrays32.getNext();
        com.github.pedrovgs.problem62.PalindromeList palindromeList41 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList42 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays43 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays44 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays43);
        java.lang.String str45 = listnode_mergeSortedArrays44.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i46 = reverseLinkedList42.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays44);
        boolean b47 = palindromeList41.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays44);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays48 = listnode_mergeSortedArrays44.getNext();
        listnode_mergeSortedArrays40.setNext(listnode_mergeSortedArrays44);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i50 = reverseLinkedList26.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays40);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode51 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements52 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList53 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays54 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays55 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays54);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays56 = listnode_mergeSortedArrays55.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays57 = listnode_mergeSortedArrays55.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i59 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i60 = null;
        binarynode_i59.setRight(binarynode_i60);
        boolean b62 = listnode_mergeSortedArrays55.equals((java.lang.Object) binarynode_i60);
        com.github.pedrovgs.linkedlist.ListNode listNode63 = reverseLinkedList53.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays55);
        removeListDuplicatedElements52.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode63);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements> listnode_removeListDuplicatedElements65 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements>(removeListDuplicatedElements52);
        deleteListNode51.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_removeListDuplicatedElements65);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i67 = reverseLinkedList26.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_removeListDuplicatedElements65);
        com.github.pedrovgs.linkedlist.ListNode listNode68 = reverseLinkedList0.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_removeListDuplicatedElements65);
        org.junit.Assert.assertNotNull(listNode5);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(binarynode_i10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(listNode13);
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays23);
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays24);
        org.junit.Assert.assertNotNull(listNode25);
        org.junit.Assert.assertNotNull(listnode_i30);
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays40);
        org.junit.Assert.assertNotNull(listnode_i46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays48);
        org.junit.Assert.assertNotNull(listnode_i50);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays56);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays57);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(listNode63);
        org.junit.Assert.assertNotNull(listnode_i67);
        org.junit.Assert.assertNotNull(listNode68);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays0 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays0);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers2 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b3 = listnode_mergeSortedArrays1.equals((java.lang.Object) mergeBinaryNumbers2);
        int i8 = mergeBinaryNumbers2.merge((int) '4', (-8), (int) (byte) -1, 27);
        int i13 = mergeBinaryNumbers2.merge(3628800, (int) (byte) 0, (int) (byte) -1, 0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i13 == 3628800);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        com.github.pedrovgs.problem1.BitsCounter bitsCounter0 = new com.github.pedrovgs.problem1.BitsCounter();
        int i2 = bitsCounter0.countBitsToOneBasedOnString((-6));
        int i4 = bitsCounter0.countBitsToOneBasedOnString((-6));
        int i6 = bitsCounter0.countBitsToOneBasedOnString((int) (short) -1);
        int i8 = bitsCounter0.countBitsToOneBasedOnBinaryOperators((int) 'a');
        int i10 = bitsCounter0.countBitsToOneBasedOnBinaryOperators(0);
        org.junit.Assert.assertTrue(i2 == 30);
        org.junit.Assert.assertTrue(i4 == 30);
        org.junit.Assert.assertTrue(i6 == 32);
        org.junit.Assert.assertTrue(i8 == 3);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        com.github.pedrovgs.problem26.Palindromes palindromes0 = new com.github.pedrovgs.problem26.Palindromes();
        boolean b2 = palindromes0.evaluate("/");
        boolean b4 = palindromes0.evaluate("10");
        boolean b6 = palindromes0.evaluate("/23/[/#2021/");
        boolean b8 = palindromes0.evaluate("7");
        boolean b10 = palindromes0.evaluate("-1");
        boolean b12 = palindromes0.evaluate("79");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList0 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements1 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList2 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode6 = reverseLinkedList2.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        removeListDuplicatedElements1.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode6);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i8 = getTheElementInTheMiddleOfTheList0.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode6);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList9 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays10 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays11 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays10);
        java.lang.String str12 = listnode_mergeSortedArrays11.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i13 = reverseLinkedList9.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays11);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList14 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays15 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays16 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays15);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays17 = listnode_mergeSortedArrays16.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays18 = listnode_mergeSortedArrays16.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i20 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i21 = null;
        binarynode_i20.setRight(binarynode_i21);
        boolean b23 = listnode_mergeSortedArrays16.equals((java.lang.Object) binarynode_i21);
        com.github.pedrovgs.linkedlist.ListNode listNode24 = reverseLinkedList14.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays16);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode25 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays26 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays27 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays26);
        java.lang.String str28 = listnode_mergeSortedArrays27.toString();
        deleteListNode25.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays27);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays30 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays31 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays30);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers32 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b33 = listnode_mergeSortedArrays31.equals((java.lang.Object) mergeBinaryNumbers32);
        deleteListNode25.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays31);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i35 = reverseLinkedList14.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays31);
        com.github.pedrovgs.linkedlist.ListNode listNode36 = reverseLinkedList9.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays31);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList37 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements38 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList39 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays40 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays41 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays40);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays42 = listnode_mergeSortedArrays41.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays43 = listnode_mergeSortedArrays41.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i45 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i46 = null;
        binarynode_i45.setRight(binarynode_i46);
        boolean b48 = listnode_mergeSortedArrays41.equals((java.lang.Object) binarynode_i46);
        com.github.pedrovgs.linkedlist.ListNode listNode49 = reverseLinkedList39.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays41);
        removeListDuplicatedElements38.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode49);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements51 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList52 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays53 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays54 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays53);
        java.lang.String str55 = listnode_mergeSortedArrays54.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode56 = reverseLinkedList52.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays54);
        removeListDuplicatedElements51.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode56);
        removeListDuplicatedElements38.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode56);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i59 = getTheElementInTheMiddleOfTheList37.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode56);
        com.github.pedrovgs.linkedlist.ListNode listNode60 = reverseLinkedList9.reverseIterative(listNode56);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i61 = getTheElementInTheMiddleOfTheList0.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode60);
        org.junit.Assert.assertNotNull(listNode6);
        org.junit.Assert.assertNotNull(listnode_i8);
        org.junit.Assert.assertNotNull(listnode_i13);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays17);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays18);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(listNode24);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(listnode_i35);
        org.junit.Assert.assertNotNull(listNode36);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays42);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays43);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(listNode49);
        org.junit.Assert.assertNotNull(listNode56);
        org.junit.Assert.assertNotNull(listnode_i59);
        org.junit.Assert.assertNotNull(listNode60);
        org.junit.Assert.assertNotNull(listnode_i61);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST0 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i3 = sortedArrayToBST0.transform(i_array2);
        java.lang.String str4 = binarynode_i3.toString();
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_5 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_5.push((int) (byte) 10);
        int i8 = stack1_5.getMin();
        boolean b9 = binarynode_i3.equals((java.lang.Object) stack1_5);
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_10 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_10.push((int) (byte) 10);
        int i13 = stack1_10.getMin();
        int i14 = stack1_10.getMin();
        com.github.pedrovgs.problem75.SelectionSort selectionSort15 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray16 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array19 = new int[] { (byte) 1, (byte) 10 };
        splitArray16.splitSwappingPartition(i_array19);
        selectionSort15.sort(i_array19);
        int i22 = stack1_10.search((java.lang.Object) i_array19);
        boolean b23 = stack1_5.removeElement((java.lang.Object) stack1_10);
        com.github.pedrovgs.problem25.Anagrams anagrams24 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str26 = anagrams24.get("0");
        java.util.List<java.lang.String> list_str28 = anagrams24.get("!ih");
        try {
            int i30 = stack1_5.lastIndexOf((java.lang.Object) anagrams24, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(binarynode_i3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "BinaryNode{data=100}" + "'", str4.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i13 == 10);
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(list_str26);
        org.junit.Assert.assertNotNull(list_str28);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        boolean b13 = vector_i4.contains((java.lang.Object) (byte) 100);
        int i16 = vector_i4.lastIndexOf((java.lang.Object) (-5200), 3);
        try {
            java.util.ListIterator<java.lang.Integer> listiterator_i18 = vector_i4.listIterator((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i16 == (-1));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros0 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral1 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array2 = new int[][] {};
        int[] i_array3 = goThroughMatrixInSpiral1.go(i_array_array2);
        int[] i_array6 = new int[] { 107, 3628800 };
        int[][] i_array_array7 = new int[][] { i_array6 };
        int[] i_array8 = goThroughMatrixInSpiral1.go(i_array_array7);
        rewriteRowAndColumnsWithZeros0.rewrite(i_array_array7);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral10 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array11 = new int[][] {};
        int[] i_array12 = goThroughMatrixInSpiral10.go(i_array_array11);
        int[] i_array15 = new int[] { 107, 3628800 };
        int[][] i_array_array16 = new int[][] { i_array15 };
        int[] i_array17 = goThroughMatrixInSpiral10.go(i_array_array16);
        rewriteRowAndColumnsWithZeros0.rewrite(i_array_array16);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral19 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array20 = new int[][] {};
        int[] i_array21 = goThroughMatrixInSpiral19.go(i_array_array20);
        rewriteRowAndColumnsWithZeros0.rewrite(i_array_array20);
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros23 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral24 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array25 = new int[][] {};
        int[] i_array26 = goThroughMatrixInSpiral24.go(i_array_array25);
        int[] i_array29 = new int[] { 107, 3628800 };
        int[][] i_array_array30 = new int[][] { i_array29 };
        int[] i_array31 = goThroughMatrixInSpiral24.go(i_array_array30);
        rewriteRowAndColumnsWithZeros23.rewrite(i_array_array30);
        rewriteRowAndColumnsWithZeros0.rewrite(i_array_array30);
        org.junit.Assert.assertNotNull(i_array_array2);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array_array7);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array_array20);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array_array25);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertNotNull(i_array31);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
        com.github.pedrovgs.problem27.ReverseSentence reverseSentence0 = new com.github.pedrovgs.problem27.ReverseSentence();
        java.lang.String str2 = reverseSentence0.reverse("97");
        java.lang.String str4 = reverseSentence0.reverse("[3]");
        java.lang.String str6 = reverseSentence0.reverse("79");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97" + "'", str2.equals("97"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[3]" + "'", str4.equals("[3]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "79" + "'", str6.equals("79"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
        com.github.pedrovgs.problem18.IsBST isBST0 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST1 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i4 = sortedArrayToBST1.transform(i_array3);
        boolean b5 = isBST0.checkRecursive(binarynode_i4);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals6 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST7 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array9 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i10 = sortedArrayToBST7.transform(i_array9);
        boolean b11 = binarynode_i10.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST12 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array14 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i15 = sortedArrayToBST12.transform(i_array14);
        boolean b16 = binarynode_i15.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i17 = binarynode_i15.getRight();
        boolean b18 = binaryTreeEquals6.areEqualsIterative(binarynode_i10, binarynode_i15);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i19 = binarynode_i10.getLeft();
        boolean b20 = isBST0.checkIterative(binarynode_i10);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals21 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST22 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array24 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i25 = sortedArrayToBST22.transform(i_array24);
        boolean b26 = binarynode_i25.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST27 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array29 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i30 = sortedArrayToBST27.transform(i_array29);
        boolean b31 = binarynode_i30.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i32 = binarynode_i30.getRight();
        boolean b33 = binaryTreeEquals21.areEqualsIterative(binarynode_i25, binarynode_i30);
        boolean b34 = isBST0.checkIterative(binarynode_i30);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i35 = null;
        binarynode_i30.setLeft(binarynode_i35);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(binarynode_i4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(binarynode_i10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(binarynode_i15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(binarynode_i17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(binarynode_i19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(binarynode_i25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(binarynode_i30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(binarynode_i32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        java.util.Enumeration<java.lang.Integer> enumeration_i10 = vector_i4.elements();
        vector_i4.ensureCapacity((-52));
        java.lang.String str13 = vector_i4.toString();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(enumeration_i10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0, 1, 1]" + "'", str13.equals("[0, 1, 1]"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
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
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode11 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays12 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays13 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays12);
        java.lang.String str14 = listnode_mergeSortedArrays13.toString();
        deleteListNode11.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays13);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays16 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays17 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays16);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers18 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b19 = listnode_mergeSortedArrays17.equals((java.lang.Object) mergeBinaryNumbers18);
        deleteListNode11.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays17);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i21 = reverseLinkedList0.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays17);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays22 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays23 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays22);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays24 = listnode_mergeSortedArrays23.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays25 = listnode_mergeSortedArrays23.getNext();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays26 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort27 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray28 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array31 = new int[] { (byte) 1, (byte) 10 };
        splitArray28.splitSwappingPartition(i_array31);
        selectionSort27.sort(i_array31);
        com.github.pedrovgs.problem8.SplitArray splitArray34 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array37 = new int[] { (byte) 1, (byte) 10 };
        splitArray34.splitSwappingPartition(i_array37);
        int[] i_array45 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray34.splitSwappingRecursive(i_array45);
        int[] i_array47 = mergeSortedArrays26.merge(i_array31, i_array45);
        listnode_mergeSortedArrays23.setData(mergeSortedArrays26);
        java.lang.String str49 = listnode_mergeSortedArrays23.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i50 = reverseLinkedList0.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays23);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList51 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays52 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays53 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays52);
        java.lang.String str54 = listnode_mergeSortedArrays53.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i55 = reverseLinkedList51.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays53);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays56 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays57 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays56);
        java.lang.String str58 = listnode_mergeSortedArrays57.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays59 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays60 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays59);
        java.lang.String str61 = listnode_mergeSortedArrays60.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays62 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays60.setData(mergeSortedArrays62);
        listnode_mergeSortedArrays57.setNext(listnode_mergeSortedArrays60);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays65 = listnode_mergeSortedArrays57.getNext();
        com.github.pedrovgs.problem62.PalindromeList palindromeList66 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList67 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays68 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays69 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays68);
        java.lang.String str70 = listnode_mergeSortedArrays69.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i71 = reverseLinkedList67.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays69);
        boolean b72 = palindromeList66.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays69);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays73 = listnode_mergeSortedArrays69.getNext();
        listnode_mergeSortedArrays65.setNext(listnode_mergeSortedArrays69);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i75 = reverseLinkedList51.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays65);
        com.github.pedrovgs.linkedlist.ListNode listNode76 = reverseLinkedList0.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_i75);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays3);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(listNode10);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(listnode_i21);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays24);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays25);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(listnode_i50);
        org.junit.Assert.assertNotNull(listnode_i55);
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays65);
        org.junit.Assert.assertNotNull(listnode_i71);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays73);
        org.junit.Assert.assertNotNull(listnode_i75);
        org.junit.Assert.assertNotNull(listNode76);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        com.github.pedrovgs.problem65.IsTreeBalanced isTreeBalanced10 = new com.github.pedrovgs.problem65.IsTreeBalanced();
        int i11 = vector_i5.lastIndexOf((java.lang.Object) isTreeBalanced10);
        vector_i5.ensureCapacity((-14040));
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue(i11 == (-1));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
        com.github.pedrovgs.problem16.BinaryTreePostOrder binaryTreePostOrder0 = new com.github.pedrovgs.problem16.BinaryTreePostOrder();
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder1 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian2 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i4 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d5 = avlTreeMedian2.find(binarynode_i4);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor6 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals7 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST8 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array10 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i11 = sortedArrayToBST8.transform(i_array10);
        boolean b12 = binarynode_i11.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST13 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array15 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i16 = sortedArrayToBST13.transform(i_array15);
        boolean b17 = binarynode_i16.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i18 = binarynode_i16.getRight();
        boolean b19 = binaryTreeEquals7.areEqualsIterative(binarynode_i11, binarynode_i16);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST20 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array22 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i23 = sortedArrayToBST20.transform(i_array22);
        boolean b24 = binarynode_i23.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST25 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array27 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i28 = sortedArrayToBST25.transform(i_array27);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode29 = lowestCommonAncestor6.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i16, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i23, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i28);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i30 = binarynode_i16.getLeft();
        double d31 = avlTreeMedian2.find(binarynode_i16);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST32 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array34 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i35 = sortedArrayToBST32.transform(i_array34);
        boolean b36 = binarynode_i35.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i37 = binarynode_i35.getRight();
        java.lang.Integer i38 = binarynode_i35.getData();
        binarynode_i16.setLeft(binarynode_i35);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i40 = binaryTreeInOrder1.getIterative(binarynode_i35);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode41 = binaryTreePostOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i35);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor42 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals43 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST44 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array46 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i47 = sortedArrayToBST44.transform(i_array46);
        boolean b48 = binarynode_i47.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST49 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array51 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i52 = sortedArrayToBST49.transform(i_array51);
        boolean b53 = binarynode_i52.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i54 = binarynode_i52.getRight();
        boolean b55 = binaryTreeEquals43.areEqualsIterative(binarynode_i47, binarynode_i52);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST56 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array58 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i59 = sortedArrayToBST56.transform(i_array58);
        boolean b60 = binarynode_i59.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST61 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array63 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i64 = sortedArrayToBST61.transform(i_array63);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode65 = lowestCommonAncestor42.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i52, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i59, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i64);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST66 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array68 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i69 = sortedArrayToBST66.transform(i_array68);
        boolean b70 = binarynode_i69.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i71 = binarynode_i69.getRight();
        binarynode_i59.setRight(binarynode_i69);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode73 = binaryTreePostOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i69);
        boolean b74 = binarynode_i69.hasLeft();
        java.lang.Integer i75 = binarynode_i69.getData();
        org.junit.Assert.assertTrue(d5 == 10.0d);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(binarynode_i11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(binarynode_i16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(binarynode_i18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(binarynode_i23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(binarynode_i28);
        org.junit.Assert.assertNull(binaryNode29);
        org.junit.Assert.assertNull(binarynode_i30);
        org.junit.Assert.assertTrue(d31 == 100.0d);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(binarynode_i35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(binarynode_i37);
        org.junit.Assert.assertTrue("'" + i38 + "' != '" + 100 + "'", i38.equals(100));
        org.junit.Assert.assertNotNull(list_binarynode_i40);
        org.junit.Assert.assertNotNull(list_binaryNode41);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(binarynode_i47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(binarynode_i52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(binarynode_i54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(binarynode_i59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertNotNull(binarynode_i64);
        org.junit.Assert.assertNull(binaryNode65);
        org.junit.Assert.assertNotNull(i_array68);
        org.junit.Assert.assertNotNull(binarynode_i69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(binarynode_i71);
        org.junit.Assert.assertNotNull(list_binaryNode73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue("'" + i75 + "' != '" + 100 + "'", i75.equals(100));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        com.github.pedrovgs.problem11.IntToString intToString0 = new com.github.pedrovgs.problem11.IntToString();
        java.lang.String str2 = intToString0.transform((int) 'a');
        java.lang.String str4 = intToString0.transform(1241513983);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97" + "'", str2.equals("97"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1241513983" + "'", str4.equals("1241513983"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder0 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
        com.github.pedrovgs.problem65.IsTreeBalanced isTreeBalanced1 = new com.github.pedrovgs.problem65.IsTreeBalanced();
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor2 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals3 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST4 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array6 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i7 = sortedArrayToBST4.transform(i_array6);
        boolean b8 = binarynode_i7.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST9 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array11 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i12 = sortedArrayToBST9.transform(i_array11);
        boolean b13 = binarynode_i12.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i14 = binarynode_i12.getRight();
        boolean b15 = binaryTreeEquals3.areEqualsIterative(binarynode_i7, binarynode_i12);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST16 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array18 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i19 = sortedArrayToBST16.transform(i_array18);
        boolean b20 = binarynode_i19.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST21 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array23 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i24 = sortedArrayToBST21.transform(i_array23);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode25 = lowestCommonAncestor2.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i12, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i19, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i24);
        boolean b26 = isTreeBalanced1.check((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i24);
        java.lang.Integer i27 = binarynode_i24.getData();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i28 = binaryTreeInOrder0.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i24);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST29 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array31 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i32 = sortedArrayToBST29.transform(i_array31);
        java.lang.String str33 = binarynode_i32.toString();
        boolean b34 = binarynode_i32.hasRight();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i35 = binaryTreeInOrder0.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i32);
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(binarynode_i7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(binarynode_i12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(binarynode_i14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertNotNull(binarynode_i19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(binarynode_i24);
        org.junit.Assert.assertNull(binaryNode25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + i27 + "' != '" + 100 + "'", i27.equals(100));
        org.junit.Assert.assertNotNull(list_binarynode_i28);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(binarynode_i32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "BinaryNode{data=100}" + "'", str33.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(list_binarynode_i35);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
        com.github.pedrovgs.problem2.VectorScalarProduct vectorScalarProduct0 = new com.github.pedrovgs.problem2.VectorScalarProduct();
        com.github.pedrovgs.problem8.SplitArray splitArray1 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array4 = new int[] { (byte) 1, (byte) 10 };
        splitArray1.splitSwappingPartition(i_array4);
        com.github.pedrovgs.problem2.Vector vector6 = new com.github.pedrovgs.problem2.Vector(i_array4);
        int i7 = vector6.size();
        int i8 = vector6.size();
        int i9 = vector6.size();
        com.github.pedrovgs.problem2.VectorScalarProduct vectorScalarProduct10 = new com.github.pedrovgs.problem2.VectorScalarProduct();
        com.github.pedrovgs.problem8.SplitArray splitArray11 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array14 = new int[] { (byte) 1, (byte) 10 };
        splitArray11.splitSwappingPartition(i_array14);
        com.github.pedrovgs.problem2.Vector vector16 = new com.github.pedrovgs.problem2.Vector(i_array14);
        com.github.pedrovgs.problem8.SplitArray splitArray17 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array20 = new int[] { (byte) 1, (byte) 10 };
        splitArray17.splitSwappingPartition(i_array20);
        com.github.pedrovgs.problem2.Vector vector22 = new com.github.pedrovgs.problem2.Vector(i_array20);
        int i23 = vectorScalarProduct10.calculateScalarProduct(vector16, vector22);
        int i24 = vectorScalarProduct0.calculateScalarProduct(vector6, vector16);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertTrue(i23 == 101);
        org.junit.Assert.assertTrue(i24 == 101);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
        com.github.pedrovgs.problem18.IsBST isBST0 = new com.github.pedrovgs.problem18.IsBST();
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
        java.lang.String str25 = binarynode_i23.toString();
        boolean b26 = isBST0.checkIterative(binarynode_i23);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST27 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array29 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i30 = sortedArrayToBST27.transform(i_array29);
        boolean b31 = binarynode_i30.hasRight();
        java.lang.Integer i32 = binarynode_i30.getData();
        boolean b33 = isBST0.checkRecursive(binarynode_i30);
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder34 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor35 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals36 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST37 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array39 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i40 = sortedArrayToBST37.transform(i_array39);
        boolean b41 = binarynode_i40.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST42 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array44 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i45 = sortedArrayToBST42.transform(i_array44);
        boolean b46 = binarynode_i45.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i47 = binarynode_i45.getRight();
        boolean b48 = binaryTreeEquals36.areEqualsIterative(binarynode_i40, binarynode_i45);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST49 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array51 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i52 = sortedArrayToBST49.transform(i_array51);
        boolean b53 = binarynode_i52.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST54 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array56 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i57 = sortedArrayToBST54.transform(i_array56);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode58 = lowestCommonAncestor35.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i45, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i52, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i57);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode59 = binaryTreePreOrder34.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i52);
        boolean b60 = isBST0.checkIterative(binarynode_i52);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(binarynode_i6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(binarynode_i11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(binarynode_i13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(binarynode_i18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(binarynode_i23);
        org.junit.Assert.assertNull(binaryNode24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "BinaryNode{data=100}" + "'", str25.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(binarynode_i30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + i32 + "' != '" + 100 + "'", i32.equals(100));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(binarynode_i40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(binarynode_i45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(binarynode_i47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(binarynode_i52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(i_array56);
        org.junit.Assert.assertNotNull(binarynode_i57);
        org.junit.Assert.assertNull(binaryNode58);
        org.junit.Assert.assertNotNull(list_binaryNode59);
        org.junit.Assert.assertTrue(b60 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        boolean b8 = vector_i5.remove((java.lang.Object) (short) -1);
        int i10 = vector_i5.indexOf((java.lang.Object) 1);
        int i12 = vector_i5.indexOf((java.lang.Object) 100.0d);
        java.lang.Object obj13 = vector_i5.clone();
        java.lang.Object obj14 = null;
        int i15 = vector_i5.lastIndexOf(obj14);
        int i17 = stack2_0.indexOf(obj14, 0);
        stack2_0.push((-5200));
        java.lang.Integer i20 = stack2_0.firstElement();
        stack2_0.clear();
        int i22 = stack2_0.size();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + i20 + "' != '" + (-5200) + "'", i20.equals((-5200)));
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList0 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
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
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i22 = getTheElementInTheMiddleOfTheList0.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode19);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList23 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList24 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays25 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays26 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays25);
        java.lang.String str27 = listnode_mergeSortedArrays26.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode28 = reverseLinkedList24.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays26);
        com.github.pedrovgs.problem18.IsBST isBST29 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST30 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array32 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i33 = sortedArrayToBST30.transform(i_array32);
        boolean b34 = isBST29.checkRecursive(binarynode_i33);
        boolean b35 = listNode28.equals((java.lang.Object) binarynode_i33);
        com.github.pedrovgs.linkedlist.ListNode listNode36 = reverseLinkedList23.reverseIterative(listNode28);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays37 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays38 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays37);
        java.lang.String str39 = listnode_mergeSortedArrays38.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays40 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays41 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays40);
        java.lang.String str42 = listnode_mergeSortedArrays41.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays43 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays41.setData(mergeSortedArrays43);
        listnode_mergeSortedArrays38.setNext(listnode_mergeSortedArrays41);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays46 = listnode_mergeSortedArrays38.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays47 = listnode_mergeSortedArrays38.getNext();
        com.github.pedrovgs.linkedlist.ListNode listNode48 = reverseLinkedList23.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays47);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i49 = getTheElementInTheMiddleOfTheList0.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode48);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(listNode12);
        org.junit.Assert.assertNotNull(listNode19);
        org.junit.Assert.assertNotNull(listnode_i22);
        org.junit.Assert.assertNotNull(listNode28);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(binarynode_i33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(listNode36);
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays46);
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays47);
        org.junit.Assert.assertNotNull(listNode48);
        org.junit.Assert.assertNotNull(listnode_i49);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        boolean b13 = vector_i4.contains((java.lang.Object) (byte) 100);
        java.util.Enumeration<java.lang.Integer> enumeration_i14 = vector_i4.elements();
        java.lang.Integer i15 = vector_i4.firstElement();
        java.lang.Integer i16 = vector_i4.firstElement();
        java.lang.Integer i17 = vector_i4.firstElement();
        try {
            java.util.ListIterator<java.lang.Integer> listiterator_i19 = vector_i4.listIterator(475165);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(enumeration_i14);
        org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0 + "'", i15.equals(0));
        org.junit.Assert.assertTrue("'" + i16 + "' != '" + 0 + "'", i16.equals(0));
        org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0 + "'", i17.equals(0));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        com.github.pedrovgs.problem8.SplitArray splitArray0 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array3 = new int[] { (byte) 1, (byte) 10 };
        splitArray0.splitSwappingPartition(i_array3);
        int[] i_array11 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray0.splitSwappingRecursive(i_array11);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays13 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort14 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray15 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array18 = new int[] { (byte) 1, (byte) 10 };
        splitArray15.splitSwappingPartition(i_array18);
        selectionSort14.sort(i_array18);
        com.github.pedrovgs.problem8.SplitArray splitArray21 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array24 = new int[] { (byte) 1, (byte) 10 };
        splitArray21.splitSwappingPartition(i_array24);
        int[] i_array32 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray21.splitSwappingRecursive(i_array32);
        int[] i_array34 = mergeSortedArrays13.merge(i_array18, i_array32);
        splitArray0.splitSwappingIterative(i_array18);
        com.github.pedrovgs.problem72.FindTheMissingNumber findTheMissingNumber36 = new com.github.pedrovgs.problem72.FindTheMissingNumber();
        com.github.pedrovgs.problem75.SelectionSort selectionSort37 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray38 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array41 = new int[] { (byte) 1, (byte) 10 };
        splitArray38.splitSwappingPartition(i_array41);
        selectionSort37.sort(i_array41);
        int i44 = findTheMissingNumber36.find(i_array41);
        com.github.pedrovgs.problem39.MultiplyArrayElements multiplyArrayElements45 = new com.github.pedrovgs.problem39.MultiplyArrayElements();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral46 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array47 = new int[][] {};
        int[] i_array48 = goThroughMatrixInSpiral46.go(i_array_array47);
        int[] i_array49 = multiplyArrayElements45.multiply(i_array48);
        com.github.pedrovgs.problem80.QuickSort quickSort50 = new com.github.pedrovgs.problem80.QuickSort();
        com.github.pedrovgs.problem8.SplitArray splitArray51 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array54 = new int[] { (byte) 1, (byte) 10 };
        splitArray51.splitSwappingPartition(i_array54);
        com.github.pedrovgs.problem2.Vector vector56 = new com.github.pedrovgs.problem2.Vector(i_array54);
        quickSort50.sort(i_array54);
        int[] i_array58 = multiplyArrayElements45.multiply(i_array54);
        int i59 = findTheMissingNumber36.find(i_array58);
        splitArray0.splitSwappingIterative(i_array58);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertTrue(i44 == (-8));
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertTrue(i59 == (-8));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates0 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates1 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST2 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = sortedArrayToBST2.transform(i_array4);
        java.lang.Integer[] i_array6 = removeDuplicates1.removeUsingSorting(i_array4);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST7 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array9 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i10 = sortedArrayToBST7.transform(i_array9);
        java.lang.Integer[] i_array11 = removeDuplicates1.removeUsingSorting(i_array9);
        java.lang.Integer[] i_array12 = removeDuplicates0.removeUsingSorting(i_array9);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates13 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates14 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST15 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array17 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i18 = sortedArrayToBST15.transform(i_array17);
        java.lang.Integer[] i_array19 = removeDuplicates14.removeUsingSorting(i_array17);
        java.lang.Integer[] i_array20 = removeDuplicates13.removeUsingSorting(i_array19);
        java.lang.Integer[] i_array21 = removeDuplicates0.removeUsingSorting(i_array20);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates22 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates23 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST24 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array26 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i27 = sortedArrayToBST24.transform(i_array26);
        java.lang.Integer[] i_array28 = removeDuplicates23.removeUsingSorting(i_array26);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST29 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array31 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i32 = sortedArrayToBST29.transform(i_array31);
        java.lang.Integer[] i_array33 = removeDuplicates23.removeUsingSorting(i_array31);
        java.lang.Integer[] i_array34 = removeDuplicates22.removeUsingSorting(i_array31);
        java.lang.Integer[] i_array39 = new java.lang.Integer[] { 2, (-14040), (-14040), 27 };
        java.lang.Integer[] i_array40 = removeDuplicates22.removeUsingSet(i_array39);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates41 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates42 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST43 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array45 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i46 = sortedArrayToBST43.transform(i_array45);
        java.lang.Integer[] i_array47 = removeDuplicates42.removeUsingSorting(i_array45);
        java.lang.Integer[] i_array48 = removeDuplicates41.removeUsingSorting(i_array47);
        java.lang.Integer[] i_array49 = removeDuplicates22.removeUsingSet(i_array48);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates50 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST51 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array53 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i54 = sortedArrayToBST51.transform(i_array53);
        java.lang.Integer[] i_array55 = removeDuplicates50.removeUsingSorting(i_array53);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST56 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array58 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i59 = sortedArrayToBST56.transform(i_array58);
        java.lang.Integer[] i_array60 = removeDuplicates50.removeUsingSorting(i_array58);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates61 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates62 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST63 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array65 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i66 = sortedArrayToBST63.transform(i_array65);
        java.lang.Integer[] i_array67 = removeDuplicates62.removeUsingSorting(i_array65);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST68 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array70 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i71 = sortedArrayToBST68.transform(i_array70);
        java.lang.Integer[] i_array72 = removeDuplicates62.removeUsingSorting(i_array70);
        java.lang.Integer[] i_array73 = removeDuplicates61.removeUsingSorting(i_array70);
        java.lang.Integer[] i_array74 = removeDuplicates50.removeUsingSet(i_array73);
        java.lang.Integer[] i_array75 = removeDuplicates22.removeUsingSet(i_array74);
        java.lang.Integer[] i_array76 = removeDuplicates0.removeUsingSorting(i_array75);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(binarynode_i5);
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(binarynode_i10);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(binarynode_i18);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(binarynode_i27);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(binarynode_i32);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(binarynode_i46);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(binarynode_i54);
        org.junit.Assert.assertNotNull(i_array55);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(binarynode_i59);
        org.junit.Assert.assertNotNull(i_array60);
        org.junit.Assert.assertNotNull(i_array65);
        org.junit.Assert.assertNotNull(binarynode_i66);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(i_array70);
        org.junit.Assert.assertNotNull(binarynode_i71);
        org.junit.Assert.assertNotNull(i_array72);
        org.junit.Assert.assertNotNull(i_array73);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertNotNull(i_array75);
        org.junit.Assert.assertNotNull(i_array76);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        com.github.pedrovgs.problem56.IsRotationUsingIsSubstring isRotationUsingIsSubstring0 = new com.github.pedrovgs.problem56.IsRotationUsingIsSubstring();
        boolean b3 = isRotationUsingIsSubstring0.check("", "[]");
        boolean b6 = isRotationUsingIsSubstring0.check("/hi!/", "hi!");
        boolean b9 = isRotationUsingIsSubstring0.check("/!ih/", "hi!");
        boolean b12 = isRotationUsingIsSubstring0.check("79", "1");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        int i9 = vector_i4.indexOf((java.lang.Object) 1);
        int i11 = vector_i4.indexOf((java.lang.Object) 100.0d);
        com.github.pedrovgs.problem45.FindNthMostRepeatedElement findNthMostRepeatedElement12 = new com.github.pedrovgs.problem45.FindNthMostRepeatedElement();
        boolean b13 = vector_i4.contains((java.lang.Object) findNthMostRepeatedElement12);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays14 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays15 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays14);
        com.github.pedrovgs.problem8.SplitArray splitArray16 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray17 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array20 = new int[] { (byte) 1, (byte) 10 };
        splitArray17.splitSwappingPartition(i_array20);
        splitArray16.splitSwappingRecursive(i_array20);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral23 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array24 = new int[][] {};
        int[] i_array25 = goThroughMatrixInSpiral23.go(i_array_array24);
        splitArray16.splitSwappingRecursive(i_array25);
        com.github.pedrovgs.problem80.QuickSort quickSort27 = new com.github.pedrovgs.problem80.QuickSort();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays28 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort29 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray30 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array33 = new int[] { (byte) 1, (byte) 10 };
        splitArray30.splitSwappingPartition(i_array33);
        selectionSort29.sort(i_array33);
        com.github.pedrovgs.problem8.SplitArray splitArray36 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array39 = new int[] { (byte) 1, (byte) 10 };
        splitArray36.splitSwappingPartition(i_array39);
        int[] i_array47 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray36.splitSwappingRecursive(i_array47);
        int[] i_array49 = mergeSortedArrays28.merge(i_array33, i_array47);
        quickSort27.sort(i_array33);
        int[] i_array51 = mergeSortedArrays14.merge(i_array25, i_array33);
        try {
            int i53 = findNthMostRepeatedElement12.find(i_array51, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array51);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers0 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        int i5 = mergeBinaryNumbers0.merge((int) (byte) 10, (-52000), 2147483647, (-52));
        int i10 = mergeBinaryNumbers0.merge(29, 107, 52, (int) (short) 1);
        int i15 = mergeBinaryNumbers0.merge(3, (-52), 18, 3628800);
        int i20 = mergeBinaryNumbers0.merge(52002, 112197661, (-6), 7);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i10 == 112197661);
        org.junit.Assert.assertTrue(i15 == (-13631485));
        org.junit.Assert.assertTrue(i20 == 1946209058);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
        com.github.pedrovgs.problem33.SimpleRegularExpression simpleRegularExpression0 = new com.github.pedrovgs.problem33.SimpleRegularExpression();
        boolean b3 = simpleRegularExpression0.evaluate("1", "97");
        boolean b6 = simpleRegularExpression0.evaluate("[", "[]");
        boolean b9 = simpleRegularExpression0.evaluate("/23/[/##001/", "0");
        boolean b12 = simpleRegularExpression0.evaluate("/32/-52/7/", "[-1, 10]");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
        com.github.pedrovgs.problem4.SquareRoot squareRoot0 = new com.github.pedrovgs.problem4.SquareRoot();
        float f2 = squareRoot0.calculateSquareRootIterative((int) ' ');
        float f4 = squareRoot0.calculateSquareRootRecursive(0);
        org.junit.Assert.assertTrue(f2 == 5.650014f);
        org.junit.Assert.assertTrue(f4 == 0.0f);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces0 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces1 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array7 = new char[] { '#', 'a', ' ', '4', 'a' };
        replaceSpaces1.replace(char_array7);
        replaceSpaces0.replace(char_array7);
        char[] char_array10 = null;
        try {
            replaceSpaces0.replace(char_array10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(char_array7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_0.push((int) (byte) 10);
        int i3 = stack1_0.getMin();
        int i4 = stack1_0.getMin();
        stack1_0.push(28);
        com.github.pedrovgs.problem65.IsTreeBalanced isTreeBalanced7 = new com.github.pedrovgs.problem65.IsTreeBalanced();
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor8 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals9 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST10 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array12 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i13 = sortedArrayToBST10.transform(i_array12);
        boolean b14 = binarynode_i13.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST15 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array17 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i18 = sortedArrayToBST15.transform(i_array17);
        boolean b19 = binarynode_i18.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i20 = binarynode_i18.getRight();
        boolean b21 = binaryTreeEquals9.areEqualsIterative(binarynode_i13, binarynode_i18);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST22 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array24 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i25 = sortedArrayToBST22.transform(i_array24);
        boolean b26 = binarynode_i25.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST27 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array29 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i30 = sortedArrayToBST27.transform(i_array29);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode31 = lowestCommonAncestor8.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i18, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i25, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i30);
        boolean b32 = isTreeBalanced7.check((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i30);
        int i33 = stack1_0.indexOf((java.lang.Object) isTreeBalanced7);
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(binarynode_i13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(binarynode_i18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(binarynode_i20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(binarynode_i25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(binarynode_i30);
        org.junit.Assert.assertNull(binaryNode31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(i33 == (-1));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = listnode_mergeSortedArrays3.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = listnode_mergeSortedArrays3.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i7 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i8 = null;
        binarynode_i7.setRight(binarynode_i8);
        boolean b10 = listnode_mergeSortedArrays3.equals((java.lang.Object) binarynode_i8);
        com.github.pedrovgs.linkedlist.ListNode listNode11 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode12 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays13 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays14 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays13);
        java.lang.String str15 = listnode_mergeSortedArrays14.toString();
        deleteListNode12.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays14);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays17 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays18 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays17);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers19 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b20 = listnode_mergeSortedArrays18.equals((java.lang.Object) mergeBinaryNumbers19);
        deleteListNode12.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays18);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i22 = reverseLinkedList1.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays18);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays23 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays24 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays23);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays25 = listnode_mergeSortedArrays24.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays26 = listnode_mergeSortedArrays24.getNext();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays27 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort28 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray29 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array32 = new int[] { (byte) 1, (byte) 10 };
        splitArray29.splitSwappingPartition(i_array32);
        selectionSort28.sort(i_array32);
        com.github.pedrovgs.problem8.SplitArray splitArray35 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array38 = new int[] { (byte) 1, (byte) 10 };
        splitArray35.splitSwappingPartition(i_array38);
        int[] i_array46 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray35.splitSwappingRecursive(i_array46);
        int[] i_array48 = mergeSortedArrays27.merge(i_array32, i_array46);
        listnode_mergeSortedArrays24.setData(mergeSortedArrays27);
        java.lang.String str50 = listnode_mergeSortedArrays24.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i51 = reverseLinkedList1.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays24);
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder52 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian53 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i55 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d56 = avlTreeMedian53.find(binarynode_i55);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor57 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals58 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST59 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array61 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i62 = sortedArrayToBST59.transform(i_array61);
        boolean b63 = binarynode_i62.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST64 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array66 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i67 = sortedArrayToBST64.transform(i_array66);
        boolean b68 = binarynode_i67.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i69 = binarynode_i67.getRight();
        boolean b70 = binaryTreeEquals58.areEqualsIterative(binarynode_i62, binarynode_i67);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST71 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array73 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i74 = sortedArrayToBST71.transform(i_array73);
        boolean b75 = binarynode_i74.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST76 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array78 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i79 = sortedArrayToBST76.transform(i_array78);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode80 = lowestCommonAncestor57.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i67, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i74, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i79);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i81 = binarynode_i67.getLeft();
        double d82 = avlTreeMedian53.find(binarynode_i67);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST83 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array85 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i86 = sortedArrayToBST83.transform(i_array85);
        boolean b87 = binarynode_i86.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i88 = binarynode_i86.getRight();
        java.lang.Integer i89 = binarynode_i86.getData();
        binarynode_i67.setLeft(binarynode_i86);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i91 = binaryTreeInOrder52.getIterative(binarynode_i86);
        boolean b92 = listnode_mergeSortedArrays24.equals((java.lang.Object) binaryTreeInOrder52);
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode94 = findKthElement0.find((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays24, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(listNode11);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(listnode_i22);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays25);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays26);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(listnode_i51);
        org.junit.Assert.assertTrue(d56 == 10.0d);
        org.junit.Assert.assertNotNull(i_array61);
        org.junit.Assert.assertNotNull(binarynode_i62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(i_array66);
        org.junit.Assert.assertNotNull(binarynode_i67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(binarynode_i69);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(i_array73);
        org.junit.Assert.assertNotNull(binarynode_i74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(i_array78);
        org.junit.Assert.assertNotNull(binarynode_i79);
        org.junit.Assert.assertNull(binaryNode80);
        org.junit.Assert.assertNull(binarynode_i81);
        org.junit.Assert.assertTrue(d82 == 100.0d);
        org.junit.Assert.assertNotNull(i_array85);
        org.junit.Assert.assertNotNull(binarynode_i86);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNull(binarynode_i88);
        org.junit.Assert.assertTrue("'" + i89 + "' != '" + 100 + "'", i89.equals(100));
        org.junit.Assert.assertNotNull(list_binarynode_i91);
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideRecursive(32, 51);
        org.junit.Assert.assertTrue(f3 == 0.627451f);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements0 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = listnode_mergeSortedArrays3.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = listnode_mergeSortedArrays3.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i7 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i8 = null;
        binarynode_i7.setRight(binarynode_i8);
        boolean b10 = listnode_mergeSortedArrays3.equals((java.lang.Object) binarynode_i8);
        com.github.pedrovgs.linkedlist.ListNode listNode11 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        removeListDuplicatedElements0.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode11);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements13 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList14 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays15 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays16 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays15);
        java.lang.String str17 = listnode_mergeSortedArrays16.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode18 = reverseLinkedList14.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays16);
        removeListDuplicatedElements13.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode18);
        removeListDuplicatedElements0.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode18);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList21 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements22 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList23 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays24 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays25 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays24);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays26 = listnode_mergeSortedArrays25.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays27 = listnode_mergeSortedArrays25.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i29 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i30 = null;
        binarynode_i29.setRight(binarynode_i30);
        boolean b32 = listnode_mergeSortedArrays25.equals((java.lang.Object) binarynode_i30);
        com.github.pedrovgs.linkedlist.ListNode listNode33 = reverseLinkedList23.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays25);
        removeListDuplicatedElements22.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode33);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements35 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList36 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays37 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays38 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays37);
        java.lang.String str39 = listnode_mergeSortedArrays38.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode40 = reverseLinkedList36.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays38);
        removeListDuplicatedElements35.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode40);
        removeListDuplicatedElements22.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode40);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i43 = getTheElementInTheMiddleOfTheList21.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode40);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements44 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList45 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays46 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays47 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays46);
        java.lang.String str48 = listnode_mergeSortedArrays47.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode49 = reverseLinkedList45.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays47);
        removeListDuplicatedElements44.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode49);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i51 = getTheElementInTheMiddleOfTheList21.get((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode49);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements52 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList53 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays54 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays55 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays54);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays56 = listnode_mergeSortedArrays55.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays57 = listnode_mergeSortedArrays55.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i59 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i60 = null;
        binarynode_i59.setRight(binarynode_i60);
        boolean b62 = listnode_mergeSortedArrays55.equals((java.lang.Object) binarynode_i60);
        com.github.pedrovgs.linkedlist.ListNode listNode63 = reverseLinkedList53.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays55);
        removeListDuplicatedElements52.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode63);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements65 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList66 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays67 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays68 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays67);
        java.lang.String str69 = listnode_mergeSortedArrays68.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode70 = reverseLinkedList66.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays68);
        removeListDuplicatedElements65.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode70);
        removeListDuplicatedElements52.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode70);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i73 = getTheElementInTheMiddleOfTheList21.get((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode70);
        removeListDuplicatedElements0.remove(listnode_i73);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements75 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList76 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays77 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays78 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays77);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays79 = listnode_mergeSortedArrays78.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays80 = listnode_mergeSortedArrays78.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i82 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i83 = null;
        binarynode_i82.setRight(binarynode_i83);
        boolean b85 = listnode_mergeSortedArrays78.equals((java.lang.Object) binarynode_i83);
        com.github.pedrovgs.linkedlist.ListNode listNode86 = reverseLinkedList76.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays78);
        removeListDuplicatedElements75.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode86);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements88 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList89 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays90 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays91 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays90);
        java.lang.String str92 = listnode_mergeSortedArrays91.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode93 = reverseLinkedList89.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays91);
        removeListDuplicatedElements88.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode93);
        removeListDuplicatedElements75.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode93);
        removeListDuplicatedElements0.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode93);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(listNode11);
        org.junit.Assert.assertNotNull(listNode18);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays26);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays27);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(listNode33);
        org.junit.Assert.assertNotNull(listNode40);
        org.junit.Assert.assertNotNull(listnode_i43);
        org.junit.Assert.assertNotNull(listNode49);
        org.junit.Assert.assertNotNull(listnode_i51);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays56);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays57);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(listNode63);
        org.junit.Assert.assertNotNull(listNode70);
        org.junit.Assert.assertNotNull(listnode_i73);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays79);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays80);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(listNode86);
        org.junit.Assert.assertNotNull(listNode93);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test129");
        com.github.pedrovgs.problem51.ReverseString reverseString0 = new com.github.pedrovgs.problem51.ReverseString();
        java.lang.String str2 = reverseString0.reverseRecursive("/hi!/");
        java.lang.String str4 = reverseString0.reverseIterative("100##");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/!ih/" + "'", str2.equals("/!ih/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "##001" + "'", str4.equals("##001"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
        com.github.pedrovgs.problem33.SimpleRegularExpression simpleRegularExpression0 = new com.github.pedrovgs.problem33.SimpleRegularExpression();
        boolean b3 = simpleRegularExpression0.evaluate("1", "97");
        boolean b6 = simpleRegularExpression0.evaluate("[", "[]");
        boolean b9 = simpleRegularExpression0.evaluate("/32/-52/7/", "[3]");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test131");
        com.github.pedrovgs.problem4.SquareRoot squareRoot0 = new com.github.pedrovgs.problem4.SquareRoot();
        float f2 = squareRoot0.calculateSquareRootIterative((int) ' ');
        float f4 = squareRoot0.calculateSquareRootIterative(0);
        org.junit.Assert.assertTrue(f2 == 5.650014f);
        org.junit.Assert.assertTrue(f4 == 0.0f);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.lang.Object obj8 = vector_i4.clone();
        vector_i4.trimToSize();
        java.util.stream.Stream<java.lang.Integer> stream_i10 = vector_i4.stream();
        try {
            java.util.ListIterator<java.lang.Integer> listiterator_i12 = vector_i4.listIterator((-5200));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stream_i10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test133");
        com.github.pedrovgs.problem7.FibonacciNumbers fibonacciNumbers0 = new com.github.pedrovgs.problem7.FibonacciNumbers();
        long long2 = fibonacciNumbers0.getIterative((long) 10);
        long long4 = fibonacciNumbers0.getRecursive((long) 32);
        org.junit.Assert.assertTrue(long2 == 55L);
        org.junit.Assert.assertTrue(long4 == 2178309L);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements0 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = listnode_mergeSortedArrays3.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = listnode_mergeSortedArrays3.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i7 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i8 = null;
        binarynode_i7.setRight(binarynode_i8);
        boolean b10 = listnode_mergeSortedArrays3.equals((java.lang.Object) binarynode_i8);
        com.github.pedrovgs.linkedlist.ListNode listNode11 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        removeListDuplicatedElements0.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode11);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList13 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays14 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays15 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays14);
        java.lang.String str16 = listnode_mergeSortedArrays15.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i17 = reverseLinkedList13.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays15);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode18 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays19 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays20 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays19);
        java.lang.String str21 = listnode_mergeSortedArrays20.toString();
        deleteListNode18.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays20);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays23 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays24 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays23);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers25 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b26 = listnode_mergeSortedArrays24.equals((java.lang.Object) mergeBinaryNumbers25);
        deleteListNode18.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays24);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i28 = reverseLinkedList13.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays24);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList29 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays30 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays31 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays30);
        java.lang.String str32 = listnode_mergeSortedArrays31.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i33 = reverseLinkedList29.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays31);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode34 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays35 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays36 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays35);
        java.lang.String str37 = listnode_mergeSortedArrays36.toString();
        deleteListNode34.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays36);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays39 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays40 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays39);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers41 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b42 = listnode_mergeSortedArrays40.equals((java.lang.Object) mergeBinaryNumbers41);
        deleteListNode34.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays40);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i44 = reverseLinkedList29.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays40);
        com.github.pedrovgs.linkedlist.ListNode listNode45 = reverseLinkedList13.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_i44);
        removeListDuplicatedElements0.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode45);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList47 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays48 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays49 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays48);
        java.lang.String str50 = listnode_mergeSortedArrays49.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode51 = reverseLinkedList47.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays49);
        com.github.pedrovgs.problem62.PalindromeList palindromeList52 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList53 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays54 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays55 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays54);
        java.lang.String str56 = listnode_mergeSortedArrays55.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i57 = reverseLinkedList53.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays55);
        boolean b58 = palindromeList52.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays55);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays59 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays60 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays59);
        java.lang.String str61 = listnode_mergeSortedArrays60.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays62 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays63 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays62);
        java.lang.String str64 = listnode_mergeSortedArrays63.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays65 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays63.setData(mergeSortedArrays65);
        listnode_mergeSortedArrays60.setNext(listnode_mergeSortedArrays63);
        boolean b68 = palindromeList52.checkReversing((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays60);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode69 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays70 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays71 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays70);
        java.lang.String str72 = listnode_mergeSortedArrays71.toString();
        deleteListNode69.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays71);
        boolean b74 = palindromeList52.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays71);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i75 = reverseLinkedList47.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays71);
        boolean b76 = listNode45.equals((java.lang.Object) listnode_i75);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(listNode11);
        org.junit.Assert.assertNotNull(listnode_i17);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(listnode_i28);
        org.junit.Assert.assertNotNull(listnode_i33);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(listnode_i44);
        org.junit.Assert.assertNotNull(listNode45);
        org.junit.Assert.assertNotNull(listNode51);
        org.junit.Assert.assertNotNull(listnode_i57);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(listnode_i75);
        org.junit.Assert.assertTrue(b76 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        try {
            java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("/!ih", "!ih");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(0);
        int i4 = factorial0.getTailRecursive((int) (byte) 10);
        int i6 = factorial0.getIterative((int) ' ');
        int i8 = factorial0.getRecursive(6);
        try {
            int i10 = factorial0.getTailRecursive((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 1);
        org.junit.Assert.assertTrue(i4 == 3628800);
        org.junit.Assert.assertTrue(i6 == (-2147483648));
        org.junit.Assert.assertTrue(i8 == 720);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
        com.github.pedrovgs.problem30.ScientificNotation scientificNotation0 = new com.github.pedrovgs.problem30.ScientificNotation();
        try {
            long long2 = scientificNotation0.calculate("[3]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
        com.github.pedrovgs.problem53.CompressString compressString0 = new com.github.pedrovgs.problem53.CompressString();
        java.lang.String str2 = compressString0.compressRecursive("97");
        java.lang.String str4 = compressString0.compressAlternativeApproach("hi!");
        java.lang.String str6 = compressString0.compress("[]");
        java.lang.String str8 = compressString0.compress("/hi!/");
        java.lang.String str10 = compressString0.compressAlternativeApproach("[]");
        java.lang.String str12 = compressString0.compress("/!ih/");
        java.lang.String str14 = compressString0.compressAlternativeApproach("[null]");
        java.lang.String str16 = compressString0.compress("0");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97" + "'", str2.equals("97"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/hi!" + "'", str8.equals("/hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "/!ih" + "'", str12.equals("/!ih"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[nul2]" + "'", str14.equals("[nul2]"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "0" + "'", str16.equals("0"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
        com.github.pedrovgs.problem40.MoveElementsToPositions moveElementsToPositions0 = new com.github.pedrovgs.problem40.MoveElementsToPositions();
        com.github.pedrovgs.problem39.MultiplyArrayElements multiplyArrayElements1 = new com.github.pedrovgs.problem39.MultiplyArrayElements();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral2 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array3 = new int[][] {};
        int[] i_array4 = goThroughMatrixInSpiral2.go(i_array_array3);
        int[] i_array5 = multiplyArrayElements1.multiply(i_array4);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral6 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array7 = new int[][] {};
        int[] i_array8 = goThroughMatrixInSpiral6.go(i_array_array7);
        int[] i_array11 = new int[] { 107, 3628800 };
        int[][] i_array_array12 = new int[][] { i_array11 };
        int[] i_array13 = goThroughMatrixInSpiral6.go(i_array_array12);
        int[] i_array14 = multiplyArrayElements1.multiply(i_array13);
        try {
            moveElementsToPositions0.move(i_array14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array_array3);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array7);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array_array12);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array14);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange2 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange3 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "97", combinationsOfChange2);
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange4 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "]1- ,1 ,1 ,0[", combinationsOfChange2);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
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
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(i_array_array13);
        org.junit.Assert.assertNotNull(i_array14);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push((-1));
        stack2_0.trimToSize();
        stack2_0.setSize((int) (byte) 100);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
        com.github.pedrovgs.problem47.ReturnChange returnChange0 = new com.github.pedrovgs.problem47.ReturnChange();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem47.ReturnChange> listnode_returnChange1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem47.ReturnChange>(returnChange0);
        com.github.pedrovgs.problem65.IsTreeBalanced isTreeBalanced2 = new com.github.pedrovgs.problem65.IsTreeBalanced();
        com.github.pedrovgs.problem75.SelectionSort selectionSort3 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem65.IsTreeBalanced, com.github.pedrovgs.problem75.SelectionSort> pair_isTreeBalanced_selectionSort4 = new com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem65.IsTreeBalanced, com.github.pedrovgs.problem75.SelectionSort>(isTreeBalanced2, selectionSort3);
        com.github.pedrovgs.problem72.FindTheMissingNumber findTheMissingNumber5 = new com.github.pedrovgs.problem72.FindTheMissingNumber();
        com.github.pedrovgs.problem75.SelectionSort selectionSort6 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray7 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array10 = new int[] { (byte) 1, (byte) 10 };
        splitArray7.splitSwappingPartition(i_array10);
        selectionSort6.sort(i_array10);
        int i13 = findTheMissingNumber5.find(i_array10);
        selectionSort3.sort(i_array10);
        java.util.List<java.lang.Integer> list_i16 = returnChange0.calculate(i_array10, (int) (byte) 100);
        com.github.pedrovgs.problem72.FindTheMissingNumber findTheMissingNumber17 = new com.github.pedrovgs.problem72.FindTheMissingNumber();
        com.github.pedrovgs.problem75.SelectionSort selectionSort18 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray19 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array22 = new int[] { (byte) 1, (byte) 10 };
        splitArray19.splitSwappingPartition(i_array22);
        selectionSort18.sort(i_array22);
        int i25 = findTheMissingNumber17.find(i_array22);
        java.util.List<java.lang.Integer> list_i27 = returnChange0.calculate(i_array22, 3628800);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertTrue(i13 == (-8));
        org.junit.Assert.assertNotNull(list_i16);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertTrue(i25 == (-8));
        org.junit.Assert.assertNotNull(list_i27);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros0 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros1 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral2 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array3 = new int[][] {};
        int[] i_array4 = goThroughMatrixInSpiral2.go(i_array_array3);
        int[] i_array7 = new int[] { 107, 3628800 };
        int[][] i_array_array8 = new int[][] { i_array7 };
        int[] i_array9 = goThroughMatrixInSpiral2.go(i_array_array8);
        rewriteRowAndColumnsWithZeros1.rewrite(i_array_array8);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral11 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array12 = new int[][] {};
        int[] i_array13 = goThroughMatrixInSpiral11.go(i_array_array12);
        rewriteRowAndColumnsWithZeros1.rewrite(i_array_array12);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral15 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array16 = new int[][] {};
        int[] i_array17 = goThroughMatrixInSpiral15.go(i_array_array16);
        int[] i_array24 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[] i_array31 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[][] i_array_array32 = new int[][] { i_array24, i_array31 };
        int[] i_array33 = goThroughMatrixInSpiral15.go(i_array_array32);
        rewriteRowAndColumnsWithZeros1.rewrite(i_array_array32);
        rewriteRowAndColumnsWithZeros0.rewrite(i_array_array32);
        org.junit.Assert.assertNotNull(i_array_array3);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(i_array7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(i_array_array12);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(i_array_array32);
        org.junit.Assert.assertNotNull(i_array33);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
        com.github.pedrovgs.problem62.PalindromeList palindromeList0 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem62.PalindromeList palindromeList1 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList2 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i6 = reverseLinkedList2.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        boolean b7 = palindromeList1.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        boolean b8 = palindromeList0.checkReversing((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        com.github.pedrovgs.linkedlist.ListNode listNode9 = null;
        try {
            boolean b10 = palindromeList0.checkIterative(listNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(listnode_i6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList10 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays11 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays12 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays11);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays13 = listnode_mergeSortedArrays12.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays14 = listnode_mergeSortedArrays12.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i16 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i17 = null;
        binarynode_i16.setRight(binarynode_i17);
        boolean b19 = listnode_mergeSortedArrays12.equals((java.lang.Object) binarynode_i17);
        com.github.pedrovgs.linkedlist.ListNode listNode20 = reverseLinkedList10.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays12);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode21 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays22 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays23 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays22);
        java.lang.String str24 = listnode_mergeSortedArrays23.toString();
        deleteListNode21.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays23);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays26 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays27 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays26);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers28 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b29 = listnode_mergeSortedArrays27.equals((java.lang.Object) mergeBinaryNumbers28);
        deleteListNode21.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays27);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i31 = reverseLinkedList10.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays27);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays32 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays33 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays32);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers34 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b35 = listnode_mergeSortedArrays33.equals((java.lang.Object) mergeBinaryNumbers34);
        com.github.pedrovgs.linkedlist.ListNode listNode36 = reverseLinkedList10.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays33);
        boolean b37 = vector_i4.remove((java.lang.Object) listnode_mergeSortedArrays33);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates38 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        int i40 = vector_i4.indexOf((java.lang.Object) removeDuplicates38, 4);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays13);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays14);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(listNode20);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(listnode_i31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(listNode36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i40 == (-1));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.lang.Object obj8 = vector_i4.clone();
        vector_i4.trimToSize();
        vector_i4.clear();
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel11 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem18.IsBST isBST12 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST13 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array15 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i16 = sortedArrayToBST13.transform(i_array15);
        boolean b17 = isBST12.checkRecursive(binarynode_i16);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode18 = binaryTreeByLevel11.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i16);
        int i19 = vector_i4.lastIndexOf((java.lang.Object) binaryTreeByLevel11);
        vector_i4.addElement((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(binarynode_i16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(list_binaryNode18);
        org.junit.Assert.assertTrue(i19 == (-1));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
        com.github.pedrovgs.problem56.IsRotationUsingIsSubstring isRotationUsingIsSubstring0 = new com.github.pedrovgs.problem56.IsRotationUsingIsSubstring();
        boolean b3 = isRotationUsingIsSubstring0.check("hi!", "");
        boolean b6 = isRotationUsingIsSubstring0.check("/", "");
        boolean b9 = isRotationUsingIsSubstring0.check("hi!", "7");
        boolean b12 = isRotationUsingIsSubstring0.check("[1, -1, 100, 0]", "3");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
        com.github.pedrovgs.problem69.BitsToTransform bitsToTransform0 = new com.github.pedrovgs.problem69.BitsToTransform();
        int i3 = bitsToTransform0.calculate((int) '#', (int) (short) 0);
        int i6 = bitsToTransform0.calculate(51, (int) 'a');
        int i9 = bitsToTransform0.calculate((int) 'a', (int) (byte) -1);
        int i12 = bitsToTransform0.calculate(1, (int) (short) 1);
        int i15 = bitsToTransform0.calculate(51, 3);
        org.junit.Assert.assertTrue(i3 == 3);
        org.junit.Assert.assertTrue(i6 == 3);
        org.junit.Assert.assertTrue(i9 == 29);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 2);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
        com.github.pedrovgs.problem53.CompressString compressString0 = new com.github.pedrovgs.problem53.CompressString();
        java.lang.String str2 = compressString0.compressRecursive("97");
        java.lang.String str4 = compressString0.compressAlternativeApproach("hi!");
        java.lang.String str6 = compressString0.compress("[]");
        java.lang.String str8 = compressString0.compress("/hi!/");
        java.lang.String str10 = compressString0.compressAlternativeApproach("[]");
        java.lang.String str12 = compressString0.compress("/!ih/");
        java.lang.String str14 = compressString0.compressAlternativeApproach("[null]");
        java.lang.String str16 = compressString0.compressRecursive("/23/[/##001/");
        java.lang.String str18 = compressString0.compressRecursive("!ih");
        java.lang.String str20 = compressString0.compressRecursive("[1, -1, 102, 0]");
        java.lang.String str22 = compressString0.compress("100##");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97" + "'", str2.equals("97"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/hi!" + "'", str8.equals("/hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "/!ih" + "'", str12.equals("/!ih"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[nul2]" + "'", str14.equals("[nul2]"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "/23/[/#2021/" + "'", str16.equals("/23/[/#2021/"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "!ih" + "'", str18.equals("!ih"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[1, -1, 102, 0]" + "'", str20.equals("[1, -1, 102, 0]"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "102#2" + "'", str22.equals("102#2"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
        com.github.pedrovgs.problem30.ScientificNotation scientificNotation0 = new com.github.pedrovgs.problem30.ScientificNotation();
        try {
            long long2 = scientificNotation0.calculate("]1-[");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
        java.lang.Integer[] i_array1 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i2 = new java.util.Stack<java.lang.Integer>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i2, i_array1);
        boolean b4 = stack_i2.empty();
        int i5 = stack_i2.size();
        java.lang.Integer i6 = stack_i2.lastElement();
        org.junit.Assert.assertNotNull(i_array1);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + i6 + "' != '" + (-1) + "'", i6.equals((-1)));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        try {
            java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersCheating("0", "32");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
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
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor28 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals29 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST30 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array32 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i33 = sortedArrayToBST30.transform(i_array32);
        boolean b34 = binarynode_i33.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST35 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array37 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i38 = sortedArrayToBST35.transform(i_array37);
        boolean b39 = binarynode_i38.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i40 = binarynode_i38.getRight();
        boolean b41 = binaryTreeEquals29.areEqualsIterative(binarynode_i33, binarynode_i38);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST42 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array44 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i45 = sortedArrayToBST42.transform(i_array44);
        boolean b46 = binarynode_i45.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST47 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array49 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i50 = sortedArrayToBST47.transform(i_array49);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode51 = lowestCommonAncestor28.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i38, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i45, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i50);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i52 = binarynode_i38.getLeft();
        double d53 = avlTreeMedian24.find(binarynode_i38);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST54 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array56 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i57 = sortedArrayToBST54.transform(i_array56);
        boolean b58 = binarynode_i57.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i59 = binarynode_i57.getRight();
        java.lang.Integer i60 = binarynode_i57.getData();
        binarynode_i38.setLeft(binarynode_i57);
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian62 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i64 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d65 = avlTreeMedian62.find(binarynode_i64);
        com.github.pedrovgs.problem38.PathToEveryLeaf pathToEveryLeaf66 = new com.github.pedrovgs.problem38.PathToEveryLeaf();
        com.github.pedrovgs.binarytree.BinaryNode<com.github.pedrovgs.problem38.PathToEveryLeaf> binarynode_pathToEveryLeaf67 = new com.github.pedrovgs.binarytree.BinaryNode<com.github.pedrovgs.problem38.PathToEveryLeaf>(pathToEveryLeaf66);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode68 = lowestCommonAncestor0.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i38, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i64, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_pathToEveryLeaf67);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i69 = binarynode_i64.getLeft();
        try {
            com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i70 = binarynode_i69.getLeft();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(binarynode_i5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(binarynode_i10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(binarynode_i12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(binarynode_i17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(binarynode_i22);
        org.junit.Assert.assertNull(binaryNode23);
        org.junit.Assert.assertTrue(d27 == 10.0d);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(binarynode_i33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(binarynode_i38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(binarynode_i40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(binarynode_i45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(binarynode_i50);
        org.junit.Assert.assertNull(binaryNode51);
        org.junit.Assert.assertNull(binarynode_i52);
        org.junit.Assert.assertTrue(d53 == 100.0d);
        org.junit.Assert.assertNotNull(i_array56);
        org.junit.Assert.assertNotNull(binarynode_i57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(binarynode_i59);
        org.junit.Assert.assertTrue("'" + i60 + "' != '" + 100 + "'", i60.equals(100));
        org.junit.Assert.assertTrue(d65 == 10.0d);
        org.junit.Assert.assertNull(binaryNode68);
        org.junit.Assert.assertNull(binarynode_i69);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test155");
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements0 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = listnode_mergeSortedArrays3.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = listnode_mergeSortedArrays3.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i7 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i8 = null;
        binarynode_i7.setRight(binarynode_i8);
        boolean b10 = listnode_mergeSortedArrays3.equals((java.lang.Object) binarynode_i8);
        com.github.pedrovgs.linkedlist.ListNode listNode11 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        removeListDuplicatedElements0.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode11);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements13 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList14 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays15 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays16 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays15);
        java.lang.String str17 = listnode_mergeSortedArrays16.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode18 = reverseLinkedList14.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays16);
        removeListDuplicatedElements13.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode18);
        removeListDuplicatedElements0.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode18);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements21 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList22 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays23 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays24 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays23);
        java.lang.String str25 = listnode_mergeSortedArrays24.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode26 = reverseLinkedList22.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays24);
        removeListDuplicatedElements21.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode26);
        removeListDuplicatedElements0.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode26);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList29 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays30 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays31 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays30);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays32 = listnode_mergeSortedArrays31.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays33 = listnode_mergeSortedArrays31.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i35 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i36 = null;
        binarynode_i35.setRight(binarynode_i36);
        boolean b38 = listnode_mergeSortedArrays31.equals((java.lang.Object) binarynode_i36);
        com.github.pedrovgs.linkedlist.ListNode listNode39 = reverseLinkedList29.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays31);
        com.github.pedrovgs.problem62.PalindromeList palindromeList40 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList41 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays42 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays43 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays42);
        java.lang.String str44 = listnode_mergeSortedArrays43.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i45 = reverseLinkedList41.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays43);
        boolean b46 = palindromeList40.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays43);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays47 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays48 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays47);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays49 = listnode_mergeSortedArrays48.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays50 = listnode_mergeSortedArrays48.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i52 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i53 = null;
        binarynode_i52.setRight(binarynode_i53);
        boolean b55 = listnode_mergeSortedArrays48.equals((java.lang.Object) binarynode_i53);
        listnode_mergeSortedArrays43.setNext(listnode_mergeSortedArrays48);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays57 = listnode_mergeSortedArrays48.getData();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements58 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList59 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays60 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays61 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays60);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays62 = listnode_mergeSortedArrays61.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays63 = listnode_mergeSortedArrays61.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i65 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i66 = null;
        binarynode_i65.setRight(binarynode_i66);
        boolean b68 = listnode_mergeSortedArrays61.equals((java.lang.Object) binarynode_i66);
        com.github.pedrovgs.linkedlist.ListNode listNode69 = reverseLinkedList59.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays61);
        removeListDuplicatedElements58.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode69);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements> listnode_removeListDuplicatedElements71 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements>(removeListDuplicatedElements58);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList72 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements73 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList74 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays75 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays76 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays75);
        java.lang.String str77 = listnode_mergeSortedArrays76.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode78 = reverseLinkedList74.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays76);
        removeListDuplicatedElements73.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode78);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i80 = getTheElementInTheMiddleOfTheList72.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode78);
        removeListDuplicatedElements58.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode78);
        listnode_mergeSortedArrays48.setNext((com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>) listNode78);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i83 = reverseLinkedList29.reverseRecursive(listNode78);
        removeListDuplicatedElements0.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode78);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList85 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays86 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays87 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays86);
        java.lang.String str88 = listnode_mergeSortedArrays87.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i89 = reverseLinkedList85.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays87);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays90 = listnode_mergeSortedArrays87.getNext();
        listNode78.setNext(listnode_mergeSortedArrays87);
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian92 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i94 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d95 = avlTreeMedian92.find(binarynode_i94);
        boolean b96 = listnode_mergeSortedArrays87.equals((java.lang.Object) binarynode_i94);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(listNode11);
        org.junit.Assert.assertNotNull(listNode18);
        org.junit.Assert.assertNotNull(listNode26);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays32);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays33);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(listNode39);
        org.junit.Assert.assertNotNull(listnode_i45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays49);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays50);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(mergeSortedArrays57);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays62);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays63);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(listNode69);
        org.junit.Assert.assertNotNull(listNode78);
        org.junit.Assert.assertNotNull(listnode_i80);
        org.junit.Assert.assertNotNull(listnode_i83);
        org.junit.Assert.assertNotNull(listnode_i89);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays90);
        org.junit.Assert.assertTrue(d95 == 10.0d);
        org.junit.Assert.assertTrue(b96 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push(100);
        int i3 = stack2_0.capacity();
        java.util.Iterator<java.lang.Integer> iterator_i4 = stack2_0.iterator();
        java.lang.Object[] obj_array5 = stack2_0.toArray();
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertNotNull(iterator_i4);
        org.junit.Assert.assertNotNull(obj_array5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        com.github.pedrovgs.problem50.UniqueChars uniqueChars0 = new com.github.pedrovgs.problem50.UniqueChars();
        boolean b2 = uniqueChars0.evaluate2("/hi!/");
        boolean b4 = uniqueChars0.evaluate("35");
        boolean b6 = uniqueChars0.evaluate2("[0, 1, 1, -1]");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        java.util.Enumeration<java.lang.Integer> enumeration_i10 = vector_i4.elements();
        vector_i4.ensureCapacity((-52));
        java.lang.Integer i15 = vector_i4.set((int) (short) 0, (java.lang.Integer) 3);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(enumeration_i10);
        org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0 + "'", i15.equals(0));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        com.github.pedrovgs.problem54.RotateMatrix rotateMatrix0 = new com.github.pedrovgs.problem54.RotateMatrix();
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros1 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral2 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array3 = new int[][] {};
        int[] i_array4 = goThroughMatrixInSpiral2.go(i_array_array3);
        int[] i_array7 = new int[] { 107, 3628800 };
        int[][] i_array_array8 = new int[][] { i_array7 };
        int[] i_array9 = goThroughMatrixInSpiral2.go(i_array_array8);
        rewriteRowAndColumnsWithZeros1.rewrite(i_array_array8);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral11 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array12 = new int[][] {};
        int[] i_array13 = goThroughMatrixInSpiral11.go(i_array_array12);
        int[] i_array16 = new int[] { 107, 3628800 };
        int[][] i_array_array17 = new int[][] { i_array16 };
        int[] i_array18 = goThroughMatrixInSpiral11.go(i_array_array17);
        rewriteRowAndColumnsWithZeros1.rewrite(i_array_array17);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros> listnode_rewriteRowAndColumnsWithZeros20 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros>(rewriteRowAndColumnsWithZeros1);
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros21 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral22 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array23 = new int[][] {};
        int[] i_array24 = goThroughMatrixInSpiral22.go(i_array_array23);
        int[] i_array27 = new int[] { 107, 3628800 };
        int[][] i_array_array28 = new int[][] { i_array27 };
        int[] i_array29 = goThroughMatrixInSpiral22.go(i_array_array28);
        rewriteRowAndColumnsWithZeros21.rewrite(i_array_array28);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral31 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array32 = new int[][] {};
        int[] i_array33 = goThroughMatrixInSpiral31.go(i_array_array32);
        rewriteRowAndColumnsWithZeros21.rewrite(i_array_array32);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral35 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array36 = new int[][] {};
        int[] i_array37 = goThroughMatrixInSpiral35.go(i_array_array36);
        int[] i_array44 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[] i_array51 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[][] i_array_array52 = new int[][] { i_array44, i_array51 };
        int[] i_array53 = goThroughMatrixInSpiral35.go(i_array_array52);
        rewriteRowAndColumnsWithZeros21.rewrite(i_array_array52);
        rewriteRowAndColumnsWithZeros1.rewrite(i_array_array52);
        try {
            rotateMatrix0.rotate(i_array_array52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array_array3);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(i_array7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(i_array_array12);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertNotNull(i_array_array23);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array_array28);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array32);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array_array52);
        org.junit.Assert.assertNotNull(i_array53);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_0.push((int) (byte) 10);
        int i3 = stack1_0.getMin();
        int i4 = stack1_0.getMin();
        com.github.pedrovgs.problem75.SelectionSort selectionSort5 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray6 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array9 = new int[] { (byte) 1, (byte) 10 };
        splitArray6.splitSwappingPartition(i_array9);
        selectionSort5.sort(i_array9);
        int i12 = stack1_0.search((java.lang.Object) i_array9);
        stack1_0.push(720);
        stack1_0.clear();
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnPowersOfTwo("", "");
        try {
            java.lang.String str6 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("/###01001/79/", "/32/-52/7/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        java.lang.Integer i2 = stack2_0.push((java.lang.Integer) 5);
        com.github.pedrovgs.problem68.IsEven isEven3 = new com.github.pedrovgs.problem68.IsEven();
        boolean b5 = isEven3.check((int) (byte) 1);
        boolean b7 = isEven3.check(0);
        boolean b9 = isEven3.check(4);
        boolean b11 = isEven3.check((int) (short) 10);
        int i12 = stack2_0.indexOf((java.lang.Object) b11);
        java.lang.Integer i13 = stack2_0.firstElement();
        java.util.function.UnaryOperator<java.lang.Integer> unaryoperator_i14 = null;
        try {
            stack2_0.replaceAll(unaryoperator_i14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + i2 + "' != '" + 5 + "'", i2.equals(5));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue("'" + i13 + "' != '" + 5 + "'", i13.equals(5));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push((-1));
        stack2_0.removeAllElements();
        java.lang.Object obj4 = stack2_0.clone();
        boolean b6 = stack2_0.add((java.lang.Integer) (-52));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
        com.github.pedrovgs.problem7.FibonacciNumbers fibonacciNumbers0 = new com.github.pedrovgs.problem7.FibonacciNumbers();
        long long2 = fibonacciNumbers0.getIterative((long) 10);
        long long4 = fibonacciNumbers0.getIterative((long) (byte) 100);
        org.junit.Assert.assertTrue(long2 == 55L);
        org.junit.Assert.assertTrue(long4 == 3736710778780434371L);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates0 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates1 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST2 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = sortedArrayToBST2.transform(i_array4);
        java.lang.Integer[] i_array6 = removeDuplicates1.removeUsingSorting(i_array4);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST7 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array9 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i10 = sortedArrayToBST7.transform(i_array9);
        java.lang.Integer[] i_array11 = removeDuplicates1.removeUsingSorting(i_array9);
        java.lang.Integer[] i_array12 = removeDuplicates0.removeUsingSorting(i_array9);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates13 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST14 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array16 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i17 = sortedArrayToBST14.transform(i_array16);
        java.lang.Integer[] i_array18 = removeDuplicates13.removeUsingSorting(i_array16);
        java.lang.Integer[] i_array19 = removeDuplicates0.removeUsingSet(i_array16);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(binarynode_i5);
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(binarynode_i10);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(binarynode_i17);
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertNotNull(i_array19);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
        com.github.pedrovgs.problem38.PathToEveryLeaf pathToEveryLeaf0 = new com.github.pedrovgs.problem38.PathToEveryLeaf();
        com.github.pedrovgs.binarytree.BinaryNode<com.github.pedrovgs.problem38.PathToEveryLeaf> binarynode_pathToEveryLeaf1 = new com.github.pedrovgs.binarytree.BinaryNode<com.github.pedrovgs.problem38.PathToEveryLeaf>(pathToEveryLeaf0);
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder2 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian3 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d6 = avlTreeMedian3.find(binarynode_i5);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor7 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals8 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST9 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array11 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i12 = sortedArrayToBST9.transform(i_array11);
        boolean b13 = binarynode_i12.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST14 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array16 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i17 = sortedArrayToBST14.transform(i_array16);
        boolean b18 = binarynode_i17.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i19 = binarynode_i17.getRight();
        boolean b20 = binaryTreeEquals8.areEqualsIterative(binarynode_i12, binarynode_i17);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST21 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array23 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i24 = sortedArrayToBST21.transform(i_array23);
        boolean b25 = binarynode_i24.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST26 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array28 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i29 = sortedArrayToBST26.transform(i_array28);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode30 = lowestCommonAncestor7.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i17, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i24, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i29);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i31 = binarynode_i17.getLeft();
        double d32 = avlTreeMedian3.find(binarynode_i17);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST33 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array35 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i36 = sortedArrayToBST33.transform(i_array35);
        boolean b37 = binarynode_i36.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i38 = binarynode_i36.getRight();
        java.lang.Integer i39 = binarynode_i36.getData();
        binarynode_i17.setLeft(binarynode_i36);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i41 = binaryTreeInOrder2.getIterative(binarynode_i36);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST42 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array44 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i45 = sortedArrayToBST42.transform(i_array44);
        java.lang.String str46 = binarynode_i45.toString();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i47 = binaryTreeInOrder2.getIterative(binarynode_i45);
        java.util.List<java.util.List<com.github.pedrovgs.binarytree.BinaryNode>> list_list_binaryNode48 = pathToEveryLeaf0.calculate(binarynode_i45);
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel49 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel50 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem18.IsBST isBST51 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST52 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array54 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i55 = sortedArrayToBST52.transform(i_array54);
        boolean b56 = isBST51.checkRecursive(binarynode_i55);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode57 = binaryTreeByLevel50.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i55);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode58 = binaryTreeByLevel49.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i55);
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel59 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel60 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem18.IsBST isBST61 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST62 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array64 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i65 = sortedArrayToBST62.transform(i_array64);
        boolean b66 = isBST61.checkRecursive(binarynode_i65);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode67 = binaryTreeByLevel60.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i65);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode68 = binaryTreeByLevel59.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i65);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode69 = binaryTreeByLevel49.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i65);
        java.util.List<java.util.List<com.github.pedrovgs.binarytree.BinaryNode>> list_list_binaryNode70 = pathToEveryLeaf0.calculate(binarynode_i65);
        org.junit.Assert.assertTrue(d6 == 10.0d);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(binarynode_i12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(binarynode_i17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(binarynode_i19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(binarynode_i24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(binarynode_i29);
        org.junit.Assert.assertNull(binaryNode30);
        org.junit.Assert.assertNull(binarynode_i31);
        org.junit.Assert.assertTrue(d32 == 100.0d);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(binarynode_i36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(binarynode_i38);
        org.junit.Assert.assertTrue("'" + i39 + "' != '" + 100 + "'", i39.equals(100));
        org.junit.Assert.assertNotNull(list_binarynode_i41);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(binarynode_i45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "BinaryNode{data=100}" + "'", str46.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertNotNull(list_binarynode_i47);
        org.junit.Assert.assertNotNull(list_list_binaryNode48);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(binarynode_i55);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(list_binaryNode57);
        org.junit.Assert.assertNotNull(list_binaryNode58);
        org.junit.Assert.assertNotNull(i_array64);
        org.junit.Assert.assertNotNull(binarynode_i65);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(list_binaryNode67);
        org.junit.Assert.assertNotNull(list_binaryNode68);
        org.junit.Assert.assertNotNull(list_binaryNode69);
        org.junit.Assert.assertNotNull(list_list_binaryNode70);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        com.github.pedrovgs.problem26.Palindromes palindromes0 = new com.github.pedrovgs.problem26.Palindromes();
        boolean b2 = palindromes0.evaluate("/");
        boolean b4 = palindromes0.evaluate("10");
        boolean b6 = palindromes0.evaluate("/23/[/#2021/");
        boolean b8 = palindromes0.evaluate("7");
        boolean b10 = palindromes0.evaluate("-1");
        boolean b12 = palindromes0.evaluate("32");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
        com.github.pedrovgs.problem25.Anagrams anagrams0 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str2 = anagrams0.get("hi!");
        java.util.List<java.lang.String> list_str4 = anagrams0.get("100");
        java.util.List<java.lang.String> list_str6 = anagrams0.get("3");
        org.junit.Assert.assertNotNull(list_str2);
        org.junit.Assert.assertNotNull(list_str4);
        org.junit.Assert.assertNotNull(list_str6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
        com.github.pedrovgs.problem16.BinaryTreePostOrder binaryTreePostOrder0 = new com.github.pedrovgs.problem16.BinaryTreePostOrder();
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder1 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian2 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i4 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d5 = avlTreeMedian2.find(binarynode_i4);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor6 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals7 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST8 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array10 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i11 = sortedArrayToBST8.transform(i_array10);
        boolean b12 = binarynode_i11.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST13 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array15 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i16 = sortedArrayToBST13.transform(i_array15);
        boolean b17 = binarynode_i16.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i18 = binarynode_i16.getRight();
        boolean b19 = binaryTreeEquals7.areEqualsIterative(binarynode_i11, binarynode_i16);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST20 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array22 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i23 = sortedArrayToBST20.transform(i_array22);
        boolean b24 = binarynode_i23.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST25 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array27 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i28 = sortedArrayToBST25.transform(i_array27);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode29 = lowestCommonAncestor6.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i16, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i23, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i28);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i30 = binarynode_i16.getLeft();
        double d31 = avlTreeMedian2.find(binarynode_i16);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST32 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array34 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i35 = sortedArrayToBST32.transform(i_array34);
        boolean b36 = binarynode_i35.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i37 = binarynode_i35.getRight();
        java.lang.Integer i38 = binarynode_i35.getData();
        binarynode_i16.setLeft(binarynode_i35);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i40 = binaryTreeInOrder1.getIterative(binarynode_i35);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode41 = binaryTreePostOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i35);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i43 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 27);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode44 = binaryTreePostOrder0.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i43);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i45 = binarynode_i43.getRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i46 = binarynode_i43.getLeft();
        org.junit.Assert.assertTrue(d5 == 10.0d);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(binarynode_i11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(binarynode_i16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(binarynode_i18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(binarynode_i23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(binarynode_i28);
        org.junit.Assert.assertNull(binaryNode29);
        org.junit.Assert.assertNull(binarynode_i30);
        org.junit.Assert.assertTrue(d31 == 100.0d);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(binarynode_i35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(binarynode_i37);
        org.junit.Assert.assertTrue("'" + i38 + "' != '" + 100 + "'", i38.equals(100));
        org.junit.Assert.assertNotNull(list_binarynode_i40);
        org.junit.Assert.assertNotNull(list_binaryNode41);
        org.junit.Assert.assertNotNull(list_binaryNode44);
        org.junit.Assert.assertNull(binarynode_i45);
        org.junit.Assert.assertNull(binarynode_i46);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers0 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        int i5 = mergeBinaryNumbers0.merge((int) (byte) 10, (-52000), 2147483647, (-52));
        int i10 = mergeBinaryNumbers0.merge(29, 107, 52, (int) (short) 1);
        int i15 = mergeBinaryNumbers0.merge(3, (-52), 18, 3628800);
        com.github.pedrovgs.problem25.Anagrams anagrams16 = new com.github.pedrovgs.problem25.Anagrams();
        com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem67.MergeBinaryNumbers, com.github.pedrovgs.problem25.Anagrams> pair_mergeBinaryNumbers_anagrams17 = new com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem67.MergeBinaryNumbers, com.github.pedrovgs.problem25.Anagrams>(mergeBinaryNumbers0, anagrams16);
        int i22 = mergeBinaryNumbers0.merge((-2147483648), (-2147483648), 4, 78);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i10 == 112197661);
        org.junit.Assert.assertTrue(i15 == (-13631485));
        org.junit.Assert.assertTrue(i22 == (-2147483648));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
        com.github.pedrovgs.problem62.PalindromeList palindromeList0 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem62.PalindromeList palindromeList1 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList2 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i6 = reverseLinkedList2.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        boolean b7 = palindromeList1.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        boolean b8 = palindromeList0.checkReversing((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays9 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays10 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays9);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays11 = listnode_mergeSortedArrays10.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays12 = listnode_mergeSortedArrays10.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i14 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i15 = null;
        binarynode_i14.setRight(binarynode_i15);
        boolean b17 = listnode_mergeSortedArrays10.equals((java.lang.Object) binarynode_i15);
        boolean b18 = palindromeList0.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays10);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList19 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays20 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays21 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays20);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays22 = listnode_mergeSortedArrays21.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays23 = listnode_mergeSortedArrays21.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i25 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i26 = null;
        binarynode_i25.setRight(binarynode_i26);
        boolean b28 = listnode_mergeSortedArrays21.equals((java.lang.Object) binarynode_i26);
        com.github.pedrovgs.linkedlist.ListNode listNode29 = reverseLinkedList19.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays21);
        com.github.pedrovgs.problem62.PalindromeList palindromeList30 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList31 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays32 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays33 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays32);
        java.lang.String str34 = listnode_mergeSortedArrays33.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i35 = reverseLinkedList31.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays33);
        boolean b36 = palindromeList30.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays33);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays37 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays38 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays37);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays39 = listnode_mergeSortedArrays38.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays40 = listnode_mergeSortedArrays38.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i42 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i43 = null;
        binarynode_i42.setRight(binarynode_i43);
        boolean b45 = listnode_mergeSortedArrays38.equals((java.lang.Object) binarynode_i43);
        listnode_mergeSortedArrays33.setNext(listnode_mergeSortedArrays38);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays47 = listnode_mergeSortedArrays38.getData();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements48 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList49 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays50 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays51 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays50);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays52 = listnode_mergeSortedArrays51.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays53 = listnode_mergeSortedArrays51.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i55 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i56 = null;
        binarynode_i55.setRight(binarynode_i56);
        boolean b58 = listnode_mergeSortedArrays51.equals((java.lang.Object) binarynode_i56);
        com.github.pedrovgs.linkedlist.ListNode listNode59 = reverseLinkedList49.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays51);
        removeListDuplicatedElements48.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode59);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements> listnode_removeListDuplicatedElements61 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements>(removeListDuplicatedElements48);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList62 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements63 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList64 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays65 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays66 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays65);
        java.lang.String str67 = listnode_mergeSortedArrays66.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode68 = reverseLinkedList64.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays66);
        removeListDuplicatedElements63.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode68);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i70 = getTheElementInTheMiddleOfTheList62.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode68);
        removeListDuplicatedElements48.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode68);
        listnode_mergeSortedArrays38.setNext((com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>) listNode68);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i73 = reverseLinkedList19.reverseRecursive(listNode68);
        boolean b74 = palindromeList0.checkIterative(listNode68);
        org.junit.Assert.assertNotNull(listnode_i6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays11);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays12);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays22);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(listNode29);
        org.junit.Assert.assertNotNull(listnode_i35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays39);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays40);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(mergeSortedArrays47);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays52);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays53);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(listNode59);
        org.junit.Assert.assertNotNull(listNode68);
        org.junit.Assert.assertNotNull(listnode_i70);
        org.junit.Assert.assertNotNull(listnode_i73);
        org.junit.Assert.assertTrue(b74 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
        com.github.pedrovgs.problem29.AreAnagrams areAnagrams0 = new com.github.pedrovgs.problem29.AreAnagrams();
        boolean b3 = areAnagrams0.check("3", "/!ih/hi!/");
        boolean b6 = areAnagrams0.check("1", "3");
        boolean b9 = areAnagrams0.check("79", "[");
        boolean b12 = areAnagrams0.check("/]1-[/]1- ,1 ,1 ,0[/01/", "-6");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
        com.github.pedrovgs.problem33.SimpleRegularExpression simpleRegularExpression0 = new com.github.pedrovgs.problem33.SimpleRegularExpression();
        boolean b3 = simpleRegularExpression0.evaluate("1", "97");
        boolean b6 = simpleRegularExpression0.evaluate("[", "[]");
        boolean b9 = simpleRegularExpression0.evaluate("/hi!/", "/!ih/hi!/");
        boolean b12 = simpleRegularExpression0.evaluate("/hi!/", "35");
        boolean b15 = simpleRegularExpression0.evaluate("]1-[", "[null]");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
        com.github.pedrovgs.problem50.UniqueChars uniqueChars0 = new com.github.pedrovgs.problem50.UniqueChars();
        boolean b2 = uniqueChars0.evaluate2("/hi!/");
        boolean b4 = uniqueChars0.evaluate2("BinaryNode{data=100}");
        boolean b6 = uniqueChars0.evaluate2("[");
        boolean b8 = uniqueChars0.evaluate("");
        boolean b10 = uniqueChars0.evaluate("/!ih/");
        boolean b12 = uniqueChars0.evaluate("BinaryNode{data=100}");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
        com.github.pedrovgs.problem20.MultiplicationWithoutMultiply multiplicationWithoutMultiply0 = new com.github.pedrovgs.problem20.MultiplicationWithoutMultiply();
        int i3 = multiplicationWithoutMultiply0.calculate((int) (byte) -1, (int) (byte) 1);
        int i6 = multiplicationWithoutMultiply0.calculate(10, 27);
        int i9 = multiplicationWithoutMultiply0.calculate(3, 7);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue(i6 == 270);
        org.junit.Assert.assertTrue(i9 == 21);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
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
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements> listnode_removeListDuplicatedElements14 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements>(removeListDuplicatedElements1);
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode16 = findKthElement0.find2((com.github.pedrovgs.linkedlist.ListNode) listnode_removeListDuplicatedElements14, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(listNode12);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test177");
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral0 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        com.github.pedrovgs.problem42.FloodFill floodFill1 = new com.github.pedrovgs.problem42.FloodFill();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral2 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array3 = new int[][] {};
        int[] i_array4 = goThroughMatrixInSpiral2.go(i_array_array3);
        floodFill1.apply(i_array_array3, (-52), 2, (int) '#', 51);
        int[] i_array10 = goThroughMatrixInSpiral0.go(i_array_array3);
        org.junit.Assert.assertNotNull(i_array_array3);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(i_array10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
        com.github.pedrovgs.problem44.FindMinNumberAtPosition findMinNumberAtPosition0 = new com.github.pedrovgs.problem44.FindMinNumberAtPosition();
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
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST25 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array27 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i28 = sortedArrayToBST25.transform(i_array27);
        boolean b29 = binarynode_i28.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i30 = binarynode_i28.getRight();
        binarynode_i18.setRight(binarynode_i28);
        java.lang.Integer i32 = binarynode_i18.getData();
        try {
            java.lang.Integer i34 = findMinNumberAtPosition0.find(binarynode_i18, 13631492);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(binarynode_i6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(binarynode_i11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(binarynode_i13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(binarynode_i18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(binarynode_i23);
        org.junit.Assert.assertNull(binaryNode24);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(binarynode_i28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(binarynode_i30);
        org.junit.Assert.assertTrue("'" + i32 + "' != '" + 100 + "'", i32.equals(100));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange3 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange4 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "", combinationsOfChange3);
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange5 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "[", combinationsOfChange3);
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange6 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "[null]", combinationsOfChange3);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder0 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian1 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i3 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d4 = avlTreeMedian1.find(binarynode_i3);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode5 = binaryTreePreOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i3);
        com.github.pedrovgs.problem18.IsBST isBST6 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST7 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array9 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i10 = sortedArrayToBST7.transform(i_array9);
        boolean b11 = isBST6.checkRecursive(binarynode_i10);
        boolean b12 = binarynode_i10.hasRight();
        java.lang.Integer i13 = binarynode_i10.getData();
        java.lang.Integer i14 = binarynode_i10.getData();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode15 = binaryTreePreOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i10);
        org.junit.Assert.assertTrue(d4 == 10.0d);
        org.junit.Assert.assertNotNull(list_binaryNode5);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(binarynode_i10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100 + "'", i13.equals(100));
        org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100 + "'", i14.equals(100));
        org.junit.Assert.assertNotNull(list_binaryNode15);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideRecursive(29, 4);
        float f6 = divideUsingSubtraction0.divideRecursive((int) (short) -1, (int) 'a');
        float f9 = divideUsingSubtraction0.divideRecursive((-13631485), 4);
        org.junit.Assert.assertTrue(f3 == 7.25f);
        org.junit.Assert.assertTrue(f6 == (-0.010309278f));
        org.junit.Assert.assertTrue(f9 == (-3407871.2f));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push((-1));
        stack2_0.addElement((java.lang.Integer) (-52));
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel5 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem18.IsBST isBST6 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST7 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array9 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i10 = sortedArrayToBST7.transform(i_array9);
        boolean b11 = isBST6.checkRecursive(binarynode_i10);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode12 = binaryTreeByLevel5.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i10);
        com.github.pedrovgs.problem18.IsBST isBST13 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem46.BinaryTreeSerialization binaryTreeSerialization14 = new com.github.pedrovgs.problem46.BinaryTreeSerialization();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST15 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array17 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i18 = sortedArrayToBST15.transform(i_array17);
        boolean b19 = binarynode_i18.hasRight();
        java.lang.Integer i20 = binarynode_i18.getData();
        java.lang.String str21 = binaryTreeSerialization14.serialize((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i18);
        boolean b22 = isBST13.checkIterative(binarynode_i18);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode23 = binaryTreeByLevel5.getWithoutAdditionalDataStructures((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i18);
        boolean b24 = stack2_0.equals((java.lang.Object) binarynode_i18);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(binarynode_i10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(list_binaryNode12);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(binarynode_i18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100 + "'", i20.equals(100));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "100##" + "'", str21.equals("100##"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(list_binaryNode23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces0 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces1 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array7 = new char[] { '#', 'a', ' ', '4', 'a' };
        replaceSpaces1.replace(char_array7);
        replaceSpaces0.replace(char_array7);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces10 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array11 = new char[] {};
        replaceSpaces10.replace2(char_array11);
        replaceSpaces0.replace(char_array11);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces14 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces15 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array21 = new char[] { '#', 'a', ' ', '4', 'a' };
        replaceSpaces15.replace(char_array21);
        replaceSpaces14.replace(char_array21);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces24 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces25 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces26 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array27 = new char[] {};
        replaceSpaces26.replace2(char_array27);
        replaceSpaces25.replace(char_array27);
        replaceSpaces24.replace(char_array27);
        replaceSpaces14.replace(char_array27);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces32 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array38 = new char[] { '#', 'a', ' ', '4', 'a' };
        replaceSpaces32.replace(char_array38);
        replaceSpaces14.replace2(char_array38);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces41 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces42 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces43 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array44 = new char[] {};
        replaceSpaces43.replace2(char_array44);
        replaceSpaces42.replace(char_array44);
        replaceSpaces41.replace(char_array44);
        replaceSpaces14.replace2(char_array44);
        replaceSpaces0.replace(char_array44);
        org.junit.Assert.assertNotNull(char_array7);
        org.junit.Assert.assertNotNull(char_array11);
        org.junit.Assert.assertNotNull(char_array21);
        org.junit.Assert.assertNotNull(char_array27);
        org.junit.Assert.assertNotNull(char_array38);
        org.junit.Assert.assertNotNull(char_array44);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList0 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements1 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList2 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode6 = reverseLinkedList2.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        removeListDuplicatedElements1.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode6);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i8 = getTheElementInTheMiddleOfTheList0.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode6);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList9 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays10 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays11 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays10);
        java.lang.String str12 = listnode_mergeSortedArrays11.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i13 = reverseLinkedList9.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays11);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList14 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays15 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays16 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays15);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays17 = listnode_mergeSortedArrays16.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays18 = listnode_mergeSortedArrays16.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i20 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i21 = null;
        binarynode_i20.setRight(binarynode_i21);
        boolean b23 = listnode_mergeSortedArrays16.equals((java.lang.Object) binarynode_i21);
        com.github.pedrovgs.linkedlist.ListNode listNode24 = reverseLinkedList14.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays16);
        com.github.pedrovgs.linkedlist.ListNode listNode25 = reverseLinkedList9.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays16);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i26 = getTheElementInTheMiddleOfTheList0.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode25);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays27 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays28 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays27);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays29 = listnode_mergeSortedArrays28.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays30 = listnode_mergeSortedArrays28.getNext();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays31 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort32 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray33 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array36 = new int[] { (byte) 1, (byte) 10 };
        splitArray33.splitSwappingPartition(i_array36);
        selectionSort32.sort(i_array36);
        com.github.pedrovgs.problem8.SplitArray splitArray39 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array42 = new int[] { (byte) 1, (byte) 10 };
        splitArray39.splitSwappingPartition(i_array42);
        int[] i_array50 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray39.splitSwappingRecursive(i_array50);
        int[] i_array52 = mergeSortedArrays31.merge(i_array36, i_array50);
        listnode_mergeSortedArrays28.setData(mergeSortedArrays31);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays54 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays31);
        listNode25.setData(mergeSortedArrays31);
        org.junit.Assert.assertNotNull(listNode6);
        org.junit.Assert.assertNotNull(listnode_i8);
        org.junit.Assert.assertNotNull(listnode_i13);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays17);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays18);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(listNode24);
        org.junit.Assert.assertNotNull(listNode25);
        org.junit.Assert.assertNotNull(listnode_i26);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays29);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays30);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array52);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
        com.github.pedrovgs.problem25.Anagrams anagrams0 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str2 = anagrams0.get("hi!");
        java.util.List<java.lang.String> list_str4 = anagrams0.get("/");
        java.util.List<java.lang.String> list_str6 = anagrams0.get("10010###");
        org.junit.Assert.assertNotNull(list_str2);
        org.junit.Assert.assertNotNull(list_str4);
        org.junit.Assert.assertNotNull(list_str6);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        vector_i5.trimToSize();
        vector_i5.add((int) (short) 0, (java.lang.Integer) 0);
        java.util.stream.Stream<java.lang.Integer> stream_i14 = vector_i5.stream();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST15 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array17 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i18 = sortedArrayToBST15.transform(i_array17);
        boolean b19 = vector_i5.removeElement((java.lang.Object) sortedArrayToBST15);
        java.util.ListIterator<java.lang.Integer> listiterator_i20 = vector_i5.listIterator();
        java.util.Spliterator<java.lang.Integer> spliterator_i21 = vector_i5.spliterator();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(stream_i14);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(binarynode_i18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(listiterator_i20);
        org.junit.Assert.assertNotNull(spliterator_i21);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral0 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        com.github.pedrovgs.problem42.FloodFill floodFill1 = new com.github.pedrovgs.problem42.FloodFill();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral2 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array3 = new int[][] {};
        int[] i_array4 = goThroughMatrixInSpiral2.go(i_array_array3);
        floodFill1.apply(i_array_array3, (-52), 2, (int) '#', 51);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral10 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array11 = new int[][] {};
        int[] i_array12 = goThroughMatrixInSpiral10.go(i_array_array11);
        int[] i_array19 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[] i_array26 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[][] i_array_array27 = new int[][] { i_array19, i_array26 };
        int[] i_array28 = goThroughMatrixInSpiral10.go(i_array_array27);
        floodFill1.apply(i_array_array27, (-8), (-14040), 2147483647, (-8));
        int[] i_array34 = goThroughMatrixInSpiral0.go(i_array_array27);
        org.junit.Assert.assertNotNull(i_array_array3);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array34);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        java.util.Iterator<java.lang.Integer> iterator_i12 = vector_i4.iterator();
        java.lang.Object[] obj_array13 = vector_i4.toArray();
        java.lang.Object obj14 = vector_i4.clone();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(iterator_i12);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 0, 0 };
        java.util.Vector<java.lang.Integer> vector_i3 = new java.util.Vector<java.lang.Integer>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i3, i_array2);
        java.lang.Object obj5 = vector_i3.clone();
        int i6 = vector_i3.size();
        java.lang.Integer i8 = vector_i3.remove((int) (short) 1);
        try {
            java.lang.Integer i10 = vector_i3.elementAt(7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0 + "'", i8.equals(0));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
        com.github.pedrovgs.problem53.CompressString compressString0 = new com.github.pedrovgs.problem53.CompressString();
        java.lang.String str2 = compressString0.compressRecursive("97");
        java.lang.String str4 = compressString0.compressAlternativeApproach("hi!");
        java.lang.String str6 = compressString0.compress("[]");
        java.lang.String str8 = compressString0.compress("/hi!/");
        java.lang.String str10 = compressString0.compressAlternativeApproach("[]");
        java.lang.String str12 = compressString0.compress("/!ih/");
        java.lang.String str14 = compressString0.compressAlternativeApproach("[null]");
        java.lang.String str16 = compressString0.compressRecursive("1241513983");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97" + "'", str2.equals("97"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/hi!" + "'", str8.equals("/hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "/!ih" + "'", str12.equals("/!ih"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[nul2]" + "'", str14.equals("[nul2]"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1241513983" + "'", str16.equals("1241513983"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList0 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = listnode_mergeSortedArrays2.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = listnode_mergeSortedArrays2.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i6 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i7 = null;
        binarynode_i6.setRight(binarynode_i7);
        boolean b9 = listnode_mergeSortedArrays2.equals((java.lang.Object) binarynode_i7);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays10 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays11 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays10);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays12 = listnode_mergeSortedArrays11.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays13 = listnode_mergeSortedArrays11.getNext();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays14 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort15 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray16 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array19 = new int[] { (byte) 1, (byte) 10 };
        splitArray16.splitSwappingPartition(i_array19);
        selectionSort15.sort(i_array19);
        com.github.pedrovgs.problem8.SplitArray splitArray22 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array25 = new int[] { (byte) 1, (byte) 10 };
        splitArray22.splitSwappingPartition(i_array25);
        int[] i_array33 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray22.splitSwappingRecursive(i_array33);
        int[] i_array35 = mergeSortedArrays14.merge(i_array19, i_array33);
        listnode_mergeSortedArrays11.setData(mergeSortedArrays14);
        listnode_mergeSortedArrays2.setData(mergeSortedArrays14);
        com.github.pedrovgs.linkedlist.ListNode listNode38 = reverseLinkedList0.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays3);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays12);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays13);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(listNode38);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.ensureCapacity((int) (short) 100);
        boolean b3 = stack2_0.empty();
        stack2_0.ensureCapacity((-14040));
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction6 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f9 = divideUsingSubtraction6.divideRecursive(29, 4);
        float f12 = divideUsingSubtraction6.divideRecursive(107, (-1241513984));
        int i13 = stack2_0.search((java.lang.Object) divideUsingSubtraction6);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(f9 == 7.25f);
        org.junit.Assert.assertTrue(f12 == 3.4594593f);
        org.junit.Assert.assertTrue(i13 == (-1));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        com.github.pedrovgs.problem29.AreAnagrams areAnagrams0 = new com.github.pedrovgs.problem29.AreAnagrams();
        boolean b3 = areAnagrams0.check("3", "/!ih/hi!/");
        boolean b6 = areAnagrams0.check("1", "3");
        boolean b9 = areAnagrams0.check("79", "[");
        boolean b12 = areAnagrams0.check("[]", "/hi!/");
        boolean b15 = areAnagrams0.check("]1- ,1 ,1 ,0[", "/###01001/79/");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        com.github.pedrovgs.problem8.SplitArray splitArray0 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        com.github.pedrovgs.problem8.SplitArray splitArray3 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array6 = new int[] { (byte) 1, (byte) 10 };
        splitArray3.splitSwappingPartition(i_array6);
        int[] i_array14 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray3.splitSwappingRecursive(i_array14);
        com.github.pedrovgs.problem8.SplitArray splitArray16 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array19 = new int[] { (byte) 1, (byte) 10 };
        splitArray16.splitSwappingPartition(i_array19);
        int[] i_array27 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray16.splitSwappingRecursive(i_array27);
        int[] i_array29 = mergeSortedArrays1.merge(i_array14, i_array27);
        splitArray0.splitSwappingIterative(i_array27);
        com.github.pedrovgs.problem8.SplitArray splitArray31 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray32 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array35 = new int[] { (byte) 1, (byte) 10 };
        splitArray32.splitSwappingPartition(i_array35);
        splitArray31.splitSwappingRecursive(i_array35);
        splitArray0.splitSwappingPartition(i_array35);
        com.github.pedrovgs.problem39.MultiplyArrayElements multiplyArrayElements39 = new com.github.pedrovgs.problem39.MultiplyArrayElements();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral40 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array41 = new int[][] {};
        int[] i_array42 = goThroughMatrixInSpiral40.go(i_array_array41);
        int[] i_array43 = multiplyArrayElements39.multiply(i_array42);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays44 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays45 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays44);
        com.github.pedrovgs.problem8.SplitArray splitArray46 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray47 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array50 = new int[] { (byte) 1, (byte) 10 };
        splitArray47.splitSwappingPartition(i_array50);
        splitArray46.splitSwappingRecursive(i_array50);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral53 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array54 = new int[][] {};
        int[] i_array55 = goThroughMatrixInSpiral53.go(i_array_array54);
        splitArray46.splitSwappingRecursive(i_array55);
        com.github.pedrovgs.problem80.QuickSort quickSort57 = new com.github.pedrovgs.problem80.QuickSort();
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
        quickSort57.sort(i_array63);
        int[] i_array81 = mergeSortedArrays44.merge(i_array55, i_array63);
        int[] i_array82 = multiplyArrayElements39.multiply(i_array63);
        splitArray0.splitSwappingIterative(i_array63);
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array_array41);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array_array54);
        org.junit.Assert.assertNotNull(i_array55);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertNotNull(i_array69);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(i_array79);
        org.junit.Assert.assertNotNull(i_array81);
        org.junit.Assert.assertNotNull(i_array82);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode0 = new com.github.pedrovgs.problem59.DeleteListNode();
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
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements> listnode_removeListDuplicatedElements14 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements>(removeListDuplicatedElements1);
        deleteListNode0.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_removeListDuplicatedElements14);
        com.github.pedrovgs.linkedlist.ListNode listNode16 = null;
        try {
            deleteListNode0.delete(listNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(listNode12);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
        com.github.pedrovgs.problem4.SquareRoot squareRoot0 = new com.github.pedrovgs.problem4.SquareRoot();
        float f2 = squareRoot0.calculateSquareRootRecursive((int) (byte) 1);
        float f4 = squareRoot0.calculateSquareRootRecursive((int) '4');
        float f6 = squareRoot0.calculateSquareRootRecursive(29);
        org.junit.Assert.assertTrue(f2 == 0.96875f);
        org.junit.Assert.assertTrue(f4 == 7.2109375f);
        org.junit.Assert.assertTrue(f6 == 5.3808594f);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test197");
        java.lang.Integer[] i_array1 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i2 = new java.util.Stack<java.lang.Integer>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i2, i_array1);
        boolean b4 = stack_i2.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST5 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i6 = stack_i2.search((java.lang.Object) sortedArrayToBST5);
        java.lang.Integer i8 = stack_i2.push((java.lang.Integer) 10);
        java.lang.Object[] obj_array9 = stack_i2.toArray();
        java.util.stream.Stream<java.lang.Integer> stream_i10 = stack_i2.parallelStream();
        stack_i2.removeAllElements();
        org.junit.Assert.assertNotNull(i_array1);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10 + "'", i8.equals(10));
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(stream_i10);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test198");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        try {
            java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnPowersOfTwo("/97/10010###/", "[0, 1, 1, -1]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
        com.github.pedrovgs.problem71.ReverseBinaryNumber reverseBinaryNumber0 = new com.github.pedrovgs.problem71.ReverseBinaryNumber();
        int i2 = reverseBinaryNumber0.reverse(1);
        int i4 = reverseBinaryNumber0.reverse(3);
        int i6 = reverseBinaryNumber0.reverse(0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test200");
        com.github.pedrovgs.problem73.SubtractAdding subtractAdding0 = new com.github.pedrovgs.problem73.SubtractAdding();
        int i3 = subtractAdding0.subtract((int) (short) 0, (int) '4');
        int i6 = subtractAdding0.subtract((int) (byte) 10, (-97));
        int i9 = subtractAdding0.subtract((int) (short) 0, 2);
        int i12 = subtractAdding0.subtract((int) (byte) 100, 107);
        org.junit.Assert.assertTrue(i3 == (-52));
        org.junit.Assert.assertTrue(i6 == 107);
        org.junit.Assert.assertTrue(i9 == (-2));
        org.junit.Assert.assertTrue(i12 == (-7));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test201");
        com.github.pedrovgs.problem50.UniqueChars uniqueChars0 = new com.github.pedrovgs.problem50.UniqueChars();
        boolean b2 = uniqueChars0.evaluate2("/hi!/");
        boolean b4 = uniqueChars0.evaluate("35");
        boolean b6 = uniqueChars0.evaluate2("[-1]");
        boolean b8 = uniqueChars0.evaluate("[0, 1, 1, -1]");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test202");
        com.github.pedrovgs.problem69.BitsToTransform bitsToTransform0 = new com.github.pedrovgs.problem69.BitsToTransform();
        int i3 = bitsToTransform0.calculate((int) '#', (int) (short) 0);
        int i6 = bitsToTransform0.calculate(51, (int) 'a');
        int i9 = bitsToTransform0.calculate((int) 'a', (int) (byte) -1);
        int i12 = bitsToTransform0.calculate(1, (int) (short) 1);
        int i15 = bitsToTransform0.calculate(28, 28);
        org.junit.Assert.assertTrue(i3 == 3);
        org.junit.Assert.assertTrue(i6 == 3);
        org.junit.Assert.assertTrue(i9 == 29);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test203");
        com.github.pedrovgs.problem60.PartitionList partitionList0 = new com.github.pedrovgs.problem60.PartitionList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = listnode_mergeSortedArrays3.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = listnode_mergeSortedArrays3.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i7 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i8 = null;
        binarynode_i7.setRight(binarynode_i8);
        boolean b10 = listnode_mergeSortedArrays3.equals((java.lang.Object) binarynode_i8);
        com.github.pedrovgs.linkedlist.ListNode listNode11 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        try {
            com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i13 = partitionList0.split((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode11, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(listNode11);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test204");
        com.github.pedrovgs.problem1.BitsCounter bitsCounter0 = new com.github.pedrovgs.problem1.BitsCounter();
        int i2 = bitsCounter0.countBitsToOneBasedOnString((-6));
        int i4 = bitsCounter0.countBitsToOneBasedOnString((-6));
        int i6 = bitsCounter0.countBitsToOneBasedOnBinaryOperators((int) (byte) 1);
        int i8 = bitsCounter0.countBitsToOneBasedOnString(101);
        int i10 = bitsCounter0.countBitsToOneBasedOnBinaryOperators(32);
        int i12 = bitsCounter0.countBitsToOneBasedOnBinaryOperators(6);
        int i14 = bitsCounter0.countBitsToOneBasedOnBinaryOperators(104);
        org.junit.Assert.assertTrue(i2 == 30);
        org.junit.Assert.assertTrue(i4 == 30);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i8 == 4);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i14 == 3);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test205");
        java.lang.Integer[] i_array1 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i2 = new java.util.Stack<java.lang.Integer>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i2, i_array1);
        boolean b4 = stack_i2.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST5 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i6 = stack_i2.search((java.lang.Object) sortedArrayToBST5);
        java.lang.Integer[] i_array10 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i11 = sortedArrayToBST5.transform(i_array10);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates12 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates13 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST14 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array16 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i17 = sortedArrayToBST14.transform(i_array16);
        java.lang.Integer[] i_array18 = removeDuplicates13.removeUsingSorting(i_array16);
        java.lang.Integer[] i_array19 = removeDuplicates12.removeUsingSorting(i_array18);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i20 = sortedArrayToBST5.transform(i_array18);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates21 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates22 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST23 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array25 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i26 = sortedArrayToBST23.transform(i_array25);
        java.lang.Integer[] i_array27 = removeDuplicates22.removeUsingSorting(i_array25);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST28 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array30 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i31 = sortedArrayToBST28.transform(i_array30);
        java.lang.Integer[] i_array32 = removeDuplicates22.removeUsingSorting(i_array30);
        java.lang.Integer[] i_array33 = removeDuplicates21.removeUsingSorting(i_array30);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates34 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates35 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST36 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array38 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i39 = sortedArrayToBST36.transform(i_array38);
        java.lang.Integer[] i_array40 = removeDuplicates35.removeUsingSorting(i_array38);
        java.lang.Integer[] i_array41 = removeDuplicates34.removeUsingSorting(i_array40);
        java.lang.Integer[] i_array42 = removeDuplicates21.removeUsingSorting(i_array41);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i43 = sortedArrayToBST5.transform(i_array42);
        org.junit.Assert.assertNotNull(i_array1);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(binarynode_i11);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(binarynode_i17);
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(binarynode_i20);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(binarynode_i26);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(binarynode_i31);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(binarynode_i39);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(binarynode_i43);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test206");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.ensureCapacity((int) (short) 100);
        int i3 = stack2_0.getMin();
        java.util.ListIterator<java.lang.Integer> listiterator_i4 = stack2_0.listIterator();
        com.github.pedrovgs.problem25.Anagrams anagrams5 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str7 = anagrams5.get("hi!");
        java.util.List<java.lang.String> list_str9 = anagrams5.get("/");
        com.github.pedrovgs.problem25.Anagrams anagrams10 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str12 = anagrams10.get("0");
        java.util.List<java.lang.String> list_str14 = anagrams10.get("0");
        java.util.List<java.lang.String> list_str16 = anagrams10.get("[null]");
        com.github.pedrovgs.problem25.Anagrams anagrams17 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str19 = anagrams17.get("0");
        java.util.List<java.lang.String> list_str21 = anagrams17.get("0");
        com.github.pedrovgs.problem25.Anagrams anagrams22 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str24 = anagrams22.get("0");
        java.util.List<java.lang.String> list_str26 = anagrams22.get("/hi!/");
        java.util.List<java.lang.String> list_str28 = anagrams22.get("35");
        com.github.pedrovgs.problem25.Anagrams anagrams29 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str31 = anagrams29.get("0");
        java.util.List<java.lang.String> list_str33 = anagrams29.get("/hi!/");
        java.util.List<java.lang.String> list_str35 = anagrams29.get("35");
        com.github.pedrovgs.problem25.Anagrams[] anagrams_array36 = new com.github.pedrovgs.problem25.Anagrams[] { anagrams5, anagrams10, anagrams17, anagrams22, anagrams29 };
        com.github.pedrovgs.problem25.Anagrams[] anagrams_array37 = stack2_0.toArray(anagrams_array36);
        int i38 = stack2_0.getMin();
        org.junit.Assert.assertTrue(i3 == 2147483647);
        org.junit.Assert.assertNotNull(listiterator_i4);
        org.junit.Assert.assertNotNull(list_str7);
        org.junit.Assert.assertNotNull(list_str9);
        org.junit.Assert.assertNotNull(list_str12);
        org.junit.Assert.assertNotNull(list_str14);
        org.junit.Assert.assertNotNull(list_str16);
        org.junit.Assert.assertNotNull(list_str19);
        org.junit.Assert.assertNotNull(list_str21);
        org.junit.Assert.assertNotNull(list_str24);
        org.junit.Assert.assertNotNull(list_str26);
        org.junit.Assert.assertNotNull(list_str28);
        org.junit.Assert.assertNotNull(list_str31);
        org.junit.Assert.assertNotNull(list_str33);
        org.junit.Assert.assertNotNull(list_str35);
        org.junit.Assert.assertNotNull(anagrams_array36);
        org.junit.Assert.assertNotNull(anagrams_array37);
        org.junit.Assert.assertTrue(i38 == 2147483647);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test207");
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
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode11 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays12 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays13 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays12);
        java.lang.String str14 = listnode_mergeSortedArrays13.toString();
        deleteListNode11.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays13);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays16 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays17 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays16);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers18 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b19 = listnode_mergeSortedArrays17.equals((java.lang.Object) mergeBinaryNumbers18);
        deleteListNode11.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays17);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i21 = reverseLinkedList0.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays17);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays22 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays23 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays22);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers24 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b25 = listnode_mergeSortedArrays23.equals((java.lang.Object) mergeBinaryNumbers24);
        com.github.pedrovgs.linkedlist.ListNode listNode26 = reverseLinkedList0.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays23);
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel27 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel28 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem18.IsBST isBST29 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST30 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array32 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i33 = sortedArrayToBST30.transform(i_array32);
        boolean b34 = isBST29.checkRecursive(binarynode_i33);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode35 = binaryTreeByLevel28.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i33);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode36 = binaryTreeByLevel27.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i33);
        com.github.pedrovgs.problem19.BinaryTreeDepth binaryTreeDepth37 = new com.github.pedrovgs.problem19.BinaryTreeDepth();
        java.lang.Integer[] i_array39 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i40 = new java.util.Stack<java.lang.Integer>();
        boolean b41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i40, i_array39);
        boolean b42 = stack_i40.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST43 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i44 = stack_i40.search((java.lang.Object) sortedArrayToBST43);
        java.lang.Integer[] i_array48 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i49 = sortedArrayToBST43.transform(i_array48);
        int i50 = binaryTreeDepth37.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i49);
        com.github.pedrovgs.problem19.BinaryTreeDepth binaryTreeDepth51 = new com.github.pedrovgs.problem19.BinaryTreeDepth();
        java.lang.Integer[] i_array53 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i54 = new java.util.Stack<java.lang.Integer>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i54, i_array53);
        boolean b56 = stack_i54.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST57 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i58 = stack_i54.search((java.lang.Object) sortedArrayToBST57);
        java.lang.Integer[] i_array62 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i63 = sortedArrayToBST57.transform(i_array62);
        int i64 = binaryTreeDepth51.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i63);
        int i65 = binaryTreeDepth37.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i63);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode66 = binaryTreeByLevel27.getWithoutAdditionalDataStructures((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i63);
        boolean b67 = listNode26.equals((java.lang.Object) binaryTreeByLevel27);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays3);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(listNode10);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(listnode_i21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(listNode26);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(binarynode_i33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(list_binaryNode35);
        org.junit.Assert.assertNotNull(list_binaryNode36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i44 == (-1));
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(binarynode_i49);
        org.junit.Assert.assertTrue(i50 == 2);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(i58 == (-1));
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(binarynode_i63);
        org.junit.Assert.assertTrue(i64 == 2);
        org.junit.Assert.assertTrue(i65 == 2);
        org.junit.Assert.assertNotNull(list_binaryNode66);
        org.junit.Assert.assertTrue(b67 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test208");
        com.github.pedrovgs.problem68.IsEven isEven0 = new com.github.pedrovgs.problem68.IsEven();
        boolean b2 = isEven0.check((int) (byte) 1);
        boolean b4 = isEven0.check(0);
        boolean b6 = isEven0.check(4);
        boolean b8 = isEven0.check((-13631485));
        boolean b10 = isEven0.check((int) (byte) 1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test209");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        int i9 = vector_i4.indexOf((java.lang.Object) 1);
        int i11 = vector_i4.indexOf((java.lang.Object) 100.0d);
        java.lang.Object obj12 = vector_i4.clone();
        java.lang.Object obj13 = null;
        int i14 = vector_i4.lastIndexOf(obj13);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i16 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 27);
        int i17 = vector_i4.lastIndexOf((java.lang.Object) binarynode_i16);
        boolean b18 = binarynode_i16.hasRight();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian19 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals20 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder21 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder22 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian23 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i25 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d26 = avlTreeMedian23.find(binarynode_i25);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode27 = binaryTreePreOrder22.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i25);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i28 = binaryTreeInOrder21.getIterative(binarynode_i25);
        com.github.pedrovgs.problem18.IsBST isBST29 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST30 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array32 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i33 = sortedArrayToBST30.transform(i_array32);
        boolean b34 = isBST29.checkRecursive(binarynode_i33);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals35 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST36 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array38 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i39 = sortedArrayToBST36.transform(i_array38);
        boolean b40 = binarynode_i39.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST41 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array43 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i44 = sortedArrayToBST41.transform(i_array43);
        boolean b45 = binarynode_i44.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i46 = binarynode_i44.getRight();
        boolean b47 = binaryTreeEquals35.areEqualsIterative(binarynode_i39, binarynode_i44);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i48 = binarynode_i39.getLeft();
        boolean b49 = isBST29.checkIterative(binarynode_i39);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals50 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST51 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array53 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i54 = sortedArrayToBST51.transform(i_array53);
        boolean b55 = binarynode_i54.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST56 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array58 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i59 = sortedArrayToBST56.transform(i_array58);
        boolean b60 = binarynode_i59.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i61 = binarynode_i59.getRight();
        boolean b62 = binaryTreeEquals50.areEqualsIterative(binarynode_i54, binarynode_i59);
        boolean b63 = isBST29.checkIterative(binarynode_i59);
        boolean b64 = binaryTreeEquals20.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i25, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i59);
        double d65 = avlTreeMedian19.find(binarynode_i59);
        binarynode_i16.setRight(binarynode_i59);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(d26 == 10.0d);
        org.junit.Assert.assertNotNull(list_binaryNode27);
        org.junit.Assert.assertNotNull(list_binarynode_i28);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(binarynode_i33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(binarynode_i39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(binarynode_i44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(binarynode_i46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNull(binarynode_i48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(binarynode_i54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(binarynode_i59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(binarynode_i61);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(d65 == 100.0d);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test210");
        java.lang.Integer[] i_array1 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i2 = new java.util.Stack<java.lang.Integer>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i2, i_array1);
        boolean b4 = stack_i2.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST5 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i6 = stack_i2.search((java.lang.Object) sortedArrayToBST5);
        java.lang.Integer[] i_array10 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i11 = sortedArrayToBST5.transform(i_array10);
        java.lang.Integer i12 = binarynode_i11.getData();
        java.lang.Integer i13 = binarynode_i11.getData();
        org.junit.Assert.assertNotNull(i_array1);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(binarynode_i11);
        org.junit.Assert.assertTrue("'" + i12 + "' != '" + 51 + "'", i12.equals(51));
        org.junit.Assert.assertTrue("'" + i13 + "' != '" + 51 + "'", i13.equals(51));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test211");
        com.github.pedrovgs.problem46.BinaryTreeSerialization binaryTreeSerialization0 = new com.github.pedrovgs.problem46.BinaryTreeSerialization();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i2 = binaryTreeSerialization0.deserialize("BinaryNode{data=100}");
        com.github.pedrovgs.problem18.IsBST isBST3 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor4 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals5 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST6 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array8 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i9 = sortedArrayToBST6.transform(i_array8);
        boolean b10 = binarynode_i9.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST11 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array13 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i14 = sortedArrayToBST11.transform(i_array13);
        boolean b15 = binarynode_i14.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i16 = binarynode_i14.getRight();
        boolean b17 = binaryTreeEquals5.areEqualsIterative(binarynode_i9, binarynode_i14);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST18 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array20 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i21 = sortedArrayToBST18.transform(i_array20);
        boolean b22 = binarynode_i21.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST23 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array25 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i26 = sortedArrayToBST23.transform(i_array25);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode27 = lowestCommonAncestor4.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i14, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i21, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i26);
        java.lang.String str28 = binarynode_i26.toString();
        boolean b29 = isBST3.checkIterative(binarynode_i26);
        java.lang.String str30 = binarynode_i26.toString();
        java.lang.String str31 = binaryTreeSerialization0.serialize((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i26);
        org.junit.Assert.assertNotNull(binarynode_i2);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(binarynode_i9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(binarynode_i14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(binarynode_i16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(binarynode_i21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(binarynode_i26);
        org.junit.Assert.assertNull(binaryNode27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "BinaryNode{data=100}" + "'", str28.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "BinaryNode{data=100}" + "'", str30.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "100##" + "'", str31.equals("100##"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test212");
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder0 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder1 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian2 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i4 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d5 = avlTreeMedian2.find(binarynode_i4);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode6 = binaryTreePreOrder1.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i4);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i7 = binaryTreeInOrder0.getIterative(binarynode_i4);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor8 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals9 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST10 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array12 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i13 = sortedArrayToBST10.transform(i_array12);
        boolean b14 = binarynode_i13.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST15 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array17 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i18 = sortedArrayToBST15.transform(i_array17);
        boolean b19 = binarynode_i18.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i20 = binarynode_i18.getRight();
        boolean b21 = binaryTreeEquals9.areEqualsIterative(binarynode_i13, binarynode_i18);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST22 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array24 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i25 = sortedArrayToBST22.transform(i_array24);
        boolean b26 = binarynode_i25.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST27 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array29 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i30 = sortedArrayToBST27.transform(i_array29);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode31 = lowestCommonAncestor8.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i18, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i25, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i30);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST32 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array34 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i35 = sortedArrayToBST32.transform(i_array34);
        boolean b36 = binarynode_i35.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i37 = binarynode_i35.getRight();
        binarynode_i25.setRight(binarynode_i35);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i39 = binaryTreeInOrder0.getIterative(binarynode_i35);
        com.github.pedrovgs.problem16.BinaryTreePostOrder binaryTreePostOrder40 = new com.github.pedrovgs.problem16.BinaryTreePostOrder();
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder41 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian42 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i44 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d45 = avlTreeMedian42.find(binarynode_i44);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor46 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals47 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST48 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array50 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i51 = sortedArrayToBST48.transform(i_array50);
        boolean b52 = binarynode_i51.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST53 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array55 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i56 = sortedArrayToBST53.transform(i_array55);
        boolean b57 = binarynode_i56.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i58 = binarynode_i56.getRight();
        boolean b59 = binaryTreeEquals47.areEqualsIterative(binarynode_i51, binarynode_i56);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST60 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array62 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i63 = sortedArrayToBST60.transform(i_array62);
        boolean b64 = binarynode_i63.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST65 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array67 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i68 = sortedArrayToBST65.transform(i_array67);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode69 = lowestCommonAncestor46.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i56, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i63, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i68);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i70 = binarynode_i56.getLeft();
        double d71 = avlTreeMedian42.find(binarynode_i56);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST72 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array74 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i75 = sortedArrayToBST72.transform(i_array74);
        boolean b76 = binarynode_i75.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i77 = binarynode_i75.getRight();
        java.lang.Integer i78 = binarynode_i75.getData();
        binarynode_i56.setLeft(binarynode_i75);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i80 = binaryTreeInOrder41.getIterative(binarynode_i75);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode81 = binaryTreePostOrder40.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i75);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST82 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array84 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i85 = sortedArrayToBST82.transform(i_array84);
        boolean b86 = binarynode_i85.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i87 = binarynode_i85.getRight();
        java.lang.Integer i88 = binarynode_i85.getData();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode89 = binaryTreePostOrder40.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i85);
        com.github.pedrovgs.problem65.IsTreeBalanced isTreeBalanced90 = new com.github.pedrovgs.problem65.IsTreeBalanced();
        com.github.pedrovgs.problem75.SelectionSort selectionSort91 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem65.IsTreeBalanced, com.github.pedrovgs.problem75.SelectionSort> pair_isTreeBalanced_selectionSort92 = new com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem65.IsTreeBalanced, com.github.pedrovgs.problem75.SelectionSort>(isTreeBalanced90, selectionSort91);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST93 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array95 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i96 = sortedArrayToBST93.transform(i_array95);
        boolean b97 = isTreeBalanced90.check((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i96);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode98 = binaryTreePostOrder40.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i96);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i99 = binaryTreeInOrder0.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i96);
        org.junit.Assert.assertTrue(d5 == 10.0d);
        org.junit.Assert.assertNotNull(list_binaryNode6);
        org.junit.Assert.assertNotNull(list_binarynode_i7);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(binarynode_i13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(binarynode_i18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(binarynode_i20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(binarynode_i25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(binarynode_i30);
        org.junit.Assert.assertNull(binaryNode31);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(binarynode_i35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(binarynode_i37);
        org.junit.Assert.assertNotNull(list_binarynode_i39);
        org.junit.Assert.assertTrue(d45 == 10.0d);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(binarynode_i51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(i_array55);
        org.junit.Assert.assertNotNull(binarynode_i56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(binarynode_i58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(binarynode_i63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(binarynode_i68);
        org.junit.Assert.assertNull(binaryNode69);
        org.junit.Assert.assertNull(binarynode_i70);
        org.junit.Assert.assertTrue(d71 == 100.0d);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertNotNull(binarynode_i75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNull(binarynode_i77);
        org.junit.Assert.assertTrue("'" + i78 + "' != '" + 100 + "'", i78.equals(100));
        org.junit.Assert.assertNotNull(list_binarynode_i80);
        org.junit.Assert.assertNotNull(list_binaryNode81);
        org.junit.Assert.assertNotNull(i_array84);
        org.junit.Assert.assertNotNull(binarynode_i85);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNull(binarynode_i87);
        org.junit.Assert.assertTrue("'" + i88 + "' != '" + 100 + "'", i88.equals(100));
        org.junit.Assert.assertNotNull(list_binaryNode89);
        org.junit.Assert.assertNotNull(i_array95);
        org.junit.Assert.assertNotNull(binarynode_i96);
        org.junit.Assert.assertTrue(b97 == true);
        org.junit.Assert.assertNotNull(list_binaryNode98);
        org.junit.Assert.assertNotNull(list_binarynode_i99);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test213");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideRecursive(29, 4);
        float f6 = divideUsingSubtraction0.divideRecursive((int) (short) -1, (int) 'a');
        float f9 = divideUsingSubtraction0.divideIterative((int) 'a', 27);
        float f12 = divideUsingSubtraction0.divideRecursive((int) (short) -1, 18);
        float f15 = divideUsingSubtraction0.divideIterative(100, (-13631485));
        float f18 = divideUsingSubtraction0.divideIterative((-13631485), 1484783616);
        float f21 = divideUsingSubtraction0.divideIterative(0, (-13631485));
        float f24 = divideUsingSubtraction0.divideRecursive((int) '#', 112197661);
        org.junit.Assert.assertTrue(f3 == 7.25f);
        org.junit.Assert.assertTrue(f6 == (-0.010309278f));
        org.junit.Assert.assertTrue(f9 == 3.5925927f);
        org.junit.Assert.assertTrue(f12 == (-0.055555556f));
        org.junit.Assert.assertTrue(f15 == 315.07697f);
        org.junit.Assert.assertTrue(f18 == (-0.009180789f));
        org.junit.Assert.assertTrue(f21 == 315.077f);
        org.junit.Assert.assertTrue(f24 == 3.1194946E-7f);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test214");
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel0 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel1 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem18.IsBST isBST2 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST3 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array5 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i6 = sortedArrayToBST3.transform(i_array5);
        boolean b7 = isBST2.checkRecursive(binarynode_i6);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode8 = binaryTreeByLevel1.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i6);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode9 = binaryTreeByLevel0.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i6);
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel10 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel11 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem18.IsBST isBST12 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST13 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array15 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i16 = sortedArrayToBST13.transform(i_array15);
        boolean b17 = isBST12.checkRecursive(binarynode_i16);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode18 = binaryTreeByLevel11.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i16);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode19 = binaryTreeByLevel10.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i16);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode20 = binaryTreeByLevel0.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i16);
        com.github.pedrovgs.problem19.BinaryTreeDepth binaryTreeDepth21 = new com.github.pedrovgs.problem19.BinaryTreeDepth();
        java.lang.Integer[] i_array23 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i24 = new java.util.Stack<java.lang.Integer>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i24, i_array23);
        boolean b26 = stack_i24.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST27 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i28 = stack_i24.search((java.lang.Object) sortedArrayToBST27);
        java.lang.Integer[] i_array32 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i33 = sortedArrayToBST27.transform(i_array32);
        int i34 = binaryTreeDepth21.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i33);
        com.github.pedrovgs.problem19.BinaryTreeDepth binaryTreeDepth35 = new com.github.pedrovgs.problem19.BinaryTreeDepth();
        java.lang.Integer[] i_array37 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i38 = new java.util.Stack<java.lang.Integer>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i38, i_array37);
        boolean b40 = stack_i38.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST41 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i42 = stack_i38.search((java.lang.Object) sortedArrayToBST41);
        java.lang.Integer[] i_array46 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i47 = sortedArrayToBST41.transform(i_array46);
        int i48 = binaryTreeDepth35.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i47);
        int i49 = binaryTreeDepth21.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i47);
        java.lang.Integer[] i_array54 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i55 = new java.util.Vector<java.lang.Integer>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i55, i_array54);
        int i59 = vector_i55.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        vector_i55.trimToSize();
        vector_i55.add((int) (short) 0, (java.lang.Integer) 0);
        java.util.stream.Stream<java.lang.Integer> stream_i64 = vector_i55.stream();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST65 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array67 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i68 = sortedArrayToBST65.transform(i_array67);
        boolean b69 = vector_i55.removeElement((java.lang.Object) sortedArrayToBST65);
        com.github.pedrovgs.binarytree.BinaryNode<com.github.pedrovgs.problem24.SortedArrayToBST> binarynode_sortedArrayToBST70 = new com.github.pedrovgs.binarytree.BinaryNode<com.github.pedrovgs.problem24.SortedArrayToBST>(sortedArrayToBST65);
        int i71 = binaryTreeDepth21.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_sortedArrayToBST70);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode72 = binaryTreeByLevel0.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_sortedArrayToBST70);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(binarynode_i6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(list_binaryNode8);
        org.junit.Assert.assertNotNull(list_binaryNode9);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(binarynode_i16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(list_binaryNode18);
        org.junit.Assert.assertNotNull(list_binaryNode19);
        org.junit.Assert.assertNotNull(list_binaryNode20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(binarynode_i33);
        org.junit.Assert.assertTrue(i34 == 2);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i42 == (-1));
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(binarynode_i47);
        org.junit.Assert.assertTrue(i48 == 2);
        org.junit.Assert.assertTrue(i49 == 2);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(i59 == (-1));
        org.junit.Assert.assertNotNull(stream_i64);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(binarynode_i68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(i71 == 1);
        org.junit.Assert.assertNotNull(list_binaryNode72);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test215");
        com.github.pedrovgs.problem30.ScientificNotation scientificNotation0 = new com.github.pedrovgs.problem30.ScientificNotation();
        try {
            long long2 = scientificNotation0.calculate("/#301021/79/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test216");
        com.github.pedrovgs.problem53.CompressString compressString0 = new com.github.pedrovgs.problem53.CompressString();
        java.lang.String str2 = compressString0.compressRecursive("97");
        java.lang.String str4 = compressString0.compressAlternativeApproach("hi!");
        java.lang.String str6 = compressString0.compress("[]");
        java.lang.String str8 = compressString0.compress("/hi!/");
        java.lang.String str10 = compressString0.compressRecursive("/hi!/");
        java.lang.String str12 = compressString0.compressAlternativeApproach("3");
        java.lang.String str14 = compressString0.compressAlternativeApproach("35");
        java.lang.String str16 = compressString0.compressAlternativeApproach("/23/[/#2021/");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97" + "'", str2.equals("97"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/hi!" + "'", str8.equals("/hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "/hi!/" + "'", str10.equals("/hi!/"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "3" + "'", str12.equals("3"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "35" + "'", str14.equals("35"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "/23/[/#2021/" + "'", str16.equals("/23/[/#2021/"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test217");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideIterative((int) (byte) 10, (int) (byte) 100);
        float f6 = divideUsingSubtraction0.divideIterative(1, (int) (short) 100);
        try {
            float f9 = divideUsingSubtraction0.divideIterative(475165, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(f3 == 0.1f);
        org.junit.Assert.assertTrue(f6 == 0.01f);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test218");
        com.github.pedrovgs.problem77.HelloWorldWithoutSemicolon helloWorldWithoutSemicolon0 = new com.github.pedrovgs.problem77.HelloWorldWithoutSemicolon();
        helloWorldWithoutSemicolon0.printHelloWorld();
        helloWorldWithoutSemicolon0.printHelloWorld();
        helloWorldWithoutSemicolon0.printHelloWorld();
        helloWorldWithoutSemicolon0.printHelloWorld();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test219");
        com.github.pedrovgs.problem51.ReverseString reverseString0 = new com.github.pedrovgs.problem51.ReverseString();
        java.lang.String str2 = reverseString0.reverseRecursive("/hi!/");
        java.lang.String str4 = reverseString0.reverseIterative("[-1]");
        java.lang.String str6 = reverseString0.reverseRecursive("-52");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/!ih/" + "'", str2.equals("/!ih/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "]1-[" + "'", str4.equals("]1-["));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "25-" + "'", str6.equals("25-"));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test220");
        com.github.pedrovgs.problem7.FibonacciNumbers fibonacciNumbers0 = new com.github.pedrovgs.problem7.FibonacciNumbers();
        long long2 = fibonacciNumbers0.getIterative((long) 10);
        long long4 = fibonacciNumbers0.getRecursiveWithCaching((int) (byte) 100);
        long long6 = fibonacciNumbers0.getIterative((long) 11427);
        org.junit.Assert.assertTrue(long2 == 55L);
        org.junit.Assert.assertTrue(long4 == 3736710778780434371L);
        org.junit.Assert.assertTrue(long6 == (-2275317718987350270L));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test221");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        boolean b8 = vector_i5.remove((java.lang.Object) (short) -1);
        int i10 = vector_i5.indexOf((java.lang.Object) 1);
        int i12 = vector_i5.indexOf((java.lang.Object) 100.0d);
        java.lang.Object obj13 = vector_i5.clone();
        java.lang.Object obj14 = null;
        int i15 = vector_i5.lastIndexOf(obj14);
        int i17 = stack2_0.indexOf(obj14, 0);
        java.lang.Integer i19 = stack2_0.push((java.lang.Integer) 0);
        java.util.Enumeration<java.lang.Integer> enumeration_i20 = stack2_0.elements();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + i19 + "' != '" + 0 + "'", i19.equals(0));
        org.junit.Assert.assertNotNull(enumeration_i20);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test222");
        com.github.pedrovgs.problem16.BinaryTreePostOrder binaryTreePostOrder0 = new com.github.pedrovgs.problem16.BinaryTreePostOrder();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST1 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i4 = sortedArrayToBST1.transform(i_array3);
        java.lang.String str5 = binarynode_i4.toString();
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_6 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_6.push((int) (byte) 10);
        int i9 = stack1_6.getMin();
        boolean b10 = binarynode_i4.equals((java.lang.Object) stack1_6);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode11 = binaryTreePostOrder0.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i4);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST12 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array14 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i15 = sortedArrayToBST12.transform(i_array14);
        boolean b16 = binarynode_i15.hasRight();
        java.lang.Integer i17 = binarynode_i15.getData();
        boolean b18 = binarynode_i15.hasRight();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode19 = binaryTreePostOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i15);
        boolean b20 = binarynode_i15.hasLeft();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(binarynode_i4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "BinaryNode{data=100}" + "'", str5.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(list_binaryNode11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(binarynode_i15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100 + "'", i17.equals(100));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(list_binaryNode19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test223");
        com.github.pedrovgs.problem7.FibonacciNumbers fibonacciNumbers0 = new com.github.pedrovgs.problem7.FibonacciNumbers();
        long long2 = fibonacciNumbers0.getIterative((long) 10);
        long long4 = fibonacciNumbers0.getRecursiveWithCaching((int) (byte) 100);
        long long6 = fibonacciNumbers0.getIterative((long) 24);
        try {
            long long8 = fibonacciNumbers0.getRecursive((long) (-1241513984));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(long2 == 55L);
        org.junit.Assert.assertTrue(long4 == 3736710778780434371L);
        org.junit.Assert.assertTrue(long6 == 46368L);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test224");
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
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays17 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays18 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays17);
        java.lang.String str19 = listnode_mergeSortedArrays18.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays20 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays21 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays20);
        java.lang.String str22 = listnode_mergeSortedArrays21.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays23 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays21.setData(mergeSortedArrays23);
        listnode_mergeSortedArrays18.setNext(listnode_mergeSortedArrays21);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays26 = listnode_mergeSortedArrays18.getNext();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays27 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays28 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays27);
        com.github.pedrovgs.problem8.SplitArray splitArray29 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array32 = new int[] { (byte) 1, (byte) 10 };
        splitArray29.splitSwappingPartition(i_array32);
        int[] i_array40 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray29.splitSwappingRecursive(i_array40);
        com.github.pedrovgs.problem8.SplitArray splitArray42 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array45 = new int[] { (byte) 1, (byte) 10 };
        splitArray42.splitSwappingPartition(i_array45);
        int[] i_array53 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray42.splitSwappingRecursive(i_array53);
        int[] i_array55 = mergeSortedArrays27.merge(i_array40, i_array53);
        listnode_mergeSortedArrays18.setData(mergeSortedArrays27);
        java.lang.String str57 = listnode_mergeSortedArrays18.toString();
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
        listnode_mergeSortedArrays18.setData(mergeSortedArrays58);
        boolean b81 = palindromeList0.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays18);
        org.junit.Assert.assertNotNull(listnode_i5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays26);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(i_array55);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertNotNull(i_array69);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(i_array79);
        org.junit.Assert.assertTrue(b81 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test225");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push((-1));
        stack2_0.removeAllElements();
        java.lang.Object obj4 = stack2_0.clone();
        java.util.Spliterator<java.lang.Integer> spliterator_i5 = stack2_0.spliterator();
        java.lang.Object obj6 = stack2_0.clone();
        boolean b7 = stack2_0.isEmpty();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(spliterator_i5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test226");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        int i9 = vector_i4.indexOf((java.lang.Object) 1);
        int i11 = vector_i4.indexOf((java.lang.Object) 100.0d);
        java.lang.Object obj12 = vector_i4.clone();
        java.lang.Object obj13 = null;
        int i14 = vector_i4.lastIndexOf(obj13);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i16 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 27);
        int i17 = vector_i4.lastIndexOf((java.lang.Object) binarynode_i16);
        boolean b18 = binarynode_i16.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i19 = binarynode_i16.getRight();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(binarynode_i19);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test227");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("0", "");
        try {
            java.lang.String str6 = sumBinaryNumbers0.sumBinaryNumbersCheating("10", "[nul2]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test228");
        com.github.pedrovgs.problem11.IntToString intToString0 = new com.github.pedrovgs.problem11.IntToString();
        java.lang.String str2 = intToString0.transform((int) '#');
        java.lang.String str4 = intToString0.transform(10);
        java.lang.String str6 = intToString0.transform((int) (byte) 100);
        java.lang.String str8 = intToString0.transform(112197661);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "35" + "'", str2.equals("35"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "100" + "'", str6.equals("100"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "112197661" + "'", str8.equals("112197661"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test229");
        com.github.pedrovgs.problem25.Anagrams anagrams0 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str2 = anagrams0.get("hi!");
        java.util.List<java.lang.String> list_str4 = anagrams0.get("/");
        java.util.List<java.lang.String> list_str6 = anagrams0.get("79");
        org.junit.Assert.assertNotNull(list_str2);
        org.junit.Assert.assertNotNull(list_str4);
        org.junit.Assert.assertNotNull(list_str6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test230");
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers0 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        int i5 = mergeBinaryNumbers0.merge((int) (byte) 10, (-52000), 2147483647, (-52));
        int i10 = mergeBinaryNumbers0.merge(29, 107, 52, (int) (short) 1);
        int i15 = mergeBinaryNumbers0.merge(3, (-52), 18, 3628800);
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder16 = null;
        com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem67.MergeBinaryNumbers, com.github.pedrovgs.problem15.BinaryTreeInOrder> pair_mergeBinaryNumbers_binaryTreeInOrder17 = new com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem67.MergeBinaryNumbers, com.github.pedrovgs.problem15.BinaryTreeInOrder>(mergeBinaryNumbers0, binaryTreeInOrder16);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i10 == 112197661);
        org.junit.Assert.assertTrue(i15 == (-13631485));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test231");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        int i9 = vector_i4.indexOf((java.lang.Object) 1);
        int i11 = vector_i4.indexOf((java.lang.Object) 100.0d);
        try {
            vector_i4.setElementAt((java.lang.Integer) 2, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i11 == (-1));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test232");
        com.github.pedrovgs.problem7.FibonacciNumbers fibonacciNumbers0 = new com.github.pedrovgs.problem7.FibonacciNumbers();
        long long2 = fibonacciNumbers0.getIterative((long) 10);
        long long4 = fibonacciNumbers0.getRecursiveWithCaching((int) (byte) 100);
        long long6 = fibonacciNumbers0.getIterative((long) 720);
        try {
            long long8 = fibonacciNumbers0.getRecursive((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(long2 == 55L);
        org.junit.Assert.assertTrue(long4 == 3736710778780434371L);
        org.junit.Assert.assertTrue(long6 == 3575784222804384192L);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test233");
        com.github.pedrovgs.problem51.ReverseString reverseString0 = new com.github.pedrovgs.problem51.ReverseString();
        java.lang.String str2 = reverseString0.reverseRecursive("/hi!/");
        java.lang.String str4 = reverseString0.reverseIterative("hi!");
        java.lang.String str6 = reverseString0.reverseIterative("1");
        java.lang.String str8 = reverseString0.reverseRecursive("/");
        java.lang.String str10 = reverseString0.reverseIterative("/32/-52/7/");
        java.lang.String str12 = reverseString0.reverseRecursive("");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/!ih/" + "'", str2.equals("/!ih/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "!ih" + "'", str4.equals("!ih"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/" + "'", str8.equals("/"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "/7/25-/23/" + "'", str10.equals("/7/25-/23/"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test234");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideIterative((int) (byte) 10, (int) (byte) 100);
        float f6 = divideUsingSubtraction0.divideIterative(1, (int) (short) 100);
        float f9 = divideUsingSubtraction0.divideRecursive(3, 27);
        float f12 = divideUsingSubtraction0.divideIterative((int) (byte) -1, (-8));
        float f15 = divideUsingSubtraction0.divideRecursive(51, 2);
        org.junit.Assert.assertTrue(f3 == 0.1f);
        org.junit.Assert.assertTrue(f6 == 0.01f);
        org.junit.Assert.assertTrue(f9 == 0.11111111f);
        org.junit.Assert.assertTrue(f12 == 2.85212672E8f);
        org.junit.Assert.assertTrue(f15 == 25.5f);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test235");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        boolean b8 = vector_i5.remove((java.lang.Object) (short) -1);
        int i10 = vector_i5.indexOf((java.lang.Object) 1);
        int i12 = vector_i5.indexOf((java.lang.Object) 100.0d);
        java.lang.Object obj13 = vector_i5.clone();
        java.lang.Object obj14 = null;
        int i15 = vector_i5.lastIndexOf(obj14);
        int i17 = stack2_0.indexOf(obj14, 0);
        stack2_0.push((-5200));
        java.lang.Object obj20 = stack2_0.clone();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test236");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i5 = reverseLinkedList1.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays6 = listnode_mergeSortedArrays3.getNext();
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode8 = findKthElement0.find2((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(listnode_i5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays6);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test237");
        com.github.pedrovgs.problem11.IntToString intToString0 = new com.github.pedrovgs.problem11.IntToString();
        java.lang.String str2 = intToString0.transform(3);
        java.lang.String str4 = intToString0.transform((int) (byte) 10);
        java.lang.String str6 = intToString0.transform((int) ' ');
        java.lang.String str8 = intToString0.transform((int) (short) 100);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3" + "'", str2.equals("3"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "32" + "'", str6.equals("32"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "100" + "'", str8.equals("100"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test238");
        com.github.pedrovgs.problem44.FindMinNumberAtPosition findMinNumberAtPosition0 = new com.github.pedrovgs.problem44.FindMinNumberAtPosition();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i1 = null;
        try {
            java.lang.Integer i3 = findMinNumberAtPosition0.find(binarynode_i1, 3628800);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test239");
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements0 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = listnode_mergeSortedArrays3.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = listnode_mergeSortedArrays3.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i7 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i8 = null;
        binarynode_i7.setRight(binarynode_i8);
        boolean b10 = listnode_mergeSortedArrays3.equals((java.lang.Object) binarynode_i8);
        com.github.pedrovgs.linkedlist.ListNode listNode11 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        removeListDuplicatedElements0.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode11);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements> listnode_removeListDuplicatedElements13 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements>(removeListDuplicatedElements0);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList14 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays15 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays16 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays15);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays17 = listnode_mergeSortedArrays16.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays18 = listnode_mergeSortedArrays16.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i20 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i21 = null;
        binarynode_i20.setRight(binarynode_i21);
        boolean b23 = listnode_mergeSortedArrays16.equals((java.lang.Object) binarynode_i21);
        com.github.pedrovgs.linkedlist.ListNode listNode24 = reverseLinkedList14.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays16);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode25 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays26 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays27 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays26);
        java.lang.String str28 = listnode_mergeSortedArrays27.toString();
        deleteListNode25.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays27);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays30 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays31 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays30);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers32 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b33 = listnode_mergeSortedArrays31.equals((java.lang.Object) mergeBinaryNumbers32);
        deleteListNode25.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays31);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i35 = reverseLinkedList14.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays31);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays36 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays37 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays36);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers38 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b39 = listnode_mergeSortedArrays37.equals((java.lang.Object) mergeBinaryNumbers38);
        com.github.pedrovgs.linkedlist.ListNode listNode40 = reverseLinkedList14.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays37);
        removeListDuplicatedElements0.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode40);
        java.lang.String str42 = listNode40.toString();
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(listNode11);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays17);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays18);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(listNode24);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(listnode_i35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(listNode40);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test240");
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST0 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i3 = sortedArrayToBST0.transform(i_array2);
        boolean b4 = binarynode_i3.hasRight();
        java.lang.Integer i5 = binarynode_i3.getData();
        boolean b6 = binarynode_i3.hasRight();
        boolean b7 = binarynode_i3.hasRight();
        boolean b8 = binarynode_i3.hasLeft();
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(binarynode_i3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + i5 + "' != '" + 100 + "'", i5.equals(100));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test241");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        boolean b9 = vector_i4.add((java.lang.Integer) 10);
        boolean b11 = vector_i4.remove((java.lang.Object) 10L);
        java.util.Enumeration<java.lang.Integer> enumeration_i12 = vector_i4.elements();
        try {
            vector_i4.setElementAt((java.lang.Integer) 720, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(enumeration_i12);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test242");
        com.github.pedrovgs.problem60.PartitionList partitionList0 = new com.github.pedrovgs.problem60.PartitionList();
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList1 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements2 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList3 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays4 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays4);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays6 = listnode_mergeSortedArrays5.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays7 = listnode_mergeSortedArrays5.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i9 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i10 = null;
        binarynode_i9.setRight(binarynode_i10);
        boolean b12 = listnode_mergeSortedArrays5.equals((java.lang.Object) binarynode_i10);
        com.github.pedrovgs.linkedlist.ListNode listNode13 = reverseLinkedList3.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays5);
        removeListDuplicatedElements2.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode13);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements15 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList16 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays17 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays18 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays17);
        java.lang.String str19 = listnode_mergeSortedArrays18.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode20 = reverseLinkedList16.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays18);
        removeListDuplicatedElements15.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode20);
        removeListDuplicatedElements2.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode20);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i23 = getTheElementInTheMiddleOfTheList1.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode20);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements24 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList25 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays26 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays27 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays26);
        java.lang.String str28 = listnode_mergeSortedArrays27.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode29 = reverseLinkedList25.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays27);
        removeListDuplicatedElements24.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode29);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i31 = getTheElementInTheMiddleOfTheList1.get((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode29);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements32 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList33 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays34 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays35 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays34);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays36 = listnode_mergeSortedArrays35.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays37 = listnode_mergeSortedArrays35.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i39 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i40 = null;
        binarynode_i39.setRight(binarynode_i40);
        boolean b42 = listnode_mergeSortedArrays35.equals((java.lang.Object) binarynode_i40);
        com.github.pedrovgs.linkedlist.ListNode listNode43 = reverseLinkedList33.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays35);
        removeListDuplicatedElements32.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode43);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements45 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList46 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays47 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays48 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays47);
        java.lang.String str49 = listnode_mergeSortedArrays48.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode50 = reverseLinkedList46.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays48);
        removeListDuplicatedElements45.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode50);
        removeListDuplicatedElements32.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode50);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i53 = getTheElementInTheMiddleOfTheList1.get((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode50);
        try {
            com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i55 = partitionList0.split((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode50, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays6);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(listNode13);
        org.junit.Assert.assertNotNull(listNode20);
        org.junit.Assert.assertNotNull(listnode_i23);
        org.junit.Assert.assertNotNull(listNode29);
        org.junit.Assert.assertNotNull(listnode_i31);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays36);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays37);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(listNode43);
        org.junit.Assert.assertNotNull(listNode50);
        org.junit.Assert.assertNotNull(listnode_i53);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test243");
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces0 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces1 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array2 = new char[] {};
        replaceSpaces1.replace2(char_array2);
        replaceSpaces0.replace(char_array2);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces5 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces6 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces7 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array8 = new char[] {};
        replaceSpaces7.replace2(char_array8);
        replaceSpaces6.replace(char_array8);
        replaceSpaces5.replace(char_array8);
        replaceSpaces0.replace(char_array8);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces13 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces14 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array20 = new char[] { '#', 'a', ' ', '4', 'a' };
        replaceSpaces14.replace(char_array20);
        replaceSpaces13.replace(char_array20);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces23 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array24 = new char[] {};
        replaceSpaces23.replace2(char_array24);
        replaceSpaces13.replace(char_array24);
        replaceSpaces0.replace(char_array24);
        org.junit.Assert.assertNotNull(char_array2);
        org.junit.Assert.assertNotNull(char_array8);
        org.junit.Assert.assertNotNull(char_array20);
        org.junit.Assert.assertNotNull(char_array24);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test244");
        com.github.pedrovgs.problem30.ScientificNotation scientificNotation0 = new com.github.pedrovgs.problem30.ScientificNotation();
        try {
            long long2 = scientificNotation0.calculate("##001");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test245");
        com.github.pedrovgs.problem30.ScientificNotation scientificNotation0 = new com.github.pedrovgs.problem30.ScientificNotation();
        try {
            long long2 = scientificNotation0.calculate("1241513983");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test246");
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays0 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays0);
        java.lang.String str2 = listnode_mergeSortedArrays1.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays6 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays4.setData(mergeSortedArrays6);
        listnode_mergeSortedArrays1.setNext(listnode_mergeSortedArrays4);
        com.github.pedrovgs.problem11.IntToString intToString9 = new com.github.pedrovgs.problem11.IntToString();
        java.lang.String str11 = intToString9.transform((int) '#');
        boolean b12 = listnode_mergeSortedArrays4.equals((java.lang.Object) str11);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "35" + "'", str11.equals("35"));
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test247");
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder0 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian1 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i3 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d4 = avlTreeMedian1.find(binarynode_i3);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor5 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals6 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST7 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array9 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i10 = sortedArrayToBST7.transform(i_array9);
        boolean b11 = binarynode_i10.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST12 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array14 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i15 = sortedArrayToBST12.transform(i_array14);
        boolean b16 = binarynode_i15.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i17 = binarynode_i15.getRight();
        boolean b18 = binaryTreeEquals6.areEqualsIterative(binarynode_i10, binarynode_i15);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST19 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array21 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i22 = sortedArrayToBST19.transform(i_array21);
        boolean b23 = binarynode_i22.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST24 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array26 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i27 = sortedArrayToBST24.transform(i_array26);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode28 = lowestCommonAncestor5.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i15, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i22, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i27);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i29 = binarynode_i15.getLeft();
        double d30 = avlTreeMedian1.find(binarynode_i15);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST31 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array33 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i34 = sortedArrayToBST31.transform(i_array33);
        boolean b35 = binarynode_i34.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i36 = binarynode_i34.getRight();
        java.lang.Integer i37 = binarynode_i34.getData();
        binarynode_i15.setLeft(binarynode_i34);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i39 = binaryTreeInOrder0.getIterative(binarynode_i34);
        boolean b40 = binarynode_i34.hasRight();
        org.junit.Assert.assertTrue(d4 == 10.0d);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(binarynode_i10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(binarynode_i15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(binarynode_i17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(binarynode_i22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(binarynode_i27);
        org.junit.Assert.assertNull(binaryNode28);
        org.junit.Assert.assertNull(binarynode_i29);
        org.junit.Assert.assertTrue(d30 == 100.0d);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(binarynode_i34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(binarynode_i36);
        org.junit.Assert.assertTrue("'" + i37 + "' != '" + 100 + "'", i37.equals(100));
        org.junit.Assert.assertNotNull(list_binarynode_i39);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test248");
        com.github.pedrovgs.problem61.SumLists sumLists0 = new com.github.pedrovgs.problem61.SumLists();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements1 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList2 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode6 = reverseLinkedList2.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        removeListDuplicatedElements1.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode6);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList8 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements9 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList10 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays11 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays12 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays11);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays13 = listnode_mergeSortedArrays12.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays14 = listnode_mergeSortedArrays12.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i16 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i17 = null;
        binarynode_i16.setRight(binarynode_i17);
        boolean b19 = listnode_mergeSortedArrays12.equals((java.lang.Object) binarynode_i17);
        com.github.pedrovgs.linkedlist.ListNode listNode20 = reverseLinkedList10.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays12);
        removeListDuplicatedElements9.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode20);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements22 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList23 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays24 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays25 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays24);
        java.lang.String str26 = listnode_mergeSortedArrays25.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode27 = reverseLinkedList23.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays25);
        removeListDuplicatedElements22.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode27);
        removeListDuplicatedElements9.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode27);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i30 = getTheElementInTheMiddleOfTheList8.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode27);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements31 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList32 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays33 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays34 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays33);
        java.lang.String str35 = listnode_mergeSortedArrays34.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode36 = reverseLinkedList32.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays34);
        removeListDuplicatedElements31.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode36);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i38 = getTheElementInTheMiddleOfTheList8.get((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode36);
        removeListDuplicatedElements1.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode36);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList40 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays41 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays42 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays41);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays43 = listnode_mergeSortedArrays42.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays44 = listnode_mergeSortedArrays42.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i46 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i47 = null;
        binarynode_i46.setRight(binarynode_i47);
        boolean b49 = listnode_mergeSortedArrays42.equals((java.lang.Object) binarynode_i47);
        com.github.pedrovgs.linkedlist.ListNode listNode50 = reverseLinkedList40.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays42);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode51 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays52 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays53 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays52);
        java.lang.String str54 = listnode_mergeSortedArrays53.toString();
        deleteListNode51.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays53);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays56 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays57 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays56);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers58 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b59 = listnode_mergeSortedArrays57.equals((java.lang.Object) mergeBinaryNumbers58);
        deleteListNode51.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays57);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i61 = reverseLinkedList40.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays57);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays62 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays63 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays62);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays64 = listnode_mergeSortedArrays63.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays65 = listnode_mergeSortedArrays63.getNext();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays66 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort67 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray68 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array71 = new int[] { (byte) 1, (byte) 10 };
        splitArray68.splitSwappingPartition(i_array71);
        selectionSort67.sort(i_array71);
        com.github.pedrovgs.problem8.SplitArray splitArray74 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array77 = new int[] { (byte) 1, (byte) 10 };
        splitArray74.splitSwappingPartition(i_array77);
        int[] i_array85 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray74.splitSwappingRecursive(i_array85);
        int[] i_array87 = mergeSortedArrays66.merge(i_array71, i_array85);
        listnode_mergeSortedArrays63.setData(mergeSortedArrays66);
        java.lang.String str89 = listnode_mergeSortedArrays63.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i90 = reverseLinkedList40.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays63);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays91 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays92 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays91);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays93 = listnode_mergeSortedArrays92.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays94 = listnode_mergeSortedArrays92.getNext();
        com.github.pedrovgs.linkedlist.ListNode listNode95 = reverseLinkedList40.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays92);
        try {
            int i96 = sumLists0.sumReverse((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode36, (com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode95);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(listNode6);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays13);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays14);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(listNode20);
        org.junit.Assert.assertNotNull(listNode27);
        org.junit.Assert.assertNotNull(listnode_i30);
        org.junit.Assert.assertNotNull(listNode36);
        org.junit.Assert.assertNotNull(listnode_i38);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays43);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays44);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(listNode50);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(listnode_i61);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays64);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays65);
        org.junit.Assert.assertNotNull(i_array71);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(i_array85);
        org.junit.Assert.assertNotNull(i_array87);
        org.junit.Assert.assertNotNull(listnode_i90);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays93);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays94);
        org.junit.Assert.assertNotNull(listNode95);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test249");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(10);
        int i4 = factorial0.getTailRecursive((int) (short) 10);
        int i6 = factorial0.getRecursive((int) '#');
        int i8 = factorial0.getRecursive(0);
        try {
            int i10 = factorial0.getIterative((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 3628800);
        org.junit.Assert.assertTrue(i4 == 3628800);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test250");
        com.github.pedrovgs.problem45.FindNthMostRepeatedElement findNthMostRepeatedElement0 = new com.github.pedrovgs.problem45.FindNthMostRepeatedElement();
        int[] i_array1 = null;
        try {
            int i3 = findNthMostRepeatedElement0.find(i_array1, 1484783616);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test251");
        com.github.pedrovgs.problem78.AutoBoxingTrick autoBoxingTrick0 = new com.github.pedrovgs.problem78.AutoBoxingTrick();
        boolean b3 = autoBoxingTrick0.compare((java.lang.Integer) 0, (java.lang.Integer) 2147483647);
        boolean b6 = autoBoxingTrick0.compare((java.lang.Integer) (-7), (java.lang.Integer) 13631492);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test252");
        com.github.pedrovgs.problem60.PartitionList partitionList0 = new com.github.pedrovgs.problem60.PartitionList();
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode1 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = listnode_mergeSortedArrays3.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = listnode_mergeSortedArrays3.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i7 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i8 = null;
        binarynode_i7.setRight(binarynode_i8);
        boolean b10 = listnode_mergeSortedArrays3.equals((java.lang.Object) binarynode_i8);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays11 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays12 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays11);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays13 = listnode_mergeSortedArrays12.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays14 = listnode_mergeSortedArrays12.getNext();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays15 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort16 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray17 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array20 = new int[] { (byte) 1, (byte) 10 };
        splitArray17.splitSwappingPartition(i_array20);
        selectionSort16.sort(i_array20);
        com.github.pedrovgs.problem8.SplitArray splitArray23 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array26 = new int[] { (byte) 1, (byte) 10 };
        splitArray23.splitSwappingPartition(i_array26);
        int[] i_array34 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray23.splitSwappingRecursive(i_array34);
        int[] i_array36 = mergeSortedArrays15.merge(i_array20, i_array34);
        listnode_mergeSortedArrays12.setData(mergeSortedArrays15);
        listnode_mergeSortedArrays3.setData(mergeSortedArrays15);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays39 = listnode_mergeSortedArrays3.getNext();
        deleteListNode1.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList41 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements42 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList43 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays44 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays45 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays44);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays46 = listnode_mergeSortedArrays45.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays47 = listnode_mergeSortedArrays45.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i49 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i50 = null;
        binarynode_i49.setRight(binarynode_i50);
        boolean b52 = listnode_mergeSortedArrays45.equals((java.lang.Object) binarynode_i50);
        com.github.pedrovgs.linkedlist.ListNode listNode53 = reverseLinkedList43.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays45);
        removeListDuplicatedElements42.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode53);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements55 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList56 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays57 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays58 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays57);
        java.lang.String str59 = listnode_mergeSortedArrays58.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode60 = reverseLinkedList56.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays58);
        removeListDuplicatedElements55.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode60);
        removeListDuplicatedElements42.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode60);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i63 = getTheElementInTheMiddleOfTheList41.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode60);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements64 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList65 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays66 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays67 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays66);
        java.lang.String str68 = listnode_mergeSortedArrays67.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode69 = reverseLinkedList65.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays67);
        removeListDuplicatedElements64.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode69);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i71 = getTheElementInTheMiddleOfTheList41.get((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode69);
        deleteListNode1.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_i71);
        try {
            com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i74 = partitionList0.split(listnode_i71, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays13);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays14);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays39);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays46);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays47);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(listNode53);
        org.junit.Assert.assertNotNull(listNode60);
        org.junit.Assert.assertNotNull(listnode_i63);
        org.junit.Assert.assertNotNull(listNode69);
        org.junit.Assert.assertNotNull(listnode_i71);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test253");
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList0 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        java.lang.String str3 = listnode_mergeSortedArrays2.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i4 = reverseLinkedList0.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList5 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays6 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays7 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays6);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays8 = listnode_mergeSortedArrays7.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays9 = listnode_mergeSortedArrays7.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i11 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i12 = null;
        binarynode_i11.setRight(binarynode_i12);
        boolean b14 = listnode_mergeSortedArrays7.equals((java.lang.Object) binarynode_i12);
        com.github.pedrovgs.linkedlist.ListNode listNode15 = reverseLinkedList5.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays7);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode16 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays17 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays18 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays17);
        java.lang.String str19 = listnode_mergeSortedArrays18.toString();
        deleteListNode16.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays18);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays21 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays22 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays21);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers23 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b24 = listnode_mergeSortedArrays22.equals((java.lang.Object) mergeBinaryNumbers23);
        deleteListNode16.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays22);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i26 = reverseLinkedList5.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays22);
        com.github.pedrovgs.linkedlist.ListNode listNode27 = reverseLinkedList0.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays22);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList28 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays29 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays30 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays29);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays31 = listnode_mergeSortedArrays30.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays32 = listnode_mergeSortedArrays30.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i34 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i35 = null;
        binarynode_i34.setRight(binarynode_i35);
        boolean b37 = listnode_mergeSortedArrays30.equals((java.lang.Object) binarynode_i35);
        com.github.pedrovgs.linkedlist.ListNode listNode38 = reverseLinkedList28.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays30);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode39 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays40 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays41 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays40);
        java.lang.String str42 = listnode_mergeSortedArrays41.toString();
        deleteListNode39.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays41);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays44 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays45 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays44);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers46 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b47 = listnode_mergeSortedArrays45.equals((java.lang.Object) mergeBinaryNumbers46);
        deleteListNode39.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays45);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i49 = reverseLinkedList28.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays45);
        com.github.pedrovgs.linkedlist.ListNode listNode50 = reverseLinkedList0.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_i49);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements51 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList52 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays53 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays54 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays53);
        java.lang.String str55 = listnode_mergeSortedArrays54.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode56 = reverseLinkedList52.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays54);
        removeListDuplicatedElements51.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode56);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i58 = reverseLinkedList0.reverseRecursive(listNode56);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays59 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays60 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays59);
        java.lang.String str61 = listnode_mergeSortedArrays60.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays62 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays60.setData(mergeSortedArrays62);
        com.github.pedrovgs.linkedlist.ListNode listNode64 = reverseLinkedList0.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays60);
        org.junit.Assert.assertNotNull(listnode_i4);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays8);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(listNode15);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(listnode_i26);
        org.junit.Assert.assertNotNull(listNode27);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays31);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays32);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(listNode38);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(listnode_i49);
        org.junit.Assert.assertNotNull(listNode50);
        org.junit.Assert.assertNotNull(listNode56);
        org.junit.Assert.assertNotNull(listnode_i58);
        org.junit.Assert.assertNotNull(listNode64);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test254");
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates0 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates1 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST2 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = sortedArrayToBST2.transform(i_array4);
        java.lang.Integer[] i_array6 = removeDuplicates1.removeUsingSorting(i_array4);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST7 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array9 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i10 = sortedArrayToBST7.transform(i_array9);
        java.lang.Integer[] i_array11 = removeDuplicates1.removeUsingSorting(i_array9);
        java.lang.Integer[] i_array12 = removeDuplicates0.removeUsingSorting(i_array9);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates13 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates14 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST15 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array17 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i18 = sortedArrayToBST15.transform(i_array17);
        java.lang.Integer[] i_array19 = removeDuplicates14.removeUsingSorting(i_array17);
        java.lang.Integer[] i_array20 = removeDuplicates13.removeUsingSorting(i_array19);
        java.lang.Integer[] i_array21 = removeDuplicates0.removeUsingSorting(i_array20);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates22 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST23 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array25 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i26 = sortedArrayToBST23.transform(i_array25);
        java.lang.Integer[] i_array27 = removeDuplicates22.removeUsingSorting(i_array25);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates28 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST29 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array31 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i32 = sortedArrayToBST29.transform(i_array31);
        java.lang.Integer[] i_array33 = removeDuplicates28.removeUsingSorting(i_array31);
        java.lang.Integer[] i_array34 = removeDuplicates22.removeUsingSorting(i_array31);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates35 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST36 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array38 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i39 = sortedArrayToBST36.transform(i_array38);
        java.lang.Integer[] i_array40 = removeDuplicates35.removeUsingSorting(i_array38);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST41 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array43 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i44 = sortedArrayToBST41.transform(i_array43);
        java.lang.Integer[] i_array45 = removeDuplicates35.removeUsingSorting(i_array43);
        java.lang.Integer[] i_array46 = removeDuplicates22.removeUsingSet(i_array45);
        java.lang.Integer[] i_array47 = removeDuplicates0.removeUsingSet(i_array46);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(binarynode_i5);
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(binarynode_i10);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(binarynode_i18);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(binarynode_i26);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(binarynode_i32);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(binarynode_i39);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(binarynode_i44);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(i_array47);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test255");
        com.github.pedrovgs.problem26.Palindromes palindromes0 = new com.github.pedrovgs.problem26.Palindromes();
        boolean b2 = palindromes0.evaluate("/");
        boolean b4 = palindromes0.evaluate("10");
        boolean b6 = palindromes0.evaluate("/23/[/#2021/");
        boolean b8 = palindromes0.evaluate("");
        boolean b10 = palindromes0.evaluate("/#301021/79/");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test256");
        com.github.pedrovgs.problem80.QuickSort quickSort0 = new com.github.pedrovgs.problem80.QuickSort();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort2 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray3 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array6 = new int[] { (byte) 1, (byte) 10 };
        splitArray3.splitSwappingPartition(i_array6);
        selectionSort2.sort(i_array6);
        com.github.pedrovgs.problem8.SplitArray splitArray9 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array12 = new int[] { (byte) 1, (byte) 10 };
        splitArray9.splitSwappingPartition(i_array12);
        int[] i_array20 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray9.splitSwappingRecursive(i_array20);
        int[] i_array22 = mergeSortedArrays1.merge(i_array6, i_array20);
        quickSort0.sort(i_array6);
        com.github.pedrovgs.problem25.Anagrams anagrams24 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str26 = anagrams24.get("hi!");
        java.util.List<java.lang.String> list_str28 = anagrams24.get("/");
        com.github.pedrovgs.problem25.Anagrams[] anagrams_array29 = new com.github.pedrovgs.problem25.Anagrams[] { anagrams24 };
        com.github.pedrovgs.problem28.FindSums findSums30 = new com.github.pedrovgs.problem28.FindSums();
        com.github.pedrovgs.problem8.SplitArray splitArray31 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray32 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array35 = new int[] { (byte) 1, (byte) 10 };
        splitArray32.splitSwappingPartition(i_array35);
        splitArray31.splitSwappingRecursive(i_array35);
        java.util.List<com.github.pedrovgs.pair.Pair<java.lang.Integer, java.lang.Integer>> list_pair_i_i39 = findSums30.find(i_array35, 0);
        int[] i_array41 = new int[] { 7 };
        java.util.List<com.github.pedrovgs.pair.Pair<java.lang.Integer, java.lang.Integer>> list_pair_i_i43 = findSums30.findLinearComplexityOrder(i_array41, 2147483647);
        com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem25.Anagrams[], com.github.pedrovgs.problem28.FindSums> pair_anagrams_array_findSums44 = new com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem25.Anagrams[], com.github.pedrovgs.problem28.FindSums>(anagrams_array29, findSums30);
        com.github.pedrovgs.problem12.MoveZerosInArray moveZerosInArray45 = new com.github.pedrovgs.problem12.MoveZerosInArray();
        com.github.pedrovgs.problem8.SplitArray splitArray46 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray47 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array50 = new int[] { (byte) 1, (byte) 10 };
        splitArray47.splitSwappingPartition(i_array50);
        splitArray46.splitSwappingRecursive(i_array50);
        moveZerosInArray45.moveSorting(i_array50);
        java.util.List<com.github.pedrovgs.pair.Pair<java.lang.Integer, java.lang.Integer>> list_pair_i_i55 = findSums30.findLinearComplexityOrder(i_array50, (int) '4');
        quickSort0.sort(i_array50);
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(list_str26);
        org.junit.Assert.assertNotNull(list_str28);
        org.junit.Assert.assertNotNull(anagrams_array29);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(list_pair_i_i39);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(list_pair_i_i43);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(list_pair_i_i55);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test257");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        java.lang.String str3 = listnode_mergeSortedArrays2.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays4 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays4);
        java.lang.String str6 = listnode_mergeSortedArrays5.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays7 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays5.setData(mergeSortedArrays7);
        listnode_mergeSortedArrays2.setNext(listnode_mergeSortedArrays5);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays10 = listnode_mergeSortedArrays2.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays11 = listnode_mergeSortedArrays2.getNext();
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode13 = findKthElement0.find2((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays10);
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays11);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test258");
        com.github.pedrovgs.problem20.MultiplicationWithoutMultiply multiplicationWithoutMultiply0 = new com.github.pedrovgs.problem20.MultiplicationWithoutMultiply();
        int i3 = multiplicationWithoutMultiply0.calculate(270, (-52));
        int i6 = multiplicationWithoutMultiply0.calculate((int) (byte) 10, (-8));
        org.junit.Assert.assertTrue(i3 == (-14040));
        org.junit.Assert.assertTrue(i6 == (-80));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test259");
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces0 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces1 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array7 = new char[] { '#', 'a', ' ', '4', 'a' };
        replaceSpaces1.replace(char_array7);
        replaceSpaces0.replace(char_array7);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces10 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces11 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces12 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array13 = new char[] {};
        replaceSpaces12.replace2(char_array13);
        replaceSpaces11.replace(char_array13);
        replaceSpaces10.replace(char_array13);
        replaceSpaces0.replace(char_array13);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces18 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array24 = new char[] { '#', 'a', ' ', '4', 'a' };
        replaceSpaces18.replace(char_array24);
        replaceSpaces0.replace2(char_array24);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces27 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces28 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array34 = new char[] { '#', 'a', ' ', '4', 'a' };
        replaceSpaces28.replace(char_array34);
        replaceSpaces27.replace(char_array34);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces37 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array38 = new char[] {};
        replaceSpaces37.replace2(char_array38);
        replaceSpaces27.replace(char_array38);
        replaceSpaces0.replace2(char_array38);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces42 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces43 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array49 = new char[] { '#', 'a', ' ', '4', 'a' };
        replaceSpaces43.replace(char_array49);
        replaceSpaces42.replace(char_array49);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces52 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces53 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces54 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array55 = new char[] {};
        replaceSpaces54.replace2(char_array55);
        replaceSpaces53.replace(char_array55);
        replaceSpaces52.replace(char_array55);
        replaceSpaces42.replace(char_array55);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces60 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces61 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array67 = new char[] { '#', 'a', ' ', '4', 'a' };
        replaceSpaces61.replace(char_array67);
        replaceSpaces60.replace(char_array67);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces70 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces71 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces72 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array73 = new char[] {};
        replaceSpaces72.replace2(char_array73);
        replaceSpaces71.replace(char_array73);
        replaceSpaces70.replace(char_array73);
        replaceSpaces60.replace(char_array73);
        replaceSpaces42.replace2(char_array73);
        replaceSpaces0.replace(char_array73);
        org.junit.Assert.assertNotNull(char_array7);
        org.junit.Assert.assertNotNull(char_array13);
        org.junit.Assert.assertNotNull(char_array24);
        org.junit.Assert.assertNotNull(char_array34);
        org.junit.Assert.assertNotNull(char_array38);
        org.junit.Assert.assertNotNull(char_array49);
        org.junit.Assert.assertNotNull(char_array55);
        org.junit.Assert.assertNotNull(char_array67);
        org.junit.Assert.assertNotNull(char_array73);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test260");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("0", "");
        java.lang.String str6 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("##001", "100##");
        try {
            java.lang.String str9 = sumBinaryNumbers0.sumBinaryNumbersBasedOnPowersOfTwo("01", "25-");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "&0///0" + "'", str6.equals("&0///0"));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test261");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        java.lang.Integer i11 = vector_i5.get((int) (short) 1);
        java.lang.String str12 = vector_i5.toString();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1) + "'", i11.equals((-1)));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[1, -1, 100, 0]" + "'", str12.equals("[1, -1, 100, 0]"));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test262");
        com.github.pedrovgs.problem78.AutoBoxingTrick autoBoxingTrick0 = new com.github.pedrovgs.problem78.AutoBoxingTrick();
        boolean b3 = autoBoxingTrick0.compare((java.lang.Integer) 0, (java.lang.Integer) 2147483647);
        boolean b6 = autoBoxingTrick0.compare((java.lang.Integer) 1484783616, (java.lang.Integer) 30);
        boolean b9 = autoBoxingTrick0.compare((java.lang.Integer) 52002, (java.lang.Integer) 11427);
        boolean b12 = autoBoxingTrick0.compare((java.lang.Integer) 3628800, (java.lang.Integer) 13631492);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test263");
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements0 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = listnode_mergeSortedArrays3.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = listnode_mergeSortedArrays3.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i7 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i8 = null;
        binarynode_i7.setRight(binarynode_i8);
        boolean b10 = listnode_mergeSortedArrays3.equals((java.lang.Object) binarynode_i8);
        com.github.pedrovgs.linkedlist.ListNode listNode11 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        removeListDuplicatedElements0.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode11);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements> listnode_removeListDuplicatedElements13 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements>(removeListDuplicatedElements0);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList14 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays15 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays16 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays15);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays17 = listnode_mergeSortedArrays16.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays18 = listnode_mergeSortedArrays16.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i20 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i21 = null;
        binarynode_i20.setRight(binarynode_i21);
        boolean b23 = listnode_mergeSortedArrays16.equals((java.lang.Object) binarynode_i21);
        com.github.pedrovgs.linkedlist.ListNode listNode24 = reverseLinkedList14.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays16);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode25 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays26 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays27 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays26);
        java.lang.String str28 = listnode_mergeSortedArrays27.toString();
        deleteListNode25.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays27);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays30 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays31 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays30);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers32 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b33 = listnode_mergeSortedArrays31.equals((java.lang.Object) mergeBinaryNumbers32);
        deleteListNode25.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays31);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i35 = reverseLinkedList14.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays31);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays36 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays37 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays36);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers38 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b39 = listnode_mergeSortedArrays37.equals((java.lang.Object) mergeBinaryNumbers38);
        com.github.pedrovgs.linkedlist.ListNode listNode40 = reverseLinkedList14.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays37);
        removeListDuplicatedElements0.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode40);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(listNode11);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays17);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays18);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(listNode24);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(listnode_i35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(listNode40);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test264");
        com.github.pedrovgs.problem54.RotateMatrix rotateMatrix0 = new com.github.pedrovgs.problem54.RotateMatrix();
        com.github.pedrovgs.problem42.FloodFill floodFill1 = new com.github.pedrovgs.problem42.FloodFill();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral2 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array3 = new int[][] {};
        int[] i_array4 = goThroughMatrixInSpiral2.go(i_array_array3);
        int[] i_array11 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[] i_array18 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[][] i_array_array19 = new int[][] { i_array11, i_array18 };
        int[] i_array20 = goThroughMatrixInSpiral2.go(i_array_array19);
        floodFill1.apply(i_array_array19, (int) (byte) 1, (int) (byte) 0, (int) ' ', (-5200));
        try {
            rotateMatrix0.rotate(i_array_array19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array_array3);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertNotNull(i_array_array19);
        org.junit.Assert.assertNotNull(i_array20);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test265");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        boolean b13 = vector_i4.contains((java.lang.Object) (byte) 100);
        java.util.Enumeration<java.lang.Integer> enumeration_i14 = vector_i4.elements();
        java.lang.Integer i15 = vector_i4.firstElement();
        java.lang.Object obj16 = vector_i4.clone();
        int i17 = vector_i4.size();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(enumeration_i14);
        org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0 + "'", i15.equals(0));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue(i17 == 4);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test266");
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates0 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates1 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates2 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST3 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array5 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i6 = sortedArrayToBST3.transform(i_array5);
        java.lang.Integer[] i_array7 = removeDuplicates2.removeUsingSorting(i_array5);
        java.lang.Integer[] i_array8 = removeDuplicates1.removeUsingSorting(i_array7);
        java.lang.Integer[] i_array9 = removeDuplicates0.removeUsingSet(i_array7);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates10 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates11 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST12 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array14 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i15 = sortedArrayToBST12.transform(i_array14);
        java.lang.Integer[] i_array16 = removeDuplicates11.removeUsingSorting(i_array14);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST17 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array19 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i20 = sortedArrayToBST17.transform(i_array19);
        java.lang.Integer[] i_array21 = removeDuplicates11.removeUsingSorting(i_array19);
        java.lang.Integer[] i_array22 = removeDuplicates10.removeUsingSorting(i_array19);
        java.lang.Integer[] i_array27 = new java.lang.Integer[] { 2, (-14040), (-14040), 27 };
        java.lang.Integer[] i_array28 = removeDuplicates10.removeUsingSet(i_array27);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates29 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates30 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST31 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array33 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i34 = sortedArrayToBST31.transform(i_array33);
        java.lang.Integer[] i_array35 = removeDuplicates30.removeUsingSorting(i_array33);
        java.lang.Integer[] i_array36 = removeDuplicates29.removeUsingSorting(i_array35);
        java.lang.Integer[] i_array37 = removeDuplicates10.removeUsingSet(i_array36);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates38 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST39 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array41 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i42 = sortedArrayToBST39.transform(i_array41);
        java.lang.Integer[] i_array43 = removeDuplicates38.removeUsingSorting(i_array41);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST44 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array46 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i47 = sortedArrayToBST44.transform(i_array46);
        java.lang.Integer[] i_array48 = removeDuplicates38.removeUsingSorting(i_array46);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates49 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates50 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST51 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array53 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i54 = sortedArrayToBST51.transform(i_array53);
        java.lang.Integer[] i_array55 = removeDuplicates50.removeUsingSorting(i_array53);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST56 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array58 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i59 = sortedArrayToBST56.transform(i_array58);
        java.lang.Integer[] i_array60 = removeDuplicates50.removeUsingSorting(i_array58);
        java.lang.Integer[] i_array61 = removeDuplicates49.removeUsingSorting(i_array58);
        java.lang.Integer[] i_array62 = removeDuplicates38.removeUsingSet(i_array61);
        java.lang.Integer[] i_array63 = removeDuplicates10.removeUsingSet(i_array62);
        java.lang.Integer[] i_array64 = removeDuplicates0.removeUsingSet(i_array63);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(binarynode_i6);
        org.junit.Assert.assertNotNull(i_array7);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(binarynode_i15);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(binarynode_i20);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(binarynode_i34);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(binarynode_i42);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(binarynode_i47);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(binarynode_i54);
        org.junit.Assert.assertNotNull(i_array55);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(binarynode_i59);
        org.junit.Assert.assertNotNull(i_array60);
        org.junit.Assert.assertNotNull(i_array61);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertNotNull(i_array64);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test267");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
        com.github.pedrovgs.problem62.PalindromeList palindromeList1 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList2 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i6 = reverseLinkedList2.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        boolean b7 = palindromeList1.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays8 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays9 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays8);
        java.lang.String str10 = listnode_mergeSortedArrays9.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays11 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays12 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays11);
        java.lang.String str13 = listnode_mergeSortedArrays12.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays14 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays12.setData(mergeSortedArrays14);
        listnode_mergeSortedArrays9.setNext(listnode_mergeSortedArrays12);
        boolean b17 = palindromeList1.checkReversing((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays9);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList18 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays19 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays20 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays19);
        java.lang.String str21 = listnode_mergeSortedArrays20.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i22 = reverseLinkedList18.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays20);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList23 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays24 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays25 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays24);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays26 = listnode_mergeSortedArrays25.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays27 = listnode_mergeSortedArrays25.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i29 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i30 = null;
        binarynode_i29.setRight(binarynode_i30);
        boolean b32 = listnode_mergeSortedArrays25.equals((java.lang.Object) binarynode_i30);
        com.github.pedrovgs.linkedlist.ListNode listNode33 = reverseLinkedList23.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays25);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode34 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays35 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays36 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays35);
        java.lang.String str37 = listnode_mergeSortedArrays36.toString();
        deleteListNode34.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays36);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays39 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays40 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays39);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers41 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b42 = listnode_mergeSortedArrays40.equals((java.lang.Object) mergeBinaryNumbers41);
        deleteListNode34.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays40);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i44 = reverseLinkedList23.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays40);
        com.github.pedrovgs.linkedlist.ListNode listNode45 = reverseLinkedList18.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays40);
        boolean b46 = palindromeList1.checkReversing((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays40);
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode48 = findKthElement0.find3((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays40, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(listnode_i6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(listnode_i22);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays26);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays27);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(listNode33);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(listnode_i44);
        org.junit.Assert.assertNotNull(listNode45);
        org.junit.Assert.assertTrue(b46 == true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test268");
        com.github.pedrovgs.problem70.ReverseOrderOfBinaryNumber reverseOrderOfBinaryNumber0 = new com.github.pedrovgs.problem70.ReverseOrderOfBinaryNumber();
        int i2 = reverseOrderOfBinaryNumber0.reverse((int) ' ');
        int i4 = reverseOrderOfBinaryNumber0.reverse(7);
        org.junit.Assert.assertTrue(i2 == 1);
        org.junit.Assert.assertTrue(i4 == 7);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test269");
        com.github.pedrovgs.problem53.CompressString compressString0 = new com.github.pedrovgs.problem53.CompressString();
        java.lang.String str2 = compressString0.compressRecursive("97");
        java.lang.String str4 = compressString0.compressAlternativeApproach("hi!");
        java.lang.String str6 = compressString0.compress("[]");
        java.lang.String str8 = compressString0.compress("/hi!/");
        java.lang.String str10 = compressString0.compressRecursive("/hi!/");
        java.lang.String str12 = compressString0.compressAlternativeApproach("7");
        java.lang.String str14 = compressString0.compressRecursive("[1, -1, 100, 0]");
        java.lang.String str16 = compressString0.compress("-1");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97" + "'", str2.equals("97"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/hi!" + "'", str8.equals("/hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "/hi!/" + "'", str10.equals("/hi!/"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "7" + "'", str12.equals("7"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[1, -1, 102, 0]" + "'", str14.equals("[1, -1, 102, 0]"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-" + "'", str16.equals("-"));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test270");
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
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays14 = listnode_mergeSortedArrays13.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays15 = listnode_mergeSortedArrays13.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i17 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i18 = null;
        binarynode_i17.setRight(binarynode_i18);
        boolean b20 = listnode_mergeSortedArrays13.equals((java.lang.Object) binarynode_i18);
        com.github.pedrovgs.linkedlist.ListNode listNode21 = reverseLinkedList11.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays13);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode22 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays23 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays24 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays23);
        java.lang.String str25 = listnode_mergeSortedArrays24.toString();
        deleteListNode22.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays24);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays27 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays28 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays27);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers29 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b30 = listnode_mergeSortedArrays28.equals((java.lang.Object) mergeBinaryNumbers29);
        deleteListNode22.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays28);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i32 = reverseLinkedList11.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays28);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays33 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays34 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays33);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers35 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b36 = listnode_mergeSortedArrays34.equals((java.lang.Object) mergeBinaryNumbers35);
        com.github.pedrovgs.linkedlist.ListNode listNode37 = reverseLinkedList11.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays34);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays38 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays39 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays38);
        java.lang.String str40 = listnode_mergeSortedArrays39.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays41 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays42 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays41);
        java.lang.String str43 = listnode_mergeSortedArrays42.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays44 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays42.setData(mergeSortedArrays44);
        listnode_mergeSortedArrays39.setNext(listnode_mergeSortedArrays42);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays47 = listnode_mergeSortedArrays39.getNext();
        com.github.pedrovgs.problem62.PalindromeList palindromeList48 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList49 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays50 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays51 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays50);
        java.lang.String str52 = listnode_mergeSortedArrays51.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i53 = reverseLinkedList49.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays51);
        boolean b54 = palindromeList48.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays51);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays55 = listnode_mergeSortedArrays51.getNext();
        listnode_mergeSortedArrays47.setNext(listnode_mergeSortedArrays51);
        com.github.pedrovgs.linkedlist.ListNode listNode57 = reverseLinkedList11.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays51);
        com.github.pedrovgs.linkedlist.ListNode listNode58 = reverseLinkedList0.reverseIterative(listNode57);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays3);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(listNode10);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays14);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays15);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(listNode21);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(listnode_i32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(listNode37);
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays47);
        org.junit.Assert.assertNotNull(listnode_i53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays55);
        org.junit.Assert.assertNotNull(listNode57);
        org.junit.Assert.assertNotNull(listNode58);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test271");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(0);
        int i4 = factorial0.getTailRecursive((int) (byte) 10);
        int i6 = factorial0.getIterative((int) ' ');
        try {
            int i8 = factorial0.getIterative((-13631485));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 1);
        org.junit.Assert.assertTrue(i4 == 3628800);
        org.junit.Assert.assertTrue(i6 == (-2147483648));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test272");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("0", "");
        java.lang.String str6 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("##001", "100##");
        try {
            java.lang.String str9 = sumBinaryNumbers0.sumBinaryNumbersCheating("01", "!ih");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "&0///0" + "'", str6.equals("&0///0"));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test273");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("0", "");
        java.lang.String str6 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("##001", "100##");
        try {
            java.lang.String str9 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("-6", "/]1-[/]1- ,1 ,1 ,0[/01/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "&0///0" + "'", str6.equals("&0///0"));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test274");
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian0 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i2 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d3 = avlTreeMedian0.find(binarynode_i2);
        java.lang.Integer[] i_array7 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i8 = new java.util.Vector<java.lang.Integer>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i8, i_array7);
        boolean b11 = vector_i8.remove((java.lang.Object) (short) -1);
        int i13 = vector_i8.indexOf((java.lang.Object) 1);
        int i15 = vector_i8.indexOf((java.lang.Object) 100.0d);
        java.lang.Object obj16 = vector_i8.clone();
        java.lang.Object obj17 = null;
        int i18 = vector_i8.lastIndexOf(obj17);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i20 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 27);
        int i21 = vector_i8.lastIndexOf((java.lang.Object) binarynode_i20);
        double d22 = avlTreeMedian0.find(binarynode_i20);
        org.junit.Assert.assertTrue(d3 == 10.0d);
        org.junit.Assert.assertNotNull(i_array7);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(d22 == 27.0d);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test275");
        com.github.pedrovgs.problem62.PalindromeList palindromeList0 = new com.github.pedrovgs.problem62.PalindromeList();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        boolean b8 = vector_i5.remove((java.lang.Object) (short) -1);
        boolean b10 = vector_i5.add((java.lang.Integer) 10);
        boolean b12 = vector_i5.remove((java.lang.Object) 10L);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList13 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements14 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList15 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays16 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays17 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays16);
        java.lang.String str18 = listnode_mergeSortedArrays17.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode19 = reverseLinkedList15.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays17);
        removeListDuplicatedElements14.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode19);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i21 = getTheElementInTheMiddleOfTheList13.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode19);
        boolean b22 = vector_i5.contains((java.lang.Object) listnode_i21);
        boolean b23 = palindromeList0.checkReversing((com.github.pedrovgs.linkedlist.ListNode) listnode_i21);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(listNode19);
        org.junit.Assert.assertNotNull(listnode_i21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test276");
        com.github.pedrovgs.problem79.MergeSort mergeSort0 = new com.github.pedrovgs.problem79.MergeSort();
        int[] i_array1 = new int[] {};
        mergeSort0.sort(i_array1);
        com.github.pedrovgs.problem79.MergeSort mergeSort3 = new com.github.pedrovgs.problem79.MergeSort();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral4 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array5 = new int[][] {};
        int[] i_array6 = goThroughMatrixInSpiral4.go(i_array_array5);
        int[] i_array13 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[] i_array20 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[][] i_array_array21 = new int[][] { i_array13, i_array20 };
        int[] i_array22 = goThroughMatrixInSpiral4.go(i_array_array21);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral23 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array24 = new int[][] {};
        int[] i_array25 = goThroughMatrixInSpiral23.go(i_array_array24);
        int[] i_array32 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[] i_array39 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[][] i_array_array40 = new int[][] { i_array32, i_array39 };
        int[] i_array41 = goThroughMatrixInSpiral23.go(i_array_array40);
        int[] i_array42 = goThroughMatrixInSpiral4.go(i_array_array40);
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros43 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral44 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array45 = new int[][] {};
        int[] i_array46 = goThroughMatrixInSpiral44.go(i_array_array45);
        int[] i_array49 = new int[] { 107, 3628800 };
        int[][] i_array_array50 = new int[][] { i_array49 };
        int[] i_array51 = goThroughMatrixInSpiral44.go(i_array_array50);
        rewriteRowAndColumnsWithZeros43.rewrite(i_array_array50);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral53 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array54 = new int[][] {};
        int[] i_array55 = goThroughMatrixInSpiral53.go(i_array_array54);
        rewriteRowAndColumnsWithZeros43.rewrite(i_array_array54);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral57 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array58 = new int[][] {};
        int[] i_array59 = goThroughMatrixInSpiral57.go(i_array_array58);
        int[] i_array66 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[] i_array73 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[][] i_array_array74 = new int[][] { i_array66, i_array73 };
        int[] i_array75 = goThroughMatrixInSpiral57.go(i_array_array74);
        rewriteRowAndColumnsWithZeros43.rewrite(i_array_array74);
        int[] i_array77 = goThroughMatrixInSpiral4.go(i_array_array74);
        mergeSort3.sort(i_array77);
        mergeSort0.sort(i_array77);
        org.junit.Assert.assertNotNull(i_array1);
        org.junit.Assert.assertNotNull(i_array_array5);
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array_array21);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(i_array_array45);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array_array54);
        org.junit.Assert.assertNotNull(i_array55);
        org.junit.Assert.assertNotNull(i_array_array58);
        org.junit.Assert.assertNotNull(i_array59);
        org.junit.Assert.assertNotNull(i_array66);
        org.junit.Assert.assertNotNull(i_array73);
        org.junit.Assert.assertNotNull(i_array_array74);
        org.junit.Assert.assertNotNull(i_array75);
        org.junit.Assert.assertNotNull(i_array77);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test277");
        com.github.pedrovgs.problem60.PartitionList partitionList0 = new com.github.pedrovgs.problem60.PartitionList();
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList1 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements2 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList3 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays4 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays4);
        java.lang.String str6 = listnode_mergeSortedArrays5.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode7 = reverseLinkedList3.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays5);
        removeListDuplicatedElements2.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode7);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i9 = getTheElementInTheMiddleOfTheList1.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode7);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList10 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays11 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays12 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays11);
        java.lang.String str13 = listnode_mergeSortedArrays12.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i14 = reverseLinkedList10.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays12);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList15 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays16 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays17 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays16);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays18 = listnode_mergeSortedArrays17.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays19 = listnode_mergeSortedArrays17.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i21 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i22 = null;
        binarynode_i21.setRight(binarynode_i22);
        boolean b24 = listnode_mergeSortedArrays17.equals((java.lang.Object) binarynode_i22);
        com.github.pedrovgs.linkedlist.ListNode listNode25 = reverseLinkedList15.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays17);
        com.github.pedrovgs.linkedlist.ListNode listNode26 = reverseLinkedList10.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays17);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i27 = getTheElementInTheMiddleOfTheList1.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode26);
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange29 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange30 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "", combinationsOfChange29);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList31 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays32 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays33 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays32);
        java.lang.String str34 = listnode_mergeSortedArrays33.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode35 = reverseLinkedList31.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays33);
        boolean b36 = pair_comparable_str_combinationsOfChange30.equals((java.lang.Object) listNode35);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i37 = getTheElementInTheMiddleOfTheList1.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode35);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList38 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements39 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList40 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays41 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays42 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays41);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays43 = listnode_mergeSortedArrays42.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays44 = listnode_mergeSortedArrays42.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i46 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i47 = null;
        binarynode_i46.setRight(binarynode_i47);
        boolean b49 = listnode_mergeSortedArrays42.equals((java.lang.Object) binarynode_i47);
        com.github.pedrovgs.linkedlist.ListNode listNode50 = reverseLinkedList40.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays42);
        removeListDuplicatedElements39.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode50);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements52 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList53 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays54 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays55 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays54);
        java.lang.String str56 = listnode_mergeSortedArrays55.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode57 = reverseLinkedList53.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays55);
        removeListDuplicatedElements52.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode57);
        removeListDuplicatedElements39.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode57);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i60 = getTheElementInTheMiddleOfTheList38.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode57);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i61 = getTheElementInTheMiddleOfTheList1.get2(listnode_i60);
        try {
            com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i63 = partitionList0.split(listnode_i60, (-24));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(listNode7);
        org.junit.Assert.assertNotNull(listnode_i9);
        org.junit.Assert.assertNotNull(listnode_i14);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays18);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(listNode25);
        org.junit.Assert.assertNotNull(listNode26);
        org.junit.Assert.assertNotNull(listnode_i27);
        org.junit.Assert.assertNotNull(listNode35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(listnode_i37);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays43);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays44);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(listNode50);
        org.junit.Assert.assertNotNull(listNode57);
        org.junit.Assert.assertNotNull(listnode_i60);
        org.junit.Assert.assertNotNull(listnode_i61);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test278");
        com.github.pedrovgs.problem53.CompressString compressString0 = new com.github.pedrovgs.problem53.CompressString();
        java.lang.String str2 = compressString0.compressRecursive("/");
        java.lang.String str4 = compressString0.compressAlternativeApproach("[0, 1, 1, -1]");
        java.lang.String str6 = compressString0.compressRecursive("[100]");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/" + "'", str2.equals("/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0, 1, 1, -1]" + "'", str4.equals("[0, 1, 1, -1]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[102]" + "'", str6.equals("[102]"));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test279");
        com.github.pedrovgs.problem68.IsEven isEven0 = new com.github.pedrovgs.problem68.IsEven();
        boolean b2 = isEven0.check((int) (byte) 1);
        boolean b4 = isEven0.check(0);
        boolean b6 = isEven0.check(4);
        boolean b8 = isEven0.check((-13631485));
        boolean b10 = isEven0.check(72);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test280");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        int i9 = vector_i4.indexOf((java.lang.Object) 1);
        int i11 = vector_i4.indexOf((java.lang.Object) 100.0d);
        com.github.pedrovgs.problem45.FindNthMostRepeatedElement findNthMostRepeatedElement12 = new com.github.pedrovgs.problem45.FindNthMostRepeatedElement();
        boolean b13 = vector_i4.contains((java.lang.Object) findNthMostRepeatedElement12);
        com.github.pedrovgs.problem47.ReturnChange returnChange14 = new com.github.pedrovgs.problem47.ReturnChange();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem47.ReturnChange> listnode_returnChange15 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem47.ReturnChange>(returnChange14);
        com.github.pedrovgs.problem65.IsTreeBalanced isTreeBalanced16 = new com.github.pedrovgs.problem65.IsTreeBalanced();
        com.github.pedrovgs.problem75.SelectionSort selectionSort17 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem65.IsTreeBalanced, com.github.pedrovgs.problem75.SelectionSort> pair_isTreeBalanced_selectionSort18 = new com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem65.IsTreeBalanced, com.github.pedrovgs.problem75.SelectionSort>(isTreeBalanced16, selectionSort17);
        com.github.pedrovgs.problem72.FindTheMissingNumber findTheMissingNumber19 = new com.github.pedrovgs.problem72.FindTheMissingNumber();
        com.github.pedrovgs.problem75.SelectionSort selectionSort20 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray21 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array24 = new int[] { (byte) 1, (byte) 10 };
        splitArray21.splitSwappingPartition(i_array24);
        selectionSort20.sort(i_array24);
        int i27 = findTheMissingNumber19.find(i_array24);
        selectionSort17.sort(i_array24);
        java.util.List<java.lang.Integer> list_i30 = returnChange14.calculate(i_array24, (int) (byte) 100);
        try {
            int i32 = findNthMostRepeatedElement12.find(i_array24, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertTrue(i27 == (-8));
        org.junit.Assert.assertNotNull(list_i30);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test281");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        vector_i5.trimToSize();
        vector_i5.add((int) (short) 0, (java.lang.Integer) 0);
        java.util.stream.Stream<java.lang.Integer> stream_i14 = vector_i5.stream();
        java.lang.Integer[] i_array18 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i19 = new java.util.Vector<java.lang.Integer>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i19, i_array18);
        boolean b22 = vector_i19.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i23 = vector_i19.elements();
        java.lang.Object[] obj_array24 = vector_i19.toArray();
        vector_i19.addElement((java.lang.Integer) (-1));
        boolean b28 = vector_i19.contains((java.lang.Object) (byte) 100);
        boolean b29 = vector_i5.equals((java.lang.Object) b28);
        int i30 = vector_i5.capacity();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(stream_i14);
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(enumeration_i23);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 8);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test282");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        java.lang.Integer i11 = vector_i5.get((int) (short) 1);
        java.lang.Integer i12 = vector_i5.firstElement();
        java.util.Enumeration<java.lang.Integer> enumeration_i13 = vector_i5.elements();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1) + "'", i11.equals((-1)));
        org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1 + "'", i12.equals(1));
        org.junit.Assert.assertNotNull(enumeration_i13);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test283");
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList0 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        java.lang.String str3 = listnode_mergeSortedArrays2.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i4 = reverseLinkedList0.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList5 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays6 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays7 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays6);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays8 = listnode_mergeSortedArrays7.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays9 = listnode_mergeSortedArrays7.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i11 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i12 = null;
        binarynode_i11.setRight(binarynode_i12);
        boolean b14 = listnode_mergeSortedArrays7.equals((java.lang.Object) binarynode_i12);
        com.github.pedrovgs.linkedlist.ListNode listNode15 = reverseLinkedList5.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays7);
        com.github.pedrovgs.linkedlist.ListNode listNode16 = reverseLinkedList0.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays7);
        com.github.pedrovgs.linkedlist.ListNode listNode17 = null;
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode18 = reverseLinkedList0.reverseIterative(listNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(listnode_i4);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays8);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(listNode15);
        org.junit.Assert.assertNotNull(listNode16);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test284");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        boolean b8 = vector_i5.remove((java.lang.Object) (short) -1);
        int i10 = vector_i5.indexOf((java.lang.Object) 1);
        int i12 = vector_i5.indexOf((java.lang.Object) 100.0d);
        java.lang.Object obj13 = vector_i5.clone();
        java.lang.Object obj14 = null;
        int i15 = vector_i5.lastIndexOf(obj14);
        int i17 = stack2_0.indexOf(obj14, 0);
        java.lang.Integer i19 = stack2_0.push((java.lang.Integer) 0);
        java.util.ListIterator<java.lang.Integer> listiterator_i20 = stack2_0.listIterator();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + i19 + "' != '" + 0 + "'", i19.equals(0));
        org.junit.Assert.assertNotNull(listiterator_i20);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test285");
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates0 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i3 = new java.util.Stack<java.lang.Integer>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i3, i_array2);
        boolean b5 = stack_i3.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST6 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i7 = stack_i3.search((java.lang.Object) sortedArrayToBST6);
        java.lang.Integer[] i_array11 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i12 = sortedArrayToBST6.transform(i_array11);
        java.lang.Integer[] i_array13 = removeDuplicates0.removeUsingSet(i_array11);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(binarynode_i12);
        org.junit.Assert.assertNotNull(i_array13);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test286");
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
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList17 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays18 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays19 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays18);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays20 = listnode_mergeSortedArrays19.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays21 = listnode_mergeSortedArrays19.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i23 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i24 = null;
        binarynode_i23.setRight(binarynode_i24);
        boolean b26 = listnode_mergeSortedArrays19.equals((java.lang.Object) binarynode_i24);
        com.github.pedrovgs.linkedlist.ListNode listNode27 = reverseLinkedList17.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays19);
        com.github.pedrovgs.problem62.PalindromeList palindromeList28 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList29 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays30 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays31 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays30);
        java.lang.String str32 = listnode_mergeSortedArrays31.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i33 = reverseLinkedList29.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays31);
        boolean b34 = palindromeList28.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays31);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays35 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays36 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays35);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays37 = listnode_mergeSortedArrays36.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays38 = listnode_mergeSortedArrays36.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i40 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i41 = null;
        binarynode_i40.setRight(binarynode_i41);
        boolean b43 = listnode_mergeSortedArrays36.equals((java.lang.Object) binarynode_i41);
        listnode_mergeSortedArrays31.setNext(listnode_mergeSortedArrays36);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays45 = listnode_mergeSortedArrays36.getData();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements46 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList47 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays48 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays49 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays48);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays50 = listnode_mergeSortedArrays49.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays51 = listnode_mergeSortedArrays49.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i53 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i54 = null;
        binarynode_i53.setRight(binarynode_i54);
        boolean b56 = listnode_mergeSortedArrays49.equals((java.lang.Object) binarynode_i54);
        com.github.pedrovgs.linkedlist.ListNode listNode57 = reverseLinkedList47.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays49);
        removeListDuplicatedElements46.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode57);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements> listnode_removeListDuplicatedElements59 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements>(removeListDuplicatedElements46);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList60 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements61 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList62 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays63 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays64 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays63);
        java.lang.String str65 = listnode_mergeSortedArrays64.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode66 = reverseLinkedList62.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays64);
        removeListDuplicatedElements61.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode66);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i68 = getTheElementInTheMiddleOfTheList60.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode66);
        removeListDuplicatedElements46.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode66);
        listnode_mergeSortedArrays36.setNext((com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>) listNode66);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i71 = reverseLinkedList17.reverseRecursive(listNode66);
        boolean b72 = palindromeList0.checkReversing(listNode66);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList73 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays74 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays75 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays74);
        java.lang.String str76 = listnode_mergeSortedArrays75.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i77 = reverseLinkedList73.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays75);
        com.github.pedrovgs.problem62.PalindromeList palindromeList78 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList79 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays80 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays81 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays80);
        java.lang.String str82 = listnode_mergeSortedArrays81.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i83 = reverseLinkedList79.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays81);
        boolean b84 = palindromeList78.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays81);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays85 = listnode_mergeSortedArrays81.getNext();
        listnode_mergeSortedArrays75.setNext(listnode_mergeSortedArrays81);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays87 = listnode_mergeSortedArrays75.getData();
        boolean b88 = palindromeList0.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays75);
        org.junit.Assert.assertNotNull(listnode_i5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays20);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays21);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(listNode27);
        org.junit.Assert.assertNotNull(listnode_i33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays37);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays38);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(mergeSortedArrays45);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays50);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays51);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(listNode57);
        org.junit.Assert.assertNotNull(listNode66);
        org.junit.Assert.assertNotNull(listnode_i68);
        org.junit.Assert.assertNotNull(listnode_i71);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(listnode_i77);
        org.junit.Assert.assertNotNull(listnode_i83);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays85);
        org.junit.Assert.assertNotNull(mergeSortedArrays87);
        org.junit.Assert.assertTrue(b88 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test287");
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces0 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces1 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array7 = new char[] { '#', 'a', ' ', '4', 'a' };
        replaceSpaces1.replace(char_array7);
        replaceSpaces0.replace(char_array7);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces10 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces11 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array12 = new char[] {};
        replaceSpaces11.replace2(char_array12);
        replaceSpaces10.replace(char_array12);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces15 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces16 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces17 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array18 = new char[] {};
        replaceSpaces17.replace2(char_array18);
        replaceSpaces16.replace(char_array18);
        replaceSpaces15.replace(char_array18);
        replaceSpaces10.replace(char_array18);
        replaceSpaces0.replace2(char_array18);
        org.junit.Assert.assertNotNull(char_array7);
        org.junit.Assert.assertNotNull(char_array12);
        org.junit.Assert.assertNotNull(char_array18);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test288");
        com.github.pedrovgs.problem69.BitsToTransform bitsToTransform0 = new com.github.pedrovgs.problem69.BitsToTransform();
        int i3 = bitsToTransform0.calculate((int) '#', (int) (short) 0);
        int i6 = bitsToTransform0.calculate(1484783616, (-52000));
        int i9 = bitsToTransform0.calculate(107, 51);
        org.junit.Assert.assertTrue(i3 == 3);
        org.junit.Assert.assertTrue(i6 == 18);
        org.junit.Assert.assertTrue(i9 == 3);
    }
}


