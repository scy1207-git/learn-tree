package com.tester.learn.lu.leetcode.easy.reverseinteger;

/**
 * Created by leosong on 16-8-22.
 */
public class Solution {

    public int reverseInteger(int n)
    {
        int reversed_n = 0;
        while(n !=0)
        {
            int temp =  reversed_n * 10 + n%10;
            n = n /10;
            if(temp/10 != reversed_n){
                reversed_n =0;
                break;
            }
            reversed_n = temp;
        }
        return reversed_n;
    }


}
