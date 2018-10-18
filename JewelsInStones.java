/*
Problem Statement:
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
Problem Link:
    JewelsInStones: https://leetcode.com/problems/jewels-and-stones/description/
Solution:
    
Author:
    Vidhi Doshi
    doshividhi013@gmail.com
    https://github.com/VidhiDoshi123
    https://www.linkedin.com/in/vidhi-doshi-269121138/
 */
class Solution {
    public int numJewelsInStones(String J, String S) {
        
        int ret=0;
        int jwel[]=new int[75];
        int i;
        for(i=0;i<J.length();i++)
        {
            jwel[J.charAt(i)-'0']++;
        }
        for(i=0;i<S.length();i++)
            if(jwel[S.charAt(i)-'0']>0)
                ret++;
      return ret;  
    }
}