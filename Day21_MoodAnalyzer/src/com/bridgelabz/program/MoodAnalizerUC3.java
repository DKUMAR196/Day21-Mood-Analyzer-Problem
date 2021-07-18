package com.bridgelabz.program;

public class MoodAnalizerUC3 {
	String message;
	public class MoodAnalysisException extends Exception {
	     enum ExceptionType {ENTERED_NULL,ENTERED_EMPTY}
	    ExceptionType type;
	    public MoodAnalysisException(ExceptionType type, String message) {
	        super(message);
	        this.type = type;
	    }
	}
    public String analyzeMood() throws MoodAnalysisException {
        try {
            if (message.length() == 0) {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "please enter proper message");
            }
            if (message.contains("sad")){
            return "SAD";
            }

        return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "please enter proper message");
        }
    }
}
