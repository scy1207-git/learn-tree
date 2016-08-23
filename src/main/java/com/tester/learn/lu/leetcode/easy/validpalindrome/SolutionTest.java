package com.tester.learn.lu.leetcode.easy.validpalindrome;

import org.junit.Test;

/**
 * Created by leosong on 16-8-19.
 */
public class SolutionTest {

    @Test
    public void test()
    {
        String inputStr = "A man, a plan, a canal: Panama";
        Solution slu = new Solution();
        boolean palindromedFlag = slu.isPalindrome(inputStr);

    }
}
