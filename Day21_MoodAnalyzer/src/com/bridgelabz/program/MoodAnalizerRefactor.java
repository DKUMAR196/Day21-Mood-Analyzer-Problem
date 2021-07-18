package com.bridgelabz.program;

public class MoodAnalizerRefactor {
	private String message;
	public MoodAnalizerRefactor(){		
	}
	
	public MoodAnalizerRefactor(String message){
		this.message = message;
	}
	
	public  String moodAnalizer() {		
		if(message.contains("SAD")) {
			return "SAD";
		}
		else {
			return "HAPPY";
		}		
	}
}
