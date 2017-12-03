package com.github.pedrovgs.rtest180_3;

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
        com.github.pedrovgs.problem35.AsteriskRegularExpression asteriskRegularExpression0 = new com.github.pedrovgs.problem35.AsteriskRegularExpression();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.github.pedrovgs.problem38.PathToEveryLeaf pathToEveryLeaf0 = new com.github.pedrovgs.problem38.PathToEveryLeaf();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i1 = null;
        try {
            java.util.List<java.util.List<com.github.pedrovgs.binarytree.BinaryNode>> list_list_binaryNode2 = pathToEveryLeaf0.calculate(binarynode_i1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.github.pedrovgs.problem25.Anagrams anagrams0 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str2 = anagrams0.get("hi!");
        org.junit.Assert.assertNotNull(list_str2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.github.pedrovgs.problem27.ReverseSentence reverseSentence0 = new com.github.pedrovgs.problem27.ReverseSentence();
        java.lang.String str2 = reverseSentence0.reverse("hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.github.pedrovgs.problem7.FibonacciNumbers fibonacciNumbers0 = new com.github.pedrovgs.problem7.FibonacciNumbers();
        try {
            long long2 = fibonacciNumbers0.getRecursive((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str0 = com.github.pedrovgs.problem37.PathCalculator.DIR_SEPARATOR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/" + "'", str0.equals("/"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
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
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements0 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i1 = null;
        try {
            removeListDuplicatedElements0.remove2(listnode_i1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.github.pedrovgs.problem8.SplitArray splitArray0 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array3 = new int[] { (byte) 1, (byte) 10 };
        splitArray0.splitSwappingPartition(i_array3);
        com.github.pedrovgs.problem2.Vector vector5 = new com.github.pedrovgs.problem2.Vector(i_array3);
        int i6 = vector5.size();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(i6 == 2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        vector_i5.trimToSize();
        vector_i5.add((int) (short) 0, (java.lang.Integer) 0);
        java.util.Enumeration<java.lang.Integer> enumeration_i14 = vector_i5.elements();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(enumeration_i14);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.github.pedrovgs.problem34.DotRegularExpression dotRegularExpression0 = new com.github.pedrovgs.problem34.DotRegularExpression();
        java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "/" };
        java.lang.String[] str_array5 = dotRegularExpression0.evaluate(str_array3, "0");
        org.junit.Assert.assertNotNull(str_array3);
        org.junit.Assert.assertNotNull(str_array5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.github.pedrovgs.problem30.ScientificNotation scientificNotation0 = new com.github.pedrovgs.problem30.ScientificNotation();
        try {
            long long2 = scientificNotation0.calculate("BinaryNode{data=100}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        java.util.Iterator<java.lang.Integer> iterator_i12 = vector_i4.iterator();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(iterator_i12);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
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
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.github.pedrovgs.problem7.FibonacciNumbers fibonacciNumbers0 = new com.github.pedrovgs.problem7.FibonacciNumbers();
        try {
            long long2 = fibonacciNumbers0.getRecursive((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
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
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
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
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
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
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        try {
            java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersCheating("BinaryNode{data=100}", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideIterative((int) (byte) 10, (int) (byte) 100);
        float f6 = divideUsingSubtraction0.divideRecursive((int) (byte) 1, (int) '#');
        float f9 = divideUsingSubtraction0.divideRecursive((int) '4', (int) 'a');
        org.junit.Assert.assertTrue(f3 == 0.1f);
        org.junit.Assert.assertTrue(f6 == 0.028571429f);
        org.junit.Assert.assertTrue(f9 == 0.53608245f);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.github.pedrovgs.problem37.PathCalculator pathCalculator0 = new com.github.pedrovgs.problem37.PathCalculator();
        java.lang.String str4 = pathCalculator0.calculate("", "/", "hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "/hi!/" + "'", str4.equals("/hi!/"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
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
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
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
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
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
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.github.pedrovgs.problem68.IsEven isEven0 = new com.github.pedrovgs.problem68.IsEven();
        boolean b2 = isEven0.check((int) (byte) 1);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.github.pedrovgs.problem66.TreeToListByLevel treeToListByLevel0 = new com.github.pedrovgs.problem66.TreeToListByLevel();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
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
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros0 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.github.pedrovgs.problem30.ScientificNotation scientificNotation0 = new com.github.pedrovgs.problem30.ScientificNotation();
        try {
            long long2 = scientificNotation0.calculate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.github.pedrovgs.problem80.QuickSort quickSort0 = new com.github.pedrovgs.problem80.QuickSort();
        com.github.pedrovgs.problem8.SplitArray splitArray1 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array4 = new int[] { (byte) 1, (byte) 10 };
        splitArray1.splitSwappingPartition(i_array4);
        com.github.pedrovgs.problem2.Vector vector6 = new com.github.pedrovgs.problem2.Vector(i_array4);
        quickSort0.sort(i_array4);
        org.junit.Assert.assertNotNull(i_array4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        java.util.Spliterator<java.lang.Integer> spliterator_i10 = vector_i5.spliterator();
        vector_i5.clear();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(spliterator_i10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push((-1));
        stack2_0.removeAllElements();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
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
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
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
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
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
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
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
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
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
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(0);
        int i4 = factorial0.getTailRecursive((int) (byte) 10);
        org.junit.Assert.assertTrue(i2 == 1);
        org.junit.Assert.assertTrue(i4 == 3628800);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideIterative((int) (byte) 10, (int) (byte) 100);
        float f6 = divideUsingSubtraction0.divideIterative((int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue(f3 == 0.1f);
        org.junit.Assert.assertTrue(f6 == 1.0309278f);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.github.pedrovgs.problem25.Anagrams anagrams0 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str2 = anagrams0.get("0");
        java.util.List<java.lang.String> list_str4 = anagrams0.get("0");
        org.junit.Assert.assertNotNull(list_str2);
        org.junit.Assert.assertNotNull(list_str4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
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
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.github.pedrovgs.problem20.MultiplicationWithoutMultiply multiplicationWithoutMultiply0 = new com.github.pedrovgs.problem20.MultiplicationWithoutMultiply();
        int i3 = multiplicationWithoutMultiply0.calculate((-52), (int) (byte) 100);
        org.junit.Assert.assertTrue(i3 == (-5200));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
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
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
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
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
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
        org.junit.Assert.assertNotNull(listnode_i4);
        org.junit.Assert.assertNotNull(listnode_i10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
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
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
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
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push(100);
        int i3 = stack2_0.capacity();
        org.junit.Assert.assertTrue(i3 == 10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
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
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
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
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
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
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral0 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array1 = new int[][] {};
        int[] i_array2 = goThroughMatrixInSpiral0.go(i_array_array1);
        int[] i_array9 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[] i_array16 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[][] i_array_array17 = new int[][] { i_array9, i_array16 };
        int[] i_array18 = goThroughMatrixInSpiral0.go(i_array_array17);
        org.junit.Assert.assertNotNull(i_array_array1);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(i_array18);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
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
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
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
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
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
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
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
        org.junit.Assert.assertNull(listnode_mergeSortedArrays11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
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
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
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
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
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
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
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
        java.lang.Object[] obj_array18 = stack2_0.toArray();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNotNull(obj_array18);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(0);
        int i4 = factorial0.getTailRecursive((int) (byte) 100);
        int i6 = factorial0.getIterative((int) (byte) 0);
        org.junit.Assert.assertTrue(i2 == 1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode0 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        java.lang.String str3 = listnode_mergeSortedArrays2.toString();
        deleteListNode0.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays5 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays6 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays5);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers7 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b8 = listnode_mergeSortedArrays6.equals((java.lang.Object) mergeBinaryNumbers7);
        deleteListNode0.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
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
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.github.pedrovgs.problem62.PalindromeList palindromeList0 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i5 = reverseLinkedList1.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        boolean b6 = palindromeList0.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays7 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays8 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays7);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays9 = listnode_mergeSortedArrays8.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays10 = listnode_mergeSortedArrays8.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i12 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i13 = null;
        binarynode_i12.setRight(binarynode_i13);
        boolean b15 = listnode_mergeSortedArrays8.equals((java.lang.Object) binarynode_i13);
        listnode_mergeSortedArrays3.setNext(listnode_mergeSortedArrays8);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays17 = listnode_mergeSortedArrays8.getData();
        org.junit.Assert.assertNotNull(listnode_i5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays9);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays10);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(mergeSortedArrays17);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.github.pedrovgs.problem69.BitsToTransform bitsToTransform0 = new com.github.pedrovgs.problem69.BitsToTransform();
        int i3 = bitsToTransform0.calculate((int) '#', (int) (short) 0);
        int i6 = bitsToTransform0.calculate(51, (int) 'a');
        org.junit.Assert.assertTrue(i3 == 3);
        org.junit.Assert.assertTrue(i6 == 3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.github.pedrovgs.problem77.HelloWorldWithoutSemicolon helloWorldWithoutSemicolon0 = new com.github.pedrovgs.problem77.HelloWorldWithoutSemicolon();
        helloWorldWithoutSemicolon0.printHelloWorld();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack constantComplexityOrderStack0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.github.pedrovgs.problem78.AutoBoxingTrick autoBoxingTrick0 = new com.github.pedrovgs.problem78.AutoBoxingTrick();
        boolean b3 = autoBoxingTrick0.compare((java.lang.Integer) 0, (java.lang.Integer) 2147483647);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.github.pedrovgs.problem71.ReverseBinaryNumber reverseBinaryNumber0 = new com.github.pedrovgs.problem71.ReverseBinaryNumber();
        int i2 = reverseBinaryNumber0.reverse(1);
        int i4 = reverseBinaryNumber0.reverse((int) (byte) 100);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i4 == 27);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.github.pedrovgs.problem11.IntToString intToString0 = new com.github.pedrovgs.problem11.IntToString();
        java.lang.String str2 = intToString0.transform((int) 'a');
        java.lang.String str4 = intToString0.transform((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97" + "'", str2.equals("97"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
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
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.github.pedrovgs.problem33.SimpleRegularExpression simpleRegularExpression0 = new com.github.pedrovgs.problem33.SimpleRegularExpression();
        boolean b3 = simpleRegularExpression0.evaluate("1", "97");
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
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
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(binarynode_i4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "BinaryNode{data=100}" + "'", str5.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(list_binaryNode11);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
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
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
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
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
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
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
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
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
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
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.github.pedrovgs.problem18.IsBST isBST0 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST1 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i4 = sortedArrayToBST1.transform(i_array3);
        boolean b5 = isBST0.checkRecursive(binarynode_i4);
        boolean b6 = binarynode_i4.hasRight();
        java.lang.Integer i7 = binarynode_i4.getData();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(binarynode_i4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100 + "'", i7.equals(100));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
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
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.github.pedrovgs.problem32.Contains contains0 = new com.github.pedrovgs.problem32.Contains();
        boolean b3 = contains0.evaluate("", "/");
        boolean b6 = contains0.evaluate("[]", "BinaryNode{data=100}");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
        com.github.pedrovgs.linkedlist.ListNode listNode1 = null;
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode3 = findKthElement0.find(listNode1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.github.pedrovgs.problem4.SquareRoot squareRoot0 = new com.github.pedrovgs.problem4.SquareRoot();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
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
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.github.pedrovgs.problem19.BinaryTreeDepth binaryTreeDepth0 = new com.github.pedrovgs.problem19.BinaryTreeDepth();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
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
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
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
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.github.pedrovgs.problem20.MultiplicationWithoutMultiply multiplicationWithoutMultiply0 = new com.github.pedrovgs.problem20.MultiplicationWithoutMultiply();
        int i3 = multiplicationWithoutMultiply0.calculate((int) (byte) -1, (int) (byte) 1);
        int i6 = multiplicationWithoutMultiply0.calculate(10, 27);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue(i6 == 270);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
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
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.github.pedrovgs.problem34.DotRegularExpression dotRegularExpression0 = new com.github.pedrovgs.problem34.DotRegularExpression();
        java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "/hi!/" };
        java.lang.String[] str_array5 = dotRegularExpression0.evaluate(str_array3, "1");
        org.junit.Assert.assertNotNull(str_array3);
        org.junit.Assert.assertNotNull(str_array5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
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
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(0);
        int i4 = factorial0.getIterative(270);
        org.junit.Assert.assertTrue(i2 == 1);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
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
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
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
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder0 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder1 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian2 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i4 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d5 = avlTreeMedian2.find(binarynode_i4);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode6 = binaryTreePreOrder1.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i4);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i7 = binaryTreeInOrder0.getIterative(binarynode_i4);
        org.junit.Assert.assertTrue(d5 == 10.0d);
        org.junit.Assert.assertNotNull(list_binaryNode6);
        org.junit.Assert.assertNotNull(list_binarynode_i7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays0 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays0);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers2 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b3 = listnode_mergeSortedArrays1.equals((java.lang.Object) mergeBinaryNumbers2);
        int i8 = mergeBinaryNumbers2.merge((int) (short) 10, (int) (byte) 0, 107, 107);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
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
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
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
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(10);
        int i4 = factorial0.getTailRecursive((int) (short) 10);
        int i6 = factorial0.getRecursive((int) '#');
        org.junit.Assert.assertTrue(i2 == 3628800);
        org.junit.Assert.assertTrue(i4 == 3628800);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.github.pedrovgs.problem12.MoveZerosInArray moveZerosInArray0 = new com.github.pedrovgs.problem12.MoveZerosInArray();
        com.github.pedrovgs.problem8.SplitArray splitArray1 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray2 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array5 = new int[] { (byte) 1, (byte) 10 };
        splitArray2.splitSwappingPartition(i_array5);
        splitArray1.splitSwappingRecursive(i_array5);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral8 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array9 = new int[][] {};
        int[] i_array10 = goThroughMatrixInSpiral8.go(i_array_array9);
        splitArray1.splitSwappingRecursive(i_array10);
        moveZerosInArray0.moveSorting(i_array10);
        com.github.pedrovgs.problem76.InsertionSort insertionSort13 = new com.github.pedrovgs.problem76.InsertionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray14 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays15 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays16 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays15);
        com.github.pedrovgs.problem8.SplitArray splitArray17 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array20 = new int[] { (byte) 1, (byte) 10 };
        splitArray17.splitSwappingPartition(i_array20);
        int[] i_array28 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray17.splitSwappingRecursive(i_array28);
        com.github.pedrovgs.problem8.SplitArray splitArray30 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array33 = new int[] { (byte) 1, (byte) 10 };
        splitArray30.splitSwappingPartition(i_array33);
        int[] i_array41 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray30.splitSwappingRecursive(i_array41);
        int[] i_array43 = mergeSortedArrays15.merge(i_array28, i_array41);
        splitArray14.splitSwappingIterative(i_array41);
        insertionSort13.sort(i_array41);
        moveZerosInArray0.moveSorting(i_array41);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(i_array43);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.github.pedrovgs.problem73.SubtractAdding subtractAdding0 = new com.github.pedrovgs.problem73.SubtractAdding();
        int i3 = subtractAdding0.subtract((int) '4', (int) (short) 1);
        int i6 = subtractAdding0.subtract(0, (int) 'a');
        int i9 = subtractAdding0.subtract((-1), 51);
        org.junit.Assert.assertTrue(i3 == 51);
        org.junit.Assert.assertTrue(i6 == (-97));
        org.junit.Assert.assertTrue(i9 == (-52));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.github.pedrovgs.problem26.Palindromes palindromes0 = new com.github.pedrovgs.problem26.Palindromes();
        boolean b2 = palindromes0.evaluate("/");
        boolean b4 = palindromes0.evaluate("1");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.github.pedrovgs.problem73.SubtractAdding subtractAdding0 = new com.github.pedrovgs.problem73.SubtractAdding();
        int i3 = subtractAdding0.subtract((int) (short) 0, (int) '4');
        int i6 = subtractAdding0.subtract((int) (byte) 10, (-97));
        int i9 = subtractAdding0.subtract((int) (short) 0, 2);
        org.junit.Assert.assertTrue(i3 == (-52));
        org.junit.Assert.assertTrue(i6 == 107);
        org.junit.Assert.assertTrue(i9 == (-2));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.github.pedrovgs.problem56.IsRotationUsingIsSubstring isRotationUsingIsSubstring0 = new com.github.pedrovgs.problem56.IsRotationUsingIsSubstring();
        boolean b3 = isRotationUsingIsSubstring0.check("hi!", "");
        boolean b6 = isRotationUsingIsSubstring0.check("/", "");
        boolean b9 = isRotationUsingIsSubstring0.check("/hi!/", "0");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
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
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
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
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
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
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
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
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
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
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
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
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
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
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(10);
        int i4 = factorial0.getTailRecursive((int) (short) 10);
        int i6 = factorial0.getRecursive(0);
        org.junit.Assert.assertTrue(i2 == 3628800);
        org.junit.Assert.assertTrue(i4 == 3628800);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.github.pedrovgs.problem56.IsRotationUsingIsSubstring isRotationUsingIsSubstring0 = new com.github.pedrovgs.problem56.IsRotationUsingIsSubstring();
        boolean b3 = isRotationUsingIsSubstring0.check("", "");
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
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
        com.github.pedrovgs.problem75.SelectionSort selectionSort31 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray32 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array35 = new int[] { (byte) 1, (byte) 10 };
        splitArray32.splitSwappingPartition(i_array35);
        selectionSort31.sort(i_array35);
        com.github.pedrovgs.problem76.InsertionSort insertionSort38 = new com.github.pedrovgs.problem76.InsertionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray39 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays40 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays41 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays40);
        com.github.pedrovgs.problem8.SplitArray splitArray42 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array45 = new int[] { (byte) 1, (byte) 10 };
        splitArray42.splitSwappingPartition(i_array45);
        int[] i_array53 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray42.splitSwappingRecursive(i_array53);
        com.github.pedrovgs.problem8.SplitArray splitArray55 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array58 = new int[] { (byte) 1, (byte) 10 };
        splitArray55.splitSwappingPartition(i_array58);
        int[] i_array66 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray55.splitSwappingRecursive(i_array66);
        int[] i_array68 = mergeSortedArrays40.merge(i_array53, i_array66);
        splitArray39.splitSwappingIterative(i_array66);
        insertionSort38.sort(i_array66);
        selectionSort31.sort(i_array66);
        com.github.pedrovgs.problem8.SplitArray splitArray72 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray73 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array76 = new int[] { (byte) 1, (byte) 10 };
        splitArray73.splitSwappingPartition(i_array76);
        splitArray72.splitSwappingRecursive(i_array76);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral79 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array80 = new int[][] {};
        int[] i_array81 = goThroughMatrixInSpiral79.go(i_array_array80);
        splitArray72.splitSwappingRecursive(i_array81);
        selectionSort31.sort(i_array81);
        splitArray0.splitSwappingPartition(i_array81);
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array66);
        org.junit.Assert.assertNotNull(i_array68);
        org.junit.Assert.assertNotNull(i_array76);
        org.junit.Assert.assertNotNull(i_array_array80);
        org.junit.Assert.assertNotNull(i_array81);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
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
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
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
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
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
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.github.pedrovgs.problem11.IntToString intToString0 = new com.github.pedrovgs.problem11.IntToString();
        java.lang.String str2 = intToString0.transform((-52));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-52" + "'", str2.equals("-52"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
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
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
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
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
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
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.github.pedrovgs.problem72.FindTheMissingNumber findTheMissingNumber0 = new com.github.pedrovgs.problem72.FindTheMissingNumber();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem72.FindTheMissingNumber> listnode_findTheMissingNumber1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem72.FindTheMissingNumber>(findTheMissingNumber0);
        com.github.pedrovgs.problem80.QuickSort quickSort2 = new com.github.pedrovgs.problem80.QuickSort();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort4 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray5 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array8 = new int[] { (byte) 1, (byte) 10 };
        splitArray5.splitSwappingPartition(i_array8);
        selectionSort4.sort(i_array8);
        com.github.pedrovgs.problem8.SplitArray splitArray11 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array14 = new int[] { (byte) 1, (byte) 10 };
        splitArray11.splitSwappingPartition(i_array14);
        int[] i_array22 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray11.splitSwappingRecursive(i_array22);
        int[] i_array24 = mergeSortedArrays3.merge(i_array8, i_array22);
        quickSort2.sort(i_array8);
        int i26 = findTheMissingNumber0.find(i_array8);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertTrue(i26 == (-8));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
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
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.github.pedrovgs.problem26.Palindromes palindromes0 = new com.github.pedrovgs.problem26.Palindromes();
        boolean b2 = palindromes0.evaluate("/");
        boolean b4 = palindromes0.evaluate("[null]");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_0.push((int) (byte) 10);
        stack1_0.push((-5200));
        stack1_0.push(3);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.github.pedrovgs.problem50.UniqueChars uniqueChars0 = new com.github.pedrovgs.problem50.UniqueChars();
        boolean b2 = uniqueChars0.evaluate2("/!ih/");
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        boolean b13 = vector_i4.contains((java.lang.Object) (byte) 100);
        int i16 = vector_i4.lastIndexOf((java.lang.Object) (-5200), 3);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i16 == (-1));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
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
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.github.pedrovgs.problem29.AreAnagrams areAnagrams0 = new com.github.pedrovgs.problem29.AreAnagrams();
        boolean b3 = areAnagrams0.check("1", "97");
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.github.pedrovgs.problem56.IsRotationUsingIsSubstring isRotationUsingIsSubstring0 = new com.github.pedrovgs.problem56.IsRotationUsingIsSubstring();
        boolean b3 = isRotationUsingIsSubstring0.check("", "[]");
        boolean b6 = isRotationUsingIsSubstring0.check("/hi!/", "hi!");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
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
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays9);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array38);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
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
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.github.pedrovgs.problem11.IntToString intToString0 = new com.github.pedrovgs.problem11.IntToString();
        java.lang.String str2 = intToString0.transform((int) '#');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "35" + "'", str2.equals("35"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
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
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral0 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array1 = new int[][] {};
        int[] i_array2 = goThroughMatrixInSpiral0.go(i_array_array1);
        int[] i_array5 = new int[] { 107, 3628800 };
        int[][] i_array_array6 = new int[][] { i_array5 };
        int[] i_array7 = goThroughMatrixInSpiral0.go(i_array_array6);
        org.junit.Assert.assertNotNull(i_array_array1);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(i_array7);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push((-1));
        java.util.Enumeration<java.lang.Integer> enumeration_i3 = stack2_0.elements();
        org.junit.Assert.assertNotNull(enumeration_i3);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.github.pedrovgs.problem51.ReverseString reverseString0 = new com.github.pedrovgs.problem51.ReverseString();
        java.lang.String str2 = reverseString0.reverseRecursive("/hi!/");
        java.lang.String str4 = reverseString0.reverseIterative("/");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/!ih/" + "'", str2.equals("/!ih/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "/" + "'", str4.equals("/"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
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
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
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
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(listNode11);
        org.junit.Assert.assertNotNull(listNode18);
        org.junit.Assert.assertNotNull(listNode26);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
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
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
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
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.github.pedrovgs.problem27.ReverseSentence reverseSentence0 = new com.github.pedrovgs.problem27.ReverseSentence();
        java.lang.String str2 = reverseSentence0.reverse("BinaryNode{data=100}");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BinaryNode{data=100}" + "'", str2.equals("BinaryNode{data=100}"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.github.pedrovgs.problem50.UniqueChars uniqueChars0 = new com.github.pedrovgs.problem50.UniqueChars();
        boolean b2 = uniqueChars0.evaluate2("/hi!/");
        boolean b4 = uniqueChars0.evaluate2("1");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
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
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.github.pedrovgs.problem20.MultiplicationWithoutMultiply multiplicationWithoutMultiply0 = new com.github.pedrovgs.problem20.MultiplicationWithoutMultiply();
        int i3 = multiplicationWithoutMultiply0.calculate(270, (-52));
        org.junit.Assert.assertTrue(i3 == (-14040));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.github.pedrovgs.problem53.CompressString compressString0 = new com.github.pedrovgs.problem53.CompressString();
        java.lang.String str2 = compressString0.compressRecursive("97");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97" + "'", str2.equals("97"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        vector_i5.trimToSize();
        vector_i5.add((int) (short) 0, (java.lang.Integer) 0);
        java.util.stream.Stream<java.lang.Integer> stream_i14 = vector_i5.stream();
        vector_i5.ensureCapacity(100);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(stream_i14);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
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
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
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
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.github.pedrovgs.problem32.Contains contains0 = new com.github.pedrovgs.problem32.Contains();
        boolean b3 = contains0.evaluate("", "/");
        boolean b6 = contains0.evaluate("0", "/hi!/");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
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
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
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
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
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
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        try {
            int i2 = factorial0.getRecursive((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
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
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
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
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList14 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements15 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList16 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays17 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays18 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays17);
        java.lang.String str19 = listnode_mergeSortedArrays18.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode20 = reverseLinkedList16.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays18);
        removeListDuplicatedElements15.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode20);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i22 = getTheElementInTheMiddleOfTheList14.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode20);
        removeListDuplicatedElements0.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode20);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(listNode11);
        org.junit.Assert.assertNotNull(listNode20);
        org.junit.Assert.assertNotNull(listnode_i22);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        try {
            java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersCheating("hi!", "97");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.github.pedrovgs.problem51.ReverseString reverseString0 = new com.github.pedrovgs.problem51.ReverseString();
        java.lang.String str2 = reverseString0.reverseRecursive("/hi!/");
        java.lang.String str4 = reverseString0.reverseIterative("hi!");
        java.lang.String str6 = reverseString0.reverseIterative("1");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/!ih/" + "'", str2.equals("/!ih/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "!ih" + "'", str4.equals("!ih"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
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
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.github.pedrovgs.problem37.PathCalculator pathCalculator0 = new com.github.pedrovgs.problem37.PathCalculator();
        java.lang.String str4 = pathCalculator0.calculate("!ih", "hi!", "/");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "/!ih/hi!/" + "'", str4.equals("/!ih/hi!/"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
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
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        try {
            java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("/!ih/", "[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
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
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.github.pedrovgs.problem62.PalindromeList palindromeList0 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem62.PalindromeList palindromeList1 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList2 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i6 = reverseLinkedList2.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        boolean b7 = palindromeList1.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        boolean b8 = palindromeList0.checkReversing((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        org.junit.Assert.assertNotNull(listnode_i6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
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
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
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
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
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
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
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
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST0 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i3 = sortedArrayToBST0.transform(i_array2);
        boolean b4 = binarynode_i3.hasRight();
        java.lang.Integer i5 = binarynode_i3.getData();
        boolean b6 = binarynode_i3.hasRight();
        boolean b7 = binarynode_i3.hasRight();
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(binarynode_i3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + i5 + "' != '" + 100 + "'", i5.equals(100));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }
}


