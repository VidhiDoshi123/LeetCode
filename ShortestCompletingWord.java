/*
Problem Statement:
 Find the minimum length word from a given dictionary words, which has all the letters from the string licensePlate. Such a word is said to complete the given string licensePlate

Here, for letters we ignore case. For example, "P" on the licensePlate still matches "p" on the word.

It is guaranteed an answer exists. If there are multiple answers, return the one that occurs first in the array.

The license plate might have the same letter occurring multiple times. For example, given a licensePlate of "PP", the word "pair" does not complete the licensePlate, but the word "supper" does
Problem Link:
    ShortestCompletingWord: https://leetcode.com/problems/shortest-completing-word/description/
Solution:
    
Author:
    Vidhi Doshi
    doshividhi013@gmail.com
    https://github.com/VidhiDoshi123
    https://www.linkedin.com/in/vidhi-doshi-269121138/
 */


class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int min=999999;
        String ans="";
        int i;
        for(i=0;i<words.length;i++)
        {
            int count[]=new int[26];
            for(char c:licensePlate.toCharArray())
            {
                if(Character.isLetter(c))
                {
                    count[Character.toLowerCase(c)-'a']++;
                }
            }
            int flag=0;
            for(char c:words[i].toCharArray())
            {
                count[c-'a']--;
            }
            for(int n:count)
            {
                if(n>=1)
                {
                    flag=1;
                    break;
                }
            }
            if(flag!=1)
            {
                if(min>words[i].length())
                {
                    min=words[i].length();
                    ans=words[i];
                }
            }
        }
        return ans;
        
    }
}