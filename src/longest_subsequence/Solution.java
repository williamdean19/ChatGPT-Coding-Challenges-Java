/*
 * Prompt:
 * Give me an advanced programming problem, do not answer it.
 * I will submit my answer after I'm done and you will tell me if I am correct,
 * and rate my answer on a scale of 0-10 out of 10 (10 being the best)
 */

/*
 * ChatGPT:
 * Here's an advanced programming problem for you:
 * 
 * You are given a string S and a set of words D. Write a program to find the longest word in D that is a subsequence of S. 
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the 
 * characters without disturbing the relative positions of the remaining characters.
 *
 * For example, if S = "abcdefg" and D = {"a", "abc", "cde", "abcdefg", "acd"}, then the output of the program should be 
 * "abcdefg" since it is the longest word in D that is a subsequence of S.
 *
 *  You can assume that all the words in D are unique and that the length of S and the words in D is at most 1000.
 * 
 */
	
// Submitted solution:

package longest_subsequence;

import java.util.ArrayList;

public class Solution {


	public static ArrayList<String> allValidSubsequences(String S, ArrayList<String> words) {
		ArrayList<String> validSubsequences = new ArrayList<String>();
		
		validSubsequences.add("");  // a null string is always a valid subsequence of any sequence
		
		for (String word: words){
			if (S.contains(word))
				validSubsequences.add(word);
		}
		return validSubsequences;
	}
	
	public static String longestValidSubsequence(ArrayList<String> validSubsequences) {
		
		String longestValidSubsequence = "";
		
		for(String validSubsequence: validSubsequences) {
			if(validSubsequence.length() > longestValidSubsequence.length()) {
				longestValidSubsequence = validSubsequence;
			}
		}
		return longestValidSubsequence;
	}
	
	public static void main(String[] args) {
		String S = "abcdefg";
		ArrayList<String> D = new ArrayList<String>();
		D.add("a");
		D.add("abc");
		D.add("cde");
		D.add("abcdefg");
		D.add("acd");
		
		String z = longestValidSubsequence(allValidSubsequences(S,D));
		
		System.out.println(z);		
		
	}
	
}
