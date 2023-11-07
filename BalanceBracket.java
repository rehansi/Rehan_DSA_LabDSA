package com.greatlearning.bracket;


import java.util.Stack;

public class BalanceBracket {

	public static boolean CheckBalanceBracket(String input) {
       
		Stack<Character> St = new Stack<>();
		for (int i = 0; i < input.length(); i++) {
			char c= input.charAt(i);
			
			if (c == '(' || c == '{' || c == '[') {
				St.push(c);
				continue;
			}
			if (St.isEmpty()) {
				return false;
			}
			
			char temp;
		
			switch (c)
			{
			case ')':
				temp = St.pop();
				if (temp == '{' || temp == '[') {
					return false;

				}
				break;

			case '}':
				temp = St.pop();
				if (temp == '(' || temp == '[') {
					return false;

				}
				break;

			case ']':
				temp = St.pop();
				if (temp == '{' || temp == '(') {
					return false;

				}
				break;

			default:
				System.out.println("Not a correct input");
			}
		}
		return St.isEmpty();
	}
}
