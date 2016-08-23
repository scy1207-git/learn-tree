package com.tester.learn.lu.leetcode.easy.validpalindrome;

/**
 * Created by leosong on 16-8-19.
 */
public class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() ==0) return true;
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        sb.append('a');
        sb.insert(0,'a');
        System.out.println(sb);
        int i=0,j=sb.length() -1;
        while(i < j)
        {
            while(!Character.isLetterOrDigit(sb.charAt(i))) i++;
            while(!Character.isLetterOrDigit(sb.charAt(j))) j++;
            if(sb.charAt(j) == sb.charAt(i)) {i++;j--;}
            else return false;
        }
        return true;
    }
}
