/**
https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/
Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.

For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb".

Computer all substrings
Check only substrings with length >= k
Iterate over strings -> Map characters to occruence
Check if size of hashmap is == k
return max sum of the values from hashmap that are size k

 */
 import java.util.*;
 public class KDistinctSubstring{
        public static void main(String [] args){
            System.out.println(longestSubstring("eceba", 2)); //3 -> ece
            System.out.println(longestSubstring("aa", 1)); //2 -> aa
            System.out.println(longestSubstring("abcba", 2)); //3 -> bcb
        }
        /**
        # of substrings = s.length()!
         */
        /**
        Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.
        @param s string to check for max substring of length k
        @param k number of distinct characters a substring of s must have
        INSIGHTS: k can be > s.length()
         */
        public static int longestSubstring(String s, int k){
      String sub;
        if(s == null || s.isEmpty()) return 0;
            int max = Integer.MIN_VALUE;
            for(int i = 0;  i <= s.length() - 1; i++){
                for(int j = s.length(); j >= i; j--){
                    HashMap<Character, Integer> map = new HashMap<>();
                    sub = s.substring(i, j);    
                      for(char c: sub.toCharArray()){
                    if(map.containsKey(c)){
                        map.put(c, map.get(c) + 1);
                    }
                    else{
                        map.put(c, 1);
                    }
                }
                if(map.size() == k){
                    if(sub.length() > max){
                        max = sub.length();
                    }
                 }
               }
              

            }
            return max == Integer.MIN_VALUE ? s.length() : max;
        }
 }