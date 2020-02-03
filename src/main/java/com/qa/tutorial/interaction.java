package com.qa.tutorial;

public class interaction {
	public String greeting() { //These are non static and cant be accesses until the runner instance was created
		return "Hi friend";
	}
	public String insult() {
		return"is trash";

}
}
