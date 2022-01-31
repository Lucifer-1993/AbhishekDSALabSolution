package com.balance;

import java.util.Stack;

public class StackBracketBalance {
	
public static boolean checkStackBracketBalance(String data) {

	Stack<Character> stack = new Stack<>();
	for(int i=0;i<data.length();i++) {
		char ch= data.charAt(i);
		if(ch=='('||ch=='{'||ch=='[') {
			stack.push(ch);
			continue;
		}
		
		if(stack.isEmpty()) {
			
			return false;
		}
		
		char c;
		
		switch(ch) {
		
		case ')': 
			c=stack.pop();
			if(c=='{'||c=='[')
				return false;
		break;
		
		case ']': 
			c=stack.pop();
			if(c=='{'||c=='(')
				return false;
		break;
		
		case '}': 
			c=stack.pop();
			if(c=='('||c=='[')
				return false;
		break;
		
		}
	}
	return stack.isEmpty();
}
	
}