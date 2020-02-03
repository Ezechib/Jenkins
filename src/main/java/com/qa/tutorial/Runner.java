package com.qa.tutorial;

public class Runner {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		interaction interaction=new interaction(); //This allows you to access the greeting and insult as they are not in the main method
System.out.println(interaction.greeting()+" " + interaction.insult());
	}


	
}
