package project;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc constantDesc1 = constantDescQueue0.peek();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue0);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue3 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean4 = constantDescQueue3.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor5 = constantDescQueue3.iterator();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue6 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue3);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue7 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue8 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue9 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean10 = constantDescQueue9.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor11 = constantDescQueue9.iterator();
        boolean boolean12 = constantDescQueue8.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue9);
        boolean boolean13 = constantDescQueue7.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue8);
        java.lang.constant.ConstantDesc[] constantDescArray36 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList37 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList37, constantDescArray36);
        boolean boolean39 = constantDescQueue7.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList37);
        boolean boolean40 = constantDescQueue3.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue7);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue41 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue42 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean43 = constantDescQueue42.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor44 = constantDescQueue42.iterator();
        boolean boolean45 = constantDescQueue41.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue42);
        java.lang.constant.ConstantDesc constantDesc46 = constantDescQueue41.peek();
        boolean boolean48 = constantDescQueue41.offer((java.lang.constant.ConstantDesc) 10.0f);
        java.lang.constant.ConstantDesc constantDesc49 = constantDescQueue41.remove();
        boolean boolean51 = constantDescQueue41.contains((java.lang.Object) (-1));
        boolean boolean52 = constantDescQueue3.remove((java.lang.Object) boolean51);
        java.lang.String str53 = constantDescQueue3.toString();
        boolean boolean54 = constantDescQueue2.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue3);
        boolean boolean56 = constantDescQueue3.offer((java.lang.constant.ConstantDesc) 0L);
        org.junit.Assert.assertNull(constantDesc1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(constantDescItor5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(constantDescItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(constantDescItor44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(constantDesc46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + constantDesc49 + "' != '" + 10.0f + "'", constantDesc49, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[]" + "'", str53, "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean3 = constantDescQueue2.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor4 = constantDescQueue2.iterator();
        boolean boolean5 = constantDescQueue1.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue2);
        boolean boolean6 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue1);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor7 = constantDescQueue1.iterator();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue8 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue9 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean10 = constantDescQueue9.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor11 = constantDescQueue9.iterator();
        boolean boolean12 = constantDescQueue8.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue9);
        java.lang.constant.ConstantDesc constantDesc13 = constantDescQueue8.peek();
        boolean boolean15 = constantDescQueue8.offer((java.lang.constant.ConstantDesc) 10.0f);
        java.lang.constant.ConstantDesc constantDesc16 = constantDescQueue8.remove();
        boolean boolean18 = constantDescQueue8.contains((java.lang.Object) (-1));
        boolean boolean19 = constantDescQueue8.isEmpty();
        java.lang.constant.ConstantDesc constantDesc20 = constantDescQueue8.poll();
        boolean boolean21 = constantDescQueue1.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue8);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue22 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue23 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue24 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean25 = constantDescQueue24.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor26 = constantDescQueue24.iterator();
        boolean boolean27 = constantDescQueue23.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue24);
        boolean boolean28 = constantDescQueue22.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue23);
        java.lang.constant.ConstantDesc constantDesc29 = constantDescQueue23.peek();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor30 = constantDescQueue23.iterator();
        int int31 = constantDescQueue23.size();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue32 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean34 = constantDescQueue32.offer((java.lang.constant.ConstantDesc) 1.0d);
        boolean boolean36 = constantDescQueue32.add((java.lang.constant.ConstantDesc) 10.0d);
        java.lang.constant.ConstantDesc constantDesc37 = constantDescQueue32.element();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue38 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean39 = constantDescQueue38.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor40 = constantDescQueue38.iterator();
        boolean boolean42 = constantDescQueue38.remove((java.lang.Object) (short) 1);
        boolean boolean43 = constantDescQueue32.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue38);
        boolean boolean44 = constantDescQueue23.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue38);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue45 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue46 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue47 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean48 = constantDescQueue47.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor49 = constantDescQueue47.iterator();
        boolean boolean50 = constantDescQueue46.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue47);
        boolean boolean51 = constantDescQueue45.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue46);
        java.lang.constant.ConstantDesc[] constantDescArray74 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList75 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList75, constantDescArray74);
        boolean boolean77 = constantDescQueue45.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList75);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue78 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue45);
        java.lang.String str79 = constantDescQueue45.toString();
        java.lang.Object[] objArray80 = constantDescQueue45.toArray();
        boolean boolean81 = constantDescQueue45.isEmpty();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue82 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean83 = constantDescQueue82.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor84 = constantDescQueue82.iterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream85 = constantDescQueue82.parallelStream();
        boolean boolean86 = constantDescQueue45.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue82);
        boolean boolean87 = constantDescQueue38.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue82);
        java.lang.Class<?> wildcardClass88 = constantDescQueue82.getClass();
        boolean boolean89 = constantDescQueue1.contains((java.lang.Object) wildcardClass88);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(constantDescItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(constantDescItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(constantDescItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(constantDesc13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + constantDesc16 + "' != '" + 10.0f + "'", constantDesc16, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(constantDesc20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(constantDescItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(constantDesc29);
        org.junit.Assert.assertNotNull(constantDescItor30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + constantDesc37 + "' != '" + 1.0d + "'", constantDesc37, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(constantDescItor40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(constantDescItor49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(constantDescArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "[]" + "'", str79, "[]");
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertArrayEquals(objArray80, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(constantDescItor84);
        org.junit.Assert.assertNotNull(constantDescStream85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean1 = constantDescQueue0.isEmpty();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc constantDesc3 = constantDescQueue2.peek();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue4 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue5 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean6 = constantDescQueue5.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor7 = constantDescQueue5.iterator();
        boolean boolean8 = constantDescQueue4.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue5);
        boolean boolean9 = constantDescQueue2.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue4);
        boolean boolean10 = constantDescQueue0.remove((java.lang.Object) boolean9);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream11 = constantDescQueue0.parallelStream();
        java.lang.constant.ConstantDesc constantDesc12 = constantDescQueue0.poll();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue13 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue14 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue15 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean16 = constantDescQueue15.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor17 = constantDescQueue15.iterator();
        boolean boolean18 = constantDescQueue14.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue15);
        boolean boolean19 = constantDescQueue13.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue14);
        boolean boolean20 = constantDescQueue0.contains((java.lang.Object) constantDescQueue14);
        boolean boolean22 = constantDescQueue0.add((java.lang.constant.ConstantDesc) 100.0f);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator23 = constantDescQueue0.spliterator();
        int int24 = constantDescQueue0.size();
        boolean boolean25 = constantDescQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(constantDesc3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(constantDescItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(constantDescStream11);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(constantDescItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(constantDescSpliterator23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean1 = constantDescQueue0.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor2 = constantDescQueue0.iterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream3 = constantDescQueue0.parallelStream();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue4 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue5 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue6 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean7 = constantDescQueue6.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor8 = constantDescQueue6.iterator();
        boolean boolean9 = constantDescQueue5.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue6);
        boolean boolean10 = constantDescQueue4.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue5);
        java.lang.constant.ConstantDesc[] constantDescArray33 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList34 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList34, constantDescArray33);
        boolean boolean36 = constantDescQueue4.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList34);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue37 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue4);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue38 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean39 = constantDescQueue38.isEmpty();
        boolean boolean40 = constantDescQueue37.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue38);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue41 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean42 = constantDescQueue41.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor43 = constantDescQueue41.iterator();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue44 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue41);
        boolean boolean45 = constantDescQueue38.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue41);
        java.lang.Class<?> wildcardClass46 = constantDescQueue41.getClass();
        boolean boolean47 = constantDescQueue0.remove((java.lang.Object) wildcardClass46);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue48 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue49 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue50 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean51 = constantDescQueue50.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor52 = constantDescQueue50.iterator();
        boolean boolean53 = constantDescQueue49.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue50);
        boolean boolean54 = constantDescQueue48.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue49);
        java.lang.constant.ConstantDesc constantDesc55 = constantDescQueue49.peek();
        java.lang.String[] strArray62 = new java.lang.String[] { "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", "", "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", "hi!", "[]", "hi!" };
        java.lang.String[] strArray63 = constantDescQueue49.toArray(strArray62);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream64 = constantDescQueue49.parallelStream();
        boolean boolean66 = constantDescQueue49.contains((java.lang.Object) (short) -1);
        boolean boolean67 = constantDescQueue0.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue49);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(constantDescItor2);
        org.junit.Assert.assertNotNull(constantDescStream3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(constantDescItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(constantDescArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(constantDescItor43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(constantDescItor52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(constantDesc55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { null, "", "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", "hi!", "[]", "hi!" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { null, "", "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", "hi!", "[]", "hi!" });
        org.junit.Assert.assertNotNull(constantDescStream64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc constantDesc1 = constantDescQueue0.peek();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue3 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue4 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean5 = constantDescQueue4.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescQueue4.iterator();
        boolean boolean7 = constantDescQueue3.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue4);
        boolean boolean8 = constantDescQueue2.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue3);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue9 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue10 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean11 = constantDescQueue10.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor12 = constantDescQueue10.iterator();
        boolean boolean13 = constantDescQueue9.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue10);
        boolean boolean14 = constantDescQueue3.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue10);
        boolean boolean15 = constantDescQueue0.contains((java.lang.Object) constantDescQueue3);
        boolean boolean17 = constantDescQueue0.contains((java.lang.Object) 100.0f);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator18 = constantDescQueue0.comparator();
        java.lang.String str19 = constantDescQueue0.toString();
        org.junit.Assert.assertNull(constantDesc1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(constantDescItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(wildcardComparator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc constantDesc1 = constantDescQueue0.peek();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue3 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue4 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean5 = constantDescQueue4.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescQueue4.iterator();
        boolean boolean7 = constantDescQueue3.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue4);
        boolean boolean8 = constantDescQueue2.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue3);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue9 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue10 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean11 = constantDescQueue10.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor12 = constantDescQueue10.iterator();
        boolean boolean13 = constantDescQueue9.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue10);
        boolean boolean14 = constantDescQueue3.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue10);
        boolean boolean15 = constantDescQueue0.contains((java.lang.Object) constantDescQueue3);
        java.lang.constant.ConstantDesc constantDesc16 = constantDescQueue0.poll();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream17 = constantDescQueue0.parallelStream();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream18 = constantDescQueue0.stream();
        java.lang.String str19 = constantDescQueue0.toString();
        java.lang.constant.ConstantDesc constantDesc20 = constantDescQueue0.peek();
        org.junit.Assert.assertNull(constantDesc1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(constantDescItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertNotNull(constantDescStream17);
        org.junit.Assert.assertNotNull(constantDescStream18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertNull(constantDesc20);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean3 = constantDescQueue2.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor4 = constantDescQueue2.iterator();
        boolean boolean5 = constantDescQueue1.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue2);
        boolean boolean6 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue1);
        java.lang.constant.ConstantDesc constantDesc7 = constantDescQueue1.peek();
        java.lang.String[] strArray14 = new java.lang.String[] { "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", "", "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", "hi!", "[]", "hi!" };
        java.lang.String[] strArray15 = constantDescQueue1.toArray(strArray14);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor16 = constantDescQueue1.iterator();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue17 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue18 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue19 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean20 = constantDescQueue19.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor21 = constantDescQueue19.iterator();
        boolean boolean22 = constantDescQueue18.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue19);
        boolean boolean23 = constantDescQueue17.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue18);
        java.lang.constant.ConstantDesc[] constantDescArray46 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList47 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList47, constantDescArray46);
        boolean boolean49 = constantDescQueue17.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList47);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue50 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue17);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue51 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean52 = constantDescQueue51.isEmpty();
        boolean boolean53 = constantDescQueue50.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue51);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream54 = constantDescQueue51.parallelStream();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue55 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean56 = constantDescQueue55.isEmpty();
        boolean boolean58 = constantDescQueue55.offer((java.lang.constant.ConstantDesc) 1L);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream59 = constantDescQueue55.parallelStream();
        boolean boolean60 = constantDescQueue51.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue55);
        java.lang.String str61 = constantDescQueue51.toString();
        boolean boolean62 = constantDescQueue51.isEmpty();
        boolean boolean63 = constantDescQueue1.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue51);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator64 = constantDescQueue1.spliterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(constantDescItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { null, "", "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", "hi!", "[]", "hi!" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { null, "", "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", "hi!", "[]", "hi!" });
        org.junit.Assert.assertNotNull(constantDescItor16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(constantDescItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(constantDescArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(constantDescStream54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(constantDescStream59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[]" + "'", str61, "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(constantDescSpliterator64);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>((int) (byte) 100);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream2 = constantDescQueue1.stream();
        org.junit.Assert.assertNotNull(constantDescStream2);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean3 = constantDescQueue2.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor4 = constantDescQueue2.iterator();
        boolean boolean5 = constantDescQueue1.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue2);
        boolean boolean6 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue1);
        java.lang.constant.ConstantDesc[] constantDescArray29 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList30 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30, constantDescArray29);
        boolean boolean32 = constantDescQueue0.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue33 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue0);
        int int34 = constantDescQueue0.size();
        constantDescQueue0.clear();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue37 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(1);
        java.lang.Object obj38 = null;
        boolean boolean39 = constantDescQueue37.remove(obj38);
        int int40 = constantDescQueue37.size();
        boolean boolean41 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue37);
        boolean boolean43 = constantDescQueue0.add((java.lang.constant.ConstantDesc) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(constantDescItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(constantDescArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean3 = constantDescQueue2.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor4 = constantDescQueue2.iterator();
        boolean boolean5 = constantDescQueue1.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue2);
        boolean boolean6 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue1);
        java.lang.constant.ConstantDesc[] constantDescArray29 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList30 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30, constantDescArray29);
        boolean boolean32 = constantDescQueue0.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue33 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue0);
        int int34 = constantDescQueue0.size();
        constantDescQueue0.clear();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue37 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(1);
        java.lang.Object obj38 = null;
        boolean boolean39 = constantDescQueue37.remove(obj38);
        int int40 = constantDescQueue37.size();
        boolean boolean41 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue37);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue42 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean44 = constantDescQueue42.offer((java.lang.constant.ConstantDesc) 1.0d);
        boolean boolean45 = constantDescQueue37.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue42);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream46 = constantDescQueue37.parallelStream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(constantDescItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(constantDescArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(constantDescStream46);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean3 = constantDescQueue2.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor4 = constantDescQueue2.iterator();
        boolean boolean5 = constantDescQueue1.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue2);
        boolean boolean6 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue1);
        java.lang.Object[] objArray7 = constantDescQueue1.toArray();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator8 = constantDescQueue1.spliterator();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue9 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc constantDesc10 = constantDescQueue9.peek();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue11 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue12 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue13 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean14 = constantDescQueue13.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor15 = constantDescQueue13.iterator();
        boolean boolean16 = constantDescQueue12.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue13);
        boolean boolean17 = constantDescQueue11.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue12);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue18 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue19 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean20 = constantDescQueue19.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor21 = constantDescQueue19.iterator();
        boolean boolean22 = constantDescQueue18.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue19);
        boolean boolean23 = constantDescQueue12.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue19);
        boolean boolean24 = constantDescQueue9.contains((java.lang.Object) constantDescQueue12);
        java.lang.constant.ConstantDesc constantDesc25 = constantDescQueue9.poll();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream26 = constantDescQueue9.parallelStream();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream27 = constantDescQueue9.stream();
        java.lang.String str28 = constantDescQueue9.toString();
        boolean boolean29 = constantDescQueue1.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue9);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator30 = constantDescQueue9.comparator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(constantDescItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(constantDescSpliterator8);
        org.junit.Assert.assertNull(constantDesc10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(constantDescItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(constantDescItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(constantDesc25);
        org.junit.Assert.assertNotNull(constantDescStream26);
        org.junit.Assert.assertNotNull(constantDescStream27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(wildcardComparator30);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>((int) (byte) 100);
        boolean boolean2 = constantDescQueue1.isEmpty();
        java.lang.Object[] objArray3 = constantDescQueue1.toArray();
        boolean boolean5 = constantDescQueue1.add((java.lang.constant.ConstantDesc) (-1));
        java.lang.Object[][] objArray6 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] {};
        java.lang.Object[][] objArray8 = new java.lang.Object[][] {};
        java.lang.Object[][][] objArray9 = new java.lang.Object[][][] { objArray6, objArray7, objArray8 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][][] objArray10 = constantDescQueue1.toArray(objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: arraycopy: element type mismatch: can not cast one of the elements of java.lang.Object[] to the type of the destination array, [[Ljava.lang.Object;");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[][] {});
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean1 = constantDescQueue0.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor2 = constantDescQueue0.iterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream3 = constantDescQueue0.parallelStream();
        java.lang.constant.ConstantDesc constantDesc4 = constantDescQueue0.peek();
        java.lang.constant.ConstantDesc constantDesc5 = constantDescQueue0.poll();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(constantDescItor2);
        org.junit.Assert.assertNotNull(constantDescStream3);
        org.junit.Assert.assertNull(constantDesc4);
        org.junit.Assert.assertNull(constantDesc5);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc constantDesc1 = constantDescQueue0.peek();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue3 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue4 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean5 = constantDescQueue4.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescQueue4.iterator();
        boolean boolean7 = constantDescQueue3.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue4);
        boolean boolean8 = constantDescQueue2.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue3);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue9 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue10 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean11 = constantDescQueue10.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor12 = constantDescQueue10.iterator();
        boolean boolean13 = constantDescQueue9.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue10);
        boolean boolean14 = constantDescQueue3.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue10);
        boolean boolean15 = constantDescQueue0.contains((java.lang.Object) constantDescQueue3);
        java.lang.constant.ConstantDesc constantDesc16 = constantDescQueue0.poll();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream17 = constantDescQueue0.parallelStream();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue18 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue0);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream19 = constantDescQueue18.stream();
        java.lang.String str20 = constantDescQueue18.toString();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator21 = constantDescQueue18.spliterator();
        org.junit.Assert.assertNull(constantDesc1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(constantDescItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(constantDesc16);
        org.junit.Assert.assertNotNull(constantDescStream17);
        org.junit.Assert.assertNotNull(constantDescStream19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertNotNull(constantDescSpliterator21);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc constantDesc1 = constantDescQueue0.peek();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue3 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue4 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean5 = constantDescQueue4.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor6 = constantDescQueue4.iterator();
        boolean boolean7 = constantDescQueue3.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue4);
        boolean boolean8 = constantDescQueue2.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue3);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue9 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue10 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean11 = constantDescQueue10.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor12 = constantDescQueue10.iterator();
        boolean boolean13 = constantDescQueue9.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue10);
        boolean boolean14 = constantDescQueue3.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue10);
        boolean boolean15 = constantDescQueue0.contains((java.lang.Object) constantDescQueue3);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream16 = constantDescQueue3.parallelStream();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue17 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean18 = constantDescQueue17.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor19 = constantDescQueue17.iterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream20 = constantDescQueue17.parallelStream();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue21 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue22 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue23 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean24 = constantDescQueue23.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor25 = constantDescQueue23.iterator();
        boolean boolean26 = constantDescQueue22.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue23);
        boolean boolean27 = constantDescQueue21.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue22);
        java.lang.constant.ConstantDesc[] constantDescArray50 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList51 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList51, constantDescArray50);
        boolean boolean53 = constantDescQueue21.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList51);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue54 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue21);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue55 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean56 = constantDescQueue55.isEmpty();
        boolean boolean57 = constantDescQueue54.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue55);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue58 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean59 = constantDescQueue58.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor60 = constantDescQueue58.iterator();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue61 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue58);
        boolean boolean62 = constantDescQueue55.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue58);
        java.lang.Class<?> wildcardClass63 = constantDescQueue58.getClass();
        boolean boolean64 = constantDescQueue17.remove((java.lang.Object) wildcardClass63);
        boolean boolean66 = constantDescQueue17.add((java.lang.constant.ConstantDesc) (-1L));
        boolean boolean67 = constantDescQueue3.contains((java.lang.Object) constantDescQueue17);
        java.lang.String str68 = constantDescQueue17.toString();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue69 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc constantDesc70 = constantDescQueue69.peek();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator71 = constantDescQueue69.comparator();
        boolean boolean72 = constantDescQueue17.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue69);
        org.junit.Assert.assertNull(constantDesc1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(constantDescItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(constantDescItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(constantDescStream16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(constantDescItor19);
        org.junit.Assert.assertNotNull(constantDescStream20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(constantDescItor25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(constantDescArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(constantDescItor60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[-1]" + "'", str68, "[-1]");
        org.junit.Assert.assertNull(constantDesc70);
        org.junit.Assert.assertNull(wildcardComparator71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean3 = constantDescQueue2.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor4 = constantDescQueue2.iterator();
        boolean boolean5 = constantDescQueue1.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue2);
        boolean boolean6 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue1);
        java.lang.constant.ConstantDesc[] constantDescArray29 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList30 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30, constantDescArray29);
        boolean boolean32 = constantDescQueue0.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue33 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue0);
        java.lang.String str34 = constantDescQueue0.toString();
        java.lang.Object[] objArray35 = constantDescQueue0.toArray();
        boolean boolean36 = constantDescQueue0.isEmpty();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue37 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean38 = constantDescQueue37.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor39 = constantDescQueue37.iterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream40 = constantDescQueue37.parallelStream();
        boolean boolean41 = constantDescQueue0.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue37);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue42 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue0);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream43 = constantDescQueue0.stream();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue44 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue45 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue46 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean47 = constantDescQueue46.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor48 = constantDescQueue46.iterator();
        boolean boolean49 = constantDescQueue45.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue46);
        boolean boolean50 = constantDescQueue44.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue45);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue51 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue52 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean53 = constantDescQueue52.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor54 = constantDescQueue52.iterator();
        boolean boolean55 = constantDescQueue51.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue52);
        boolean boolean56 = constantDescQueue45.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue52);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator57 = constantDescQueue45.comparator();
        boolean boolean58 = constantDescQueue0.contains((java.lang.Object) wildcardComparator57);
        boolean boolean59 = constantDescQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(constantDescItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(constantDescArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertArrayEquals(objArray35, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(constantDescItor39);
        org.junit.Assert.assertNotNull(constantDescStream40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(constantDescStream43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(constantDescItor48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(constantDescItor54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(wildcardComparator57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean3 = constantDescQueue2.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor4 = constantDescQueue2.iterator();
        boolean boolean5 = constantDescQueue1.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue2);
        boolean boolean6 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue1);
        java.lang.constant.ConstantDesc[] constantDescArray29 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList30 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30, constantDescArray29);
        boolean boolean32 = constantDescQueue0.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue33 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue0);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue34 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean35 = constantDescQueue34.isEmpty();
        boolean boolean36 = constantDescQueue33.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue34);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream37 = constantDescQueue33.stream();
        java.lang.constant.ConstantDesc constantDesc38 = constantDescQueue33.poll();
        constantDescQueue33.clear();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor40 = constantDescQueue33.iterator();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue41 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc constantDesc42 = constantDescQueue41.peek();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator43 = constantDescQueue41.spliterator();
        boolean boolean45 = constantDescQueue41.offer((java.lang.constant.ConstantDesc) 1L);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream46 = constantDescQueue41.stream();
        boolean boolean47 = constantDescQueue33.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue41);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream48 = constantDescQueue41.parallelStream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(constantDescItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(constantDescArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(constantDescStream37);
        org.junit.Assert.assertNull(constantDesc38);
        org.junit.Assert.assertNotNull(constantDescItor40);
        org.junit.Assert.assertNull(constantDesc42);
        org.junit.Assert.assertNotNull(constantDescSpliterator43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(constantDescStream46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(constantDescStream48);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        java.util.PriorityQueue<java.util.List<java.lang.constant.ConstantDesc>> constantDescListQueue0 = new java.util.PriorityQueue<java.util.List<java.lang.constant.ConstantDesc>>();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean3 = constantDescQueue2.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor4 = constantDescQueue2.iterator();
        boolean boolean5 = constantDescQueue1.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue2);
        boolean boolean6 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue1);
        java.lang.constant.ConstantDesc[] constantDescArray29 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList30 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30, constantDescArray29);
        boolean boolean32 = constantDescQueue0.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue33 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue0);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue34 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean35 = constantDescQueue34.isEmpty();
        boolean boolean36 = constantDescQueue33.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue34);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue37 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean38 = constantDescQueue37.isEmpty();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue39 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc constantDesc40 = constantDescQueue39.peek();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue41 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue42 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean43 = constantDescQueue42.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor44 = constantDescQueue42.iterator();
        boolean boolean45 = constantDescQueue41.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue42);
        boolean boolean46 = constantDescQueue39.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue41);
        boolean boolean47 = constantDescQueue37.remove((java.lang.Object) boolean46);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream48 = constantDescQueue37.parallelStream();
        java.lang.constant.ConstantDesc constantDesc49 = constantDescQueue37.poll();
        boolean boolean50 = constantDescQueue33.contains((java.lang.Object) constantDescQueue37);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream51 = constantDescQueue33.stream();
        java.lang.constant.ConstantDesc constantDesc52 = constantDescQueue33.peek();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue53 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue54 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue55 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean56 = constantDescQueue55.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor57 = constantDescQueue55.iterator();
        boolean boolean58 = constantDescQueue54.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue55);
        boolean boolean59 = constantDescQueue53.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue54);
        boolean boolean60 = constantDescQueue33.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue54);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream61 = constantDescQueue54.stream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(constantDescItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(constantDescArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(constantDesc40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(constantDescItor44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(constantDescStream48);
        org.junit.Assert.assertNull(constantDesc49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(constantDescStream51);
        org.junit.Assert.assertNull(constantDesc52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(constantDescItor57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(constantDescStream61);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean3 = constantDescQueue2.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor4 = constantDescQueue2.iterator();
        boolean boolean5 = constantDescQueue1.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue2);
        boolean boolean6 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue1);
        boolean boolean7 = constantDescQueue1.isEmpty();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue8 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue9 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue10 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean11 = constantDescQueue10.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor12 = constantDescQueue10.iterator();
        boolean boolean13 = constantDescQueue9.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue10);
        boolean boolean14 = constantDescQueue8.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue9);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator15 = constantDescQueue9.spliterator();
        boolean boolean16 = constantDescQueue1.contains((java.lang.Object) constantDescSpliterator15);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue17 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc constantDesc18 = constantDescQueue17.peek();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue19 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue20 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue21 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean22 = constantDescQueue21.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor23 = constantDescQueue21.iterator();
        boolean boolean24 = constantDescQueue20.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue21);
        boolean boolean25 = constantDescQueue19.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue20);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue26 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue27 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean28 = constantDescQueue27.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor29 = constantDescQueue27.iterator();
        boolean boolean30 = constantDescQueue26.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue27);
        boolean boolean31 = constantDescQueue20.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue27);
        boolean boolean32 = constantDescQueue17.contains((java.lang.Object) constantDescQueue20);
        boolean boolean34 = constantDescQueue17.contains((java.lang.Object) 100.0f);
        boolean boolean35 = constantDescQueue1.remove((java.lang.Object) 100.0f);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator36 = constantDescQueue1.spliterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(constantDescItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(constantDescItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(constantDescSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(constantDesc18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(constantDescItor23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(constantDescItor29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(constantDescSpliterator36);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc constantDesc1 = constantDescQueue0.peek();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue3 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean4 = constantDescQueue3.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor5 = constantDescQueue3.iterator();
        boolean boolean6 = constantDescQueue2.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue3);
        boolean boolean7 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue2);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue8 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc constantDesc9 = constantDescQueue8.peek();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue10 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue11 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue12 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean13 = constantDescQueue12.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor14 = constantDescQueue12.iterator();
        boolean boolean15 = constantDescQueue11.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue12);
        boolean boolean16 = constantDescQueue10.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue11);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue17 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue18 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean19 = constantDescQueue18.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor20 = constantDescQueue18.iterator();
        boolean boolean21 = constantDescQueue17.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue18);
        boolean boolean22 = constantDescQueue11.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue18);
        boolean boolean23 = constantDescQueue8.contains((java.lang.Object) constantDescQueue11);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue24 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue25 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue26 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean27 = constantDescQueue26.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor28 = constantDescQueue26.iterator();
        boolean boolean29 = constantDescQueue25.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue26);
        boolean boolean30 = constantDescQueue24.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue25);
        java.lang.constant.ConstantDesc[] constantDescArray53 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList54 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList54, constantDescArray53);
        boolean boolean56 = constantDescQueue24.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList54);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue57 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue24);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue58 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean59 = constantDescQueue58.isEmpty();
        boolean boolean60 = constantDescQueue57.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue58);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue61 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean62 = constantDescQueue61.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor63 = constantDescQueue61.iterator();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue64 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue61);
        boolean boolean65 = constantDescQueue58.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue61);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream66 = constantDescQueue58.parallelStream();
        boolean boolean67 = constantDescQueue8.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue58);
        boolean boolean68 = constantDescQueue2.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue8);
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator69 = constantDescQueue2.spliterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream70 = constantDescQueue2.stream();
        org.junit.Assert.assertNull(constantDesc1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(constantDescItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(constantDesc9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(constantDescItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(constantDescItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(constantDescItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(constantDescArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(constantDescItor63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(constantDescStream66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(constantDescSpliterator69);
        org.junit.Assert.assertNotNull(constantDescStream70);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc constantDesc1 = constantDescQueue0.peek();
        java.util.Collection<java.lang.constant.ConstantDesc> constantDescCollection2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = constantDescQueue0.containsAll(constantDescCollection2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.iterator()\" because \"c\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(constantDesc1);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean3 = constantDescQueue2.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor4 = constantDescQueue2.iterator();
        boolean boolean5 = constantDescQueue1.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue2);
        boolean boolean6 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue1);
        java.lang.constant.ConstantDesc[] constantDescArray29 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList30 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30, constantDescArray29);
        boolean boolean32 = constantDescQueue0.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue33 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue0);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue34 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue0);
        java.lang.constant.ConstantDesc constantDesc35 = constantDescQueue34.poll();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass36 = constantDesc35.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(constantDescItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(constantDescArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(constantDesc35);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean3 = constantDescQueue2.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor4 = constantDescQueue2.iterator();
        boolean boolean5 = constantDescQueue1.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue2);
        boolean boolean6 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue1);
        java.lang.constant.ConstantDesc[] constantDescArray29 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList30 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30, constantDescArray29);
        boolean boolean32 = constantDescQueue0.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue33 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue0);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue34 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean35 = constantDescQueue34.isEmpty();
        boolean boolean36 = constantDescQueue33.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue34);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream37 = constantDescQueue33.stream();
        java.lang.constant.ConstantDesc constantDesc38 = constantDescQueue33.poll();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream39 = constantDescQueue33.parallelStream();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream40 = constantDescQueue33.parallelStream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(constantDescItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(constantDescArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(constantDescStream37);
        org.junit.Assert.assertNull(constantDesc38);
        org.junit.Assert.assertNotNull(constantDescStream39);
        org.junit.Assert.assertNotNull(constantDescStream40);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean3 = constantDescQueue2.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor4 = constantDescQueue2.iterator();
        boolean boolean5 = constantDescQueue1.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue2);
        boolean boolean6 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue1);
        java.lang.constant.ConstantDesc constantDesc7 = constantDescQueue1.peek();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = constantDescQueue1.remove(obj8);
        java.lang.Object[] objArray10 = constantDescQueue1.toArray();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue11 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue12 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue13 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean14 = constantDescQueue13.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor15 = constantDescQueue13.iterator();
        boolean boolean16 = constantDescQueue12.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue13);
        boolean boolean17 = constantDescQueue11.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue12);
        java.lang.constant.ConstantDesc[] constantDescArray40 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList41 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList41, constantDescArray40);
        boolean boolean43 = constantDescQueue11.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList41);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue44 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue11);
        int int45 = constantDescQueue11.size();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue46 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc constantDesc47 = constantDescQueue46.peek();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue48 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue49 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue50 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean51 = constantDescQueue50.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor52 = constantDescQueue50.iterator();
        boolean boolean53 = constantDescQueue49.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue50);
        boolean boolean54 = constantDescQueue48.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue49);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue55 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue56 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean57 = constantDescQueue56.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor58 = constantDescQueue56.iterator();
        boolean boolean59 = constantDescQueue55.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue56);
        boolean boolean60 = constantDescQueue49.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue56);
        boolean boolean61 = constantDescQueue46.contains((java.lang.Object) constantDescQueue49);
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream62 = constantDescQueue49.parallelStream();
        boolean boolean63 = constantDescQueue11.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue49);
        boolean boolean64 = constantDescQueue1.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue11);
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator65 = constantDescQueue11.comparator();
        boolean boolean67 = constantDescQueue11.offer((java.lang.constant.ConstantDesc) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(constantDescItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(constantDesc7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(constantDescItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(constantDescArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(constantDesc47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(constantDescItor52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(constantDescItor58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(constantDescStream62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(wildcardComparator65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean2 = constantDescQueue1.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor3 = constantDescQueue1.iterator();
        boolean boolean4 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescQueue0.peek();
        boolean boolean7 = constantDescQueue0.offer((java.lang.constant.ConstantDesc) 10.0f);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescQueue0.remove();
        boolean boolean10 = constantDescQueue0.contains((java.lang.Object) (-1));
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue11 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue0);
        java.lang.String str12 = constantDescQueue0.toString();
        boolean boolean14 = constantDescQueue0.offer((java.lang.constant.ConstantDesc) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(constantDescItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 10.0f + "'", constantDesc8, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean3 = constantDescQueue2.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor4 = constantDescQueue2.iterator();
        boolean boolean5 = constantDescQueue1.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue2);
        boolean boolean6 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue1);
        boolean boolean8 = constantDescQueue1.offer((java.lang.constant.ConstantDesc) 10.0d);
        java.lang.constant.ConstantDesc constantDesc9 = constantDescQueue1.remove();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor10 = constantDescQueue1.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(constantDescItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + constantDesc9 + "' != '" + 10.0d + "'", constantDesc9, 10.0d);
        org.junit.Assert.assertNotNull(constantDescItor10);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean2 = constantDescQueue1.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor3 = constantDescQueue1.iterator();
        boolean boolean4 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue1);
        java.lang.constant.ConstantDesc constantDesc5 = constantDescQueue0.peek();
        boolean boolean7 = constantDescQueue0.offer((java.lang.constant.ConstantDesc) 10.0f);
        java.lang.constant.ConstantDesc constantDesc8 = constantDescQueue0.remove();
        boolean boolean10 = constantDescQueue0.contains((java.lang.Object) (-1));
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue11 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue0);
        java.lang.constant.ConstantDesc constantDesc12 = constantDescQueue11.poll();
        java.util.Spliterator<java.lang.constant.ConstantDesc> constantDescSpliterator13 = constantDescQueue11.spliterator();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor14 = constantDescQueue11.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(constantDescItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(constantDesc5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + constantDesc8 + "' != '" + 10.0f + "'", constantDesc8, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(constantDesc12);
        org.junit.Assert.assertNotNull(constantDescSpliterator13);
        org.junit.Assert.assertNotNull(constantDescItor14);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(1);
        int int2 = constantDescQueue1.size();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue3 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue4 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue5 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean6 = constantDescQueue5.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor7 = constantDescQueue5.iterator();
        boolean boolean8 = constantDescQueue4.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue5);
        boolean boolean9 = constantDescQueue3.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue4);
        java.lang.constant.ConstantDesc[] constantDescArray32 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList33 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList33, constantDescArray32);
        boolean boolean35 = constantDescQueue3.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList33);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue36 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue3);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue37 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean38 = constantDescQueue37.isEmpty();
        boolean boolean39 = constantDescQueue36.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue37);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue40 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue41 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue42 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean43 = constantDescQueue42.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor44 = constantDescQueue42.iterator();
        boolean boolean45 = constantDescQueue41.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue42);
        boolean boolean46 = constantDescQueue40.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue41);
        java.lang.constant.ConstantDesc[] constantDescArray69 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList70 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList70, constantDescArray69);
        boolean boolean72 = constantDescQueue40.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList70);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue73 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue40);
        boolean boolean74 = constantDescQueue36.containsAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue40);
        java.lang.constant.ConstantDesc constantDesc75 = constantDescQueue36.poll();
        boolean boolean76 = constantDescQueue1.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc77 = constantDescQueue1.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(constantDescItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(constantDescArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(constantDescItor44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(constantDescArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(constantDesc75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean3 = constantDescQueue2.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor4 = constantDescQueue2.iterator();
        boolean boolean5 = constantDescQueue1.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue2);
        boolean boolean6 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue1);
        java.lang.constant.ConstantDesc[] constantDescArray29 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList30 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30, constantDescArray29);
        boolean boolean32 = constantDescQueue0.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue33 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue0);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue34 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue0);
        int int35 = constantDescQueue0.size();
        java.lang.String str36 = constantDescQueue0.toString();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator37 = constantDescQueue0.comparator();
        constantDescQueue0.clear();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue39 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue40 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue41 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean42 = constantDescQueue41.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor43 = constantDescQueue41.iterator();
        boolean boolean44 = constantDescQueue40.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue41);
        boolean boolean45 = constantDescQueue39.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue40);
        java.lang.constant.ConstantDesc[] constantDescArray68 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList69 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList69, constantDescArray68);
        boolean boolean71 = constantDescQueue39.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList69);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue72 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue39);
        java.lang.String str73 = constantDescQueue39.toString();
        java.lang.Object[] objArray74 = constantDescQueue39.toArray();
        boolean boolean75 = constantDescQueue39.isEmpty();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue76 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean77 = constantDescQueue76.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor78 = constantDescQueue76.iterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream79 = constantDescQueue76.parallelStream();
        boolean boolean80 = constantDescQueue39.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue76);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor81 = constantDescQueue39.iterator();
        boolean boolean83 = constantDescQueue39.add((java.lang.constant.ConstantDesc) 0L);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor84 = constantDescQueue39.iterator();
        boolean boolean85 = constantDescQueue0.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue39);
        java.util.Collection[] collectionArray87 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.constant.ConstantDesc>[] constantDescCollectionArray88 = (java.util.Collection<java.lang.constant.ConstantDesc>[]) collectionArray87;
        java.util.Collection<java.lang.constant.ConstantDesc>[] constantDescCollectionArray89 = constantDescQueue0.toArray(constantDescCollectionArray88);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(constantDescItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(constantDescArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertNull(wildcardComparator37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(constantDescItor43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(constantDescArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "[]" + "'", str73, "[]");
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertArrayEquals(objArray74, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(constantDescItor78);
        org.junit.Assert.assertNotNull(constantDescStream79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(constantDescItor81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(constantDescItor84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(collectionArray87);
        org.junit.Assert.assertArrayEquals(collectionArray87, new java.util.Collection[] {});
        org.junit.Assert.assertNotNull(constantDescCollectionArray88);
        org.junit.Assert.assertArrayEquals(constantDescCollectionArray88, new java.util.Collection[] {});
        org.junit.Assert.assertNotNull(constantDescCollectionArray89);
        org.junit.Assert.assertArrayEquals(constantDescCollectionArray89, new java.util.Collection[] {});
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean3 = constantDescQueue2.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor4 = constantDescQueue2.iterator();
        boolean boolean5 = constantDescQueue1.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue2);
        boolean boolean6 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue1);
        java.lang.constant.ConstantDesc[] constantDescArray29 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList30 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30, constantDescArray29);
        boolean boolean32 = constantDescQueue0.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue33 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue0);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue34 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue0);
        int int35 = constantDescQueue0.size();
        java.lang.String str36 = constantDescQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc constantDesc37 = constantDescQueue0.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(constantDescItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(constantDescArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue0 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue1 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue2 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean3 = constantDescQueue2.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor4 = constantDescQueue2.iterator();
        boolean boolean5 = constantDescQueue1.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue2);
        boolean boolean6 = constantDescQueue0.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue1);
        java.lang.constant.ConstantDesc[] constantDescArray29 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList30 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30, constantDescArray29);
        boolean boolean32 = constantDescQueue0.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList30);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue33 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue0);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue34 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue0);
        int int35 = constantDescQueue0.size();
        java.lang.String str36 = constantDescQueue0.toString();
        java.util.Comparator<? super java.lang.constant.ConstantDesc> wildcardComparator37 = constantDescQueue0.comparator();
        constantDescQueue0.clear();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue39 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue40 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue41 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean42 = constantDescQueue41.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor43 = constantDescQueue41.iterator();
        boolean boolean44 = constantDescQueue40.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue41);
        boolean boolean45 = constantDescQueue39.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue40);
        java.lang.constant.ConstantDesc[] constantDescArray68 = new java.lang.constant.ConstantDesc[] { 10.0f, 1, (-1.0f), 0.0d, "[1, 100, 10, 10, 10.0, -1.0, 10, 1, -1.0, 10.0, 100, 0.0, 0, , 1, 0.0, 1]", (-1.0f), (-1L), (-1.0f), 100, 0L, (-1), (-1.0f), (-1.0f), 1.0d, 100L, 1, 1L, 1.0f, "", 0L, (-1.0f), 100 };
        java.util.ArrayList<java.lang.constant.ConstantDesc> constantDescList69 = new java.util.ArrayList<java.lang.constant.ConstantDesc>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList69, constantDescArray68);
        boolean boolean71 = constantDescQueue39.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescList69);
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue72 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>(constantDescQueue39);
        java.lang.String str73 = constantDescQueue39.toString();
        java.lang.Object[] objArray74 = constantDescQueue39.toArray();
        boolean boolean75 = constantDescQueue39.isEmpty();
        java.util.PriorityQueue<java.lang.constant.ConstantDesc> constantDescQueue76 = new java.util.PriorityQueue<java.lang.constant.ConstantDesc>();
        boolean boolean77 = constantDescQueue76.isEmpty();
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor78 = constantDescQueue76.iterator();
        java.util.stream.Stream<java.lang.constant.ConstantDesc> constantDescStream79 = constantDescQueue76.parallelStream();
        boolean boolean80 = constantDescQueue39.removeAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue76);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor81 = constantDescQueue39.iterator();
        boolean boolean83 = constantDescQueue39.add((java.lang.constant.ConstantDesc) 0L);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor84 = constantDescQueue39.iterator();
        boolean boolean85 = constantDescQueue0.retainAll((java.util.Collection<java.lang.constant.ConstantDesc>) constantDescQueue39);
        java.util.Iterator<java.lang.constant.ConstantDesc> constantDescItor86 = constantDescQueue0.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(constantDescItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(constantDescArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertNull(wildcardComparator37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(constantDescItor43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(constantDescArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "[]" + "'", str73, "[]");
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertArrayEquals(objArray74, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(constantDescItor78);
        org.junit.Assert.assertNotNull(constantDescStream79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(constantDescItor81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(constantDescItor84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(constantDescItor86);
    }
}

