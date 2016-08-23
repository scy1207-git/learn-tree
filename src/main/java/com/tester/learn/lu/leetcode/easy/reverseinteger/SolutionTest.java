package com.tester.learn.lu.leetcode.easy.reverseinteger;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leosong on 16-8-22.
 */
public class SolutionTest {

    @Test
    public void test()
    {
        Solution slu = new Solution();
        int reverInteger = slu.reverseInteger(-12345);
        System.out.println(String.valueOf(reverInteger));
        Assert.assertTrue(54321 == reverInteger);
    }

}
