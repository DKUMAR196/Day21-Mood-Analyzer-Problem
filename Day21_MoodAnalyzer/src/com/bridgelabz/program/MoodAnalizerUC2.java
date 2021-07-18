package com.bridgelabz.program;

public class MoodAnalizerUC2 {
	private String message;
	public MoodAnalizerUC2(){		
	}
	
	public MoodAnalizerUC2(String message){
		this.message = message;
	}
	
	public  String moodAnalizer() {
		try {
					
		if(message.contains("SAD")) 
			return "SAD";		
		else 
			return "HAPPY";		
		}
		catch (Exception e) {
			return "HAPPY";
		}		
	 }
  }
