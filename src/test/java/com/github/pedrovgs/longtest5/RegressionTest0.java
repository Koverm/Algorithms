package com.github.pedrovgs.longtest5;

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
        java.util.stream.Stream<java.lang.Integer> stream_i8 = vector_i4.parallelStream();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(stream_i8);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.github.pedrovgs.problem38.PathToEveryLeaf pathToEveryLeaf0 = new com.github.pedrovgs.problem38.PathToEveryLeaf();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i1 = null;
        try {
            java.util.List<java.util.List<com.github.pedrovgs.binarytree.BinaryNode>> list_list_binaryNode2 = pathToEveryLeaf0.calculate(binarynode_i1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        boolean b9 = vector_i4.add((java.lang.Integer) 10);
        boolean b11 = vector_i4.remove((java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.github.pedrovgs.problem25.Anagrams anagrams0 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str2 = anagrams0.get("hi!");
        org.junit.Assert.assertNotNull(list_str2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.lang.Object obj8 = vector_i4.clone();
        boolean b10 = vector_i4.add((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.github.pedrovgs.problem27.ReverseSentence reverseSentence0 = new com.github.pedrovgs.problem27.ReverseSentence();
        java.lang.String str2 = reverseSentence0.reverse("hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
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
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.github.pedrovgs.problem7.FibonacciNumbers fibonacciNumbers0 = new com.github.pedrovgs.problem7.FibonacciNumbers();
        try {
            long long2 = fibonacciNumbers0.getRecursive((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.String str0 = com.github.pedrovgs.problem37.PathCalculator.DIR_SEPARATOR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/" + "'", str0.equals("/"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements0 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i1 = null;
        try {
            removeListDuplicatedElements0.remove2(listnode_i1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Integer[] i_array1 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i2 = new java.util.Stack<java.lang.Integer>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i2, i_array1);
        boolean b4 = stack_i2.empty();
        int i5 = stack_i2.size();
        org.junit.Assert.assertNotNull(i_array1);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.github.pedrovgs.problem8.SplitArray splitArray0 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array3 = new int[] { (byte) 1, (byte) 10 };
        splitArray0.splitSwappingPartition(i_array3);
        com.github.pedrovgs.problem2.Vector vector5 = new com.github.pedrovgs.problem2.Vector(i_array3);
        int i6 = vector5.size();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(i6 == 2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
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
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST0 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i3 = sortedArrayToBST0.transform(i_array2);
        boolean b4 = binarynode_i3.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = binarynode_i3.getRight();
        java.lang.Integer i6 = binarynode_i3.getData();
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(binarynode_i3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(binarynode_i5);
        org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100 + "'", i6.equals(100));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnPowersOfTwo("", "");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.github.pedrovgs.problem34.DotRegularExpression dotRegularExpression0 = new com.github.pedrovgs.problem34.DotRegularExpression();
        java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "/" };
        java.lang.String[] str_array5 = dotRegularExpression0.evaluate(str_array3, "0");
        org.junit.Assert.assertNotNull(str_array3);
        org.junit.Assert.assertNotNull(str_array5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.github.pedrovgs.problem30.ScientificNotation scientificNotation0 = new com.github.pedrovgs.problem30.ScientificNotation();
        try {
            long long2 = scientificNotation0.calculate("BinaryNode{data=100}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
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
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
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
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST0 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i3 = sortedArrayToBST0.transform(i_array2);
        boolean b4 = binarynode_i3.hasRight();
        java.lang.Integer i5 = binarynode_i3.getData();
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(binarynode_i3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + i5 + "' != '" + 100 + "'", i5.equals(100));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.github.pedrovgs.problem7.FibonacciNumbers fibonacciNumbers0 = new com.github.pedrovgs.problem7.FibonacciNumbers();
        try {
            long long2 = fibonacciNumbers0.getRecursive((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
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
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.github.pedrovgs.problem48.WordSearch wordSearch0 = new com.github.pedrovgs.problem48.WordSearch();
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
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
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
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.github.pedrovgs.problem72.FindTheMissingNumber findTheMissingNumber0 = new com.github.pedrovgs.problem72.FindTheMissingNumber();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem72.FindTheMissingNumber> listnode_findTheMissingNumber1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem72.FindTheMissingNumber>(findTheMissingNumber0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
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
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.Integer[] i_array1 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i2 = new java.util.Stack<java.lang.Integer>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i2, i_array1);
        boolean b4 = stack_i2.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST5 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i6 = stack_i2.search((java.lang.Object) sortedArrayToBST5);
        org.junit.Assert.assertNotNull(i_array1);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i6 == (-1));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        try {
            java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersCheating("BinaryNode{data=100}", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideIterative((int) (byte) 10, (int) (byte) 100);
        float f6 = divideUsingSubtraction0.divideRecursive((int) (byte) 1, (int) '#');
        float f9 = divideUsingSubtraction0.divideRecursive((int) '4', (int) 'a');
        org.junit.Assert.assertTrue(f3 == 0.1f);
        org.junit.Assert.assertTrue(f6 == 0.028571429f);
        org.junit.Assert.assertTrue(f9 == 0.53608245f);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.github.pedrovgs.problem37.PathCalculator pathCalculator0 = new com.github.pedrovgs.problem37.PathCalculator();
        java.lang.String str4 = pathCalculator0.calculate("", "/", "hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "/hi!/" + "'", str4.equals("/hi!/"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.github.pedrovgs.problem78.AutoBoxingTrick autoBoxingTrick0 = new com.github.pedrovgs.problem78.AutoBoxingTrick();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.github.pedrovgs.problem20.MultiplicationWithoutMultiply multiplicationWithoutMultiply0 = new com.github.pedrovgs.problem20.MultiplicationWithoutMultiply();
        int i3 = multiplicationWithoutMultiply0.calculate((int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue(i3 == (-1));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.github.pedrovgs.problem68.IsEven isEven0 = new com.github.pedrovgs.problem68.IsEven();
        boolean b2 = isEven0.check((int) (byte) 1);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.github.pedrovgs.problem66.TreeToListByLevel treeToListByLevel0 = new com.github.pedrovgs.problem66.TreeToListByLevel();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.github.pedrovgs.problem32.Contains contains0 = new com.github.pedrovgs.problem32.Contains();
        boolean b3 = contains0.evaluate("", "/");
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
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
        boolean b13 = vector_i4.contains((java.lang.Object) (byte) 100);
        java.util.Enumeration<java.lang.Integer> enumeration_i14 = vector_i4.elements();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(enumeration_i14);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.github.pedrovgs.problem71.ReverseBinaryNumber reverseBinaryNumber0 = new com.github.pedrovgs.problem71.ReverseBinaryNumber();
        int i2 = reverseBinaryNumber0.reverse(1);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
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
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros0 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
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
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces0 = new com.github.pedrovgs.problem52.ReplaceSpaces();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.github.pedrovgs.problem30.ScientificNotation scientificNotation0 = new com.github.pedrovgs.problem30.ScientificNotation();
        try {
            long long2 = scientificNotation0.calculate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
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
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
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
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.github.pedrovgs.problem80.QuickSort quickSort0 = new com.github.pedrovgs.problem80.QuickSort();
        com.github.pedrovgs.problem8.SplitArray splitArray1 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array4 = new int[] { (byte) 1, (byte) 10 };
        splitArray1.splitSwappingPartition(i_array4);
        com.github.pedrovgs.problem2.Vector vector6 = new com.github.pedrovgs.problem2.Vector(i_array4);
        quickSort0.sort(i_array4);
        org.junit.Assert.assertNotNull(i_array4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.github.pedrovgs.problem31.FindLongestConsecutiveSequence findLongestConsecutiveSequence0 = new com.github.pedrovgs.problem31.FindLongestConsecutiveSequence();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.github.pedrovgs.problem32.Contains contains0 = new com.github.pedrovgs.problem32.Contains();
        boolean b3 = contains0.evaluate("BinaryNode{data=100}", "");
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.lang.Object obj8 = vector_i4.clone();
        java.lang.Integer i9 = vector_i4.firstElement();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0 + "'", i9.equals(0));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
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
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
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
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.github.pedrovgs.problem61.SumLists sumLists0 = null;
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem61.SumLists> listnode_sumLists1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem61.SumLists>(sumLists0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        java.util.Enumeration<java.lang.Integer> enumeration_i10 = vector_i4.elements();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(enumeration_i10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.github.pedrovgs.problem73.SubtractAdding subtractAdding0 = new com.github.pedrovgs.problem73.SubtractAdding();
        int i3 = subtractAdding0.subtract((int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue(i3 == (-52));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideIterative((int) (byte) 10, (int) (byte) 100);
        float f6 = divideUsingSubtraction0.divideIterative(1, (int) (short) 100);
        org.junit.Assert.assertTrue(f3 == 0.1f);
        org.junit.Assert.assertTrue(f6 == 0.01f);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push((-1));
        stack2_0.removeAllElements();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
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
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i13 = binarynode_i5.getLeft();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(binarynode_i5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(binarynode_i10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(binarynode_i13);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_0.push((int) (byte) 10);
        int i3 = stack1_0.getMin();
        int i4 = stack1_0.getMin();
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertTrue(i4 == 10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST0 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i3 = sortedArrayToBST0.transform(i_array2);
        java.lang.String str4 = binarynode_i3.toString();
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_5 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_5.push((int) (byte) 10);
        int i8 = stack1_5.getMin();
        boolean b9 = binarynode_i3.equals((java.lang.Object) stack1_5);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(binarynode_i3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "BinaryNode{data=100}" + "'", str4.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.github.pedrovgs.problem69.BitsToTransform bitsToTransform0 = new com.github.pedrovgs.problem69.BitsToTransform();
        int i3 = bitsToTransform0.calculate((int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue(i3 == 3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
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
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
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
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.github.pedrovgs.problem47.ReturnChange returnChange0 = new com.github.pedrovgs.problem47.ReturnChange();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays0 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.problem75.SelectionSort selectionSort1 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray2 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array5 = new int[] { (byte) 1, (byte) 10 };
        splitArray2.splitSwappingPartition(i_array5);
        selectionSort1.sort(i_array5);
        com.github.pedrovgs.problem8.SplitArray splitArray8 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array11 = new int[] { (byte) 1, (byte) 10 };
        splitArray8.splitSwappingPartition(i_array11);
        int[] i_array19 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray8.splitSwappingRecursive(i_array19);
        int[] i_array21 = mergeSortedArrays0.merge(i_array5, i_array19);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array21);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        java.lang.Integer i12 = vector_i4.firstElement();
        vector_i4.setSize(10);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0 + "'", i12.equals(0));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(0);
        int i4 = factorial0.getTailRecursive((int) (byte) 100);
        org.junit.Assert.assertTrue(i2 == 1);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
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
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.github.pedrovgs.problem8.SplitArray splitArray0 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray1 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array4 = new int[] { (byte) 1, (byte) 10 };
        splitArray1.splitSwappingPartition(i_array4);
        splitArray0.splitSwappingRecursive(i_array4);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral7 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array8 = new int[][] {};
        int[] i_array9 = goThroughMatrixInSpiral7.go(i_array_array8);
        splitArray0.splitSwappingRecursive(i_array9);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array9);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
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
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.github.pedrovgs.problem73.SubtractAdding subtractAdding0 = new com.github.pedrovgs.problem73.SubtractAdding();
        int i3 = subtractAdding0.subtract((int) '4', (int) (short) 1);
        int i6 = subtractAdding0.subtract(0, (int) 'a');
        org.junit.Assert.assertTrue(i3 == 51);
        org.junit.Assert.assertTrue(i6 == (-97));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
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
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(0);
        int i4 = factorial0.getTailRecursive((int) (byte) 10);
        org.junit.Assert.assertTrue(i2 == 1);
        org.junit.Assert.assertTrue(i4 == 3628800);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideIterative((int) (byte) 10, (int) (byte) 100);
        float f6 = divideUsingSubtraction0.divideIterative((int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue(f3 == 0.1f);
        org.junit.Assert.assertTrue(f6 == 1.0309278f);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.github.pedrovgs.problem25.Anagrams anagrams0 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str2 = anagrams0.get("0");
        java.util.List<java.lang.String> list_str4 = anagrams0.get("0");
        org.junit.Assert.assertNotNull(list_str2);
        org.junit.Assert.assertNotNull(list_str4);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.github.pedrovgs.problem16.BinaryTreePostOrder binaryTreePostOrder0 = new com.github.pedrovgs.problem16.BinaryTreePostOrder();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.github.pedrovgs.problem75.SelectionSort selectionSort0 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray1 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array4 = new int[] { (byte) 1, (byte) 10 };
        splitArray1.splitSwappingPartition(i_array4);
        selectionSort0.sort(i_array4);
        com.github.pedrovgs.problem76.InsertionSort insertionSort7 = new com.github.pedrovgs.problem76.InsertionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray8 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays9 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays10 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays9);
        com.github.pedrovgs.problem8.SplitArray splitArray11 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array14 = new int[] { (byte) 1, (byte) 10 };
        splitArray11.splitSwappingPartition(i_array14);
        int[] i_array22 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray11.splitSwappingRecursive(i_array22);
        com.github.pedrovgs.problem8.SplitArray splitArray24 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array27 = new int[] { (byte) 1, (byte) 10 };
        splitArray24.splitSwappingPartition(i_array27);
        int[] i_array35 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray24.splitSwappingRecursive(i_array35);
        int[] i_array37 = mergeSortedArrays9.merge(i_array22, i_array35);
        splitArray8.splitSwappingIterative(i_array35);
        insertionSort7.sort(i_array35);
        selectionSort0.sort(i_array35);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array37);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays0 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays0);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers2 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b3 = listnode_mergeSortedArrays1.equals((java.lang.Object) mergeBinaryNumbers2);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
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
        com.github.pedrovgs.problem76.InsertionSort insertionSort31 = new com.github.pedrovgs.problem76.InsertionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray32 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays33 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays34 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays33);
        com.github.pedrovgs.problem8.SplitArray splitArray35 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array38 = new int[] { (byte) 1, (byte) 10 };
        splitArray35.splitSwappingPartition(i_array38);
        int[] i_array46 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray35.splitSwappingRecursive(i_array46);
        com.github.pedrovgs.problem8.SplitArray splitArray48 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array51 = new int[] { (byte) 1, (byte) 10 };
        splitArray48.splitSwappingPartition(i_array51);
        int[] i_array59 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray48.splitSwappingRecursive(i_array59);
        int[] i_array61 = mergeSortedArrays33.merge(i_array46, i_array59);
        splitArray32.splitSwappingIterative(i_array59);
        insertionSort31.sort(i_array59);
        splitArray0.splitSwappingRecursive(i_array59);
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array59);
        org.junit.Assert.assertNotNull(i_array61);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.github.pedrovgs.problem56.IsRotationUsingIsSubstring isRotationUsingIsSubstring0 = new com.github.pedrovgs.problem56.IsRotationUsingIsSubstring();
        boolean b3 = isRotationUsingIsSubstring0.check("hi!", "");
        boolean b6 = isRotationUsingIsSubstring0.check("/", "");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
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
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.github.pedrovgs.problem11.IntToString intToString0 = new com.github.pedrovgs.problem11.IntToString();
        java.lang.String str2 = intToString0.transform((int) 'a');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97" + "'", str2.equals("97"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.github.pedrovgs.problem20.MultiplicationWithoutMultiply multiplicationWithoutMultiply0 = new com.github.pedrovgs.problem20.MultiplicationWithoutMultiply();
        int i3 = multiplicationWithoutMultiply0.calculate((-52), (int) (byte) 100);
        org.junit.Assert.assertTrue(i3 == (-5200));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
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
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements0 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode5 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        removeListDuplicatedElements0.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode5);
        org.junit.Assert.assertNotNull(listNode5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
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
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
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
        java.lang.String str13 = binarynode_i9.toString();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(binarynode_i4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(binarynode_i9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(binarynode_i11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "BinaryNode{data=100}" + "'", str13.equals("BinaryNode{data=100}"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
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
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
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
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("0", "");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
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
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        java.lang.Integer i12 = vector_i4.firstElement();
        java.lang.Integer i13 = vector_i4.lastElement();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0 + "'", i12.equals(0));
        org.junit.Assert.assertTrue("'" + i13 + "' != '" + (-1) + "'", i13.equals((-1)));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
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
        org.junit.Assert.assertNotNull(listnode_i5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
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
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push(100);
        int i3 = stack2_0.capacity();
        org.junit.Assert.assertTrue(i3 == 10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.github.pedrovgs.problem50.UniqueChars uniqueChars0 = new com.github.pedrovgs.problem50.UniqueChars();
        boolean b2 = uniqueChars0.evaluate2("/hi!/");
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.github.pedrovgs.problem51.ReverseString reverseString0 = new com.github.pedrovgs.problem51.ReverseString();
        java.lang.String str2 = reverseString0.reverseRecursive("/hi!/");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/!ih/" + "'", str2.equals("/!ih/"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 0, 0 };
        java.util.Vector<java.lang.Integer> vector_i3 = new java.util.Vector<java.lang.Integer>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i3, i_array2);
        java.lang.Object obj5 = vector_i3.clone();
        int i6 = vector_i3.size();
        java.lang.Integer i8 = vector_i3.remove((int) (short) 1);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0 + "'", i8.equals(0));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
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
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.github.pedrovgs.problem33.SimpleRegularExpression simpleRegularExpression0 = new com.github.pedrovgs.problem33.SimpleRegularExpression();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.github.pedrovgs.problem77.HelloWorldWithoutSemicolon helloWorldWithoutSemicolon0 = new com.github.pedrovgs.problem77.HelloWorldWithoutSemicolon();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
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
        org.junit.Assert.assertNull(listnode_mergeSortedArrays3);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(listNode10);
    }
}


