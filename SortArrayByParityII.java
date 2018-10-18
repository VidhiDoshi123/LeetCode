/*
Problem Statement:
Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.

Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.

You may return any answer array that satisfies this condition.



Problem Link:
    Sort Array By Parity II : https://leetcode.com/problems/sort-array-by-parity-ii/description/
Solution:
    
Author:
    Vidhi Doshi
    doshividhi013@gmail.com
    https://github.com/VidhiDoshi123
    https://www.linkedin.com/in/vidhi-doshi-269121138/
 */
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        
        List<Integer> l=new ArrayList();
        List<Integer> l1=new ArrayList();
        for(int i=0;i<A.length;i++)
        {
           if(A[i]%2==0)
           {
               l.add(A[i]);
           }
            else
                l1.add(A[i]);
        }
        int i,j=0,k=0;
        for(i=0;i<A.length;i++)
        {
            if(i%2!=0&&j<A.length/2)
            {
                A[i]=l1.get(j);
                j++;
            }
            else
            {
                if(k<A.length/2){
                A[i]=l.get(k);
                k++;}
            }
        }
        return A;
        
    }
}