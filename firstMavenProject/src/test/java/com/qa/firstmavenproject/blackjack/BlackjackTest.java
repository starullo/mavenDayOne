package com.qa.firstmavenproject.blackjack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import qa.com.firstmavenproject.blackjack.Blackjack;

public class BlackjackTest {

	@Test
	public void playTest() {
		int result1 = Blackjack.play(22, 22);
		assertEquals(0, result1);
		
		int result2 = Blackjack.play(22, 21);
		assertEquals(21, result2);
		
		int result3 = Blackjack.play(21, 22);
		assertEquals(21, result3);
		
		int result4 = Blackjack.play(19, 18);
		assertEquals(19, result4);
	}
	
}
