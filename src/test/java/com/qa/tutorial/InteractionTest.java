package com.qa.tutorial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InteractionTest {
	
	@Test
	public void greetingTest() {
		interaction interaction= new interaction();
		assertEquals("Hi friend", interaction.greeting()); //assert equal throws a error unless these two are equal
	}

}
