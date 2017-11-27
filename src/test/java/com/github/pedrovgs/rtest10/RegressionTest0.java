package com.github.pedrovgs.rtest10;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.github.pedrovgs.problem74.BubbleSort bubbleSort0 = new com.github.pedrovgs.problem74.BubbleSort();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.github.pedrovgs.problem44.FindMinNumberAtPosition findMinNumberAtPosition0 = new com.github.pedrovgs.problem44.FindMinNumberAtPosition();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.github.pedrovgs.problem73.SubtractAdding subtractAdding0 = new com.github.pedrovgs.problem73.SubtractAdding();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.github.pedrovgs.problem71.ReverseBinaryNumber reverseBinaryNumber0 = new com.github.pedrovgs.problem71.ReverseBinaryNumber();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.github.pedrovgs.problem54.RotateMatrix rotateMatrix0 = new com.github.pedrovgs.problem54.RotateMatrix();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.github.pedrovgs.problem20.MultiplicationWithoutMultiply multiplicationWithoutMultiply0 = new com.github.pedrovgs.problem20.MultiplicationWithoutMultiply();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.github.pedrovgs.problem43.CombinationOfIntegers combinationOfIntegers0 = new com.github.pedrovgs.problem43.CombinationOfIntegers();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.github.pedrovgs.problem37.PathCalculator pathCalculator0 = new com.github.pedrovgs.problem37.PathCalculator();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.github.pedrovgs.problem23.RemoveComments removeComments0 = new com.github.pedrovgs.problem23.RemoveComments();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral0 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.github.pedrovgs.problem30.ScientificNotation scientificNotation0 = new com.github.pedrovgs.problem30.ScientificNotation();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.github.pedrovgs.problem56.IsRotationUsingIsSubstring isRotationUsingIsSubstring0 = new com.github.pedrovgs.problem56.IsRotationUsingIsSubstring();
        boolean b3 = isRotationUsingIsSubstring0.check("hi!", "");
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.github.pedrovgs.problem35.AsteriskRegularExpression asteriskRegularExpression0 = new com.github.pedrovgs.problem35.AsteriskRegularExpression();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
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
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.github.pedrovgs.problem18.IsBST isBST0 = new com.github.pedrovgs.problem18.IsBST();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.github.pedrovgs.problem38.PathToEveryLeaf pathToEveryLeaf0 = new com.github.pedrovgs.problem38.PathToEveryLeaf();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i1 = null;
        try {
            java.util.List<java.util.List<com.github.pedrovgs.binarytree.BinaryNode>> list_list_binaryNode2 = pathToEveryLeaf0.calculate(binarynode_i1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
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
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.github.pedrovgs.problem68.IsEven isEven0 = new com.github.pedrovgs.problem68.IsEven();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.github.pedrovgs.problem25.Anagrams anagrams0 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str2 = anagrams0.get("hi!");
        org.junit.Assert.assertNotNull(list_str2);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 0, 0 };
        java.util.Vector<java.lang.Integer> vector_i3 = new java.util.Vector<java.lang.Integer>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i3, i_array2);
        java.lang.Object obj5 = vector_i3.clone();
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
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
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
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
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.github.pedrovgs.problem27.ReverseSentence reverseSentence0 = new com.github.pedrovgs.problem27.ReverseSentence();
        java.lang.String str2 = reverseSentence0.reverse("hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.github.pedrovgs.problem11.IntToString intToString0 = new com.github.pedrovgs.problem11.IntToString();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays0 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays0);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = listnode_mergeSortedArrays1.getNext();
        org.junit.Assert.assertNull(listnode_mergeSortedArrays2);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange1 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange2 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "", combinationsOfChange1);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideIterative((int) (byte) 10, (int) (byte) 100);
        float f6 = divideUsingSubtraction0.divideRecursive((int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue(f3 == 0.1f);
        org.junit.Assert.assertTrue(f6 == 0.028571429f);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
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
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.github.pedrovgs.problem7.FibonacciNumbers fibonacciNumbers0 = new com.github.pedrovgs.problem7.FibonacciNumbers();
        try {
            long long2 = fibonacciNumbers0.getRecursive((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.github.pedrovgs.problem76.InsertionSort insertionSort0 = new com.github.pedrovgs.problem76.InsertionSort();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.lang.String str0 = com.github.pedrovgs.problem37.PathCalculator.DIR_SEPARATOR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/" + "'", str0.equals("/"));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers0 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
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
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements0 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i1 = null;
        try {
            removeListDuplicatedElements0.remove2(listnode_i1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.github.pedrovgs.problem34.DotRegularExpression dotRegularExpression0 = new com.github.pedrovgs.problem34.DotRegularExpression();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays0 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays0);
        java.lang.String str2 = listnode_mergeSortedArrays1.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays1.setData(mergeSortedArrays3);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList0 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        java.lang.String str3 = listnode_mergeSortedArrays2.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode4 = reverseLinkedList0.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2);
        org.junit.Assert.assertNotNull(listNode4);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.github.pedrovgs.problem8.SplitArray splitArray0 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray1 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array4 = new int[] { (byte) 1, (byte) 10 };
        splitArray1.splitSwappingPartition(i_array4);
        splitArray0.splitSwappingRecursive(i_array4);
        org.junit.Assert.assertNotNull(i_array4);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays0 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays1 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays0);
        com.github.pedrovgs.problem8.SplitArray splitArray2 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array5 = new int[] { (byte) 1, (byte) 10 };
        splitArray2.splitSwappingPartition(i_array5);
        int[] i_array13 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray2.splitSwappingRecursive(i_array13);
        com.github.pedrovgs.problem8.SplitArray splitArray15 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array18 = new int[] { (byte) 1, (byte) 10 };
        splitArray15.splitSwappingPartition(i_array18);
        int[] i_array26 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray15.splitSwappingRecursive(i_array26);
        int[] i_array28 = mergeSortedArrays0.merge(i_array13, i_array26);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array28);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.github.pedrovgs.problem69.BitsToTransform bitsToTransform0 = new com.github.pedrovgs.problem69.BitsToTransform();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        int i9 = vector_i4.indexOf((java.lang.Object) 1);
        int i11 = vector_i4.indexOf((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i11 == (-1));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
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
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.github.pedrovgs.problem32.Contains contains0 = new com.github.pedrovgs.problem32.Contains();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST0 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i3 = sortedArrayToBST0.transform(i_array2);
        java.lang.String str4 = binarynode_i3.toString();
        java.lang.Integer i5 = binarynode_i3.getData();
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(binarynode_i3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "BinaryNode{data=100}" + "'", str4.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue("'" + i5 + "' != '" + 100 + "'", i5.equals(100));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        vector_i5.trimToSize();
        vector_i5.add((int) (short) 0, (java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_0.push((int) (byte) 10);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
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
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
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
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.github.pedrovgs.problem8.SplitArray splitArray0 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array3 = new int[] { (byte) 1, (byte) 10 };
        splitArray0.splitSwappingPartition(i_array3);
        com.github.pedrovgs.problem2.Vector vector5 = new com.github.pedrovgs.problem2.Vector(i_array3);
        int i6 = vector5.size();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(i6 == 2);
    }
}