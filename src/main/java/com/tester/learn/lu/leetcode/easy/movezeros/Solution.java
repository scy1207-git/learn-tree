package com.tester.learn.lu.leetcode.easy.movezeros;

import java.util.ArrayList;

/**
 * Created by leosong on 16-8-9.
 */
public class Solution {

    public void moveZeroes(int[] nums)
    {
        if(nums == null || nums.length < 2) return;
        for(int i=-1,j=0;j<nums.length;j++)
        {
            if(nums[j] !=0)
            {
                System.out.println(nums[j]);
                System.out.println("i= " + i + " j= " + j);
                if (j == ++i) continue;
                nums[i] = nums[j];
                nums[j] = 0;

            }

        }


    }

    public static void main(String[] args)
    {
        Solution so = new Solution();
        int[] nums = {0,1,0,3,12};
        so.moveZeroes(nums);
    }



}
