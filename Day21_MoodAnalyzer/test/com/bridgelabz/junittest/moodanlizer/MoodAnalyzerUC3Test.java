package com.bridgelabz.junittest.moodanlizer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.bridgelabz.program.MoodAnalizerUC3;
import com.bridgelabz.program.MoodAnalizerUC3.MoodAnalysisException;


@Test
public void givenEmptyMessageShouldReturnThrowCustomException() {
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer(" ");
    try {
        moodAnalyzer.analyzeMood(" ");
    } catch (MoodAnalysisException e) {
        Assertions.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.getMessage());
        System.out.println(e.type);
        System.out.print(e.getMessage());

    }
 }
}
