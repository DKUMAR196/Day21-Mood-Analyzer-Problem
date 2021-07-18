package com.bridgelabz.junittest.moodanlizer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.program.MoodAnalizerUC2;

class MoodAnalizerUC2Test {

	@Test
	void test() {
		MoodAnalizerUC2 moodanalizer = new MoodAnalizerUC2(" ");
		String message = moodanalizer.moodAnalizer();
		assertEquals("HAPPY", message);
	}
}
