package com.tester.learn.lu.leetcode.easy.reversedstring.Test01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leosong on 16-8-9.
 */
public class SolutionTest {


    @Test
     public void testSolution()
    {
        Solution slu = new Solution();
        String expResults = slu.reverseString("hello");
        assertEquals("olleh",expResults);
    }

}
