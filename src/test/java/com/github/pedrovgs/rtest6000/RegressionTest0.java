package com.github.pedrovgs.rtest6000;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { (-1), 1, 10 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        java.util.function.UnaryOperator<java.lang.Integer> unaryoperator_i6 = null;
        try {
            vector_i4.replaceAll(unaryoperator_i6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        boolean b9 = vector_i4.add((java.lang.Integer) 10);
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange10 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.problem49.CombinationsOfChange[] combinationsOfChange_array11 = new com.github.pedrovgs.problem49.CombinationsOfChange[] { combinationsOfChange10 };
        try {
            com.github.pedrovgs.problem49.CombinationsOfChange[] combinationsOfChange_array12 = vector_i4.toArray(combinationsOfChange_array11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException");
        } catch (java.lang.ArrayStoreException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(combinationsOfChange_array11);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.lang.Object obj8 = vector_i4.clone();
        java.util.function.UnaryOperator<java.lang.Integer> unaryoperator_i9 = null;
        try {
            vector_i4.replaceAll(unaryoperator_i9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.github.pedrovgs.problem38.PathToEveryLeaf pathToEveryLeaf0 = new com.github.pedrovgs.problem38.PathToEveryLeaf();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i1 = null;
        try {
            java.util.List<java.util.List<com.github.pedrovgs.binarytree.BinaryNode>> list_list_binaryNode2 = pathToEveryLeaf0.calculate(binarynode_i1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        int i9 = vector_i4.indexOf((java.lang.Object) 1);
        try {
            vector_i4.removeElementAt((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.lang.Object obj8 = vector_i4.clone();
        try {
            java.lang.Integer i10 = vector_i4.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.github.pedrovgs.problem7.FibonacciNumbers fibonacciNumbers0 = new com.github.pedrovgs.problem7.FibonacciNumbers();
        try {
            long long2 = fibonacciNumbers0.getRecursive((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str0 = com.github.pedrovgs.problem37.PathCalculator.DIR_SEPARATOR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/" + "'", str0.equals("/"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.github.pedrovgs.problem72.FindTheMissingNumber findTheMissingNumber0 = new com.github.pedrovgs.problem72.FindTheMissingNumber();
        com.github.pedrovgs.problem79.MergeSort mergeSort1 = new com.github.pedrovgs.problem79.MergeSort();
        int[] i_array2 = new int[] {};
        mergeSort1.sort(i_array2);
        try {
            int i4 = findTheMissingNumber0.find(i_array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements0 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i1 = null;
        try {
            removeListDuplicatedElements0.remove2(listnode_i1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100, 0, (-1), (-1) };
        java.util.Stack<java.lang.Integer> stack_i5 = new java.util.Stack<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i5, i_array4);
        java.lang.Integer i8 = stack_i5.push((java.lang.Integer) 0);
        java.util.function.UnaryOperator<java.lang.Integer> unaryoperator_i9 = null;
        try {
            stack_i5.replaceAll(unaryoperator_i9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0 + "'", i8.equals(0));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.github.pedrovgs.problem30.ScientificNotation scientificNotation0 = new com.github.pedrovgs.problem30.ScientificNotation();
        try {
            long long2 = scientificNotation0.calculate("BinaryNode{data=100}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.github.pedrovgs.problem45.FindNthMostRepeatedElement findNthMostRepeatedElement0 = new com.github.pedrovgs.problem45.FindNthMostRepeatedElement();
        int[] i_array6 = new int[] { (byte) -1, (byte) 10, (short) 1, 2, ' ' };
        try {
            int i8 = findNthMostRepeatedElement0.find(i_array6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.github.pedrovgs.problem7.FibonacciNumbers fibonacciNumbers0 = new com.github.pedrovgs.problem7.FibonacciNumbers();
        try {
            long long2 = fibonacciNumbers0.getRecursive((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.Integer[] i_array1 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i2 = new java.util.Stack<java.lang.Integer>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i2, i_array1);
        boolean b4 = stack_i2.empty();
        try {
            java.lang.Integer i6 = stack_i2.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array1);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.github.pedrovgs.problem40.MoveElementsToPositions moveElementsToPositions0 = new com.github.pedrovgs.problem40.MoveElementsToPositions();
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
        try {
            moveElementsToPositions0.move(i_array14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array29);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        java.lang.Integer i12 = vector_i4.firstElement();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST13 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array15 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i16 = sortedArrayToBST13.transform(i_array15);
        try {
            vector_i4.copyInto((java.lang.Object[]) i_array15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0 + "'", i12.equals(0));
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(binarynode_i16);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.github.pedrovgs.problem44.FindMinNumberAtPosition findMinNumberAtPosition0 = new com.github.pedrovgs.problem44.FindMinNumberAtPosition();
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
        try {
            java.lang.Integer i15 = findMinNumberAtPosition0.find(binarynode_i11, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(binarynode_i6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(binarynode_i11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.github.pedrovgs.problem61.SumLists sumLists0 = new com.github.pedrovgs.problem61.SumLists();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode5 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList6 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays7 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays8 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays7);
        java.lang.String str9 = listnode_mergeSortedArrays8.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode10 = reverseLinkedList6.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays8);
        try {
            int i11 = sumLists0.sumReverse((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode5, (com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(listNode5);
        org.junit.Assert.assertNotNull(listNode10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        try {
            java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersCheating("BinaryNode{data=100}", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideIterative((int) (byte) 10, (int) (byte) 100);
        float f6 = divideUsingSubtraction0.divideRecursive((int) (byte) 1, (int) '#');
        float f9 = divideUsingSubtraction0.divideRecursive((int) '4', (int) 'a');
        org.junit.Assert.assertTrue(f3 == 0.1f);
        org.junit.Assert.assertTrue(f6 == 0.028571429f);
        org.junit.Assert.assertTrue(f9 == 0.53608245f);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals0 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST1 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i4 = sortedArrayToBST1.transform(i_array3);
        boolean b5 = binarynode_i4.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST6 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array8 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i9 = sortedArrayToBST6.transform(i_array8);
        boolean b10 = binarynode_i9.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i11 = binarynode_i9.getRight();
        boolean b12 = binaryTreeEquals0.areEqualsIterative(binarynode_i4, binarynode_i9);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i14 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i15 = null;
        binarynode_i14.setRight(binarynode_i15);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i17 = null;
        try {
            boolean b18 = binaryTreeEquals0.areEqualsIterative(binarynode_i15, binarynode_i17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(binarynode_i4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(binarynode_i9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(binarynode_i11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.github.pedrovgs.problem61.SumLists sumLists0 = new com.github.pedrovgs.problem61.SumLists();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements1 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList2 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode6 = reverseLinkedList2.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        removeListDuplicatedElements1.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode6);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList8 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays9 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays10 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays9);
        java.lang.String str11 = listnode_mergeSortedArrays10.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode12 = reverseLinkedList8.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays10);
        try {
            int i13 = sumLists0.sumReverse((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode6, (com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(listNode6);
        org.junit.Assert.assertNotNull(listNode12);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        vector_i4.removeElementAt((int) (short) 0);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        vector_i5.trimToSize();
        vector_i5.add((int) (short) 0, (java.lang.Integer) 0);
        java.util.function.UnaryOperator<java.lang.Integer> unaryoperator_i14 = null;
        try {
            vector_i5.replaceAll(unaryoperator_i14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        boolean b13 = vector_i4.contains((java.lang.Object) (byte) 100);
        try {
            java.lang.Integer i15 = vector_i4.elementAt((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        vector_i5.trimToSize();
        java.util.function.UnaryOperator<java.lang.Integer> unaryoperator_i11 = null;
        try {
            vector_i5.replaceAll(unaryoperator_i11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.github.pedrovgs.problem30.ScientificNotation scientificNotation0 = new com.github.pedrovgs.problem30.ScientificNotation();
        try {
            long long2 = scientificNotation0.calculate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST0 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i3 = sortedArrayToBST0.transform(i_array2);
        boolean b4 = binarynode_i3.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = binarynode_i3.getRight();
        try {
            com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i6 = binarynode_i5.getRight();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(binarynode_i3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(binarynode_i5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        vector_i5.trimToSize();
        com.github.pedrovgs.problem42.FloodFill floodFill11 = new com.github.pedrovgs.problem42.FloodFill();
        try {
            int i13 = vector_i5.lastIndexOf((java.lang.Object) floodFill11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.github.pedrovgs.problem54.RotateMatrix rotateMatrix0 = new com.github.pedrovgs.problem54.RotateMatrix();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral1 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array2 = new int[][] {};
        int[] i_array3 = goThroughMatrixInSpiral1.go(i_array_array2);
        try {
            rotateMatrix0.rotate(i_array_array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array_array2);
        org.junit.Assert.assertNotNull(i_array3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push((-1));
        stack2_0.removeAllElements();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
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
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder0 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian1 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i3 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d4 = avlTreeMedian1.find(binarynode_i3);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode5 = binaryTreePreOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i3);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST6 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array8 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i9 = sortedArrayToBST6.transform(i_array8);
        boolean b10 = binarynode_i9.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i11 = binarynode_i9.getRight();
        try {
            java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode12 = binaryTreePreOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d4 == 10.0d);
        org.junit.Assert.assertNotNull(list_binaryNode5);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(binarynode_i9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(binarynode_i11);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        int i9 = vector_i4.indexOf((java.lang.Object) 1);
        int i11 = vector_i4.indexOf((java.lang.Object) 100.0d);
        java.lang.Object obj12 = vector_i4.clone();
        try {
            vector_i4.add((-1), (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        java.lang.Integer i12 = vector_i4.firstElement();
        try {
            vector_i4.setElementAt((java.lang.Integer) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0 + "'", i12.equals(0));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i5 = reverseLinkedList1.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode7 = findKthElement0.find((com.github.pedrovgs.linkedlist.ListNode) listnode_i5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(listnode_i5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(0);
        int i4 = factorial0.getTailRecursive((int) (byte) 10);
        org.junit.Assert.assertTrue(i2 == 1);
        org.junit.Assert.assertTrue(i4 == 3628800);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode1 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        deleteListNode1.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode7 = findKthElement0.find3((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        int i9 = vector_i4.indexOf((java.lang.Object) 1);
        int i11 = vector_i4.indexOf((java.lang.Object) 100.0d);
        try {
            java.util.ListIterator<java.lang.Integer> listiterator_i13 = vector_i4.listIterator(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i11 == (-1));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.github.pedrovgs.problem61.SumLists sumLists0 = new com.github.pedrovgs.problem61.SumLists();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements1 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList2 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode6 = reverseLinkedList2.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        removeListDuplicatedElements1.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode6);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements8 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList9 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays10 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays11 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays10);
        java.lang.String str12 = listnode_mergeSortedArrays11.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode13 = reverseLinkedList9.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays11);
        removeListDuplicatedElements8.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode13);
        try {
            int i15 = sumLists0.sum((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode6, (com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(listNode6);
        org.junit.Assert.assertNotNull(listNode13);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel0 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem18.IsBST isBST1 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST2 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = sortedArrayToBST2.transform(i_array4);
        boolean b6 = isBST1.checkRecursive(binarynode_i5);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode7 = binaryTreeByLevel0.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i5);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode8 = null;
        try {
            java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode9 = binaryTreeByLevel0.getWithoutAdditionalDataStructures(binaryNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(binarynode_i5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(list_binaryNode7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
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
        java.lang.Object obj18 = stack2_0.clone();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.github.pedrovgs.problem60.PartitionList partitionList0 = new com.github.pedrovgs.problem60.PartitionList();
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
        try {
            com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i14 = partitionList0.split((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(listNode5);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(binarynode_i10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
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
        try {
            java.lang.Integer i26 = findMinNumberAtPosition0.find(binarynode_i18, 2);
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
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements1 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList2 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode6 = reverseLinkedList2.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        removeListDuplicatedElements1.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode6);
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode9 = findKthElement0.find2(listNode6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(listNode6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnPowersOfTwo("", "");
        try {
            java.lang.String str6 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("97", "/hi!/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        int i9 = vector_i4.indexOf((java.lang.Object) 1);
        int i11 = vector_i4.indexOf((java.lang.Object) 100.0d);
        com.github.pedrovgs.problem45.FindNthMostRepeatedElement findNthMostRepeatedElement12 = new com.github.pedrovgs.problem45.FindNthMostRepeatedElement();
        boolean b13 = vector_i4.contains((java.lang.Object) findNthMostRepeatedElement12);
        com.github.pedrovgs.problem76.InsertionSort insertionSort14 = new com.github.pedrovgs.problem76.InsertionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray15 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays16 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays17 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays16);
        com.github.pedrovgs.problem8.SplitArray splitArray18 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array21 = new int[] { (byte) 1, (byte) 10 };
        splitArray18.splitSwappingPartition(i_array21);
        int[] i_array29 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray18.splitSwappingRecursive(i_array29);
        com.github.pedrovgs.problem8.SplitArray splitArray31 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array34 = new int[] { (byte) 1, (byte) 10 };
        splitArray31.splitSwappingPartition(i_array34);
        int[] i_array42 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray31.splitSwappingRecursive(i_array42);
        int[] i_array44 = mergeSortedArrays16.merge(i_array29, i_array42);
        splitArray15.splitSwappingIterative(i_array42);
        insertionSort14.sort(i_array42);
        try {
            int i48 = findNthMostRepeatedElement12.find(i_array42, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(i_array44);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
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
        try {
            stack2_0.add((int) (short) 100, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
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
        int[] i_array19 = new int[] { (byte) 1, (byte) 10 };
        splitArray16.splitSwappingPartition(i_array19);
        int[] i_array27 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray16.splitSwappingRecursive(i_array27);
        com.github.pedrovgs.problem8.SplitArray splitArray29 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array32 = new int[] { (byte) 1, (byte) 10 };
        splitArray29.splitSwappingPartition(i_array32);
        int[] i_array40 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray29.splitSwappingRecursive(i_array40);
        int[] i_array42 = mergeSortedArrays14.merge(i_array27, i_array40);
        try {
            int i44 = findNthMostRepeatedElement12.find(i_array40, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array42);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.github.pedrovgs.problem12.MoveZerosInArray moveZerosInArray0 = new com.github.pedrovgs.problem12.MoveZerosInArray();
        com.github.pedrovgs.problem75.SelectionSort selectionSort1 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray2 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array5 = new int[] { (byte) 1, (byte) 10 };
        splitArray2.splitSwappingPartition(i_array5);
        selectionSort1.sort(i_array5);
        moveZerosInArray0.moveUsingTwoPointers(i_array5);
        org.junit.Assert.assertNotNull(i_array5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.github.pedrovgs.problem60.PartitionList partitionList0 = new com.github.pedrovgs.problem60.PartitionList();
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
        try {
            com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i14 = partitionList0.split((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(listNode5);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(binarynode_i10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder0 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST1 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i4 = sortedArrayToBST1.transform(i_array3);
        boolean b5 = binarynode_i4.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i6 = binarynode_i4.getRight();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode7 = binaryTreePreOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i4);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(binarynode_i4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(binarynode_i6);
        org.junit.Assert.assertNotNull(list_binaryNode7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack constantComplexityOrderStack0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.github.pedrovgs.problem78.AutoBoxingTrick autoBoxingTrick0 = new com.github.pedrovgs.problem78.AutoBoxingTrick();
        boolean b3 = autoBoxingTrick0.compare((java.lang.Integer) 0, (java.lang.Integer) 2147483647);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.github.pedrovgs.problem71.ReverseBinaryNumber reverseBinaryNumber0 = new com.github.pedrovgs.problem71.ReverseBinaryNumber();
        int i2 = reverseBinaryNumber0.reverse(1);
        int i4 = reverseBinaryNumber0.reverse((int) (byte) 100);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i4 == 27);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.github.pedrovgs.problem11.IntToString intToString0 = new com.github.pedrovgs.problem11.IntToString();
        java.lang.String str2 = intToString0.transform((int) 'a');
        java.lang.String str4 = intToString0.transform((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97" + "'", str2.equals("97"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces0 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array3 = new char[] { '#', ' ' };
        try {
            replaceSpaces0.replace(char_array3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(char_array3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.Integer[] i_array1 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i2 = new java.util.Stack<java.lang.Integer>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i2, i_array1);
        boolean b4 = stack_i2.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST5 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i6 = stack_i2.search((java.lang.Object) sortedArrayToBST5);
        java.lang.Integer[] i_array10 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i11 = sortedArrayToBST5.transform(i_array10);
        org.junit.Assert.assertNotNull(i_array1);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(binarynode_i11);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.github.pedrovgs.problem61.SumLists sumLists0 = new com.github.pedrovgs.problem61.SumLists();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode5 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays6 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays7 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays6);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays8 = listnode_mergeSortedArrays7.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays9 = listnode_mergeSortedArrays7.getNext();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays10 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort11 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray12 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array15 = new int[] { (byte) 1, (byte) 10 };
        splitArray12.splitSwappingPartition(i_array15);
        selectionSort11.sort(i_array15);
        com.github.pedrovgs.problem8.SplitArray splitArray18 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array21 = new int[] { (byte) 1, (byte) 10 };
        splitArray18.splitSwappingPartition(i_array21);
        int[] i_array29 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray18.splitSwappingRecursive(i_array29);
        int[] i_array31 = mergeSortedArrays10.merge(i_array15, i_array29);
        listnode_mergeSortedArrays7.setData(mergeSortedArrays10);
        listNode5.setData(mergeSortedArrays10);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements34 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList35 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays36 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays37 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays36);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays38 = listnode_mergeSortedArrays37.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays39 = listnode_mergeSortedArrays37.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i41 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i42 = null;
        binarynode_i41.setRight(binarynode_i42);
        boolean b44 = listnode_mergeSortedArrays37.equals((java.lang.Object) binarynode_i42);
        com.github.pedrovgs.linkedlist.ListNode listNode45 = reverseLinkedList35.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays37);
        removeListDuplicatedElements34.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode45);
        try {
            int i47 = sumLists0.sum((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode5, (com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode45);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(listNode5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays8);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays9);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays38);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays39);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(listNode45);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        boolean b9 = vector_i4.add((java.lang.Integer) 10);
        boolean b11 = vector_i4.remove((java.lang.Object) 10L);
        java.util.Enumeration<java.lang.Integer> enumeration_i12 = vector_i4.elements();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(enumeration_i12);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays0 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays0);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = listnode_mergeSortedArrays1.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = listnode_mergeSortedArrays1.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i6 = null;
        binarynode_i5.setRight(binarynode_i6);
        boolean b8 = listnode_mergeSortedArrays1.equals((java.lang.Object) binarynode_i6);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays9 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays10 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays9);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays11 = listnode_mergeSortedArrays10.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays12 = listnode_mergeSortedArrays10.getNext();
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
        listnode_mergeSortedArrays10.setData(mergeSortedArrays13);
        listnode_mergeSortedArrays1.setData(mergeSortedArrays13);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays2);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays3);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays11);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays12);
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array34);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("0", "");
        try {
            java.lang.String str6 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("97", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.lang.Object obj8 = vector_i4.clone();
        java.lang.Integer i9 = vector_i4.firstElement();
        java.util.ListIterator<java.lang.Integer> listiterator_i10 = vector_i4.listIterator();
        try {
            java.lang.Integer i13 = vector_i4.set((int) (short) -1, (java.lang.Integer) 3628800);
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
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
        com.github.pedrovgs.linkedlist.ListNode listNode1 = null;
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode3 = findKthElement0.find(listNode1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.github.pedrovgs.problem72.FindTheMissingNumber findTheMissingNumber0 = new com.github.pedrovgs.problem72.FindTheMissingNumber();
        com.github.pedrovgs.problem75.SelectionSort selectionSort1 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray2 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array5 = new int[] { (byte) 1, (byte) 10 };
        splitArray2.splitSwappingPartition(i_array5);
        selectionSort1.sort(i_array5);
        com.github.pedrovgs.problem76.InsertionSort insertionSort8 = new com.github.pedrovgs.problem76.InsertionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray9 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays10 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays11 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays10);
        com.github.pedrovgs.problem8.SplitArray splitArray12 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array15 = new int[] { (byte) 1, (byte) 10 };
        splitArray12.splitSwappingPartition(i_array15);
        int[] i_array23 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray12.splitSwappingRecursive(i_array23);
        com.github.pedrovgs.problem8.SplitArray splitArray25 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array28 = new int[] { (byte) 1, (byte) 10 };
        splitArray25.splitSwappingPartition(i_array28);
        int[] i_array36 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray25.splitSwappingRecursive(i_array36);
        int[] i_array38 = mergeSortedArrays10.merge(i_array23, i_array36);
        splitArray9.splitSwappingIterative(i_array36);
        insertionSort8.sort(i_array36);
        selectionSort1.sort(i_array36);
        com.github.pedrovgs.problem8.SplitArray splitArray42 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray43 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array46 = new int[] { (byte) 1, (byte) 10 };
        splitArray43.splitSwappingPartition(i_array46);
        splitArray42.splitSwappingRecursive(i_array46);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral49 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array50 = new int[][] {};
        int[] i_array51 = goThroughMatrixInSpiral49.go(i_array_array50);
        splitArray42.splitSwappingRecursive(i_array51);
        selectionSort1.sort(i_array51);
        try {
            int i54 = findTheMissingNumber0.find(i_array51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertNotNull(i_array51);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.lang.Object obj8 = vector_i4.clone();
        java.lang.Integer i9 = vector_i4.firstElement();
        java.util.ListIterator<java.lang.Integer> listiterator_i10 = vector_i4.listIterator();
        int i11 = vector_i4.capacity();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0 + "'", i9.equals(0));
        org.junit.Assert.assertNotNull(listiterator_i10);
        org.junit.Assert.assertTrue(i11 == 10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
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
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode13 = findKthElement0.find((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3, (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(listNode11);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.github.pedrovgs.problem20.MultiplicationWithoutMultiply multiplicationWithoutMultiply0 = new com.github.pedrovgs.problem20.MultiplicationWithoutMultiply();
        int i3 = multiplicationWithoutMultiply0.calculate((int) (byte) -1, (int) (byte) 1);
        int i6 = multiplicationWithoutMultiply0.calculate(10, 27);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue(i6 == 270);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
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
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian21 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i23 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d24 = avlTreeMedian21.find(binarynode_i23);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor25 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals26 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST27 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array29 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i30 = sortedArrayToBST27.transform(i_array29);
        boolean b31 = binarynode_i30.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST32 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array34 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i35 = sortedArrayToBST32.transform(i_array34);
        boolean b36 = binarynode_i35.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i37 = binarynode_i35.getRight();
        boolean b38 = binaryTreeEquals26.areEqualsIterative(binarynode_i30, binarynode_i35);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST39 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array41 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i42 = sortedArrayToBST39.transform(i_array41);
        boolean b43 = binarynode_i42.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST44 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array46 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i47 = sortedArrayToBST44.transform(i_array46);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode48 = lowestCommonAncestor25.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i35, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i42, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i47);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i49 = binarynode_i35.getLeft();
        double d50 = avlTreeMedian21.find(binarynode_i35);
        boolean b51 = isBST0.checkRecursive(binarynode_i35);
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
        boolean b76 = isBST0.checkIterative(binarynode_i62);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST77 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array79 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i80 = sortedArrayToBST77.transform(i_array79);
        java.lang.String str81 = binarynode_i80.toString();
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_82 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_82.push((int) (byte) 10);
        int i85 = stack1_82.getMin();
        boolean b86 = binarynode_i80.equals((java.lang.Object) stack1_82);
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel87 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem18.IsBST isBST88 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST89 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array91 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i92 = sortedArrayToBST89.transform(i_array91);
        boolean b93 = isBST88.checkRecursive(binarynode_i92);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode94 = binaryTreeByLevel87.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i92);
        binarynode_i80.setRight(binarynode_i92);
        boolean b96 = isBST0.checkRecursive(binarynode_i80);
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
        org.junit.Assert.assertTrue(d24 == 10.0d);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(binarynode_i30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(binarynode_i35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(binarynode_i37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(binarynode_i42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(binarynode_i47);
        org.junit.Assert.assertNull(binaryNode48);
        org.junit.Assert.assertNull(binarynode_i49);
        org.junit.Assert.assertTrue(d50 == 100.0d);
        org.junit.Assert.assertTrue(b51 == true);
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
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(i_array79);
        org.junit.Assert.assertNotNull(binarynode_i80);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "BinaryNode{data=100}" + "'", str81.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue(i85 == 10);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(i_array91);
        org.junit.Assert.assertNotNull(binarynode_i92);
        org.junit.Assert.assertTrue(b93 == true);
        org.junit.Assert.assertNotNull(list_binaryNode94);
        org.junit.Assert.assertTrue(b96 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
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
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(listNode12);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.lang.Object obj8 = vector_i4.clone();
        boolean b10 = vector_i4.add((java.lang.Integer) 1);
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack constantComplexityOrderStack11 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack();
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack[] constantComplexityOrderStack_array12 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack[] { constantComplexityOrderStack11 };
        try {
            com.github.pedrovgs.problem63.ConstantComplexityOrderStack[] constantComplexityOrderStack_array13 = vector_i4.toArray(constantComplexityOrderStack_array12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException");
        } catch (java.lang.ArrayStoreException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(constantComplexityOrderStack_array12);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays0 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays0);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers2 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b3 = listnode_mergeSortedArrays1.equals((java.lang.Object) mergeBinaryNumbers2);
        int i8 = mergeBinaryNumbers2.merge((int) (short) 10, (int) (byte) 0, 107, 107);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100, 0, (-1), (-1) };
        java.util.Stack<java.lang.Integer> stack_i5 = new java.util.Stack<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i5, i_array4);
        java.lang.Integer i8 = stack_i5.push((java.lang.Integer) 0);
        try {
            stack_i5.setElementAt((java.lang.Integer) 107, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0 + "'", i8.equals(0));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.github.pedrovgs.problem31.FindLongestConsecutiveSequence findLongestConsecutiveSequence0 = new com.github.pedrovgs.problem31.FindLongestConsecutiveSequence();
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
        int i30 = findLongestConsecutiveSequence0.findIterative(i_array29);
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
        int i53 = findLongestConsecutiveSequence0.findRecursive(i_array50);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays54 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort55 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray56 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array59 = new int[] { (byte) 1, (byte) 10 };
        splitArray56.splitSwappingPartition(i_array59);
        selectionSort55.sort(i_array59);
        com.github.pedrovgs.problem8.SplitArray splitArray62 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array65 = new int[] { (byte) 1, (byte) 10 };
        splitArray62.splitSwappingPartition(i_array65);
        int[] i_array73 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray62.splitSwappingRecursive(i_array73);
        int[] i_array75 = mergeSortedArrays54.merge(i_array59, i_array73);
        int i76 = findLongestConsecutiveSequence0.findIterative(i_array75);
        int[] i_array77 = null;
        try {
            int i78 = findLongestConsecutiveSequence0.findRecursive(i_array77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertTrue(i53 == 2);
        org.junit.Assert.assertNotNull(i_array59);
        org.junit.Assert.assertNotNull(i_array65);
        org.junit.Assert.assertNotNull(i_array73);
        org.junit.Assert.assertNotNull(i_array75);
        org.junit.Assert.assertTrue(i76 == 4);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.github.pedrovgs.problem73.SubtractAdding subtractAdding0 = new com.github.pedrovgs.problem73.SubtractAdding();
        int i3 = subtractAdding0.subtract((int) '4', (int) (short) 1);
        int i6 = subtractAdding0.subtract(0, (int) 'a');
        int i9 = subtractAdding0.subtract((-1), 51);
        org.junit.Assert.assertTrue(i3 == 51);
        org.junit.Assert.assertTrue(i6 == (-97));
        org.junit.Assert.assertTrue(i9 == (-52));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.github.pedrovgs.problem26.Palindromes palindromes0 = new com.github.pedrovgs.problem26.Palindromes();
        boolean b2 = palindromes0.evaluate("/");
        boolean b4 = palindromes0.evaluate("1");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.github.pedrovgs.problem73.SubtractAdding subtractAdding0 = new com.github.pedrovgs.problem73.SubtractAdding();
        int i3 = subtractAdding0.subtract((int) (short) 0, (int) '4');
        int i6 = subtractAdding0.subtract((int) (byte) 10, (-97));
        int i9 = subtractAdding0.subtract((int) (short) 0, 2);
        org.junit.Assert.assertTrue(i3 == (-52));
        org.junit.Assert.assertTrue(i6 == 107);
        org.junit.Assert.assertTrue(i9 == (-2));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
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
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i24 = binarynode_i10.getLeft();
        try {
            java.lang.String str25 = binarynode_i24.toString();
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
        org.junit.Assert.assertNull(binarynode_i24);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnPowersOfTwo("", "");
        try {
            java.lang.String str6 = sumBinaryNumbers0.sumBinaryNumbersBasedOnPowersOfTwo("BinaryNode{data=100}", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Integer[] i_array1 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i2 = new java.util.Stack<java.lang.Integer>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i2, i_array1);
        boolean b4 = stack_i2.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST5 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i6 = stack_i2.search((java.lang.Object) sortedArrayToBST5);
        java.lang.Integer i8 = stack_i2.push((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(i_array1);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10 + "'", i8.equals(10));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
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
            com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i13 = partitionList0.split((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(listNode11);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.github.pedrovgs.problem42.FloodFill floodFill0 = new com.github.pedrovgs.problem42.FloodFill();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral1 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array2 = new int[][] {};
        int[] i_array3 = goThroughMatrixInSpiral1.go(i_array_array2);
        try {
            floodFill0.apply(i_array_array2, 51, (int) (short) 1, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array_array2);
        org.junit.Assert.assertNotNull(i_array3);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces0 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array1 = new char[] {};
        replaceSpaces0.replace2(char_array1);
        char[] char_array4 = new char[] { ' ' };
        try {
            replaceSpaces0.replace2(char_array4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(char_array1);
        org.junit.Assert.assertNotNull(char_array4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.github.pedrovgs.problem56.IsRotationUsingIsSubstring isRotationUsingIsSubstring0 = new com.github.pedrovgs.problem56.IsRotationUsingIsSubstring();
        boolean b3 = isRotationUsingIsSubstring0.check("", "");
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST0 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i3 = sortedArrayToBST0.transform(i_array2);
        boolean b4 = binarynode_i3.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = binarynode_i3.getRight();
        try {
            com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i6 = binarynode_i5.getLeft();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(binarynode_i3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(binarynode_i5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.github.pedrovgs.problem31.FindLongestConsecutiveSequence findLongestConsecutiveSequence0 = new com.github.pedrovgs.problem31.FindLongestConsecutiveSequence();
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
        int i30 = findLongestConsecutiveSequence0.findIterative(i_array29);
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
        int i53 = findLongestConsecutiveSequence0.findRecursive(i_array50);
        int[] i_array54 = null;
        try {
            int i55 = findLongestConsecutiveSequence0.findRecursive(i_array54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertTrue(i53 == 2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel0 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem18.IsBST isBST1 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST2 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = sortedArrayToBST2.transform(i_array4);
        boolean b6 = isBST1.checkRecursive(binarynode_i5);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode7 = binaryTreeByLevel0.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i5);
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
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i32 = binarynode_i18.getLeft();
        try {
            java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode33 = binaryTreeByLevel0.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(binarynode_i5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(list_binaryNode7);
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
        org.junit.Assert.assertNull(binarynode_i32);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode5 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode7 = findKthElement0.find3(listNode5, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(listNode5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 0, 0 };
        java.util.Vector<java.lang.Integer> vector_i3 = new java.util.Vector<java.lang.Integer>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i3, i_array2);
        java.lang.Object obj5 = vector_i3.clone();
        int i6 = vector_i3.size();
        java.lang.Integer i8 = vector_i3.remove((int) (short) 1);
        try {
            vector_i3.insertElementAt((java.lang.Integer) 10, 10);
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
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.github.pedrovgs.problem48.WordSearch wordSearch0 = new com.github.pedrovgs.problem48.WordSearch();
        char[] char_array4 = new char[] { '#', 'a', ' ' };
        char[] char_array8 = new char[] { '#', 'a', ' ' };
        char[][] char_array_array9 = new char[][] { char_array4, char_array8 };
        boolean b11 = wordSearch0.contains(char_array_array9, "97");
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem48.WordSearch> listnode_wordSearch12 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem48.WordSearch>(wordSearch0);
        org.junit.Assert.assertNotNull(char_array4);
        org.junit.Assert.assertNotNull(char_array8);
        org.junit.Assert.assertNotNull(char_array_array9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.github.pedrovgs.problem26.Palindromes palindromes0 = new com.github.pedrovgs.problem26.Palindromes();
        boolean b2 = palindromes0.evaluate("/");
        boolean b4 = palindromes0.evaluate("[null]");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.github.pedrovgs.problem50.UniqueChars uniqueChars0 = new com.github.pedrovgs.problem50.UniqueChars();
        boolean b2 = uniqueChars0.evaluate2("/!ih/");
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.github.pedrovgs.problem61.SumLists sumLists0 = new com.github.pedrovgs.problem61.SumLists();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode5 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList6 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays7 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays8 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays7);
        java.lang.String str9 = listnode_mergeSortedArrays8.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i10 = reverseLinkedList6.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays8);
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
        com.github.pedrovgs.linkedlist.ListNode listNode22 = reverseLinkedList6.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays13);
        try {
            int i23 = sumLists0.sum((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode5, (com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(listNode5);
        org.junit.Assert.assertNotNull(listnode_i10);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays14);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays15);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(listNode21);
        org.junit.Assert.assertNotNull(listNode22);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.github.pedrovgs.problem29.AreAnagrams areAnagrams0 = new com.github.pedrovgs.problem29.AreAnagrams();
        boolean b3 = areAnagrams0.check("1", "97");
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
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
        try {
            vector_i5.setElementAt((java.lang.Integer) 1, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(stream_i14);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(binarynode_i18);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push((-1));
        java.util.Enumeration<java.lang.Integer> enumeration_i3 = stack2_0.elements();
        org.junit.Assert.assertNotNull(enumeration_i3);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
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
        java.lang.Integer[] i_array19 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i20 = new java.util.Vector<java.lang.Integer>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i20, i_array19);
        boolean b23 = vector_i20.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i24 = vector_i20.elements();
        java.lang.Object[] obj_array25 = vector_i20.toArray();
        try {
            vector_i4.copyInto(obj_array25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(enumeration_i14);
        org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0 + "'", i15.equals(0));
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(enumeration_i24);
        org.junit.Assert.assertNotNull(obj_array25);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.ensureCapacity((int) (short) 100);
        int i3 = stack2_0.getMin();
        java.util.ListIterator<java.lang.Integer> listiterator_i4 = stack2_0.listIterator();
        try {
            java.lang.Integer i5 = stack2_0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertTrue(i3 == 2147483647);
        org.junit.Assert.assertNotNull(listiterator_i4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
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
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i24 = binarynode_i10.getLeft();
        try {
            boolean b25 = binarynode_i24.hasRight();
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
        org.junit.Assert.assertNull(binarynode_i24);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.github.pedrovgs.problem27.ReverseSentence reverseSentence0 = new com.github.pedrovgs.problem27.ReverseSentence();
        java.lang.String str2 = reverseSentence0.reverse("BinaryNode{data=100}");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BinaryNode{data=100}" + "'", str2.equals("BinaryNode{data=100}"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals0 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST1 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i4 = sortedArrayToBST1.transform(i_array3);
        boolean b5 = binarynode_i4.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST6 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array8 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i9 = sortedArrayToBST6.transform(i_array8);
        boolean b10 = binarynode_i9.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i11 = binarynode_i9.getRight();
        boolean b12 = binaryTreeEquals0.areEqualsIterative(binarynode_i4, binarynode_i9);
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder13 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian14 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i16 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d17 = avlTreeMedian14.find(binarynode_i16);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode18 = binaryTreePreOrder13.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i16);
        com.github.pedrovgs.problem18.IsBST isBST19 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST20 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array22 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i23 = sortedArrayToBST20.transform(i_array22);
        boolean b24 = isBST19.checkRecursive(binarynode_i23);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode25 = binaryTreePreOrder13.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i23);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals26 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem18.IsBST isBST27 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST28 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array30 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i31 = sortedArrayToBST28.transform(i_array30);
        boolean b32 = isBST27.checkRecursive(binarynode_i31);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST33 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array35 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i36 = sortedArrayToBST33.transform(i_array35);
        boolean b37 = binarynode_i36.hasRight();
        boolean b38 = binaryTreeEquals26.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i31, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i36);
        com.github.pedrovgs.problem18.IsBST isBST39 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST40 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array42 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i43 = sortedArrayToBST40.transform(i_array42);
        boolean b44 = isBST39.checkRecursive(binarynode_i43);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals45 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST46 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array48 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i49 = sortedArrayToBST46.transform(i_array48);
        boolean b50 = binarynode_i49.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST51 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array53 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i54 = sortedArrayToBST51.transform(i_array53);
        boolean b55 = binarynode_i54.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i56 = binarynode_i54.getRight();
        boolean b57 = binaryTreeEquals45.areEqualsIterative(binarynode_i49, binarynode_i54);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i58 = binarynode_i49.getLeft();
        boolean b59 = isBST39.checkIterative(binarynode_i49);
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian60 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i62 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d63 = avlTreeMedian60.find(binarynode_i62);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor64 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals65 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST66 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array68 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i69 = sortedArrayToBST66.transform(i_array68);
        boolean b70 = binarynode_i69.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST71 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array73 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i74 = sortedArrayToBST71.transform(i_array73);
        boolean b75 = binarynode_i74.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i76 = binarynode_i74.getRight();
        boolean b77 = binaryTreeEquals65.areEqualsIterative(binarynode_i69, binarynode_i74);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST78 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array80 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i81 = sortedArrayToBST78.transform(i_array80);
        boolean b82 = binarynode_i81.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST83 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array85 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i86 = sortedArrayToBST83.transform(i_array85);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode87 = lowestCommonAncestor64.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i74, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i81, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i86);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i88 = binarynode_i74.getLeft();
        double d89 = avlTreeMedian60.find(binarynode_i74);
        boolean b90 = isBST39.checkRecursive(binarynode_i74);
        binarynode_i31.setRight(binarynode_i74);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode92 = binaryTreePreOrder13.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i74);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST93 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array95 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i96 = sortedArrayToBST93.transform(i_array95);
        boolean b97 = binaryTreeEquals0.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i74, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i96);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(binarynode_i4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(binarynode_i9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(binarynode_i11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(d17 == 10.0d);
        org.junit.Assert.assertNotNull(list_binaryNode18);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(binarynode_i23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(list_binaryNode25);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(binarynode_i31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(binarynode_i36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(binarynode_i43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(binarynode_i49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(binarynode_i54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(binarynode_i56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNull(binarynode_i58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(d63 == 10.0d);
        org.junit.Assert.assertNotNull(i_array68);
        org.junit.Assert.assertNotNull(binarynode_i69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(i_array73);
        org.junit.Assert.assertNotNull(binarynode_i74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNull(binarynode_i76);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertNotNull(i_array80);
        org.junit.Assert.assertNotNull(binarynode_i81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(i_array85);
        org.junit.Assert.assertNotNull(binarynode_i86);
        org.junit.Assert.assertNull(binaryNode87);
        org.junit.Assert.assertNull(binarynode_i88);
        org.junit.Assert.assertTrue(d89 == 100.0d);
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertNotNull(list_binaryNode92);
        org.junit.Assert.assertNotNull(i_array95);
        org.junit.Assert.assertNotNull(binarynode_i96);
        org.junit.Assert.assertTrue(b97 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.github.pedrovgs.problem20.MultiplicationWithoutMultiply multiplicationWithoutMultiply0 = new com.github.pedrovgs.problem20.MultiplicationWithoutMultiply();
        int i3 = multiplicationWithoutMultiply0.calculate(270, (-52));
        org.junit.Assert.assertTrue(i3 == (-14040));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.github.pedrovgs.problem79.MergeSort mergeSort0 = new com.github.pedrovgs.problem79.MergeSort();
        int[] i_array1 = new int[] {};
        mergeSort0.sort(i_array1);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        com.github.pedrovgs.problem8.SplitArray splitArray5 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array8 = new int[] { (byte) 1, (byte) 10 };
        splitArray5.splitSwappingPartition(i_array8);
        int[] i_array16 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray5.splitSwappingRecursive(i_array16);
        com.github.pedrovgs.problem8.SplitArray splitArray18 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array21 = new int[] { (byte) 1, (byte) 10 };
        splitArray18.splitSwappingPartition(i_array21);
        int[] i_array29 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray18.splitSwappingRecursive(i_array29);
        int[] i_array31 = mergeSortedArrays3.merge(i_array16, i_array29);
        mergeSort0.sort(i_array29);
        org.junit.Assert.assertNotNull(i_array1);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array31);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.github.pedrovgs.problem28.FindSums findSums0 = new com.github.pedrovgs.problem28.FindSums();
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
        com.github.pedrovgs.problem76.InsertionSort insertionSort32 = new com.github.pedrovgs.problem76.InsertionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray33 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays34 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays35 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays34);
        com.github.pedrovgs.problem8.SplitArray splitArray36 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array39 = new int[] { (byte) 1, (byte) 10 };
        splitArray36.splitSwappingPartition(i_array39);
        int[] i_array47 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray36.splitSwappingRecursive(i_array47);
        com.github.pedrovgs.problem8.SplitArray splitArray49 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array52 = new int[] { (byte) 1, (byte) 10 };
        splitArray49.splitSwappingPartition(i_array52);
        int[] i_array60 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray49.splitSwappingRecursive(i_array60);
        int[] i_array62 = mergeSortedArrays34.merge(i_array47, i_array60);
        splitArray33.splitSwappingIterative(i_array60);
        insertionSort32.sort(i_array60);
        splitArray1.splitSwappingRecursive(i_array60);
        java.util.List<com.github.pedrovgs.pair.Pair<java.lang.Integer, java.lang.Integer>> list_pair_i_i67 = findSums0.findLinearComplexityOrder(i_array60, 0);
        org.junit.Assert.assertNotNull(i_array7);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array60);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(list_pair_i_i67);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.github.pedrovgs.problem32.Contains contains0 = new com.github.pedrovgs.problem32.Contains();
        boolean b3 = contains0.evaluate("", "/");
        boolean b6 = contains0.evaluate("0", "/hi!/");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.github.pedrovgs.problem60.PartitionList partitionList0 = new com.github.pedrovgs.problem60.PartitionList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements1 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList2 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode6 = reverseLinkedList2.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        removeListDuplicatedElements1.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode6);
        try {
            com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i9 = partitionList0.split((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(listNode6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100, 0, (-1), (-1) };
        java.util.Stack<java.lang.Integer> stack_i5 = new java.util.Stack<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i5, i_array4);
        java.lang.Integer i8 = stack_i5.push((java.lang.Integer) 0);
        try {
            stack_i5.removeElementAt(270);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0 + "'", i8.equals(0));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        try {
            int i2 = factorial0.getRecursive((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push((-1));
        java.lang.Integer i3 = stack2_0.peek();
        java.lang.Integer i4 = stack2_0.pop();
        stack2_0.push(100);
        int i7 = stack2_0.getMin();
        org.junit.Assert.assertTrue("'" + i3 + "' != '" + (-1) + "'", i3.equals((-1)));
        org.junit.Assert.assertTrue("'" + i4 + "' != '" + (-1) + "'", i4.equals((-1)));
        org.junit.Assert.assertTrue(i7 == 100);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        try {
            java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersCheating("hi!", "97");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder0 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
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
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode25 = binaryTreePreOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i18);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals26 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem18.IsBST isBST27 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST28 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array30 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i31 = sortedArrayToBST28.transform(i_array30);
        boolean b32 = isBST27.checkRecursive(binarynode_i31);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST33 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array35 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i36 = sortedArrayToBST33.transform(i_array35);
        boolean b37 = binarynode_i36.hasRight();
        boolean b38 = binaryTreeEquals26.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i31, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i36);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i39 = binarynode_i31.getLeft();
        try {
            java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode40 = binaryTreePreOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i39);
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
        org.junit.Assert.assertNotNull(list_binaryNode25);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(binarynode_i31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(binarynode_i36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(binarynode_i39);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.github.pedrovgs.problem37.PathCalculator pathCalculator0 = new com.github.pedrovgs.problem37.PathCalculator();
        java.lang.String str4 = pathCalculator0.calculate("!ih", "hi!", "/");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "/!ih/hi!/" + "'", str4.equals("/!ih/hi!/"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.github.pedrovgs.problem16.BinaryTreePostOrder binaryTreePostOrder0 = new com.github.pedrovgs.problem16.BinaryTreePostOrder();
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
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode67 = binaryTreePostOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i49);
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
        org.junit.Assert.assertNotNull(list_binaryNode67);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        try {
            java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("/!ih/", "[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode5 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode7 = findKthElement0.find2(listNode5, 3628800);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(listNode5);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode5 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode7 = findKthElement0.find2((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(listNode5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        java.lang.Integer i11 = vector_i5.get((int) (short) 1);
        try {
            java.util.List<java.lang.Integer> list_i14 = vector_i5.subList(270, 270);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1) + "'", i11.equals((-1)));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange1 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange2 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "", combinationsOfChange1);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        com.github.pedrovgs.problem8.SplitArray splitArray5 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array8 = new int[] { (byte) 1, (byte) 10 };
        splitArray5.splitSwappingPartition(i_array8);
        int[] i_array16 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray5.splitSwappingRecursive(i_array16);
        com.github.pedrovgs.problem8.SplitArray splitArray18 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array21 = new int[] { (byte) 1, (byte) 10 };
        splitArray18.splitSwappingPartition(i_array21);
        int[] i_array29 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray18.splitSwappingRecursive(i_array29);
        int[] i_array31 = mergeSortedArrays3.merge(i_array16, i_array29);
        boolean b32 = pair_comparable_str_combinationsOfChange2.equals((java.lang.Object) i_array16);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates33 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST34 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array36 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i37 = sortedArrayToBST34.transform(i_array36);
        java.lang.Integer[] i_array38 = removeDuplicates33.removeUsingSorting(i_array36);
        boolean b39 = pair_comparable_str_combinationsOfChange2.equals((java.lang.Object) i_array36);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(binarynode_i37);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(0);
        try {
            int i4 = factorial0.getIterative((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.github.pedrovgs.problem25.Anagrams anagrams0 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str2 = anagrams0.get("hi!");
        java.util.List<java.lang.String> list_str4 = anagrams0.get("/");
        org.junit.Assert.assertNotNull(list_str2);
        org.junit.Assert.assertNotNull(list_str4);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
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
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
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
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST42 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array44 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i45 = sortedArrayToBST42.transform(i_array44);
        boolean b46 = binarynode_i45.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i47 = binarynode_i45.getRight();
        java.lang.Integer i48 = binarynode_i45.getData();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode49 = binaryTreePostOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i45);
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
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(binarynode_i45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(binarynode_i47);
        org.junit.Assert.assertTrue("'" + i48 + "' != '" + 100 + "'", i48.equals(100));
        org.junit.Assert.assertNotNull(list_binaryNode49);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        java.lang.Integer i11 = vector_i5.get((int) (short) 1);
        try {
            java.util.ListIterator<java.lang.Integer> listiterator_i13 = vector_i5.listIterator(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1) + "'", i11.equals((-1)));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST0 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i3 = sortedArrayToBST0.transform(i_array2);
        boolean b4 = binarynode_i3.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = binarynode_i3.getRight();
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
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST30 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array32 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i33 = sortedArrayToBST30.transform(i_array32);
        boolean b34 = binarynode_i33.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i35 = binarynode_i33.getRight();
        binarynode_i23.setRight(binarynode_i33);
        try {
            binarynode_i5.setRight(binarynode_i23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(binarynode_i3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(binarynode_i5);
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
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(binarynode_i33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(binarynode_i35);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.github.pedrovgs.problem61.SumLists sumLists0 = new com.github.pedrovgs.problem61.SumLists();
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
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements22 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList23 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays24 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays25 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays24);
        java.lang.String str26 = listnode_mergeSortedArrays25.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode27 = reverseLinkedList23.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays25);
        removeListDuplicatedElements22.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode27);
        removeListDuplicatedElements1.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode27);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements30 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList31 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays32 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays33 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays32);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays34 = listnode_mergeSortedArrays33.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays35 = listnode_mergeSortedArrays33.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i37 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i38 = null;
        binarynode_i37.setRight(binarynode_i38);
        boolean b40 = listnode_mergeSortedArrays33.equals((java.lang.Object) binarynode_i38);
        com.github.pedrovgs.linkedlist.ListNode listNode41 = reverseLinkedList31.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays33);
        removeListDuplicatedElements30.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode41);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements> listnode_removeListDuplicatedElements43 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements>(removeListDuplicatedElements30);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList44 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements45 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList46 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays47 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays48 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays47);
        java.lang.String str49 = listnode_mergeSortedArrays48.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode50 = reverseLinkedList46.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays48);
        removeListDuplicatedElements45.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode50);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i52 = getTheElementInTheMiddleOfTheList44.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode50);
        removeListDuplicatedElements30.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode50);
        try {
            int i54 = sumLists0.sumReverse((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode27, (com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode50);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(listNode12);
        org.junit.Assert.assertNotNull(listNode19);
        org.junit.Assert.assertNotNull(listNode27);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays34);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays35);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(listNode41);
        org.junit.Assert.assertNotNull(listNode50);
        org.junit.Assert.assertNotNull(listnode_i52);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.github.pedrovgs.problem61.SumLists sumLists0 = new com.github.pedrovgs.problem61.SumLists();
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
        try {
            int i27 = sumLists0.sum(listnode_i9, (com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode26);
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
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.github.pedrovgs.problem27.ReverseSentence reverseSentence0 = new com.github.pedrovgs.problem27.ReverseSentence();
        java.lang.String str2 = reverseSentence0.reverse("hi!");
        java.lang.String str4 = reverseSentence0.reverse("/hi!/");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "/hi!/" + "'", str4.equals("/hi!/"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange1 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange2 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "", combinationsOfChange1);
        com.github.pedrovgs.problem28.FindSums findSums3 = new com.github.pedrovgs.problem28.FindSums();
        com.github.pedrovgs.problem8.SplitArray splitArray4 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray5 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array8 = new int[] { (byte) 1, (byte) 10 };
        splitArray5.splitSwappingPartition(i_array8);
        splitArray4.splitSwappingRecursive(i_array8);
        java.util.List<com.github.pedrovgs.pair.Pair<java.lang.Integer, java.lang.Integer>> list_pair_i_i12 = findSums3.find(i_array8, 0);
        try {
            java.util.List<java.util.List<java.lang.Integer>> list_list_i14 = combinationsOfChange1.get(i_array8, (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(list_pair_i_i12);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.Integer[] i_array1 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i2 = new java.util.Stack<java.lang.Integer>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i2, i_array1);
        boolean b4 = stack_i2.empty();
        boolean b5 = stack_i2.empty();
        org.junit.Assert.assertNotNull(i_array1);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.github.pedrovgs.problem50.UniqueChars uniqueChars0 = new com.github.pedrovgs.problem50.UniqueChars();
        boolean b2 = uniqueChars0.evaluate2("35");
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
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
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(10);
        int i4 = factorial0.getTailRecursive((int) (short) 10);
        int i6 = factorial0.getRecursive((int) '#');
        int i8 = factorial0.getRecursive(0);
        org.junit.Assert.assertTrue(i2 == 3628800);
        org.junit.Assert.assertTrue(i4 == 3628800);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays0 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays0);
        java.lang.String str2 = listnode_mergeSortedArrays1.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays6 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays4.setData(mergeSortedArrays6);
        listnode_mergeSortedArrays1.setNext(listnode_mergeSortedArrays4);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays9 = listnode_mergeSortedArrays1.getNext();
        java.lang.String str10 = listnode_mergeSortedArrays9.toString();
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.github.pedrovgs.problem32.Contains contains0 = new com.github.pedrovgs.problem32.Contains();
        boolean b3 = contains0.evaluate("", "/");
        boolean b6 = contains0.evaluate("[]", "BinaryNode{data=100}");
        boolean b9 = contains0.evaluate("35", "[null]");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.github.pedrovgs.problem44.FindMinNumberAtPosition findMinNumberAtPosition0 = new com.github.pedrovgs.problem44.FindMinNumberAtPosition();
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
        try {
            java.lang.Integer i15 = findMinNumberAtPosition0.find(binarynode_i11, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d5 == 10.0d);
        org.junit.Assert.assertNotNull(list_binaryNode6);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(binarynode_i11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(list_binaryNode13);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
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
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(stream_i14);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(binarynode_i18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(listiterator_i20);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.ensureCapacity((int) (short) 100);
        int i3 = stack2_0.getMin();
        java.util.ListIterator<java.lang.Integer> listiterator_i4 = stack2_0.listIterator();
        com.github.pedrovgs.problem42.FloodFill floodFill5 = new com.github.pedrovgs.problem42.FloodFill();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral6 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array7 = new int[][] {};
        int[] i_array8 = goThroughMatrixInSpiral6.go(i_array_array7);
        floodFill5.apply(i_array_array7, (-52), 2, (int) '#', 51);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral14 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array15 = new int[][] {};
        int[] i_array16 = goThroughMatrixInSpiral14.go(i_array_array15);
        int[] i_array23 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[] i_array30 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[][] i_array_array31 = new int[][] { i_array23, i_array30 };
        int[] i_array32 = goThroughMatrixInSpiral14.go(i_array_array31);
        floodFill5.apply(i_array_array31, (-8), (-14040), 2147483647, (-8));
        try {
            int i39 = stack2_0.lastIndexOf((java.lang.Object) i_array_array31, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i3 == 2147483647);
        org.junit.Assert.assertNotNull(listiterator_i4);
        org.junit.Assert.assertNotNull(i_array_array7);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(i_array_array31);
        org.junit.Assert.assertNotNull(i_array32);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
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
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode11 = findKthElement0.find3((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push(100);
        java.lang.Object[] obj_array3 = stack2_0.toArray();
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_0.push((int) (byte) 10);
        stack1_0.push((-5200));
        try {
            stack1_0.removeElementAt((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.github.pedrovgs.problem69.BitsToTransform bitsToTransform0 = new com.github.pedrovgs.problem69.BitsToTransform();
        int i3 = bitsToTransform0.calculate((int) (short) 10, 4);
        org.junit.Assert.assertTrue(i3 == 3);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
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
        java.lang.String str33 = binarynode_i29.toString();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode34 = binaryTreePostOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i29);
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
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(binarynode_i24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(binarynode_i29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(binarynode_i31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "BinaryNode{data=100}" + "'", str33.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertNotNull(list_binaryNode34);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(10);
        try {
            int i4 = factorial0.getIterative((-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 3628800);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.github.pedrovgs.problem51.ReverseString reverseString0 = new com.github.pedrovgs.problem51.ReverseString();
        java.lang.String str2 = reverseString0.reverseRecursive("/hi!/");
        java.lang.String str4 = reverseString0.reverseIterative("hi!");
        java.lang.String str6 = reverseString0.reverseIterative("1");
        java.lang.String str8 = reverseString0.reverseRecursive("1");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/!ih/" + "'", str2.equals("/!ih/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "!ih" + "'", str4.equals("!ih"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        boolean b13 = vector_i4.contains((java.lang.Object) (byte) 100);
        int i16 = vector_i4.lastIndexOf((java.lang.Object) (-5200), 3);
        boolean b18 = vector_i4.add((java.lang.Integer) 2147483647);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.github.pedrovgs.problem20.MultiplicationWithoutMultiply multiplicationWithoutMultiply0 = new com.github.pedrovgs.problem20.MultiplicationWithoutMultiply();
        int i3 = multiplicationWithoutMultiply0.calculate((-52), (int) (byte) 100);
        int i6 = multiplicationWithoutMultiply0.calculate(1, (-14040));
        org.junit.Assert.assertTrue(i3 == (-5200));
        org.junit.Assert.assertTrue(i6 == (-14040));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideIterative((int) (byte) 10, (int) (byte) 100);
        float f6 = divideUsingSubtraction0.divideIterative(1, (int) (short) 100);
        float f9 = divideUsingSubtraction0.divideRecursive(3, 27);
        float f12 = divideUsingSubtraction0.divideIterative((int) (byte) -1, (-8));
        org.junit.Assert.assertTrue(f3 == 0.1f);
        org.junit.Assert.assertTrue(f6 == 0.01f);
        org.junit.Assert.assertTrue(f9 == 0.11111111f);
        org.junit.Assert.assertTrue(f12 == 2.85212672E8f);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
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
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.github.pedrovgs.problem60.PartitionList partitionList0 = new com.github.pedrovgs.problem60.PartitionList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i5 = reverseLinkedList1.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList6 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays7 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays8 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays7);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays9 = listnode_mergeSortedArrays8.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays10 = listnode_mergeSortedArrays8.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i12 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i13 = null;
        binarynode_i12.setRight(binarynode_i13);
        boolean b15 = listnode_mergeSortedArrays8.equals((java.lang.Object) binarynode_i13);
        com.github.pedrovgs.linkedlist.ListNode listNode16 = reverseLinkedList6.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays8);
        com.github.pedrovgs.linkedlist.ListNode listNode17 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays8);
        try {
            com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i19 = partitionList0.split((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode17, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(listnode_i5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays9);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays10);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(listNode16);
        org.junit.Assert.assertNotNull(listNode17);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
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
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals82 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST83 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array85 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i86 = sortedArrayToBST83.transform(i_array85);
        boolean b87 = binarynode_i86.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST88 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array90 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i91 = sortedArrayToBST88.transform(i_array90);
        boolean b92 = binarynode_i91.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i93 = binarynode_i91.getRight();
        boolean b94 = binaryTreeEquals82.areEqualsIterative(binarynode_i86, binarynode_i91);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i95 = binarynode_i86.getLeft();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode96 = treeToListByLevel0.transform((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i86);
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
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNotNull(i_array90);
        org.junit.Assert.assertNotNull(binarynode_i91);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertNull(binarynode_i93);
        org.junit.Assert.assertTrue(b94 == true);
        org.junit.Assert.assertNull(binarynode_i95);
        org.junit.Assert.assertNotNull(list_binaryNode96);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i1 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 0);
        java.lang.Integer i2 = binarynode_i1.getData();
        org.junit.Assert.assertTrue("'" + i2 + "' != '" + 0 + "'", i2.equals(0));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
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
        java.util.function.UnaryOperator<java.lang.Integer> unaryoperator_i16 = null;
        try {
            vector_i4.replaceAll(unaryoperator_i16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(enumeration_i14);
        org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0 + "'", i15.equals(0));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.github.pedrovgs.problem30.ScientificNotation scientificNotation0 = new com.github.pedrovgs.problem30.ScientificNotation();
        try {
            long long2 = scientificNotation0.calculate("/hi!/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.github.pedrovgs.problem61.SumLists sumLists0 = new com.github.pedrovgs.problem61.SumLists();
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
        removeListDuplicatedElements14.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode19);
        try {
            int i21 = sumLists0.sum((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode12, (com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(listNode12);
        org.junit.Assert.assertNotNull(listNode19);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.github.pedrovgs.problem54.RotateMatrix rotateMatrix0 = new com.github.pedrovgs.problem54.RotateMatrix();
        int[][] i_array_array1 = null;
        try {
            rotateMatrix0.rotate(i_array_array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.github.pedrovgs.problem61.SumLists sumLists0 = new com.github.pedrovgs.problem61.SumLists();
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
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements22 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList23 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays24 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays25 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays24);
        java.lang.String str26 = listnode_mergeSortedArrays25.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode27 = reverseLinkedList23.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays25);
        removeListDuplicatedElements22.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode27);
        removeListDuplicatedElements1.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode27);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList30 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays31 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays32 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays31);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays33 = listnode_mergeSortedArrays32.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays34 = listnode_mergeSortedArrays32.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i36 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i37 = null;
        binarynode_i36.setRight(binarynode_i37);
        boolean b39 = listnode_mergeSortedArrays32.equals((java.lang.Object) binarynode_i37);
        com.github.pedrovgs.linkedlist.ListNode listNode40 = reverseLinkedList30.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays32);
        try {
            int i41 = sumLists0.sumReverse((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode27, (com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(listNode12);
        org.junit.Assert.assertNotNull(listNode19);
        org.junit.Assert.assertNotNull(listNode27);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays33);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays34);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(listNode40);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push((-1));
        java.lang.Integer i3 = stack2_0.peek();
        java.lang.Integer i4 = stack2_0.pop();
        try {
            java.lang.Integer i5 = stack2_0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertTrue("'" + i3 + "' != '" + (-1) + "'", i3.equals((-1)));
        org.junit.Assert.assertTrue("'" + i4 + "' != '" + (-1) + "'", i4.equals((-1)));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange1 = null;
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange2 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "3", combinationsOfChange1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.github.pedrovgs.problem61.SumLists sumLists0 = new com.github.pedrovgs.problem61.SumLists();
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
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList28 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements29 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList30 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays31 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays32 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays31);
        java.lang.String str33 = listnode_mergeSortedArrays32.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode34 = reverseLinkedList30.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays32);
        removeListDuplicatedElements29.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode34);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i36 = getTheElementInTheMiddleOfTheList28.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode34);
        try {
            int i37 = sumLists0.sum(listnode_i27, (com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode34);
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
        org.junit.Assert.assertNotNull(listNode34);
        org.junit.Assert.assertNotNull(listnode_i36);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
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
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian21 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i23 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d24 = avlTreeMedian21.find(binarynode_i23);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor25 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals26 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST27 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array29 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i30 = sortedArrayToBST27.transform(i_array29);
        boolean b31 = binarynode_i30.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST32 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array34 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i35 = sortedArrayToBST32.transform(i_array34);
        boolean b36 = binarynode_i35.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i37 = binarynode_i35.getRight();
        boolean b38 = binaryTreeEquals26.areEqualsIterative(binarynode_i30, binarynode_i35);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST39 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array41 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i42 = sortedArrayToBST39.transform(i_array41);
        boolean b43 = binarynode_i42.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST44 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array46 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i47 = sortedArrayToBST44.transform(i_array46);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode48 = lowestCommonAncestor25.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i35, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i42, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i47);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i49 = binarynode_i35.getLeft();
        double d50 = avlTreeMedian21.find(binarynode_i35);
        boolean b51 = isBST0.checkRecursive(binarynode_i35);
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
        boolean b76 = isBST0.checkIterative(binarynode_i62);
        com.github.pedrovgs.problem18.IsBST isBST77 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST78 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array80 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i81 = sortedArrayToBST78.transform(i_array80);
        boolean b82 = isBST77.checkRecursive(binarynode_i81);
        boolean b83 = binarynode_i81.hasRight();
        java.lang.Integer i84 = binarynode_i81.getData();
        boolean b85 = isBST0.checkRecursive(binarynode_i81);
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
        org.junit.Assert.assertTrue(d24 == 10.0d);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(binarynode_i30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(binarynode_i35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(binarynode_i37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(binarynode_i42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(binarynode_i47);
        org.junit.Assert.assertNull(binaryNode48);
        org.junit.Assert.assertNull(binarynode_i49);
        org.junit.Assert.assertTrue(d50 == 100.0d);
        org.junit.Assert.assertTrue(b51 == true);
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
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(i_array80);
        org.junit.Assert.assertNotNull(binarynode_i81);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue("'" + i84 + "' != '" + 100 + "'", i84.equals(100));
        org.junit.Assert.assertTrue(b85 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.github.pedrovgs.problem54.RotateMatrix rotateMatrix0 = new com.github.pedrovgs.problem54.RotateMatrix();
        com.github.pedrovgs.problem42.FloodFill floodFill1 = new com.github.pedrovgs.problem42.FloodFill();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral2 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array3 = new int[][] {};
        int[] i_array4 = goThroughMatrixInSpiral2.go(i_array_array3);
        floodFill1.apply(i_array_array3, (-52), 2, (int) '#', 51);
        try {
            rotateMatrix0.rotate(i_array_array3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array_array3);
        org.junit.Assert.assertNotNull(i_array4);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("0", "");
        try {
            java.lang.String str6 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("!ih", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals0 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem18.IsBST isBST1 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST2 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = sortedArrayToBST2.transform(i_array4);
        boolean b6 = isBST1.checkRecursive(binarynode_i5);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST7 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array9 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i10 = sortedArrayToBST7.transform(i_array9);
        boolean b11 = binarynode_i10.hasRight();
        boolean b12 = binaryTreeEquals0.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i5, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i10);
        com.github.pedrovgs.problem18.IsBST isBST13 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST14 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array16 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i17 = sortedArrayToBST14.transform(i_array16);
        boolean b18 = isBST13.checkRecursive(binarynode_i17);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals19 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST20 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array22 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i23 = sortedArrayToBST20.transform(i_array22);
        boolean b24 = binarynode_i23.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST25 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array27 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i28 = sortedArrayToBST25.transform(i_array27);
        boolean b29 = binarynode_i28.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i30 = binarynode_i28.getRight();
        boolean b31 = binaryTreeEquals19.areEqualsIterative(binarynode_i23, binarynode_i28);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i32 = binarynode_i23.getLeft();
        boolean b33 = isBST13.checkIterative(binarynode_i23);
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian34 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i36 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d37 = avlTreeMedian34.find(binarynode_i36);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor38 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals39 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST40 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array42 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i43 = sortedArrayToBST40.transform(i_array42);
        boolean b44 = binarynode_i43.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST45 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array47 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i48 = sortedArrayToBST45.transform(i_array47);
        boolean b49 = binarynode_i48.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i50 = binarynode_i48.getRight();
        boolean b51 = binaryTreeEquals39.areEqualsIterative(binarynode_i43, binarynode_i48);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST52 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array54 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i55 = sortedArrayToBST52.transform(i_array54);
        boolean b56 = binarynode_i55.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST57 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array59 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i60 = sortedArrayToBST57.transform(i_array59);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode61 = lowestCommonAncestor38.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i48, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i55, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i60);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i62 = binarynode_i48.getLeft();
        double d63 = avlTreeMedian34.find(binarynode_i48);
        boolean b64 = isBST13.checkRecursive(binarynode_i48);
        binarynode_i5.setRight(binarynode_i48);
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian66 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i68 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d69 = avlTreeMedian66.find(binarynode_i68);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor70 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals71 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST72 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array74 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i75 = sortedArrayToBST72.transform(i_array74);
        boolean b76 = binarynode_i75.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST77 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array79 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i80 = sortedArrayToBST77.transform(i_array79);
        boolean b81 = binarynode_i80.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i82 = binarynode_i80.getRight();
        boolean b83 = binaryTreeEquals71.areEqualsIterative(binarynode_i75, binarynode_i80);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST84 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array86 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i87 = sortedArrayToBST84.transform(i_array86);
        boolean b88 = binarynode_i87.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST89 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array91 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i92 = sortedArrayToBST89.transform(i_array91);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode93 = lowestCommonAncestor70.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i80, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i87, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i92);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i94 = binarynode_i80.getLeft();
        double d95 = avlTreeMedian66.find(binarynode_i80);
        binarynode_i48.setRight(binarynode_i80);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(binarynode_i5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(binarynode_i10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(binarynode_i17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(binarynode_i23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(binarynode_i28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(binarynode_i30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(binarynode_i32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(d37 == 10.0d);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(binarynode_i43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(binarynode_i48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(binarynode_i50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(binarynode_i55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(i_array59);
        org.junit.Assert.assertNotNull(binarynode_i60);
        org.junit.Assert.assertNull(binaryNode61);
        org.junit.Assert.assertNull(binarynode_i62);
        org.junit.Assert.assertTrue(d63 == 100.0d);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(d69 == 10.0d);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertNotNull(binarynode_i75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(i_array79);
        org.junit.Assert.assertNotNull(binarynode_i80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNull(binarynode_i82);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(i_array86);
        org.junit.Assert.assertNotNull(binarynode_i87);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(i_array91);
        org.junit.Assert.assertNotNull(binarynode_i92);
        org.junit.Assert.assertNull(binaryNode93);
        org.junit.Assert.assertNull(binarynode_i94);
        org.junit.Assert.assertTrue(d95 == 100.0d);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.github.pedrovgs.problem51.ReverseString reverseString0 = new com.github.pedrovgs.problem51.ReverseString();
        java.lang.String str2 = reverseString0.reverseRecursive("/hi!/");
        java.lang.String str4 = reverseString0.reverseIterative("/");
        java.lang.String str6 = reverseString0.reverseIterative("97");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/!ih/" + "'", str2.equals("/!ih/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "/" + "'", str4.equals("/"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "79" + "'", str6.equals("79"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        java.lang.String str3 = listnode_mergeSortedArrays2.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays4 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays2.setData(mergeSortedArrays4);
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode7 = findKthElement0.find((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        java.lang.Integer i11 = vector_i5.get((int) (short) 1);
        java.lang.Integer i12 = vector_i5.firstElement();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue("'" + i11 + "' != '" + (-1) + "'", i11.equals((-1)));
        org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1 + "'", i12.equals(1));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        vector_i4.trimToSize();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.github.pedrovgs.problem33.SimpleRegularExpression simpleRegularExpression0 = new com.github.pedrovgs.problem33.SimpleRegularExpression();
        boolean b3 = simpleRegularExpression0.evaluate("1", "97");
        boolean b6 = simpleRegularExpression0.evaluate("[", "[]");
        boolean b9 = simpleRegularExpression0.evaluate("/hi!/", "/!ih/hi!/");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals0 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder1 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder2 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian3 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d6 = avlTreeMedian3.find(binarynode_i5);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode7 = binaryTreePreOrder2.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i5);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i8 = binaryTreeInOrder1.getIterative(binarynode_i5);
        com.github.pedrovgs.problem18.IsBST isBST9 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST10 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array12 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i13 = sortedArrayToBST10.transform(i_array12);
        boolean b14 = isBST9.checkRecursive(binarynode_i13);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals15 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST16 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array18 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i19 = sortedArrayToBST16.transform(i_array18);
        boolean b20 = binarynode_i19.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST21 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array23 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i24 = sortedArrayToBST21.transform(i_array23);
        boolean b25 = binarynode_i24.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i26 = binarynode_i24.getRight();
        boolean b27 = binaryTreeEquals15.areEqualsIterative(binarynode_i19, binarynode_i24);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i28 = binarynode_i19.getLeft();
        boolean b29 = isBST9.checkIterative(binarynode_i19);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals30 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST31 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array33 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i34 = sortedArrayToBST31.transform(i_array33);
        boolean b35 = binarynode_i34.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST36 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array38 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i39 = sortedArrayToBST36.transform(i_array38);
        boolean b40 = binarynode_i39.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i41 = binarynode_i39.getRight();
        boolean b42 = binaryTreeEquals30.areEqualsIterative(binarynode_i34, binarynode_i39);
        boolean b43 = isBST9.checkIterative(binarynode_i39);
        boolean b44 = binaryTreeEquals0.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i5, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i39);
        org.junit.Assert.assertTrue(d6 == 10.0d);
        org.junit.Assert.assertNotNull(list_binaryNode7);
        org.junit.Assert.assertNotNull(list_binarynode_i8);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(binarynode_i13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertNotNull(binarynode_i19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(binarynode_i24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(binarynode_i26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(binarynode_i28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(binarynode_i34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(binarynode_i39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(binarynode_i41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList0 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        java.lang.String str3 = listnode_mergeSortedArrays2.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i4 = reverseLinkedList0.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2);
        com.github.pedrovgs.problem62.PalindromeList palindromeList5 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList6 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays7 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays8 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays7);
        java.lang.String str9 = listnode_mergeSortedArrays8.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i10 = reverseLinkedList6.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays8);
        boolean b11 = palindromeList5.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays8);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays12 = listnode_mergeSortedArrays8.getNext();
        listnode_mergeSortedArrays2.setNext(listnode_mergeSortedArrays8);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays14 = listnode_mergeSortedArrays2.getData();
        org.junit.Assert.assertNotNull(listnode_i4);
        org.junit.Assert.assertNotNull(listnode_i10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays12);
        org.junit.Assert.assertNotNull(mergeSortedArrays14);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
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
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays10 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays11 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays10);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays12 = listnode_mergeSortedArrays11.getNext();
        listnode_mergeSortedArrays2.setNext(listnode_mergeSortedArrays11);
        java.lang.String str14 = listnode_mergeSortedArrays2.toString();
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode16 = findKthElement0.find2((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2, 3628800);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays12);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.github.pedrovgs.problem48.WordSearch wordSearch0 = new com.github.pedrovgs.problem48.WordSearch();
        char[] char_array4 = new char[] { '#', 'a', ' ' };
        char[] char_array8 = new char[] { '#', 'a', ' ' };
        char[][] char_array_array9 = new char[][] { char_array4, char_array8 };
        boolean b11 = wordSearch0.contains(char_array_array9, "97");
        char[] char_array13 = new char[] { '4' };
        char[] char_array15 = new char[] { '4' };
        char[] char_array17 = new char[] { '4' };
        char[][] char_array_array18 = new char[][] { char_array13, char_array15, char_array17 };
        try {
            boolean b20 = wordSearch0.contains(char_array_array18, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(char_array4);
        org.junit.Assert.assertNotNull(char_array8);
        org.junit.Assert.assertNotNull(char_array_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(char_array13);
        org.junit.Assert.assertNotNull(char_array15);
        org.junit.Assert.assertNotNull(char_array17);
        org.junit.Assert.assertNotNull(char_array_array18);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.github.pedrovgs.problem7.FibonacciNumbers fibonacciNumbers0 = new com.github.pedrovgs.problem7.FibonacciNumbers();
        long long2 = fibonacciNumbers0.getIterative((long) 10);
        try {
            long long4 = fibonacciNumbers0.getRecursive((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(long2 == 55L);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.github.pedrovgs.problem11.IntToString intToString0 = new com.github.pedrovgs.problem11.IntToString();
        java.lang.String str2 = intToString0.transform(3);
        java.lang.String str4 = intToString0.transform((int) (byte) 10);
        java.lang.String str6 = intToString0.transform((int) ' ');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3" + "'", str2.equals("3"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "32" + "'", str6.equals("32"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
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
        java.util.stream.Stream<java.lang.Integer> stream_i16 = vector_i4.parallelStream();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(enumeration_i14);
        org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0 + "'", i15.equals(0));
        org.junit.Assert.assertNotNull(stream_i16);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.github.pedrovgs.problem56.IsRotationUsingIsSubstring isRotationUsingIsSubstring0 = new com.github.pedrovgs.problem56.IsRotationUsingIsSubstring();
        boolean b3 = isRotationUsingIsSubstring0.check("", "[]");
        boolean b6 = isRotationUsingIsSubstring0.check("/hi!/", "hi!");
        boolean b9 = isRotationUsingIsSubstring0.check("/!ih/", "hi!");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode5 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays6 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays7 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays6);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays8 = listnode_mergeSortedArrays7.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays9 = listnode_mergeSortedArrays7.getNext();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays10 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort11 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray12 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array15 = new int[] { (byte) 1, (byte) 10 };
        splitArray12.splitSwappingPartition(i_array15);
        selectionSort11.sort(i_array15);
        com.github.pedrovgs.problem8.SplitArray splitArray18 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array21 = new int[] { (byte) 1, (byte) 10 };
        splitArray18.splitSwappingPartition(i_array21);
        int[] i_array29 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray18.splitSwappingRecursive(i_array29);
        int[] i_array31 = mergeSortedArrays10.merge(i_array15, i_array29);
        listnode_mergeSortedArrays7.setData(mergeSortedArrays10);
        listNode5.setData(mergeSortedArrays10);
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode35 = findKthElement0.find(listNode5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(listNode5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays8);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays9);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array31);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays0 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays0);
        java.lang.String str2 = listnode_mergeSortedArrays1.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays1.setData(mergeSortedArrays3);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays5 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort6 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray7 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array10 = new int[] { (byte) 1, (byte) 10 };
        splitArray7.splitSwappingPartition(i_array10);
        selectionSort6.sort(i_array10);
        com.github.pedrovgs.problem8.SplitArray splitArray13 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array16 = new int[] { (byte) 1, (byte) 10 };
        splitArray13.splitSwappingPartition(i_array16);
        int[] i_array24 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray13.splitSwappingRecursive(i_array24);
        int[] i_array26 = mergeSortedArrays5.merge(i_array10, i_array24);
        int[] i_array27 = null;
        try {
            int[] i_array28 = mergeSortedArrays3.merge(i_array26, i_array27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array26);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays0 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays0);
        java.lang.String str2 = listnode_mergeSortedArrays1.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays6 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays4.setData(mergeSortedArrays6);
        listnode_mergeSortedArrays1.setNext(listnode_mergeSortedArrays4);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays9 = listnode_mergeSortedArrays1.getNext();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays10 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays11 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays10);
        com.github.pedrovgs.problem8.SplitArray splitArray12 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array15 = new int[] { (byte) 1, (byte) 10 };
        splitArray12.splitSwappingPartition(i_array15);
        int[] i_array23 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray12.splitSwappingRecursive(i_array23);
        com.github.pedrovgs.problem8.SplitArray splitArray25 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array28 = new int[] { (byte) 1, (byte) 10 };
        splitArray25.splitSwappingPartition(i_array28);
        int[] i_array36 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray25.splitSwappingRecursive(i_array36);
        int[] i_array38 = mergeSortedArrays10.merge(i_array23, i_array36);
        listnode_mergeSortedArrays1.setData(mergeSortedArrays10);
        java.lang.String str40 = listnode_mergeSortedArrays1.toString();
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays9);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array38);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        int i1 = stack1_0.size();
        stack1_0.push(2147483647);
        int i4 = stack1_0.capacity();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i4 == 10);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode4 = findKthElement0.find2((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.github.pedrovgs.problem26.Palindromes palindromes0 = new com.github.pedrovgs.problem26.Palindromes();
        boolean b2 = palindromes0.evaluate("/");
        boolean b4 = palindromes0.evaluate("10");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
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
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode29 = findKthElement0.find(listNode26, (-14040));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnPowersOfTwo("", "");
        try {
            java.lang.String str6 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("[]", "-52");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.github.pedrovgs.problem20.MultiplicationWithoutMultiply multiplicationWithoutMultiply0 = new com.github.pedrovgs.problem20.MultiplicationWithoutMultiply();
        int i3 = multiplicationWithoutMultiply0.calculate((-52), (int) (byte) 100);
        int i6 = multiplicationWithoutMultiply0.calculate(0, (int) (short) 1);
        org.junit.Assert.assertTrue(i3 == (-5200));
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
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
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements14 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList15 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays16 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays17 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays16);
        java.lang.String str18 = listnode_mergeSortedArrays17.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode19 = reverseLinkedList15.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays17);
        removeListDuplicatedElements14.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode19);
        removeListDuplicatedElements1.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode19);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements22 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList23 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays24 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays25 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays24);
        java.lang.String str26 = listnode_mergeSortedArrays25.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode27 = reverseLinkedList23.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays25);
        removeListDuplicatedElements22.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode27);
        removeListDuplicatedElements1.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode27);
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode31 = findKthElement0.find2(listNode27, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(listNode12);
        org.junit.Assert.assertNotNull(listNode19);
        org.junit.Assert.assertNotNull(listNode27);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
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
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements14 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList15 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays16 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays17 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays16);
        java.lang.String str18 = listnode_mergeSortedArrays17.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode19 = reverseLinkedList15.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays17);
        removeListDuplicatedElements14.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode19);
        removeListDuplicatedElements1.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode19);
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode23 = findKthElement0.find3(listNode19, 3628800);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(listNode12);
        org.junit.Assert.assertNotNull(listNode19);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.github.pedrovgs.problem56.IsRotationUsingIsSubstring isRotationUsingIsSubstring0 = new com.github.pedrovgs.problem56.IsRotationUsingIsSubstring();
        boolean b3 = isRotationUsingIsSubstring0.check("hi!", "");
        boolean b6 = isRotationUsingIsSubstring0.check("/", "");
        boolean b9 = isRotationUsingIsSubstring0.check("/hi!/", "0");
        boolean b12 = isRotationUsingIsSubstring0.check("32", "/!ih/");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
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
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push((-1));
        try {
            stack2_0.removeElementAt(107);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.github.pedrovgs.problem4.SquareRoot squareRoot0 = new com.github.pedrovgs.problem4.SquareRoot();
        float f2 = squareRoot0.calculateSquareRootIterative((int) ' ');
        org.junit.Assert.assertTrue(f2 == 5.650014f);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST0 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i3 = sortedArrayToBST0.transform(i_array2);
        boolean b4 = binarynode_i3.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = binarynode_i3.getRight();
        java.lang.Integer i6 = binarynode_i3.getData();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i7 = binarynode_i3.getLeft();
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(binarynode_i3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(binarynode_i5);
        org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100 + "'", i6.equals(100));
        org.junit.Assert.assertNull(binarynode_i7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.github.pedrovgs.problem69.BitsToTransform bitsToTransform0 = new com.github.pedrovgs.problem69.BitsToTransform();
        int i3 = bitsToTransform0.calculate((int) '4', (-8));
        org.junit.Assert.assertTrue(i3 == 28);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.github.pedrovgs.problem65.IsTreeBalanced isTreeBalanced0 = new com.github.pedrovgs.problem65.IsTreeBalanced();
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
        boolean b25 = isTreeBalanced0.check((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i23);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor26 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
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
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST40 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array42 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i43 = sortedArrayToBST40.transform(i_array42);
        boolean b44 = binarynode_i43.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST45 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array47 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i48 = sortedArrayToBST45.transform(i_array47);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode49 = lowestCommonAncestor26.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i36, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i43, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i48);
        java.lang.String str50 = binarynode_i48.toString();
        boolean b51 = isTreeBalanced0.check((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i48);
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
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(binarynode_i31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(binarynode_i36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(binarynode_i38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(binarynode_i43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(binarynode_i48);
        org.junit.Assert.assertNull(binaryNode49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "BinaryNode{data=100}" + "'", str50.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue(b51 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        int i9 = vector_i4.indexOf((java.lang.Object) 1);
        int i11 = vector_i4.indexOf((java.lang.Object) 100.0d);
        java.lang.Object obj12 = vector_i4.clone();
        java.lang.Object obj13 = null;
        int i14 = vector_i4.lastIndexOf(obj13);
        java.util.stream.Stream<java.lang.Integer> stream_i15 = vector_i4.parallelStream();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertNotNull(stream_i15);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
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
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange28 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange29 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "", combinationsOfChange28);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList30 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays31 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays32 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays31);
        java.lang.String str33 = listnode_mergeSortedArrays32.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode34 = reverseLinkedList30.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays32);
        boolean b35 = pair_comparable_str_combinationsOfChange29.equals((java.lang.Object) listNode34);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i36 = getTheElementInTheMiddleOfTheList0.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode34);
        org.junit.Assert.assertNotNull(listNode6);
        org.junit.Assert.assertNotNull(listnode_i8);
        org.junit.Assert.assertNotNull(listnode_i13);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays17);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays18);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(listNode24);
        org.junit.Assert.assertNotNull(listNode25);
        org.junit.Assert.assertNotNull(listnode_i26);
        org.junit.Assert.assertNotNull(listNode34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(listnode_i36);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.github.pedrovgs.problem54.RotateMatrix rotateMatrix0 = new com.github.pedrovgs.problem54.RotateMatrix();
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
        try {
            rotateMatrix0.rotate(i_array_array27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array_array3);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(i_array28);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.github.pedrovgs.problem69.BitsToTransform bitsToTransform0 = new com.github.pedrovgs.problem69.BitsToTransform();
        int i3 = bitsToTransform0.calculate((int) '#', (int) (short) 0);
        int i6 = bitsToTransform0.calculate(51, (int) 'a');
        int i9 = bitsToTransform0.calculate(10, (-1241513984));
        org.junit.Assert.assertTrue(i3 == 3);
        org.junit.Assert.assertTrue(i6 == 3);
        org.junit.Assert.assertTrue(i9 == 7);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.github.pedrovgs.problem69.BitsToTransform bitsToTransform0 = new com.github.pedrovgs.problem69.BitsToTransform();
        int i3 = bitsToTransform0.calculate((int) '#', (int) (short) 0);
        int i6 = bitsToTransform0.calculate(51, (int) 'a');
        int i9 = bitsToTransform0.calculate((int) 'a', (int) (byte) -1);
        int i12 = bitsToTransform0.calculate(1, (int) (short) 1);
        int i15 = bitsToTransform0.calculate(0, 0);
        org.junit.Assert.assertTrue(i3 == 3);
        org.junit.Assert.assertTrue(i6 == 3);
        org.junit.Assert.assertTrue(i9 == 29);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideRecursive(29, 4);
        float f6 = divideUsingSubtraction0.divideIterative(4, 100);
        org.junit.Assert.assertTrue(f3 == 7.25f);
        org.junit.Assert.assertTrue(f6 == 0.04f);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange1 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange2 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "", combinationsOfChange1);
        com.github.pedrovgs.problem28.FindSums findSums3 = new com.github.pedrovgs.problem28.FindSums();
        com.github.pedrovgs.problem8.SplitArray splitArray4 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray5 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array8 = new int[] { (byte) 1, (byte) 10 };
        splitArray5.splitSwappingPartition(i_array8);
        splitArray4.splitSwappingRecursive(i_array8);
        java.util.List<com.github.pedrovgs.pair.Pair<java.lang.Integer, java.lang.Integer>> list_pair_i_i12 = findSums3.find(i_array8, 0);
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_13 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_13.push((int) (byte) 10);
        int i16 = stack1_13.getMin();
        int i17 = stack1_13.getMin();
        com.github.pedrovgs.problem75.SelectionSort selectionSort18 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray19 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array22 = new int[] { (byte) 1, (byte) 10 };
        splitArray19.splitSwappingPartition(i_array22);
        selectionSort18.sort(i_array22);
        int i25 = stack1_13.search((java.lang.Object) i_array22);
        java.util.List<com.github.pedrovgs.pair.Pair<java.lang.Integer, java.lang.Integer>> list_pair_i_i27 = findSums3.find(i_array22, (int) (byte) 1);
        try {
            java.util.List<java.util.List<java.lang.Integer>> list_list_i29 = combinationsOfChange1.get(i_array22, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(list_pair_i_i12);
        org.junit.Assert.assertTrue(i16 == 10);
        org.junit.Assert.assertTrue(i17 == 10);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertNotNull(list_pair_i_i27);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.github.pedrovgs.problem71.ReverseBinaryNumber reverseBinaryNumber0 = new com.github.pedrovgs.problem71.ReverseBinaryNumber();
        int i2 = reverseBinaryNumber0.reverse(27);
        org.junit.Assert.assertTrue(i2 == 4);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        vector_i5.addElement((java.lang.Integer) (-8));
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        int i9 = vector_i4.indexOf((java.lang.Object) 1);
        java.lang.Integer i11 = vector_i4.remove((int) (short) 1);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1 + "'", i11.equals(1));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.github.pedrovgs.problem8.SplitArray splitArray0 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array3 = new int[] { (byte) 1, (byte) 10 };
        splitArray0.splitSwappingPartition(i_array3);
        int[] i_array11 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray0.splitSwappingRecursive(i_array11);
        com.github.pedrovgs.problem75.SelectionSort selectionSort13 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray14 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array17 = new int[] { (byte) 1, (byte) 10 };
        splitArray14.splitSwappingPartition(i_array17);
        selectionSort13.sort(i_array17);
        com.github.pedrovgs.problem76.InsertionSort insertionSort20 = new com.github.pedrovgs.problem76.InsertionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray21 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays22 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays23 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays22);
        com.github.pedrovgs.problem8.SplitArray splitArray24 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array27 = new int[] { (byte) 1, (byte) 10 };
        splitArray24.splitSwappingPartition(i_array27);
        int[] i_array35 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray24.splitSwappingRecursive(i_array35);
        com.github.pedrovgs.problem8.SplitArray splitArray37 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array40 = new int[] { (byte) 1, (byte) 10 };
        splitArray37.splitSwappingPartition(i_array40);
        int[] i_array48 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray37.splitSwappingRecursive(i_array48);
        int[] i_array50 = mergeSortedArrays22.merge(i_array35, i_array48);
        splitArray21.splitSwappingIterative(i_array48);
        insertionSort20.sort(i_array48);
        selectionSort13.sort(i_array48);
        com.github.pedrovgs.problem8.SplitArray splitArray54 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray55 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array58 = new int[] { (byte) 1, (byte) 10 };
        splitArray55.splitSwappingPartition(i_array58);
        splitArray54.splitSwappingRecursive(i_array58);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral61 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array62 = new int[][] {};
        int[] i_array63 = goThroughMatrixInSpiral61.go(i_array_array62);
        splitArray54.splitSwappingRecursive(i_array63);
        selectionSort13.sort(i_array63);
        splitArray0.splitSwappingPartition(i_array63);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array_array62);
        org.junit.Assert.assertNotNull(i_array63);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
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
        com.github.pedrovgs.binarytree.BinaryNode binaryNode40 = null;
        try {
            java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i41 = binaryTreeInOrder0.getRecursive(binaryNode40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("0", "");
        try {
            java.lang.String str6 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("/!ih/", "[");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(0);
        int i4 = factorial0.getIterative(270);
        try {
            int i6 = factorial0.getIterative((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 1);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.github.pedrovgs.problem11.IntToString intToString0 = new com.github.pedrovgs.problem11.IntToString();
        java.lang.String str2 = intToString0.transform((int) '#');
        java.lang.String str4 = intToString0.transform(10);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "35" + "'", str2.equals("35"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.lang.Integer[] i_array1 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i2 = new java.util.Stack<java.lang.Integer>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i2, i_array1);
        boolean b4 = stack_i2.empty();
        try {
            java.lang.Integer i7 = stack_i2.set((int) (byte) -1, (java.lang.Integer) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array1);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.github.pedrovgs.problem30.ScientificNotation scientificNotation0 = new com.github.pedrovgs.problem30.ScientificNotation();
        try {
            long long2 = scientificNotation0.calculate("/!ih/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange1 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange2 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "", combinationsOfChange1);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList3 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays4 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays4);
        java.lang.String str6 = listnode_mergeSortedArrays5.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode7 = reverseLinkedList3.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays5);
        boolean b8 = pair_comparable_str_combinationsOfChange2.equals((java.lang.Object) listNode7);
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian9 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i11 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d12 = avlTreeMedian9.find(binarynode_i11);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor13 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals14 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST15 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array17 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i18 = sortedArrayToBST15.transform(i_array17);
        boolean b19 = binarynode_i18.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST20 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array22 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i23 = sortedArrayToBST20.transform(i_array22);
        boolean b24 = binarynode_i23.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i25 = binarynode_i23.getRight();
        boolean b26 = binaryTreeEquals14.areEqualsIterative(binarynode_i18, binarynode_i23);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST27 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array29 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i30 = sortedArrayToBST27.transform(i_array29);
        boolean b31 = binarynode_i30.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST32 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array34 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i35 = sortedArrayToBST32.transform(i_array34);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode36 = lowestCommonAncestor13.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i23, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i30, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i35);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i37 = binarynode_i23.getLeft();
        double d38 = avlTreeMedian9.find(binarynode_i23);
        boolean b39 = pair_comparable_str_combinationsOfChange2.equals((java.lang.Object) d38);
        org.junit.Assert.assertNotNull(listNode7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(d12 == 10.0d);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(binarynode_i18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(binarynode_i23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(binarynode_i25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(binarynode_i30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(binarynode_i35);
        org.junit.Assert.assertNull(binaryNode36);
        org.junit.Assert.assertNull(binarynode_i37);
        org.junit.Assert.assertTrue(d38 == 100.0d);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        try {
            java.lang.Integer i2 = stack2_0.elementAt(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.github.pedrovgs.problem47.ReturnChange returnChange0 = new com.github.pedrovgs.problem47.ReturnChange();
        com.github.pedrovgs.problem39.MultiplyArrayElements multiplyArrayElements1 = new com.github.pedrovgs.problem39.MultiplyArrayElements();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral2 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array3 = new int[][] {};
        int[] i_array4 = goThroughMatrixInSpiral2.go(i_array_array3);
        int[] i_array5 = multiplyArrayElements1.multiply(i_array4);
        com.github.pedrovgs.problem80.QuickSort quickSort6 = new com.github.pedrovgs.problem80.QuickSort();
        com.github.pedrovgs.problem8.SplitArray splitArray7 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array10 = new int[] { (byte) 1, (byte) 10 };
        splitArray7.splitSwappingPartition(i_array10);
        com.github.pedrovgs.problem2.Vector vector12 = new com.github.pedrovgs.problem2.Vector(i_array10);
        quickSort6.sort(i_array10);
        int[] i_array14 = multiplyArrayElements1.multiply(i_array10);
        java.util.List<java.lang.Integer> list_i16 = returnChange0.calculate(i_array14, 3);
        org.junit.Assert.assertNotNull(i_array_array3);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(list_i16);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.github.pedrovgs.problem68.IsEven isEven0 = new com.github.pedrovgs.problem68.IsEven();
        boolean b2 = isEven0.check((int) (byte) 1);
        boolean b4 = isEven0.check(0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor0 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST1 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i4 = sortedArrayToBST1.transform(i_array3);
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
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian29 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals30 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem18.IsBST isBST31 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST32 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array34 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i35 = sortedArrayToBST32.transform(i_array34);
        boolean b36 = isBST31.checkRecursive(binarynode_i35);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST37 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array39 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i40 = sortedArrayToBST37.transform(i_array39);
        boolean b41 = binarynode_i40.hasRight();
        boolean b42 = binaryTreeEquals30.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i35, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i40);
        double d43 = avlTreeMedian29.find(binarynode_i35);
        try {
            com.github.pedrovgs.binarytree.BinaryNode binaryNode44 = lowestCommonAncestor0.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i4, binaryNode28, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(binarynode_i4);
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
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(binarynode_i35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(binarynode_i40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(d43 == 100.0d);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.github.pedrovgs.problem68.IsEven isEven0 = new com.github.pedrovgs.problem68.IsEven();
        boolean b2 = isEven0.check((int) (byte) 1);
        boolean b4 = isEven0.check((-97));
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
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
        com.github.pedrovgs.problem28.FindSums findSums36 = new com.github.pedrovgs.problem28.FindSums();
        com.github.pedrovgs.problem8.SplitArray splitArray37 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray38 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array41 = new int[] { (byte) 1, (byte) 10 };
        splitArray38.splitSwappingPartition(i_array41);
        splitArray37.splitSwappingRecursive(i_array41);
        java.util.List<com.github.pedrovgs.pair.Pair<java.lang.Integer, java.lang.Integer>> list_pair_i_i45 = findSums36.find(i_array41, 0);
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_46 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_46.push((int) (byte) 10);
        int i49 = stack1_46.getMin();
        int i50 = stack1_46.getMin();
        com.github.pedrovgs.problem75.SelectionSort selectionSort51 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray52 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array55 = new int[] { (byte) 1, (byte) 10 };
        splitArray52.splitSwappingPartition(i_array55);
        selectionSort51.sort(i_array55);
        int i58 = stack1_46.search((java.lang.Object) i_array55);
        java.util.List<com.github.pedrovgs.pair.Pair<java.lang.Integer, java.lang.Integer>> list_pair_i_i60 = findSums36.find(i_array55, (int) (byte) 1);
        splitArray0.splitSwappingRecursive(i_array55);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(list_pair_i_i45);
        org.junit.Assert.assertTrue(i49 == 10);
        org.junit.Assert.assertTrue(i50 == 10);
        org.junit.Assert.assertNotNull(i_array55);
        org.junit.Assert.assertTrue(i58 == (-1));
        org.junit.Assert.assertNotNull(list_pair_i_i60);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.github.pedrovgs.problem18.IsBST isBST0 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST1 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i4 = sortedArrayToBST1.transform(i_array3);
        boolean b5 = isBST0.checkRecursive(binarynode_i4);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i6 = null;
        try {
            boolean b7 = isBST0.checkIterative(binarynode_i6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(binarynode_i4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.github.pedrovgs.problem7.FibonacciNumbers fibonacciNumbers0 = new com.github.pedrovgs.problem7.FibonacciNumbers();
        try {
            long long2 = fibonacciNumbers0.getIterative((long) (-5200));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.github.pedrovgs.problem51.ReverseString reverseString0 = new com.github.pedrovgs.problem51.ReverseString();
        java.lang.String str2 = reverseString0.reverseRecursive("/hi!/");
        java.lang.String str4 = reverseString0.reverseIterative("hi!");
        java.lang.String str6 = reverseString0.reverseIterative("1");
        java.lang.String str8 = reverseString0.reverseRecursive("/");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/!ih/" + "'", str2.equals("/!ih/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "!ih" + "'", str4.equals("!ih"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/" + "'", str8.equals("/"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.github.pedrovgs.problem46.BinaryTreeSerialization binaryTreeSerialization0 = new com.github.pedrovgs.problem46.BinaryTreeSerialization();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST1 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i4 = sortedArrayToBST1.transform(i_array3);
        boolean b5 = binarynode_i4.hasRight();
        java.lang.Integer i6 = binarynode_i4.getData();
        java.lang.String str7 = binaryTreeSerialization0.serialize((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i4);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode8 = null;
        try {
            java.lang.String str9 = binaryTreeSerialization0.serialize(binaryNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(binarynode_i4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100 + "'", i6.equals(100));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "100##" + "'", str7.equals("100##"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.github.pedrovgs.problem20.MultiplicationWithoutMultiply multiplicationWithoutMultiply0 = new com.github.pedrovgs.problem20.MultiplicationWithoutMultiply();
        int i3 = multiplicationWithoutMultiply0.calculate((-52), (int) (byte) 100);
        int i6 = multiplicationWithoutMultiply0.calculate((-5200), 10);
        org.junit.Assert.assertTrue(i3 == (-5200));
        org.junit.Assert.assertTrue(i6 == (-52000));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers0 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        int i5 = mergeBinaryNumbers0.merge((int) (byte) 10, (-52000), 2147483647, (-52));
        org.junit.Assert.assertTrue(i5 == 10);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideIterative((int) (byte) 10, (int) (byte) 100);
        float f6 = divideUsingSubtraction0.divideIterative((int) (byte) 100, (int) 'a');
        try {
            float f9 = divideUsingSubtraction0.divideIterative(7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(f3 == 0.1f);
        org.junit.Assert.assertTrue(f6 == 1.0309278f);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
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
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(listNode12);
        org.junit.Assert.assertNotNull(listNode19);
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
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
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates20 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST21 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array23 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i24 = sortedArrayToBST21.transform(i_array23);
        java.lang.Integer[] i_array25 = removeDuplicates20.removeUsingSorting(i_array23);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates26 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST27 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array29 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i30 = sortedArrayToBST27.transform(i_array29);
        java.lang.Integer[] i_array31 = removeDuplicates26.removeUsingSorting(i_array29);
        java.lang.Integer[] i_array32 = removeDuplicates20.removeUsingSorting(i_array29);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i33 = sortedArrayToBST15.transform(i_array29);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(stream_i14);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(binarynode_i18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(binarynode_i24);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(binarynode_i30);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(binarynode_i33);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
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
        try {
            java.util.List<java.lang.Integer> list_i20 = stack2_0.subList(28, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("0", "");
        try {
            java.lang.String str6 = sumBinaryNumbers0.sumBinaryNumbersCheating("/hi!", "[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.github.pedrovgs.problem28.FindSums findSums0 = new com.github.pedrovgs.problem28.FindSums();
        com.github.pedrovgs.problem8.SplitArray splitArray1 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray2 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array5 = new int[] { (byte) 1, (byte) 10 };
        splitArray2.splitSwappingPartition(i_array5);
        splitArray1.splitSwappingRecursive(i_array5);
        java.util.List<com.github.pedrovgs.pair.Pair<java.lang.Integer, java.lang.Integer>> list_pair_i_i9 = findSums0.find(i_array5, 0);
        int[] i_array11 = new int[] { 7 };
        java.util.List<com.github.pedrovgs.pair.Pair<java.lang.Integer, java.lang.Integer>> list_pair_i_i13 = findSums0.findLinearComplexityOrder(i_array11, 2147483647);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(list_pair_i_i9);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(list_pair_i_i13);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange1 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange2 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "97", combinationsOfChange1);
        int[] i_array3 = null;
        try {
            java.util.List<java.util.List<java.lang.Integer>> list_list_i5 = combinationsOfChange1.get(i_array3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.github.pedrovgs.problem50.UniqueChars uniqueChars0 = new com.github.pedrovgs.problem50.UniqueChars();
        boolean b2 = uniqueChars0.evaluate2("/hi!/");
        boolean b4 = uniqueChars0.evaluate2("35");
        boolean b6 = uniqueChars0.evaluate2("");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.github.pedrovgs.problem73.SubtractAdding subtractAdding0 = new com.github.pedrovgs.problem73.SubtractAdding();
        int i3 = subtractAdding0.subtract(0, 6);
        org.junit.Assert.assertTrue(i3 == (-6));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral0 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array1 = new int[][] {};
        int[] i_array2 = goThroughMatrixInSpiral0.go(i_array_array1);
        int[] i_array9 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[] i_array16 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[][] i_array_array17 = new int[][] { i_array9, i_array16 };
        int[] i_array18 = goThroughMatrixInSpiral0.go(i_array_array17);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral19 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array20 = new int[][] {};
        int[] i_array21 = goThroughMatrixInSpiral19.go(i_array_array20);
        int[] i_array28 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[] i_array35 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[][] i_array_array36 = new int[][] { i_array28, i_array35 };
        int[] i_array37 = goThroughMatrixInSpiral19.go(i_array_array36);
        int[] i_array38 = goThroughMatrixInSpiral0.go(i_array_array36);
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros39 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral40 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array41 = new int[][] {};
        int[] i_array42 = goThroughMatrixInSpiral40.go(i_array_array41);
        int[] i_array45 = new int[] { 107, 3628800 };
        int[][] i_array_array46 = new int[][] { i_array45 };
        int[] i_array47 = goThroughMatrixInSpiral40.go(i_array_array46);
        rewriteRowAndColumnsWithZeros39.rewrite(i_array_array46);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral49 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array50 = new int[][] {};
        int[] i_array51 = goThroughMatrixInSpiral49.go(i_array_array50);
        rewriteRowAndColumnsWithZeros39.rewrite(i_array_array50);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral53 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array54 = new int[][] {};
        int[] i_array55 = goThroughMatrixInSpiral53.go(i_array_array54);
        int[] i_array62 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[] i_array69 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[][] i_array_array70 = new int[][] { i_array62, i_array69 };
        int[] i_array71 = goThroughMatrixInSpiral53.go(i_array_array70);
        rewriteRowAndColumnsWithZeros39.rewrite(i_array_array70);
        int[] i_array73 = goThroughMatrixInSpiral0.go(i_array_array70);
        org.junit.Assert.assertNotNull(i_array_array1);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertNotNull(i_array_array20);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array_array41);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array_array54);
        org.junit.Assert.assertNotNull(i_array55);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array69);
        org.junit.Assert.assertNotNull(i_array_array70);
        org.junit.Assert.assertNotNull(i_array71);
        org.junit.Assert.assertNotNull(i_array73);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.github.pedrovgs.problem65.IsTreeBalanced isTreeBalanced0 = new com.github.pedrovgs.problem65.IsTreeBalanced();
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
        boolean b81 = isTreeBalanced0.check((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i62);
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
        org.junit.Assert.assertTrue(b81 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.github.pedrovgs.problem79.MergeSort mergeSort0 = new com.github.pedrovgs.problem79.MergeSort();
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
        com.github.pedrovgs.problem75.SelectionSort selectionSort32 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray33 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array36 = new int[] { (byte) 1, (byte) 10 };
        splitArray33.splitSwappingPartition(i_array36);
        selectionSort32.sort(i_array36);
        com.github.pedrovgs.problem76.InsertionSort insertionSort39 = new com.github.pedrovgs.problem76.InsertionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray40 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays41 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays42 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays41);
        com.github.pedrovgs.problem8.SplitArray splitArray43 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array46 = new int[] { (byte) 1, (byte) 10 };
        splitArray43.splitSwappingPartition(i_array46);
        int[] i_array54 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray43.splitSwappingRecursive(i_array54);
        com.github.pedrovgs.problem8.SplitArray splitArray56 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array59 = new int[] { (byte) 1, (byte) 10 };
        splitArray56.splitSwappingPartition(i_array59);
        int[] i_array67 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray56.splitSwappingRecursive(i_array67);
        int[] i_array69 = mergeSortedArrays41.merge(i_array54, i_array67);
        splitArray40.splitSwappingIterative(i_array67);
        insertionSort39.sort(i_array67);
        selectionSort32.sort(i_array67);
        com.github.pedrovgs.problem8.SplitArray splitArray73 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray74 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array77 = new int[] { (byte) 1, (byte) 10 };
        splitArray74.splitSwappingPartition(i_array77);
        splitArray73.splitSwappingRecursive(i_array77);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral80 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array81 = new int[][] {};
        int[] i_array82 = goThroughMatrixInSpiral80.go(i_array_array81);
        splitArray73.splitSwappingRecursive(i_array82);
        selectionSort32.sort(i_array82);
        splitArray1.splitSwappingPartition(i_array82);
        mergeSort0.sort(i_array82);
        org.junit.Assert.assertNotNull(i_array7);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(i_array59);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(i_array69);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(i_array_array81);
        org.junit.Assert.assertNotNull(i_array82);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
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
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers25 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b26 = listnode_mergeSortedArrays24.equals((java.lang.Object) mergeBinaryNumbers25);
        com.github.pedrovgs.linkedlist.ListNode listNode27 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays24);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays28 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays29 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays28);
        java.lang.String str30 = listnode_mergeSortedArrays29.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays31 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays32 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays31);
        java.lang.String str33 = listnode_mergeSortedArrays32.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays34 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays32.setData(mergeSortedArrays34);
        listnode_mergeSortedArrays29.setNext(listnode_mergeSortedArrays32);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays37 = listnode_mergeSortedArrays29.getNext();
        com.github.pedrovgs.problem62.PalindromeList palindromeList38 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList39 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays40 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays41 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays40);
        java.lang.String str42 = listnode_mergeSortedArrays41.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i43 = reverseLinkedList39.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays41);
        boolean b44 = palindromeList38.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays41);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays45 = listnode_mergeSortedArrays41.getNext();
        listnode_mergeSortedArrays37.setNext(listnode_mergeSortedArrays41);
        com.github.pedrovgs.linkedlist.ListNode listNode47 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays41);
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode49 = findKthElement0.find3(listNode47, 3628800);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(listNode11);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(listnode_i22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(listNode27);
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays37);
        org.junit.Assert.assertNotNull(listnode_i43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays45);
        org.junit.Assert.assertNotNull(listNode47);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.github.pedrovgs.problem54.RotateMatrix rotateMatrix0 = new com.github.pedrovgs.problem54.RotateMatrix();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral1 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array2 = new int[][] {};
        int[] i_array3 = goThroughMatrixInSpiral1.go(i_array_array2);
        int[] i_array10 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[] i_array17 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[][] i_array_array18 = new int[][] { i_array10, i_array17 };
        int[] i_array19 = goThroughMatrixInSpiral1.go(i_array_array18);
        try {
            rotateMatrix0.rotate(i_array_array18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array_array2);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array_array18);
        org.junit.Assert.assertNotNull(i_array19);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        try {
            java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersCheating("[null]", "BinaryNode{data=100}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.github.pedrovgs.problem53.CompressString compressString0 = new com.github.pedrovgs.problem53.CompressString();
        java.lang.String str2 = compressString0.compressRecursive("/");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/" + "'", str2.equals("/"));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.github.pedrovgs.problem39.MultiplyArrayElements multiplyArrayElements0 = new com.github.pedrovgs.problem39.MultiplyArrayElements();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral1 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array2 = new int[][] {};
        int[] i_array3 = goThroughMatrixInSpiral1.go(i_array_array2);
        int[] i_array4 = multiplyArrayElements0.multiply(i_array3);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral5 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array6 = new int[][] {};
        int[] i_array7 = goThroughMatrixInSpiral5.go(i_array_array6);
        int[] i_array10 = new int[] { 107, 3628800 };
        int[][] i_array_array11 = new int[][] { i_array10 };
        int[] i_array12 = goThroughMatrixInSpiral5.go(i_array_array11);
        int[] i_array13 = multiplyArrayElements0.multiply(i_array12);
        org.junit.Assert.assertNotNull(i_array_array2);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(i_array7);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array13);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
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
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>> listnode_listnode_mergeSortedArrays22 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>>(listnode_mergeSortedArrays17);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays3);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(listNode10);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(listnode_i21);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push(100);
        boolean b3 = stack2_0.empty();
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.github.pedrovgs.problem42.FloodFill floodFill0 = new com.github.pedrovgs.problem42.FloodFill();
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
        floodFill0.apply(i_array_array27, 27, 0, 0, (int) ' ');
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros39 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral40 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array41 = new int[][] {};
        int[] i_array42 = goThroughMatrixInSpiral40.go(i_array_array41);
        int[] i_array45 = new int[] { 107, 3628800 };
        int[][] i_array_array46 = new int[][] { i_array45 };
        int[] i_array47 = goThroughMatrixInSpiral40.go(i_array_array46);
        rewriteRowAndColumnsWithZeros39.rewrite(i_array_array46);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral49 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array50 = new int[][] {};
        int[] i_array51 = goThroughMatrixInSpiral49.go(i_array_array50);
        int[] i_array54 = new int[] { 107, 3628800 };
        int[][] i_array_array55 = new int[][] { i_array54 };
        int[] i_array56 = goThroughMatrixInSpiral49.go(i_array_array55);
        rewriteRowAndColumnsWithZeros39.rewrite(i_array_array55);
        try {
            floodFill0.apply(i_array_array55, (int) (byte) -1, 0, (int) (short) 100, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array_array3);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array_array41);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(i_array_array55);
        org.junit.Assert.assertNotNull(i_array56);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList1 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements2 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList3 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays4 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays4);
        java.lang.String str6 = listnode_mergeSortedArrays5.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode7 = reverseLinkedList3.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays5);
        removeListDuplicatedElements2.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode7);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i9 = getTheElementInTheMiddleOfTheList1.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode7);
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode11 = findKthElement0.find2((com.github.pedrovgs.linkedlist.ListNode) listnode_i9, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(listNode7);
        org.junit.Assert.assertNotNull(listnode_i9);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
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
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i1 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) (-1241513984));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST0 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i3 = sortedArrayToBST0.transform(i_array2);
        java.lang.String str4 = binarynode_i3.toString();
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_5 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_5.push((int) (byte) 10);
        int i8 = stack1_5.getMin();
        boolean b9 = binarynode_i3.equals((java.lang.Object) stack1_5);
        java.lang.Integer i10 = binarynode_i3.getData();
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(binarynode_i3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "BinaryNode{data=100}" + "'", str4.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100 + "'", i10.equals(100));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST0 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i3 = sortedArrayToBST0.transform(i_array2);
        java.lang.String str4 = binarynode_i3.toString();
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_5 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_5.push((int) (byte) 10);
        int i8 = stack1_5.getMin();
        boolean b9 = binarynode_i3.equals((java.lang.Object) stack1_5);
        java.lang.String str10 = binarynode_i3.toString();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i11 = binarynode_i3.getLeft();
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(binarynode_i3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "BinaryNode{data=100}" + "'", str4.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "BinaryNode{data=100}" + "'", str10.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertNull(binarynode_i11);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
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
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST78 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array80 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i81 = sortedArrayToBST78.transform(i_array80);
        boolean b82 = binarynode_i81.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i83 = binarynode_i81.getRight();
        java.lang.Integer i84 = binarynode_i81.getData();
        binarynode_i62.setLeft(binarynode_i81);
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian86 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i88 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d89 = avlTreeMedian86.find(binarynode_i88);
        com.github.pedrovgs.problem38.PathToEveryLeaf pathToEveryLeaf90 = new com.github.pedrovgs.problem38.PathToEveryLeaf();
        com.github.pedrovgs.binarytree.BinaryNode<com.github.pedrovgs.problem38.PathToEveryLeaf> binarynode_pathToEveryLeaf91 = new com.github.pedrovgs.binarytree.BinaryNode<com.github.pedrovgs.problem38.PathToEveryLeaf>(pathToEveryLeaf90);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode92 = lowestCommonAncestor24.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i62, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i88, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_pathToEveryLeaf91);
        binarynode_i17.setRight((com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>) binaryNode92);
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
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(binarynode_i29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(binarynode_i34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(binarynode_i36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(binarynode_i41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(binarynode_i46);
        org.junit.Assert.assertNull(binaryNode47);
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
        org.junit.Assert.assertNotNull(i_array80);
        org.junit.Assert.assertNotNull(binarynode_i81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNull(binarynode_i83);
        org.junit.Assert.assertTrue("'" + i84 + "' != '" + 100 + "'", i84.equals(100));
        org.junit.Assert.assertTrue(d89 == 10.0d);
        org.junit.Assert.assertNull(binaryNode92);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.github.pedrovgs.problem65.IsTreeBalanced isTreeBalanced0 = new com.github.pedrovgs.problem65.IsTreeBalanced();
        com.github.pedrovgs.problem75.SelectionSort selectionSort1 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem65.IsTreeBalanced, com.github.pedrovgs.problem75.SelectionSort> pair_isTreeBalanced_selectionSort2 = new com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem65.IsTreeBalanced, com.github.pedrovgs.problem75.SelectionSort>(isTreeBalanced0, selectionSort1);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
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
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements51 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList52 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays53 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays54 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays53);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays55 = listnode_mergeSortedArrays54.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays56 = listnode_mergeSortedArrays54.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i58 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i59 = null;
        binarynode_i58.setRight(binarynode_i59);
        boolean b61 = listnode_mergeSortedArrays54.equals((java.lang.Object) binarynode_i59);
        com.github.pedrovgs.linkedlist.ListNode listNode62 = reverseLinkedList52.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays54);
        removeListDuplicatedElements51.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode62);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements> listnode_removeListDuplicatedElements64 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements>(removeListDuplicatedElements51);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList65 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements66 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList67 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays68 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays69 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays68);
        java.lang.String str70 = listnode_mergeSortedArrays69.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode71 = reverseLinkedList67.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays69);
        removeListDuplicatedElements66.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode71);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i73 = getTheElementInTheMiddleOfTheList65.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode71);
        removeListDuplicatedElements51.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode71);
        boolean b75 = listnode_mergeSortedArrays23.equals((java.lang.Object) listNode71);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays76 = listnode_mergeSortedArrays23.getData();
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
        org.junit.Assert.assertNull(listnode_mergeSortedArrays55);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays56);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(listNode62);
        org.junit.Assert.assertNotNull(listNode71);
        org.junit.Assert.assertNotNull(listnode_i73);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(mergeSortedArrays76);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.lang.Integer[] i_array1 = new java.lang.Integer[] { (-52) };
        java.util.Vector<java.lang.Integer> vector_i2 = new java.util.Vector<java.lang.Integer>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i2, i_array1);
        try {
            java.lang.Integer i5 = vector_i2.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array1);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
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
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates0 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST1 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i4 = sortedArrayToBST1.transform(i_array3);
        java.lang.Integer[] i_array5 = removeDuplicates0.removeUsingSorting(i_array3);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST6 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array8 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i9 = sortedArrayToBST6.transform(i_array8);
        java.lang.Integer[] i_array10 = removeDuplicates0.removeUsingSorting(i_array8);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates11 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates12 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST13 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array15 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i16 = sortedArrayToBST13.transform(i_array15);
        java.lang.Integer[] i_array17 = removeDuplicates12.removeUsingSorting(i_array15);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST18 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array20 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i21 = sortedArrayToBST18.transform(i_array20);
        java.lang.Integer[] i_array22 = removeDuplicates12.removeUsingSorting(i_array20);
        java.lang.Integer[] i_array23 = removeDuplicates11.removeUsingSorting(i_array20);
        java.lang.Integer[] i_array24 = removeDuplicates0.removeUsingSet(i_array23);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(binarynode_i4);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(binarynode_i9);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(binarynode_i16);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(binarynode_i21);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array24);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        com.github.pedrovgs.problem8.SplitArray splitArray9 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array12 = new int[] { (byte) 1, (byte) 10 };
        splitArray9.splitSwappingPartition(i_array12);
        int[] i_array20 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray9.splitSwappingRecursive(i_array20);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays22 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort23 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray24 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array27 = new int[] { (byte) 1, (byte) 10 };
        splitArray24.splitSwappingPartition(i_array27);
        selectionSort23.sort(i_array27);
        com.github.pedrovgs.problem8.SplitArray splitArray30 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array33 = new int[] { (byte) 1, (byte) 10 };
        splitArray30.splitSwappingPartition(i_array33);
        int[] i_array41 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray30.splitSwappingRecursive(i_array41);
        int[] i_array43 = mergeSortedArrays22.merge(i_array27, i_array41);
        splitArray9.splitSwappingIterative(i_array27);
        com.github.pedrovgs.problem75.SelectionSort selectionSort45 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray46 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array49 = new int[] { (byte) 1, (byte) 10 };
        splitArray46.splitSwappingPartition(i_array49);
        selectionSort45.sort(i_array49);
        com.github.pedrovgs.problem76.InsertionSort insertionSort52 = new com.github.pedrovgs.problem76.InsertionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray53 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays54 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays55 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays54);
        com.github.pedrovgs.problem8.SplitArray splitArray56 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array59 = new int[] { (byte) 1, (byte) 10 };
        splitArray56.splitSwappingPartition(i_array59);
        int[] i_array67 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray56.splitSwappingRecursive(i_array67);
        com.github.pedrovgs.problem8.SplitArray splitArray69 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array72 = new int[] { (byte) 1, (byte) 10 };
        splitArray69.splitSwappingPartition(i_array72);
        int[] i_array80 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray69.splitSwappingRecursive(i_array80);
        int[] i_array82 = mergeSortedArrays54.merge(i_array67, i_array80);
        splitArray53.splitSwappingIterative(i_array80);
        insertionSort52.sort(i_array80);
        selectionSort45.sort(i_array80);
        com.github.pedrovgs.problem8.SplitArray splitArray86 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray87 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array90 = new int[] { (byte) 1, (byte) 10 };
        splitArray87.splitSwappingPartition(i_array90);
        splitArray86.splitSwappingRecursive(i_array90);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral93 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array94 = new int[][] {};
        int[] i_array95 = goThroughMatrixInSpiral93.go(i_array_array94);
        splitArray86.splitSwappingRecursive(i_array95);
        selectionSort45.sort(i_array95);
        splitArray9.splitSwappingIterative(i_array95);
        int i99 = vector_i4.lastIndexOf((java.lang.Object) i_array95);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array59);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(i_array72);
        org.junit.Assert.assertNotNull(i_array80);
        org.junit.Assert.assertNotNull(i_array82);
        org.junit.Assert.assertNotNull(i_array90);
        org.junit.Assert.assertNotNull(i_array_array94);
        org.junit.Assert.assertNotNull(i_array95);
        org.junit.Assert.assertTrue(i99 == (-1));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.github.pedrovgs.problem12.MoveZerosInArray moveZerosInArray0 = new com.github.pedrovgs.problem12.MoveZerosInArray();
        com.github.pedrovgs.problem8.SplitArray splitArray1 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray2 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array5 = new int[] { (byte) 1, (byte) 10 };
        splitArray2.splitSwappingPartition(i_array5);
        splitArray1.splitSwappingRecursive(i_array5);
        moveZerosInArray0.moveSorting(i_array5);
        org.junit.Assert.assertNotNull(i_array5);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.github.pedrovgs.problem53.CompressString compressString0 = new com.github.pedrovgs.problem53.CompressString();
        java.lang.String str2 = compressString0.compressRecursive("97");
        java.lang.String str4 = compressString0.compressAlternativeApproach("hi!");
        java.lang.String str6 = compressString0.compress("[]");
        java.lang.String str8 = compressString0.compress("/hi!/");
        java.lang.String str10 = compressString0.compressAlternativeApproach("[]");
        java.lang.String str12 = compressString0.compress("/!ih/");
        java.lang.String str14 = compressString0.compressAlternativeApproach("[null]");
        java.lang.String str16 = compressString0.compress("79");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97" + "'", str2.equals("97"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/hi!" + "'", str8.equals("/hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "/!ih" + "'", str12.equals("/!ih"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[nul2]" + "'", str14.equals("[nul2]"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "7" + "'", str16.equals("7"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
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
            int i16 = findNthMostRepeatedElement12.find(i_array14, 10);
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
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
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
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder19 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian20 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i22 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d23 = avlTreeMedian20.find(binarynode_i22);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode24 = binaryTreePreOrder19.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i22);
        com.github.pedrovgs.problem18.IsBST isBST25 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST26 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array28 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i29 = sortedArrayToBST26.transform(i_array28);
        boolean b30 = isBST25.checkRecursive(binarynode_i29);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode31 = binaryTreePreOrder19.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i29);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals32 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem18.IsBST isBST33 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST34 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array36 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i37 = sortedArrayToBST34.transform(i_array36);
        boolean b38 = isBST33.checkRecursive(binarynode_i37);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST39 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array41 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i42 = sortedArrayToBST39.transform(i_array41);
        boolean b43 = binarynode_i42.hasRight();
        boolean b44 = binaryTreeEquals32.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i37, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i42);
        com.github.pedrovgs.problem18.IsBST isBST45 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST46 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array48 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i49 = sortedArrayToBST46.transform(i_array48);
        boolean b50 = isBST45.checkRecursive(binarynode_i49);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals51 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST52 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array54 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i55 = sortedArrayToBST52.transform(i_array54);
        boolean b56 = binarynode_i55.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST57 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array59 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i60 = sortedArrayToBST57.transform(i_array59);
        boolean b61 = binarynode_i60.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i62 = binarynode_i60.getRight();
        boolean b63 = binaryTreeEquals51.areEqualsIterative(binarynode_i55, binarynode_i60);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i64 = binarynode_i55.getLeft();
        boolean b65 = isBST45.checkIterative(binarynode_i55);
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian66 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i68 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d69 = avlTreeMedian66.find(binarynode_i68);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor70 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals71 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST72 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array74 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i75 = sortedArrayToBST72.transform(i_array74);
        boolean b76 = binarynode_i75.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST77 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array79 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i80 = sortedArrayToBST77.transform(i_array79);
        boolean b81 = binarynode_i80.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i82 = binarynode_i80.getRight();
        boolean b83 = binaryTreeEquals71.areEqualsIterative(binarynode_i75, binarynode_i80);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST84 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array86 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i87 = sortedArrayToBST84.transform(i_array86);
        boolean b88 = binarynode_i87.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST89 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array91 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i92 = sortedArrayToBST89.transform(i_array91);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode93 = lowestCommonAncestor70.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i80, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i87, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i92);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i94 = binarynode_i80.getLeft();
        double d95 = avlTreeMedian66.find(binarynode_i80);
        boolean b96 = isBST45.checkRecursive(binarynode_i80);
        binarynode_i37.setRight(binarynode_i80);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode98 = binaryTreePreOrder19.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i80);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i99 = binaryTreeInOrder0.getIterative(binarynode_i80);
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
        org.junit.Assert.assertTrue(d23 == 10.0d);
        org.junit.Assert.assertNotNull(list_binaryNode24);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(binarynode_i29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(list_binaryNode31);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(binarynode_i37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(binarynode_i42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(binarynode_i49);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(binarynode_i55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(i_array59);
        org.junit.Assert.assertNotNull(binarynode_i60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(binarynode_i62);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNull(binarynode_i64);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(d69 == 10.0d);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertNotNull(binarynode_i75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(i_array79);
        org.junit.Assert.assertNotNull(binarynode_i80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNull(binarynode_i82);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(i_array86);
        org.junit.Assert.assertNotNull(binarynode_i87);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(i_array91);
        org.junit.Assert.assertNotNull(binarynode_i92);
        org.junit.Assert.assertNull(binaryNode93);
        org.junit.Assert.assertNull(binarynode_i94);
        org.junit.Assert.assertTrue(d95 == 100.0d);
        org.junit.Assert.assertTrue(b96 == true);
        org.junit.Assert.assertNotNull(list_binaryNode98);
        org.junit.Assert.assertNotNull(list_binarynode_i99);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.github.pedrovgs.problem35.AsteriskRegularExpression asteriskRegularExpression0 = new com.github.pedrovgs.problem35.AsteriskRegularExpression();
        com.github.pedrovgs.problem34.DotRegularExpression dotRegularExpression1 = new com.github.pedrovgs.problem34.DotRegularExpression();
        java.lang.String[] str_array4 = new java.lang.String[] { "hi!", "/hi!/" };
        java.lang.String[] str_array6 = dotRegularExpression1.evaluate(str_array4, "1");
        java.lang.String[] str_array8 = asteriskRegularExpression0.evaluate(str_array4, "[null]");
        com.github.pedrovgs.problem34.DotRegularExpression dotRegularExpression9 = new com.github.pedrovgs.problem34.DotRegularExpression();
        java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "/hi!/" };
        java.lang.String[] str_array14 = dotRegularExpression9.evaluate(str_array12, "1");
        java.lang.String[] str_array16 = asteriskRegularExpression0.evaluate(str_array12, "[nul2]");
        org.junit.Assert.assertNotNull(str_array4);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertNotNull(str_array12);
        org.junit.Assert.assertNotNull(str_array14);
        org.junit.Assert.assertNotNull(str_array16);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.github.pedrovgs.problem70.ReverseOrderOfBinaryNumber reverseOrderOfBinaryNumber0 = new com.github.pedrovgs.problem70.ReverseOrderOfBinaryNumber();
        int i2 = reverseOrderOfBinaryNumber0.reverse(10);
        org.junit.Assert.assertTrue(i2 == 5);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.github.pedrovgs.problem61.SumLists sumLists0 = new com.github.pedrovgs.problem61.SumLists();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i5 = reverseLinkedList1.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList6 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays7 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays8 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays7);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays9 = listnode_mergeSortedArrays8.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays10 = listnode_mergeSortedArrays8.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i12 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i13 = null;
        binarynode_i12.setRight(binarynode_i13);
        boolean b15 = listnode_mergeSortedArrays8.equals((java.lang.Object) binarynode_i13);
        com.github.pedrovgs.linkedlist.ListNode listNode16 = reverseLinkedList6.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays8);
        com.github.pedrovgs.linkedlist.ListNode listNode17 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays8);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList18 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements19 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList20 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays21 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays22 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays21);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays23 = listnode_mergeSortedArrays22.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays24 = listnode_mergeSortedArrays22.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i26 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i27 = null;
        binarynode_i26.setRight(binarynode_i27);
        boolean b29 = listnode_mergeSortedArrays22.equals((java.lang.Object) binarynode_i27);
        com.github.pedrovgs.linkedlist.ListNode listNode30 = reverseLinkedList20.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays22);
        removeListDuplicatedElements19.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode30);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements32 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList33 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays34 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays35 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays34);
        java.lang.String str36 = listnode_mergeSortedArrays35.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode37 = reverseLinkedList33.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays35);
        removeListDuplicatedElements32.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode37);
        removeListDuplicatedElements19.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode37);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements40 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList41 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays42 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays43 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays42);
        java.lang.String str44 = listnode_mergeSortedArrays43.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode45 = reverseLinkedList41.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays43);
        removeListDuplicatedElements40.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode45);
        removeListDuplicatedElements19.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode45);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i48 = getTheElementInTheMiddleOfTheList18.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode45);
        try {
            int i49 = sumLists0.sum((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode17, listnode_i48);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(listnode_i5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays9);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays10);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(listNode16);
        org.junit.Assert.assertNotNull(listNode17);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays23);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays24);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(listNode30);
        org.junit.Assert.assertNotNull(listNode37);
        org.junit.Assert.assertNotNull(listNode45);
        org.junit.Assert.assertNotNull(listnode_i48);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.github.pedrovgs.problem61.SumLists sumLists0 = new com.github.pedrovgs.problem61.SumLists();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i1 = null;
        com.github.pedrovgs.problem62.PalindromeList palindromeList2 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList3 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays4 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays4);
        java.lang.String str6 = listnode_mergeSortedArrays5.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i7 = reverseLinkedList3.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays5);
        boolean b8 = palindromeList2.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays5);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays9 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays10 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays9);
        java.lang.String str11 = listnode_mergeSortedArrays10.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays12 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays13 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays12);
        java.lang.String str14 = listnode_mergeSortedArrays13.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays15 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays13.setData(mergeSortedArrays15);
        listnode_mergeSortedArrays10.setNext(listnode_mergeSortedArrays13);
        boolean b18 = palindromeList2.checkReversing((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays10);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode19 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays20 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays21 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays20);
        java.lang.String str22 = listnode_mergeSortedArrays21.toString();
        deleteListNode19.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays21);
        boolean b24 = palindromeList2.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays21);
        com.github.pedrovgs.problem62.PalindromeList palindromeList25 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList26 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays27 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays28 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays27);
        java.lang.String str29 = listnode_mergeSortedArrays28.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i30 = reverseLinkedList26.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays28);
        boolean b31 = palindromeList25.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays28);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays32 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays33 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays32);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays34 = listnode_mergeSortedArrays33.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays35 = listnode_mergeSortedArrays33.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i37 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i38 = null;
        binarynode_i37.setRight(binarynode_i38);
        boolean b40 = listnode_mergeSortedArrays33.equals((java.lang.Object) binarynode_i38);
        listnode_mergeSortedArrays28.setNext(listnode_mergeSortedArrays33);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays42 = listnode_mergeSortedArrays33.getData();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements43 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList44 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays45 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays46 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays45);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays47 = listnode_mergeSortedArrays46.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays48 = listnode_mergeSortedArrays46.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i50 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i51 = null;
        binarynode_i50.setRight(binarynode_i51);
        boolean b53 = listnode_mergeSortedArrays46.equals((java.lang.Object) binarynode_i51);
        com.github.pedrovgs.linkedlist.ListNode listNode54 = reverseLinkedList44.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays46);
        removeListDuplicatedElements43.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode54);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements> listnode_removeListDuplicatedElements56 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements>(removeListDuplicatedElements43);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList57 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements58 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList59 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays60 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays61 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays60);
        java.lang.String str62 = listnode_mergeSortedArrays61.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode63 = reverseLinkedList59.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays61);
        removeListDuplicatedElements58.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode63);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i65 = getTheElementInTheMiddleOfTheList57.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode63);
        removeListDuplicatedElements43.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode63);
        listnode_mergeSortedArrays33.setNext((com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>) listNode63);
        boolean b68 = palindromeList2.checkReversing(listNode63);
        try {
            int i69 = sumLists0.sumReverse(listnode_i1, (com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(listnode_i7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(listnode_i30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays34);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays35);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(mergeSortedArrays42);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays47);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays48);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(listNode54);
        org.junit.Assert.assertNotNull(listNode63);
        org.junit.Assert.assertNotNull(listnode_i65);
        org.junit.Assert.assertTrue(b68 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        com.github.pedrovgs.problem65.IsTreeBalanced isTreeBalanced10 = new com.github.pedrovgs.problem65.IsTreeBalanced();
        int i11 = vector_i5.lastIndexOf((java.lang.Object) isTreeBalanced10);
        java.util.Iterator<java.lang.Integer> iterator_i12 = vector_i5.iterator();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(iterator_i12);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        java.lang.Integer i12 = vector_i4.firstElement();
        vector_i4.setSize(10);
        try {
            java.lang.Integer i17 = vector_i4.set((int) (byte) -1, (java.lang.Integer) (-52000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0 + "'", i12.equals(0));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.github.pedrovgs.problem37.PathCalculator pathCalculator0 = new com.github.pedrovgs.problem37.PathCalculator();
        java.lang.String str4 = pathCalculator0.calculate("", "/", "hi!");
        java.lang.String str8 = pathCalculator0.calculate("100##", "[", "32");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "/hi!/" + "'", str4.equals("/hi!/"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/100##/[/32/" + "'", str8.equals("/100##/[/32/"));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push((-1));
        java.lang.Integer i3 = stack2_0.peek();
        stack2_0.push((int) (short) 1);
        try {
            java.lang.Integer i7 = stack2_0.elementAt((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + i3 + "' != '" + (-1) + "'", i3.equals((-1)));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral0 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array1 = new int[][] {};
        int[] i_array2 = goThroughMatrixInSpiral0.go(i_array_array1);
        int[] i_array5 = new int[] { 107, 3628800 };
        int[][] i_array_array6 = new int[][] { i_array5 };
        int[] i_array7 = goThroughMatrixInSpiral0.go(i_array_array6);
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros8 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral9 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array10 = new int[][] {};
        int[] i_array11 = goThroughMatrixInSpiral9.go(i_array_array10);
        int[] i_array14 = new int[] { 107, 3628800 };
        int[][] i_array_array15 = new int[][] { i_array14 };
        int[] i_array16 = goThroughMatrixInSpiral9.go(i_array_array15);
        rewriteRowAndColumnsWithZeros8.rewrite(i_array_array15);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral18 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array19 = new int[][] {};
        int[] i_array20 = goThroughMatrixInSpiral18.go(i_array_array19);
        rewriteRowAndColumnsWithZeros8.rewrite(i_array_array19);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral22 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array23 = new int[][] {};
        int[] i_array24 = goThroughMatrixInSpiral22.go(i_array_array23);
        int[] i_array31 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[] i_array38 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[][] i_array_array39 = new int[][] { i_array31, i_array38 };
        int[] i_array40 = goThroughMatrixInSpiral22.go(i_array_array39);
        rewriteRowAndColumnsWithZeros8.rewrite(i_array_array39);
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros42 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral43 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array44 = new int[][] {};
        int[] i_array45 = goThroughMatrixInSpiral43.go(i_array_array44);
        int[] i_array48 = new int[] { 107, 3628800 };
        int[][] i_array_array49 = new int[][] { i_array48 };
        int[] i_array50 = goThroughMatrixInSpiral43.go(i_array_array49);
        rewriteRowAndColumnsWithZeros42.rewrite(i_array_array49);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral52 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array53 = new int[][] {};
        int[] i_array54 = goThroughMatrixInSpiral52.go(i_array_array53);
        int[] i_array57 = new int[] { 107, 3628800 };
        int[][] i_array_array58 = new int[][] { i_array57 };
        int[] i_array59 = goThroughMatrixInSpiral52.go(i_array_array58);
        rewriteRowAndColumnsWithZeros42.rewrite(i_array_array58);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral61 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array62 = new int[][] {};
        int[] i_array63 = goThroughMatrixInSpiral61.go(i_array_array62);
        rewriteRowAndColumnsWithZeros42.rewrite(i_array_array62);
        rewriteRowAndColumnsWithZeros8.rewrite(i_array_array62);
        int[] i_array66 = goThroughMatrixInSpiral0.go(i_array_array62);
        org.junit.Assert.assertNotNull(i_array_array1);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(i_array7);
        org.junit.Assert.assertNotNull(i_array_array10);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array19);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array_array23);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array_array39);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array_array49);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(i_array57);
        org.junit.Assert.assertNotNull(i_array_array58);
        org.junit.Assert.assertNotNull(i_array59);
        org.junit.Assert.assertNotNull(i_array_array62);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertNotNull(i_array66);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.github.pedrovgs.problem61.SumLists sumLists0 = new com.github.pedrovgs.problem61.SumLists();
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
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList15 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements16 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList17 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays18 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays19 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays18);
        java.lang.String str20 = listnode_mergeSortedArrays19.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode21 = reverseLinkedList17.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays19);
        removeListDuplicatedElements16.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode21);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i23 = getTheElementInTheMiddleOfTheList15.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode21);
        removeListDuplicatedElements1.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode21);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList25 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays26 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays27 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays26);
        java.lang.String str28 = listnode_mergeSortedArrays27.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i29 = reverseLinkedList25.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays27);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList30 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays31 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays32 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays31);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays33 = listnode_mergeSortedArrays32.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays34 = listnode_mergeSortedArrays32.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i36 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i37 = null;
        binarynode_i36.setRight(binarynode_i37);
        boolean b39 = listnode_mergeSortedArrays32.equals((java.lang.Object) binarynode_i37);
        com.github.pedrovgs.linkedlist.ListNode listNode40 = reverseLinkedList30.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays32);
        com.github.pedrovgs.linkedlist.ListNode listNode41 = reverseLinkedList25.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays32);
        try {
            int i42 = sumLists0.sum((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode21, (com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode41);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(listNode12);
        org.junit.Assert.assertNotNull(listNode21);
        org.junit.Assert.assertNotNull(listnode_i23);
        org.junit.Assert.assertNotNull(listnode_i29);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays33);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays34);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(listNode40);
        org.junit.Assert.assertNotNull(listNode41);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
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
        try {
            java.util.List<java.lang.Integer> list_i20 = stack2_0.subList((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.github.pedrovgs.problem25.Anagrams anagrams0 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str2 = anagrams0.get("0");
        java.util.List<java.lang.String> list_str4 = anagrams0.get("0");
        java.util.List<java.lang.String> list_str6 = anagrams0.get("[null]");
        org.junit.Assert.assertNotNull(list_str2);
        org.junit.Assert.assertNotNull(list_str4);
        org.junit.Assert.assertNotNull(list_str6);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnPowersOfTwo("", "");
        try {
            java.lang.String str6 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("/100##/[/32/", "100##");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.github.pedrovgs.problem30.ScientificNotation scientificNotation0 = new com.github.pedrovgs.problem30.ScientificNotation();
        try {
            long long2 = scientificNotation0.calculate("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList0 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements1 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList2 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode6 = reverseLinkedList2.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        removeListDuplicatedElements1.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode6);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i8 = getTheElementInTheMiddleOfTheList0.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode6);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i9 = null;
        try {
            com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i10 = getTheElementInTheMiddleOfTheList0.get(listnode_i9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(listNode6);
        org.junit.Assert.assertNotNull(listnode_i8);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
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
        java.util.AbstractSet<java.lang.Integer>[] abstractset_i_array20 = null;
        try {
            java.util.AbstractSet<java.lang.Integer>[] abstractset_i_array21 = stack2_0.toArray(abstractset_i_array20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.github.pedrovgs.problem11.IntToString intToString0 = new com.github.pedrovgs.problem11.IntToString();
        java.lang.String str2 = intToString0.transform((-52));
        java.lang.String str4 = intToString0.transform((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-52" + "'", str2.equals("-52"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.github.pedrovgs.problem65.IsTreeBalanced isTreeBalanced0 = new com.github.pedrovgs.problem65.IsTreeBalanced();
        com.github.pedrovgs.binarytree.BinaryNode binaryNode1 = null;
        boolean b2 = isTreeBalanced0.check(binaryNode1);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList3 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays4 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays4);
        java.lang.String str6 = listnode_mergeSortedArrays5.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode7 = reverseLinkedList3.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays5);
        com.github.pedrovgs.problem18.IsBST isBST8 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST9 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array11 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i12 = sortedArrayToBST9.transform(i_array11);
        boolean b13 = isBST8.checkRecursive(binarynode_i12);
        boolean b14 = listNode7.equals((java.lang.Object) binarynode_i12);
        boolean b15 = isTreeBalanced0.check((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i12);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(listNode7);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(binarynode_i12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.lang.Object obj8 = vector_i4.clone();
        vector_i4.trimToSize();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.github.pedrovgs.problem77.HelloWorldWithoutSemicolon helloWorldWithoutSemicolon0 = new com.github.pedrovgs.problem77.HelloWorldWithoutSemicolon();
        helloWorldWithoutSemicolon0.printHelloWorld();
        helloWorldWithoutSemicolon0.printHelloWorld();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
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
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays10 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays11 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays10);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays12 = listnode_mergeSortedArrays11.getNext();
        listnode_mergeSortedArrays2.setNext(listnode_mergeSortedArrays11);
        deleteListNode0.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays11);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays12);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        try {
            java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersCheating("/hi!", "0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
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
        java.lang.String str27 = binarynode_i23.toString();
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
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "BinaryNode{data=100}" + "'", str27.equals("BinaryNode{data=100}"));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.github.pedrovgs.problem25.Anagrams anagrams0 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str2 = anagrams0.get("0");
        java.util.List<java.lang.String> list_str4 = anagrams0.get("/hi!/");
        java.util.List<java.lang.String> list_str6 = anagrams0.get("35");
        org.junit.Assert.assertNotNull(list_str2);
        org.junit.Assert.assertNotNull(list_str4);
        org.junit.Assert.assertNotNull(list_str6);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.github.pedrovgs.problem31.FindLongestConsecutiveSequence findLongestConsecutiveSequence0 = new com.github.pedrovgs.problem31.FindLongestConsecutiveSequence();
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
        int i30 = findLongestConsecutiveSequence0.findIterative(i_array29);
        com.github.pedrovgs.problem8.SplitArray splitArray31 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array34 = new int[] { (byte) 1, (byte) 10 };
        splitArray31.splitSwappingPartition(i_array34);
        int[] i_array42 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray31.splitSwappingRecursive(i_array42);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays44 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort45 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray46 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array49 = new int[] { (byte) 1, (byte) 10 };
        splitArray46.splitSwappingPartition(i_array49);
        selectionSort45.sort(i_array49);
        com.github.pedrovgs.problem8.SplitArray splitArray52 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array55 = new int[] { (byte) 1, (byte) 10 };
        splitArray52.splitSwappingPartition(i_array55);
        int[] i_array63 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray52.splitSwappingRecursive(i_array63);
        int[] i_array65 = mergeSortedArrays44.merge(i_array49, i_array63);
        splitArray31.splitSwappingIterative(i_array49);
        int i67 = findLongestConsecutiveSequence0.findRecursive(i_array49);
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array55);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertNotNull(i_array65);
        org.junit.Assert.assertTrue(i67 == 2);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnPowersOfTwo("", "");
        try {
            java.lang.String str6 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("/!ih/", "3");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.github.pedrovgs.problem32.Contains contains0 = new com.github.pedrovgs.problem32.Contains();
        boolean b3 = contains0.evaluate("", "/");
        boolean b6 = contains0.evaluate("[]", "BinaryNode{data=100}");
        boolean b9 = contains0.evaluate("/", "1");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
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
        rewriteRowAndColumnsWithZeros0.rewrite(i_array_array11);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral14 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array15 = new int[][] {};
        int[] i_array16 = goThroughMatrixInSpiral14.go(i_array_array15);
        int[] i_array23 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[] i_array30 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[][] i_array_array31 = new int[][] { i_array23, i_array30 };
        int[] i_array32 = goThroughMatrixInSpiral14.go(i_array_array31);
        rewriteRowAndColumnsWithZeros0.rewrite(i_array_array31);
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros34 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral35 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array36 = new int[][] {};
        int[] i_array37 = goThroughMatrixInSpiral35.go(i_array_array36);
        int[] i_array40 = new int[] { 107, 3628800 };
        int[][] i_array_array41 = new int[][] { i_array40 };
        int[] i_array42 = goThroughMatrixInSpiral35.go(i_array_array41);
        rewriteRowAndColumnsWithZeros34.rewrite(i_array_array41);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral44 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array45 = new int[][] {};
        int[] i_array46 = goThroughMatrixInSpiral44.go(i_array_array45);
        int[] i_array49 = new int[] { 107, 3628800 };
        int[][] i_array_array50 = new int[][] { i_array49 };
        int[] i_array51 = goThroughMatrixInSpiral44.go(i_array_array50);
        rewriteRowAndColumnsWithZeros34.rewrite(i_array_array50);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral53 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array54 = new int[][] {};
        int[] i_array55 = goThroughMatrixInSpiral53.go(i_array_array54);
        rewriteRowAndColumnsWithZeros34.rewrite(i_array_array54);
        rewriteRowAndColumnsWithZeros0.rewrite(i_array_array54);
        com.github.pedrovgs.binarytree.BinaryNode<com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros> binarynode_rewriteRowAndColumnsWithZeros58 = new com.github.pedrovgs.binarytree.BinaryNode<com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros>(rewriteRowAndColumnsWithZeros0);
        org.junit.Assert.assertNotNull(i_array_array2);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array_array7);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(i_array_array31);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array_array41);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(i_array_array45);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array_array54);
        org.junit.Assert.assertNotNull(i_array55);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        java.util.Iterator<java.lang.Integer> iterator_i12 = vector_i4.iterator();
        vector_i4.addElement((java.lang.Integer) (-14040));
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(iterator_i12);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        java.util.Iterator<java.lang.Integer> iterator_i12 = vector_i4.iterator();
        java.lang.Object[] obj_array13 = vector_i4.toArray();
        java.util.ListIterator<java.lang.Integer> listiterator_i15 = vector_i4.listIterator((int) (short) 1);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(iterator_i12);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(listiterator_i15);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.github.pedrovgs.problem70.ReverseOrderOfBinaryNumber reverseOrderOfBinaryNumber0 = new com.github.pedrovgs.problem70.ReverseOrderOfBinaryNumber();
        int i2 = reverseOrderOfBinaryNumber0.reverse((int) ' ');
        org.junit.Assert.assertTrue(i2 == 1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange2 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange3 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "", combinationsOfChange2);
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange4 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "[", combinationsOfChange2);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian0 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i2 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d3 = avlTreeMedian0.find(binarynode_i2);
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
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i28 = binarynode_i14.getLeft();
        double d29 = avlTreeMedian0.find(binarynode_i14);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i30 = null;
        try {
            double d31 = avlTreeMedian0.find(binarynode_i30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d3 == 10.0d);
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
        org.junit.Assert.assertNull(binarynode_i28);
        org.junit.Assert.assertTrue(d29 == 100.0d);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.ensureCapacity((int) (short) 100);
        int i3 = stack2_0.getMin();
        java.util.ListIterator<java.lang.Integer> listiterator_i4 = stack2_0.listIterator();
        stack2_0.push((int) (byte) 1);
        org.junit.Assert.assertTrue(i3 == 2147483647);
        org.junit.Assert.assertNotNull(listiterator_i4);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.github.pedrovgs.problem53.CompressString compressString0 = new com.github.pedrovgs.problem53.CompressString();
        java.lang.String str2 = compressString0.compressRecursive("97");
        java.lang.String str4 = compressString0.compressAlternativeApproach("hi!");
        java.lang.String str6 = compressString0.compress("[]");
        java.lang.String str8 = compressString0.compress("/hi!/");
        java.lang.String str10 = compressString0.compressRecursive("/hi!/");
        java.lang.String str12 = compressString0.compressAlternativeApproach("3");
        java.lang.String str14 = compressString0.compressAlternativeApproach("1");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97" + "'", str2.equals("97"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/hi!" + "'", str8.equals("/hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "/hi!/" + "'", str10.equals("/hi!/"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "3" + "'", str12.equals("3"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1" + "'", str14.equals("1"));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
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
        org.junit.Assert.assertNotNull(listNode5);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(binarynode_i10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(listNode13);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.github.pedrovgs.problem56.IsRotationUsingIsSubstring isRotationUsingIsSubstring0 = new com.github.pedrovgs.problem56.IsRotationUsingIsSubstring();
        boolean b3 = isRotationUsingIsSubstring0.check("hi!", "");
        boolean b6 = isRotationUsingIsSubstring0.check("/", "");
        boolean b9 = isRotationUsingIsSubstring0.check("/", "/100##/[/32/");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(10);
        int i4 = factorial0.getTailRecursive((int) (short) 10);
        try {
            int i6 = factorial0.getRecursive((-5200));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 3628800);
        org.junit.Assert.assertTrue(i4 == 3628800);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.github.pedrovgs.problem72.FindTheMissingNumber findTheMissingNumber0 = new com.github.pedrovgs.problem72.FindTheMissingNumber();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem72.FindTheMissingNumber> listnode_findTheMissingNumber1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem72.FindTheMissingNumber>(findTheMissingNumber0);
        int[] i_array2 = null;
        try {
            int i3 = findTheMissingNumber0.find(i_array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements0 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode5 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        removeListDuplicatedElements0.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode5);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays7 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays8 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays7);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays9 = listnode_mergeSortedArrays8.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays10 = listnode_mergeSortedArrays8.getNext();
        listNode5.setNext(listnode_mergeSortedArrays10);
        org.junit.Assert.assertNotNull(listNode5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays9);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays10);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
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
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST45 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array47 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i48 = sortedArrayToBST45.transform(i_array47);
        java.lang.String str49 = binarynode_i48.toString();
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_50 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_50.push((int) (byte) 10);
        int i53 = stack1_50.getMin();
        boolean b54 = binarynode_i48.equals((java.lang.Object) stack1_50);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode55 = binaryTreePostOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i48);
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
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(binarynode_i48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "BinaryNode{data=100}" + "'", str49.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue(i53 == 10);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(list_binaryNode55);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i5 = reverseLinkedList1.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        com.github.pedrovgs.problem62.PalindromeList palindromeList6 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList7 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays8 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays9 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays8);
        java.lang.String str10 = listnode_mergeSortedArrays9.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i11 = reverseLinkedList7.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays9);
        boolean b12 = palindromeList6.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays9);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays13 = listnode_mergeSortedArrays9.getNext();
        listnode_mergeSortedArrays3.setNext(listnode_mergeSortedArrays9);
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode16 = findKthElement0.find((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays9, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(listnode_i5);
        org.junit.Assert.assertNotNull(listnode_i11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays13);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements0 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode5 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        removeListDuplicatedElements0.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode5);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList7 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements8 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList9 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays10 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays11 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays10);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays12 = listnode_mergeSortedArrays11.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays13 = listnode_mergeSortedArrays11.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i15 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i16 = null;
        binarynode_i15.setRight(binarynode_i16);
        boolean b18 = listnode_mergeSortedArrays11.equals((java.lang.Object) binarynode_i16);
        com.github.pedrovgs.linkedlist.ListNode listNode19 = reverseLinkedList9.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays11);
        removeListDuplicatedElements8.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode19);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements21 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList22 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays23 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays24 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays23);
        java.lang.String str25 = listnode_mergeSortedArrays24.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode26 = reverseLinkedList22.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays24);
        removeListDuplicatedElements21.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode26);
        removeListDuplicatedElements8.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode26);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i29 = getTheElementInTheMiddleOfTheList7.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode26);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements30 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList31 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays32 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays33 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays32);
        java.lang.String str34 = listnode_mergeSortedArrays33.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode35 = reverseLinkedList31.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays33);
        removeListDuplicatedElements30.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode35);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i37 = getTheElementInTheMiddleOfTheList7.get((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode35);
        removeListDuplicatedElements0.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode35);
        org.junit.Assert.assertNotNull(listNode5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays12);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays13);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(listNode19);
        org.junit.Assert.assertNotNull(listNode26);
        org.junit.Assert.assertNotNull(listnode_i29);
        org.junit.Assert.assertNotNull(listNode35);
        org.junit.Assert.assertNotNull(listnode_i37);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
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
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0 + "'", i12.equals(0));
        org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1) + "'", i13.equals((-1)));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(10);
        int i4 = factorial0.getTailRecursive((int) (short) 10);
        int i6 = factorial0.getTailRecursive((int) (short) 10);
        org.junit.Assert.assertTrue(i2 == 3628800);
        org.junit.Assert.assertTrue(i4 == 3628800);
        org.junit.Assert.assertTrue(i6 == 3628800);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
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
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i23 = getTheElementInTheMiddleOfTheList1.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode20);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements24 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList25 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays26 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays27 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays26);
        java.lang.String str28 = listnode_mergeSortedArrays27.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode29 = reverseLinkedList25.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays27);
        removeListDuplicatedElements24.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode29);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i31 = getTheElementInTheMiddleOfTheList1.get((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode29);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList32 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements33 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList34 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays35 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays36 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays35);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays37 = listnode_mergeSortedArrays36.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays38 = listnode_mergeSortedArrays36.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i40 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i41 = null;
        binarynode_i40.setRight(binarynode_i41);
        boolean b43 = listnode_mergeSortedArrays36.equals((java.lang.Object) binarynode_i41);
        com.github.pedrovgs.linkedlist.ListNode listNode44 = reverseLinkedList34.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays36);
        removeListDuplicatedElements33.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode44);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements46 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList47 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays48 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays49 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays48);
        java.lang.String str50 = listnode_mergeSortedArrays49.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode51 = reverseLinkedList47.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays49);
        removeListDuplicatedElements46.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode51);
        removeListDuplicatedElements33.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode51);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i54 = getTheElementInTheMiddleOfTheList32.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode51);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements55 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList56 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays57 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays58 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays57);
        java.lang.String str59 = listnode_mergeSortedArrays58.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode60 = reverseLinkedList56.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays58);
        removeListDuplicatedElements55.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode60);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i62 = getTheElementInTheMiddleOfTheList32.get((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode60);
        try {
            int i63 = sumLists0.sumReverse((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode29, (com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode60);
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
        org.junit.Assert.assertNull(listnode_mergeSortedArrays37);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays38);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(listNode44);
        org.junit.Assert.assertNotNull(listNode51);
        org.junit.Assert.assertNotNull(listnode_i54);
        org.junit.Assert.assertNotNull(listNode60);
        org.junit.Assert.assertNotNull(listnode_i62);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.github.pedrovgs.problem47.ReturnChange returnChange0 = new com.github.pedrovgs.problem47.ReturnChange();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem47.ReturnChange> listnode_returnChange1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem47.ReturnChange>(returnChange0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push((-1));
        java.lang.Integer i3 = stack2_0.peek();
        try {
            java.lang.Integer i5 = stack2_0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + i3 + "' != '" + (-1) + "'", i3.equals((-1)));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        int i9 = vector_i4.indexOf((java.lang.Object) 1);
        int i11 = vector_i4.indexOf((java.lang.Object) 100.0d);
        java.lang.Integer[] i_array16 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i17 = new java.util.Vector<java.lang.Integer>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i17, i_array16);
        int i21 = vector_i17.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        com.github.pedrovgs.problem65.IsTreeBalanced isTreeBalanced22 = new com.github.pedrovgs.problem65.IsTreeBalanced();
        int i23 = vector_i17.lastIndexOf((java.lang.Object) isTreeBalanced22);
        try {
            int i25 = vector_i4.indexOf((java.lang.Object) i23, (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(i23 == (-1));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.github.pedrovgs.problem44.FindMinNumberAtPosition findMinNumberAtPosition0 = new com.github.pedrovgs.problem44.FindMinNumberAtPosition();
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
        try {
            java.lang.Integer i28 = findMinNumberAtPosition0.find(binarynode_i24, (-5200));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
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
        java.lang.String str20 = listnode_mergeSortedArrays19.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i21 = reverseLinkedList17.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays19);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList22 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays23 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays24 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays23);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays25 = listnode_mergeSortedArrays24.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays26 = listnode_mergeSortedArrays24.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i28 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i29 = null;
        binarynode_i28.setRight(binarynode_i29);
        boolean b31 = listnode_mergeSortedArrays24.equals((java.lang.Object) binarynode_i29);
        com.github.pedrovgs.linkedlist.ListNode listNode32 = reverseLinkedList22.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays24);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode33 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays34 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays35 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays34);
        java.lang.String str36 = listnode_mergeSortedArrays35.toString();
        deleteListNode33.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays35);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays38 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays39 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays38);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers40 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b41 = listnode_mergeSortedArrays39.equals((java.lang.Object) mergeBinaryNumbers40);
        deleteListNode33.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays39);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i43 = reverseLinkedList22.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays39);
        com.github.pedrovgs.linkedlist.ListNode listNode44 = reverseLinkedList17.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays39);
        boolean b45 = palindromeList0.checkReversing((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays39);
        org.junit.Assert.assertNotNull(listnode_i5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(listnode_i21);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays25);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays26);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(listNode32);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(listnode_i43);
        org.junit.Assert.assertNotNull(listNode44);
        org.junit.Assert.assertTrue(b45 == true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.github.pedrovgs.problem7.FibonacciNumbers fibonacciNumbers0 = new com.github.pedrovgs.problem7.FibonacciNumbers();
        long long2 = fibonacciNumbers0.getIterative((long) 10);
        long long4 = fibonacciNumbers0.getRecursiveWithCaching((int) (byte) 100);
        org.junit.Assert.assertTrue(long2 == 55L);
        org.junit.Assert.assertTrue(long4 == 3736710778780434371L);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.github.pedrovgs.problem8.SplitArray splitArray0 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray1 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array4 = new int[] { (byte) 1, (byte) 10 };
        splitArray1.splitSwappingPartition(i_array4);
        splitArray0.splitSwappingRecursive(i_array4);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral7 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array8 = new int[][] {};
        int[] i_array9 = goThroughMatrixInSpiral7.go(i_array_array8);
        splitArray0.splitSwappingRecursive(i_array9);
        com.github.pedrovgs.problem80.QuickSort quickSort11 = new com.github.pedrovgs.problem80.QuickSort();
        com.github.pedrovgs.problem8.SplitArray splitArray12 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array15 = new int[] { (byte) 1, (byte) 10 };
        splitArray12.splitSwappingPartition(i_array15);
        com.github.pedrovgs.problem2.Vector vector17 = new com.github.pedrovgs.problem2.Vector(i_array15);
        quickSort11.sort(i_array15);
        splitArray0.splitSwappingRecursive(i_array15);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(i_array15);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.github.pedrovgs.problem37.PathCalculator pathCalculator0 = new com.github.pedrovgs.problem37.PathCalculator();
        java.lang.String str4 = pathCalculator0.calculate("32", "-52", "7");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "/32/-52/7/" + "'", str4.equals("/32/-52/7/"));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.github.pedrovgs.problem44.FindMinNumberAtPosition findMinNumberAtPosition0 = new com.github.pedrovgs.problem44.FindMinNumberAtPosition();
        com.github.pedrovgs.problem18.IsBST isBST1 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST2 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = sortedArrayToBST2.transform(i_array4);
        boolean b6 = isBST1.checkRecursive(binarynode_i5);
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
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i20 = binarynode_i11.getLeft();
        boolean b21 = isBST1.checkIterative(binarynode_i11);
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian22 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i24 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d25 = avlTreeMedian22.find(binarynode_i24);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor26 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
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
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST40 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array42 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i43 = sortedArrayToBST40.transform(i_array42);
        boolean b44 = binarynode_i43.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST45 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array47 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i48 = sortedArrayToBST45.transform(i_array47);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode49 = lowestCommonAncestor26.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i36, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i43, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i48);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i50 = binarynode_i36.getLeft();
        double d51 = avlTreeMedian22.find(binarynode_i36);
        boolean b52 = isBST1.checkRecursive(binarynode_i36);
        try {
            java.lang.Integer i54 = findMinNumberAtPosition0.find(binarynode_i36, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(binarynode_i5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(binarynode_i11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(binarynode_i16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(binarynode_i18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(binarynode_i20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(d25 == 10.0d);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(binarynode_i31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(binarynode_i36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(binarynode_i38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(binarynode_i43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(binarynode_i48);
        org.junit.Assert.assertNull(binaryNode49);
        org.junit.Assert.assertNull(binarynode_i50);
        org.junit.Assert.assertTrue(d51 == 100.0d);
        org.junit.Assert.assertTrue(b52 == true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(10);
        int i4 = factorial0.getIterative(4);
        org.junit.Assert.assertTrue(i2 == 3628800);
        org.junit.Assert.assertTrue(i4 == 24);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
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
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList66 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements67 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList68 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays69 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays70 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays69);
        java.lang.String str71 = listnode_mergeSortedArrays70.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode72 = reverseLinkedList68.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays70);
        removeListDuplicatedElements67.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode72);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i74 = getTheElementInTheMiddleOfTheList66.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode72);
        removeListDuplicatedElements52.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode72);
        boolean b76 = listnode_mergeSortedArrays24.equals((java.lang.Object) listNode72);
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode78 = findKthElement0.find2(listNode72, (int) '4');
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
        org.junit.Assert.assertNull(listnode_mergeSortedArrays56);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays57);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(listNode63);
        org.junit.Assert.assertNotNull(listNode72);
        org.junit.Assert.assertNotNull(listnode_i74);
        org.junit.Assert.assertTrue(b76 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
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
        rewriteRowAndColumnsWithZeros1.rewrite(i_array_array12);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral15 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array16 = new int[][] {};
        int[] i_array17 = goThroughMatrixInSpiral15.go(i_array_array16);
        int[] i_array24 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[] i_array31 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[][] i_array_array32 = new int[][] { i_array24, i_array31 };
        int[] i_array33 = goThroughMatrixInSpiral15.go(i_array_array32);
        rewriteRowAndColumnsWithZeros1.rewrite(i_array_array32);
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros35 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral36 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array37 = new int[][] {};
        int[] i_array38 = goThroughMatrixInSpiral36.go(i_array_array37);
        int[] i_array41 = new int[] { 107, 3628800 };
        int[][] i_array_array42 = new int[][] { i_array41 };
        int[] i_array43 = goThroughMatrixInSpiral36.go(i_array_array42);
        rewriteRowAndColumnsWithZeros35.rewrite(i_array_array42);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral45 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array46 = new int[][] {};
        int[] i_array47 = goThroughMatrixInSpiral45.go(i_array_array46);
        int[] i_array50 = new int[] { 107, 3628800 };
        int[][] i_array_array51 = new int[][] { i_array50 };
        int[] i_array52 = goThroughMatrixInSpiral45.go(i_array_array51);
        rewriteRowAndColumnsWithZeros35.rewrite(i_array_array51);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral54 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array55 = new int[][] {};
        int[] i_array56 = goThroughMatrixInSpiral54.go(i_array_array55);
        rewriteRowAndColumnsWithZeros35.rewrite(i_array_array55);
        rewriteRowAndColumnsWithZeros1.rewrite(i_array_array55);
        try {
            rotateMatrix0.rotate(i_array_array55);
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
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(i_array_array32);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array_array37);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(i_array_array42);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array_array51);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array_array55);
        org.junit.Assert.assertNotNull(i_array56);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(10);
        int i4 = factorial0.getTailRecursive((int) (short) 10);
        int i6 = factorial0.getRecursive(0);
        int i8 = factorial0.getIterative(3);
        int i10 = factorial0.getTailRecursive(270);
        org.junit.Assert.assertTrue(i2 == 3628800);
        org.junit.Assert.assertTrue(i4 == 3628800);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i8 == 6);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.github.pedrovgs.problem29.AreAnagrams areAnagrams0 = new com.github.pedrovgs.problem29.AreAnagrams();
        boolean b3 = areAnagrams0.check("/!ih/hi!/", "10");
        boolean b6 = areAnagrams0.check("35", "/hi!");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.github.pedrovgs.problem72.FindTheMissingNumber findTheMissingNumber0 = new com.github.pedrovgs.problem72.FindTheMissingNumber();
        com.github.pedrovgs.problem75.SelectionSort selectionSort1 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray2 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array5 = new int[] { (byte) 1, (byte) 10 };
        splitArray2.splitSwappingPartition(i_array5);
        selectionSort1.sort(i_array5);
        int i8 = findTheMissingNumber0.find(i_array5);
        com.github.pedrovgs.problem39.MultiplyArrayElements multiplyArrayElements9 = new com.github.pedrovgs.problem39.MultiplyArrayElements();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral10 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array11 = new int[][] {};
        int[] i_array12 = goThroughMatrixInSpiral10.go(i_array_array11);
        int[] i_array13 = multiplyArrayElements9.multiply(i_array12);
        com.github.pedrovgs.problem80.QuickSort quickSort14 = new com.github.pedrovgs.problem80.QuickSort();
        com.github.pedrovgs.problem8.SplitArray splitArray15 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array18 = new int[] { (byte) 1, (byte) 10 };
        splitArray15.splitSwappingPartition(i_array18);
        com.github.pedrovgs.problem2.Vector vector20 = new com.github.pedrovgs.problem2.Vector(i_array18);
        quickSort14.sort(i_array18);
        int[] i_array22 = multiplyArrayElements9.multiply(i_array18);
        int i23 = findTheMissingNumber0.find(i_array22);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertTrue(i8 == (-8));
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertTrue(i23 == (-8));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList0 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        java.lang.String str3 = listnode_mergeSortedArrays2.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i4 = reverseLinkedList0.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2);
        com.github.pedrovgs.problem62.PalindromeList palindromeList5 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList6 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays7 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays8 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays7);
        java.lang.String str9 = listnode_mergeSortedArrays8.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i10 = reverseLinkedList6.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays8);
        boolean b11 = palindromeList5.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays8);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays12 = listnode_mergeSortedArrays8.getNext();
        listnode_mergeSortedArrays2.setNext(listnode_mergeSortedArrays8);
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
        listnode_mergeSortedArrays2.setNext(listnode_mergeSortedArrays15);
        org.junit.Assert.assertNotNull(listnode_i4);
        org.junit.Assert.assertNotNull(listnode_i10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays12);
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays23);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideRecursive(29, 4);
        float f6 = divideUsingSubtraction0.divideRecursive(107, (-1241513984));
        org.junit.Assert.assertTrue(f3 == 7.25f);
        org.junit.Assert.assertTrue(f6 == 3.4594593f);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST0 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i3 = sortedArrayToBST0.transform(i_array2);
        java.lang.String str4 = binarynode_i3.toString();
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_5 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_5.push((int) (byte) 10);
        int i8 = stack1_5.getMin();
        boolean b9 = binarynode_i3.equals((java.lang.Object) stack1_5);
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel10 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem18.IsBST isBST11 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST12 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array14 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i15 = sortedArrayToBST12.transform(i_array14);
        boolean b16 = isBST11.checkRecursive(binarynode_i15);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode17 = binaryTreeByLevel10.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i15);
        binarynode_i3.setRight(binarynode_i15);
        boolean b19 = binarynode_i3.hasLeft();
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(binarynode_i3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "BinaryNode{data=100}" + "'", str4.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(binarynode_i15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(list_binaryNode17);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode0 = new com.github.pedrovgs.problem59.DeleteListNode();
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
        deleteListNode0.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays18);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(listNode11);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(listnode_i22);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
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
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
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
        org.junit.Assert.assertNotNull(char_array7);
        org.junit.Assert.assertNotNull(char_array13);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
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
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
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
        try {
            java.lang.Integer i21 = vector_i4.lastElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
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
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.github.pedrovgs.problem50.UniqueChars uniqueChars0 = new com.github.pedrovgs.problem50.UniqueChars();
        boolean b2 = uniqueChars0.evaluate2("/hi!/");
        boolean b4 = uniqueChars0.evaluate2("BinaryNode{data=100}");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
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
            com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i55 = partitionList0.split((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode50, (int) (short) -1);
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
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.github.pedrovgs.problem30.ScientificNotation scientificNotation0 = new com.github.pedrovgs.problem30.ScientificNotation();
        try {
            long long2 = scientificNotation0.calculate("10");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates0 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates1 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST2 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = sortedArrayToBST2.transform(i_array4);
        java.lang.Integer[] i_array6 = removeDuplicates1.removeUsingSorting(i_array4);
        java.lang.Integer[] i_array7 = removeDuplicates0.removeUsingSorting(i_array6);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(binarynode_i5);
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array7);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
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
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements23 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList24 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays25 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays26 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays25);
        java.lang.String str27 = listnode_mergeSortedArrays26.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode28 = reverseLinkedList24.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays26);
        removeListDuplicatedElements23.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode28);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i30 = getTheElementInTheMiddleOfTheList0.get((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode28);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements31 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList32 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays33 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays34 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays33);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays35 = listnode_mergeSortedArrays34.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays36 = listnode_mergeSortedArrays34.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i38 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i39 = null;
        binarynode_i38.setRight(binarynode_i39);
        boolean b41 = listnode_mergeSortedArrays34.equals((java.lang.Object) binarynode_i39);
        com.github.pedrovgs.linkedlist.ListNode listNode42 = reverseLinkedList32.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays34);
        removeListDuplicatedElements31.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode42);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements44 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList45 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays46 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays47 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays46);
        java.lang.String str48 = listnode_mergeSortedArrays47.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode49 = reverseLinkedList45.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays47);
        removeListDuplicatedElements44.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode49);
        removeListDuplicatedElements31.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode49);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i52 = getTheElementInTheMiddleOfTheList0.get((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode49);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays53 = listNode49.getNext();
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(listNode12);
        org.junit.Assert.assertNotNull(listNode19);
        org.junit.Assert.assertNotNull(listnode_i22);
        org.junit.Assert.assertNotNull(listNode28);
        org.junit.Assert.assertNotNull(listnode_i30);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays35);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays36);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(listNode42);
        org.junit.Assert.assertNotNull(listNode49);
        org.junit.Assert.assertNotNull(listnode_i52);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays53);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList0 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        java.lang.String str3 = listnode_mergeSortedArrays2.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i4 = reverseLinkedList0.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays5 = listnode_mergeSortedArrays2.getNext();
        org.junit.Assert.assertNotNull(listnode_i4);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
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
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        java.lang.Integer[] i_array1 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i2 = new java.util.Stack<java.lang.Integer>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i2, i_array1);
        boolean b4 = stack_i2.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST5 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i6 = stack_i2.search((java.lang.Object) sortedArrayToBST5);
        com.github.pedrovgs.problem28.FindSums findSums7 = new com.github.pedrovgs.problem28.FindSums();
        int i8 = stack_i2.indexOf((java.lang.Object) findSums7);
        org.junit.Assert.assertNotNull(i_array1);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
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
        java.lang.Integer[] i_array17 = new java.lang.Integer[] { 2, (-14040), (-14040), 27 };
        java.lang.Integer[] i_array18 = removeDuplicates0.removeUsingSet(i_array17);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(binarynode_i5);
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(binarynode_i10);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array18);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
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
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.github.pedrovgs.problem29.AreAnagrams areAnagrams0 = new com.github.pedrovgs.problem29.AreAnagrams();
        boolean b3 = areAnagrams0.check("3", "/!ih/hi!/");
        boolean b6 = areAnagrams0.check("1", "3");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.github.pedrovgs.problem50.UniqueChars uniqueChars0 = new com.github.pedrovgs.problem50.UniqueChars();
        boolean b2 = uniqueChars0.evaluate2("/hi!/");
        boolean b4 = uniqueChars0.evaluate2("1");
        boolean b6 = uniqueChars0.evaluate("[null]");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.github.pedrovgs.problem32.Contains contains0 = new com.github.pedrovgs.problem32.Contains();
        boolean b3 = contains0.evaluate("", "/");
        boolean b6 = contains0.evaluate("[]", "BinaryNode{data=100}");
        boolean b9 = contains0.evaluate("[", "/");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
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
        boolean b23 = isBST0.checkRecursive(binarynode_i20);
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
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
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
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i31 = reverseLinkedList16.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays27);
        com.github.pedrovgs.linkedlist.ListNode listNode32 = reverseLinkedList0.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_i31);
        java.lang.String str33 = listNode32.toString();
        org.junit.Assert.assertNotNull(listnode_i4);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(listnode_i15);
        org.junit.Assert.assertNotNull(listnode_i20);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(listnode_i31);
        org.junit.Assert.assertNotNull(listNode32);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.github.pedrovgs.problem44.FindMinNumberAtPosition findMinNumberAtPosition0 = new com.github.pedrovgs.problem44.FindMinNumberAtPosition();
        com.github.pedrovgs.problem18.IsBST isBST1 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST2 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = sortedArrayToBST2.transform(i_array4);
        boolean b6 = isBST1.checkRecursive(binarynode_i5);
        boolean b7 = binarynode_i5.hasRight();
        try {
            java.lang.Integer i9 = findMinNumberAtPosition0.find(binarynode_i5, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(binarynode_i5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
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
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays51 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays52 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays51);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays53 = listnode_mergeSortedArrays52.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays54 = listnode_mergeSortedArrays52.getNext();
        com.github.pedrovgs.linkedlist.ListNode listNode55 = reverseLinkedList0.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays52);
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
        org.junit.Assert.assertNull(listnode_mergeSortedArrays53);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays54);
        org.junit.Assert.assertNotNull(listNode55);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        java.util.Enumeration<java.lang.Integer> enumeration_i10 = vector_i4.elements();
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction11 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f14 = divideUsingSubtraction11.divideIterative((int) (byte) 10, (int) (byte) 100);
        boolean b15 = vector_i4.removeElement((java.lang.Object) divideUsingSubtraction11);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(enumeration_i10);
        org.junit.Assert.assertTrue(f14 == 0.1f);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.github.pedrovgs.problem33.SimpleRegularExpression simpleRegularExpression0 = new com.github.pedrovgs.problem33.SimpleRegularExpression();
        boolean b3 = simpleRegularExpression0.evaluate("1", "97");
        boolean b6 = simpleRegularExpression0.evaluate("[", "[]");
        boolean b9 = simpleRegularExpression0.evaluate("/!ih/", "/!ih/");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.github.pedrovgs.problem51.ReverseString reverseString0 = new com.github.pedrovgs.problem51.ReverseString();
        java.lang.String str2 = reverseString0.reverseRecursive("/hi!/");
        java.lang.String str4 = reverseString0.reverseIterative("hi!");
        java.lang.String str6 = reverseString0.reverseIterative("1");
        java.lang.String str8 = reverseString0.reverseIterative("/!ih/");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/!ih/" + "'", str2.equals("/!ih/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "!ih" + "'", str4.equals("!ih"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/hi!/" + "'", str8.equals("/hi!/"));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays0 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays0);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers2 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b3 = listnode_mergeSortedArrays1.equals((java.lang.Object) mergeBinaryNumbers2);
        int i8 = mergeBinaryNumbers2.merge((int) '4', (-8), (int) (byte) -1, 27);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i8 == 52);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.github.pedrovgs.problem1.BitsCounter bitsCounter0 = new com.github.pedrovgs.problem1.BitsCounter();
        int i2 = bitsCounter0.countBitsToOneBasedOnString((-6));
        org.junit.Assert.assertTrue(i2 == 30);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.github.pedrovgs.problem51.ReverseString reverseString0 = new com.github.pedrovgs.problem51.ReverseString();
        java.lang.String str2 = reverseString0.reverseRecursive("/hi!/");
        java.lang.String str4 = reverseString0.reverseIterative("/");
        java.lang.String str6 = reverseString0.reverseRecursive("[0, 1, 1, -1]");
        java.lang.String str8 = reverseString0.reverseRecursive("/100##/[/32/");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/!ih/" + "'", str2.equals("/!ih/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "/" + "'", str4.equals("/"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "]1- ,1 ,1 ,0[" + "'", str6.equals("]1- ,1 ,1 ,0["));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/23/[/##001/" + "'", str8.equals("/23/[/##001/"));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.github.pedrovgs.problem27.ReverseSentence reverseSentence0 = new com.github.pedrovgs.problem27.ReverseSentence();
        java.lang.String str2 = reverseSentence0.reverse("hi!");
        java.lang.String str4 = reverseSentence0.reverse("/32/-52/7/");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "/32/-52/7/" + "'", str4.equals("/32/-52/7/"));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        try {
            int i3 = stack2_0.lastIndexOf((java.lang.Object) "0", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel0 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem18.IsBST isBST1 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST2 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = sortedArrayToBST2.transform(i_array4);
        boolean b6 = isBST1.checkRecursive(binarynode_i5);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode7 = binaryTreeByLevel0.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i5);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode8 = null;
        try {
            java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode9 = binaryTreeByLevel0.getUsingQueue(binaryNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(binarynode_i5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(list_binaryNode7);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(0);
        int i4 = factorial0.getTailRecursive((int) (byte) 100);
        int i6 = factorial0.getIterative((int) (byte) 0);
        int i8 = factorial0.getIterative(27);
        org.junit.Assert.assertTrue(i2 == 1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i8 == 1484783616);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
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
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian44 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals45 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem18.IsBST isBST46 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST47 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array49 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i50 = sortedArrayToBST47.transform(i_array49);
        boolean b51 = isBST46.checkRecursive(binarynode_i50);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST52 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array54 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i55 = sortedArrayToBST52.transform(i_array54);
        boolean b56 = binarynode_i55.hasRight();
        boolean b57 = binaryTreeEquals45.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i50, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i55);
        double d58 = avlTreeMedian44.find(binarynode_i50);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode59 = treeToListByLevel0.transform((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i50);
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
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(binarynode_i50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(binarynode_i55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(d58 == 100.0d);
        org.junit.Assert.assertNotNull(list_binaryNode59);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.github.pedrovgs.problem31.FindLongestConsecutiveSequence findLongestConsecutiveSequence0 = new com.github.pedrovgs.problem31.FindLongestConsecutiveSequence();
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
        int i30 = findLongestConsecutiveSequence0.findIterative(i_array29);
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
        int i53 = findLongestConsecutiveSequence0.findRecursive(i_array50);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays54 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort55 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray56 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array59 = new int[] { (byte) 1, (byte) 10 };
        splitArray56.splitSwappingPartition(i_array59);
        selectionSort55.sort(i_array59);
        com.github.pedrovgs.problem8.SplitArray splitArray62 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array65 = new int[] { (byte) 1, (byte) 10 };
        splitArray62.splitSwappingPartition(i_array65);
        int[] i_array73 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray62.splitSwappingRecursive(i_array73);
        int[] i_array75 = mergeSortedArrays54.merge(i_array59, i_array73);
        int i76 = findLongestConsecutiveSequence0.findIterative(i_array75);
        int[] i_array77 = new int[] {};
        int i78 = findLongestConsecutiveSequence0.findIterative(i_array77);
        int[] i_array79 = null;
        try {
            int i80 = findLongestConsecutiveSequence0.findIterative(i_array79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertTrue(i53 == 2);
        org.junit.Assert.assertNotNull(i_array59);
        org.junit.Assert.assertNotNull(i_array65);
        org.junit.Assert.assertNotNull(i_array73);
        org.junit.Assert.assertNotNull(i_array75);
        org.junit.Assert.assertTrue(i76 == 4);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertTrue(i78 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        java.lang.Integer i2 = stack2_0.push((java.lang.Integer) 5);
        org.junit.Assert.assertTrue("'" + i2 + "' != '" + 5 + "'", i2.equals(5));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push(100);
        int i3 = stack2_0.capacity();
        java.util.Iterator<java.lang.Integer> iterator_i4 = stack2_0.iterator();
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertNotNull(iterator_i4);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        vector_i5.trimToSize();
        try {
            vector_i5.add(2147483647, (java.lang.Integer) (-1241513984));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        vector_i5.trimToSize();
        vector_i5.add((int) (short) 0, (java.lang.Integer) 0);
        java.util.stream.Stream<java.lang.Integer> stream_i14 = vector_i5.stream();
        vector_i5.ensureCapacity(100);
        java.util.function.UnaryOperator<java.lang.Integer> unaryoperator_i17 = null;
        try {
            vector_i5.replaceAll(unaryoperator_i17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(stream_i14);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
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
        org.junit.Assert.assertNotNull(listnode_i6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays11);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays12);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
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
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements22 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList23 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays24 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays25 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays24);
        java.lang.String str26 = listnode_mergeSortedArrays25.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode27 = reverseLinkedList23.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays25);
        removeListDuplicatedElements22.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode27);
        com.github.pedrovgs.problem62.PalindromeList palindromeList29 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList30 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays31 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays32 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays31);
        java.lang.String str33 = listnode_mergeSortedArrays32.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i34 = reverseLinkedList30.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays32);
        boolean b35 = palindromeList29.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays32);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays36 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays37 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays36);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays38 = listnode_mergeSortedArrays37.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays39 = listnode_mergeSortedArrays37.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i41 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i42 = null;
        binarynode_i41.setRight(binarynode_i42);
        boolean b44 = listnode_mergeSortedArrays37.equals((java.lang.Object) binarynode_i42);
        listnode_mergeSortedArrays32.setNext(listnode_mergeSortedArrays37);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays46 = listnode_mergeSortedArrays37.getData();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements47 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList48 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays49 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays50 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays49);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays51 = listnode_mergeSortedArrays50.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays52 = listnode_mergeSortedArrays50.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i54 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i55 = null;
        binarynode_i54.setRight(binarynode_i55);
        boolean b57 = listnode_mergeSortedArrays50.equals((java.lang.Object) binarynode_i55);
        com.github.pedrovgs.linkedlist.ListNode listNode58 = reverseLinkedList48.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays50);
        removeListDuplicatedElements47.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode58);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements> listnode_removeListDuplicatedElements60 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements>(removeListDuplicatedElements47);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList61 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements62 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList63 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays64 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays65 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays64);
        java.lang.String str66 = listnode_mergeSortedArrays65.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode67 = reverseLinkedList63.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays65);
        removeListDuplicatedElements62.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode67);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i69 = getTheElementInTheMiddleOfTheList61.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode67);
        removeListDuplicatedElements47.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode67);
        listnode_mergeSortedArrays37.setNext((com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>) listNode67);
        removeListDuplicatedElements22.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode67);
        boolean b73 = vector_i4.equals((java.lang.Object) listNode67);
        boolean b75 = vector_i4.add((java.lang.Integer) 2147483647);
        com.github.pedrovgs.problem56.IsRotationUsingIsSubstring isRotationUsingIsSubstring76 = new com.github.pedrovgs.problem56.IsRotationUsingIsSubstring();
        boolean b79 = isRotationUsingIsSubstring76.check("hi!", "");
        boolean b80 = vector_i4.equals((java.lang.Object) b79);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(listNode18);
        org.junit.Assert.assertNotNull(listnode_i20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(listNode27);
        org.junit.Assert.assertNotNull(listnode_i34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays38);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays39);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(mergeSortedArrays46);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays51);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays52);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(listNode58);
        org.junit.Assert.assertNotNull(listNode67);
        org.junit.Assert.assertNotNull(listnode_i69);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b80 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.github.pedrovgs.problem8.SplitArray splitArray0 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array3 = new int[] { (byte) 1, (byte) 10 };
        splitArray0.splitSwappingPartition(i_array3);
        com.github.pedrovgs.problem2.Vector vector5 = new com.github.pedrovgs.problem2.Vector(i_array3);
        int i6 = vector5.size();
        try {
            int i8 = vector5.getAt(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(i6 == 2);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.github.pedrovgs.problem2.VectorScalarProduct vectorScalarProduct0 = new com.github.pedrovgs.problem2.VectorScalarProduct();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideIterative((int) (byte) 10, (int) (byte) 100);
        float f6 = divideUsingSubtraction0.divideRecursive((int) (byte) 1, (int) '#');
        float f9 = divideUsingSubtraction0.divideIterative(2147483647, 6);
        org.junit.Assert.assertTrue(f3 == 0.1f);
        org.junit.Assert.assertTrue(f6 == 0.028571429f);
        org.junit.Assert.assertTrue(f9 == 1.6777216E7f);
    }
}


