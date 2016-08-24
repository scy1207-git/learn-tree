package com.tester.learn.lu.leetcode.easy.rotatearray;

import java.util.Arrays;

/**
 * Created by leosong on 16-8-24.
 */
public class Solution {
    public void rotate(int[] nums, int k) {

        k %= nums.length;
        reverse(nums,0,nums.length -1);
        System.out.println(nums.toString());
        reverse(nums,0,k-1);
        System.out.println(nums);
        reverse(nums,k,nums.length -1);
        System.out.println(nums);
    }

    public void reverse(int[] nums,int start,int end)
    {
        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end--;
        }
    }


}
