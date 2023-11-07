package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.bracket.BalanceBracket;

public class MainClass {
	
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("please enter the input");
	 
	 String input= sc.nextLine();
	 BalanceBracket cbb = new BalanceBracket(); 
	 boolean result=cbb.CheckBalanceBracket(input);
		 
	 if(result) {
		 System.out.println("The entered String has a balance bracket");
	 }
	 else {
		 System.out.println("The entered String does not contain balance bracket");
	 }
	 sc.close(); }
}



