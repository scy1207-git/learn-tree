package com.tester.learn.lu.leetcode.easy.addbinary;

import com.tester.learn.lu.leetcode.easy.reversedstring.Test01.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leosong on 16-8-12.
 */
public class SolutionTest {

    @Test
    public void test()
    {

        Solution lu = new Solution();
        String a = "11";
        String b = "1";
        String expString = lu.addBinary(a,b);
        assertEquals("100",expString);

    }

}
