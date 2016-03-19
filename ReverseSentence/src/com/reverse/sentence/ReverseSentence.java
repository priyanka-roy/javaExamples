package com.reverse.sentence;
/**
 * String split n loop 
 * @author koushik
 *
 */
public class ReverseSentence {

	public static String reverseSentence(String input) {
		String[] split = input.split(" ");
		String result = "";
		for (int i = split.length - 1; i >= 0; i--) {
			result += (split[i] + " ");
		}
		System.out.println(result.trim());
		return result;
	}

	public static void main(String[] args) {
		reverseSentence("one two three four");

	}

}
