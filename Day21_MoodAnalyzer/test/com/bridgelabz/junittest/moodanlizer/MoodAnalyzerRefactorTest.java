package com.bridgelabz.junittest.moodanlizer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.program.MoodAnalizerRefactor;

class MoodAnalyzerRefactorTest {

	@Test
	void test() {
		MoodAnalizerRefactor moodanalizer = new MoodAnalizerRefactor("I AM IN SAD MOOD");
		String message = moodanalizer.moodAnalizer();
		assertEquals("SAD", message);
	}
	
	@Test
	void test1() {
		MoodAnalizerRefactor moodanalizer = new MoodAnalizerRefactor("I am in Happy Mood");
		String message = moodanalizer.moodAnalizer();
		assertEquals("HAPPY", message);				
	}
}
