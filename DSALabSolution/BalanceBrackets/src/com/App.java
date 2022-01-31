package com;

import java.util.Scanner;
import java.util.Stack;

import com.balance.StackBracketBalance;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter the string");
		String data =obj.next();
		StackBracketBalance stc =new StackBracketBalance();
        boolean result = StackBracketBalance.checkStackBracketBalance(data);
        
        if (result) {
        	
        	System.out.println("String is Balanced");
        	
        }else {
        	
        	System.out.println("String is not Balanced");
        	
        }
	}

}
