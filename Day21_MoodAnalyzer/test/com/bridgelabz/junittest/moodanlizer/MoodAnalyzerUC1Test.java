package com.bridgelabz.junittest.moodanlizer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.program.MoodAnalizerUC1;

class MoodAnalyzerUC1Test {

	@Test
	void test() {
		MoodAnalizerUC1 moodanalizer = new MoodAnalizerUC1();
		String message = moodanalizer.moodAnalizer("I AM IN SAD MOOD");
		assertEquals("SAD", message);
	}
	
	@Test
	void test1() {
		MoodAnalizerUC1 moodanalizer = new MoodAnalizerUC1();
		String message = moodanalizer.moodAnalizer("I AM IN ANY MOOD");
		assertEquals("HAPPY", message);				
	}
}
