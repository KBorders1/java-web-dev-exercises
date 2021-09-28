package org.launchcode.java.studios.quizzes;

import java.util.ArrayList;

public abstract class Question {
    private String question;
    private ArrayList<String> choices;
    private String questionType;

    public Question(String aQuestion, ArrayList<String> aChoices) {
        question = aQuestion;
        choices = aChoices;

    }

    public abstract void askQuestion();

    public String getQuestion() {
        return question;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public String getQuestionType() {
        return questionType;
    }
}
