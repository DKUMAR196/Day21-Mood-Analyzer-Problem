package com.bridgelabz.program;

public class MoodAnalizerUC1 {
	public  String moodAnalizer(String message) {
		if(message.contains("SAD")) {
			return "SAD";
		}
		else {
			return "HAPPY";
		}		
	}
}
