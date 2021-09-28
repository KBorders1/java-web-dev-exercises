package org.launchcode.java.studios.quizzes;

import java.util.ArrayList;

public class MultipleChoice extends Question {

    String answer;

    public MultipleChoice(String aQuestion, ArrayList<String> aChoices, String aCorrectAnswer) {
        super(aQuestion, aChoices);
        answer = aCorrectAnswer;
        setQuestionType("Mutiple Choice");
    }

    @Override
    public void askQuestion() {
        System.out.println(getQuestion());
        System.out.println("Choose one option: ");
        System.out.println(getChoices());
    }
}
