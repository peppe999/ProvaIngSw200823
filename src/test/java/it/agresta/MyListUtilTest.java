package it.agresta;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MyListUtilTest {
    public static MyListUtil obj;

    @BeforeClass
    public static void initialize() {
        obj = new MyListUtil();
    }

    @Test
    public void sortingTest() {
        assertEquals(Arrays.asList(), obj.getSortedList(Arrays.asList(), true));
        assertEquals(Arrays.asList(), obj.getSortedList(Arrays.asList(), false));
        assertEquals(Arrays.asList(1, 2, 3, 4), obj.getSortedList(Arrays.asList(3, 2, 1, 4), true));
        assertEquals(Arrays.asList(4, 3, 2, 1), obj.getSortedList(Arrays.asList(3, 2, 1, 4), false));
        assertEquals(Arrays.asList(1, 1, 2, 2, 3), obj.getSortedList(Arrays.asList(3, 2, 1, 2, 1), true));
        assertEquals(Arrays.asList(3, 2, 2, 1, 1), obj.getSortedList(Arrays.asList(3, 2, 1, 2, 1), false));
    }
}
