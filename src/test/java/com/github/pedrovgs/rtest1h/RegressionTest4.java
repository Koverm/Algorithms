package com.github.pedrovgs.rtest1h;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test001");
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST0 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i3 = sortedArrayToBST0.transform(i_array2);
        java.lang.Integer i4 = binarynode_i3.getData();
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(binarynode_i3);
        org.junit.Assert.assertTrue("'" + i4 + "' != '" + 100 + "'", i4.equals(100));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test002");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push(100);
        java.lang.Object[] obj_array3 = stack2_0.toArray();
        java.util.stream.Stream<java.lang.Integer> stream_i4 = stack2_0.parallelStream();
        int i5 = stack2_0.getMin();
        stack2_0.push(720);
        java.lang.Integer i8 = stack2_0.pop();
        java.util.stream.Stream<java.lang.Integer> stream_i9 = stack2_0.parallelStream();
        java.util.stream.Stream<java.lang.Integer> stream_i10 = stack2_0.parallelStream();
        try {
            java.lang.Integer i12 = stack2_0.elementAt(1073741853);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(stream_i4);
        org.junit.Assert.assertTrue(i5 == 100);
        org.junit.Assert.assertTrue("'" + i8 + "' != '" + 720 + "'", i8.equals(720));
        org.junit.Assert.assertNotNull(stream_i9);
        org.junit.Assert.assertNotNull(stream_i10);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test003");
        com.github.pedrovgs.problem50.UniqueChars uniqueChars0 = new com.github.pedrovgs.problem50.UniqueChars();
        boolean b2 = uniqueChars0.evaluate2("35");
        boolean b4 = uniqueChars0.evaluate("1");
        boolean b6 = uniqueChars0.evaluate2("/[-1]/7463847412/");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test004");
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
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList27 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements28 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList29 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays30 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays31 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays30);
        java.lang.String str32 = listnode_mergeSortedArrays31.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode33 = reverseLinkedList29.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays31);
        removeListDuplicatedElements28.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode33);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i35 = getTheElementInTheMiddleOfTheList27.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode33);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i36 = getTheElementInTheMiddleOfTheList0.get((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode33);
        java.lang.String str37 = listNode33.toString();
        org.junit.Assert.assertNotNull(listNode6);
        org.junit.Assert.assertNotNull(listnode_i8);
        org.junit.Assert.assertNotNull(listnode_i13);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays17);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays18);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(listNode24);
        org.junit.Assert.assertNotNull(listNode25);
        org.junit.Assert.assertNotNull(listnode_i26);
        org.junit.Assert.assertNotNull(listNode33);
        org.junit.Assert.assertNotNull(listnode_i35);
        org.junit.Assert.assertNotNull(listnode_i36);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test005");
        com.github.pedrovgs.problem37.PathCalculator pathCalculator0 = new com.github.pedrovgs.problem37.PathCalculator();
        java.lang.String str4 = pathCalculator0.calculate("/", "97", "10010###");
        java.lang.String str8 = pathCalculator0.calculate("BinaryNode{data=10}", "10", "]1-[");
        java.lang.String str12 = pathCalculator0.calculate(",0[/ ,1 ,1 /2-/97/120103#/]1-", "01", "/100##/[/32/");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "/97/10010###/" + "'", str4.equals("/97/10010###/"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/BinaryNode{data=10}/10/]1-[/" + "'", str8.equals("/BinaryNode{data=10}/10/]1-[/"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "/,0[/ ,1 ,1 /2-/97/120103#/]1-/01/100##/[/32/" + "'", str12.equals("/,0[/ ,1 ,1 /2-/97/120103#/]1-/01/100##/[/32/"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test006");
        com.github.pedrovgs.problem42.FloodFill floodFill0 = new com.github.pedrovgs.problem42.FloodFill();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral1 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array2 = new int[][] {};
        int[] i_array3 = goThroughMatrixInSpiral1.go(i_array_array2);
        floodFill0.apply(i_array_array2, (-52), 2, (int) '#', 51);
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros9 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral10 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array11 = new int[][] {};
        int[] i_array12 = goThroughMatrixInSpiral10.go(i_array_array11);
        int[] i_array15 = new int[] { 107, 3628800 };
        int[][] i_array_array16 = new int[][] { i_array15 };
        int[] i_array17 = goThroughMatrixInSpiral10.go(i_array_array16);
        rewriteRowAndColumnsWithZeros9.rewrite(i_array_array16);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral19 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array20 = new int[][] {};
        int[] i_array21 = goThroughMatrixInSpiral19.go(i_array_array20);
        int[] i_array24 = new int[] { 107, 3628800 };
        int[][] i_array_array25 = new int[][] { i_array24 };
        int[] i_array26 = goThroughMatrixInSpiral19.go(i_array_array25);
        rewriteRowAndColumnsWithZeros9.rewrite(i_array_array25);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral28 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array29 = new int[][] {};
        int[] i_array30 = goThroughMatrixInSpiral28.go(i_array_array29);
        rewriteRowAndColumnsWithZeros9.rewrite(i_array_array29);
        floodFill0.apply(i_array_array29, 51, 270, 7, (int) (byte) 10);
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros37 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral38 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array39 = new int[][] {};
        int[] i_array40 = goThroughMatrixInSpiral38.go(i_array_array39);
        int[] i_array43 = new int[] { 107, 3628800 };
        int[][] i_array_array44 = new int[][] { i_array43 };
        int[] i_array45 = goThroughMatrixInSpiral38.go(i_array_array44);
        rewriteRowAndColumnsWithZeros37.rewrite(i_array_array44);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral47 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array48 = new int[][] {};
        int[] i_array49 = goThroughMatrixInSpiral47.go(i_array_array48);
        rewriteRowAndColumnsWithZeros37.rewrite(i_array_array48);
        floodFill0.apply(i_array_array48, 0, 0, (int) ' ', (-8));
        com.github.pedrovgs.binarytree.BinaryNode<com.github.pedrovgs.problem42.FloodFill> binarynode_floodFill56 = new com.github.pedrovgs.binarytree.BinaryNode<com.github.pedrovgs.problem42.FloodFill>(floodFill0);
        org.junit.Assert.assertNotNull(i_array_array2);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array_array20);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array_array25);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array29);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(i_array_array39);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array_array48);
        org.junit.Assert.assertNotNull(i_array49);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test007");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.addElement((java.lang.Integer) (-1));
        java.util.Iterator<java.lang.Integer> iterator_i12 = vector_i4.iterator();
        java.util.ListIterator<java.lang.Integer> listiterator_i13 = vector_i4.listIterator();
        try {
            java.util.ListIterator<java.lang.Integer> listiterator_i15 = vector_i4.listIterator(1463287736);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(iterator_i12);
        org.junit.Assert.assertNotNull(listiterator_i13);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test008");
        com.github.pedrovgs.problem51.ReverseString reverseString0 = new com.github.pedrovgs.problem51.ReverseString();
        java.lang.String str2 = reverseString0.reverseRecursive("/hi!/");
        java.lang.String str4 = reverseString0.reverseIterative("hi!");
        java.lang.String str6 = reverseString0.reverseIterative("1");
        java.lang.String str8 = reverseString0.reverseRecursive("/");
        java.lang.String str10 = reverseString0.reverseIterative("/32/-52/7/");
        java.lang.String str12 = reverseString0.reverseRecursive("");
        java.lang.String str14 = reverseString0.reverseRecursive("[102]");
        java.lang.String str16 = reverseString0.reverseRecursive("10] [-1,");
        java.lang.String str18 = reverseString0.reverseRecursive("/10/100/[/");
        java.lang.String str20 = reverseString0.reverseRecursive("[");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/!ih/" + "'", str2.equals("/!ih/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "!ih" + "'", str4.equals("!ih"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/" + "'", str8.equals("/"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "/7/25-/23/" + "'", str10.equals("/7/25-/23/"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "]201[" + "'", str14.equals("]201["));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ",1-[ ]01" + "'", str16.equals(",1-[ ]01"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "/[/001/01/" + "'", str18.equals("/[/001/01/"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[" + "'", str20.equals("["));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test009");
        com.github.pedrovgs.problem53.CompressString compressString0 = new com.github.pedrovgs.problem53.CompressString();
        java.lang.String str2 = compressString0.compressRecursive("/");
        java.lang.String str4 = compressString0.compressRecursive("79");
        java.lang.String str6 = compressString0.compressRecursive("[null]");
        java.lang.String str8 = compressString0.compressRecursive("/[-1]/]1-[/]1- ,1 ,1 ,0[/01/");
        java.lang.String str10 = compressString0.compress("]01 ,1-[");
        java.lang.String str12 = compressString0.compressRecursive("32");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/" + "'", str2.equals("/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "79" + "'", str4.equals("79"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[nul2]" + "'", str6.equals("[nul2]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/[-1]/]1-[/]1- ,1 ,1 ,0[/01/" + "'", str8.equals("/[-1]/]1-[/]1- ,1 ,1 ,0[/01/"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "]01 ,1-" + "'", str10.equals("]01 ,1-"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "32" + "'", str12.equals("32"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test010");
        com.github.pedrovgs.problem70.ReverseOrderOfBinaryNumber reverseOrderOfBinaryNumber0 = new com.github.pedrovgs.problem70.ReverseOrderOfBinaryNumber();
        int i2 = reverseOrderOfBinaryNumber0.reverse((int) ' ');
        int i4 = reverseOrderOfBinaryNumber0.reverse(100);
        int i6 = reverseOrderOfBinaryNumber0.reverse((int) (byte) 0);
        int i8 = reverseOrderOfBinaryNumber0.reverse(26);
        org.junit.Assert.assertTrue(i2 == 1);
        org.junit.Assert.assertTrue(i4 == 19);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i8 == 11);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test011");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        try {
            java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnPowersOfTwo("]201", "[-1, 10]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test012");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(0);
        int i4 = factorial0.getIterative(270);
        int i6 = factorial0.getTailRecursive(90);
        org.junit.Assert.assertTrue(i2 == 1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test013");
        com.github.pedrovgs.problem1.BitsCounter bitsCounter0 = new com.github.pedrovgs.problem1.BitsCounter();
        int i2 = bitsCounter0.countBitsToOneBasedOnString((-6));
        int i4 = bitsCounter0.countBitsToOneBasedOnString((-6));
        int i6 = bitsCounter0.countBitsToOneBasedOnBinaryOperators((int) (byte) 1);
        int i8 = bitsCounter0.countBitsToOneBasedOnString(101);
        int i10 = bitsCounter0.countBitsToOneBasedOnBinaryOperators(32);
        int i12 = bitsCounter0.countBitsToOneBasedOnBinaryOperators(6);
        int i14 = bitsCounter0.countBitsToOneBasedOnBinaryOperators(104);
        int i16 = bitsCounter0.countBitsToOneBasedOnBinaryOperators((int) ' ');
        int i18 = bitsCounter0.countBitsToOneBasedOnString(34);
        int i20 = bitsCounter0.countBitsToOneBasedOnString((-52000));
        org.junit.Assert.assertTrue(i2 == 30);
        org.junit.Assert.assertTrue(i4 == 30);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i8 == 4);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i14 == 3);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue(i20 == 22);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test014");
        com.github.pedrovgs.problem71.ReverseBinaryNumber reverseBinaryNumber0 = new com.github.pedrovgs.problem71.ReverseBinaryNumber();
        int i2 = reverseBinaryNumber0.reverse(52041);
        org.junit.Assert.assertTrue(i2 == 13494);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test015");
        com.github.pedrovgs.problem51.ReverseString reverseString0 = new com.github.pedrovgs.problem51.ReverseString();
        java.lang.String str2 = reverseString0.reverseRecursive("/hi!/");
        java.lang.String str4 = reverseString0.reverseIterative("hi!");
        java.lang.String str6 = reverseString0.reverseIterative("1");
        java.lang.String str8 = reverseString0.reverseIterative("/!ih/");
        java.lang.String str10 = reverseString0.reverseRecursive("/100##/[/32/");
        java.lang.String str12 = reverseString0.reverseRecursive("9");
        java.lang.String str14 = reverseString0.reverseRecursive("");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/!ih/" + "'", str2.equals("/!ih/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "!ih" + "'", str4.equals("!ih"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/hi!/" + "'", str8.equals("/hi!/"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "/23/[/##001/" + "'", str10.equals("/23/[/##001/"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "9" + "'", str12.equals("9"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test016");
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
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i24 = null;
        try {
            boolean b25 = isBST0.checkRecursive(binarynode_i24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test017");
        com.github.pedrovgs.problem4.SquareRoot squareRoot0 = new com.github.pedrovgs.problem4.SquareRoot();
        float f2 = squareRoot0.calculateSquareRootRecursive((int) (byte) 1);
        float f4 = squareRoot0.calculateSquareRootIterative((int) ' ');
        float f6 = squareRoot0.calculateSquareRootRecursive(11426);
        float f8 = squareRoot0.calculateSquareRootRecursive(0);
        org.junit.Assert.assertTrue(f2 == 0.96875f);
        org.junit.Assert.assertTrue(f4 == 5.650014f);
        org.junit.Assert.assertTrue(f6 == 106.892365f);
        org.junit.Assert.assertTrue(f8 == 0.0f);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test018");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(10);
        int i4 = factorial0.getTailRecursive((int) (short) 10);
        int i6 = factorial0.getTailRecursive((int) (short) 1);
        int i8 = factorial0.getRecursive((int) (byte) 10);
        int i10 = factorial0.getIterative(52);
        org.junit.Assert.assertTrue(i2 == 3628800);
        org.junit.Assert.assertTrue(i4 == 3628800);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i8 == 3628800);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test019");
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
        com.github.pedrovgs.problem8.SplitArray splitArray14 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray15 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array18 = new int[] { (byte) 1, (byte) 10 };
        splitArray15.splitSwappingPartition(i_array18);
        splitArray14.splitSwappingRecursive(i_array18);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral21 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array22 = new int[][] {};
        int[] i_array23 = goThroughMatrixInSpiral21.go(i_array_array22);
        splitArray14.splitSwappingRecursive(i_array23);
        com.github.pedrovgs.problem80.QuickSort quickSort25 = new com.github.pedrovgs.problem80.QuickSort();
        com.github.pedrovgs.problem8.SplitArray splitArray26 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array29 = new int[] { (byte) 1, (byte) 10 };
        splitArray26.splitSwappingPartition(i_array29);
        com.github.pedrovgs.problem2.Vector vector31 = new com.github.pedrovgs.problem2.Vector(i_array29);
        quickSort25.sort(i_array29);
        splitArray14.splitSwappingRecursive(i_array29);
        com.github.pedrovgs.problem31.FindLongestConsecutiveSequence findLongestConsecutiveSequence34 = new com.github.pedrovgs.problem31.FindLongestConsecutiveSequence();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays35 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays36 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays35);
        com.github.pedrovgs.problem8.SplitArray splitArray37 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array40 = new int[] { (byte) 1, (byte) 10 };
        splitArray37.splitSwappingPartition(i_array40);
        int[] i_array48 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray37.splitSwappingRecursive(i_array48);
        com.github.pedrovgs.problem8.SplitArray splitArray50 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array53 = new int[] { (byte) 1, (byte) 10 };
        splitArray50.splitSwappingPartition(i_array53);
        int[] i_array61 = new int[] { (byte) 100, (byte) 10, '#', 10, (short) -1, (byte) -1 };
        splitArray50.splitSwappingRecursive(i_array61);
        int[] i_array63 = mergeSortedArrays35.merge(i_array48, i_array61);
        int i64 = findLongestConsecutiveSequence34.findIterative(i_array63);
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_65 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_65.push((int) (byte) 10);
        int i68 = stack1_65.getMin();
        int i69 = stack1_65.getMin();
        com.github.pedrovgs.problem75.SelectionSort selectionSort70 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray71 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array74 = new int[] { (byte) 1, (byte) 10 };
        splitArray71.splitSwappingPartition(i_array74);
        selectionSort70.sort(i_array74);
        int i77 = stack1_65.search((java.lang.Object) i_array74);
        int i78 = findLongestConsecutiveSequence34.findRecursive(i_array74);
        splitArray14.splitSwappingRecursive(i_array74);
        com.github.pedrovgs.problem2.Vector vector80 = new com.github.pedrovgs.problem2.Vector(i_array74);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral81 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        com.github.pedrovgs.problem42.FloodFill floodFill82 = new com.github.pedrovgs.problem42.FloodFill();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral83 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array84 = new int[][] {};
        int[] i_array85 = goThroughMatrixInSpiral83.go(i_array_array84);
        floodFill82.apply(i_array_array84, (-52), 2, (int) '#', 51);
        int[] i_array91 = goThroughMatrixInSpiral81.go(i_array_array84);
        com.github.pedrovgs.problem2.Vector vector92 = new com.github.pedrovgs.problem2.Vector(i_array91);
        int i93 = vector92.size();
        int i94 = vector92.size();
        try {
            int i95 = vectorScalarProduct0.calculateScalarProduct(vector80, vector92);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertTrue(i13 == 101);
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertNotNull(i_array_array22);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(i_array61);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertTrue(i64 == 2);
        org.junit.Assert.assertTrue(i68 == 10);
        org.junit.Assert.assertTrue(i69 == 10);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertTrue(i77 == (-1));
        org.junit.Assert.assertTrue(i78 == 2);
        org.junit.Assert.assertNotNull(i_array_array84);
        org.junit.Assert.assertNotNull(i_array85);
        org.junit.Assert.assertNotNull(i_array91);
        org.junit.Assert.assertTrue(i93 == 0);
        org.junit.Assert.assertTrue(i94 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test020");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.ensureCapacity((int) (short) 100);
        boolean b3 = stack2_0.empty();
        stack2_0.clear();
        stack2_0.push(2147469512);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test021");
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
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor20 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
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
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST34 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array36 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i37 = sortedArrayToBST34.transform(i_array36);
        boolean b38 = binarynode_i37.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST39 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array41 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i42 = sortedArrayToBST39.transform(i_array41);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode43 = lowestCommonAncestor20.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i30, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i37, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i42);
        java.lang.Integer i44 = binarynode_i37.getData();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode45 = binaryTreeByLevel11.getWithoutAdditionalDataStructures((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i37);
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
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST70 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array72 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i73 = sortedArrayToBST70.transform(i_array72);
        boolean b74 = binarynode_i73.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i75 = binarynode_i73.getRight();
        binarynode_i63.setRight(binarynode_i73);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode77 = binaryTreeByLevel11.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i73);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(binarynode_i16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(list_binaryNode18);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(binarynode_i25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(binarynode_i30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(binarynode_i32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(binarynode_i37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(binarynode_i42);
        org.junit.Assert.assertNull(binaryNode43);
        org.junit.Assert.assertTrue("'" + i44 + "' != '" + 100 + "'", i44.equals(100));
        org.junit.Assert.assertNotNull(list_binaryNode45);
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
        org.junit.Assert.assertNotNull(i_array72);
        org.junit.Assert.assertNotNull(binarynode_i73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNull(binarynode_i75);
        org.junit.Assert.assertNotNull(list_binaryNode77);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test022");
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange1 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange2 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "97", combinationsOfChange1);
        com.github.pedrovgs.problem65.IsTreeBalanced isTreeBalanced3 = new com.github.pedrovgs.problem65.IsTreeBalanced();
        com.github.pedrovgs.problem75.SelectionSort selectionSort4 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem65.IsTreeBalanced, com.github.pedrovgs.problem75.SelectionSort> pair_isTreeBalanced_selectionSort5 = new com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem65.IsTreeBalanced, com.github.pedrovgs.problem75.SelectionSort>(isTreeBalanced3, selectionSort4);
        com.github.pedrovgs.problem72.FindTheMissingNumber findTheMissingNumber6 = new com.github.pedrovgs.problem72.FindTheMissingNumber();
        com.github.pedrovgs.problem75.SelectionSort selectionSort7 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray8 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array11 = new int[] { (byte) 1, (byte) 10 };
        splitArray8.splitSwappingPartition(i_array11);
        selectionSort7.sort(i_array11);
        int i14 = findTheMissingNumber6.find(i_array11);
        selectionSort4.sort(i_array11);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral16 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array17 = new int[][] {};
        int[] i_array18 = goThroughMatrixInSpiral16.go(i_array_array17);
        selectionSort4.sort(i_array18);
        java.util.List<java.util.List<java.lang.Integer>> list_list_i21 = combinationsOfChange1.get(i_array18, 2147483647);
        com.github.pedrovgs.problem12.MoveZerosInArray moveZerosInArray22 = new com.github.pedrovgs.problem12.MoveZerosInArray();
        com.github.pedrovgs.problem8.SplitArray splitArray23 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray24 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array27 = new int[] { (byte) 1, (byte) 10 };
        splitArray24.splitSwappingPartition(i_array27);
        splitArray23.splitSwappingRecursive(i_array27);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral30 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array31 = new int[][] {};
        int[] i_array32 = goThroughMatrixInSpiral30.go(i_array_array31);
        splitArray23.splitSwappingRecursive(i_array32);
        moveZerosInArray22.moveSorting(i_array32);
        com.github.pedrovgs.problem8.SplitArray splitArray35 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem39.MultiplyArrayElements multiplyArrayElements36 = new com.github.pedrovgs.problem39.MultiplyArrayElements();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral37 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array38 = new int[][] {};
        int[] i_array39 = goThroughMatrixInSpiral37.go(i_array_array38);
        int[] i_array40 = multiplyArrayElements36.multiply(i_array39);
        splitArray35.splitSwappingPartition(i_array39);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral42 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array43 = new int[][] {};
        int[] i_array44 = goThroughMatrixInSpiral42.go(i_array_array43);
        splitArray35.splitSwappingPartition(i_array44);
        moveZerosInArray22.moveUsingTwoPointers(i_array44);
        java.util.List<java.util.List<java.lang.Integer>> list_list_i48 = combinationsOfChange1.get(i_array44, 9360);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertTrue(i14 == (-8));
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertNotNull(list_list_i21);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array_array31);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array_array43);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(list_list_i48);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test023");
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
        stack2_0.push((-1108322));
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test024");
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder0 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder1 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian2 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i4 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d5 = avlTreeMedian2.find(binarynode_i4);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode6 = binaryTreePreOrder1.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i4);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i7 = binaryTreeInOrder0.getIterative(binarynode_i4);
        com.github.pedrovgs.problem18.IsBST isBST8 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST9 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array11 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i12 = sortedArrayToBST9.transform(i_array11);
        boolean b13 = isBST8.checkRecursive(binarynode_i12);
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
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i27 = binarynode_i18.getLeft();
        boolean b28 = isBST8.checkIterative(binarynode_i18);
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian29 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i31 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d32 = avlTreeMedian29.find(binarynode_i31);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor33 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals34 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST35 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array37 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i38 = sortedArrayToBST35.transform(i_array37);
        boolean b39 = binarynode_i38.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST40 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array42 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i43 = sortedArrayToBST40.transform(i_array42);
        boolean b44 = binarynode_i43.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i45 = binarynode_i43.getRight();
        boolean b46 = binaryTreeEquals34.areEqualsIterative(binarynode_i38, binarynode_i43);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST47 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array49 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i50 = sortedArrayToBST47.transform(i_array49);
        boolean b51 = binarynode_i50.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST52 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array54 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i55 = sortedArrayToBST52.transform(i_array54);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode56 = lowestCommonAncestor33.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i43, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i50, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i55);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i57 = binarynode_i43.getLeft();
        double d58 = avlTreeMedian29.find(binarynode_i43);
        boolean b59 = isBST8.checkRecursive(binarynode_i43);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor60 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals61 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST62 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array64 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i65 = sortedArrayToBST62.transform(i_array64);
        boolean b66 = binarynode_i65.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST67 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array69 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i70 = sortedArrayToBST67.transform(i_array69);
        boolean b71 = binarynode_i70.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i72 = binarynode_i70.getRight();
        boolean b73 = binaryTreeEquals61.areEqualsIterative(binarynode_i65, binarynode_i70);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST74 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array76 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i77 = sortedArrayToBST74.transform(i_array76);
        boolean b78 = binarynode_i77.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST79 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array81 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i82 = sortedArrayToBST79.transform(i_array81);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode83 = lowestCommonAncestor60.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i70, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i77, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i82);
        boolean b84 = isBST8.checkIterative(binarynode_i70);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i85 = binaryTreeInOrder0.getIterative(binarynode_i70);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode86 = null;
        try {
            java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i87 = binaryTreeInOrder0.getRecursive(binaryNode86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(d5 == 10.0d);
        org.junit.Assert.assertNotNull(list_binaryNode6);
        org.junit.Assert.assertNotNull(list_binarynode_i7);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(binarynode_i12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(binarynode_i18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(binarynode_i23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(binarynode_i25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(binarynode_i27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(d32 == 10.0d);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(binarynode_i38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(binarynode_i43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(binarynode_i45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(binarynode_i50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(binarynode_i55);
        org.junit.Assert.assertNull(binaryNode56);
        org.junit.Assert.assertNull(binarynode_i57);
        org.junit.Assert.assertTrue(d58 == 100.0d);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(i_array64);
        org.junit.Assert.assertNotNull(binarynode_i65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(i_array69);
        org.junit.Assert.assertNotNull(binarynode_i70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNull(binarynode_i72);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNotNull(i_array76);
        org.junit.Assert.assertNotNull(binarynode_i77);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(i_array81);
        org.junit.Assert.assertNotNull(binarynode_i82);
        org.junit.Assert.assertNull(binaryNode83);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertNotNull(list_binarynode_i85);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test025");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i8 = vector_i4.elements();
        java.util.stream.Stream<java.lang.Integer> stream_i9 = vector_i4.parallelStream();
        try {
            java.lang.Integer i11 = vector_i4.get((-100663296));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(enumeration_i8);
        org.junit.Assert.assertNotNull(stream_i9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test026");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.stream.Stream<java.lang.Integer> stream_i8 = vector_i4.parallelStream();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.removeAllElements();
        com.github.pedrovgs.problem62.PalindromeList palindromeList11 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem62.PalindromeList palindromeList12 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList13 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays14 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays15 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays14);
        java.lang.String str16 = listnode_mergeSortedArrays15.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i17 = reverseLinkedList13.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays15);
        boolean b18 = palindromeList12.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays15);
        boolean b19 = palindromeList11.checkReversing((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays15);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays20 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays21 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays20);
        java.lang.String str22 = listnode_mergeSortedArrays21.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays23 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays24 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays23);
        java.lang.String str25 = listnode_mergeSortedArrays24.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays26 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays24.setData(mergeSortedArrays26);
        listnode_mergeSortedArrays21.setNext(listnode_mergeSortedArrays24);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays29 = listnode_mergeSortedArrays21.getNext();
        boolean b30 = palindromeList11.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays29);
        int i31 = vector_i4.lastIndexOf((java.lang.Object) palindromeList11);
        com.github.pedrovgs.problem62.PalindromeList palindromeList32 = new com.github.pedrovgs.problem62.PalindromeList();
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
        boolean b54 = palindromeList32.checkReversing(listNode51);
        boolean b55 = palindromeList11.checkIterative(listNode51);
        com.github.pedrovgs.problem62.PalindromeList palindromeList56 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem62.PalindromeList palindromeList57 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList58 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays59 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays60 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays59);
        java.lang.String str61 = listnode_mergeSortedArrays60.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i62 = reverseLinkedList58.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays60);
        boolean b63 = palindromeList57.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays60);
        boolean b64 = palindromeList56.checkReversing((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays60);
        com.github.pedrovgs.problem62.PalindromeList palindromeList65 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList66 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays67 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays68 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays67);
        java.lang.String str69 = listnode_mergeSortedArrays68.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i70 = reverseLinkedList66.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays68);
        boolean b71 = palindromeList65.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays68);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays72 = listnode_mergeSortedArrays68.getNext();
        boolean b73 = palindromeList56.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays68);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays74 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays75 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays74);
        java.lang.String str76 = listnode_mergeSortedArrays75.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays77 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays78 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays77);
        java.lang.String str79 = listnode_mergeSortedArrays78.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays80 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays78.setData(mergeSortedArrays80);
        listnode_mergeSortedArrays75.setNext(listnode_mergeSortedArrays78);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays83 = listnode_mergeSortedArrays75.getNext();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays84 = listnode_mergeSortedArrays83.getData();
        boolean b85 = palindromeList56.checkReversing((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays83);
        boolean b86 = palindromeList11.checkReversing((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays83);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(stream_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(listnode_i17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertNull(listnode_mergeSortedArrays37);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays38);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(listNode44);
        org.junit.Assert.assertNotNull(listNode51);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(listnode_i62);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(listnode_i70);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays72);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays83);
        org.junit.Assert.assertNotNull(mergeSortedArrays84);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue(b86 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test027");
        com.github.pedrovgs.problem20.MultiplicationWithoutMultiply multiplicationWithoutMultiply0 = new com.github.pedrovgs.problem20.MultiplicationWithoutMultiply();
        int i3 = multiplicationWithoutMultiply0.calculate((int) (byte) -1, (int) (byte) 1);
        int i6 = multiplicationWithoutMultiply0.calculate((-52000), 2414);
        int i9 = multiplicationWithoutMultiply0.calculate(1484783616, 312);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue(i6 == (-125528000));
        org.junit.Assert.assertTrue(i9 == (-603979776));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test028");
        com.github.pedrovgs.problem37.PathCalculator pathCalculator0 = new com.github.pedrovgs.problem37.PathCalculator();
        java.lang.String str4 = pathCalculator0.calculate("/", "97", "10010###");
        java.lang.String str8 = pathCalculator0.calculate("BinaryNode{data=10}", "10", "]1-[");
        java.lang.String str12 = pathCalculator0.calculate("10210#3", "[-1]", "");
        java.lang.String str16 = pathCalculator0.calculate("10", "[0, 1, 1, -1]", "[100]");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "/97/10010###/" + "'", str4.equals("/97/10010###/"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/BinaryNode{data=10}/10/]1-[/" + "'", str8.equals("/BinaryNode{data=10}/10/]1-[/"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "/10210#3/[-1]/" + "'", str12.equals("/10210#3/[-1]/"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "/10/[0, 1, 1, -1]/[100]/" + "'", str16.equals("/10/[0, 1, 1, -1]/[100]/"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test029");
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
        boolean b66 = binarynode_i48.hasLeft();
        boolean b67 = binarynode_i48.hasRight();
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
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test030");
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
        java.lang.Object obj19 = stack2_0.clone();
        java.util.stream.Stream<java.lang.Integer> stream_i20 = stack2_0.stream();
        java.util.stream.Stream<java.lang.Integer> stream_i21 = stack2_0.parallelStream();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(stream_i20);
        org.junit.Assert.assertNotNull(stream_i21);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test031");
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
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i52 = binarynode_i48.getRight();
        boolean b53 = binarynode_i48.hasRight();
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
        org.junit.Assert.assertNull(binarynode_i52);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test032");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("0", "");
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem3.SumBinaryNumbers> listnode_sumBinaryNumbers4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem3.SumBinaryNumbers>(sumBinaryNumbers0);
        try {
            java.lang.String str7 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("/]1- ,1 ,1 ,0[/3/1/", "/[-1, 10]/7/25-/23/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test033");
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
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays27 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays28 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays27);
        java.lang.String str29 = listnode_mergeSortedArrays28.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays30 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays31 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays30);
        java.lang.String str32 = listnode_mergeSortedArrays31.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays33 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays31.setData(mergeSortedArrays33);
        listnode_mergeSortedArrays28.setNext(listnode_mergeSortedArrays31);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays36 = listnode_mergeSortedArrays28.getNext();
        com.github.pedrovgs.problem62.PalindromeList palindromeList37 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList38 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays39 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays40 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays39);
        java.lang.String str41 = listnode_mergeSortedArrays40.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i42 = reverseLinkedList38.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays40);
        boolean b43 = palindromeList37.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays40);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays44 = listnode_mergeSortedArrays40.getNext();
        listnode_mergeSortedArrays36.setNext(listnode_mergeSortedArrays40);
        com.github.pedrovgs.linkedlist.ListNode listNode46 = reverseLinkedList0.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays40);
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2[] stack2__array47 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2[] {};
        com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem22.ReverseLinkedList, com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2[]> pair_reverseLinkedList_stack2__array48 = new com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem22.ReverseLinkedList, com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2[]>(reverseLinkedList0, stack2__array47);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays3);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(listNode10);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(listnode_i21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(listNode26);
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays36);
        org.junit.Assert.assertNotNull(listnode_i42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays44);
        org.junit.Assert.assertNotNull(listNode46);
        org.junit.Assert.assertNotNull(stack2__array47);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test034");
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
        com.github.pedrovgs.problem62.PalindromeList palindromeList25 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList26 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays27 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays28 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays27);
        java.lang.String str29 = listnode_mergeSortedArrays28.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i30 = reverseLinkedList26.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays28);
        boolean b31 = palindromeList25.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays28);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays32 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays33 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays32);
        java.lang.String str34 = listnode_mergeSortedArrays33.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays35 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays36 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays35);
        java.lang.String str37 = listnode_mergeSortedArrays36.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays38 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays36.setData(mergeSortedArrays38);
        listnode_mergeSortedArrays33.setNext(listnode_mergeSortedArrays36);
        boolean b41 = palindromeList25.checkReversing((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays33);
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
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements> listnode_removeListDuplicatedElements55 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements>(removeListDuplicatedElements42);
        boolean b56 = palindromeList25.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_removeListDuplicatedElements55);
        boolean b57 = palindromeList0.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_removeListDuplicatedElements55);
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
        org.junit.Assert.assertNotNull(listnode_i30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays46);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays47);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(listNode53);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b57 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test035");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push((-1));
        java.lang.Integer i3 = stack2_0.peek();
        java.lang.Integer i4 = stack2_0.pop();
        java.util.Spliterator<java.lang.Integer> spliterator_i5 = stack2_0.spliterator();
        stack2_0.addElement((java.lang.Integer) (-5200));
        org.junit.Assert.assertTrue("'" + i3 + "' != '" + (-1) + "'", i3.equals((-1)));
        org.junit.Assert.assertTrue("'" + i4 + "' != '" + (-1) + "'", i4.equals((-1)));
        org.junit.Assert.assertNotNull(spliterator_i5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test036");
        com.github.pedrovgs.problem69.BitsToTransform bitsToTransform0 = new com.github.pedrovgs.problem69.BitsToTransform();
        int i3 = bitsToTransform0.calculate((int) '#', (int) (short) 0);
        int i6 = bitsToTransform0.calculate(51, (int) 'a');
        int i9 = bitsToTransform0.calculate((int) 'a', (int) (byte) -1);
        int i12 = bitsToTransform0.calculate(1, (int) (short) 1);
        int i15 = bitsToTransform0.calculate(51, 3);
        int i18 = bitsToTransform0.calculate(1, 49);
        org.junit.Assert.assertTrue(i3 == 3);
        org.junit.Assert.assertTrue(i6 == 3);
        org.junit.Assert.assertTrue(i9 == 29);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(i18 == 2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test037");
        com.github.pedrovgs.problem50.UniqueChars uniqueChars0 = new com.github.pedrovgs.problem50.UniqueChars();
        boolean b2 = uniqueChars0.evaluate2("/hi!/");
        boolean b4 = uniqueChars0.evaluate("35");
        boolean b6 = uniqueChars0.evaluate2("[0, 1, 1, -1]");
        boolean b8 = uniqueChars0.evaluate("0##");
        boolean b10 = uniqueChars0.evaluate2("[3]");
        boolean b12 = uniqueChars0.evaluate2("/[/001/01/");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test038");
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
        com.github.pedrovgs.problem18.IsBST isBST34 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST35 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array37 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i38 = sortedArrayToBST35.transform(i_array37);
        boolean b39 = isBST34.checkRecursive(binarynode_i38);
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
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i53 = binarynode_i44.getLeft();
        boolean b54 = isBST34.checkIterative(binarynode_i44);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals55 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST56 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array58 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i59 = sortedArrayToBST56.transform(i_array58);
        boolean b60 = binarynode_i59.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST61 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array63 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i64 = sortedArrayToBST61.transform(i_array63);
        boolean b65 = binarynode_i64.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i66 = binarynode_i64.getRight();
        boolean b67 = binaryTreeEquals55.areEqualsIterative(binarynode_i59, binarynode_i64);
        boolean b68 = isBST34.checkIterative(binarynode_i64);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i69 = null;
        binarynode_i64.setLeft(binarynode_i69);
        boolean b71 = isBST0.checkRecursive(binarynode_i64);
        com.github.pedrovgs.problem46.BinaryTreeSerialization binaryTreeSerialization72 = new com.github.pedrovgs.problem46.BinaryTreeSerialization();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i74 = binaryTreeSerialization72.deserialize("[]");
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i76 = binaryTreeSerialization72.deserialize("102#2");
        boolean b77 = isBST0.checkIterative(binarynode_i76);
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
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(binarynode_i38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(binarynode_i44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(binarynode_i49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(binarynode_i51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNull(binarynode_i53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(binarynode_i59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertNotNull(binarynode_i64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNull(binarynode_i66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(binarynode_i74);
        org.junit.Assert.assertNotNull(binarynode_i76);
        org.junit.Assert.assertTrue(b77 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test039");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push(100);
        int i3 = stack2_0.capacity();
        stack2_0.push(7);
        try {
            stack2_0.setSize((-52009));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i3 == 10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test040");
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
        java.lang.Object obj24 = stack1_5.clone();
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
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test041");
        com.github.pedrovgs.problem29.AreAnagrams areAnagrams0 = new com.github.pedrovgs.problem29.AreAnagrams();
        boolean b3 = areAnagrams0.check("3", "/!ih/hi!/");
        boolean b6 = areAnagrams0.check("1", "3");
        boolean b9 = areAnagrams0.check("79", "[");
        boolean b12 = areAnagrams0.check("/]1-[/]1- ,1 ,1 ,0[/01/", "-6");
        boolean b15 = areAnagrams0.check("10", "/9/[0, 1, 1, -1]/,0[/ ,1 ,1 /2-/97/120103#/]1-/");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test042");
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange1 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange2 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "[", combinationsOfChange1);
        com.github.pedrovgs.problem47.ReturnChange returnChange3 = new com.github.pedrovgs.problem47.ReturnChange();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem47.ReturnChange> listnode_returnChange4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem47.ReturnChange>(returnChange3);
        com.github.pedrovgs.problem65.IsTreeBalanced isTreeBalanced5 = new com.github.pedrovgs.problem65.IsTreeBalanced();
        com.github.pedrovgs.problem75.SelectionSort selectionSort6 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem65.IsTreeBalanced, com.github.pedrovgs.problem75.SelectionSort> pair_isTreeBalanced_selectionSort7 = new com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem65.IsTreeBalanced, com.github.pedrovgs.problem75.SelectionSort>(isTreeBalanced5, selectionSort6);
        com.github.pedrovgs.problem72.FindTheMissingNumber findTheMissingNumber8 = new com.github.pedrovgs.problem72.FindTheMissingNumber();
        com.github.pedrovgs.problem75.SelectionSort selectionSort9 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray10 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array13 = new int[] { (byte) 1, (byte) 10 };
        splitArray10.splitSwappingPartition(i_array13);
        selectionSort9.sort(i_array13);
        int i16 = findTheMissingNumber8.find(i_array13);
        selectionSort6.sort(i_array13);
        java.util.List<java.lang.Integer> list_i19 = returnChange3.calculate(i_array13, (int) (byte) 100);
        com.github.pedrovgs.problem72.FindTheMissingNumber findTheMissingNumber20 = new com.github.pedrovgs.problem72.FindTheMissingNumber();
        com.github.pedrovgs.problem75.SelectionSort selectionSort21 = new com.github.pedrovgs.problem75.SelectionSort();
        com.github.pedrovgs.problem8.SplitArray splitArray22 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array25 = new int[] { (byte) 1, (byte) 10 };
        splitArray22.splitSwappingPartition(i_array25);
        selectionSort21.sort(i_array25);
        int i28 = findTheMissingNumber20.find(i_array25);
        java.util.List<java.lang.Integer> list_i30 = returnChange3.calculate(i_array25, 3628800);
        try {
            java.util.List<java.util.List<java.lang.Integer>> list_list_i32 = combinationsOfChange1.get(i_array25, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertTrue(i16 == (-8));
        org.junit.Assert.assertNotNull(list_i19);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertTrue(i28 == (-8));
        org.junit.Assert.assertNotNull(list_i30);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test043");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("0", "");
        try {
            java.lang.String str6 = sumBinaryNumbers0.sumBinaryNumbersBasedOnPowersOfTwo("hi!", "/32/!ih/hi!/###01001/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test044");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideIterative((int) (byte) 10, (int) (byte) 100);
        float f6 = divideUsingSubtraction0.divideIterative(1, (int) (short) 100);
        float f9 = divideUsingSubtraction0.divideRecursive(3, 27);
        float f12 = divideUsingSubtraction0.divideIterative((int) (byte) -1, (-8));
        float f15 = divideUsingSubtraction0.divideRecursive(51, 2);
        float f18 = divideUsingSubtraction0.divideIterative(51973, (-100663296));
        float f21 = divideUsingSubtraction0.divideIterative(45, 2147469512);
        org.junit.Assert.assertTrue(f3 == 0.1f);
        org.junit.Assert.assertTrue(f6 == 0.01f);
        org.junit.Assert.assertTrue(f9 == 0.11111111f);
        org.junit.Assert.assertTrue(f12 == 2.85212672E8f);
        org.junit.Assert.assertTrue(f15 == 25.5f);
        org.junit.Assert.assertTrue(f18 == 42.666153f);
        org.junit.Assert.assertTrue(f21 == 2.0954895E-8f);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test045");
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
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements22 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList23 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays24 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays25 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays24);
        java.lang.String str26 = listnode_mergeSortedArrays25.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode27 = reverseLinkedList23.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays25);
        removeListDuplicatedElements22.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode27);
        removeListDuplicatedElements1.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode27);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i30 = getTheElementInTheMiddleOfTheList0.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode27);
        com.github.pedrovgs.problem1.BitsCounter bitsCounter31 = new com.github.pedrovgs.problem1.BitsCounter();
        int i33 = bitsCounter31.countBitsToOneBasedOnString((-6));
        int i35 = bitsCounter31.countBitsToOneBasedOnString((-6));
        int i37 = bitsCounter31.countBitsToOneBasedOnBinaryOperators((int) (byte) 1);
        int i39 = bitsCounter31.countBitsToOneBasedOnString(101);
        int i41 = bitsCounter31.countBitsToOneBasedOnBinaryOperators(32);
        int i43 = bitsCounter31.countBitsToOneBasedOnBinaryOperators((-24));
        int i45 = bitsCounter31.countBitsToOneBasedOnBinaryOperators((-2));
        int i47 = bitsCounter31.countBitsToOneBasedOnBinaryOperators((-2147475302));
        int i49 = bitsCounter31.countBitsToOneBasedOnBinaryOperators(7);
        boolean b50 = listNode27.equals((java.lang.Object) i49);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(listNode12);
        org.junit.Assert.assertNotNull(listNode19);
        org.junit.Assert.assertNotNull(listNode27);
        org.junit.Assert.assertNotNull(listnode_i30);
        org.junit.Assert.assertTrue(i33 == 30);
        org.junit.Assert.assertTrue(i35 == 30);
        org.junit.Assert.assertTrue(i37 == 1);
        org.junit.Assert.assertTrue(i39 == 4);
        org.junit.Assert.assertTrue(i41 == 1);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(i49 == 3);
        org.junit.Assert.assertTrue(b50 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test046");
        com.github.pedrovgs.problem2.VectorScalarProduct vectorScalarProduct0 = new com.github.pedrovgs.problem2.VectorScalarProduct();
        com.github.pedrovgs.binarytree.BinaryNode<com.github.pedrovgs.problem2.VectorScalarProduct> binarynode_vectorScalarProduct1 = new com.github.pedrovgs.binarytree.BinaryNode<com.github.pedrovgs.problem2.VectorScalarProduct>(vectorScalarProduct0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test047");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(10);
        int i4 = factorial0.getTailRecursive((int) (short) 10);
        int i6 = factorial0.getRecursive(0);
        int i8 = factorial0.getIterative(3);
        int i10 = factorial0.getTailRecursive(270);
        int i12 = factorial0.getIterative(10928795);
        int i14 = factorial0.getIterative(21495880);
        org.junit.Assert.assertTrue(i2 == 3628800);
        org.junit.Assert.assertTrue(i4 == 3628800);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i8 == 6);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test048");
        com.github.pedrovgs.problem4.SquareRoot squareRoot0 = new com.github.pedrovgs.problem4.SquareRoot();
        float f2 = squareRoot0.calculateSquareRootIterative((int) ' ');
        float f4 = squareRoot0.calculateSquareRootRecursive(720);
        float f6 = squareRoot0.calculateSquareRootRecursive(14);
        float f8 = squareRoot0.calculateSquareRootIterative(23);
        org.junit.Assert.assertTrue(f2 == 5.650014f);
        org.junit.Assert.assertTrue(f4 == 26.834106f);
        org.junit.Assert.assertTrue(f6 == 3.7460938f);
        org.junit.Assert.assertTrue(f8 == 4.8000093f);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test049");
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements0 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList2 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode6 = reverseLinkedList2.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        com.github.pedrovgs.problem18.IsBST isBST7 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST8 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array10 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i11 = sortedArrayToBST8.transform(i_array10);
        boolean b12 = isBST7.checkRecursive(binarynode_i11);
        boolean b13 = listNode6.equals((java.lang.Object) binarynode_i11);
        com.github.pedrovgs.linkedlist.ListNode listNode14 = reverseLinkedList1.reverseIterative(listNode6);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays15 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays16 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays15);
        java.lang.String str17 = listnode_mergeSortedArrays16.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays18 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays19 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays18);
        java.lang.String str20 = listnode_mergeSortedArrays19.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays21 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays19.setData(mergeSortedArrays21);
        listnode_mergeSortedArrays16.setNext(listnode_mergeSortedArrays19);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays24 = listnode_mergeSortedArrays16.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays25 = listnode_mergeSortedArrays16.getNext();
        com.github.pedrovgs.linkedlist.ListNode listNode26 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays25);
        removeListDuplicatedElements0.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode26);
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange29 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange30 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "", combinationsOfChange29);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList31 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays32 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays33 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays32);
        java.lang.String str34 = listnode_mergeSortedArrays33.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode35 = reverseLinkedList31.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays33);
        boolean b36 = pair_comparable_str_combinationsOfChange30.equals((java.lang.Object) listNode35);
        removeListDuplicatedElements0.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode35);
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
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays48 = listnode_mergeSortedArrays47.getData();
        listNode35.setData(mergeSortedArrays48);
        org.junit.Assert.assertNotNull(listNode6);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(binarynode_i11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(listNode14);
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays24);
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays25);
        org.junit.Assert.assertNotNull(listNode26);
        org.junit.Assert.assertNotNull(listNode35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays47);
        org.junit.Assert.assertNotNull(mergeSortedArrays48);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test050");
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
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates25 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST26 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array28 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i29 = sortedArrayToBST26.transform(i_array28);
        java.lang.Integer[] i_array30 = removeDuplicates25.removeUsingSorting(i_array28);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates31 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST32 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array34 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i35 = sortedArrayToBST32.transform(i_array34);
        java.lang.Integer[] i_array36 = removeDuplicates31.removeUsingSorting(i_array34);
        java.lang.Integer[] i_array37 = removeDuplicates25.removeUsingSorting(i_array34);
        java.lang.Integer[] i_array38 = removeDuplicates0.removeUsingSorting(i_array34);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST39 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates40 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates41 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST42 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array44 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i45 = sortedArrayToBST42.transform(i_array44);
        java.lang.Integer[] i_array46 = removeDuplicates41.removeUsingSorting(i_array44);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST47 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array49 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i50 = sortedArrayToBST47.transform(i_array49);
        java.lang.Integer[] i_array51 = removeDuplicates41.removeUsingSorting(i_array49);
        java.lang.Integer[] i_array52 = removeDuplicates40.removeUsingSorting(i_array49);
        java.lang.Integer[] i_array57 = new java.lang.Integer[] { 2, (-14040), (-14040), 27 };
        java.lang.Integer[] i_array58 = removeDuplicates40.removeUsingSet(i_array57);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates59 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates60 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST61 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array63 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i64 = sortedArrayToBST61.transform(i_array63);
        java.lang.Integer[] i_array65 = removeDuplicates60.removeUsingSorting(i_array63);
        java.lang.Integer[] i_array66 = removeDuplicates59.removeUsingSorting(i_array65);
        java.lang.Integer[] i_array67 = removeDuplicates40.removeUsingSet(i_array66);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates68 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST69 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array71 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i72 = sortedArrayToBST69.transform(i_array71);
        java.lang.Integer[] i_array73 = removeDuplicates68.removeUsingSorting(i_array71);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST74 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array76 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i77 = sortedArrayToBST74.transform(i_array76);
        java.lang.Integer[] i_array78 = removeDuplicates68.removeUsingSorting(i_array76);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates79 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates80 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST81 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array83 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i84 = sortedArrayToBST81.transform(i_array83);
        java.lang.Integer[] i_array85 = removeDuplicates80.removeUsingSorting(i_array83);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST86 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array88 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i89 = sortedArrayToBST86.transform(i_array88);
        java.lang.Integer[] i_array90 = removeDuplicates80.removeUsingSorting(i_array88);
        java.lang.Integer[] i_array91 = removeDuplicates79.removeUsingSorting(i_array88);
        java.lang.Integer[] i_array92 = removeDuplicates68.removeUsingSet(i_array91);
        java.lang.Integer[] i_array93 = removeDuplicates40.removeUsingSet(i_array92);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i94 = sortedArrayToBST39.transform(i_array92);
        java.lang.Integer[] i_array95 = removeDuplicates0.removeUsingSet(i_array92);
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
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(binarynode_i29);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(binarynode_i35);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(binarynode_i45);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(binarynode_i50);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array57);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertNotNull(binarynode_i64);
        org.junit.Assert.assertNotNull(i_array65);
        org.junit.Assert.assertNotNull(i_array66);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(i_array71);
        org.junit.Assert.assertNotNull(binarynode_i72);
        org.junit.Assert.assertNotNull(i_array73);
        org.junit.Assert.assertNotNull(i_array76);
        org.junit.Assert.assertNotNull(binarynode_i77);
        org.junit.Assert.assertNotNull(i_array78);
        org.junit.Assert.assertNotNull(i_array83);
        org.junit.Assert.assertNotNull(binarynode_i84);
        org.junit.Assert.assertNotNull(i_array85);
        org.junit.Assert.assertNotNull(i_array88);
        org.junit.Assert.assertNotNull(binarynode_i89);
        org.junit.Assert.assertNotNull(i_array90);
        org.junit.Assert.assertNotNull(i_array91);
        org.junit.Assert.assertNotNull(i_array92);
        org.junit.Assert.assertNotNull(i_array93);
        org.junit.Assert.assertNotNull(binarynode_i94);
        org.junit.Assert.assertNotNull(i_array95);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test051");
        com.github.pedrovgs.problem40.MoveElementsToPositions moveElementsToPositions0 = new com.github.pedrovgs.problem40.MoveElementsToPositions();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        com.github.pedrovgs.problem8.SplitArray splitArray3 = new com.github.pedrovgs.problem8.SplitArray();
        com.github.pedrovgs.problem8.SplitArray splitArray4 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array7 = new int[] { (byte) 1, (byte) 10 };
        splitArray4.splitSwappingPartition(i_array7);
        splitArray3.splitSwappingRecursive(i_array7);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral10 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array11 = new int[][] {};
        int[] i_array12 = goThroughMatrixInSpiral10.go(i_array_array11);
        splitArray3.splitSwappingRecursive(i_array12);
        com.github.pedrovgs.problem80.QuickSort quickSort14 = new com.github.pedrovgs.problem80.QuickSort();
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
        quickSort14.sort(i_array20);
        int[] i_array38 = mergeSortedArrays1.merge(i_array12, i_array20);
        moveElementsToPositions0.move(i_array12);
        org.junit.Assert.assertNotNull(i_array7);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array38);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test052");
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
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel22 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem18.IsBST isBST23 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST24 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array26 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i27 = sortedArrayToBST24.transform(i_array26);
        boolean b28 = isBST23.checkRecursive(binarynode_i27);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode29 = binaryTreeByLevel22.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i27);
        com.github.pedrovgs.problem18.IsBST isBST30 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem46.BinaryTreeSerialization binaryTreeSerialization31 = new com.github.pedrovgs.problem46.BinaryTreeSerialization();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST32 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array34 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i35 = sortedArrayToBST32.transform(i_array34);
        boolean b36 = binarynode_i35.hasRight();
        java.lang.Integer i37 = binarynode_i35.getData();
        java.lang.String str38 = binaryTreeSerialization31.serialize((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i35);
        boolean b39 = isBST30.checkIterative(binarynode_i35);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode40 = binaryTreeByLevel22.getWithoutAdditionalDataStructures((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i35);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode41 = binaryTreePreOrder0.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i35);
        com.github.pedrovgs.problem19.BinaryTreeDepth binaryTreeDepth42 = new com.github.pedrovgs.problem19.BinaryTreeDepth();
        java.lang.Integer[] i_array44 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i45 = new java.util.Stack<java.lang.Integer>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i45, i_array44);
        boolean b47 = stack_i45.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST48 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i49 = stack_i45.search((java.lang.Object) sortedArrayToBST48);
        java.lang.Integer[] i_array53 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i54 = sortedArrayToBST48.transform(i_array53);
        int i55 = binaryTreeDepth42.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i54);
        com.github.pedrovgs.problem19.BinaryTreeDepth binaryTreeDepth56 = new com.github.pedrovgs.problem19.BinaryTreeDepth();
        java.lang.Integer[] i_array58 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i59 = new java.util.Stack<java.lang.Integer>();
        boolean b60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i59, i_array58);
        boolean b61 = stack_i59.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST62 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i63 = stack_i59.search((java.lang.Object) sortedArrayToBST62);
        java.lang.Integer[] i_array67 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i68 = sortedArrayToBST62.transform(i_array67);
        int i69 = binaryTreeDepth56.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i68);
        int i70 = binaryTreeDepth42.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i68);
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
        int i84 = binaryTreeDepth42.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i80);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals85 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem18.IsBST isBST86 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST87 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array89 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i90 = sortedArrayToBST87.transform(i_array89);
        boolean b91 = isBST86.checkRecursive(binarynode_i90);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST92 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array94 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i95 = sortedArrayToBST92.transform(i_array94);
        boolean b96 = binarynode_i95.hasRight();
        boolean b97 = binaryTreeEquals85.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i90, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i95);
        int i98 = binaryTreeDepth42.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i95);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode99 = binaryTreePreOrder0.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i95);
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
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(binarynode_i27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(list_binaryNode29);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(binarynode_i35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + i37 + "' != '" + 100 + "'", i37.equals(100));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "100##" + "'", str38.equals("100##"));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(list_binaryNode40);
        org.junit.Assert.assertNotNull(list_binaryNode41);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i49 == (-1));
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(binarynode_i54);
        org.junit.Assert.assertTrue(i55 == 2);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(i63 == (-1));
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(binarynode_i68);
        org.junit.Assert.assertTrue(i69 == 2);
        org.junit.Assert.assertTrue(i70 == 2);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertNotNull(binarynode_i75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(i_array79);
        org.junit.Assert.assertNotNull(binarynode_i80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNull(binarynode_i82);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(i84 == 1);
        org.junit.Assert.assertNotNull(i_array89);
        org.junit.Assert.assertNotNull(binarynode_i90);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertNotNull(i_array94);
        org.junit.Assert.assertNotNull(binarynode_i95);
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertTrue(b97 == true);
        org.junit.Assert.assertTrue(i98 == 1);
        org.junit.Assert.assertNotNull(list_binaryNode99);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test053");
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
        vector_i5.removeElementAt(3);
        try {
            java.lang.Integer i25 = vector_i5.get(7);
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
        org.junit.Assert.assertNotNull(listiterator_i20);
        org.junit.Assert.assertNotNull(spliterator_i21);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test054");
        com.github.pedrovgs.problem32.Contains contains0 = new com.github.pedrovgs.problem32.Contains();
        boolean b3 = contains0.evaluate("", "/");
        boolean b6 = contains0.evaluate("[]", "BinaryNode{data=100}");
        boolean b9 = contains0.evaluate("/", "1");
        boolean b12 = contains0.evaluate("3", "BinaryNode{data=100}");
        boolean b15 = contains0.evaluate("79", "270");
        boolean b18 = contains0.evaluate("[]", "/###01001/79/");
        boolean b21 = contains0.evaluate("/32/-52/7/]01 ,1-[/", "/[-1, 10]/7/25-/23/");
        boolean b24 = contains0.evaluate("11427", "/23/[/##001/");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test055");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideIterative((int) (byte) 10, (int) (byte) 100);
        float f6 = divideUsingSubtraction0.divideRecursive((int) (byte) 1, (int) '#');
        float f9 = divideUsingSubtraction0.divideRecursive((int) '4', (int) 'a');
        float f12 = divideUsingSubtraction0.divideRecursive((-43680), (-228));
        org.junit.Assert.assertTrue(f3 == 0.1f);
        org.junit.Assert.assertTrue(f6 == 0.028571429f);
        org.junit.Assert.assertTrue(f9 == 0.53608245f);
        org.junit.Assert.assertTrue(f12 == 191.57895f);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test056");
        com.github.pedrovgs.problem4.SquareRoot squareRoot0 = new com.github.pedrovgs.problem4.SquareRoot();
        float f2 = squareRoot0.calculateSquareRootIterative((int) ' ');
        float f4 = squareRoot0.calculateSquareRootRecursive((int) (byte) 10);
        float f6 = squareRoot0.calculateSquareRootRecursive(26);
        float f8 = squareRoot0.calculateSquareRootIterative(0);
        org.junit.Assert.assertTrue(f2 == 5.650014f);
        org.junit.Assert.assertTrue(f4 == 3.1640625f);
        org.junit.Assert.assertTrue(f6 == 5.1035156f);
        org.junit.Assert.assertTrue(f8 == 0.0f);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test057");
        com.github.pedrovgs.problem30.ScientificNotation scientificNotation0 = new com.github.pedrovgs.problem30.ScientificNotation();
        try {
            long long2 = scientificNotation0.calculate("81=atad{edoNyraniB");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test058");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100, 0, (-1), (-1) };
        java.util.Stack<java.lang.Integer> stack_i5 = new java.util.Stack<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i5, i_array4);
        java.lang.Integer i8 = stack_i5.push((java.lang.Integer) 0);
        java.lang.Integer i9 = stack_i5.lastElement();
        java.util.stream.Stream<java.lang.Integer> stream_i10 = stack_i5.stream();
        boolean b11 = stack_i5.empty();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0 + "'", i8.equals(0));
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0 + "'", i9.equals(0));
        org.junit.Assert.assertNotNull(stream_i10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test059");
        com.github.pedrovgs.problem78.AutoBoxingTrick autoBoxingTrick0 = new com.github.pedrovgs.problem78.AutoBoxingTrick();
        boolean b3 = autoBoxingTrick0.compare((java.lang.Integer) 0, (java.lang.Integer) 2147483647);
        boolean b6 = autoBoxingTrick0.compare((java.lang.Integer) 1484783616, (java.lang.Integer) 30);
        boolean b9 = autoBoxingTrick0.compare((java.lang.Integer) 52002, (java.lang.Integer) 11427);
        boolean b12 = autoBoxingTrick0.compare((java.lang.Integer) 13562, (java.lang.Integer) (-2147483637));
        boolean b15 = autoBoxingTrick0.compare((java.lang.Integer) 7, (java.lang.Integer) (-522715136));
        boolean b18 = autoBoxingTrick0.compare((java.lang.Integer) 2147419027, (java.lang.Integer) 101);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test060");
        com.github.pedrovgs.problem39.MultiplyArrayElements multiplyArrayElements0 = new com.github.pedrovgs.problem39.MultiplyArrayElements();
        com.github.pedrovgs.problem80.QuickSort quickSort1 = new com.github.pedrovgs.problem80.QuickSort();
        com.github.pedrovgs.problem8.SplitArray splitArray2 = new com.github.pedrovgs.problem8.SplitArray();
        int[] i_array5 = new int[] { (byte) 1, (byte) 10 };
        splitArray2.splitSwappingPartition(i_array5);
        com.github.pedrovgs.problem2.Vector vector7 = new com.github.pedrovgs.problem2.Vector(i_array5);
        quickSort1.sort(i_array5);
        int[] i_array9 = multiplyArrayElements0.multiply(i_array5);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array9);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test061");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideRecursive(29, 4);
        float f6 = divideUsingSubtraction0.divideRecursive(107, (-1241513984));
        float f9 = divideUsingSubtraction0.divideRecursive((-4142302), 2147419027);
        org.junit.Assert.assertTrue(f3 == 7.25f);
        org.junit.Assert.assertTrue(f6 == 3.4594593f);
        org.junit.Assert.assertTrue(f9 == (-0.0019289678f));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test062");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push(100);
        boolean b3 = stack2_0.empty();
        stack2_0.removeAllElements();
        stack2_0.clear();
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test063");
        com.github.pedrovgs.problem32.Contains contains0 = new com.github.pedrovgs.problem32.Contains();
        boolean b3 = contains0.evaluate("BinaryNode{data=100}", "");
        boolean b6 = contains0.evaluate("/7/!ih/]1-[/]1- ,1 ,1 ,0[/01/!ih/[-1]/01/}01=atad{edoNyraniB/[/1/", "[nul2");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test064");
        com.github.pedrovgs.problem69.BitsToTransform bitsToTransform0 = new com.github.pedrovgs.problem69.BitsToTransform();
        int i3 = bitsToTransform0.calculate((int) '#', (int) (short) 0);
        int i6 = bitsToTransform0.calculate(51, (int) 'a');
        int i9 = bitsToTransform0.calculate(10, (-1241513984));
        int i12 = bitsToTransform0.calculate((int) (short) 1, 23);
        int i15 = bitsToTransform0.calculate(12621, 24);
        int i18 = bitsToTransform0.calculate(0, (-100663296));
        org.junit.Assert.assertTrue(i3 == 3);
        org.junit.Assert.assertTrue(i6 == 3);
        org.junit.Assert.assertTrue(i9 == 7);
        org.junit.Assert.assertTrue(i12 == 3);
        org.junit.Assert.assertTrue(i15 == 7);
        org.junit.Assert.assertTrue(i18 == 6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test065");
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers0 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        int i5 = mergeBinaryNumbers0.merge((int) (byte) 10, (-52000), 2147483647, (-52));
        int i10 = mergeBinaryNumbers0.merge(13, 0, 13631492, (int) ' ');
        int i15 = mergeBinaryNumbers0.merge(52041, 56, 16, (-72574912));
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i10 == 13);
        org.junit.Assert.assertTrue(i15 == 3722057);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test066");
        com.github.pedrovgs.problem68.IsEven isEven0 = new com.github.pedrovgs.problem68.IsEven();
        boolean b2 = isEven0.check((int) (byte) 1);
        boolean b4 = isEven0.check((-6));
        boolean b6 = isEven0.check(11427);
        boolean b8 = isEven0.check((-43680));
        boolean b10 = isEven0.check(1241513983);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test067");
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
        java.lang.String str58 = binarynode_i49.toString();
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
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "BinaryNode{data=100}" + "'", str58.equals("BinaryNode{data=100}"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test068");
        com.github.pedrovgs.problem69.BitsToTransform bitsToTransform0 = new com.github.pedrovgs.problem69.BitsToTransform();
        int i3 = bitsToTransform0.calculate((int) (short) 10, 4);
        int i6 = bitsToTransform0.calculate(11, 56);
        int i9 = bitsToTransform0.calculate((-78), 1681);
        org.junit.Assert.assertTrue(i3 == 3);
        org.junit.Assert.assertTrue(i6 == 4);
        org.junit.Assert.assertTrue(i9 == 25);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test069");
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
        int i14 = vector12.size();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertTrue(i13 == 101);
        org.junit.Assert.assertTrue(i14 == 2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test070");
        com.github.pedrovgs.problem20.MultiplicationWithoutMultiply multiplicationWithoutMultiply0 = new com.github.pedrovgs.problem20.MultiplicationWithoutMultiply();
        int i3 = multiplicationWithoutMultiply0.calculate((-52), (int) (byte) 100);
        int i6 = multiplicationWithoutMultiply0.calculate(1, (-14040));
        int i9 = multiplicationWithoutMultiply0.calculate((-2), (-52));
        int i12 = multiplicationWithoutMultiply0.calculate(21, 1681);
        int i15 = multiplicationWithoutMultiply0.calculate(15, 2147419027);
        org.junit.Assert.assertTrue(i3 == (-5200));
        org.junit.Assert.assertTrue(i6 == (-14040));
        org.junit.Assert.assertTrue(i9 == 104);
        org.junit.Assert.assertTrue(i12 == 35301);
        org.junit.Assert.assertTrue(i15 == 2146514333);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test071");
        com.github.pedrovgs.problem53.CompressString compressString0 = new com.github.pedrovgs.problem53.CompressString();
        java.lang.String str2 = compressString0.compressRecursive("97");
        java.lang.String str4 = compressString0.compressAlternativeApproach("hi!");
        java.lang.String str6 = compressString0.compressRecursive("3");
        java.lang.String str8 = compressString0.compressAlternativeApproach("7");
        java.lang.String str10 = compressString0.compress("270");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97" + "'", str2.equals("97"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "3" + "'", str6.equals("3"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "7" + "'", str8.equals("7"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "27" + "'", str10.equals("27"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test072");
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
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i35 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) (-39648));
        boolean b36 = isBST0.checkIterative(binarynode_i35);
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
        org.junit.Assert.assertTrue(b36 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test073");
        com.github.pedrovgs.problem61.SumLists sumLists0 = new com.github.pedrovgs.problem61.SumLists();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i1 = null;
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList2 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays3 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays4 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays3);
        java.lang.String str5 = listnode_mergeSortedArrays4.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i6 = reverseLinkedList2.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays4);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList7 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays8 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays9 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays8);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays10 = listnode_mergeSortedArrays9.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays11 = listnode_mergeSortedArrays9.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i13 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i14 = null;
        binarynode_i13.setRight(binarynode_i14);
        boolean b16 = listnode_mergeSortedArrays9.equals((java.lang.Object) binarynode_i14);
        com.github.pedrovgs.linkedlist.ListNode listNode17 = reverseLinkedList7.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays9);
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
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i28 = reverseLinkedList7.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays24);
        com.github.pedrovgs.linkedlist.ListNode listNode29 = reverseLinkedList2.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays24);
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
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode41 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays42 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays43 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays42);
        java.lang.String str44 = listnode_mergeSortedArrays43.toString();
        deleteListNode41.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays43);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays46 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays47 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays46);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers48 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b49 = listnode_mergeSortedArrays47.equals((java.lang.Object) mergeBinaryNumbers48);
        deleteListNode41.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays47);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i51 = reverseLinkedList30.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays47);
        com.github.pedrovgs.linkedlist.ListNode listNode52 = reverseLinkedList2.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_i51);
        java.lang.String str53 = listNode52.toString();
        try {
            int i54 = sumLists0.sum(listnode_i1, (com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(listnode_i6);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays10);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays11);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(listNode17);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(listnode_i28);
        org.junit.Assert.assertNotNull(listNode29);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays33);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays34);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(listNode40);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(listnode_i51);
        org.junit.Assert.assertNotNull(listNode52);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test074");
        com.github.pedrovgs.problem50.UniqueChars uniqueChars0 = new com.github.pedrovgs.problem50.UniqueChars();
        boolean b2 = uniqueChars0.evaluate2("/hi!/");
        boolean b4 = uniqueChars0.evaluate2("35");
        boolean b6 = uniqueChars0.evaluate2("/32/-52/7/");
        boolean b8 = uniqueChars0.evaluate("[]");
        boolean b10 = uniqueChars0.evaluate2("/7/25-/23/");
        boolean b12 = uniqueChars0.evaluate2("/hi!");
        boolean b14 = uniqueChars0.evaluate2("10##");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test075");
        com.github.pedrovgs.problem29.AreAnagrams areAnagrams0 = new com.github.pedrovgs.problem29.AreAnagrams();
        boolean b3 = areAnagrams0.check("3", "/!ih/hi!/");
        boolean b6 = areAnagrams0.check("1", "3");
        boolean b9 = areAnagrams0.check("79", "[");
        boolean b12 = areAnagrams0.check("214748364", "BinaryNode{data=32}");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test076");
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList0 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays1 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays2 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays1);
        java.lang.String str3 = listnode_mergeSortedArrays2.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i4 = reverseLinkedList0.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays2);
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
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList32 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements33 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList34 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays35 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays36 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays35);
        java.lang.String str37 = listnode_mergeSortedArrays36.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode38 = reverseLinkedList34.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays36);
        removeListDuplicatedElements33.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode38);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i40 = getTheElementInTheMiddleOfTheList32.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode38);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i41 = getTheElementInTheMiddleOfTheList5.get((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode38);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i42 = reverseLinkedList0.reverseRecursive(listNode38);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList43 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList44 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays45 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays46 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays45);
        java.lang.String str47 = listnode_mergeSortedArrays46.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode48 = reverseLinkedList44.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays46);
        com.github.pedrovgs.problem18.IsBST isBST49 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST50 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array52 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i53 = sortedArrayToBST50.transform(i_array52);
        boolean b54 = isBST49.checkRecursive(binarynode_i53);
        boolean b55 = listNode48.equals((java.lang.Object) binarynode_i53);
        com.github.pedrovgs.linkedlist.ListNode listNode56 = reverseLinkedList43.reverseIterative(listNode48);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList57 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays58 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays59 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays58);
        java.lang.String str60 = listnode_mergeSortedArrays59.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i61 = reverseLinkedList57.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays59);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList62 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays63 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays64 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays63);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays65 = listnode_mergeSortedArrays64.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays66 = listnode_mergeSortedArrays64.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i68 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i69 = null;
        binarynode_i68.setRight(binarynode_i69);
        boolean b71 = listnode_mergeSortedArrays64.equals((java.lang.Object) binarynode_i69);
        com.github.pedrovgs.linkedlist.ListNode listNode72 = reverseLinkedList62.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays64);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode73 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays74 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays75 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays74);
        java.lang.String str76 = listnode_mergeSortedArrays75.toString();
        deleteListNode73.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays75);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays78 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays79 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays78);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers80 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b81 = listnode_mergeSortedArrays79.equals((java.lang.Object) mergeBinaryNumbers80);
        deleteListNode73.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays79);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i83 = reverseLinkedList62.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays79);
        com.github.pedrovgs.linkedlist.ListNode listNode84 = reverseLinkedList57.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays79);
        com.github.pedrovgs.linkedlist.ListNode listNode85 = reverseLinkedList43.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays79);
        com.github.pedrovgs.linkedlist.ListNode listNode86 = reverseLinkedList0.reverseIterative(listNode85);
        org.junit.Assert.assertNotNull(listnode_i4);
        org.junit.Assert.assertNotNull(listNode11);
        org.junit.Assert.assertNotNull(listnode_i13);
        org.junit.Assert.assertNotNull(listnode_i18);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays22);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(listNode29);
        org.junit.Assert.assertNotNull(listNode30);
        org.junit.Assert.assertNotNull(listnode_i31);
        org.junit.Assert.assertNotNull(listNode38);
        org.junit.Assert.assertNotNull(listnode_i40);
        org.junit.Assert.assertNotNull(listnode_i41);
        org.junit.Assert.assertNotNull(listnode_i42);
        org.junit.Assert.assertNotNull(listNode48);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(binarynode_i53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(listNode56);
        org.junit.Assert.assertNotNull(listnode_i61);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays65);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays66);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(listNode72);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(listnode_i83);
        org.junit.Assert.assertNotNull(listNode84);
        org.junit.Assert.assertNotNull(listNode85);
        org.junit.Assert.assertNotNull(listNode86);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test077");
        com.github.pedrovgs.problem37.PathCalculator pathCalculator0 = new com.github.pedrovgs.problem37.PathCalculator();
        java.lang.String str4 = pathCalculator0.calculate("32", "-52", "7");
        java.lang.String str8 = pathCalculator0.calculate("[-1]", "", "/]1-[/]1- ,1 ,1 ,0[/01/");
        java.lang.String str12 = pathCalculator0.calculate("/32/-52/7/", "0##", "/10/100/[/");
        java.lang.String str16 = pathCalculator0.calculate("/,0[/ ,1 ,1 /2-/97/120103#/]1-/###01001/10010###/", "&0/30", "[100, 7]");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "/32/-52/7/" + "'", str4.equals("/32/-52/7/"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/[-1]/]1-[/]1- ,1 ,1 ,0[/01/" + "'", str8.equals("/[-1]/]1-[/]1- ,1 ,1 ,0[/01/"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "/32/-52/7/0##/10/100/[/" + "'", str12.equals("/32/-52/7/0##/10/100/[/"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "/,0[/ ,1 ,1 /2-/97/120103#/]1-/###01001/10010###/&0/30/[100, 7]/" + "'", str16.equals("/,0[/ ,1 ,1 /2-/97/120103#/]1-/###01001/10010###/&0/30/[100, 7]/"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test078");
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
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST11 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array13 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i14 = sortedArrayToBST11.transform(i_array13);
        java.lang.Integer[] i_array15 = removeDuplicates10.removeUsingSorting(i_array13);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates16 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST17 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array19 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i20 = sortedArrayToBST17.transform(i_array19);
        java.lang.Integer[] i_array21 = removeDuplicates16.removeUsingSorting(i_array19);
        java.lang.Integer[] i_array22 = removeDuplicates10.removeUsingSorting(i_array19);
        java.lang.Integer[] i_array23 = removeDuplicates0.removeUsingSet(i_array19);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates24 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates25 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates26 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST27 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array29 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i30 = sortedArrayToBST27.transform(i_array29);
        java.lang.Integer[] i_array31 = removeDuplicates26.removeUsingSorting(i_array29);
        java.lang.Integer[] i_array32 = removeDuplicates25.removeUsingSorting(i_array31);
        java.lang.Integer[] i_array33 = removeDuplicates24.removeUsingSet(i_array31);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates34 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST35 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array37 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i38 = sortedArrayToBST35.transform(i_array37);
        java.lang.Integer[] i_array39 = removeDuplicates34.removeUsingSorting(i_array37);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates40 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST41 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array43 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i44 = sortedArrayToBST41.transform(i_array43);
        java.lang.Integer[] i_array45 = removeDuplicates40.removeUsingSorting(i_array43);
        java.lang.Integer[] i_array46 = removeDuplicates34.removeUsingSorting(i_array43);
        java.lang.Integer[] i_array47 = removeDuplicates24.removeUsingSet(i_array43);
        java.lang.Integer[] i_array48 = removeDuplicates0.removeUsingSorting(i_array43);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(binarynode_i6);
        org.junit.Assert.assertNotNull(i_array7);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(binarynode_i14);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(binarynode_i20);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(binarynode_i30);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(binarynode_i38);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(binarynode_i44);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array48);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test079");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideIterative((int) (byte) 10, (int) (byte) 100);
        float f6 = divideUsingSubtraction0.divideRecursive((int) (byte) 1, (int) '#');
        float f9 = divideUsingSubtraction0.divideRecursive(0, 24);
        float f12 = divideUsingSubtraction0.divideIterative(13, (int) (short) 1);
        float f15 = divideUsingSubtraction0.divideRecursive((-1507336), 10);
        org.junit.Assert.assertTrue(f3 == 0.1f);
        org.junit.Assert.assertTrue(f6 == 0.028571429f);
        org.junit.Assert.assertTrue(f9 == 0.0f);
        org.junit.Assert.assertTrue(f12 == 13.0f);
        org.junit.Assert.assertTrue(f15 == (-150733.6f));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test080");
        com.github.pedrovgs.problem25.Anagrams anagrams0 = new com.github.pedrovgs.problem25.Anagrams();
        java.util.List<java.lang.String> list_str2 = anagrams0.get("0");
        java.util.List<java.lang.String> list_str4 = anagrams0.get("0");
        java.util.List<java.lang.String> list_str6 = anagrams0.get("[null]");
        java.util.List<java.lang.String> list_str8 = anagrams0.get("81");
        java.util.List<java.lang.String> list_str10 = anagrams0.get("!ih");
        org.junit.Assert.assertNotNull(list_str2);
        org.junit.Assert.assertNotNull(list_str4);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertNotNull(list_str8);
        org.junit.Assert.assertNotNull(list_str10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test081");
        com.github.pedrovgs.problem30.ScientificNotation scientificNotation0 = new com.github.pedrovgs.problem30.ScientificNotation();
        try {
            long long2 = scientificNotation0.calculate("[102");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test082");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("0", "");
        com.github.pedrovgs.problem66.TreeToListByLevel treeToListByLevel4 = new com.github.pedrovgs.problem66.TreeToListByLevel();
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder5 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian6 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i8 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d9 = avlTreeMedian6.find(binarynode_i8);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode10 = binaryTreePreOrder5.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i8);
        com.github.pedrovgs.problem18.IsBST isBST11 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST12 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array14 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i15 = sortedArrayToBST12.transform(i_array14);
        boolean b16 = isBST11.checkRecursive(binarynode_i15);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode17 = binaryTreePreOrder5.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i15);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals18 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem18.IsBST isBST19 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST20 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array22 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i23 = sortedArrayToBST20.transform(i_array22);
        boolean b24 = isBST19.checkRecursive(binarynode_i23);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST25 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array27 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i28 = sortedArrayToBST25.transform(i_array27);
        boolean b29 = binarynode_i28.hasRight();
        boolean b30 = binaryTreeEquals18.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i23, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i28);
        com.github.pedrovgs.problem18.IsBST isBST31 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST32 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array34 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i35 = sortedArrayToBST32.transform(i_array34);
        boolean b36 = isBST31.checkRecursive(binarynode_i35);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals37 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST38 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array40 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i41 = sortedArrayToBST38.transform(i_array40);
        boolean b42 = binarynode_i41.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST43 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array45 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i46 = sortedArrayToBST43.transform(i_array45);
        boolean b47 = binarynode_i46.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i48 = binarynode_i46.getRight();
        boolean b49 = binaryTreeEquals37.areEqualsIterative(binarynode_i41, binarynode_i46);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i50 = binarynode_i41.getLeft();
        boolean b51 = isBST31.checkIterative(binarynode_i41);
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian52 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i54 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d55 = avlTreeMedian52.find(binarynode_i54);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor56 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals57 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST58 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array60 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i61 = sortedArrayToBST58.transform(i_array60);
        boolean b62 = binarynode_i61.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST63 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array65 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i66 = sortedArrayToBST63.transform(i_array65);
        boolean b67 = binarynode_i66.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i68 = binarynode_i66.getRight();
        boolean b69 = binaryTreeEquals57.areEqualsIterative(binarynode_i61, binarynode_i66);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST70 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array72 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i73 = sortedArrayToBST70.transform(i_array72);
        boolean b74 = binarynode_i73.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST75 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array77 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i78 = sortedArrayToBST75.transform(i_array77);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode79 = lowestCommonAncestor56.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i66, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i73, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i78);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i80 = binarynode_i66.getLeft();
        double d81 = avlTreeMedian52.find(binarynode_i66);
        boolean b82 = isBST31.checkRecursive(binarynode_i66);
        binarynode_i23.setRight(binarynode_i66);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode84 = binaryTreePreOrder5.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i66);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode85 = treeToListByLevel4.transform((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i66);
        com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem3.SumBinaryNumbers, com.github.pedrovgs.problem66.TreeToListByLevel> pair_sumBinaryNumbers_treeToListByLevel86 = new com.github.pedrovgs.pair.Pair<com.github.pedrovgs.problem3.SumBinaryNumbers, com.github.pedrovgs.problem66.TreeToListByLevel>(sumBinaryNumbers0, treeToListByLevel4);
        try {
            java.lang.String str89 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("-1]/#301021/79/-2/ 1, 1, /[0,", "##001");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        org.junit.Assert.assertTrue(d9 == 10.0d);
        org.junit.Assert.assertNotNull(list_binaryNode10);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(binarynode_i15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(list_binaryNode17);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(binarynode_i23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(binarynode_i28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(binarynode_i35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(binarynode_i41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(binarynode_i46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(binarynode_i48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(binarynode_i50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(d55 == 10.0d);
        org.junit.Assert.assertNotNull(i_array60);
        org.junit.Assert.assertNotNull(binarynode_i61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(i_array65);
        org.junit.Assert.assertNotNull(binarynode_i66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNull(binarynode_i68);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNotNull(i_array72);
        org.junit.Assert.assertNotNull(binarynode_i73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(binarynode_i78);
        org.junit.Assert.assertNull(binaryNode79);
        org.junit.Assert.assertNull(binarynode_i80);
        org.junit.Assert.assertTrue(d81 == 100.0d);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertNotNull(list_binaryNode84);
        org.junit.Assert.assertNotNull(list_binaryNode85);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test083");
        com.github.pedrovgs.problem20.MultiplicationWithoutMultiply multiplicationWithoutMultiply0 = new com.github.pedrovgs.problem20.MultiplicationWithoutMultiply();
        int i3 = multiplicationWithoutMultiply0.calculate(270, (-52));
        int i6 = multiplicationWithoutMultiply0.calculate((int) (byte) 10, (-8));
        int i9 = multiplicationWithoutMultiply0.calculate((-5200), (int) (byte) 10);
        int i12 = multiplicationWithoutMultiply0.calculate(2147471031, 862453760);
        int i15 = multiplicationWithoutMultiply0.calculate(11, 21495880);
        org.junit.Assert.assertTrue(i3 == (-14040));
        org.junit.Assert.assertTrue(i6 == (-80));
        org.junit.Assert.assertTrue(i9 == (-52000));
        org.junit.Assert.assertTrue(i12 == 1868038144);
        org.junit.Assert.assertTrue(i15 == 236454680);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test084");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.ensureCapacity((int) (short) 100);
        boolean b3 = stack2_0.empty();
        int i4 = stack2_0.getMin();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 2147483647);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test085");
        com.github.pedrovgs.problem58.FindKthElement findKthElement0 = new com.github.pedrovgs.problem58.FindKthElement();
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
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList32 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays33 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays34 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays33);
        java.lang.String str35 = listnode_mergeSortedArrays34.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i36 = reverseLinkedList32.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays34);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList37 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays38 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays39 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays38);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays40 = listnode_mergeSortedArrays39.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays41 = listnode_mergeSortedArrays39.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i43 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i44 = null;
        binarynode_i43.setRight(binarynode_i44);
        boolean b46 = listnode_mergeSortedArrays39.equals((java.lang.Object) binarynode_i44);
        com.github.pedrovgs.linkedlist.ListNode listNode47 = reverseLinkedList37.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays39);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode48 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays49 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays50 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays49);
        java.lang.String str51 = listnode_mergeSortedArrays50.toString();
        deleteListNode48.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays50);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays53 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays54 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays53);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers55 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b56 = listnode_mergeSortedArrays54.equals((java.lang.Object) mergeBinaryNumbers55);
        deleteListNode48.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays54);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i58 = reverseLinkedList37.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays54);
        com.github.pedrovgs.linkedlist.ListNode listNode59 = reverseLinkedList32.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays54);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList60 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements61 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList62 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays63 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays64 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays63);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays65 = listnode_mergeSortedArrays64.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays66 = listnode_mergeSortedArrays64.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i68 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i69 = null;
        binarynode_i68.setRight(binarynode_i69);
        boolean b71 = listnode_mergeSortedArrays64.equals((java.lang.Object) binarynode_i69);
        com.github.pedrovgs.linkedlist.ListNode listNode72 = reverseLinkedList62.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays64);
        removeListDuplicatedElements61.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode72);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements74 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList75 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays76 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays77 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays76);
        java.lang.String str78 = listnode_mergeSortedArrays77.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode79 = reverseLinkedList75.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays77);
        removeListDuplicatedElements74.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode79);
        removeListDuplicatedElements61.remove((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode79);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i82 = getTheElementInTheMiddleOfTheList60.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode79);
        com.github.pedrovgs.linkedlist.ListNode listNode83 = reverseLinkedList32.reverseIterative(listNode79);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i84 = getTheElementInTheMiddleOfTheList1.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode79);
        com.github.pedrovgs.linkedlist.ListNode listNode86 = findKthElement0.find(listNode79, 0);
        com.github.pedrovgs.linkedlist.ListNode listNode87 = null;
        try {
            com.github.pedrovgs.linkedlist.ListNode listNode89 = findKthElement0.find2(listNode87, (-2147483570));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays6);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(listNode13);
        org.junit.Assert.assertNotNull(listNode20);
        org.junit.Assert.assertNotNull(listNode28);
        org.junit.Assert.assertNotNull(listnode_i31);
        org.junit.Assert.assertNotNull(listnode_i36);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays40);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays41);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(listNode47);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(listnode_i58);
        org.junit.Assert.assertNotNull(listNode59);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays65);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays66);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(listNode72);
        org.junit.Assert.assertNotNull(listNode79);
        org.junit.Assert.assertNotNull(listnode_i82);
        org.junit.Assert.assertNotNull(listNode83);
        org.junit.Assert.assertNotNull(listnode_i84);
        org.junit.Assert.assertNotNull(listNode86);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test086");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("0", "");
        java.lang.String str6 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("1", "100##");
        try {
            java.lang.String str9 = sumBinaryNumbers0.sumBinaryNumbersBasedOnPowersOfTwo("/97/10010###/23/[/##001/97/10210#3/", "/0/hi!/[102]/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "/0//0" + "'", str6.equals("/0//0"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test087");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(10);
        int i4 = factorial0.getTailRecursive(27);
        int i6 = factorial0.getTailRecursive(60);
        org.junit.Assert.assertTrue(i2 == 3628800);
        org.junit.Assert.assertTrue(i4 == 1484783616);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test088");
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
        java.util.Enumeration<java.lang.Integer> enumeration_i21 = stack2_0.elements();
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
        org.junit.Assert.assertNotNull(enumeration_i21);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test089");
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
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements18 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
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
        removeListDuplicatedElements18.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode29);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements> listnode_removeListDuplicatedElements31 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements>(removeListDuplicatedElements18);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList32 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements33 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList34 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays35 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays36 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays35);
        java.lang.String str37 = listnode_mergeSortedArrays36.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode38 = reverseLinkedList34.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays36);
        removeListDuplicatedElements33.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode38);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i40 = getTheElementInTheMiddleOfTheList32.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode38);
        removeListDuplicatedElements18.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode38);
        listnode_mergeSortedArrays8.setNext((com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>) listNode38);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays43 = listnode_mergeSortedArrays8.getData();
        org.junit.Assert.assertNotNull(listnode_i5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays9);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays10);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(mergeSortedArrays17);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays22);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(listNode29);
        org.junit.Assert.assertNotNull(listNode38);
        org.junit.Assert.assertNotNull(listnode_i40);
        org.junit.Assert.assertNotNull(mergeSortedArrays43);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test090");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.lang.Object obj8 = vector_i4.clone();
        vector_i4.trimToSize();
        int i10 = vector_i4.size();
        java.lang.String str11 = vector_i4.toString();
        try {
            java.lang.Integer i13 = vector_i4.elementAt((-52));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue(i10 == 3);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0, 1, 1]" + "'", str11.equals("[0, 1, 1]"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test091");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnPowersOfTwo("", "");
        try {
            java.lang.String str6 = sumBinaryNumbers0.sumBinaryNumbersCheating("10", "[1, -1, 100, 0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test092");
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
        com.github.pedrovgs.problem69.BitsToTransform bitsToTransform50 = new com.github.pedrovgs.problem69.BitsToTransform();
        int i53 = bitsToTransform50.calculate((int) '#', (int) (short) 0);
        int i56 = bitsToTransform50.calculate(51, (int) 'a');
        int i59 = bitsToTransform50.calculate((int) 'a', (int) (byte) -1);
        int i62 = bitsToTransform50.calculate(1, (int) (short) 1);
        int i65 = bitsToTransform50.calculate(0, 0);
        int i68 = bitsToTransform50.calculate((-125528000), 4956);
        int i71 = bitsToTransform50.calculate(29, 35);
        boolean b72 = listNode48.equals((java.lang.Object) bitsToTransform50);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList73 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements74 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList75 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays76 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays77 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays76);
        java.lang.String str78 = listnode_mergeSortedArrays77.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode79 = reverseLinkedList75.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays77);
        removeListDuplicatedElements74.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode79);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i81 = getTheElementInTheMiddleOfTheList73.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode79);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList82 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays83 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays84 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays83);
        java.lang.String str85 = listnode_mergeSortedArrays84.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i86 = reverseLinkedList82.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays84);
        com.github.pedrovgs.problem62.PalindromeList palindromeList87 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList88 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays89 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays90 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays89);
        java.lang.String str91 = listnode_mergeSortedArrays90.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i92 = reverseLinkedList88.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays90);
        boolean b93 = palindromeList87.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays90);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays94 = listnode_mergeSortedArrays90.getNext();
        listnode_mergeSortedArrays84.setNext(listnode_mergeSortedArrays90);
        listNode79.setNext(listnode_mergeSortedArrays90);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays97 = listnode_mergeSortedArrays90.getNext();
        listNode48.setNext(listnode_mergeSortedArrays90);
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
        org.junit.Assert.assertTrue(i53 == 3);
        org.junit.Assert.assertTrue(i56 == 3);
        org.junit.Assert.assertTrue(i59 == 29);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue(i68 == 14);
        org.junit.Assert.assertTrue(i71 == 5);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(listNode79);
        org.junit.Assert.assertNotNull(listnode_i81);
        org.junit.Assert.assertNotNull(listnode_i86);
        org.junit.Assert.assertNotNull(listnode_i92);
        org.junit.Assert.assertTrue(b93 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays94);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays97);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test093");
        com.github.pedrovgs.problem11.IntToString intToString0 = new com.github.pedrovgs.problem11.IntToString();
        java.lang.String str2 = intToString0.transform((int) '#');
        java.lang.String str4 = intToString0.transform(10);
        java.lang.String str6 = intToString0.transform((-392));
        java.lang.String str8 = intToString0.transform((-39648));
        java.lang.String str10 = intToString0.transform(475165);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "35" + "'", str2.equals("35"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-392" + "'", str6.equals("-392"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-39648" + "'", str8.equals("-39648"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "475165" + "'", str10.equals("475165"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test094");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.stream.Stream<java.lang.Integer> stream_i8 = vector_i4.parallelStream();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        java.lang.Integer[] i_array13 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i14 = new java.util.Vector<java.lang.Integer>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i14, i_array13);
        boolean b17 = vector_i14.remove((java.lang.Object) (short) -1);
        java.util.Enumeration<java.lang.Integer> enumeration_i18 = vector_i14.elements();
        java.lang.Object[] obj_array19 = vector_i14.toArray();
        vector_i14.addElement((java.lang.Integer) (-1));
        java.lang.Integer i22 = vector_i14.firstElement();
        java.lang.Integer i23 = vector_i14.lastElement();
        vector_i14.removeAllElements();
        com.github.pedrovgs.problem71.ReverseBinaryNumber reverseBinaryNumber25 = new com.github.pedrovgs.problem71.ReverseBinaryNumber();
        int i26 = vector_i14.lastIndexOf((java.lang.Object) reverseBinaryNumber25);
        java.util.Enumeration<java.lang.Integer> enumeration_i27 = vector_i14.elements();
        com.github.pedrovgs.problem37.PathCalculator pathCalculator28 = new com.github.pedrovgs.problem37.PathCalculator();
        java.lang.String str32 = pathCalculator28.calculate("", "/", "hi!");
        java.lang.String str36 = pathCalculator28.calculate("2147483647", "]1-[", "");
        int i37 = vector_i14.lastIndexOf((java.lang.Object) "2147483647");
        java.util.Iterator<java.lang.Integer> iterator_i38 = vector_i14.iterator();
        boolean b39 = vector_i4.equals((java.lang.Object) iterator_i38);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(stream_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(enumeration_i18);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue("'" + i22 + "' != '" + 0 + "'", i22.equals(0));
        org.junit.Assert.assertTrue("'" + i23 + "' != '" + (-1) + "'", i23.equals((-1)));
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertNotNull(enumeration_i27);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "/hi!/" + "'", str32.equals("/hi!/"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "/2147483647/]1-[/" + "'", str36.equals("/2147483647/]1-[/"));
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertNotNull(iterator_i38);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test095");
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder0 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian1 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i3 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d4 = avlTreeMedian1.find(binarynode_i3);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode5 = binaryTreePreOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i3);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST6 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array8 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i9 = sortedArrayToBST6.transform(i_array8);
        java.lang.String str10 = binarynode_i9.toString();
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_11 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_11.push((int) (byte) 10);
        int i14 = stack1_11.getMin();
        boolean b15 = binarynode_i9.equals((java.lang.Object) stack1_11);
        java.lang.Integer i16 = binarynode_i9.getData();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode17 = binaryTreePreOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i9);
        com.github.pedrovgs.problem19.BinaryTreeDepth binaryTreeDepth18 = new com.github.pedrovgs.problem19.BinaryTreeDepth();
        java.lang.Integer[] i_array20 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i21 = new java.util.Stack<java.lang.Integer>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i21, i_array20);
        boolean b23 = stack_i21.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST24 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i25 = stack_i21.search((java.lang.Object) sortedArrayToBST24);
        java.lang.Integer[] i_array29 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i30 = sortedArrayToBST24.transform(i_array29);
        int i31 = binaryTreeDepth18.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i30);
        com.github.pedrovgs.problem19.BinaryTreeDepth binaryTreeDepth32 = new com.github.pedrovgs.problem19.BinaryTreeDepth();
        java.lang.Integer[] i_array34 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i35 = new java.util.Stack<java.lang.Integer>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i35, i_array34);
        boolean b37 = stack_i35.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST38 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i39 = stack_i35.search((java.lang.Object) sortedArrayToBST38);
        java.lang.Integer[] i_array43 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i44 = sortedArrayToBST38.transform(i_array43);
        int i45 = binaryTreeDepth32.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i44);
        int i46 = binaryTreeDepth18.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i44);
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
        int i60 = binaryTreeDepth18.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i56);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals61 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem18.IsBST isBST62 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST63 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array65 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i66 = sortedArrayToBST63.transform(i_array65);
        boolean b67 = isBST62.checkRecursive(binarynode_i66);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST68 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array70 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i71 = sortedArrayToBST68.transform(i_array70);
        boolean b72 = binarynode_i71.hasRight();
        boolean b73 = binaryTreeEquals61.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i66, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i71);
        int i74 = binaryTreeDepth18.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i71);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode75 = binaryTreePreOrder0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i71);
        org.junit.Assert.assertTrue(d4 == 10.0d);
        org.junit.Assert.assertNotNull(list_binaryNode5);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(binarynode_i9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "BinaryNode{data=100}" + "'", str10.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100 + "'", i16.equals(100));
        org.junit.Assert.assertNotNull(list_binaryNode17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(binarynode_i30);
        org.junit.Assert.assertTrue(i31 == 2);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(binarynode_i44);
        org.junit.Assert.assertTrue(i45 == 2);
        org.junit.Assert.assertTrue(i46 == 2);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(binarynode_i51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(i_array55);
        org.junit.Assert.assertNotNull(binarynode_i56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(binarynode_i58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(i60 == 1);
        org.junit.Assert.assertNotNull(i_array65);
        org.junit.Assert.assertNotNull(binarynode_i66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(i_array70);
        org.junit.Assert.assertNotNull(binarynode_i71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(i74 == 1);
        org.junit.Assert.assertNotNull(list_binaryNode75);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test096");
        com.github.pedrovgs.problem3.SumBinaryNumbers sumBinaryNumbers0 = new com.github.pedrovgs.problem3.SumBinaryNumbers();
        java.lang.String str3 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("0", "");
        java.lang.String str6 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("##001", "100##");
        try {
            java.lang.String str9 = sumBinaryNumbers0.sumBinaryNumbersBasedOnCount("/1/3/[0, 1, 1, -1]/", "/[-1]/01/}01=atad{edoNyraniB/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "&0///0" + "'", str6.equals("&0///0"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test097");
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
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode26 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays27 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays28 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays27);
        java.lang.String str29 = listnode_mergeSortedArrays28.toString();
        deleteListNode26.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays28);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays31 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays32 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays31);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers33 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b34 = listnode_mergeSortedArrays32.equals((java.lang.Object) mergeBinaryNumbers33);
        deleteListNode26.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays32);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i36 = reverseLinkedList15.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays32);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays37 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays38 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays37);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers39 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b40 = listnode_mergeSortedArrays38.equals((java.lang.Object) mergeBinaryNumbers39);
        com.github.pedrovgs.linkedlist.ListNode listNode41 = reverseLinkedList15.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays38);
        removeListDuplicatedElements1.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode41);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays43 = listNode41.getNext();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements44 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList45 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays46 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays47 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays46);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays48 = listnode_mergeSortedArrays47.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays49 = listnode_mergeSortedArrays47.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i51 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i52 = null;
        binarynode_i51.setRight(binarynode_i52);
        boolean b54 = listnode_mergeSortedArrays47.equals((java.lang.Object) binarynode_i52);
        com.github.pedrovgs.linkedlist.ListNode listNode55 = reverseLinkedList45.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays47);
        removeListDuplicatedElements44.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode55);
        try {
            int i57 = sumLists0.sumReverse((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode41, (com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode55);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(listNode12);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays18);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(listNode25);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(listnode_i36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(listNode41);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays43);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays48);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays49);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(listNode55);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test098");
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
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode17 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays18 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays19 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays18);
        java.lang.String str20 = listnode_mergeSortedArrays19.toString();
        deleteListNode17.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays19);
        boolean b22 = palindromeList0.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays19);
        com.github.pedrovgs.problem62.PalindromeList palindromeList23 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList24 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays25 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays26 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays25);
        java.lang.String str27 = listnode_mergeSortedArrays26.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i28 = reverseLinkedList24.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays26);
        boolean b29 = palindromeList23.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays26);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays30 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays31 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays30);
        java.lang.String str32 = listnode_mergeSortedArrays31.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays33 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays34 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays33);
        java.lang.String str35 = listnode_mergeSortedArrays34.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays36 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays34.setData(mergeSortedArrays36);
        listnode_mergeSortedArrays31.setNext(listnode_mergeSortedArrays34);
        boolean b39 = palindromeList23.checkReversing((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays31);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode40 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays41 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays42 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays41);
        java.lang.String str43 = listnode_mergeSortedArrays42.toString();
        deleteListNode40.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays42);
        boolean b45 = palindromeList23.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays42);
        com.github.pedrovgs.problem62.PalindromeList palindromeList46 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList47 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays48 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays49 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays48);
        java.lang.String str50 = listnode_mergeSortedArrays49.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i51 = reverseLinkedList47.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays49);
        boolean b52 = palindromeList46.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays49);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays53 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays54 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays53);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays55 = listnode_mergeSortedArrays54.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays56 = listnode_mergeSortedArrays54.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i58 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i59 = null;
        binarynode_i58.setRight(binarynode_i59);
        boolean b61 = listnode_mergeSortedArrays54.equals((java.lang.Object) binarynode_i59);
        listnode_mergeSortedArrays49.setNext(listnode_mergeSortedArrays54);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays63 = listnode_mergeSortedArrays54.getData();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements64 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList65 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays66 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays67 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays66);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays68 = listnode_mergeSortedArrays67.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays69 = listnode_mergeSortedArrays67.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i71 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i72 = null;
        binarynode_i71.setRight(binarynode_i72);
        boolean b74 = listnode_mergeSortedArrays67.equals((java.lang.Object) binarynode_i72);
        com.github.pedrovgs.linkedlist.ListNode listNode75 = reverseLinkedList65.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays67);
        removeListDuplicatedElements64.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode75);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements> listnode_removeListDuplicatedElements77 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements>(removeListDuplicatedElements64);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList78 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements79 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList80 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays81 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays82 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays81);
        java.lang.String str83 = listnode_mergeSortedArrays82.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode84 = reverseLinkedList80.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays82);
        removeListDuplicatedElements79.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode84);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i86 = getTheElementInTheMiddleOfTheList78.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode84);
        removeListDuplicatedElements64.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode84);
        listnode_mergeSortedArrays54.setNext((com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>) listNode84);
        boolean b89 = palindromeList23.checkReversing(listNode84);
        boolean b90 = palindromeList0.checkIterative(listNode84);
        org.junit.Assert.assertNotNull(listnode_i5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(listnode_i28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(listnode_i51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays55);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays56);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(mergeSortedArrays63);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays68);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays69);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(listNode75);
        org.junit.Assert.assertNotNull(listNode84);
        org.junit.Assert.assertNotNull(listnode_i86);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertTrue(b90 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test099");
        com.github.pedrovgs.problem44.FindMinNumberAtPosition findMinNumberAtPosition0 = new com.github.pedrovgs.problem44.FindMinNumberAtPosition();
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder1 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel2 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel3 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem18.IsBST isBST4 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST5 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array7 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i8 = sortedArrayToBST5.transform(i_array7);
        boolean b9 = isBST4.checkRecursive(binarynode_i8);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode10 = binaryTreeByLevel3.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i8);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode11 = binaryTreeByLevel2.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i8);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i12 = binaryTreeInOrder1.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i8);
        java.lang.Integer[] i_array14 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i15 = new java.util.Stack<java.lang.Integer>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i15, i_array14);
        boolean b17 = stack_i15.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST18 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i19 = stack_i15.search((java.lang.Object) sortedArrayToBST18);
        java.lang.Integer[] i_array23 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i24 = sortedArrayToBST18.transform(i_array23);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i25 = binaryTreeInOrder1.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i24);
        try {
            java.lang.Integer i27 = findMinNumberAtPosition0.find(binarynode_i24, 2146514333);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array7);
        org.junit.Assert.assertNotNull(binarynode_i8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(list_binaryNode10);
        org.junit.Assert.assertNotNull(list_binaryNode11);
        org.junit.Assert.assertNotNull(list_binarynode_i12);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(binarynode_i24);
        org.junit.Assert.assertNotNull(list_binarynode_i25);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test100");
        com.github.pedrovgs.problem46.BinaryTreeSerialization binaryTreeSerialization0 = new com.github.pedrovgs.problem46.BinaryTreeSerialization();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i2 = binaryTreeSerialization0.deserialize("[]");
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i4 = binaryTreeSerialization0.deserialize("102#2");
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i6 = binaryTreeSerialization0.deserialize("-2147483637");
        org.junit.Assert.assertNotNull(binarynode_i2);
        org.junit.Assert.assertNotNull(binarynode_i4);
        org.junit.Assert.assertNotNull(binarynode_i6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test101");
        com.github.pedrovgs.problem60.PartitionList partitionList0 = new com.github.pedrovgs.problem60.PartitionList();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i1 = null;
        try {
            com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i3 = partitionList0.split(listnode_i1, (-851968));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test102");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(10);
        int i4 = factorial0.getTailRecursive((int) (short) 10);
        int i6 = factorial0.getRecursive(0);
        int i8 = factorial0.getTailRecursive((int) (byte) 1);
        int i10 = factorial0.getTailRecursive(71);
        try {
            int i12 = factorial0.getTailRecursive((-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 3628800);
        org.junit.Assert.assertTrue(i4 == 3628800);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test103");
        com.github.pedrovgs.problem53.CompressString compressString0 = new com.github.pedrovgs.problem53.CompressString();
        java.lang.String str2 = compressString0.compressRecursive("/");
        java.lang.String str4 = compressString0.compressRecursive("79");
        java.lang.String str6 = compressString0.compressAlternativeApproach("[102");
        java.lang.String str8 = compressString0.compressAlternativeApproach("1] 1, 1, [0,");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/" + "'", str2.equals("/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "79" + "'", str4.equals("79"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[102" + "'", str6.equals("[102"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1] 1, 1, [0," + "'", str8.equals("1] 1, 1, [0,"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test104");
        com.github.pedrovgs.problem68.IsEven isEven0 = new com.github.pedrovgs.problem68.IsEven();
        boolean b2 = isEven0.check((int) (byte) 1);
        boolean b4 = isEven0.check(0);
        boolean b6 = isEven0.check(4);
        boolean b8 = isEven0.check((int) (short) 10);
        boolean b10 = isEven0.check(0);
        boolean b12 = isEven0.check(1463287736);
        boolean b14 = isEven0.check((-221));
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test105");
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
        int i19 = stack2_0.capacity();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue(i19 == 10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test106");
        com.github.pedrovgs.problem20.MultiplicationWithoutMultiply multiplicationWithoutMultiply0 = new com.github.pedrovgs.problem20.MultiplicationWithoutMultiply();
        int i3 = multiplicationWithoutMultiply0.calculate((-52), (int) (byte) 100);
        int i6 = multiplicationWithoutMultiply0.calculate(1, (-14040));
        int i9 = multiplicationWithoutMultiply0.calculate(1946209058, (-77));
        int i12 = multiplicationWithoutMultiply0.calculate(29, 172569);
        org.junit.Assert.assertTrue(i3 == (-5200));
        org.junit.Assert.assertTrue(i6 == (-14040));
        org.junit.Assert.assertTrue(i9 == 465757894);
        org.junit.Assert.assertTrue(i12 == 5004501);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test107");
        com.github.pedrovgs.problem27.ReverseSentence reverseSentence0 = new com.github.pedrovgs.problem27.ReverseSentence();
        java.lang.String str2 = reverseSentence0.reverse("hi!");
        java.lang.String str4 = reverseSentence0.reverse("/hi!/");
        java.lang.String str6 = reverseSentence0.reverse("[]");
        java.lang.String str8 = reverseSentence0.reverse("hi!");
        java.lang.String str10 = reverseSentence0.reverse("BinaryNode{data=10}");
        java.lang.String str12 = reverseSentence0.reverse("1] 1, 1, [0,");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "/hi!/" + "'", str4.equals("/hi!/"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "BinaryNode{data=10}" + "'", str10.equals("BinaryNode{data=10}"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[0, 1, 1, 1]" + "'", str12.equals("[0, 1, 1, 1]"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test108");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push(100);
        int i3 = stack2_0.capacity();
        java.util.Iterator<java.lang.Integer> iterator_i4 = stack2_0.iterator();
        java.lang.Object[] obj_array5 = stack2_0.toArray();
        java.lang.Integer i6 = stack2_0.peek();
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_7 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_7.push((int) (byte) 10);
        int i10 = stack1_7.getMin();
        int i11 = stack1_7.getMin();
        int i12 = stack2_0.indexOf((java.lang.Object) i11);
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertNotNull(iterator_i4);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100 + "'", i6.equals(100));
        org.junit.Assert.assertTrue(i10 == 10);
        org.junit.Assert.assertTrue(i11 == 10);
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test109");
        com.github.pedrovgs.problem26.Palindromes palindromes0 = new com.github.pedrovgs.problem26.Palindromes();
        boolean b2 = palindromes0.evaluate("/");
        boolean b4 = palindromes0.evaluate("10");
        boolean b6 = palindromes0.evaluate("/23/[/#2021/");
        boolean b8 = palindromes0.evaluate("");
        boolean b10 = palindromes0.evaluate("/#301021/79/");
        boolean b12 = palindromes0.evaluate("112197661");
        boolean b14 = palindromes0.evaluate("");
        boolean b16 = palindromes0.evaluate("02");
        boolean b18 = palindromes0.evaluate("-2");
        boolean b20 = palindromes0.evaluate("/1/3/[0, 1, 1, -1]/");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test110");
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
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian27 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i29 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d30 = avlTreeMedian27.find(binarynode_i29);
        com.github.pedrovgs.problem21.LowestCommonAncestor lowestCommonAncestor31 = new com.github.pedrovgs.problem21.LowestCommonAncestor();
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals32 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST33 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array35 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i36 = sortedArrayToBST33.transform(i_array35);
        boolean b37 = binarynode_i36.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST38 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array40 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i41 = sortedArrayToBST38.transform(i_array40);
        boolean b42 = binarynode_i41.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i43 = binarynode_i41.getRight();
        boolean b44 = binaryTreeEquals32.areEqualsIterative(binarynode_i36, binarynode_i41);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST45 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array47 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i48 = sortedArrayToBST45.transform(i_array47);
        boolean b49 = binarynode_i48.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST50 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array52 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i53 = sortedArrayToBST50.transform(i_array52);
        com.github.pedrovgs.binarytree.BinaryNode binaryNode54 = lowestCommonAncestor31.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i41, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i48, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i53);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i55 = binarynode_i41.getLeft();
        double d56 = avlTreeMedian27.find(binarynode_i41);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST57 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array59 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i60 = sortedArrayToBST57.transform(i_array59);
        boolean b61 = binarynode_i60.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i62 = binarynode_i60.getRight();
        java.lang.Integer i63 = binarynode_i60.getData();
        binarynode_i41.setLeft(binarynode_i60);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i65 = binarynode_i60.getRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i66 = binarynode_i60.getRight();
        try {
            boolean b67 = isBST0.checkRecursive(binarynode_i66);
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
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "BinaryNode{data=100}" + "'", str25.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(d30 == 10.0d);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(binarynode_i36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(binarynode_i41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(binarynode_i43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(binarynode_i48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(binarynode_i53);
        org.junit.Assert.assertNull(binaryNode54);
        org.junit.Assert.assertNull(binarynode_i55);
        org.junit.Assert.assertTrue(d56 == 100.0d);
        org.junit.Assert.assertNotNull(i_array59);
        org.junit.Assert.assertNotNull(binarynode_i60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(binarynode_i62);
        org.junit.Assert.assertTrue("'" + i63 + "' != '" + 100 + "'", i63.equals(100));
        org.junit.Assert.assertNull(binarynode_i65);
        org.junit.Assert.assertNull(binarynode_i66);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test111");
        com.github.pedrovgs.problem44.FindMinNumberAtPosition findMinNumberAtPosition0 = new com.github.pedrovgs.problem44.FindMinNumberAtPosition();
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i3 = new java.util.Stack<java.lang.Integer>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i3, i_array2);
        boolean b5 = stack_i3.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST6 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i7 = stack_i3.search((java.lang.Object) sortedArrayToBST6);
        java.lang.Integer[] i_array11 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i12 = sortedArrayToBST6.transform(i_array11);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates13 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates14 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST15 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array17 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i18 = sortedArrayToBST15.transform(i_array17);
        java.lang.Integer[] i_array19 = removeDuplicates14.removeUsingSorting(i_array17);
        java.lang.Integer[] i_array20 = removeDuplicates13.removeUsingSorting(i_array19);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i21 = sortedArrayToBST6.transform(i_array19);
        com.github.pedrovgs.problem16.BinaryTreePostOrder binaryTreePostOrder22 = new com.github.pedrovgs.problem16.BinaryTreePostOrder();
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder23 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
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
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i62 = binaryTreeInOrder23.getIterative(binarynode_i57);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode63 = binaryTreePostOrder22.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i57);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i65 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 27);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode66 = binaryTreePostOrder22.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i65);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST67 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array69 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i70 = sortedArrayToBST67.transform(i_array69);
        java.lang.String str71 = binarynode_i70.toString();
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_72 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_72.push((int) (byte) 10);
        int i75 = stack1_72.getMin();
        boolean b76 = binarynode_i70.equals((java.lang.Object) stack1_72);
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel77 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem18.IsBST isBST78 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST79 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array81 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i82 = sortedArrayToBST79.transform(i_array81);
        boolean b83 = isBST78.checkRecursive(binarynode_i82);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode84 = binaryTreeByLevel77.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i82);
        binarynode_i70.setRight(binarynode_i82);
        boolean b86 = binarynode_i70.hasLeft();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode87 = binaryTreePostOrder22.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i70);
        binarynode_i21.setLeft(binarynode_i70);
        try {
            java.lang.Integer i90 = findMinNumberAtPosition0.find(binarynode_i70, 52002);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(binarynode_i12);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(binarynode_i18);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(binarynode_i21);
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
        org.junit.Assert.assertNotNull(list_binarynode_i62);
        org.junit.Assert.assertNotNull(list_binaryNode63);
        org.junit.Assert.assertNotNull(list_binaryNode66);
        org.junit.Assert.assertNotNull(i_array69);
        org.junit.Assert.assertNotNull(binarynode_i70);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "BinaryNode{data=100}" + "'", str71.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue(i75 == 10);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(i_array81);
        org.junit.Assert.assertNotNull(binarynode_i82);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(list_binaryNode84);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(list_binaryNode87);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test112");
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
        int[] i_array16 = new int[] { 107, 3628800 };
        int[][] i_array_array17 = new int[][] { i_array16 };
        int[] i_array18 = goThroughMatrixInSpiral11.go(i_array_array17);
        rewriteRowAndColumnsWithZeros1.rewrite(i_array_array17);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros> listnode_rewriteRowAndColumnsWithZeros20 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros>(rewriteRowAndColumnsWithZeros1);
        com.github.pedrovgs.problem42.FloodFill floodFill21 = new com.github.pedrovgs.problem42.FloodFill();
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros22 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral23 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array24 = new int[][] {};
        int[] i_array25 = goThroughMatrixInSpiral23.go(i_array_array24);
        int[] i_array28 = new int[] { 107, 3628800 };
        int[][] i_array_array29 = new int[][] { i_array28 };
        int[] i_array30 = goThroughMatrixInSpiral23.go(i_array_array29);
        rewriteRowAndColumnsWithZeros22.rewrite(i_array_array29);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral32 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array33 = new int[][] {};
        int[] i_array34 = goThroughMatrixInSpiral32.go(i_array_array33);
        int[] i_array37 = new int[] { 107, 3628800 };
        int[][] i_array_array38 = new int[][] { i_array37 };
        int[] i_array39 = goThroughMatrixInSpiral32.go(i_array_array38);
        rewriteRowAndColumnsWithZeros22.rewrite(i_array_array38);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral41 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array42 = new int[][] {};
        int[] i_array43 = goThroughMatrixInSpiral41.go(i_array_array42);
        rewriteRowAndColumnsWithZeros22.rewrite(i_array_array42);
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros45 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral46 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array47 = new int[][] {};
        int[] i_array48 = goThroughMatrixInSpiral46.go(i_array_array47);
        int[] i_array51 = new int[] { 107, 3628800 };
        int[][] i_array_array52 = new int[][] { i_array51 };
        int[] i_array53 = goThroughMatrixInSpiral46.go(i_array_array52);
        rewriteRowAndColumnsWithZeros45.rewrite(i_array_array52);
        rewriteRowAndColumnsWithZeros22.rewrite(i_array_array52);
        floodFill21.apply(i_array_array52, (int) (short) 100, 11427, 22, 12621);
        rewriteRowAndColumnsWithZeros1.rewrite(i_array_array52);
        rewriteRowAndColumnsWithZeros0.rewrite(i_array_array52);
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
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array_array29);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(i_array_array33);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array42);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array_array52);
        org.junit.Assert.assertNotNull(i_array53);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test113");
        com.github.pedrovgs.problem32.Contains contains0 = new com.github.pedrovgs.problem32.Contains();
        boolean b3 = contains0.evaluate("", "/");
        boolean b6 = contains0.evaluate("0", "/hi!/");
        boolean b9 = contains0.evaluate("]0 ,001 ,1- ,1[", "[102]");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test114");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        vector_i5.addElement((java.lang.Integer) (-8));
        boolean b13 = vector_i5.add((java.lang.Integer) 11);
        boolean b15 = vector_i5.add((java.lang.Integer) (-2147483570));
        java.util.Iterator<java.lang.Integer> iterator_i16 = vector_i5.iterator();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(iterator_i16);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test115");
        com.github.pedrovgs.problem78.AutoBoxingTrick autoBoxingTrick0 = new com.github.pedrovgs.problem78.AutoBoxingTrick();
        boolean b3 = autoBoxingTrick0.compare((java.lang.Integer) 720, (java.lang.Integer) 51);
        boolean b6 = autoBoxingTrick0.compare((java.lang.Integer) 45, (java.lang.Integer) (-6));
        boolean b9 = autoBoxingTrick0.compare((java.lang.Integer) (-780), (java.lang.Integer) (-720));
        boolean b12 = autoBoxingTrick0.compare((java.lang.Integer) 35, (java.lang.Integer) (-1241513984));
        boolean b15 = autoBoxingTrick0.compare((java.lang.Integer) 14, (java.lang.Integer) 16);
        boolean b18 = autoBoxingTrick0.compare((java.lang.Integer) 475165, (java.lang.Integer) (-4142302));
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test116");
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
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral23 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        com.github.pedrovgs.problem42.FloodFill floodFill24 = new com.github.pedrovgs.problem42.FloodFill();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral25 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array26 = new int[][] {};
        int[] i_array27 = goThroughMatrixInSpiral25.go(i_array_array26);
        floodFill24.apply(i_array_array26, (-52), 2, (int) '#', 51);
        int[] i_array33 = goThroughMatrixInSpiral23.go(i_array_array26);
        com.github.pedrovgs.problem42.FloodFill floodFill34 = new com.github.pedrovgs.problem42.FloodFill();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral35 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array36 = new int[][] {};
        int[] i_array37 = goThroughMatrixInSpiral35.go(i_array_array36);
        int[] i_array44 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[] i_array51 = new int[] { 2, 2147483647, (byte) -1, (short) 100, (byte) -1, 3 };
        int[][] i_array_array52 = new int[][] { i_array44, i_array51 };
        int[] i_array53 = goThroughMatrixInSpiral35.go(i_array_array52);
        floodFill34.apply(i_array_array52, (int) (byte) 1, (int) (byte) 0, (int) ' ', (-5200));
        int[] i_array59 = goThroughMatrixInSpiral23.go(i_array_array52);
        rewriteRowAndColumnsWithZeros0.rewrite(i_array_array52);
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
        org.junit.Assert.assertNotNull(i_array_array26);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array_array52);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(i_array59);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test117");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 1, (-1), 100, 0 };
        java.util.Vector<java.lang.Integer> vector_i5 = new java.util.Vector<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i5, i_array4);
        int i9 = vector_i5.lastIndexOf((java.lang.Object) 0.0f, (int) (short) 0);
        java.util.Spliterator<java.lang.Integer> spliterator_i10 = vector_i5.spliterator();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates11 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST12 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array14 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i15 = sortedArrayToBST12.transform(i_array14);
        java.lang.Integer[] i_array16 = removeDuplicates11.removeUsingSorting(i_array14);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST17 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array19 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i20 = sortedArrayToBST17.transform(i_array19);
        java.lang.Integer[] i_array21 = removeDuplicates11.removeUsingSorting(i_array19);
        boolean b22 = vector_i5.remove((java.lang.Object) removeDuplicates11);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates23 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST24 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array26 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i27 = sortedArrayToBST24.transform(i_array26);
        java.lang.Integer[] i_array28 = removeDuplicates23.removeUsingSorting(i_array26);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST29 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array31 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i32 = sortedArrayToBST29.transform(i_array31);
        java.lang.Integer[] i_array33 = removeDuplicates23.removeUsingSorting(i_array31);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates34 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST35 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array37 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i38 = sortedArrayToBST35.transform(i_array37);
        java.lang.Integer[] i_array39 = removeDuplicates34.removeUsingSorting(i_array37);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates40 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST41 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array43 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i44 = sortedArrayToBST41.transform(i_array43);
        java.lang.Integer[] i_array45 = removeDuplicates40.removeUsingSorting(i_array43);
        java.lang.Integer[] i_array46 = removeDuplicates34.removeUsingSorting(i_array43);
        java.lang.Integer[] i_array47 = removeDuplicates23.removeUsingSorting(i_array43);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates48 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates49 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST50 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array52 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i53 = sortedArrayToBST50.transform(i_array52);
        java.lang.Integer[] i_array54 = removeDuplicates49.removeUsingSorting(i_array52);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST55 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array57 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i58 = sortedArrayToBST55.transform(i_array57);
        java.lang.Integer[] i_array59 = removeDuplicates49.removeUsingSorting(i_array57);
        java.lang.Integer[] i_array60 = removeDuplicates48.removeUsingSorting(i_array57);
        java.lang.Integer[] i_array65 = new java.lang.Integer[] { 2, (-14040), (-14040), 27 };
        java.lang.Integer[] i_array66 = removeDuplicates48.removeUsingSet(i_array65);
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates67 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem10.RemoveDuplicates removeDuplicates68 = new com.github.pedrovgs.problem10.RemoveDuplicates();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST69 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array71 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i72 = sortedArrayToBST69.transform(i_array71);
        java.lang.Integer[] i_array73 = removeDuplicates68.removeUsingSorting(i_array71);
        java.lang.Integer[] i_array74 = removeDuplicates67.removeUsingSorting(i_array73);
        java.lang.Integer[] i_array75 = removeDuplicates48.removeUsingSet(i_array74);
        java.lang.Integer[] i_array76 = removeDuplicates23.removeUsingSorting(i_array74);
        java.lang.Integer[] i_array77 = removeDuplicates11.removeUsingSorting(i_array76);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(spliterator_i10);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(binarynode_i15);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(binarynode_i20);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(binarynode_i27);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(binarynode_i32);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(binarynode_i38);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(binarynode_i44);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(binarynode_i53);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(i_array57);
        org.junit.Assert.assertNotNull(binarynode_i58);
        org.junit.Assert.assertNotNull(i_array59);
        org.junit.Assert.assertNotNull(i_array60);
        org.junit.Assert.assertNotNull(i_array65);
        org.junit.Assert.assertNotNull(i_array66);
        org.junit.Assert.assertNotNull(i_array71);
        org.junit.Assert.assertNotNull(binarynode_i72);
        org.junit.Assert.assertNotNull(i_array73);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertNotNull(i_array75);
        org.junit.Assert.assertNotNull(i_array76);
        org.junit.Assert.assertNotNull(i_array77);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test118");
        com.github.pedrovgs.problem68.IsEven isEven0 = new com.github.pedrovgs.problem68.IsEven();
        boolean b2 = isEven0.check(1484783616);
        boolean b4 = isEven0.check((-1401552895));
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test119");
        com.github.pedrovgs.problem4.SquareRoot squareRoot0 = new com.github.pedrovgs.problem4.SquareRoot();
        float f2 = squareRoot0.calculateSquareRootIterative((int) ' ');
        float f4 = squareRoot0.calculateSquareRootRecursive(720);
        float f6 = squareRoot0.calculateSquareRootIterative(5);
        org.junit.Assert.assertTrue(f2 == 5.650014f);
        org.junit.Assert.assertTrue(f4 == 26.834106f);
        org.junit.Assert.assertTrue(f6 == 2.2500002f);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test120");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push(100);
        java.lang.Object[] obj_array3 = stack2_0.toArray();
        java.util.stream.Stream<java.lang.Integer> stream_i4 = stack2_0.parallelStream();
        int i5 = stack2_0.getMin();
        stack2_0.push(720);
        stack2_0.push((-51973));
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(stream_i4);
        org.junit.Assert.assertTrue(i5 == 100);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test121");
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers0 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        int i5 = mergeBinaryNumbers0.merge((int) (byte) 10, (-52000), 2147483647, (-52));
        int i10 = mergeBinaryNumbers0.merge(28, 72, 2, (-52000));
        int i15 = mergeBinaryNumbers0.merge((-4142302), 160038911, 2147483620, 3762);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i10 == 316);
        org.junit.Assert.assertTrue(i15 == (-2097166));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test122");
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian0 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i2 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d3 = avlTreeMedian0.find(binarynode_i2);
        boolean b4 = binarynode_i2.hasLeft();
        com.github.pedrovgs.problem18.IsBST isBST5 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST6 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array8 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i9 = sortedArrayToBST6.transform(i_array8);
        boolean b10 = isBST5.checkRecursive(binarynode_i9);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals11 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem15.BinaryTreeInOrder binaryTreeInOrder12 = new com.github.pedrovgs.problem15.BinaryTreeInOrder();
        com.github.pedrovgs.problem14.BinaryTreePreOrder binaryTreePreOrder13 = new com.github.pedrovgs.problem14.BinaryTreePreOrder();
        com.github.pedrovgs.problem36.AvlTreeMedian avlTreeMedian14 = new com.github.pedrovgs.problem36.AvlTreeMedian();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i16 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        double d17 = avlTreeMedian14.find(binarynode_i16);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode18 = binaryTreePreOrder13.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i16);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i19 = binaryTreeInOrder12.getIterative(binarynode_i16);
        com.github.pedrovgs.problem18.IsBST isBST20 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST21 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array23 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i24 = sortedArrayToBST21.transform(i_array23);
        boolean b25 = isBST20.checkRecursive(binarynode_i24);
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
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i39 = binarynode_i30.getLeft();
        boolean b40 = isBST20.checkIterative(binarynode_i30);
        com.github.pedrovgs.problem17.BinaryTreeEquals binaryTreeEquals41 = new com.github.pedrovgs.problem17.BinaryTreeEquals();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST42 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array44 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i45 = sortedArrayToBST42.transform(i_array44);
        boolean b46 = binarynode_i45.hasRight();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST47 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array49 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i50 = sortedArrayToBST47.transform(i_array49);
        boolean b51 = binarynode_i50.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i52 = binarynode_i50.getRight();
        boolean b53 = binaryTreeEquals41.areEqualsIterative(binarynode_i45, binarynode_i50);
        boolean b54 = isBST20.checkIterative(binarynode_i50);
        boolean b55 = binaryTreeEquals11.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i16, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i50);
        boolean b56 = isBST5.checkIterative(binarynode_i16);
        binarynode_i2.setLeft(binarynode_i16);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces58 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces59 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array65 = new char[] { '#', 'a', ' ', '4', 'a' };
        replaceSpaces59.replace(char_array65);
        replaceSpaces58.replace(char_array65);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces68 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces69 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array70 = new char[] {};
        replaceSpaces69.replace2(char_array70);
        replaceSpaces68.replace(char_array70);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces73 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces74 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces75 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array76 = new char[] {};
        replaceSpaces75.replace2(char_array76);
        replaceSpaces74.replace(char_array76);
        replaceSpaces73.replace(char_array76);
        replaceSpaces68.replace(char_array76);
        replaceSpaces58.replace2(char_array76);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces82 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces83 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array89 = new char[] { '#', 'a', ' ', '4', 'a' };
        replaceSpaces83.replace(char_array89);
        replaceSpaces82.replace(char_array89);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces92 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array93 = new char[] {};
        replaceSpaces92.replace2(char_array93);
        replaceSpaces82.replace(char_array93);
        replaceSpaces58.replace2(char_array93);
        boolean b97 = binarynode_i16.equals((java.lang.Object) char_array93);
        org.junit.Assert.assertTrue(d3 == 10.0d);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(binarynode_i9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(d17 == 10.0d);
        org.junit.Assert.assertNotNull(list_binaryNode18);
        org.junit.Assert.assertNotNull(list_binarynode_i19);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(binarynode_i24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(binarynode_i30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(binarynode_i35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(binarynode_i37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(binarynode_i39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(binarynode_i45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(binarynode_i50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(binarynode_i52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(char_array65);
        org.junit.Assert.assertNotNull(char_array70);
        org.junit.Assert.assertNotNull(char_array76);
        org.junit.Assert.assertNotNull(char_array89);
        org.junit.Assert.assertNotNull(char_array93);
        org.junit.Assert.assertTrue(b97 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test123");
        com.github.pedrovgs.problem16.BinaryTreePostOrder binaryTreePostOrder0 = new com.github.pedrovgs.problem16.BinaryTreePostOrder();
        com.github.pedrovgs.problem18.IsBST isBST1 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST2 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i5 = sortedArrayToBST2.transform(i_array4);
        boolean b6 = isBST1.checkRecursive(binarynode_i5);
        com.github.pedrovgs.problem19.BinaryTreeDepth binaryTreeDepth7 = new com.github.pedrovgs.problem19.BinaryTreeDepth();
        java.lang.Integer[] i_array9 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i10 = new java.util.Stack<java.lang.Integer>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i10, i_array9);
        boolean b12 = stack_i10.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST13 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i14 = stack_i10.search((java.lang.Object) sortedArrayToBST13);
        java.lang.Integer[] i_array18 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i19 = sortedArrayToBST13.transform(i_array18);
        int i20 = binaryTreeDepth7.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i19);
        binarynode_i5.setRight(binarynode_i19);
        java.lang.Integer i22 = binarynode_i5.getData();
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode23 = binaryTreePostOrder0.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i5);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(binarynode_i5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertNotNull(binarynode_i19);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertTrue("'" + i22 + "' != '" + 100 + "'", i22.equals(100));
        org.junit.Assert.assertNotNull(list_binaryNode23);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test124");
        com.github.pedrovgs.problem4.SquareRoot squareRoot0 = new com.github.pedrovgs.problem4.SquareRoot();
        float f2 = squareRoot0.calculateSquareRootRecursive((int) (byte) 1);
        float f4 = squareRoot0.calculateSquareRootIterative((int) ' ');
        float f6 = squareRoot0.calculateSquareRootRecursive(11426);
        float f8 = squareRoot0.calculateSquareRootRecursive(812);
        org.junit.Assert.assertTrue(f2 == 0.96875f);
        org.junit.Assert.assertTrue(f4 == 5.650014f);
        org.junit.Assert.assertTrue(f6 == 106.892365f);
        org.junit.Assert.assertTrue(f8 == 28.497314f);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test125");
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i1 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) (-42));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test126");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push((-1));
        java.util.Enumeration<java.lang.Integer> enumeration_i3 = stack2_0.elements();
        java.util.stream.Stream<java.lang.Integer> stream_i4 = stack2_0.stream();
        stack2_0.push(20);
        com.github.pedrovgs.problem20.MultiplicationWithoutMultiply multiplicationWithoutMultiply7 = new com.github.pedrovgs.problem20.MultiplicationWithoutMultiply();
        int i10 = multiplicationWithoutMultiply7.calculate((int) (byte) -1, (int) (byte) 1);
        int i13 = multiplicationWithoutMultiply7.calculate(10, 27);
        int i16 = multiplicationWithoutMultiply7.calculate(2, 3);
        int i18 = stack2_0.lastIndexOf((java.lang.Object) multiplicationWithoutMultiply7, 0);
        int i21 = multiplicationWithoutMultiply7.calculate((-52000), 35);
        org.junit.Assert.assertNotNull(enumeration_i3);
        org.junit.Assert.assertNotNull(stream_i4);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(i13 == 270);
        org.junit.Assert.assertTrue(i16 == 6);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(i21 == (-1820000));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test127");
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange1 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange2 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "BinaryNode{data=18}", combinationsOfChange1);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem49.CombinationsOfChange> listnode_combinationsOfChange3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem49.CombinationsOfChange>(combinationsOfChange1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test128");
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
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel25 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem13.BinaryTreeByLevel binaryTreeByLevel26 = new com.github.pedrovgs.problem13.BinaryTreeByLevel();
        com.github.pedrovgs.problem18.IsBST isBST27 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST28 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array30 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i31 = sortedArrayToBST28.transform(i_array30);
        boolean b32 = isBST27.checkRecursive(binarynode_i31);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode33 = binaryTreeByLevel26.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i31);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode34 = binaryTreeByLevel25.getUsingQueue((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i31);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>> list_binarynode_i35 = binaryTreeInOrder24.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i31);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i37 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        java.lang.String str38 = binarynode_i37.toString();
        com.github.pedrovgs.problem65.IsTreeBalanced isTreeBalanced39 = new com.github.pedrovgs.problem65.IsTreeBalanced();
        com.github.pedrovgs.binarytree.BinaryNode binaryNode40 = null;
        boolean b41 = isTreeBalanced39.check(binaryNode40);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList42 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays43 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays44 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays43);
        java.lang.String str45 = listnode_mergeSortedArrays44.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode46 = reverseLinkedList42.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays44);
        com.github.pedrovgs.problem18.IsBST isBST47 = new com.github.pedrovgs.problem18.IsBST();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST48 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array50 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i51 = sortedArrayToBST48.transform(i_array50);
        boolean b52 = isBST47.checkRecursive(binarynode_i51);
        boolean b53 = listNode46.equals((java.lang.Object) binarynode_i51);
        boolean b54 = isTreeBalanced39.check((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i51);
        binarynode_i37.setRight(binarynode_i51);
        binarynode_i31.setLeft(binarynode_i37);
        boolean b58 = binarynode_i31.equals((java.lang.Object) "-1890");
        java.lang.Integer[] i_array62 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i63 = new java.util.Vector<java.lang.Integer>();
        boolean b64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i63, i_array62);
        boolean b66 = vector_i63.remove((java.lang.Object) (short) -1);
        int i68 = vector_i63.indexOf((java.lang.Object) 1);
        int i70 = vector_i63.indexOf((java.lang.Object) 100.0d);
        java.lang.Object obj71 = vector_i63.clone();
        java.lang.Object obj72 = null;
        int i73 = vector_i63.lastIndexOf(obj72);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i75 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 27);
        int i76 = vector_i63.lastIndexOf((java.lang.Object) binarynode_i75);
        boolean b77 = binarynode_i75.hasRight();
        com.github.pedrovgs.binarytree.BinaryNode binaryNode78 = null;
        try {
            com.github.pedrovgs.binarytree.BinaryNode binaryNode79 = lowestCommonAncestor0.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i31, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i75, binaryNode78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(binarynode_i31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(list_binaryNode33);
        org.junit.Assert.assertNotNull(list_binaryNode34);
        org.junit.Assert.assertNotNull(list_binarynode_i35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "BinaryNode{data=10}" + "'", str38.equals("BinaryNode{data=10}"));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(listNode46);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(binarynode_i51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(i68 == 1);
        org.junit.Assert.assertTrue(i70 == (-1));
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue(i73 == (-1));
        org.junit.Assert.assertTrue(i76 == (-1));
        org.junit.Assert.assertTrue(b77 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test129");
        com.github.pedrovgs.problem51.ReverseString reverseString0 = new com.github.pedrovgs.problem51.ReverseString();
        java.lang.String str2 = reverseString0.reverseRecursive("/hi!/");
        java.lang.String str4 = reverseString0.reverseIterative("hi!");
        java.lang.String str6 = reverseString0.reverseIterative("1");
        java.lang.String str8 = reverseString0.reverseRecursive("/");
        java.lang.String str10 = reverseString0.reverseIterative("/32/-52/7/");
        java.lang.String str12 = reverseString0.reverseRecursive("");
        java.lang.String str14 = reverseString0.reverseRecursive("/[0, 1, 1, -1]/#301021/79/-2/");
        java.lang.String str16 = reverseString0.reverseRecursive("");
        java.lang.String str18 = reverseString0.reverseRecursive("");
        java.lang.String str20 = reverseString0.reverseRecursive("102#2");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/!ih/" + "'", str2.equals("/!ih/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "!ih" + "'", str4.equals("!ih"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/" + "'", str8.equals("/"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "/7/25-/23/" + "'", str10.equals("/7/25-/23/"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "/2-/97/120103#/]1- ,1 ,1 ,0[/" + "'", str14.equals("/2-/97/120103#/]1- ,1 ,1 ,0[/"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "2#201" + "'", str20.equals("2#201"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test130");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideIterative((int) (byte) 10, (int) (byte) 100);
        float f6 = divideUsingSubtraction0.divideIterative(1, (int) (short) 100);
        float f9 = divideUsingSubtraction0.divideRecursive(3, 27);
        float f12 = divideUsingSubtraction0.divideIterative((-10296), 2414);
        float f15 = divideUsingSubtraction0.divideIterative((-2147481707), (-24));
        float f18 = divideUsingSubtraction0.divideRecursive((-466609862), (int) (byte) -1);
        org.junit.Assert.assertTrue(f3 == 0.1f);
        org.junit.Assert.assertTrue(f6 == 0.01f);
        org.junit.Assert.assertTrue(f9 == 0.11111111f);
        org.junit.Assert.assertTrue(f12 == (-4.26512f));
        org.junit.Assert.assertTrue(f15 == 8.9478408E7f);
        org.junit.Assert.assertTrue(f18 == 4.66609856E8f);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test131");
        com.github.pedrovgs.problem1.BitsCounter bitsCounter0 = new com.github.pedrovgs.problem1.BitsCounter();
        int i2 = bitsCounter0.countBitsToOneBasedOnString((-6));
        int i4 = bitsCounter0.countBitsToOneBasedOnString((-6));
        int i6 = bitsCounter0.countBitsToOneBasedOnString((int) (short) -1);
        int i8 = bitsCounter0.countBitsToOneBasedOnString(82);
        org.junit.Assert.assertTrue(i2 == 30);
        org.junit.Assert.assertTrue(i4 == 30);
        org.junit.Assert.assertTrue(i6 == 32);
        org.junit.Assert.assertTrue(i8 == 3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test132");
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
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces23 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces24 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array30 = new char[] { '#', 'a', ' ', '4', 'a' };
        replaceSpaces24.replace(char_array30);
        replaceSpaces23.replace(char_array30);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces33 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array34 = new char[] {};
        replaceSpaces33.replace2(char_array34);
        replaceSpaces23.replace(char_array34);
        replaceSpaces10.replace(char_array34);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces38 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces39 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array40 = new char[] {};
        replaceSpaces39.replace2(char_array40);
        replaceSpaces38.replace(char_array40);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces43 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces44 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces45 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array46 = new char[] {};
        replaceSpaces45.replace2(char_array46);
        replaceSpaces44.replace(char_array46);
        replaceSpaces43.replace(char_array46);
        replaceSpaces38.replace(char_array46);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces51 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces52 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array58 = new char[] { '#', 'a', ' ', '4', 'a' };
        replaceSpaces52.replace(char_array58);
        replaceSpaces51.replace(char_array58);
        com.github.pedrovgs.problem52.ReplaceSpaces replaceSpaces61 = new com.github.pedrovgs.problem52.ReplaceSpaces();
        char[] char_array62 = new char[] {};
        replaceSpaces61.replace2(char_array62);
        replaceSpaces51.replace(char_array62);
        replaceSpaces38.replace(char_array62);
        replaceSpaces10.replace(char_array62);
        replaceSpaces0.replace(char_array62);
        org.junit.Assert.assertNotNull(char_array7);
        org.junit.Assert.assertNotNull(char_array12);
        org.junit.Assert.assertNotNull(char_array18);
        org.junit.Assert.assertNotNull(char_array30);
        org.junit.Assert.assertNotNull(char_array34);
        org.junit.Assert.assertNotNull(char_array40);
        org.junit.Assert.assertNotNull(char_array46);
        org.junit.Assert.assertNotNull(char_array58);
        org.junit.Assert.assertNotNull(char_array62);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test133");
        java.lang.Integer[] i_array1 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i2 = new java.util.Stack<java.lang.Integer>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i2, i_array1);
        boolean b4 = stack_i2.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST5 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i6 = stack_i2.search((java.lang.Object) sortedArrayToBST5);
        java.lang.Integer i8 = stack_i2.push((java.lang.Integer) 10);
        java.lang.Integer i9 = stack_i2.firstElement();
        stack_i2.removeElementAt(0);
        org.junit.Assert.assertNotNull(i_array1);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10 + "'", i8.equals(10));
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1) + "'", i9.equals((-1)));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test134");
        com.github.pedrovgs.problem69.BitsToTransform bitsToTransform0 = new com.github.pedrovgs.problem69.BitsToTransform();
        int i3 = bitsToTransform0.calculate((int) '#', (int) (short) 0);
        int i6 = bitsToTransform0.calculate(51, (int) 'a');
        int i9 = bitsToTransform0.calculate((int) 'a', (int) (byte) -1);
        int i12 = bitsToTransform0.calculate(18, (-78));
        int i15 = bitsToTransform0.calculate(60, 245366856);
        org.junit.Assert.assertTrue(i3 == 3);
        org.junit.Assert.assertTrue(i6 == 3);
        org.junit.Assert.assertTrue(i9 == 29);
        org.junit.Assert.assertTrue(i12 == 26);
        org.junit.Assert.assertTrue(i15 == 9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test135");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideIterative((int) (byte) 10, (int) (byte) 100);
        float f6 = divideUsingSubtraction0.divideIterative(1, (int) (short) 100);
        float f9 = divideUsingSubtraction0.divideRecursive(3, 27);
        float f12 = divideUsingSubtraction0.divideIterative((int) (byte) -1, (-8));
        float f15 = divideUsingSubtraction0.divideRecursive(51, 2);
        float f18 = divideUsingSubtraction0.divideIterative(0, 90);
        org.junit.Assert.assertTrue(f3 == 0.1f);
        org.junit.Assert.assertTrue(f6 == 0.01f);
        org.junit.Assert.assertTrue(f9 == 0.11111111f);
        org.junit.Assert.assertTrue(f12 == 2.85212672E8f);
        org.junit.Assert.assertTrue(f15 == 25.5f);
        org.junit.Assert.assertTrue(f18 == 0.0f);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test136");
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
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST13 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array15 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i16 = sortedArrayToBST13.transform(i_array15);
        java.lang.String str17 = binarynode_i16.toString();
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_18 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_18.push((int) (byte) 10);
        int i21 = stack1_18.getMin();
        boolean b22 = binarynode_i16.equals((java.lang.Object) stack1_18);
        java.lang.Integer i23 = binarynode_i16.getData();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST24 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array26 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i27 = sortedArrayToBST24.transform(i_array26);
        java.lang.String str28 = binarynode_i27.toString();
        java.lang.Integer i29 = binarynode_i27.getData();
        boolean b30 = binaryTreeEquals0.areEqualsRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i16, (com.github.pedrovgs.binarytree.BinaryNode) binarynode_i27);
        com.github.pedrovgs.problem19.BinaryTreeDepth binaryTreeDepth31 = new com.github.pedrovgs.problem19.BinaryTreeDepth();
        java.lang.Integer[] i_array33 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i34 = new java.util.Stack<java.lang.Integer>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i34, i_array33);
        boolean b36 = stack_i34.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST37 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i38 = stack_i34.search((java.lang.Object) sortedArrayToBST37);
        java.lang.Integer[] i_array42 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i43 = sortedArrayToBST37.transform(i_array42);
        int i44 = binaryTreeDepth31.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i43);
        boolean b45 = binarynode_i43.hasLeft();
        binarynode_i16.setRight(binarynode_i43);
        boolean b48 = binarynode_i16.equals((java.lang.Object) "[1, 1]");
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i49 = binarynode_i16.getRight();
        boolean b50 = binarynode_i16.hasLeft();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(binarynode_i5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(binarynode_i10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(binarynode_i16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "BinaryNode{data=100}" + "'", str17.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue(i21 == 10);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + i23 + "' != '" + 100 + "'", i23.equals(100));
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(binarynode_i27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "BinaryNode{data=100}" + "'", str28.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue("'" + i29 + "' != '" + 100 + "'", i29.equals(100));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(binarynode_i43);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(binarynode_i49);
        org.junit.Assert.assertTrue(b50 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test137");
        com.github.pedrovgs.problem5.DivideUsingSubtraction divideUsingSubtraction0 = new com.github.pedrovgs.problem5.DivideUsingSubtraction();
        float f3 = divideUsingSubtraction0.divideRecursive(29, 4);
        float f6 = divideUsingSubtraction0.divideRecursive((int) (short) -1, (int) 'a');
        float f9 = divideUsingSubtraction0.divideIterative(1484783616, (-77));
        float f12 = divideUsingSubtraction0.divideRecursive(20, 22);
        org.junit.Assert.assertTrue(f3 == 7.25f);
        org.junit.Assert.assertTrue(f6 == (-0.010309278f));
        org.junit.Assert.assertTrue(f9 == 3.6495892E7f);
        org.junit.Assert.assertTrue(f12 == 0.90909094f);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test138");
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
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i23 = binarynode_i20.getRight();
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
        org.junit.Assert.assertNull(binarynode_i23);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test139");
        com.github.pedrovgs.problem51.ReverseString reverseString0 = new com.github.pedrovgs.problem51.ReverseString();
        java.lang.String str2 = reverseString0.reverseRecursive("/hi!/");
        java.lang.String str4 = reverseString0.reverseRecursive("[0, 1, 1, -1]");
        java.lang.String str6 = reverseString0.reverseRecursive("/BinaryNode{data=10}/100##/[/32/112197661/");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/!ih/" + "'", str2.equals("/!ih/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "]1- ,1 ,1 ,0[" + "'", str4.equals("]1- ,1 ,1 ,0["));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "/166791211/23/[/##001/}01=atad{edoNyraniB/" + "'", str6.equals("/166791211/23/[/##001/}01=atad{edoNyraniB/"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test140");
        com.github.pedrovgs.problem30.ScientificNotation scientificNotation0 = new com.github.pedrovgs.problem30.ScientificNotation();
        try {
            long long2 = scientificNotation0.calculate("/!ih/hi!/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test141");
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
        java.util.stream.Stream<java.lang.Integer> stream_i18 = vector_i4.parallelStream();
        vector_i4.addElement((java.lang.Integer) 241);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNotNull(stream_i18);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test142");
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
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i66 = binarynode_i5.getRight();
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
        org.junit.Assert.assertNotNull(binarynode_i66);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test143");
        com.github.pedrovgs.problem33.SimpleRegularExpression simpleRegularExpression0 = new com.github.pedrovgs.problem33.SimpleRegularExpression();
        boolean b3 = simpleRegularExpression0.evaluate("1", "97");
        boolean b6 = simpleRegularExpression0.evaluate("[", "[]");
        boolean b9 = simpleRegularExpression0.evaluate("/!ih/", "/!ih/");
        boolean b12 = simpleRegularExpression0.evaluate("1", "2147483647");
        boolean b15 = simpleRegularExpression0.evaluate("[", "][");
        boolean b18 = simpleRegularExpression0.evaluate("[-1", "100");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test144");
        com.github.pedrovgs.problem51.ReverseString reverseString0 = new com.github.pedrovgs.problem51.ReverseString();
        java.lang.String str2 = reverseString0.reverseRecursive("/hi!/");
        java.lang.String str4 = reverseString0.reverseIterative("hi!");
        java.lang.String str6 = reverseString0.reverseIterative("1");
        java.lang.String str8 = reverseString0.reverseRecursive("/");
        java.lang.String str10 = reverseString0.reverseIterative("/32/-52/7/");
        java.lang.String str12 = reverseString0.reverseRecursive("");
        java.lang.String str14 = reverseString0.reverseRecursive("[102]");
        java.lang.String str16 = reverseString0.reverseRecursive("97");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/!ih/" + "'", str2.equals("/!ih/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "!ih" + "'", str4.equals("!ih"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/" + "'", str8.equals("/"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "/7/25-/23/" + "'", str10.equals("/7/25-/23/"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "]201[" + "'", str14.equals("]201["));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "79" + "'", str16.equals("79"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test145");
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements0 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList1 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays2 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays3 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays2);
        java.lang.String str4 = listnode_mergeSortedArrays3.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode5 = reverseLinkedList1.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays3);
        removeListDuplicatedElements0.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode5);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements7 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList8 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays9 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays10 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays9);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays11 = listnode_mergeSortedArrays10.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays12 = listnode_mergeSortedArrays10.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i14 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i15 = null;
        binarynode_i14.setRight(binarynode_i15);
        boolean b17 = listnode_mergeSortedArrays10.equals((java.lang.Object) binarynode_i15);
        com.github.pedrovgs.linkedlist.ListNode listNode18 = reverseLinkedList8.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays10);
        removeListDuplicatedElements7.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode18);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements> listnode_removeListDuplicatedElements20 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements>(removeListDuplicatedElements7);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList21 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements22 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList23 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays24 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays25 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays24);
        java.lang.String str26 = listnode_mergeSortedArrays25.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode27 = reverseLinkedList23.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays25);
        removeListDuplicatedElements22.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode27);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i29 = getTheElementInTheMiddleOfTheList21.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode27);
        removeListDuplicatedElements7.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode27);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList31 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays32 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays33 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays32);
        java.lang.String str34 = listnode_mergeSortedArrays33.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode35 = reverseLinkedList31.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays33);
        removeListDuplicatedElements7.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode35);
        removeListDuplicatedElements0.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode35);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements38 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList39 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays40 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays41 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays40);
        java.lang.String str42 = listnode_mergeSortedArrays41.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode43 = reverseLinkedList39.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays41);
        removeListDuplicatedElements38.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode43);
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements45 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList46 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays47 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays48 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays47);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays49 = listnode_mergeSortedArrays48.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays50 = listnode_mergeSortedArrays48.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i52 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i53 = null;
        binarynode_i52.setRight(binarynode_i53);
        boolean b55 = listnode_mergeSortedArrays48.equals((java.lang.Object) binarynode_i53);
        com.github.pedrovgs.linkedlist.ListNode listNode56 = reverseLinkedList46.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays48);
        removeListDuplicatedElements45.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode56);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements> listnode_removeListDuplicatedElements58 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem57.RemoveListDuplicatedElements>(removeListDuplicatedElements45);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList59 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements60 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList61 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays62 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays63 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays62);
        java.lang.String str64 = listnode_mergeSortedArrays63.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode65 = reverseLinkedList61.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays63);
        removeListDuplicatedElements60.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode65);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i67 = getTheElementInTheMiddleOfTheList59.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode65);
        removeListDuplicatedElements45.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode65);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList69 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays70 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays71 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays70);
        java.lang.String str72 = listnode_mergeSortedArrays71.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode73 = reverseLinkedList69.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays71);
        removeListDuplicatedElements45.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode73);
        removeListDuplicatedElements38.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode73);
        com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList getTheElementInTheMiddleOfTheList76 = new com.github.pedrovgs.problem64.GetTheElementInTheMiddleOfTheList();
        com.github.pedrovgs.problem57.RemoveListDuplicatedElements removeListDuplicatedElements77 = new com.github.pedrovgs.problem57.RemoveListDuplicatedElements();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList78 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays79 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays80 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays79);
        java.lang.String str81 = listnode_mergeSortedArrays80.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode82 = reverseLinkedList78.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays80);
        removeListDuplicatedElements77.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode82);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i84 = getTheElementInTheMiddleOfTheList76.get2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode82);
        removeListDuplicatedElements38.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode82);
        removeListDuplicatedElements0.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode82);
        org.junit.Assert.assertNotNull(listNode5);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays11);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays12);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(listNode18);
        org.junit.Assert.assertNotNull(listNode27);
        org.junit.Assert.assertNotNull(listnode_i29);
        org.junit.Assert.assertNotNull(listNode35);
        org.junit.Assert.assertNotNull(listNode43);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays49);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays50);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(listNode56);
        org.junit.Assert.assertNotNull(listNode65);
        org.junit.Assert.assertNotNull(listnode_i67);
        org.junit.Assert.assertNotNull(listNode73);
        org.junit.Assert.assertNotNull(listNode82);
        org.junit.Assert.assertNotNull(listnode_i84);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test146");
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
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays16 = listnode_mergeSortedArrays15.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays17 = listnode_mergeSortedArrays15.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i19 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i20 = null;
        binarynode_i19.setRight(binarynode_i20);
        boolean b22 = listnode_mergeSortedArrays15.equals((java.lang.Object) binarynode_i20);
        com.github.pedrovgs.linkedlist.ListNode listNode23 = reverseLinkedList13.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays15);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList24 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays25 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays26 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays25);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays27 = listnode_mergeSortedArrays26.getNext();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays28 = listnode_mergeSortedArrays26.getNext();
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i30 = new com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer>((java.lang.Integer) 10);
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i31 = null;
        binarynode_i30.setRight(binarynode_i31);
        boolean b33 = listnode_mergeSortedArrays26.equals((java.lang.Object) binarynode_i31);
        com.github.pedrovgs.linkedlist.ListNode listNode34 = reverseLinkedList24.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays26);
        com.github.pedrovgs.problem59.DeleteListNode deleteListNode35 = new com.github.pedrovgs.problem59.DeleteListNode();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays36 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays37 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays36);
        java.lang.String str38 = listnode_mergeSortedArrays37.toString();
        deleteListNode35.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays37);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays40 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays41 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays40);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers42 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b43 = listnode_mergeSortedArrays41.equals((java.lang.Object) mergeBinaryNumbers42);
        deleteListNode35.delete((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays41);
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i45 = reverseLinkedList24.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays41);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays46 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays47 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays46);
        com.github.pedrovgs.problem67.MergeBinaryNumbers mergeBinaryNumbers48 = new com.github.pedrovgs.problem67.MergeBinaryNumbers();
        boolean b49 = listnode_mergeSortedArrays47.equals((java.lang.Object) mergeBinaryNumbers48);
        com.github.pedrovgs.linkedlist.ListNode listNode50 = reverseLinkedList24.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays47);
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays51 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays52 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays51);
        java.lang.String str53 = listnode_mergeSortedArrays52.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays54 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays55 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays54);
        java.lang.String str56 = listnode_mergeSortedArrays55.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays57 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays55.setData(mergeSortedArrays57);
        listnode_mergeSortedArrays52.setNext(listnode_mergeSortedArrays55);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays60 = listnode_mergeSortedArrays52.getNext();
        com.github.pedrovgs.problem62.PalindromeList palindromeList61 = new com.github.pedrovgs.problem62.PalindromeList();
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList62 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays63 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays64 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays63);
        java.lang.String str65 = listnode_mergeSortedArrays64.toString();
        com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer> listnode_i66 = reverseLinkedList62.reverseRecursive((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays64);
        boolean b67 = palindromeList61.checkIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays64);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays68 = listnode_mergeSortedArrays64.getNext();
        listnode_mergeSortedArrays60.setNext(listnode_mergeSortedArrays64);
        com.github.pedrovgs.linkedlist.ListNode listNode70 = reverseLinkedList24.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays64);
        com.github.pedrovgs.linkedlist.ListNode listNode71 = reverseLinkedList13.reverseIterative(listNode70);
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays72 = listNode70.getNext();
        removeListDuplicatedElements0.remove2((com.github.pedrovgs.linkedlist.ListNode<java.lang.Integer>) listNode70);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays4);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(listNode11);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays16);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(listNode23);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays27);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays28);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(listNode34);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(listnode_i45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(listNode50);
        org.junit.Assert.assertNotNull(listnode_mergeSortedArrays60);
        org.junit.Assert.assertNotNull(listnode_i66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays68);
        org.junit.Assert.assertNotNull(listNode70);
        org.junit.Assert.assertNotNull(listNode71);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays72);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test147");
        com.github.pedrovgs.problem29.AreAnagrams areAnagrams0 = new com.github.pedrovgs.problem29.AreAnagrams();
        boolean b3 = areAnagrams0.check("3", "/!ih/hi!/");
        boolean b6 = areAnagrams0.check("1", "3");
        boolean b9 = areAnagrams0.check("79", "[");
        boolean b12 = areAnagrams0.check("1241513983", "[-1, 10]");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test148");
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2 stack2_0 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack2();
        stack2_0.push((-1));
        java.lang.Integer i3 = stack2_0.peek();
        java.lang.Integer i4 = stack2_0.pop();
        stack2_0.push(100);
        int i7 = stack2_0.getMin();
        com.github.pedrovgs.problem11.IntToString intToString8 = new com.github.pedrovgs.problem11.IntToString();
        java.lang.String str10 = intToString8.transform(3);
        java.lang.String str12 = intToString8.transform((int) (byte) 10);
        boolean b13 = stack2_0.contains((java.lang.Object) str12);
        boolean b15 = stack2_0.add((java.lang.Integer) 1484783616);
        int i16 = stack2_0.capacity();
        java.lang.Object obj17 = stack2_0.clone();
        int i18 = stack2_0.getMin();
        org.junit.Assert.assertTrue("'" + i3 + "' != '" + (-1) + "'", i3.equals((-1)));
        org.junit.Assert.assertTrue("'" + i4 + "' != '" + (-1) + "'", i4.equals((-1)));
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "3" + "'", str10.equals("3"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10" + "'", str12.equals("10"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 10);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue(i18 == 100);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test149");
        com.github.pedrovgs.problem4.SquareRoot squareRoot0 = new com.github.pedrovgs.problem4.SquareRoot();
        float f2 = squareRoot0.calculateSquareRootIterative((int) ' ');
        float f4 = squareRoot0.calculateSquareRootRecursive(720);
        float f6 = squareRoot0.calculateSquareRootIterative(0);
        float f8 = squareRoot0.calculateSquareRootIterative((int) (short) 0);
        float f10 = squareRoot0.calculateSquareRootRecursive(14);
        org.junit.Assert.assertTrue(f2 == 5.650014f);
        org.junit.Assert.assertTrue(f4 == 26.834106f);
        org.junit.Assert.assertTrue(f6 == 0.0f);
        org.junit.Assert.assertTrue(f8 == 0.0f);
        org.junit.Assert.assertTrue(f10 == 3.7460938f);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test150");
        com.github.pedrovgs.problem11.IntToString intToString0 = new com.github.pedrovgs.problem11.IntToString();
        java.lang.String str2 = intToString0.transform((int) '#');
        java.lang.String str4 = intToString0.transform(10);
        java.lang.String str6 = intToString0.transform(2147483647);
        java.lang.String str8 = intToString0.transform(12);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "35" + "'", str2.equals("35"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2147483647" + "'", str6.equals("2147483647"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "12" + "'", str8.equals("12"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test151");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        int i9 = vector_i4.indexOf((java.lang.Object) 1);
        java.lang.Integer i11 = vector_i4.remove((int) (short) 1);
        boolean b13 = vector_i4.equals((java.lang.Object) 10.0f);
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange15 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange16 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "", combinationsOfChange15);
        com.github.pedrovgs.problem22.ReverseLinkedList reverseLinkedList17 = new com.github.pedrovgs.problem22.ReverseLinkedList();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays18 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays19 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays18);
        java.lang.String str20 = listnode_mergeSortedArrays19.toString();
        com.github.pedrovgs.linkedlist.ListNode listNode21 = reverseLinkedList17.reverseIterative((com.github.pedrovgs.linkedlist.ListNode) listnode_mergeSortedArrays19);
        boolean b22 = pair_comparable_str_combinationsOfChange16.equals((java.lang.Object) listNode21);
        boolean b23 = vector_i4.removeElement((java.lang.Object) b22);
        vector_i4.trimToSize();
        java.lang.Integer i25 = vector_i4.firstElement();
        vector_i4.ensureCapacity(0);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1 + "'", i11.equals(1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(listNode21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + i25 + "' != '" + 0 + "'", i25.equals(0));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test152");
        com.github.pedrovgs.problem51.ReverseString reverseString0 = new com.github.pedrovgs.problem51.ReverseString();
        java.lang.String str2 = reverseString0.reverseRecursive("/hi!/");
        java.lang.String str4 = reverseString0.reverseIterative("/");
        java.lang.String str6 = reverseString0.reverseRecursive("[0, 1, 1, -1]");
        java.lang.String str8 = reverseString0.reverseRecursive("/100##/[/32/");
        java.lang.String str10 = reverseString0.reverseIterative("10010###");
        java.lang.String str12 = reverseString0.reverseRecursive("/23/[/##001/[1, -1, 100, 0]/97/10010###/");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/!ih/" + "'", str2.equals("/!ih/"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "/" + "'", str4.equals("/"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "]1- ,1 ,1 ,0[" + "'", str6.equals("]1- ,1 ,1 ,0["));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/23/[/##001/" + "'", str8.equals("/23/[/##001/"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "###01001" + "'", str10.equals("###01001"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "/###01001/79/]0 ,001 ,1- ,1[/100##/[/32/" + "'", str12.equals("/###01001/79/]0 ,001 ,1- ,1[/100##/[/32/"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test153");
        com.github.pedrovgs.problem1.BitsCounter bitsCounter0 = new com.github.pedrovgs.problem1.BitsCounter();
        int i2 = bitsCounter0.countBitsToOneBasedOnString(0);
        int i4 = bitsCounter0.countBitsToOneBasedOnString(90);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i4 == 4);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test154");
        com.github.pedrovgs.problem33.SimpleRegularExpression simpleRegularExpression0 = new com.github.pedrovgs.problem33.SimpleRegularExpression();
        boolean b3 = simpleRegularExpression0.evaluate("1", "97");
        boolean b6 = simpleRegularExpression0.evaluate("[", "[]");
        boolean b9 = simpleRegularExpression0.evaluate("/!ih/", "/!ih/");
        boolean b12 = simpleRegularExpression0.evaluate("1", "2147483647");
        boolean b15 = simpleRegularExpression0.evaluate("[", "][");
        boolean b18 = simpleRegularExpression0.evaluate("[", "316##");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test155");
        com.github.pedrovgs.problem73.SubtractAdding subtractAdding0 = new com.github.pedrovgs.problem73.SubtractAdding();
        int i3 = subtractAdding0.subtract((int) (short) 0, (int) '4');
        int i6 = subtractAdding0.subtract((int) (byte) 10, (-97));
        int i9 = subtractAdding0.subtract(0, 24);
        int i12 = subtractAdding0.subtract((int) (byte) 0, (-8));
        int i15 = subtractAdding0.subtract((int) (short) 10, (-13631485));
        org.junit.Assert.assertTrue(i3 == (-52));
        org.junit.Assert.assertTrue(i6 == 107);
        org.junit.Assert.assertTrue(i9 == (-24));
        org.junit.Assert.assertTrue(i12 == 8);
        org.junit.Assert.assertTrue(i15 == 13631495);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test156");
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
        com.github.pedrovgs.problem19.BinaryTreeDepth binaryTreeDepth14 = new com.github.pedrovgs.problem19.BinaryTreeDepth();
        java.lang.Integer[] i_array16 = new java.lang.Integer[] { (-1) };
        java.util.Stack<java.lang.Integer> stack_i17 = new java.util.Stack<java.lang.Integer>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) stack_i17, i_array16);
        boolean b19 = stack_i17.empty();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST20 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        int i21 = stack_i17.search((java.lang.Object) sortedArrayToBST20);
        java.lang.Integer[] i_array25 = new java.lang.Integer[] { (-97), 51, (-52) };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i26 = sortedArrayToBST20.transform(i_array25);
        int i27 = binaryTreeDepth14.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i26);
        int i28 = binaryTreeDepth0.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i26);
        com.github.pedrovgs.problem16.BinaryTreePostOrder binaryTreePostOrder29 = new com.github.pedrovgs.problem16.BinaryTreePostOrder();
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST30 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array32 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i33 = sortedArrayToBST30.transform(i_array32);
        java.lang.String str34 = binarynode_i33.toString();
        com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1 stack1_35 = new com.github.pedrovgs.problem63.ConstantComplexityOrderStack.Stack1();
        stack1_35.push((int) (byte) 10);
        int i38 = stack1_35.getMin();
        boolean b39 = binarynode_i33.equals((java.lang.Object) stack1_35);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode40 = binaryTreePostOrder29.getRecursive((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i33);
        com.github.pedrovgs.problem24.SortedArrayToBST sortedArrayToBST41 = new com.github.pedrovgs.problem24.SortedArrayToBST();
        java.lang.Integer[] i_array43 = new java.lang.Integer[] { 100 };
        com.github.pedrovgs.binarytree.BinaryNode<java.lang.Integer> binarynode_i44 = sortedArrayToBST41.transform(i_array43);
        java.util.List<com.github.pedrovgs.binarytree.BinaryNode> list_binaryNode45 = binaryTreePostOrder29.getIterative((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i44);
        int i46 = binaryTreeDepth0.get((com.github.pedrovgs.binarytree.BinaryNode) binarynode_i44);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(binarynode_i12);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(binarynode_i26);
        org.junit.Assert.assertTrue(i27 == 2);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(binarynode_i33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "BinaryNode{data=100}" + "'", str34.equals("BinaryNode{data=100}"));
        org.junit.Assert.assertTrue(i38 == 10);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(list_binaryNode40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(binarynode_i44);
        org.junit.Assert.assertNotNull(list_binaryNode45);
        org.junit.Assert.assertTrue(i46 == 1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test157");
        com.github.pedrovgs.problem49.CombinationsOfChange combinationsOfChange4 = new com.github.pedrovgs.problem49.CombinationsOfChange();
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange5 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "", combinationsOfChange4);
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange6 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "[", combinationsOfChange4);
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange7 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "]1- ,1 ,1 ,0[", combinationsOfChange4);
        com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange> pair_comparable_str_combinationsOfChange8 = new com.github.pedrovgs.pair.Pair<java.lang.Comparable<java.lang.String>, com.github.pedrovgs.problem49.CombinationsOfChange>((java.lang.Comparable<java.lang.String>) "/!ih", combinationsOfChange4);
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros9 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral10 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array11 = new int[][] {};
        int[] i_array12 = goThroughMatrixInSpiral10.go(i_array_array11);
        int[] i_array15 = new int[] { 107, 3628800 };
        int[][] i_array_array16 = new int[][] { i_array15 };
        int[] i_array17 = goThroughMatrixInSpiral10.go(i_array_array16);
        rewriteRowAndColumnsWithZeros9.rewrite(i_array_array16);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral19 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array20 = new int[][] {};
        int[] i_array21 = goThroughMatrixInSpiral19.go(i_array_array20);
        int[] i_array24 = new int[] { 107, 3628800 };
        int[][] i_array_array25 = new int[][] { i_array24 };
        int[] i_array26 = goThroughMatrixInSpiral19.go(i_array_array25);
        rewriteRowAndColumnsWithZeros9.rewrite(i_array_array25);
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral28 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array29 = new int[][] {};
        int[] i_array30 = goThroughMatrixInSpiral28.go(i_array_array29);
        rewriteRowAndColumnsWithZeros9.rewrite(i_array_array29);
        com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros rewriteRowAndColumnsWithZeros32 = new com.github.pedrovgs.problem55.RewriteRowAndColumnsWithZeros();
        com.github.pedrovgs.problem41.GoThroughMatrixInSpiral goThroughMatrixInSpiral33 = new com.github.pedrovgs.problem41.GoThroughMatrixInSpiral();
        int[][] i_array_array34 = new int[][] {};
        int[] i_array35 = goThroughMatrixInSpiral33.go(i_array_array34);
        int[] i_array38 = new int[] { 107, 3628800 };
        int[][] i_array_array39 = new int[][] { i_array38 };
        int[] i_array40 = goThroughMatrixInSpiral33.go(i_array_array39);
        rewriteRowAndColumnsWithZeros32.rewrite(i_array_array39);
        rewriteRowAndColumnsWithZeros9.rewrite(i_array_array39);
        boolean b43 = pair_comparable_str_combinationsOfChange8.equals((java.lang.Object) rewriteRowAndColumnsWithZeros9);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array_array20);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array_array25);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array29);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(i_array_array34);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array_array39);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test158");
        com.github.pedrovgs.problem9.Factorial factorial0 = new com.github.pedrovgs.problem9.Factorial();
        int i2 = factorial0.getTailRecursive(0);
        int i4 = factorial0.getIterative((int) '#');
        int i6 = factorial0.getTailRecursive((int) (byte) 10);
        int i8 = factorial0.getIterative((int) (short) 100);
        org.junit.Assert.assertTrue(i2 == 1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i6 == 3628800);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test159");
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
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays28 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays29 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays28);
        java.lang.String str30 = listnode_mergeSortedArrays29.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays31 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays> listnode_mergeSortedArrays32 = new com.github.pedrovgs.linkedlist.ListNode<com.github.pedrovgs.problem6.MergeSortedArrays>(mergeSortedArrays31);
        java.lang.String str33 = listnode_mergeSortedArrays32.toString();
        com.github.pedrovgs.problem6.MergeSortedArrays mergeSortedArrays34 = new com.github.pedrovgs.problem6.MergeSortedArrays();
        listnode_mergeSortedArrays32.setData(mergeSortedArrays34);
        listnode_mergeSortedArrays29.setNext(listnode_mergeSortedArrays32);
        com.github.pedrovgs.problem11.IntToString intToString37 = new com.github.pedrovgs.problem11.IntToString();
        java.lang.String str39 = intToString37.transform((int) '#');
        boolean b40 = listnode_mergeSortedArrays32.equals((java.lang.Object) str39);
        java.lang.String str41 = listnode_mergeSortedArrays32.toString();
        listnode_mergeSortedArrays22.setNext(listnode_mergeSortedArrays32);
        org.junit.Assert.assertNotNull(listnode_i4);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays8);
        org.junit.Assert.assertNull(listnode_mergeSortedArrays9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(listNode15);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(listnode_i26);
        org.junit.Assert.assertNotNull(listNode27);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "35" + "'", str39.equals("35"));
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test160");
        com.github.pedrovgs.problem29.AreAnagrams areAnagrams0 = new com.github.pedrovgs.problem29.AreAnagrams();
        boolean b3 = areAnagrams0.check("1", "97");
        boolean b6 = areAnagrams0.check("7] [100,", "/[0, 1, 1, -1/9/[1, -1, 100, 0]/");
        boolean b9 = areAnagrams0.check("/100##/[/32/", "#301021");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test161");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 0, 1, 1 };
        java.util.Vector<java.lang.Integer> vector_i4 = new java.util.Vector<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) vector_i4, i_array3);
        boolean b7 = vector_i4.remove((java.lang.Object) (short) -1);
        java.util.stream.Stream<java.lang.Integer> stream_i8 = vector_i4.parallelStream();
        java.lang.Object[] obj_array9 = vector_i4.toArray();
        vector_i4.removeAllElements();
        boolean b12 = vector_i4.add((java.lang.Integer) 18);
        vector_i4.trimToSize();
        boolean b14 = vector_i4.isEmpty();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(stream_i8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == false);
    }
}


