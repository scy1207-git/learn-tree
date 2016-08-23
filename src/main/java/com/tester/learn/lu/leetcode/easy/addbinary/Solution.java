package com.tester.learn.lu.leetcode.easy.addbinary;

/**
 * Created by leosong on 16-8-12.
 */
public class Solution {

    public String addBinary(String a, String b) {
        String temp="";
        if(a.length()<b.length()){
            temp=a;
            a=b;
            b=temp;
        }
        char[] arA=a.toCharArray();
        char[] arB=b.toCharArray();
        char[] arC=new char[a.length()+1];

        int i = a.length() -1;
        int j = b.length() -1;
        int carry = 0;
        int tempSum =0;
        while(i>=0)
        {
            if(j>=0)
            {
                tempSum = arA[i] -'0' + arB[j] - '0' + carry;
                --j;
            }


        }


        return String.valueOf(arC);

    }

}
